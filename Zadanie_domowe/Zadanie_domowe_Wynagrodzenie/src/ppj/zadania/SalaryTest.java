package ppj.zadania;

import java.util.Scanner;

public class SalaryTest {

	public static void main(String[] args) {

		Salary mySalary = new Salary("Michal", 40);

		Scanner input = new Scanner(System.in);

		System.out.print("Podaj imię pracownika: ");
		String name = input.nextLine();
		mySalary.setName(name);

		System.out.print("Podaj liczbę przepracowanych godzin w tygodniu: ");
		double hours = input.nextDouble();
		mySalary.setHours(hours);

		if (hours < 0) {
			System.out.print("Liczba godzin nie może być mniejsza od 0!\nPodaj liczbę przepracowanych godzin w tygodniu: ");
			double newHours = input.nextDouble();
			mySalary.setHours(newHours);

		}
		
		if (mySalary.getHours() >= 0 && mySalary.getHours() < mySalary.weekStandard) {
			System.out.println("Spróbuj popracować trochę dłużej, by otrzymać wynagrodzenie ;)");
		}

		else if (mySalary.getHours() == mySalary.weekStandard) {
			double Salary = mySalary.getHours() * mySalary.minWage;

			System.out.printf("%s, Twoje wynagrodzenie za przepracowany tydzień wynosi: %.2f zł%n", mySalary.getName(),
					Salary);

		}

		else if (mySalary.getHours() > mySalary.weekStandard && mySalary.getHours() <= mySalary.maxHours) {

			double Salary = mySalary.weekStandard * mySalary.minWage
					+ ((mySalary.getHours() - mySalary.weekStandard) * mySalary.minWage  * mySalary.overtime);
			System.out.printf("%s, Twoje łączne wynagrodzenie za przepracowany tydzień wynosi: %.2f zł%n",
					mySalary.getName(), Salary);
			System.out.printf("Podstawa: %.2f zł; Nadgodziny: %.2f zł", mySalary.weekStandard * mySalary.minWage,
					(mySalary.getHours() - mySalary.weekStandard) * mySalary.minWage  * mySalary.overtime);

		}

		else {

			System.out.println("Szanuj pracę, przekroczyłeś tygodniowy limit godzin!!!");

		}

		input.close();
	}
}
