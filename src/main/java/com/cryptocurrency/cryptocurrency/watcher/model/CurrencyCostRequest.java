package com.cryptocurrency.cryptocurrency.watcher.model;

import com.cryptocurrency.cryptocurrency.watcher.config.Config;
import org.springframework.web.client.RestTemplate;

public class CurrencyCostRequest extends CurrencyCost{

    public static String currencyCostRequest(CurrencyType symbol) {
        String idToSearch;
        if (Config.supportCurrency.contains(symbol)) {
            idToSearch = symbol.getCurrencyId();
        } else {
            throw new IllegalArgumentException("Currency not supported" + symbol);
        }
        String expectedPriceUrl = "https://api.coinlore.net/api/ticker/?id=" + idToSearch;
        RestTemplate restTemplate = new RestTemplate();
        String currencyCost = restTemplate.getForObject(expectedPriceUrl, String.class);
        currencyCost.replace(" ", "");
        String[] cur = currencyCost.split(",");
        String cost = cur[5].replace("\"", " ");
        return cost;
    }

}
