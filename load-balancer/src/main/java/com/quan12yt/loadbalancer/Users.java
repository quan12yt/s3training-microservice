package com.quan12yt.loadbalancer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users implements Serializable {

    private String userId;
    private String email;

}
