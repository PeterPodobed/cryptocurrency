package com.cryptocurrency.cryptocurrency.watcher;

import com.cryptocurrency.cryptocurrency.watcher.model.CurrencyAllResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CryptocurrencyWatcherApplicationTests {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void getSupportedCurrenciesWorks() {
        restTemplate = new TestRestTemplate();
        ResponseEntity<CurrencyAllResponse> responseEntity = restTemplate.
                getForEntity("http://localhost:" + port + "/currency/all", CurrencyAllResponse.class);

        Assertions.assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
    }

}
