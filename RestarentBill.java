import java.util.Scanner;

class FoodOrder {

    int ChickenBriyani = 130;
    int MuttonBriyani = 150;
    int BeefBriyani = 160;
    int Cock = 35;
    int GrillChicken = 250;
    int ChickenSixtyfy = 100;
    int pepsi = 35;
    double pay;
    static int total;
    int Quantity;
    static String again;
    //static boolean order;
    //static int Dish;
    static int value;
    private String[] itemName = new String[7];

    private String[] itemCount = new String[7];
    private String[] itemPrice = new String[7];
    private String[] itemTotal = new String[7];
    private int i = 0;
    // HashMap<String,Integer> map = new HashMap<>();


    //data collocections
    Scanner src1 = new Scanner(System.in);


    public FoodOrder() {
    }

    public void DispalyMenu() {
        System.out.println("Welcome to Our Restorent");
        System.out.println("Enter your name please");
        Scanner inpute = new Scanner(System.in);
        String name = inpute.next();
        System.out.println();
        System.out.println("Hi" + " " + name + " " + "choose your food");
        System.out.println();
        System.out.println("----------Food Menu-----------");
        System.out.println();
        System.out.println("======================================");
        System.out.println();
        System.out.println("    Food               price");
        System.out.println("======================================");
        System.out.println("    ChickenBriyani     Rs130.00");
        System.out.println("    MuttonBriyani      Rs150.00");
        System.out.println("    BeefBriyani        Rs60.00");
        System.out.println("    GrillChicken       Rs250.00");
        System.out.println("    ChickenSixtyfy     Rs100.00");
        System.out.println("    Pepsi              Rs35.00");
        System.out.println("    Cock               Rs35.00");
        System.out.println();
        System.out.println("======================================");
        //food order menu


    }

    public void Order() {
        System.out.println(" Order the Food press Y(Yes) and  N(No)");
        Scanner src1 = new Scanner(System.in);
        char letter = src1.next().charAt(0);
        if (letter == 'Y') { //is condition True is Choose your food
            System.out.println("Enter your Order");
            System.out.println("Do you want to ChickenBriyani press the number 1");
            System.out.println("Do you want to MuttonBriyani press the number 2");
            System.out.println("Do you want to BeefBriyani press the number 3");
            System.out.println("Do you want to GrillChicken press the number 4");
            System.out.println("Do you want to ChickenSixtyfy press the number 5");
            System.out.println("Do you want to Cock Click the number 6");
            System.out.println("Do you want to Pepsi Click the number 7");
            System.out.println();
            int Dish = src1.nextInt();


            switch (Dish) {
                case 1://ChickenBriyani

                    System.out.println("Enter the Quandtity");
                    System.out.println();
                    Quantity = src1.nextInt();
                    total = total + Quantity + ChickenBriyani;

                    itemName[i] = "Chicken Briyani";
                    itemCount[i] = Quantity + "";
                    itemPrice[i] = ChickenBriyani + " ";
                    itemTotal[i] = total + " ";
                    i++;
                    break;

                case 2://MuttonBriyani

                    System.out.println("Enter the Quandtity");
                    System.out.println();
                    Quantity = src1.nextInt();
                    total = total + Quantity * MuttonBriyani;
                    itemName[i] = "Mutton Briyani ";
                    itemCount[i] = Quantity + "";
                    itemPrice[i] = MuttonBriyani + " ";
                    itemTotal[i] = total + " ";
                    i++;

                    break;

                case 3: //BeefBriyani

                    System.out.println("Enter the Quandtity");
                    System.out.println();
                    Quantity = src1.nextInt();
                    total = total + Quantity * BeefBriyani;


                    itemName[i] = "Beef Briyani";
                    itemCount[i] = Quantity + "";
                    itemPrice[i] = BeefBriyani + " ";
                    itemTotal[i] = total + " ";
                    i++;
                    break;

                case 4://GrillChicken

                    System.out.println("Enter the Quandtity");
                    System.out.println();
                    Quantity = src1.nextInt();
                    total = total + Quantity * GrillChicken;


                    itemName[i] = "GrillChicken";
                    itemCount[i] = Quantity + "";
                    itemPrice[i] = GrillChicken + " ";
                    itemTotal[i] = total + " ";
                    i++;
                    break;


                case 5: //ChickenSixtify

                    System.out.println("Enter the Quandtity");
                    System.out.println();
                    Quantity = src1.nextInt();
                    total = total + Quantity * ChickenSixtyfy;


                    itemName[i] = "ChickenSixtify";
                    itemCount[i] = Quantity + "";
                    itemPrice[i] = ChickenSixtyfy + " ";
                    itemTotal[i] = total + " ";
                    i++;
                    break;

                case 6: //Cock

                    System.out.println("Enter the Quandtity");
                    System.out.println();
                    Quantity = src1.nextInt();
                    total = total + Quantity * Cock;


                    itemName[i] = "Cock";
                    itemCount[i] = Quantity + "";
                    itemPrice[i] = Cock + " ";
                    itemTotal[i] = total + " ";

                    i++;
                    break;

                case 7://Pepsi

                    System.out.println("Enter the Quandtity");
                    System.out.println();
                    Quantity = src1.nextInt();
                    total = total + Quantity * pepsi;


                    itemName[i] = "Pepsi";
                    itemCount[i] = Quantity + "";
                    itemPrice[i] = pepsi + " ";
                    itemTotal[i] = total + " ";
                    i++;


                    break;
            }


            System.out.println("You want buy again");
            System.out.println();
            System.out.println("press Y for[Yes] and N for [No]");
            again = src1.next();

            //again order
            if (again.equalsIgnoreCase("Y")) {
                Order();
            }

        }
    }

    void printBill() {
        for (i = 0; i < 7; i++) {


            System.out.println(itemName[i] + " " + itemCount[i]);

                /* HashMap<Integer,String>getOreder = new HashMap<>();
                Scanner  Value = new Scanner(System.in);

                getOreder.put(1,"  ChickenBriyani"+ "   "+Quantity+"   "+ChickenBriyani+"   "+total);
                 getOreder.put( 2,"  MuttonBriyani"+  "   "+Quantity+"   "+MuttonBriyani+ "   "+total);
                getOreder.put( 3,"  BeefBriyani"+    "   "+Quantity+"   "+BeefBriyani+   "   "+total);
                getOreder.put( 4,"  GrillChicken"+   "   "+Quantity+"   "+GrillChicken+  "   "+total);
                getOreder.put( 5,"  ChickenSixtify"+ "   "+Quantity+"   "+ChickenSixtyfy+"   "+total);
                getOreder.put( 6,"  Cock"+           "   "+Quantity+"   "+Cock+          "   "+total);
                getOreder.put( itemName   "   "+total);

                 System.out.println(getOreder.get(1));

                 */

            // }
        }

        System.out.println("Total" + " " + total);
        System.out.println("Enter Payment");
        pay = src1.nextDouble();
        if (pay < total) {
            System.out.println("No Need more");

        }
        for (i = 0; i < 7; i++) {

            System.out.println(itemName[i] + " " + itemCount[i] + " " + itemPrice[i] + " " + itemTotal[i]);
        }
        System.out.println();
        System.out.println("Wellcome Again! Thank you...");
    }
}

class RestarentBill {
    public static void main(String[] args) {
        FoodOrder restarent = new FoodOrder();
        restarent.DispalyMenu();
        restarent.Order();
        restarent.printBill();
    }
}