package zombicide.action ;

public class Move implements Action {
    @Override
    public String getName(){
        return "Move" ;
    }

    @Override
    public void execute() {
        System.out.println("Executing move action...");
    }
}
