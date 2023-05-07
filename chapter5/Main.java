import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
	ArrayList<Integer> numberList = new ArrayList<Integer>();
	System.out.println(numberList.size());
	numberList.add(5);
	System.out.println(numberList.size());
	System.out.println(numberList.get(0));
	numberList.remove(Integer.valueOf(5));
	System.out.println(numberList.size());
	numberList.add(5);
	numberList.add(6);
	numberList.add(5);
	System.out.printf("Size: %d\n",numberList.size());
	System.out.println(numberList.contains(6));
	System.out.println(numberList.isEmpty());
	}
}