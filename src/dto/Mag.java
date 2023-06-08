package dto;

/**
 * 描述：
 * 作者：小陶不慌张
 * 文件：Mags
 * 日期：2023/6/7 20:19
 */

public class Mag {
    private int magId;
    private String magName;
    private String magAuthor;
    private String magPrice;
    private String magStock;
    private String magType;
    private String magPublisher;
    private String magDesc;

    public int getMagId() {
        return magId;
    }

    public void setMagId(int magId) {
        this.magId = magId;
    }

    public String getMagName() {
        return magName;
    }

    public void setMagName(String magName) {
        this.magName = magName;
    }

    public String getMagAuthor() {
        return magAuthor;
    }

    public void setMagAuthor(String magAuthor) {
        this.magAuthor = magAuthor;
    }

    public String getMagPrice() {
        return magPrice;
    }

    public void setMagPrice(String magPrice) {
        this.magPrice = magPrice;
    }

    public String getMagStock() {
        return magStock;
    }

    public void setMagStock(String magStock) {
        this.magStock = magStock;
    }

    public String getMagType() {
        return magType;
    }

    public void setMagType(String magType) {
        this.magType = magType;
    }

    public String getMagPublisher() {
        return magPublisher;
    }

    public void setMagPublisher(String magPublisher) {
        this.magPublisher = magPublisher;
    }

    public String getMagDesc() {
        return magDesc;
    }

    public void setMagDesc(String magDesc) {
        this.magDesc = magDesc;
    }
}
