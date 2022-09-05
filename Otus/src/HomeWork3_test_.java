import java.util.Scanner;

public class HomeWork3_test_ {
	public static void main(String[] args) {

		int correctCount = 0, wrongCount = 0;

		String[] questions = new String[4];
		questions[0] = "1. Чем определяются свойства сварного соединения?";
		questions[1] = "2. С какой целью выполняют разделку кромок?";
		questions[2] = "3. В каком порядке проводится аттестация сварщиков?";
		questions[3] = "4. При выполнении ручной дуговой сварки непровары возникают из-за:";

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

		int[] correctAnswer = new int[4];
		correctAnswer[0] = 1;
		correctAnswer[1] = 3;
		correctAnswer[2] = 3;
		correctAnswer[3] = 1;

		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);
			for (int j = 0; j < answerOptions[i].length; j++) {
				System.out.println(answerOptions[i][j]);
			}

			Scanner answer = new Scanner(System.in);
			int number;
			while ((number = answer.nextInt()) > answerOptions[i].length || number < 1) {
				System.out.println("Нет такого варианта ответа");
			}

			System.out.println("Ваш ответ" + " " + number);
			if (number != correctAnswer[i]) {
				wrongCount = wrongCount + 1;
				System.out.println("Неправильно");
			}
			else {
				correctCount = correctCount + 1;
				System.out.println("Правильно");
			} 

		}

		System.out.println("Правильно:" + correctCount + ", Неправильно:" + wrongCount);
	}
}