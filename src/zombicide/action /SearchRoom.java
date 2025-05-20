package zombicide.action;

public class SearchRoom implements Action {
    @Override
    public String getName() {
        return "Search Room";
    }

    @Override
    public void execute() {
        System.out.println("Executing search room action...");
    }
}
