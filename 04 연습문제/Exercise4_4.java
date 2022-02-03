//1+(-2)+3+(-4+)+...과 같은식으로 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지

class Exercise4_4{
	public static void main(String [] args) {
		int sum=0;
		int s=1; //값의 부호를 바꿔주는데 사용할 변수 
		int num=0;
		
		for(int i=1;true;i++,s=-s) {
			num=s*i;
			sum+=num;
			
			if(sum>=100)
				break;
		}
		System.out.println("num"+num);
		System.out.println("sum"+sum);
	}
}