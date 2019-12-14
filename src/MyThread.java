public class MyThread extends Thread{
    public void run() {
        System.out.println("Thread "+this.getName()+" executed");

        try{
            sleep(3000);
        }catch (Exception e){
            System.out.println("Thread "+this.getName()+" interupted!");
            return;
        }

        System.out.println("Thread "+this.getName()+" responding after 3 seconds.");
    }
}
