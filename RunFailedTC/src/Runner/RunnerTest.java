package Runner;

import java.util.ArrayList;
import java.util.List;

import com.beust.testng.TestNG;

public class RunnerTest {

	public static void main(String[] args) {
		
		TestNG runner = new TestNG();
		List<String> list = new ArrayList<String>();
		
		list.add("C:\\java pgm\\RunFailedTC\\test-output\\SmokeTestingScenerio\\testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();
		
	}

}
