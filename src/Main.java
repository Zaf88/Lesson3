import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 1.0 || clientOS == 0)
        {
            System.out.println("Follow the link to install IOS app");
            int ClientOS = 1;
            if (clientOS == 1) {
            System.out.println("Follow the link to install Android app");}

            int clientDeviceYear = 2015;
            if (clientDeviceYear < 2015 && clientOS == 1.0 || clientOS == 0) {
            System.out.println("Install the light version of the IOS app from the link");}

            if (clientDeviceYear >= 2015 && clientOS == 1.0 || clientOS == 0) {

            System.out.println("Install the IOS app from the link");}
            if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Install the light version of the Android app from the link");}

            if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Install the Android app from the link");}

            int i = 2021;
            if ((i % 4 == 0 && (i % 100 != 0)) ||(i % 400 == 0))
                System.out.println(i + "The year is leap Year");
             else
                System.out.println( i+"The year is Not leap Year" );}

        int deliveryDistance = 60;
        if (deliveryDistance <=20) {
            System.out.println("DeliveryTime  1 day");}

        if (deliveryDistance <= 20) {
        System.out.println("DeliveryTime  1 day +24 hours");}


            else if (deliveryDistance <= 60) {
                System.out.println("DeliveryTime  1 day +  48 hours");}


        int monthNumber = 12;
        switch (monthNumber) {
            case 12,1,2:
                System.out.println("Season is Winter");
                break;
            case 3,4,5:
                System.out.println("Season is Spring");
                break;
            case 6,7,8:
                System.out.println("Season is Summer");
                break;
            case 9,10,11:
                System.out.println("Season is Autumn");
                break;
            default:
                System.out.println("There is no such month");}}}
