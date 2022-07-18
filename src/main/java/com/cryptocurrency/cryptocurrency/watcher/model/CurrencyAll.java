package com.cryptocurrency.cryptocurrency.watcher.model;

public class CurrencyAll {
    private String id;
    private String symbol;

    public CurrencyAll(String id, String symbol) {
        this.id = id;
        this.symbol = symbol;
    }

    public CurrencyAll() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
