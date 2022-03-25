package models;

public class Inventary {
    private String date;
    private String code;
    private String firstTime;
    private String name;
    private String description;
    private String artName;
    private int artCount;
    private boolean condition;
    private String endTime;

    public Inventary(){};
    public Inventary(String date,String code,String firstTime,String name ,String description,String artName, int artCount,boolean condition, String endTime ){
        this.date=date;
        this.code=code;
        this.firstTime=firstTime;
        this.name=name;
        this.description=description;
        this.artName=artName;
        this.artCount=artCount;
        this.condition=condition;
        this.endTime=endTime;
    }
    public String getDate(){
        return this.date;
    }
    public String getCode(){
        return this.code;
    }
    public String getFirstTime(){
        return this.firstTime;
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public String getArtName(){
        return this.artName;
    }
    public int getArtCount(){
        return this.getArtCount();
    }
    public boolean getCondition(){
        return this.condition;
    }
    public String getEndTime(){
        return this.endTime;
    }
    //------------------------------------------------------------------------------------//
    public void setDate(String date){
        this.date=date;
    }
    public void setCode(String code){
        this.code=code;
    }
    public void setFirstTime(String firstTime){
        this.firstTime=firstTime;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setArtName(String artName){
        this.artName=artName;
    }
    public void setArtCount(int artCount){
        this.artCount=artCount;
    }
    public void setCondition(boolean condition){
        this.condition=condition;
    }
    public void setEndTime(String endTime){
        this.endTime=endTime;
    }
    //--------------------------------------------------------------------------------------//
    public String toString(){
        return "Fecha: "+this.date+" Codigo: "+this.code+" Hora de inicio: "+this.firstTime+" Nombre: "+this.name+" Descripcion: "+this.description
                +" Nombre articulo: "+this.artName+" Cantidad Articulos: "+this.artCount+" Estado: "+this.condition+" Hora termino: "+this.endTime;
    }

}
