

       import java.text.SimpleDateFormat;
       import java.util.*;

       public class Voting {
       private int type;

       private String question;

       private HashMap<String,HashSet<Vote>> choices;
       private boolean isAnonymous;
        private ArrayList<Person> voters;

   public Voting(int type, String question, boolean isAnonymous) {
         this.type = type;
         this.question = question;
         this.isAnonymous = isAnonymous;
      voters = new ArrayList<Person>();
      choices = new HashMap<String, HashSet<Vote>>();

   }
   public ArrayList<String> getChoices(){

      ArrayList<String> a= new ArrayList<String>();
      for (String s : choices.keySet()) {
         a.add(s);
      }
      return a;
   }
   public void createChoice(String choice) {
        HashSet<Vote> gozineh = new HashSet<Vote>();
        choices.put(choice, gozineh);
   }
   public void vote(Person voter, ArrayList<String> voter_choices){
      Date currentDate = new Date();
      SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
      String formattedDate = dateFormat.format(currentDate);
         for (String i: voter_choices) {
             choices.get(i).add(new Vote(voter,formattedDate));
          }
      }
   }
   public void vote(Person person){
      Date currentDate = new Date();
      SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
      String formattedDate = dateFormat.format(currentDate);
      int sizechoices=choices.size();
      Random randdom = new Random() ;
       int randChoice = randdom.nextInt(sizechoices);
      ArrayList<String> choices = getChoices();
      choices.get(randChoice).add(new Vote(person, formattedDate));
   }
   public void printResults(){
      for (String i: choices.keySet()) {
         System.out.println(i + "tedad ray : " + choices.get(i).size());
      }
   }
   public void printVoters() {
      if (!isAnonymous) {
         for (String choice : choices.keySet()) {
            System.out.println(choice + ": ");
            for (Vote vote : choices.get(choice)) {
               Person voter = vote.getVoter();
               System.out.println(voter.getFirstname() + " " + voter.getLastname());
            }
         }
      } else {
         System.out.println("rai is makhfi");
      }
   }

}