public class SecondMonitor extends Monitor{
    SecondMonitor(String brand, String diamention) {
        super(brand, diamention);
    }

    @Override
    public void getDetails() {
        System.out.println("2nd monitor Details is: ");
        super.getDetails();
    }
}
