package com.iteso.test.beans;

public class ItemProduct {
    private int image;
    private String title;
    private String store;
    private String location;
    private String Phone;
    private String description;

    public ItemProduct(){

    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getStore() {
        return store;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return Phone;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return "ItemProduct{image="+this.image+",title='"+this.getTitle()+"', store='"+this.store+"', location='"+this.location+
                "', phone='"+this.Phone+"', description='"+this.description+"'}";
    }

}
