package com.cryptocurrency.cryptocurrency.watcher.model;

public enum CurrencyType {

    BTC("90"),
    ETH("80"),
    SOL("48543");

    private String currencyId;

    public String getCurrencyId() {
        return this.currencyId;
    }

    CurrencyType(String id) {
        this.currencyId = id;
    }
}
