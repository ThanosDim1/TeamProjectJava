import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static String category;
    private static String type;
    private static String name;
    private static final StorageManager storageManager = new StorageManager();
    private static final ArrayList<Device> devlist = storageManager.getDeviceList();
    private static final ArrayList<Sale> salelist= storageManager.getSaleList();
    private static final ArrayList<Order> orderlist=storageManager.getOrderList();



    public static void SearchList() {
        int salecode=0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < devlist.size(); i++) {
            if (devlist.get(i).getCategory().equalsIgnoreCase(category) && devlist.get(i).getMaintype().equalsIgnoreCase(type) && devlist.get(i).getModel().equalsIgnoreCase(name)) {
                System.out.println("-------Device's Information-------");
                System.out.println(devlist.get(i));
                if (devlist.get(i).getQuantity()>0){
                    System.out.println("The following item is available! Do you want to buy it?(1. Yes – 2. No).");
                    int ans=input.nextInt();
                    input.nextLine();
                    if (ans==1){
                        System.out.println("Give your name:\n ");
                        String custname=input.nextLine();
                        System.out.println("Give your surname:\n ");
                        String custsurname=input.nextLine();
                        System.out.println("Give your phone number:\n ");
                        String phonenumber=input.nextLine();
                        salelist.add(new Sale(salecode,devlist.get(i).getModel(),));
                    }
                }
            }
        }
    }

    public static void SetDevices(){
        // Create and add instances of different devices to the devlist
        devlist.add(new Camera("DSLR", 24, 5, 2, "135mm x 90mm x 70mm", "CAM001", "Alpha-5000", 2019, "Sony", 899, 3));
        devlist.add(new Camera("Compact", 36, 4, 3, "125mm x 85mm x 65mm", "CAM002", "Eos R6", 2022, "Canon", 2499, 0));
        devlist.add(new DVD("Blu-ray", 1080, "BD-R", "BR001", "The Avengers", 2012, " Marvel Studios", 109, 5));
        devlist.add(new DVD("DVD", 720, "DVD-RW", "DVD001", "The Lord of the Rings", 2001, " New Line Cinema", 99, 3));
        devlist.add(new Fridge("Single Door", "A++", 400, 200, "FR001", "Fridge 1", 2019, "Samsung", 999, 4));
        devlist.add(new Fridge("French Door", "A++", 300, 100, "FR002", "Fridge 2", 2020, "LG", 899, 13));
        devlist.add(new TV("LCD", 32, 1080, "HDMI", "TV001", "LCD TV 1", 2018, "Samsung", 299, 7));
        devlist.add(new TV("PLASMA", 70, 2160, "HDMI", "TV002", "PLASMA TV 1", 2020, "LG", 899, 1));
        devlist.add(new Console("PS5", "AMD Ryzen 5 3600", "AMD Radeon RX 5700 XT", "Dolby Digital", 1000, "CON001",
                "Playstation 5", 2020, "Sony", 499, 17));
        devlist.add(new Console("Xbox Series X", "AMD Ryzen 5 3600", "AMD Radeon RX 5700 XT", "Dolby Digital", 1000,
                "CON002", "Xbox Series X", 2020, "Microsoft", 499, 21));
        devlist.add(
                new WashingMachine( "A+++", 8, 1400, "WM001", "Front Load", 2019, "Samsung", 499, 2));
        devlist.add(new WashingMachine( "A+++", 10, 1200, "WM002", "Top Load", 2020, "LG", 399, 0));
    }


    public static void main(String[] args) {
        SetDevices();
        Scanner input = new Scanner(System.in);
        System.out.println("---------Main Menu---------" + "\n" + "1. Overview of all available devices" + "\n"
                + "2. Overview of all orders" + "\n" + "3. Overview of all sales" + "\n" + "0. Exit");
        int option = input.nextInt();
        input.nextLine();
        while (option != 0) {
            boolean f1=false;
            boolean f2=false;
            if (option == 1) {
                System.out.println("Give the category of the device you want to search for."+"\n"+"\n"+"Categories: Picture And Sound, Gaming, Household Appliances\n");
                category = input.nextLine();
                if(category.equalsIgnoreCase("Picture And Sound")|| category.equalsIgnoreCase("Gaming")|| category.equalsIgnoreCase("Household Appliances")){
                    System.out.println("The types for this categories are\n");
                    if(category.equalsIgnoreCase("Picture And Sound")){
                        System.out.println("- Camera\n- DVD\n- TV");
                    } else if (category.equalsIgnoreCase("Gaming")) {
                        System.out.println("- Console\n- Remote Console");
                    } else if (category.equalsIgnoreCase("Household Appliances")){
                        System.out.println("- Fridge\n- Washing Machine");
                    }
                    System.out.println();
                    System.out.println("Give the type of the device you want to search for");
                    type = input.nextLine();
                    for (int i = 0; i < devlist.size(); i++) {
                        if (devlist.get(i).getMaintype().equalsIgnoreCase(type)){
                            f1=true;
                            break;
                        }
                    }
                    if (f1){
                        System.out.println("The models for this type are\n");
                        for (int i = 0; i < devlist.size(); i++) {
                            if (devlist.get(i).getCategory().equalsIgnoreCase(category) && devlist.get(i).getMaintype().equalsIgnoreCase((type))){
                                System.out.println("- "+devlist.get(i).getModel());
                            }
                        }
                        System.out.println();
                        System.out.println("Give the model of the device you want to search for");
                        name = input.nextLine();
                        for (int i = 0; i < devlist.size(); i++) {
                            if (devlist.get(i).getModel().equalsIgnoreCase(name)){
                                f2=true;
                                break;
                            }
                        }
                        if (!f2){
                            System.out.println("Wrong model\n");
                            System.out.println("---------Main Menu---------" + "\n" + "1. Overview of all available devices" + "\n"
                                    + "2. Overview of all orders" + "\n" + "3. Overview of all sales" + "\n" + "0. Exit");
                            option = input.nextInt();
                            input.nextLine();
                        }else {
                            SearchList();
                        }
                    }else {
                        System.out.println("Wrong type\n");
                        System.out.println("---------Main Menu---------" + "\n" + "1. Overview of all available devices" + "\n"
                                + "2. Overview of all orders" + "\n" + "3. Overview of all sales" + "\n" + "0. Exit");
                        option = input.nextInt();
                        input.nextLine();
                    }
                }else {
                    System.out.println("Wrong category\n");
                    System.out.println("---------Main Menu---------" + "\n" + "1. Overview of all available devices" + "\n"
                            + "2. Overview of all orders" + "\n" + "3. Overview of all sales" + "\n" + "0. Exit");
                    option = input.nextInt();
                    input.nextLine();
                }
            } else if (option == 2) {


                

                System.out.println("---------Main Menu---------" + "\n" + "1. Overview of all available devices" + "\n"
                        + "2. Overview of all orders" + "\n" + "3. Overview of all sales" + "\n" + "0. Exit");
                option = input.nextInt();
                input.nextLine();







            } else if (option == 3) {

                System.out.println("---------Main Menu---------" + "\n" + "1. Overview of all available devices" + "\n"
                        + "2. Overview of all orders" + "\n" + "3. Overview of all sales" + "\n" + "0. Exit");
                option = input.nextInt();
                input.nextLine();

            }
        }
    }
}