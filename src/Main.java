public class Main {
    public static void main(String[] args){
        Monitor mon = new Monitor("Samsumg","1660X1600");
        SecondMonitor smon = new SecondMonitor("Lg","1650x1200");
        Cpu cpu = new Cpu(4,100,"Assus");
        Computer com = new Computer(mon,cpu);
        com.ComputerOn();
        com.monitor.getDetails();
        com.cpu.getdetailes();
        com.monitor.print("Hello World");
        com.ComputerOff();
    }


}
