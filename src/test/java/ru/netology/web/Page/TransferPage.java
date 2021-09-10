package ru.netology.web.Page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.web.Data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class TransferPage {
    private SelenideElement balance = $(withText("Пополнение карты"));
    private SelenideElement amountAdded = $("[data-test-id=\"amount\"] input");
    private SelenideElement cardAdded = $("[data-test-id=\"from\"] input");
    private SelenideElement transfer = $("[data-test-id=\"action-transfer\"]");

    public TransferPage() {balance.shouldBe(visible);
    }

    public DashboardPage transferFrom(int amount, DataHelper.Card card) {
        $(amountAdded).setValue(Integer.toString(amount));
        $(cardAdded).setValue(card.getNumber());
        $(transfer).click();
        return new DashboardPage();
    }
}
