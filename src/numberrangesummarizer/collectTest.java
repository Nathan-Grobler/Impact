package numberrangesummarizer;
import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

class collectTest {

	@Test
	void test() {
		
		SequentialGrouping test_1 = new SequentialGrouping();
		String numbers_1 = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";//Unit test 

		///Test for numbers_1
		Collection<Integer> actual_1 = test_1.collect(numbers_1);//retrieves actual result
		Collection<Integer> predicted_1 = Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31);//predicted result for input
		assertThat(actual_1,is(predicted_1));//compares to see if actual and predicted numbers correspond
		
	}
}
