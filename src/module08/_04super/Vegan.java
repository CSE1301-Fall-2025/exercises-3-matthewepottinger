package module08._04super;

public class Vegan extends Student {

    public Vegan(String theName) {
        super(theName);
    }
    public String getFood() {
        String output = super.getFood();
        return "No " + output + ", Salad.";
    }
    
}
