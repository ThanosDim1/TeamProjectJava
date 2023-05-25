public class Order extends Person  {
    private int code;
    private String model;
    private String orderdate;
    private String dateofarrival;

    public Order(int code,String model,String orderdate,String dateofarrival,String name,String surname,String phonenumber){
        super(name,surname,phonenumber);
        this.code=code;
        this.model=model;
        this.orderdate=orderdate;
        this.dateofarrival=dateofarrival;
    }
    public void setCode(int code){
        this.code=code;
    }
    public int getCode(){
        return code;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setOrderdate(String orderdate){
        this.orderdate=orderdate;
    }
    public String getOrderdate(){
        return orderdate;
    }
    public void setDateofarrival(String dateofarrival){
        this.dateofarrival=dateofarrival;
    }
    public String getDateofarrival(){
        return dateofarrival;
    }


}
