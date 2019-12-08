package com.palak.example;

class BubbleSort {
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println( arr[i]);
		}
	}

	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int j = 0; j < n-1 ; j++) {
			for (int k = 0; k < n - j-1 ; k++) {
				if (arr[k] > arr[k + 1]) {
					int temp = arr[k];
					arr[k] = arr[k + 1];
					arr[k + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int arr[] = { 78, 54, 1, 25, 65, 4};
		bs.bubbleSort(arr);
		System.out.println("Sorted array");
		bs.printArray(arr);
		System.out.println("The third highest is"+arr[2]);
	}
}
