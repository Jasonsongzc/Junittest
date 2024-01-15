import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

//@SelectPackages({"package1","package2"})
@SelectClasses({TestJunit1.class, TestEmployeeDetails.class})

@IncludeTags("production")
@Suite
@SuiteDisplayName("A demo Test Suite")


public class SuiteTests {
}
