import java.util.Scanner;

public class HomeWork3_test_ {
	public static void main(String[] args) {

		int correctCount = 0, wrongCount = 0;

		String[] questions = new String[4];
		questions[0] = "1. ��� ������������ �������� �������� ����������?";
		questions[1] = "2. � ����� ����� ��������� �������� ������?";
		questions[2] = "3. � ����� ������� ���������� ���������� ���������?";
		questions[3] = "4. ��� ���������� ������ ������� ������ ��������� ��������� ��-��:";

		String[][] answerOptions = new String[4][3];
		answerOptions[0][0] = "1) ���������� ������� ���, ����� ���������� � �������� �������� � ���� ������������ �������;";
		answerOptions[0][1] = "2) ������������ ���������������� �������������� ����������;";
		answerOptions[0][2] = "3) ���������� ������� ����� ���������� � ���� ������������ �������;";
		answerOptions[1][0] = "1) ��� �������� �������;";
		answerOptions[1][1] = "2) ��� ����� �������� ���������� ��������� �����;";
		answerOptions[1][2] = "3) ��� ����������� ������� �� ��� �������;";
		answerOptions[2][0] = "1) �� ������� �������������� ��������;";
		answerOptions[2][1] = "2) ������� ������������� ����� ��������, � ����� ������������;";
		answerOptions[2][2] = "3) ������� ������������ ����� ��������, ����� �������������;";
		answerOptions[3][0] = "1) ������� �������� ���������� �����, ������������� ���� ���������� ����;";
		answerOptions[3][1] = "2) ����� �������� ���������� �����, ��������� ������� ���� ���������� ����;";
		answerOptions[3][2] = "3) ������������� ������� ����������, ��������� ������� ���� ���������� ����;";

		int[] correctAnswer = new int[4];
		correctAnswer[0] = 1;
		correctAnswer[1] = 3;
		correctAnswer[2] = 3;
		correctAnswer[3] = 1;

		for (int i = 0; i < 4; i++) {
			System.out.println(questions[i]);
			for (int j = 0; j < 3; j++) {
				System.out.println(answerOptions[i][j]);
			}

			Scanner answer = new Scanner(System.in);
			int number = answer.nextInt();
			System.out.println("��� �����" + " " + number);

			if (number != correctAnswer[i]) {
				wrongCount = wrongCount + 1;
				System.out.println("�����������");
			} else {
				correctCount = correctCount + 1;
				System.out.println("���������");
			}

		}

		System.out.println("���������:" + correctCount + ", �����������:" + wrongCount);
	}
}