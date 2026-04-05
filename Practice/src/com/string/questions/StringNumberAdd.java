package com.string.questions;

public class StringNumberAdd {

	public static void main(String[] args) {

		String s = "H31o953i11i13";
		int sum = 0;
		int num = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isDigit(ch)) {
				num = (ch - '0');
				sum=sum+num;

			System.out.println(num);
		
		}
		System.out.println(sum);

	}

}
}
