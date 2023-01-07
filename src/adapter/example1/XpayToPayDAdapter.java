package adapter.example1;

public class XpayToPayDAdapter implements PayD{

    private String CustCardNo;
    private String CardOwnerName;
    private String CardExpMonthDate;
    public Integer cVVNo;
    public Double totalAmount;

    private final Xpay xpay;

    public XpayToPayDAdapter(Xpay xpay){
        this.xpay = xpay;
        setProp();
    }


    @Override
    public String getCustCardNo() {
        return CustCardNo;
    }

    @Override
    public String getCardOwnerName() {
        return CardOwnerName;
    }

    @Override
    public String getCardExpMonthDate() {
        return CardExpMonthDate;
    }

    @Override
    public Integer getCVVNo() {
        return cVVNo;
    }

    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        this.CustCardNo = CustCardNo;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.CardOwnerName = CardOwnerName;
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.CardExpMonthDate = CardExpMonthDate;
    }

    @Override
    public void setCvvNo(Integer cVVNo) {
        this.cVVNo = cVVNo;
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private void setProp(){
        setCardOwnerName(this.xpay.getCustomerName());
        setCustCardNo(this.xpay.getCreditCardNo());
        setCardExpMonthDate(this.xpay.getCardExpMonth()+"/"+this.xpay.
                getCardExpYear());
        setCvvNo(this.xpay.getCardCVVNo().intValue());
        setTotalAmount(this.xpay.getAmount());
    }
}
