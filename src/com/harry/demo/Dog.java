
package com.harry.demo;

public class Dog {
    String breed;
    int age;
    String color;

    public Dog(){
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String [] args){
        Dog myDog  = new Dog();
        myDog.setBreed("harry");
        myDog.setAge(2);
        myDog.setColor("red");
        System.out.println("小狗的名字是："+ myDog.breed);
        System.out.println("小狗的年龄是："+ myDog.getAge());
        System.out.println("小狗的颜色是："+ myDog.getColor());
    }
}
