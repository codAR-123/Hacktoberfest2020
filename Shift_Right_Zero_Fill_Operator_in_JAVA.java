public class Shift_Right_Zero_Fill_Operator_in_JAVA {
	public static void main(String[] args) {
		int a=15;
		System.out.println(a>>>1); // Output:7
		System.out.println(a>>>2); // Output:3
		System.out.println(a>>>3); // Output:1
		System.out.println(a>>>4); // Output:0
	}

}

/* SHIFT-RIGHT-ZERO-FILL (>>>) Operator in Java
 * Example:
 * Let be 15 i.e. 1111 in binary
 * 
 * If 1111 >>> 1 , then it becomes 0111 (i.e. 7)
 * If 1111 >>> 2 , then it becomes 0011 (i.e. 3)
 * If 1111 >>> 3 , then it becomes 0001 (i.e. 1)
 * If 1111 >>> 4 , then it becomes 0000 (i.e. 0) 
 */
