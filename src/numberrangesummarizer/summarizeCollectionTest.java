package numberrangesummarizer;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.Test;

class summarizeCollectionTest {
	
	@Test
	void test() {
		
		SequentialGrouping test_1 = new SequentialGrouping();
		
		Collection<Integer> list = new ArrayList<>(Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31));//Declare input list 
		String actual_1 = test_1.summarizeCollection(list); //retrieves actual result
		String predicted_1 = "1, 3, 6 - 8, 12 - 15, 21 - 24, 31";//predicted result for input
		assertThat(actual_1,is(predicted_1));//compares to see if actual and predicted numbers correspond		
	}
}
