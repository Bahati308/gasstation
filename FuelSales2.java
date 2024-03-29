
/*modified on 
Mar 04, 2023
 * developed by Bahati308
 * This program is aimed at 
 * easy management of a fuel station
 */
import java.util.*;

class FuelSales {
        public static void main(String[] args) {
                try (Scanner scan = new Scanner(System.in)) {
                        // these are litres read from the tanks
                        System.out.println("----MORNING SECTION-----");
                        System.out.println();

                        System.out.println("****PMS****");
                        System.out.print("Morning dips pms: ");
                        double morning_dips_pms = scan.nextDouble();

                        System.out.print("day opening pms :");
                        double day_opening_pms = scan.nextDouble();

                        System.out.print("day closing pms :");
                        double day_closing_pms = scan.nextDouble();

                        System.out.print("PMS RATE : ");
                        double rate_pms = scan.nextDouble();

                        double day_pms_litres = day_closing_pms - day_opening_pms;
                        System.out.println("Day Shift PMS Litres : " + day_pms_litres);

                        double day_sales_pms = day_pms_litres * rate_pms;
                        System.out.println("Day sales PMS : " + day_sales_pms);

                        double pms_morning_diff =(day_pms_litres-morning_dips_pms);

                        if (pms_morning_diff==0) {
                                System.out.println("woow, we balance");
                        }

                         else if (pms_morning_diff>0) {
                        System.out.println("woow, we have excess of :"+pms_morning_diff+"litres");

                        }

                                 else {
                        System.out.println("soory, we have a shortage of :"+pms_morning_diff+"litres");
                                 }

                        System.out.println();
                        System.out.println("***AGO***");
                        System.out.print("Morning dips ago: ");
                        double morning_dips_ago = scan.nextDouble();

                        System.out.print("day opening ago :");
                        double day_opening_ago = scan.nextDouble();

                        System.out.print("day closing ago :");
                        double day_closing_ago = scan.nextDouble();

                        System.out.print("AGO RATE : ");
                        double rate_ago = scan.nextDouble();
                        double day_ago_litres = day_closing_ago - day_opening_ago;
                        System.out.println("Day Shift AGO Litres : " + day_ago_litres);

                        double day_sales_ago = day_ago_litres * rate_ago;
                        System.out.println("Day sales AGO : " + day_sales_ago);

                        double ago_morning_diff =(day_ago_litres-morning_dips_ago);

        if (ago_morning_diff==0) {
                System.out.println("woow, we balance");
        }

         else if (ago_morning_diff>0) {
        System.out.println("woow, we have excess of :"+ago_morning_diff+"litres");

        }

                 else {
        System.out.println("soory, we have a shortage of :"+ago_morning_diff+"litres");
                 }

                System.out.println();
                        System.out.println("---EVENING SECTION----");
                        System.out.print("Evening dips PMS: ");
                        double evening_dips_pms = scan.nextDouble();

                        System.out.println("evening opening pms :" + day_closing_pms);
                        System.out.print("evening closing pms :");
                        double night_closing_pms = scan.nextDouble();

                        double night_pms_litres = night_closing_pms - day_closing_pms;
                        System.out.println("evening Shift PMS Litres : " + night_pms_litres);

                        double night_sales_pms = night_pms_litres * rate_pms;
                        System.out.println("eveningsales PMS : " + night_sales_pms);



                        double pms_evening_diff =(night_pms_litres-evening_dips_pms);

        if (pms_evening_diff==0) {
                System.out.println("woow, we balance");
        }

         else if (pms_evening_diff>0) {
        System.out.println("woow, we have excess of :"+pms_evening_diff+"litres");

        }

                 else {
        System.out.println("soory, we have a shortage of :"+pms_evening_diff+"litres");
                 }

                        System.out.println("----DAY SUMMARY-----");
                        System.out.println();

                        System.out.println("****PMS****");

                        double pms_litres = night_pms_litres + day_pms_litres;
                        System.out.println("Total PMS Litres :" + pms_litres);

                        double total_pms_sales = night_sales_pms + day_sales_pms;
                        System.out.println("Total PMS Sales: " + total_pms_sales);

                        System.out.println();

                        System.out.println("****AGO****");

                        System.out.print("Evening dips AGO: ");
                        double evening_dips_ago = scan.nextDouble();
                        System.out.println("evening opening AGO :" + day_closing_ago);

                        System.out.print("evening closing ago :");
                        double night_closing_ago = scan.nextDouble();

                        double night_ago_litres = night_closing_ago - day_closing_ago;
                        System.out.println("evening Shift AGO Litres : " + night_ago_litres);

                        double night_sales_ago = night_ago_litres * rate_ago;
                        System.out.println("evening sales AGO : " + night_sales_ago);

                        double ago_evening_diff =(night_ago_litres-evening_dips_ago);

                        if (ago_evening_diff==0) {
                                System.out.println("woow, we balance");
                        }
                
                         else if (ago_evening_diff>0) {
                        System.out.println("woow, we have excess of :"+ago_evening_diff+"litres");
                
                        }
                
                                 else {
                        System.out.println("soory, we have a shortage of :"+ago_evening_diff+"litres");
                                 }


                        System.out.println("----DAY SUMMARY-----");
                        System.out.println();

                        System.out.println("****AGO****");

                        double ago_litres = night_ago_litres + day_ago_litres;
                        System.out.println("Total AGO Litres :" + ago_litres);

                        double total_ago_sales = night_sales_ago + day_sales_ago;
                        System.out.println("Total AGO Sales: " + total_ago_sales);

                        // wait for FuelSales v2.0.1
                }
        }
}