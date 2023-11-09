package Homework;

class Monitor {
    private String size;
    private String color;
    private String power;

    public Monitor(String size, String color, String power) {
        this.size = size;
        this.color = color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }
}

class Computer {
    private String cpu;
    private String memory;
    private String hdd;
    private String cooler;
    private String power;

    public Computer(String cpu, String memory, String hdd, String cooler, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hdd = hdd;
        this.cooler = cooler;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the computer.");
    }

    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println("CPU: " + cpu);
        System.out.println("Memory: " + memory);
        System.out.println("HDD: " + hdd);
        System.out.println("Cooler: " + cooler);
        System.out.println("Power: " + power);
    }
}

public class Homework5 {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("32 inch", "Black", "45W");
        Computer computer = new Computer("Core i7", "32GB", "2TB", "White", "700W");

        monitor.turnOn();
        monitor.printInfo();

        System.out.println();

        computer.turnOn();
        computer.printInfo();
    }
}
