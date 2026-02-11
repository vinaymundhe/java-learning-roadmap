package intermediate.multithreading;

/*
Here we use extends Thread to implement multiple threads
We can also implement Runnable interface if a class already extends other class.
This is a prefered way as java doesn't allow multiple inheritance.
*/

public class CookingOrder extends Thread {

    private String taskName;

    private CookingOrder(String taskName){
        this.taskName = taskName;
    }

    public void run(){
        System.out.println("Task Name: "+taskName+ "Chef assigned: "+Thread.currentThread().getName());
    }

    static class Restaurant {
        public static void main(String[] args) {

            Thread chef1 = new Thread(new CookingOrder("Pasta"));
            Thread chef2 = new Thread(new CookingOrder("Burger"));
            Thread chef3 = new Thread(new CookingOrder("Noodles"));
            Thread chef4 = new Thread(new CookingOrder("Coffee"));

            chef1.start();
            chef2.start();
            chef3.start();
            chef4.start();
        }
    }
}