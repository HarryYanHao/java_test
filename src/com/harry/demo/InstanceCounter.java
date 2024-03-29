package com.harry.demo;

public class InstanceCounter {
    private static int numInstances = 0;
    private static final String Versions = "1.1";
    protected static int getCount(){
        return numInstances;
    }
    private static void addInstance(){
        numInstances++;
    }
    InstanceCounter(){
        InstanceCounter.addInstance();
    }
    public static void main(String[] arg){
        System.out.println("Starting with " + InstanceCounter.getCount()+ " instances");
        for(int i = 0;i<500;i++) {
            new InstanceCounter();
        }
        System.out.println("Created " + InstanceCounter.getCount()+ " instances");
        System.out.println("version: " + InstanceCounter.Versions);

    }

}
