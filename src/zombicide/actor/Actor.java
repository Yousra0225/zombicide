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

    /**
     * method to get the current actions of the actor
     * @return
     */
    public int getCurrentActions() {
        return currentActions;
    }

    /**
     * method to take damage from an enemy
     * @param damage
     */
    public void takeDamage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) this.hp = 0;
    }

    /**
     * method to check if the actor is alive
     * @return
     */
    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [HP=" + hp + "/" + maxHp + ", Pos=" + "position]";
    }
}
