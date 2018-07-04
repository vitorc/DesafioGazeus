package test.mobiletest.englishlabels.features;

        import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;
        import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/Destination/mobile"},
        features = {"target/classes/test/mobileTest/englishlabels/features"})
public class RunEnglishLablesTests {

}