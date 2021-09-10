package ru.netology.web.Data;

import lombok.Value;

public class DataHelper {
    private DataHelper() {
    }

    @Value
    public static class AuthInfo {
        String login;
        String password;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static AuthInfo getOtherAuthInfo(AuthInfo original) {
        return new AuthInfo("petya", "123qwerty");
    }

    @Value
    public static class VerificationCode {
        String code;
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }


    @Value
    public static class Card {
        String number;
        int balance;
    }

    public static Card getCard1() {
        return new Card("5559000000000001", 10000);
    }

    public static Card getCard2() {
        return new Card("5559000000000002", 10000);
    }
}
