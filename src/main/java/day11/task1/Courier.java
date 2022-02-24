package day11.task1;

public class Courier implements Worker{

    private int salary;
    public static final int TASK_SALARY = 100;
    private Warehouse w;
    private boolean isPayed;

    public Courier(Warehouse w){
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        w.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if(w.getCountDeliveredOrders() < 10000){
            System.out.println();
            System.out.println("Бонус пока не доступен");
        }
        if(isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 50000;
        isPayed = true;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", w=" + w +
                ", isPayed=" + isPayed +
                '}';
    }
}
