import java.util.Scanner;

public class HomeWork3_test_ {
	public static void main(String[] args) {
		// ���������� ��� �������� ���������� ���������� � ������������ �������
		int correctCount = 0, wrongCount = 0;

		String[] questions = new String[4];
		questions[0] = "1. ��� ������������ �������� �������� ����������?";
		questions[1] = "2. � ����� ����� ��������� �������� ������?";
		questions[2] = "3. � ����� ������� ���������� ���������� ���������?";
		questions[3] = "4. ��� ���������� ������ ������� ������ ��������� ��������� ��-��:";

		// ���������� ������ ������
		for (int i = 0; i < 1; i++) {
			System.out.println(questions[i]);
		}

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

		// ���������� �������� �������
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(answerOptions[i][j]);
			}
		}
		
		// ����� ������ � ������� ���������/������������
		Scanner answer = new Scanner(System.in);
		int number = answer.nextInt();
		System.out.println("��� �����:" + " " + number);
		if (number == 1) {
			correctCount = correctCount + 1;
			System.out.println("���������");
		} else {
			wrongCount = wrongCount + 1;
			System.out.println("�����������");
		}
		

		// ���� �� ������� �������
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
		System.out.println("��� �����:" + " " + number1);
		if (number1 == 3) {
			correctCount = correctCount + 1;
			System.out.println("���������");
		} else {
			wrongCount = wrongCount + 1;
			System.out.println("�����������");
		}

		// ���� �� �������� �������:
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
		System.out.println("��� �����:" + " " + number2);

		if (number2 == 3) {
			correctCount = correctCount + 1;
			System.out.println("���������");
		} else {
			wrongCount = wrongCount + 1;
			System.out.println("�����������");
		}

		// ���� �� 4-�� �������:
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
		System.out.println("��� �����:" + " " + number3);

		if (number3 == 3) {
			correctCount = correctCount + 1;
			System.out.println("���������");
		} else {
			wrongCount = wrongCount + 1;
			System.out.println("�����������");
		}

		System.out.println("���������: ���������" + correctCount + ", �����������:" + wrongCount);

	}

}
