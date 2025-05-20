package zombicide.action;

public class AttackZombie implements Action {
    @Override
    public String getName() {
        return "Attack Zombie";
    }

    @Override
    public void execute() {
        System.out.println("Executing attack zombie action...");
    }
}
