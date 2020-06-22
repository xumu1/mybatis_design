package com.xumu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{

    private Integer id;
    private String username;
    private String sex;

}
