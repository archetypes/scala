package features

import cucumber.api.Scenario
import cucumber.api.scala.{ScalaDsl, EN}

class Steps extends ScalaDsl with EN {

  When("""^I add (\d+) and (\d+)$"""){ (arg1: Double, arg2: Double) =>
    
  }
}