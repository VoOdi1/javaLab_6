package MyPackage;

class Main {

    public static void main(String[] args) throws Exception
    {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName());

    }

}

class MyThread extends  Thread {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("this is new thread");
    }
    private  void someMethod(){
        throw new RuntimeException();
    }


}