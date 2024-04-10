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
        
}
