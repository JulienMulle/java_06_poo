public class Wilder {
    private String firstname;
    private boolean aware;

    public String getFirstname() {
        return this.firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public boolean isAware() {
        return this.aware;
    }
    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public Wilder(String firstname, boolean aware){
        this.firstname = firstname;
        this.aware = aware;
    }

    public void whoAmI() {
        if (this.aware){
         System.out.println("Je m'appelle " + this.getFirstname() + " et je suis aware" );
        }
        else{
            System.out.println("je m'appelle " + this.getFirstname() + " et je ne suis pas aware");
        }

    }

}