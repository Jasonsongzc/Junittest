import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.*;
import package1.test1;
import pagkage2.test2;

@SelectPackages({"package1","package2"})
@SelectClasses({test1.class, test2.class})

@IncludeTags("production")
@Suite
@SuiteDisplayName("A demo Test Suite")

public class TestSuiteExample {

}
