package service;

public class Ascending {
	public void arrange() {

		int[] array = { 5, 2, 7, 8, 3, 1, 4, 6, 9, 10 };
		int len = array.length;
		int temp = 0;
		int i;
		{
			System.out.println("Elements before arranging in ascending order");
			for (i = 0; i < len; i++) {
				System.out.print(array[i] + " ");
		}
				{
					for (i = 0; i < len; i++) {
						for (int j = i + 1; j < len; j++) {
							if (array[i] > array[j]) {
								temp = array[i];
								array[i] = array[j];
								array[j] = temp;
							}
						}
					}

					System.out.println();
					System.out.println("Elements after arranging in ascending order: ");
					for (i = 0; i < len; i++) {
						System.out.print(array[i] + " ");
					}
				}
			}
		
	}
}
