package dto;

/**
 * 描述：
 * 作者：小陶不慌张
 * 文件：rent_buy
 * 日期：2023/6/7 20:24
 */

public class rent_buy {
    private int clientId;
    private String clientRent;
    private String clientBuy;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientRent() {
        return clientRent;
    }

    public void setClientRent(String clientRent) {
        this.clientRent = clientRent;
    }

    public String getClientBuy() {
        return clientBuy;
    }

    public void setClientBuy(String clientBuy) {
        this.clientBuy = clientBuy;
    }
}
