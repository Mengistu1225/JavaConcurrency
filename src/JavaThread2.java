class JavaThread2 extends Thread{
    private int numberOfThread;
    public JavaThread2(int numberOfThread){
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
            if (numberOfThread==3){
                throw new RuntimeException();
            }

        }
    }

    public static void main(String[] args) {

        for (int i=0; i<=5; i++){
            JavaThread2 jt=new JavaThread2(i);
            jt.start();
        }
    }
}