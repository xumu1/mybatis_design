package com.xumu.mybatis.cfg;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义mybatis配置类
 */

@Data
@AllArgsConstructor
public class Configuration {

    private String driver;
    private String url;
    private String username;
    private String password;

    private Map<String,Mapper> mappers;

    public Configuration() {
        this.mappers = new HashMap<String, Mapper>();
    }

    //此处需要追加的模式
    public void setMappers(Map<String,Mapper> mappers){
        this.mappers.putAll(mappers);
    }

}
