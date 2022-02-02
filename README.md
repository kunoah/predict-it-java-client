# PredictIt Java Client
This is a simple Java client for the [PredictIt public API](https://predictit.freshdesk.com/support/solutions/articles/12000001878-does-predictit-make-market-data-available-via-an-api-).

## Sample Usage
```java
PredictIt predictIt = new PredictItSimpleUrlClient();

Market market = predictIt.getMarketById("2721");

List<Market> allMarkets = predictIt.getAllMarkets();
``` 