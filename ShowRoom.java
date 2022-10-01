import java.util.Scanner;

import javax.print.attribute.standard.OrientationRequested;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

interface Pur {
    public double Details(double OriginalPrice);

}

class Purchase implements Pur {
    double RTO;
    double Tax;

    public double Details(double OriginalPrice) {
        String name;
        String email;
        String address;
        long Phone;

        double Total_Price = 0;
        System.out.println("DO you want to continue ");
        System.out.println("1. Yes\n2. NO");

        Scanner S1 = new Scanner(System.in);
        // Scanner S2 = new Scanner(System.in);
        // Scanner S3 = new Scanner(System.in);
        // Scanner S4 = new Scanner(System.in);
        int i = S1.nextInt();
        switch (i) {
            case 1:

                System.out.println("please enter location for on road price:");
                System.out.println("1. Mumbai\n2. Delhi\n3. Pune\n4. Banglore");
                int n = S1.nextInt();
                String Location;
                switch (n) {
                    case 1:
                        Location = "Mumbai";
                        S1.nextLine();
                        System.out.print("ener your NAME:= ");
                        name = S1.nextLine();

                        System.out.println("\n");
                        System.out.print("ener your EMAIL:= ");
                        email = S1.nextLine();
                        System.out.println("\n");
                        System.out.print("ener your ADDRESS:= ");
                        address = S1.nextLine();

                        System.out.println("\n");
                        System.out.print("ener your Phone number:= ");
                        Phone = S1.nextLong();

                        System.out.println(
                                "===========================================================================\n");

                        System.out.println("                       Name : " + name);
                        System.out.println("              Email address : " + email);
                        System.out.println("               Home Address : " + address);
                        System.out.println("               Phone Number : " + Phone);
                        double RTO1 = 5658.58;
                        double Tax1 = 2560.59;

                        RTO = RTO1;
                        Tax = Tax1;

                        Total_Price = RTO + Tax + OriginalPrice;

                }

        }

        return Total_Price;

    }

}

class Payment {
    double offer = 0;
    double Save = 0;

    public double offer1(double discount) {

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
        Date date = new Date();
        String date1 = sdf.format(date);

        String Makar = "01/14";
        String Republic_day = "01/26";
        String Independance_day = "08/15";

        String GaneshChaturthi = "08/24";
        String GaneshChaturthi1 = "08/25";
        String GaneshChaturthi2 = "08/26";
        String GaneshChaturthi3 = "08/27";
        String GaneshChaturthi4 = "08/28";
        String GaneshChaturthi5 = "08/29";
        String GaneshChaturthi6 = "08/30";
        String GaneshChaturthi7 = "08/31";
        String GaneshChaturthi8 = "09/01";
        String GaneshChaturthi9 = "09/02";
        String GaneshChaturthi10 = "09/03";

        String ChristmasDay = "12/31";

        System.out.println("Ma'am or Sir, Please Select Offer, We Have @ offers in Our ShowRoom");
        System.out.println(
                "1. Festival Offer\n 2. Birthday Offer(At The Payment Time Id Proof Will be  Check So, Please valid Date Enter )");

        Scanner ref = new Scanner(System.in);
        System.out.print("please Select Offer(please Enter Numbers Only) == ");
        int n = ref.nextInt();
        switch (n) {
            case 1:
                if (date1.equals(Makar) || date1.equals(Republic_day) || date1.equals(Independance_day)
                        || date1.equals(GaneshChaturthi) || date1.equals(GaneshChaturthi1)
                        || date1.equals(GaneshChaturthi2)
                        || date1.equals(GaneshChaturthi3) || date1.equals(GaneshChaturthi4)
                        || date1.equals(GaneshChaturthi5) || date1.equals(GaneshChaturthi6)
                        || date1.equals(GaneshChaturthi7) || date1.equals(GaneshChaturthi8)
                        || date1.equals(GaneshChaturthi9) || date1.equals(GaneshChaturthi10)
                        || date1.equals(ChristmasDay)) {
                    System.out.println("You Selected Festival Offer");
                    System.out.println("===============================================================\n");
                    if (date1.equals(Makar)) {
                        System.out.println("Congratulations!!! Yoy Got Makar Sankrati Offer");
                    } else if (date1.equals(Republic_day)) {
                        System.out.println("Congratulations!!! Yoy Got Republic Day Offer ");
                    } else if (date1.equals(Independance_day)) {
                        System.out.println("Congratulations!!! Yoy Got Independance day Offer");
                    } else if (date1.equals(GaneshChaturthi) || date1.equals(GaneshChaturthi1)
                            || date1.equals(GaneshChaturthi2) || date1.equals(GaneshChaturthi3)
                            || date1.equals(GaneshChaturthi4) || date1.equals(GaneshChaturthi5)
                            || date1.equals(GaneshChaturthi6) || date1.equals(GaneshChaturthi7)
                            || date1.equals(GaneshChaturthi8) || date1.equals(GaneshChaturthi9)
                            || date1.equals(GaneshChaturthi10)) {
                        System.out.print("This is Original price of your Vehicle == ");

                        System.out.println(discount);
                        System.out.println("===============================================================\n");
                        System.out.print("Congratulations!!! You Got GaneshChaturthi Day Offer You Save: == ");

                        double Save1 = (discount * 15 / 100);
                        System.out.println(Save1);
                        System.out.println("===============================================================\n");
                        double GaneshOffer = discount - Save1;
                        System.out.println("1.Gpay\n2. Card Pay\n3. Cash");
                        System.out.println("Please Select Payment mode");

                        Scanner Pay = new Scanner(System.in);

                        int n1 = Pay.nextInt();

                        switch (n1) {
                            case 1:
                                System.out.println("\n You Selected Gpay Payment mode");
                                System.out.println("===============================================================\n");
                                Save = (GaneshOffer * 5 / 100);
                                offer = GaneshOffer - Save;

                                System.out.println("You are saving ==" + Save);
                                System.out.println("===============================================================\n");

                        }

                    } else if (date1.equals(ChristmasDay)) {
                        System.out.println("Congratulations!!! You Got Christmas Day Offer");
                    }
                } else {
                    System.out.println(
                            "Sorry!!, Ma'am or Sir today is not any offer in show Room, But We Have a discount on payment\n");
                    System.out.println("1.Gpay\n 2.Card Pay\n 3.Cash");
                    System.out.println("Please Select Payment mode");
                    double Save2 = (discount * 5 / 100);
                    Scanner Pay = new Scanner(System.in);
                    int n2 = Pay.nextInt();

                    switch (n2) {
                        case 1:

                            System.out.println("You Selected Gpay Payment mode");
                            System.out.println("===============================================================\n");
                            System.out.print("This is Original price of your Vehicle == ");

                            System.out.println(discount);
                            System.out.println("===============================================================\n");
                            offer = discount - Save2;

                            System.out.println("You are saving ==" + Save2);
                            System.out.println("===============================================================\n");

                    }

                }

        }

        // System.out.println("1.Gpay\n 2.Card Pay\n 3.Cash");
        // System.out.println("Please Select Payment mode");
        // Scanner Pay = new Scanner(System.in);
        // int n = Pay.nextInt();
        // Save = (discount * 5 / 100);
        // switch (n) {
        // case 1:
        // System.out.println("You Selected Gpay Payment mode");

        // offer = discount - Save;

        // System.out.println("You are saving ==" + Save);

        // }

        return offer;
    }

}

interface Fuel_interface {
    String fuelType(String fuel);
}

class FuelType implements Fuel_interface {
    public String fuelType(String fuel) {
        switch (fuel) {
            case "Petrol":
                // System.out.println("You Selected Pertrol");
                fuel = "Petrol";
                break;
            // case "Electric":
            // System.out.println("You Selected Pertrol");
            // fuel = "Electric";
            // break;
        }
        return fuel;
    }
}

class Colors {

    public String chooseColor(String color) {
        // Scanner scanner = new Scanner(System.in);
        // String fuel = scanner.nextLine();

        switch (color) {
            case "RED":
                color = "Red";
                break;
            case "Black":
                color = "Black";
                break;
            case "Silver":
                color = "Silver";
                break;
            case "Light Blue":
                color = "Light Blue";
                break;
        }
        return color;

    }
}

/*
 * class Offers { double rto_Cost; double tax; double discount; double
 * OfferPrice;
 * 
 * public double getOfferPrice(int price) {
 * System.out.println("You want to Any offer  please choose below option");
 * System.out.
 * println("1. Ganesh Chaturthi\n2.15 August\n3.Rakshabandhan\n4.Diwali\n5.Holi\n6.Makarsankrath"
 * );
 * 
 * } }
 */

class Activa extends Payment {
    public void activa(String name, double price, String colour, int Cubic_Centimeter, double Milege,
            double Fuel_CApacity, String FuelType)

    {
        Scanner n = new Scanner(System.in);
        System.out.print("Do You Want to Continue for payment? 1 . Yes or 2. No  ==== ");
        int a = n.nextInt();
        System.out.println("================================================================\n\n");
        switch (a) {
            case 1:
                double temp = price;

                price = offer1(temp);
                Pur details = new Purchase();

                Purchase P1 = (Purchase) details;
                double onRoadRice = details.Details(price);

                System.out.println("                 Model NAME : " + name);
                System.out.println("          Ex-ShowRoom Price  : " + temp);
                System.out.println("Offer on  Ex-Showroom Price : " + price);
                System.out.println("                   RTO Cost : " + P1.RTO);
                System.out.println("                   Tax Cost : " + P1.Tax);
                System.out.println("                     Colour : " + colour);
                System.out.println("           CUBIC_CENTIMETER : " + Cubic_Centimeter + "cc");
                System.out.println("                     Milege : " + Milege);
                System.out.println("              Fuel_CApacity : " + Fuel_CApacity + "Ltr");
                System.out.println("                   FuelType : " + FuelType);
                System.out.println("Final Price After RTO & TAX : " + onRoadRice);
                break;
            case 2:
                System.out.println("                 Model NAME : " + name);
                System.out.println("          Ex-ShowRoom Price  : " + price);
                System.out.println("                     Colour : " + colour);
                System.out.println("           CUBIC_CENTIMETER : " + Cubic_Centimeter + "cc");
                System.out.println("                     Milege : " + Milege);
                System.out.println("              Fuel_CApacity : " + Fuel_CApacity + "Ltr");
                System.out.println("                   FuelType : " + FuelType);

        }

    }
}

class Activa1 extends Payment {
    public void activa(String name, double price, String colour, int Cubic_Centimeter, double Milege,
            String Fuel_CApacity, String FuelType)

    {
        System.out.println("Do You Want to Continue for payment? 1 . Yes or 2. No");
        Scanner n = new Scanner(System.in);

        int a = n.nextInt();

        switch (a) {
            case 1:
                double temp = price;

                price = offer1(temp);
                Pur details = new Purchase();
                Purchase P1 = (Purchase) details;
                double onRoadRice = details.Details(price);
                System.out.println("                 Model NAME : " + name);
                System.out.println("          Ex-ShowRoom Price : " + temp);
                System.out.println("Offer on  Ex-Showroom Price : " + price);
                System.out.println("                   RTO Cost : " + P1.RTO);
                System.out.println("                   Tax Cost : " + P1.Tax);
                System.out.println("                     Colour : " + colour);
                System.out.println("           CUBIC_CENTIMETER : " + Cubic_Centimeter);
                System.out.println("                     Milege : " + Milege);
                System.out.println("              Fuel_CApacity : " + Fuel_CApacity);
                System.out.println("                   FuelType : " + FuelType);
                System.out.println("Final Price After RTO & TAX : =" + onRoadRice);

                break;

            case 2:
                System.out.println("                 Model NAME : " + name);
                System.out.println("          Ex-ShowRoom Price  : " + price);
                System.out.println("                     Colour : " + colour);
                System.out.println("           CUBIC_CENTIMETER : " + Cubic_Centimeter);
                System.out.println("                     Milege : " + Milege);
                System.out.println("              Fuel_CApacity : " + Fuel_CApacity);
                System.out.println("                   FuelType : " + FuelType);

                break;

        }
    }
}

class Scooter extends Colors {
    public void Scooter_Honda() {
        System.out.println("1.Activa 6G\n2. Dio\n3. Activa i");

        Scanner ref = new Scanner(System.in);
        System.out.print("Please Select Models(please Ente Number only) == ");
        int n = ref.nextInt();
        Activa A = new Activa();
        Activa1 B = new Activa1();

        /*
         * System.out.println("1.Petrol 6G\n 2.Electric\n 3. Disel ");
         * System.out.println("Please Select Models"); Scanner ref2 = new
         * Scanner(System.in);
         * 
         * String Fuel = ref1.nextLine();
         */
        String color = "";

        switch (n) {
            case 1:
                color = "RED";
                System.out.println("\nYou Selected Activa 7G");
                System.out.println("===============================================================\n");

                System.out.println("1.RED\n2. BLACK\n3. SILVER\n4. LIGHTBLUE");

                Scanner ref1 = new Scanner(System.in);
                System.out.print("Please Select Colour (PLEASE ENTER ONLY Numbe) == ");

                int color1 = ref.nextInt();
                int Fuel1;
                String Fuel = "";
                switch (color1) {
                    case 1:

                        System.out.println("\nYou Selected " + color);
                        System.out.println("===============================================================\n");
                        System.out.println("1.Petrol\n2. Electric");

                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref.nextInt();

                        Fuel_interface F = new FuelType();

                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("Activa 7G", 95000, chooseColor(color), 125, 65, 7, F.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("Activa 7G", 96000, chooseColor(color), 125, 65,
                                        "takes 5 hours to get fully charged its 1.87 kWh battery .", F.fuelType(Fuel));

                                break;

                        }
                        break;
                    case 2:
                        color = "BLACK";
                        System.out.println("You Selected " + color);
                        System.out.println("1.Petrol\n2. Electric");

                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref.nextInt();
                        Fuel = "";
                        Fuel_interface F1 = new FuelType();
                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("Activa 7G", 95000, chooseColor(color), 125, 65, 7, F1.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("Activa 7G", 96000, chooseColor(color), 125, 65,
                                        "takes 5 hours to get fully charged its 1.87 kWh battery .", F1.fuelType(Fuel));

                                break;

                        }
                        break;
                    case 3:
                        color = "SILVER";
                        System.out.println("\n You Selected " + color);
                        System.out.println("===============================================================\n");
                        System.out.println("1.Petrol\n2. Electric");

                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref.nextInt();
                        Fuel = "";
                        Fuel_interface F3 = new FuelType();
                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("Activa 7G", 95000, chooseColor(color), 125, 65, 7, F3.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("Activa 7G", 96000, chooseColor(color), 125, 65,
                                        "takes 5 hours to get fully charged its 1.87 kWh battery .", F3.fuelType(Fuel));

                                break;

                        }
                        break;
                    case 4:
                        color = "Light Blue";
                        System.out.println("\n You Selected " + color);
                        System.out.println("===============================================================\n");
                        System.out.println("1.Petrol\n2. Electric");

                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref.nextInt();
                        Fuel = "";
                        Fuel_interface F4 = new FuelType();
                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("Activa 7G", 95000, chooseColor(color), 125, 65, 7, F4.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("Activa 7G", 96000, chooseColor(color), 125, 65,
                                        "takes 5 hours to get fully charged its 1.87 kWh battery .", F4.fuelType(Fuel));

                                break;

                        }

                        // System.out.println("\n You Selected " + Fuel + " ");
                        // System.out.println("=================================================\n");

                        // A.activa("Activa 6G", 95000, chooseColor(color), 125, 65, 7,
                        // F1.fuelType(Fuel));
                        // break;

                }
                break;

            /*
             * switch (fuel) { case "Petrol": System.out.println("You Selected " + fuel +
             * " "); Fuel_interface f1 = new FuelType();
             * 
             * Activa A = new Activa("Activa 7G", 95000, chooseColor(color), 125, 65, 7,
             * f1.fuelType(fuel)); }
             */

            case 2:
                System.out.println("\n You Selected Dio");
                System.out.println("=========================================================================\n");
                System.out.println("1.RED\n2. BLACK\n3. SILVER\n4. LIGHTBLUE");

                System.out.print("Please Select Colour (PLEASE ENTER ONLY Numbe) == ");

                int color2 = ref.nextInt();
                int Fuel2;
                String Fuel3 = "";
                switch (color2) {
                    case 1:
                        color = "RED";
                        System.out.println("\nYou Selected " + color);
                        System.out.println("===============================================================\n");
                        System.out.println("1.Petrol\n2. Electric");
                        Scanner ref2 = new Scanner(System.in);
                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref2.nextInt();
                        Fuel = "";
                        Fuel_interface F = new FuelType();

                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("Dio", 90000, chooseColor(color), 115, 55, 7, F.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("Dio", 92000, chooseColor(color), 115, 55,
                                        "takes 4.5 hours to get fully charged its 1.8 kWh battery .", F.fuelType(Fuel));

                                break;

                        }
                        break;
                    case 2:
                        color = "BLACK";
                        System.out.println("You Selected " + color);
                        System.out.println("1.Petrol\n2. Electric");
                        Scanner ref3 = new Scanner(System.in);
                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref3.nextInt();
                        Fuel = "";
                        Fuel_interface F1 = new FuelType();
                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("Dio", 90000, chooseColor(color), 115, 55, 7, F1.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("Dio", 92000, chooseColor(color), 115, 55,
                                        "takes 4.5 hours to get fully charged its 1.8 kWh battery .",
                                        F1.fuelType(Fuel));

                                break;

                        }
                        break;
                    case 3:
                        color = "SILVER";
                        System.out.println("You Selected " + color);
                        System.out.println("1.Petrol\n2. Electric");

                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref.nextInt();
                        Fuel = "";
                        Fuel_interface F4 = new FuelType();
                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("Dio", 90000, chooseColor(color), 115, 55, 7, F4.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("Dio", 92000, chooseColor(color), 115, 55,
                                        "takes 4.5 hours to get fully charged its 1.8 kWh battery .",
                                        F4.fuelType(Fuel));

                                break;

                        }
                        break;
                    case 4:
                        color = "Light Blue";
                        System.out.println("You Selected " + color);
                        System.out.println("1.Petrol\n2. Electric");

                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref.nextInt();
                        Fuel = "";
                        Fuel_interface F5 = new FuelType();
                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("Dio", 90000, chooseColor(color), 115, 55, 7, F5.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("Dio", 92000, chooseColor(color), 115, 55,
                                        "takes 4.5 hours to get fully charged its 1.8 kWh battery .",
                                        F5.fuelType(Fuel));

                                break;

                        }

                        // System.out.println("\n You Selected " + Fuel + " ");
                        // System.out.println("=================================================\n");

                        // A.activa("Activa 6G", 95000, chooseColor(color), 125, 65, 7,
                        // F1.fuelType(Fuel));
                        // break;

                }
                break;
            case 3:
                System.out.println("\n You Selected Activa i");
                System.out.println("=========================================================================\n");
                System.out.println("1.RED\n2. BLACK\n3. SILVER\n4. LIGHTBLUE");

                System.out.print("Please Select Colour (PLEASE ENTER ONLY Numbe) == ");

                int color3 = ref.nextInt();
                int Fuel4;
                String Fuel5 = "";
                switch (color3) {
                    case 1:
                        color = "RED";
                        System.out.println("\nYou Selected " + color);
                        System.out.println("===============================================================\n");
                        System.out.println("1.Petrol\n2. Electric");

                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref.nextInt();
                        Fuel = "";
                        Fuel_interface F = new FuelType();

                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("Activa i", 85000, chooseColor(color), 112, 55, 7, F.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("Activa i", 82000, chooseColor(color), 110, 59,
                                        "takes 4.2 hours to get fully charged its 1.8 kWh battery .",
                                        F.fuelType(Fuel));

                                break;

                        }
                        break;
                    case 2:
                        color = "BLACK";
                        System.out.println("You Selected " + color);
                        System.out.println("1.Petrol\n2. Electric");

                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref.nextInt();
                        Fuel = "";
                        Fuel_interface F1 = new FuelType();
                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("Activa i", 85000, chooseColor(color), 112, 55, 7, F1.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("Activa i", 82000, chooseColor(color), 110, 59,
                                        "takes 4.2 hours to get fully charged its 1.8 kWh battery .",
                                        F1.fuelType(Fuel));

                                break;

                        }
                        break;
                    case 3:
                        color = "SILVER";
                        System.out.println("You Selected " + color);
                        System.out.println("1.Petrol\n2. Electric");
                        Scanner ref6 = new Scanner(System.in);
                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref.nextInt();
                        Fuel = "";
                        Fuel_interface F4 = new FuelType();
                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("Activa i", 85000, chooseColor(color), 112, 55, 7, F4.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("Activa i", 82000, chooseColor(color), 110, 59,
                                        "takes 4.2 hours to get fully charged its 1.8 kWh battery .",
                                        F4.fuelType(Fuel));

                                break;

                        }
                        break;
                    case 4:
                        color = "Light Blue";
                        System.out.println("You Selected " + color);
                        System.out.println("1.Petrol\n2. Electric");

                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref.nextInt();
                        Fuel = "";
                        Fuel_interface F5 = new FuelType();
                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("Activa i", 85000, chooseColor(color), 112, 55, 7, F5.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("Activa i", 82000, chooseColor(color), 110, 59,
                                        "takes 4.2 hours to get fully charged its 1.8 kWh battery .",
                                        F5.fuelType(Fuel));

                                break;

                        }

                        // System.out.println("\n You Selected " + Fuel + " ");
                        // System.out.println("=================================================\n");

                        // A.activa("Activa 6G", 95000, chooseColor(color), 125, 65, 7,
                        // F1.fuelType(Fuel));
                        // break;

                }
                break;
            default:
                System.out.println("\nPlease enter valid Input");
                System.out.println("================================================");
                Scooter_Honda();
        }
    }

    public void Scooter_Bajaj() {
        System.out.println("1.Chetak ");

        Scanner ref = new Scanner(System.in);
        System.out.print("Please Select Models(please Ente Number only) == ");
        int n = ref.nextInt();
        Activa A = new Activa();
        Activa1 B = new Activa1();

        /*
         * System.out.println("1.Petrol 6G\n 2.Electric\n 3. Disel ");
         * System.out.println("Please Select Models"); Scanner ref2 = new
         * Scanner(System.in);
         * 
         * String Fuel = ref1.nextLine();
         */
        String color = "";

        switch (n) {
            case 1:
                color = "RED";
                System.out.println("\nYou Selected Chetak");
                System.out.println("===============================================================\n");

                System.out.println("1.RED\n2. BLACK\n3. SILVER\n4. LIGHTBLUE");

                Scanner ref1 = new Scanner(System.in);
                System.out.print("Please Select Colour (PLEASE ENTER ONLY Numbe) == ");

                int color1 = ref.nextInt();
                int Fuel1;
                String Fuel = "";
                switch (color1) {
                    case 1:

                        System.out.println("\nYou Selected " + color);
                        System.out.println("===============================================================\n");
                        System.out.println("1.Petrol\n2. Electric");

                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref.nextInt();

                        Fuel_interface F = new FuelType();

                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("Chetak BS6", 140000, chooseColor(color), 125, 65, 7, F.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("Chetak", 185000, chooseColor(color), 125, 65,
                                        "takes 5 hours to get fully charged its 1.87 kWh battery .", F.fuelType(Fuel));

                                break;

                        }
                        break;
                    case 2:
                        color = "BLACK";
                        System.out.println("You Selected " + color);
                        System.out.println("1.Petrol\n2. Electric");

                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref.nextInt();
                        Fuel = "";
                        Fuel_interface F1 = new FuelType();
                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("Chetak BS6", 140000, chooseColor(color), 125, 65, 7, F1.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("Chetak", 185000, chooseColor(color), 125, 65,
                                        "takes 5 hours to get fully charged its 1.87 kWh battery .", F1.fuelType(Fuel));

                                break;

                        }
                        break;
                }
        }
    }
}

class Bike extends Colors {
    public void Bike_Honda() {
        System.out.println("1.Honda SP 125\n2. CBR");

        Scanner ref = new Scanner(System.in);
        System.out.print("Please Select Models(please Ente Number only) == ");
        int n = ref.nextInt();
        Activa A = new Activa();
        Activa1 B = new Activa1();

        /*
         * System.out.println("1.Petrol 6G\n 2.Electric\n 3. Disel ");
         * System.out.println("Please Select Models"); Scanner ref2 = new
         * Scanner(System.in);
         * 
         * String Fuel = ref1.nextLine();
         */
        String color = "";

        switch (n) {
            case 1:
                color = "RED";
                System.out.println("\nYou Selected Honda SP 125");
                System.out.println("===============================================================\n");

                System.out.println("1.RED\n2. BLACK");

                Scanner ref1 = new Scanner(System.in);
                System.out.print("Please Select Colour (PLEASE ENTER ONLY Numbe) == ");

                int color1 = ref.nextInt();
                int Fuel1;
                String Fuel = "";
                switch (color1) {
                    case 1:

                        System.out.println("\nYou Selected " + color);
                        System.out.println("===============================================================\n");
                        System.out.println("1.Petrol\n2. Electric");

                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref.nextInt();

                        Fuel_interface F = new FuelType();

                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("Honda SP 125", 96000, chooseColor(color), 125, 65, 15, F.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("Activa 7G", 96000, chooseColor(color), 125, 65,
                                        "takes 5 hours to get fully charged its 1.87 kWh battery .", F.fuelType(Fuel));

                                break;

                        }
                        break;
                    case 2:
                        color = "BLACK";
                        System.out.println("You Selected " + color);
                        System.out.println("1.Petrol\n2. Electric");

                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref.nextInt();
                        Fuel = "";
                        Fuel_interface F1 = new FuelType();
                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("Honda SP 125", 96000, chooseColor(color), 125, 65, 15, F1.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("Activa 7G", 96000, chooseColor(color), 125, 65,
                                        "takes 5 hours to get fully charged its 1.87 kWh battery .", F1.fuelType(Fuel));

                                break;

                        }
                        break;

                    // System.out.println("\n You Selected " + Fuel + " ");
                    // System.out.println("=================================================\n");

                    // A.activa("Activa 6G", 95000, chooseColor(color), 125, 65, 7,
                    // F1.fuelType(Fuel));
                    // break;

                }
                break;

            /*
             * switch (fuel) { case "Petrol": System.out.println("You Selected " + fuel +
             * " "); Fuel_interface f1 = new FuelType();
             * 
             * Activa A = new Activa("Activa 7G", 95000, chooseColor(color), 125, 65, 7,
             * f1.fuelType(fuel)); }
             */

            case 2:
                System.out.println("\n You Selected CBR");
                System.out.println("=========================================================================\n");
                System.out.println("1.RED\n2. BLACK");

                System.out.print("Please Select Colour (PLEASE ENTER ONLY Numbe) == ");

                int color2 = ref.nextInt();
                int Fuel2;
                String Fuel3 = "";
                switch (color2) {
                    case 1:
                        color = "RED";
                        System.out.println("\nYou Selected " + color);
                        System.out.println("===============================================================\n");
                        System.out.println("1.Petrol\n2. Electric");
                        Scanner ref2 = new Scanner(System.in);
                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref2.nextInt();
                        Fuel = "";
                        Fuel_interface F = new FuelType();

                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("CBR", 120000, chooseColor(color), 200, 50, 15, F.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("CBR", 130000, chooseColor(color), 115, 55,
                                        "takes 5.56 hours to get fully charged its 1.8 kWh battery .",
                                        F.fuelType(Fuel));

                                break;

                        }
                        break;
                    case 2:
                        color = "BLACK";
                        System.out.println("You Selected " + color);
                        System.out.println("1.Petrol\n2. Electric");
                        Scanner ref3 = new Scanner(System.in);
                        System.out.print("Please Select FuelType(Please enter only Number) == ");

                        Fuel1 = ref3.nextInt();
                        Fuel = "";
                        Fuel_interface F1 = new FuelType();
                        switch (Fuel1) {
                            case 1:
                                Fuel = "Petrol";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                A.activa("CBR", 120000, chooseColor(color), 200, 50, 15, F1.fuelType(Fuel));

                                break;
                            case 2:
                                Fuel = "Electric";
                                System.out.println("\nYou Selected " + Fuel);
                                System.out.println("=================================================\n");

                                B.activa("CBR", 130000, chooseColor(color), 115, 55,
                                        "takes 4.5 hours to get fully charged its 1.8 kWh battery .",
                                        F1.fuelType(Fuel));

                                break;

                        }
                        break;

                    // System.out.println("\n You Selected " + Fuel + " ");
                    // System.out.println("=================================================\n");

                    // A.activa("Activa 6G", 95000, chooseColor(color), 125, 65, 7,
                    // F1.fuelType(Fuel));
                    // break;

                }
                break;

            // System.out.println("\n You Selected " + Fuel + " ");
            // System.out.println("=================================================\n");

            // A.activa("Activa 6G", 95000, chooseColor(color), 125, 65, 7,
            // F1.fuelType(Fuel));
            // break;
            default:
                System.out.println("\nPlease enter valid Input");
                System.out.println("================================================");
                Bike_Honda();
        }

    }
}

class BikeBrand {
    static {
        System.out.println("1. Scooter\n2. Bike");

    }

    public void BikeBrand_Honda() {

        System.out.print("\nplease select Type (PLEASE ENTER ONLY NUMBER) == ");
        Scanner ref = new Scanner(System.in);
        int n = ref.nextInt();

        switch (n) {
            case 1:
                System.out.println("\nYou Selected Scooter");
                System.out.println("=================================================\n");
                Scooter sc = new Scooter();
                sc.Scooter_Honda();
                break;
            case 2:
                System.out.println("\nYou Selected Scooter");
                System.out.println("=================================================\n");
                Bike sc1 = new Bike();
                sc1.Bike_Honda();

        }
    }

    public void BikeBrand_Bajaj() {

        System.out.print("\nplease select Type (PLEASE ENTER ONLY NUMBER) == ");
        Scanner ref = new Scanner(System.in);
        int n = ref.nextInt();

        switch (n) {
            case 1:
                System.out.println("\nYou Selected Scooter");
                System.out.println("=================================================\n");
                Scooter sc = new Scooter();
                sc.Scooter_Bajaj();
                break;
            case 2:
                System.out.println("\nYou Selected Scooter");
                System.out.println("=================================================\n");
                Bike sc1 = new Bike();

        }
    }
}

class TwoWheeler {
    static {
        System.out.println("1. Honda\n2. SUZUKI \n3. BAJAJ\n4. TVS \n5. JAWA");

    }

    public void TwoWheeler1() {

        Scanner ref2 = new Scanner(System.in);
        System.out.print("\nplease select brand(PLEASE ENTER ONLY NUMBER) == ");
        int ne = ref2.nextInt();

        switch (ne) {
            case 1: {
                System.out.println("\nYou Selected Honda");

                System.out.println("=================================================\n");
                System.out.println("please Confirm the option  (y)=>yes or  (n)=>No");
                ref2.nextLine();
                String a = ref2.nextLine();
                if (a.equals("y")) {
                    switch (ne) {
                        case 1:
                            BikeBrand B1 = new BikeBrand();
                            B1.BikeBrand_Honda();
                            break;
                    }
                } else {
                    System.out.println("1. Honda\n2. SUZUKI \n3. BAJAJ\n4. TVS \n5. JAWA");
                    TwoWheeler1();
                }

            }
                break;
            case 3: {
                System.out.println("\nYou Selected Bajaj");
                System.out.println("=================================================\n");
                System.out.println("please Confirm the option  (y)=>yes or  (n)=>No");
                ref2.nextLine();
                String a = ref2.nextLine();
                if (a.equals("y")) {
                    switch (ne) {
                        case 3:
                            BikeBrand B1 = new BikeBrand();
                            B1.BikeBrand_Bajaj();
                            break;
                    }
                } else {
                    System.out.println("1. Honda\n2. SUZUKI \n3. BAJAJ\n4. TVS \n5. JAWA");
                    TwoWheeler1();
                }

            }

        }
    }
}

public class ShowRoom {
    static {
        System.out.println("\nWelcome to QspiderShowRoom\n");
        System.out.println("please choose vehicle type\n");
        System.out.println("1. Two Wheeler \n2. Three Wheeler \n3. Four Wheeler \n4. six Wheeler\n");
    }

    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        System.out.print("Please Choose Vehicle Based on Wheel(only numbers can Enter): = ");
        int n = ref.nextInt();

        switch (n) {
            case 1:
                System.out.println("\nYou Selected Two Wheeler");
                System.out.println("please Confirm the option  (y)=>yes or  (n)=>No");
                ref.nextLine();
                String a = ref.nextLine();
                if (a.equals("y")) {
                    switch (n) {
                        case 1:
                            System.out.println("=================================================\n");

                            TwoWheeler vehicle = new TwoWheeler();
                            vehicle.TwoWheeler1();
                            break;
                        case 2:

                    }

                } else {
                    System.out.println("please choose vehicle type\n");
                    System.out.println("1. Two Wheeler \n2. Three Wheeler \n3. Four Wheeler \n4. six Wheeler\n");
                    main(null);
                }

        }

    }

}
