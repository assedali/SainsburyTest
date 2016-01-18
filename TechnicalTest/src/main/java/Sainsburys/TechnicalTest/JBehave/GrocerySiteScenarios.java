package Sainsburys.TechnicalTest.JBehave;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromRelativeFile;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.reporters.StoryReporterBuilder.Format;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.Test;

public class GrocerySiteScenarios extends JUnitStory {

	@Override
	public Configuration configuration() {
		URL storyURL = null;
		try {
			storyURL = new URL("grocery_site_scenarios.story");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return new MostUsefulConfiguration().useStoryLoader(
				new LoadFromRelativeFile(null)).useStoryReporterBuilder(
				new StoryReporterBuilder().withFormats(Format.HTML));
	}

	@Override
	public List<CandidateSteps> candidateSteps() {
		return new InstanceStepsFactory(configuration(), new GrocerySiteSteps())
				.createCandidateSteps();
	}
	
	@Override
	@Test
	public void run() {
		try {
			super.run();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
