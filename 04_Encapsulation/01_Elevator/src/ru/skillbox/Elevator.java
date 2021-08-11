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
        System.out.println("Текущий этаж: " + currentFloor);
        return currentFloor;
    }

    private void moveDown() {
        currentFloor = currentFloor < maxFloor ? currentFloor - 1 : currentFloor;
    }

    private void moveUp() {
        currentFloor = currentFloor > minFloor ? currentFloor + 1 : currentFloor;
    }

    public void move(int floor) {
        if (floor > this.maxFloor || floor < this.minFloor) {
            System.out.println("Такого этажа не сужествует!");
        return;
        }

        for (; this.currentFloor < floor; moveUp()) {
            getCurrentFloor();
        }
        for (; currentFloor > floor; moveDown()) {
            getCurrentFloor();
        }
    }
}
