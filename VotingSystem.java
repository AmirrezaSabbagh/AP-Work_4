import java.util.ArrayList;
public class VotingSystem {
    private ArrayList<Voting> votingList = new ArrayList<>();

    public VotingSystem(){}
    
    public Voting getVoting(int index) {
        return votingList.get(index);
    }

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    public void createVoting(String question, boolean isAnonymous, int type, ArrayList<String> choices) {
        Voting voting = new Voting(type, question, isAnonymous);
        for (String a : choices) {
            voting.createChoice(a);
        }
        votingList.add(voting);
    }

    public void vote(int index, Person voter, ArrayList<String> choices) {
        votingList.get(index).vote(voter , choices);
    }

    public void vote(int index, Person voter) {
        votingList.get(index).vote(voter);
    }

    public void printResults(int index){
        votingList.get(index).printResults();
    }

    public void printVoters(int index){
        votingList.get(index).printVoters();
    }

    public void printVoting(int index){
        System.out.println(votingList.get(index).getQuestion());
        System.out.println("-----");
        int i = 1;
        for(String a : votingList.get(index).getChoicesInHashMap().keySet()){
            System.out.println(i+")"+a);
            i++;
        }
    }
}
