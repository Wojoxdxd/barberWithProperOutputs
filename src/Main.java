public class Main {

    public static void main(String[] args) {
        BarberShop shop = new BarberShop(3, 1,3);

        Barber barber = new Barber(shop, 5, 5);
        CustomerGenerator customerGenerator = new CustomerGenerator(shop, 0 , 1);

        Thread barberThread = new Thread(barber);
        Thread customerGeneratorThread = new Thread(customerGenerator);
        customerGeneratorThread.start();
        barberThread.start();
    }
}