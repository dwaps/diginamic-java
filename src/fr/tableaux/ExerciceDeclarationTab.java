package fr.tableaux;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
		int[] arr = { 8, -7, 12, 1, -2, 14, 17, 9};
		
		System.out.println(arr[0]);
		System.out.println(arr.length);
		System.out.println(arr[arr.length-1]);
		
		// Error: arr.length == 10 ==> index max == 9
		System.out.println(arr[10]);
	}

}
