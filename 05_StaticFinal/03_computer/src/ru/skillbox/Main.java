package ru.skillbox;

public class Main {

    public static void main(String[] args) {
    Computer computer = new Computer
                        ("Intel","I5",
                        new CPU(2400,8,Manufacturer.INTEL,10),
                        new RAM(TypesRam.DDR2,16,10),
                        new HDD(TypeHDD.SSD,250,20),
                        new Screen(17.3,TypeScreen.IPS,20),
                        new Keyboard(TypeKeyboard.BT,true,20)
                        );



System.out.println(computer);
computer.cpu = computer.cpu.setFrequency(21212);
System.out.println(computer);
computer.cpu = computer.cpu.setNumberofCores(21232131);
System.out.println(computer);
computer.cpu = computer.cpu.setManufacturer(Manufacturer.AMD);
System.out.println(computer);
computer.hdd = computer.hdd.setTypeHDD(TypeHDD.HDD);
System.out.println(computer);




    }
}
