import java.util.HashMap;
import java.util.Map;

public class EqualClass {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		/*
		 * String x="Ram"; String y="Sita"; String z=x;
		 * System.out.println(x.hashCode()); System.out.println(y.hashCode());
		 * System.out.println(z.hashCode()); System.out.println(x.equals(z));
		 * System.out.println(z.equals(x)); System.out.println(y.equals(x));
		 */
		Map<Integer, Animal> map=new HashMap<Integer, Animal>();
		
		
		Animal xyz= new Animal("Rancho","dog");
		Animal ani = new Animal("Rancho","dog");
		Animal abc =new Animal("Luci","cat");
//		Animal xa=xyz;
		
		map.put(001, xyz);
		map.put(002, ani);
		map.put(003, abc);
		map.put(004, xyz);
		
		System.out.println(map);
		System.out.println(map.get(001));
		
		
		
		/*
		 * System.out.println(xyz.hashCode()); System.out.println(ani.hashCode());
		 * System.out.println(abc.hashCode()); System.out.println(xa.hashCode());
		 * System.out.println(xyz.equals(ani)); System.out.println(xyz.equals(abc));
		 */
				
		
		
		
	}

}
