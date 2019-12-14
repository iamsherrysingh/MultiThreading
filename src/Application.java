public class Application{
    public static void main(String[] args) {
        Thread vrindThread=new MyThread();
        vrindThread.setName("VrindThread");

        Thread sherryThread=new MyThread();
        sherryThread.setName("SherryThread");

        vrindThread.start();
        sherryThread.start();
        sherryThread.interrupt();

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
