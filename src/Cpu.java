public class Cpu {
    private  int ram,rom;
    private String motherboard;
    Cpu(int ram,int rom,String motherboard){
        this.ram = ram;
        this.rom = rom;
        this.motherboard =motherboard;
    }
    public void getdetailes(){
        System.out.println("Motherboard is: "+motherboard);
        System.out.println("Ram is: "+ram);
        System.out.println("Rom is: "+rom);
    }
}
