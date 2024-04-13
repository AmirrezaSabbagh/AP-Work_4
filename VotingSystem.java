import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class VotingSystem {
    private ArrayList<Voting> votingList = new ArrayList<>();

    public VoatingSystem(){}
    
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
}
