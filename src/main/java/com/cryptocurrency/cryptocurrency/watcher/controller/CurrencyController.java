package com.cryptocurrency.cryptocurrency.watcher.controller;

import com.cryptocurrency.cryptocurrency.watcher.config.Config;
import com.cryptocurrency.cryptocurrency.watcher.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CurrencyController {

    @GetMapping("/currency/all")
    public CurrencyAllResponse getSupportedCurrencies() {
        ArrayList<CurrencyAll> currencyList = new ArrayList<>();
        Config.supportCurrency.forEach(currencyType -> {
                    currencyList.add(
                            new CurrencyAll(currencyType.getCurrencyId(), currencyType.name())
                    );
                }
        );
        return new CurrencyAllResponse(currencyList);
    }

    @GetMapping("/currency/cost/{symbol}")
    public String getCurrencyCost(@PathVariable(value = "symbol") CurrencyType symbol) {
        String cost = CurrencyCostRequest.currencyCostRequest(symbol);
        return cost;
    }

}
