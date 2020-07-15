package com;

/**
 * @author OriKey
 * @create 2020- 07- 14 19:31
 * -- 平凡才是唯一的答案 --
 **/
public class TestReflection {
    public static void main(String[] args)throws Exception {
        Thread thread = new Thread(){
            public void run(){
                TestReflection.method1();
            }
        };
        thread.setName("第一个线程");
        thread.start();
        Thread.sleep(1000);
        Thread t2= new Thread(){
            public void run(){
                //调用method2
                TestReflection.method2();
            }
        };
        t2.setName("第二个线程");
        t2.start();
    }
    public static void method1(){
        synchronized (TestReflection.class){
            System.out.println(Thread.currentThread().getName());
            System.out.println("运行5S");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static synchronized void method2() {
        // 对于mehotd2而言，必然有个同步对象，通过观察发现，当某个线程在method1中，占用了TestReflection.class之后
        // 就无法进入method2，推断出，method2的同步对象，就是TestReflection.class
        System.out.println(Thread.currentThread().getName() + " 进入了method2方法");
        try {
            System.out.println("运行5秒");
            Thread.sleep(5000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

    }
}
