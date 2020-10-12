package com.harry.demo;

public class Logger {
    private String format;
    public String getFormat(){
        return this.format;
    }
    public void setFormat(String format){
        this.format = format;
    }
    public static void main(String [] args){
        Logger logger = new Logger();
        StreamingAudioPlayer stream = new StreamingAudioPlayer();
        boolean res = stream.openSpeaker(logger);
        System.out.println(res);

    }
}

class AudioPlayer{
    public boolean openSpeaker(Logger logger){
        return true;
    }
}

class StreamingAudioPlayer extends AudioPlayer{
    public boolean openSpeaker(Logger logger){
        return false;
    }
}

abstract class Caravan{
    private double price;
    private String model;
    private String year;
    public transient int limit = 55; //不会持久化
    private volatile boolean active;//多线程限制 相同值
    public abstract void goFast();//抽象方法
    public abstract void changeColor();
}
class SubClass extends Caravan{
    public void goFast(){

    }
    //同一时间只能被一个线程访问
    public synchronized  void changeColor(){

    }
}
