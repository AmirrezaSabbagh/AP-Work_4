public class Vote {
    private final Person voter;
    private final String date;
    public vote(Person voter  , String date){
        this.date = date;
        this.voter = voter;
    }
    public Person getVoter() {
        return voter;
    }
    public String getDate() {
        return date;
    }
        
}
