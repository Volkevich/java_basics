package ru.skillbox;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        System.out.println("Текущий этаж: " + currentFloor);
        return currentFloor;
    }

    private void moveDown() {
        currentFloor = currentFloor - 1;
    }

    private void moveUp() {
        currentFloor = currentFloor + 1;
    }

    public void move(int floor) {
        if (floor > this.maxFloor || floor < this.minFloor) {
            System.out.println("Такого этажа не сужествует!");
            return;
        }

       while (floor != currentFloor) {
            getCurrentFloor();
            if (currentFloor < floor)
                moveUp();
            else
                moveDown();
        }

    }
}
