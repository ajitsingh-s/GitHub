package Solution;

public class Stringtoint {
	public static void main(String[] args) {
		String str = "986858316445654654654";
		long num = Long.parseLong(str);
		int[] arry = new int[str.length()];
		long i=str.length()-1;
		while(num>0) {
			arry[(int) i] = (int) (num%10);
			num = num/10;
			i--;
		}
		for(long x: arry) {
			System.out.println(x);
		}
	}
}
