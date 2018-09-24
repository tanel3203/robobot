package ee.entusiast.robobot

import com.codeborne.selenide.{CollectionCondition, Configuration, Selenide}
import com.codeborne.selenide.Selenide.{$, $$}
import org.openqa.selenium.By


object Robobot extends App {

  Configuration.headless=false
  Selenide.open("https://www.riigiteataja.ee/jaotused.html?jaotus=S%C3%9CSTJAOT")


  $(By.xpath("//a[@id='toggle.S%C3%9CSTJAOT.RIIGI']")).click(5,5)

  $(By.xpath("//a[@id='nimi.S%C3%9CSTJAOT.RIIGI.P%C3%95HI']")).click(1,1)

  $(By.linkText("Eesti Vabariigi põhiseadus")).click(1,1)

  val results = $$(By.cssSelector("div#article-content p.paragraph")).shouldBe(CollectionCondition.sizeGreaterThanOrEqual(1))


  println("RESULTS")
  println(results)
  println("DONE")
}
