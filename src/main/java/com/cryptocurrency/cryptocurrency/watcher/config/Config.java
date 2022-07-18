package com.cryptocurrency.cryptocurrency.watcher.config;

import com.cryptocurrency.cryptocurrency.watcher.model.CurrencyType;

import java.util.Set;

public class Config {
    public static final Set<CurrencyType> supportCurrency = Set.of(CurrencyType.BTC, CurrencyType.ETH, CurrencyType.SOL);
}