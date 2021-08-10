package ru.skillbox;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor = -3;
    private int maxFloor = 26;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        System.out.println("Текущий этаж: " + this.currentFloor);
        return this.currentFloor;
    }

    public void moveDown() {
        this.currentFloor = this.currentFloor > this.maxFloor ? this.currentFloor - 1 : this.currentFloor;
    }

    public void moveUp() {
        this.currentFloor = this.currentFloor < this.minFloor ? this.currentFloor + 1 : this.currentFloor;
    }

    public void move(int floor) {
        if (floor > this.maxFloor || floor < this.minFloor) {
            System.out.println("Такого этажа не сужествует!");
        }

        while(floor != this.currentFloor) {
            if (this.currentFloor < floor) {
                this.moveUp();
            }
        }

        if (this.currentFloor > floor) {
            this.moveDown();
        }

    }
}
