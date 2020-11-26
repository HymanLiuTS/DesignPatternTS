package cn.codenest.静态代理.po;

import lombok.Data;

/**
 * @author ：Hyman
 * @date ：Created in 2020/11/26 19:07
 * @description：通过代理模式进行分库分表
 * @modified By：
 * @version: $
 */
@Data
public class Order {
    private Object orderInfo;
    private Long createTime;
    private String id;

}
