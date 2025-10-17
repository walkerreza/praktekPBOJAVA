public class PatrolRobot extends Robot {

    public Battery battery;


public PatrolRobot(String name, int CPUSpeed, int Power, Battery battery) {
    super("PATROL " + name, CPUSpeed, Power);
    this.battery = battery;
}
public void increasePower() {
    Power += 20;

}
}