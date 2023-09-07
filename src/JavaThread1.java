class JavaThread1 extends Thread{
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {

        for (int i=0; i<=5; i++){
            JavaThread1 jt=new JavaThread1();
            jt.start();
        }
    }
}