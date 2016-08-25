import java.util.ArrayList;

public class Diplomacy extends Convince {

    public Diplomacy(String opponent){ //note the singularity of the parameter, i.e. no list of people involved in this discussion
        super.opponents.add(opponent);
    }

    public void detailPrint(){
        System.out.println("I am engaging in a discussion. At the end of this discussion I have an end goal in mind, which drives my discussion. I have one 'target' in this discussion, which is the sole person I am speaking to as defined in the constructor. If I had no such end goal, I would not be having this" +
                "discussion. I will not directly combat points my opponent (persuee) is making. Rather, I will use a host of tools available in socialEngineering.java to indirectly break down" +
                "the mental reservation(s) my opponent has built. The same reservations, that if I were to inherit, would cause cognitive dissonance regarding my end goal (which must be established" +
                "before a single word on my behalf is uttered");
    }

    public void didIWin(){
        System.out.println("If winning means changing my opponent's ideology to match mine by more than 0%, I have won on a fuzzy scale greater than 0%");
    }
}
