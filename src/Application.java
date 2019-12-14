public class Application{
    public static void main(String[] args) {
        Thread thread1=new MyThread();
        thread1.setName("VrindThread");

        Thread thread2=new MyThread();
        thread2.setName("SherryThread");

        thread1.start();
        thread2.start();

        new Thread(){
            @Override
            public void run() {
                System.out.println("Hello from anonymous Thread");
            }
        }.start();

        Thread notAnonymousAnymore= new Thread(){
            @Override
            public void run() {
                System.out.println("Hello from NotAnonymousAnymore Thread");
            }
        };

        notAnonymousAnymore.start();


    }
}
