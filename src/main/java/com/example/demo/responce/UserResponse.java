package com.example.demo.responce;


import com.example.demo.entity.UsersEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserResponse extends BaseResponce {
    public UserResponse(boolean success, String message, UsersEntity user){
        super(success,message);
        this.user = user;
    }
    public UserResponse(UsersEntity user){super(true,"User data");}
    private UsersEntity user;
}
