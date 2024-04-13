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
}
