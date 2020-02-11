package com.example.artificialsoft;

public class ArtificalJsonTest
{
    //variables for all the data
    private String imageURL;
    private int imageID;
    private String operatorName;
    private String id;
    private String user;
    private String name;
    private String designation;
    private String balance;

    public ArtificalJsonTest(int imageID, String operatorName, String balance)
    {
        this.imageID = imageID;
        this.operatorName = operatorName;
        this.balance = balance;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
/*//constructor
    public ArtificalJsonTest(String imageURL, String id, String user, String name, String designation)
    {
        this.imageURL = imageURL;
        this.id = id;
        this.user = user;
        this.name = name;
        this.designation = designation;
    }*/

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public ArtificalJsonTest(int imageID, String operatorName)
    {
        this.imageID = imageID;
        this.operatorName = operatorName;
    }

    //getter
    public String getImageURL() {
        return imageURL;
    }

    public String getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
