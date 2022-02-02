package threep.predictit.model;

public class Contract {

    private String id;
    private String dateEnd;
    private String image;
    private String name;
    private String shortName;
    private String status;
    private Double lastTradePrice;
    private Double bestBuyYesCost;
    private Double bestBuyNoCost;
    private Double bestSellYesCost;
    private Double bestSellNoCost;
    private Double lastClosePrice;
    private Integer displayOrder;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getLastTradePrice() {
        return lastTradePrice;
    }

    public void setLastTradePrice(Double lastTradePrice) {
        this.lastTradePrice = lastTradePrice;
    }

    public Double getBestBuyYesCost() {
        return bestBuyYesCost;
    }

    public void setBestBuyYesCost(Double bestBuyYesCost) {
        this.bestBuyYesCost = bestBuyYesCost;
    }

    public Double getBestBuyNoCost() {
        return bestBuyNoCost;
    }

    public void setBestBuyNoCost(Double bestBuyNoCost) {
        this.bestBuyNoCost = bestBuyNoCost;
    }

    public Double getBestSellYesCost() {
        return bestSellYesCost;
    }

    public void setBestSellYesCost(Double bestSellYesCost) {
        this.bestSellYesCost = bestSellYesCost;
    }

    public Double getBestSellNoCost() {
        return bestSellNoCost;
    }

    public void setBestSellNoCost(Double bestSellNoCost) {
        this.bestSellNoCost = bestSellNoCost;
    }

    public Double getLastClosePrice() {
        return lastClosePrice;
    }

    public void setLastClosePrice(Double lastClosePrice) {
        this.lastClosePrice = lastClosePrice;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contract contract = (Contract) o;

        if (id != null ? !id.equals(contract.id) : contract.id != null) return false;
        if (dateEnd != null ? !dateEnd.equals(contract.dateEnd) : contract.dateEnd != null) return false;
        if (image != null ? !image.equals(contract.image) : contract.image != null) return false;
        if (name != null ? !name.equals(contract.name) : contract.name != null) return false;
        if (shortName != null ? !shortName.equals(contract.shortName) : contract.shortName != null) return false;
        if (status != null ? !status.equals(contract.status) : contract.status != null) return false;
        if (lastTradePrice != null ? !lastTradePrice.equals(contract.lastTradePrice) : contract.lastTradePrice != null)
            return false;
        if (bestBuyYesCost != null ? !bestBuyYesCost.equals(contract.bestBuyYesCost) : contract.bestBuyYesCost != null)
            return false;
        if (bestBuyNoCost != null ? !bestBuyNoCost.equals(contract.bestBuyNoCost) : contract.bestBuyNoCost != null)
            return false;
        if (bestSellYesCost != null ? !bestSellYesCost.equals(contract.bestSellYesCost) : contract.bestSellYesCost != null)
            return false;
        if (bestSellNoCost != null ? !bestSellNoCost.equals(contract.bestSellNoCost) : contract.bestSellNoCost != null)
            return false;
        if (lastClosePrice != null ? !lastClosePrice.equals(contract.lastClosePrice) : contract.lastClosePrice != null)
            return false;
        return displayOrder != null ? displayOrder.equals(contract.displayOrder) : contract.displayOrder == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dateEnd != null ? dateEnd.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (lastTradePrice != null ? lastTradePrice.hashCode() : 0);
        result = 31 * result + (bestBuyYesCost != null ? bestBuyYesCost.hashCode() : 0);
        result = 31 * result + (bestBuyNoCost != null ? bestBuyNoCost.hashCode() : 0);
        result = 31 * result + (bestSellYesCost != null ? bestSellYesCost.hashCode() : 0);
        result = 31 * result + (bestSellNoCost != null ? bestSellNoCost.hashCode() : 0);
        result = 31 * result + (lastClosePrice != null ? lastClosePrice.hashCode() : 0);
        result = 31 * result + (displayOrder != null ? displayOrder.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id='" + id + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", status='" + status + '\'' +
                ", lastTradePrice=" + lastTradePrice +
                ", bestBuyYesCost=" + bestBuyYesCost +
                ", bestBuyNoCost=" + bestBuyNoCost +
                ", bestSellYesCost=" + bestSellYesCost +
                ", bestSellNoCost=" + bestSellNoCost +
                ", lastClosePrice=" + lastClosePrice +
                ", displayOrder=" + displayOrder +
                '}';
    }
}
