package TEST;

public class FindingNumberDeletingNumberCodility {

	public static int Number(int Number, char numberToDelete) {
		int maxValue = Integer.MIN_VALUE;
		int newValue=0;
		String s = Integer.toString(Number);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == numberToDelete) {
				String editedValue = s.substring(0, i) + s.substring(i + 1);
				int newNumber = Integer.parseInt(editedValue);
				newValue = newNumber > maxValue ? newNumber : maxValue;
				break;
			}

		}
		return newValue;

	}

	public static void main(String[] args) {
		System.out.println(Number(4444, '4'));

	}

}
