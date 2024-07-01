package org.example.Lesson49_NestedInnerClass;

public class Computer {

    private String brand; // LENOVO
    private String model; // G50-30

    class CPU {
        private String producer; // Intel
        private String generation; // i5

        public void printInfoOfCPU() {
            System.out.printf("Brand - %s%nModel - %s%nProducer - %s%nGeneration - %s%n", brand, model, producer, generation);
        }

        public String getProducer() {
            return producer;
        }

        public void setProducer(String producer) {
            this.producer = producer;
        }

        public String getGeneration() {
            return generation;
        }

        public void setGeneration(String generation) {
            this.generation = generation;
        }
    }

    class RAM {
        private String name; // DDR3
        private int size; // 8

        public void printInfo() {
            System.out.printf("Computer Brand - %s%nComputer Model - %s%nRam name - %s%nRam size - %d%n", brand, model, name, size);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
