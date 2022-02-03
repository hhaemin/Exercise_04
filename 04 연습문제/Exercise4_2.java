// 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오.

class Exercise4_2 {
	public static void main(String [] args) {
		int sum =0;
			for(int x=1;x<=20;x++) {
				if (x%2!=0 && x%3!=0){
					sum+=x;
				}
			}
		System.out.println("sum="+sum);
	}
}