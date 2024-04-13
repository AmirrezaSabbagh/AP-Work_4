import java.util.Objects;
public class Vote {
    private Person voter = null;
    private String date = null;
    public Vote(Person voter  , String date){
        this.date = date;
        this.voter = voter;
    }
    public Person getVoter() {
        return voter;
    }
    public String getDate() {
        return date;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VotingSystem)) return false;
        VotingSystem that = (VotingSystem) o;
        return Objects.equals(getVotingList() , that.getVotingList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVotingList());
    }
}
