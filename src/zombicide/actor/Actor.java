package zombicide.actor;

import java.util.List;

public abstract class Actor {

    // protected Point position;
    protected int hp;
    protected int maxHp;
    // protected List<Equipment> equipments;
    // protected List<Action> availableActions;
    protected int maxActions;
    protected int currentActions;
    
    public Actor(int hp, int maxHp, int maxActions) {
        // this.position = position;
        this.hp = hp;
        this.maxHp = maxHp;
        this.maxActions = maxActions;
        this.currentActions = maxActions;
    }

    /**
     * method to reset the actions of the actor
     */
    public void resetActions() {
        this.currentActions = maxActions;
    }
}
