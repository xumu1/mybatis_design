package com.xumu.mybatis.cfg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xumu
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mapper {

    /**
     * SQL语句
     */
    private String queryString;
    /**
     * 实体类全限定类名
     */
    private String resultType;
}
