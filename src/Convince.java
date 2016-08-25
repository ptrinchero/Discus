import java.util.List;

public abstract class Convince {

    List<String> opponents; // size  = 1+

    public void generalPrint(){
        System.out.println("I am speaking to 1+ people, with the hopes that they actualize a specified, limited + defined, set of beliefs on a topic. To wit, I want the future actions of " +
                "the foreign party/parties to act in such the way that *I* would, in a situation that requires the aformentioned set of beliefs to act in a way that avoids inner cognitive dissonance.");
    }

    public abstract void detailPrint();

    public abstract void didIWin();
}
