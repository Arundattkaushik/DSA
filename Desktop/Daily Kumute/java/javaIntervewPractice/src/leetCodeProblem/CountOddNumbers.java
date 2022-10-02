package leetCodeProblem;

public class CountOddNumbers {

	public static void main(String[] args) {
		CountOddNumbers c = new CountOddNumbers();
		System.out.println("number of odd digits are "+c.countOdd(1, 7));
	}
	int count = 0;
	public int countOdd(int low, int high) {
		for(int i = low; i<=high; i++) {
			if(i%2!=0) {
				count++;
			}
		}
		return count;	
	}

}
