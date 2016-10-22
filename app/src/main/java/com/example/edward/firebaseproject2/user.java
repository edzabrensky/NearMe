package com.example.edward.firebaseproject2;

/**
 * Created by Edward on 8/19/2016.
 */
public class user {
    public String uid;
    public String email;
    public String relationshipStatus;
    public String gender;
    public String sexuality;
    public String name;
    public String picURL;
    public int numWinks;
    public user() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public user(String uid, String email, String relationshipStatus, String gender, String sexuality, String name) {
        this.uid = uid;
        this.email = email;
        this.relationshipStatus = relationshipStatus;
        this.gender = gender;
        this.sexuality = sexuality;
        this.name = name;
        numWinks = 0;
    }

}
