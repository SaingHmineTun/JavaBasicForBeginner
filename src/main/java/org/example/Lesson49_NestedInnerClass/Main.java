package org.example.Lesson49_NestedInnerClass;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setBrand("Lenovo");
        computer.setModel("G50-30");

        Computer.CPU cpu = new Computer().new CPU();
        cpu.setProducer("Intel");
        cpu.setGeneration("i3 5th Gen");

        cpu.printInfoOfCPU();

    }
}
