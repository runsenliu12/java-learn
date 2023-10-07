package com.runsen.string;

public class StringBufferThreadSafetyExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        Runnable appendTask = () -> {
            for (int i = 1; i <= 1000; i++) {
                stringBuffer.append("A");
            }
        };

        Thread thread1 = new Thread(appendTask);
        Thread thread2 = new Thread(appendTask);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("最终字符串长度：" + stringBuffer.length());
    }
}