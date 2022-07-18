package com.cryptocurrency.cryptocurrency.watcher.model;

import java.util.HashMap;
import java.util.Map;

public class CurrencyCost {
    private String costBTC;
    private String costETH;
    private String costSOL;

    public CurrencyCost(String costBTC, String costETH, String costSOL) {
        this.costBTC = costBTC;
        this.costETH = costETH;
        this.costSOL = costSOL;
    }

    public CurrencyCost() {
    }

    public String getCostBTC() {
        return costBTC;
    }

    public void setCostBTC(String costBTC) {
        this.costBTC = costBTC;
    }

    public String getCostETH() {
        return costETH;
    }

    public void setCostETH(String costETH) {
        this.costETH = costETH;
    }

    public String getCostSOL() {
        return costSOL;
    }

    public void setCostSOL(String costSOL) {
        this.costSOL = costSOL;
    }
}
