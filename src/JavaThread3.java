// NB: the advantage of runnable is used to extend other class or implements of other interface
//class class extends AnotherClass implements Runnable,AnotherInterface

class JavaThread3 implements Runnable{
    private int numberOfThread;
    public JavaThread3(int numberOfThread){
        this.numberOfThread=numberOfThread;
    }
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println(i+" thread number: "+numberOfThread);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args)  {

        for (int i=0; i<=5; i++){
            JavaThread3 jt=new JavaThread3(i);
            Thread myThread=new Thread(jt);
            myThread.start();
        }
        System.out.println("you are write menge keep it up");
    }
}