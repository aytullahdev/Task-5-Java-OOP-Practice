public class Monitor extends Print {
   private String brand,diamention;
    Monitor(String brand, String diamention){
        this.brand = brand;
        this.diamention = diamention;
    }
    public void getDetails(){
        System.out.println("Monitor brand name is"+brand);
        System.out.println("Monitor diamention is "+diamention);
    }

    @Override
    void print(String str) {
        System.out.println(str);
    }


}
