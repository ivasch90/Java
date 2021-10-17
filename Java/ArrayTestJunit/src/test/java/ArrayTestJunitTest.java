import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;


public class ArrayTestJunitTest {


    //Task #1
    @ParameterizedTest
    @MethodSource("valuesForIntArrayWhenLastElementFourProvider")
    void shouldCreateNewIntArrayWhenIntArrayLastElementFour(int[] newArrayLastElementFour, int[] array) {
        assertArrayEquals(newArrayLastElementFour, ArrayTestJunit.arrayLastElementsFour(array));
    }

    private static Stream<Arguments> valuesForIntArrayWhenLastElementFourProvider() {
        int[] array1 = new int[] {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] array1Result = new int[] {1, 7};
        int[] array2 = new int[] {1000, 4, 7, 4, 4143, 3843, 8, 4, 23198, 3, 782};
        int[] array2Result = new int[] {23198, 3, 782};
        int[] array3 = new int[] {123, 4, 4034, 90, 6328, 73, 4, 67, 27, 213, 78};
        int[] array3Result = new int[] {67, 27, 213, 78};

        return Stream.of(
                Arguments.of(array1Result, array1),
                Arguments.of(array2Result, array2),
                Arguments.of(array3Result, array3)
        );
    }

    @ParameterizedTest
    @MethodSource("valuesForIntArrayWhenNotElementFourProvider")
    void shouldThrowRuntimeExceptionWhenIntArrayNotElementFour(int [] array) {
        assertThrows(RuntimeException.class, () -> ArrayTestJunit.arrayLastElementsFour(array));
    }

    private static Stream<Arguments> valuesForIntArrayWhenNotElementFourProvider() {
        int[] array1 = {1, 7};
        int[] array2 = {0, 5, 23, 867, 42, 12, 6564};
        int[] array3 = {531, 423, 53, 654, 1, 654};
        return Stream.of(
                Arguments.of(array1), //IntelliJ IDEA backlight array1 because one argument?
                Arguments.of(array2),
                Arguments.of(array3)
        );
    }

    @ParameterizedTest
    @MethodSource("valuesForIntArrayWhenArrayEmpty")
    void shouldNotEmptyIntArrayWhenIntArray(int [] array) {
        Assertions.assertTrue(array.length > 0, "Array is Empty");
    }

    private static Stream<int[]> valuesForIntArrayWhenArrayEmpty() {
        return Stream.of(
                new int[0],
                new int[] {1, 23},
                new int[10]
        );
    }

    // Task #2
    @ParameterizedTest
    @MethodSource("valuesForIntArrayWhenElementOneOrFourProvider")
    void shouldIntArrayElementOneOrFourWhenIntArray(int[] arr) {
        Assertions.assertTrue(ArrayTestJunit.isArrayOneAndFour(arr));
    }
    // 1 Option Stream<Arguments> but one Argument int[] Bad or Best?
    // Cast to Object because IntelliJ IDEA backlight;
    private static Stream<Arguments> valuesForIntArrayWhenElementOneOrFourProvider() {

        return Stream.of(
                Arguments.arguments((Object) new int[] {1, 2, 5, 3, 4}),
                Arguments.arguments((Object) new int[] {1, 2, 5, 3, 4}),
                Arguments.arguments((Object) new int[] {1, 1, 4, 4, 1, 4}),
                Arguments.arguments((Object) new int[] {1, 1, 1, 1}),
                Arguments.arguments((Object) new int[] {4, 4, 4, 4, 4}),
                Arguments.arguments((Object) new int[] {7, 423, 42, 123, 765})
        );
    }

    // 2 Option Stream<int[]> Bad or Best?
    private static Stream<int[]> valuesForIntArrayWhenElementOneOrFourProvider2() {

        return Stream.of(
                new int[] {1, 2, 5, 3, 4},
                new int[] {1, 2, 5, 3, 4},
                new int[] {1, 1, 4, 4, 1, 4},
                new int[] {1, 1, 1, 1},
                new int[] {4, 4, 4, 4, 4},
                new int[] {7, 423, 42, 123, 765}
        );
    }
}