package threep.predictit.client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import threep.predictit.model.Market;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URL;
import java.util.List;

public class PredictItSimpleUrlClient implements PredictIt {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

    @Override
    public List<Market> getAllMarkets() {
        try {
            URL url = new URL("https://www.predictit.org/api/marketdata/all");
            JsonNode markets = OBJECT_MAPPER.readTree(url).get("markets");
            return OBJECT_MAPPER.readValue(OBJECT_MAPPER.treeAsTokens(markets), OBJECT_MAPPER.getTypeFactory().constructType(new TypeReference<>() {}));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public Market getMarketById(String id) {
        try {
            URL url = new URL("https://www.predictit.org/api/marketdata/markets/" + id);
            return OBJECT_MAPPER.readValue(url, Market.class);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

}
