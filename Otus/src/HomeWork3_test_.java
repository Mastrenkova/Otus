import java.util.Scanner;

public class HomeWork3_test_ {
	public static void main(String[] args) {
		// Переменные для хранения количества правильных и неправильных ответов
		int correctCount = 0, wrongCount = 0;

		String[] questions = new String[4];
		questions[0] = "1. Чем определяются свойства сварного соединения?";
		questions[1] = "2. С какой целью выполняют разделку кромок?";
		questions[2] = "3. В каком порядке проводится аттестация сварщиков?";
		questions[3] = "4. При выполнении ручной дуговой сварки непровары возникают из-за:";

		// напечатали первый вопрос
		for (int i = 0; i < 1; i++) {
			System.out.println(questions[i]);
		}

		String[][] answerOptions = new String[4][3];
		answerOptions[0][0] = "1) Свойствами металла шва, линии сплавления с основным металлом и зоны термического влияния;";
		answerOptions[0][1] = "2) Техническими характеристиками использованных электродов;";
		answerOptions[0][2] = "3) Свойствами металла линии сплавления и зоны термического влияния;";
		answerOptions[1][0] = "1) Для экономии металла;";
		answerOptions[1][1] = "2) Для более удобного проведения сварочных работ;";
		answerOptions[1][2] = "3) Для обеспечения провара на всю глубину;";
		answerOptions[2][0] = "1) По решению аттестационной комиссии;";
		answerOptions[2][1] = "2) Сначала теоретическая часть экзамена, а затем практическая;";
		answerOptions[2][2] = "3) Сначала практическая часть экзамена, затем теоретическая;";
		answerOptions[3][0] = "1) Высокой скорости выполнения работ, недостаточной силы сварочного тока;";
		answerOptions[3][1] = "2) Малой скорости выполнения работ, чрезмерно большой силы сварочного тока;";
		answerOptions[3][2] = "3) Неправильного подбора электродов, чрезмерно большой силы сварочного тока;";

		// напечатали варианты ответов
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(answerOptions[i][j]);
			}
		}
		
		// вывод ответа и подсчет правильны/неправильных
		Scanner answer = new Scanner(System.in);
		int number = answer.nextInt();
		System.out.println("Ваш ответ:" + " " + number);
		if (number == 1) {
			correctCount = correctCount + 1;
			System.out.println("Правильно");
		} else {
			wrongCount = wrongCount + 1;
			System.out.println("Неправильно");
		}
		

		// цикл по второму вопросу
		for (int i = 1; i < 2; i++) {
			System.out.println(questions[i]);
		}
		for (int i = 1; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(answerOptions[i][j]);
			}
		}
		

		Scanner answer1 = new Scanner(System.in);
		int number1 = answer1.nextInt();
		System.out.println("Ваш ответ:" + " " + number1);
		if (number1 == 3) {
			correctCount = correctCount + 1;
			System.out.println("Правильно");
		} else {
			wrongCount = wrongCount + 1;
			System.out.println("Неправильно");
		}

		// цикл по третьему вопросу:
		for (int i = 2; i < 3; i++) {
			System.out.println(questions[i]);
		}
		for (int i = 2; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(answerOptions[i][j]);
			}
		}

		Scanner answer2 = new Scanner(System.in);
		int number2 = answer2.nextInt();
		System.out.println("Ваш ответ:" + " " + number2);

		if (number2 == 3) {
			correctCount = correctCount + 1;
			System.out.println("Правильно");
		} else {
			wrongCount = wrongCount + 1;
			System.out.println("Неправильно");
		}

		// цикл по 4-му вопросу:
		for (int i = 3; i < 4; i++) {
			System.out.println(questions[i]);
		}
		for (int i = 3; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(answerOptions[i][j]);
			}
		}

		Scanner answer3 = new Scanner(System.in);
		int number3 = answer3.nextInt();
		System.out.println("Ваш ответ:" + " " + number3);

		if (number3 == 3) {
			correctCount = correctCount + 1;
			System.out.println("Правильно");
		} else {
			wrongCount = wrongCount + 1;
			System.out.println("Неправильно");
		}

		System.out.println("Результат: правильно" + correctCount + ", неправильно:" + wrongCount);

	}

}
