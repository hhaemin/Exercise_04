//for문 while문으로 바꾸기

class Exercise4_5{
	public static void main(String[] args) {
		int i=0;
		while(i<=10) {
			int j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
		}
			System.out.println();
			i++;
		}
	}
}