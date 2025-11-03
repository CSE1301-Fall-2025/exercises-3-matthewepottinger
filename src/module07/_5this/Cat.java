package module07._5this;

public class Cat {
    //possible instance variables: traits ("has a"): color, paws, name, tail, age, voice, fur, mother

    private String name;
    private String voice;
    private int age;

    //possible methods: behaviors: sleep, eat, knead, meow, shed
    
    //ex constructor: this works for a cat whose name and voice you know, but age is unknown. 
    //Also works for newborn kittens
    public Cat(String name, String voice) {
        this.name = name;
        this.voice = voice;
        age = 0;
    }

    public static void main(String[] args) {
        Cat lindsay = new Cat("lindsay", "mew");
    }
}
