package threep.predictit.client;

import threep.predictit.model.Market;

import java.util.List;

public interface PredictIt {

    List<Market> getAllMarkets();

    Market getMarketById(String id);

}
