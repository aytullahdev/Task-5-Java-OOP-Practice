public class Computer implements OnOff{
    Monitor monitor;
    Cpu cpu;
    Computer(Monitor m, Cpu c){
        monitor = m;
        cpu = c;
    }

    @Override
    public void ComputerOn() {
            System.out.println("Truning On pc");
    }

    @Override
    public void ComputerOff() {
        System.out.println("Turning off pc");
    }

}
