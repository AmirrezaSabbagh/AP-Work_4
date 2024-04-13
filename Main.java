import java.util.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.createVoting("Question 1", false, 1, new ArrayList<String>() {{
            add("Choice 1");
            add("Choice 2");
        }});
        votingSystem.createVoting("Question 2", true, 2, new ArrayList<String>() {{
            add("Choice 1");
            add("Choice 2");
            add("Choice 3");
        }});
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Jane", "Doe");
        Person person3 = new Person("Bob", "Smith");
        votingSystem.vote(0, person1, new ArrayList<String>() {{
            add("Choice 1");
        }});
        votingSystem.vote(1, person2, new ArrayList<String>() {{
            add("Choice 3");
        }});
        votingSystem.vote(1, person3);
        votingSystem.printVoting(0);
        votingSystem.printResults(0);
        votingSystem.printVoters(0);
        System.out.println(" ");
        votingSystem.printVoting(1);
        votingSystem.printResults(1);
        votingSystem.printVoters(1);
    }
}
