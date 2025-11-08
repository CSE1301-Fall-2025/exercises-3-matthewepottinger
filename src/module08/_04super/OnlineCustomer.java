package module08._04super;

public class OnlineCustomer extends Customer {
    private String emailAddress;

    public OnlineCustomer(String n, String a, String e) {
        super(n, a);
        emailAddress = e;
    }

    public String toString() {
        return super.toString() + "\nEmail: " + emailAddress;
    }

}
