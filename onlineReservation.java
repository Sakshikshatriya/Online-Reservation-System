import java.util.*;
import java.util.Scanner;
import java.util.Date;

public class onlineReservation
{
    private static int[] berths = new int[13];

    public static void main(String[] args) {
        System.out.println("           ***WELCOME TO THE RAILWAY RESERVATION SYSTEM!!****");
        System.out.println("                                  HAVE A SAFE JOURNEY AHEAD !!!");
        System.out.println();

        for (int i = 0; i < 12; i++) {
            berths[i] = 0;
        }


        Scanner sc = new Scanner(System.in);
        int choice = 1;


        System.out.print("Please select your type of birth you want :\n1.Upper Birth\n2.Lower Birth\n0.Exit.\n");
        choice = s.nextInt();

        while (choice != 0) {
            int seatnumber = 0;


            if (choice == 1) {
                seatnumber = bookUpper();


                if (seatnumber == -1) {
                    seatnumber = bookLower();

                    if (seatnumber != -1) {


                        System.out.println("Sorry, there are no Upper Births available. But we do have a Lower Birth if you want to try.");
                        boardingPass(seatnumber);
                    }
                }
                else {

                    System.out.println("         Congratulations !!!, we have a Upper Birth available for you!!!");
                    boardingPass(seatnumber);
                }
            }
            else if (choice == 2) {


                seatnumber = bookLower();


                if (seatnumber == -1) {
                    seatnumber = bookUpper();

                    if (seatnumber != -1) {
                        System.out.println("Sorry, there are no Lower Births available. But we do have a Upper Birth if you want to try.");
                        boardingPass(seatnumber);
                    }
                }
                else {

                    System.out.println("         Congratulations !!!, we have a Lower birth available for you!!!");
                    boardingPass(seatnumber);
                }
            }
            else {

                System.out.println("Unfortunately Your choice is invalid. Please provide valid choice!!!");
                choice = 0;
            }


            if (seatnumber == -1) {
                System.out.println("Really Sorry, there are no Upper or Lower Births available");
                System.out.println();
            }



            System.out.print("Please select your type of birth:\n1.Upper Birth\n2.Lower Birth\n0.Exit.\n");
            choice = s.nextInt();
        }


    }

    private static int bookUpper() {
        for (int i = 0; i < 6; i++) {
            if (berths[i] == 0) {
                berths[i] = 1;
                return i + 1;
            }
        }
        return -1;
    }

    private static int bookLower() {
        for (int i = 6; i < 12; i++) {
            if (berths[i] == 0) {
                berths[i] = 1;
                return i + 1;
            }
        }
        return -1;

    }


    private static void boardingPass(int berthnumber) {
        Date timenow = new Date();
        System.out.println();
        System.out.println("Date: " + timenow.toString());
        System.out.println("Boarding pass for birth No.: " + berthnumber);
        System.out.println("Congratulations !!! , Your Booking Successful!!!");
        System.out.println("This ticket is non-refundable.");
        System.out.println("Please be polite and keep your place clean . Have a safe journey ahead.");
        System.out.println("!!!Have a great day!!!");
        System.out.println();
    }
}