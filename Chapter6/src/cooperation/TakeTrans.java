package cooperation;

public class TakeTrans {

	public static void main(String[] args) {

		Student james = new Student("James", 5000);
		Student thomas = new Student("Thomas", 10000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		thomas.takeSubway(subwayGreen);
		thomas.showInfo();
		subwayGreen.showInfo();
	}

}
