
// NB: the advantage of runnable is used to extend other class or implements of other interface
//class class extends AnotherClass implements Runnable,AnotherInterface

class JavaThread4 implements Runnable{
    private int numberOfThread;
    public JavaThread4(int numberOfThread){
        this.numberOfThread=numberOfThread;
    }
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println(i+" thread number: " +numberOfThread);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("this is java thread example 4");

        for (int i=0; i<=2; i++){
            JavaThread5 jt=new JavaThread5(i);
            Thread myThread=new Thread(jt);
            myThread.start();
            try {
                myThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}