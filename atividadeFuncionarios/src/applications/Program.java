package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
import java.text.*;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new  ArrayList<>();
        
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();


        for(int i = 0; i < n; i++){
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char x = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(x == 'u'){
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.print("Manufacture date (DD/MM/YYYY)");
                String date1 = sc.next();
                try {
                    Date date = sdf.parse(date1);
                    list.add(new UsedProduct(name, price, date));
                } catch (ParseException e) {
                    System.out.println("Invalid date format. Please use dd/MM/yyyy.");

                }
            }
            else if(x == 'i'){
                System.out.print("Custom Fee: ");
                double fee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, fee));
            }else if(x == 'c'){
                list.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : list) {
            System.out.println(product.priceTag());
        }
        sc.close();
    }
}