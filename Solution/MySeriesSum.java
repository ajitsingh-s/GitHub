package Solution;
import java.util.Arrays;

public class MySeriesSum {

	public static void main(String[] args) {
				int [] salary = {200,400,1100,600,700,900,300};
				int min =salary[0];
				int max =min;
				int sum = 0;
				for(int i =0; i<salary.length;i++) {
					if (min>salary[i])
						min = salary[i];
					if (max<salary[i])
						max = salary[i];
					
				}
				for(int i =0; i<salary.length;i++) {
					sum += salary[i];
				}
				sum = sum - min - max;
				System.out.println(sum/salary.length-2);
				

	}

}
