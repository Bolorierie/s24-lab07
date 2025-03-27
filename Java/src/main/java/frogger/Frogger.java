package frogger;

public class Frogger {

    private final Road road;
    private int position;
    private final FroggerIdentity identity;

    public Frogger(Road road, int position, FroggerIdentity identity) {
        this.road = road;
        this.position = position;
        this.identity = identity;
    }

    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!road.isValid(nextPosition) || road.isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    public boolean recordMyself(Records records) {
        return records.addRecord(identity);
    }
}