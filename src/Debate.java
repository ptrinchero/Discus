import java.util.List;

public class Debate extends Convince{

    public Debate(List<String> opponents){
        super.opponents = opponents; //oppenents = the man I debate + audience
    }

    public void detailPrint(){
        System.out.println("I want to convince at least one person. Ideally, all audience members, as well as my opponent. Man it would be awesome if I debated so well, " +
                "every single person that heard me changed their views! However, that is unlikely, so I'm just hoping the majority of (singular opponent) + (audience) sways to my views");
    }

    public void didIWin() {
        System.out.println("A change in ideological view in my opponent cannot determine if I won this concrete implementation or not. What determines whether I won, is if" +
                "50%+ of the opponents (i.e. audience+opponent) overall sided with me, either through logical, emotional, or some other form of reasoning");
    }
}
