package com.cryptocurrency.cryptocurrency.watcher.model;

import java.util.ArrayList;
import java.util.List;

public class CurrencyAllResponse {
    private List<CurrencyAll> all = new ArrayList<>();

    public CurrencyAllResponse(List<CurrencyAll> all) {
        this.all = all;
    }

    public CurrencyAllResponse() {
    }

    public List<CurrencyAll> getAll() {
        return all;
    }

    public void setAll(List<CurrencyAll> all) {
        this.all = all;
    }
}
