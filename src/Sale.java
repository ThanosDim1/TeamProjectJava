public class Sale extends Person{
    private int code;
    private String model;
    private String date;
    private int cost;

    public Sale(int code,String model,String date,int cost,String name,String surname,String phonenumber){
        super(name,surname,phonenumber);
        this.code=code;
        this.model=model;
        this.date=date;
        this.cost=cost;
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
    public void setDate(String date){
        this.date=date;
    }
    public String getDate(){
        return date;
    }
    public void setCost(int cost){
        this.cost=cost;
    }
    public int getCost(){
        return cost;
    }
}
