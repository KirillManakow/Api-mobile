package com.example.api;

public class Model {

    private String Users;
    private String Nazvanie;
    private String Zena;
    private String Image;

    public  Model(String Image,String Nazvanie,String Zena,String Users){

        this.Image=Image;
        this.Nazvanie=Nazvanie;
        this.Zena=Zena;
        this.Users=Users;
    }

    public void setImage(String Image)
    {
        this.Image=Image;
    }
    public void setNazvanie(String Nazvanie ){this.Nazvanie=Nazvanie;}
    public void setZena (String Zena)
    {
        this.Zena=Zena;
    }
    public void setUsers (String Users)
    {
        this.Users=Users;
    }
    public String getImage()
    {
        return Image;
    }
    public String getNazvanie()
    {
        return Nazvanie;
    }
    public String getZena()
    {
        return Zena;
    }
    public String getUsers()
    {
        return Users;
    }
}
