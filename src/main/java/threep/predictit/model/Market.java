package threep.predictit.model;

import java.util.List;

public class Market {

    private String id;
    private String name;
    private String shortName;
    private String image;
    private String url;
    private List<Contract> contracts;
    private String timeStamp;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Market market = (Market) o;

        if (id != null ? !id.equals(market.id) : market.id != null) return false;
        if (name != null ? !name.equals(market.name) : market.name != null) return false;
        if (shortName != null ? !shortName.equals(market.shortName) : market.shortName != null) return false;
        if (image != null ? !image.equals(market.image) : market.image != null) return false;
        if (url != null ? !url.equals(market.url) : market.url != null) return false;
        if (contracts != null ? !contracts.equals(market.contracts) : market.contracts != null) return false;
        if (timeStamp != null ? !timeStamp.equals(market.timeStamp) : market.timeStamp != null) return false;
        return status != null ? status.equals(market.status) : market.status == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (contracts != null ? contracts.hashCode() : 0);
        result = 31 * result + (timeStamp != null ? timeStamp.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Market{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", image='" + image + '\'' +
                ", url='" + url + '\'' +
                ", contracts=" + contracts +
                ", timeStamp='" + timeStamp + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
