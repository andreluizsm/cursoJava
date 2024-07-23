package main;

import java.util.Scanner;

import entites.Rooms;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Rooms[] rooms =  new Rooms[10];

		System.out.println("How many rooms will be rented? ");
		int qtd = sc.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			System.out.println("Rent #" + (i+1));
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Email: ");
			String email = sc.nextLine();
			
			System.out.println("Room: ");
			int room = sc.nextInt();
			
			rooms[room] = new Rooms(name, email, room);
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.println(rooms[i]);
			}
		}
		
		sc.close();
	}

}
