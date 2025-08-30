package com.example.designpatterns.patterns.builder;

public class Computer {
    String ram;
    String cpu;
    String storage;
    String color;
    String storageType;
    boolean coolingSystem;
    Computer(ComputerBuilder builder) {
        this.ram = builder.ram;
        this.cpu = builder.cpu;
        this.storage = builder.storage;
        this.color = builder.color;
        this.storageType = builder.storageType;
        this.coolingSystem = builder.coolingSystem;
    }

    public static class ComputerBuilder{
        String ram;
        String cpu;
        String storage;
        String color;
        String storageType;
        boolean coolingSystem;


        public ComputerBuilder ram(String ram){
            this.ram = ram;
            return this;
        }
        public ComputerBuilder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public ComputerBuilder storage(String storage){
            this.storage = storage;
            return this;
        }
        public ComputerBuilder color(String color){
            this.color = color;
            return this;
        }
        public ComputerBuilder storageType(String storageType){
            this.storageType = storageType;
            return this;
        }
        public ComputerBuilder coolingSystem(boolean coolingSystem){
            this.coolingSystem = coolingSystem;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }


    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public boolean isCoolingSystem() {
        return coolingSystem;
    }

    public void setCoolingSystem(boolean coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", storage='" + storage + '\'' +
                ", color='" + color + '\'' +
                ", storageType='" + storageType + '\'' +
                ", coolingSystem=" + coolingSystem +
                '}';
    }
}
