package dataStructure.recursion;

public class PalindromeNumberChecker {

public static int isPalindrome(int num, int res) {
	
	if(num == 0) {
		return res;
	}
	
	//% is used to retrieve last digit
	// '/' is used to remove the last digit
	res = res*10 + num%10; 
	
	return isPalindrome(num/10, res);
	
	
}
	
	public static void main(String[] args) throws Exception {
		
		int number = 12121;
		int res = 0;
		
		int pal = isPalindrome(number, res);
		
		if(pal == number) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not a Palindrome Number");
		}
		System.out.println("Reverse of a Number " + pal);

	}

}
