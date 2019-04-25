class SecondHighest {
	public static void main(String[] args) {
		int temp;
		int[] a = {1,2,4,32,5,64,-23,41};
		for (int i = 0; i < a.length; i++){
			for (int j = i+1; j < a.length; j ++){
			int max=a[i];
				if (max < a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}for (int y = 0; y < a.length; y++){
			System.out.print(a[y] + " ");
		}
	}
}


// to print the highest number from an array
// class SecondHighest {
// 	public static void main(String[] args) {
// 		int[] a = {12,34,56,32,11,28};
// 		int x = a[0];

// 		for (int i = 1; i < a.length; i++){
// 			if (x < a[i]){
// 				x = a[i];
// 			}
// 		}System.out.println(x);
// 	}
// }

// class SecondHighest {
// 	public static void main(String[] args) {
// 		int temp = 0;
// 		for(int i = 2; i < 100; i++){
// 			for (int j = 2; j < i; j++){
// 				if (i % j == 0){
// 					temp = temp+1;
// 				}
// 			}if (temp == 0){
// 				System.out.println(i);
// 			}else{
// 				temp = 0;
// 			}
// 		}
// 	}
// }

// class SecondHighest {
// 	public static void main(String[] args) {
// 		int fac = 5;
// 		int a = 1;
// 		for (int i = 1; i <= fac; i++){
// 			a = a*i;
// 		}System.out.println(a);
// 	}
// }
