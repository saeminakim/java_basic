package thisExample;

class Birthday {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {

	public static void main(String[] args) {
		Birthday bday = new Birthday();
		Birthday bday2 = new Birthday();
		
		System.out.println(bday);
		bday.printThis();
		
		System.out.println(bday2);
		bday2.printThis();
	}

}
