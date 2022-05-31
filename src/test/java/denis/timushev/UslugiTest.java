package denis.timushev;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UslugiTest {
    @Test
    void searchLeproTest() {
        open("https://www.gosuslugi.ru/");
        $(".ng-star-inserted").$(byText("Войти")).click();
        $(".plain-input").setValue("999999999");
        $(".mb-8").setValue("123qwerty");
    }
}
