package Collection;

import java.util.Comparator;

public class AgeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		StudentDemo1 s1 = (StudentDemo1)o1;
		StudentDemo1 s2 = (StudentDemo1)o2;
		if(s1.age==s2.age)
			return 0;
		else if(s1.age>s2.age)
			return 1;
		else
			return -1;
		
	}

}
