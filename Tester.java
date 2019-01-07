

import java.awt.List;
import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Set;

public class Tester {
	public static void space() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}
	public static void main(String[] args) {
		WAVLTree tree = new WAVLTree();
		
//		tree.insert(1, "1");
//		tree.insert(2, "2");
//		tree.insert(3, "3");
//		tree.insert(4, "4");
//		tree.insert(5, "5");
//		tree.insert(6, "6");
//		tree.delete(3);
//		tree.delete(5);
//		System.out.println(WAVLTreePrinter.toString(tree));
		
/*		int value = 20;
		ArrayList<Integer> inserts = new ArrayList<Integer>();
		for (int i = 1; i < value + 1; i++) {
			inserts.add(i);
		}
		int k = 0;
		Collections.shuffle(inserts);
		int max = tree.insert(inserts.get(0), Integer.toString(inserts.get(0)));
		int counter = max;
		for (int i = 1; i < value; i++) {
			k = tree.insert(inserts.get(i), Integer.toString(inserts.get(i)));
//			System.out.println(WAVLTreePrinter.toString(tree));
//			System.out.println("max: " + tree.max());
//			System.out.println("min: " + tree.min());
			if(k>max)
				max = k;
			counter += k;
		}
		System.out.println("Avg rebalance " + (double) counter / value);
		System.out.println("max rebalance " + max);
		System.out.println(WAVLTreePrinter.toString(tree));
		
		max = tree.delete(value);
		counter = max;
		for (int i = 2; i < value/2; i++) {
//			System.out.println("max: " + tree.max());
//			System.out.println("min: " + tree.min());
			System.out.println(WAVLTreePrinter.toString(tree));
//			System.out.println(i);
			System.out.println("Deleteing: " + i);
			k = tree.delete(i);
			System.out.println(WAVLTreePrinter.toString(tree));
			System.out.println("Deleteing: " + value + "-" + i);
			k = tree.delete(value-i);
			
//			k = tree.delete(100-i);
			if(k>max)
				max = k;
			counter += k;
		}
		System.out.println("Avg rebalance " + (double) counter / value);
		System.out.println("max rebalance " + max);
		System.out.println(WAVLTreePrinter.toString(tree));*/
		
		/*int n;
		int z;
		Random rand = new Random();
		ArrayList<Integer> inserts = new ArrayList<Integer>();
		ArrayList<Integer> deletes = new ArrayList<Integer>();
		for (int i = 1; i < 20; i++) {
			n = rand.nextInt(100) + 1;
			while(inserts.indexOf(n) != -1) {
				n = rand.nextInt(100) + 1;
			}
			z = tree.insert(n, Integer.toString(n));
			inserts.add(n);
		}
		System.out.println(WAVLTreePrinter.toString(tree));
		for (int i = 1; i < 100; i++) {
			n = rand.nextInt(100) + 1;
			try {
				z = tree.delete(n);
				if(z != -1) {
					System.out.println("delete: "+ n);
					System.out.println(WAVLTreePrinter.toString(tree));
					deletes.add(n);
				}	
			} catch (NullPointerException error){
				System.out.println("This is shit");
				deletes.add(n);
				break;
			}
		}
		System.out.println(WAVLTreePrinter.toString(tree));
		System.out.println(inserts.toString());
		System.out.println(deletes.toString());*/
		
		
		int n;
		int z;
		Random rand = new Random();
		ArrayList<Integer> inserts = new ArrayList<Integer>();
		ArrayList<Integer> deletes = new ArrayList<Integer>();
		for (int i = 1; i < 100; i++) {
			if(rand.nextInt(2)==1) { //insert
				n = rand.nextInt(50) + 1;
				while(inserts.indexOf(n) != -1) {
					n = rand.nextInt(50) + 1;
				}
				z = tree.insert(n, Integer.toString(n));
				System.out.println(WAVLTreePrinter.toString(tree));
				inserts.add(n);
			}
			else { //delete
				n = rand.nextInt(50) + 1;
				try {
					z = tree.delete(n);
					if(z != -1) {
						System.out.println("delete: "+ n);
						System.out.println(WAVLTreePrinter.toString(tree));
						deletes.add(n);
					}	
				} catch (NullPointerException error){
					System.out.println("This is shit");
					deletes.add(n);
					break;
				}
			}
		}
		System.out.println(inserts.toString());
		System.out.println(deletes.toString());
		
//		int[] inserts = {1, 30, 11, 67, 92, 34, 7, 66, 79, 20, 19, 37, 94, 31, 42, 78, 99, 55, 41, 71, 32, 84, 65, 50, 57, 39, 45, 54, 43, 24, 51, 77, 70, 21, 23, 52, 26, 4, 97, 58, 33, 96, 3, 29, 74, 53, 73, 87, 59, 5, 36, 15, 35, 98, 25, 93, 6, 90, 62, 47, 69, 44, 14, 9, 38, 81, 27, 40, 12, 46, 28, 64, 83, 8, 56, 100, 72, 16, 68, 22, 61, 91, 85, 60, 88, 89, 75, 13, 10, 49, 82, 17, 48, 80, 95, 63, 18, 86, 2, 76};
//		int[] deletes = {29, 50};
////		int[] inserts = {41, 96, 47, 18, 48, 73, 91, 85, 89, 49, 67, 100, 80, 12, 66, 29, 17, 39, 57, 31, 8, 35, 11, 14, 6, 77, 44, 81, 24, 65, 69, 34, 86, 88, 79, 82, 74, 83, 56, 68, 55, 27, 59, 7, 20, 43, 70, 16, 22, 33, 54, 97, 3, 4, 99, 38, 62, 63, 52, 93, 60, 94, 98, 50, 36, 25, 45, 28, 9, 1, 2, 23, 58, 37, 61, 87, 84, 42, 51, 26, 19, 13, 76, 30, 90, 5, 72, 15, 53, 64, 46, 10, 21, 78, 75, 40, 32, 71, 95, 92};
////		int[] deletes = {71, 42, 78, 81, 88, 76, 52, 12, 60, 97, 13, 80, 51, 38, 77, 47, 19, 11, 35, 69, 72, 17, 62, 16, 28, 86, 59, 14};
//		for (int i = 0; i < inserts.length; i++) {
//			tree.insert(inserts[i], Integer.toString(inserts[i]));
//		}
//		int n;
//		for (int i = 0; i < deletes.length; i++) {
//			n = deletes[i];
////			if (n ==99) {
//			System.out.println(WAVLTreePrinter.toString(tree));
////			}
//			System.out.println(tree.delete(deletes[i]));
//		}
//		System.out.println(WAVLTreePrinter.toString(tree));
	}
}
