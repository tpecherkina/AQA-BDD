package ru.netology.web.Page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.val;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {
    private SelenideElement heading = $(withText("Ваши карты"));
    private SelenideElement buttonReload = $("[data-test-id=\"action-reload\"]");
    private ElementsCollection cards = $$(".list__item");
    private final String balanceStart = ", баланс: ";
    private final String balanceFinish = " р.";
    private final String cardIdStart = "[data-test-id=\"";
    private final String cardIdFinish = "\"]";

    private int extractBalance(String text) {
        val start = text.indexOf(balanceStart);
        val finish = text.indexOf(balanceFinish);
        val value = text.substring(start + balanceStart.length(), finish);
        return Integer.parseInt(value);
    }
}
