package fr.dut.info.starrealms.test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();*/
		int key = 1;
		
		switch (key) {
		case 1: {
			System.out.println("yes"); break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
	}
}
