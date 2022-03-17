
public class RawTypeTest {
	private Double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
	private Integer[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

	public void testStacks() {
		Stack rawTypeStack1 = new Stack(5);
		Stack rawTypeStack2 = new Stack<Double>(5);
		Stack<Integer> integerStack = new Stack(10);

		testPush("rawTypeStack1", rawTypeStack1, doubleElements);
		testPop("rawTypeStack1", rawTypeStack1);
		testPush("rawTypeStack2", rawTypeStack2, doubleElements);
		testPop("rawTypeStack2", rawTypeStack2);
		testPush("integerStack", integerStack, integerElements);
		testPop("integerStack", integerStack);

	}

	public <T> void testPush(String name, Stack<T> stack, T[] elements) {
		try {
			System.out.printf("\nPushing elements into %s\n", name);
			for (T element : elements) {
				System.out.printf("%s ", element);
				stack.push(element);
			}
		} catch (FullStackException fullStackException) {
			System.out.println();
			fullStackException.printStackTrace();
		}

	}

	public <T> void testPop(String name, Stack<T> stack) {
		try {
			System.out.printf("\nPopping elements from %s\n", name);
			T popValue;
			while (true) {
				popValue = stack.pop();
				System.out.printf("%s ", popValue);
			}
		} catch (EmptyStackException emptyStackException) {
			System.out.println();
			emptyStackException.printStackTrace();
		}

	}

	public static void main(String args[]) {
		RawTypeTest application = new RawTypeTest();
		application.testStacks();
	}
}
