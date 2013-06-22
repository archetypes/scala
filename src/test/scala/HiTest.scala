import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

class HiTest extends FunSpec with ShouldMatchers {
  it("should have a test") {
    Hi.value should equal(true)
  }
}
