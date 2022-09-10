
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;

	Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	double tax() {
		if (this.salary >= 1000)
			return this.salary * 0.03;
		else
			return 0;
	}

	int bonus() {
		int hoursDiff = this.workHours - 40;
		if (hoursDiff > 0)
			return hoursDiff * 30;
		else
			return 0;
	}

	double raiseSalary() {
		int workYear = 2021 - hireYear;
		if (workYear < 10)
			return this.salary * 0.05;
		else if (workYear >= 10 && workYear < 20)
			return this.salary * 0.1;
		else
			return this.salary * 0.15;
	}

	void printInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
		System.out.println("Hours of work: " + this.workHours);
		System.out.println("Hiring Year: " + this.hireYear);
		System.out.println("Tax: " + this.tax());
		System.out.println("Bonus: " + this.bonus());
		System.out.println("Salary Increase: " + this.raiseSalary());
		System.out.println("Salary with tax and bonus: " + (this.salary + this.bonus() - this.tax()));
		System.out.println("Total salary: " + (this.salary + this.raiseSalary()));
	}
}
