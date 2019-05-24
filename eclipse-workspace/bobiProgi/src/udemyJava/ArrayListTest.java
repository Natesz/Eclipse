package udemyJava;

public class ArrayListTest<L> {
	L[] tomb;
	public ArrayListTest() {
		tomb = (L[]) new Object[10];
	}
	int filledSpots;
	
	public void add(L elem) {
		if(filledSpots < tomb.length) {
			tomb[filledSpots] = elem;
			filledSpots++;
		}else {
			L[] copy = tomb;
			tomb = (L[]) new Object[tomb.length + 10];
			for(int i=0;i<copy.length;i++) {
				tomb[i] = copy[i]; 
			}
		}
		add(elem);
	}
}
