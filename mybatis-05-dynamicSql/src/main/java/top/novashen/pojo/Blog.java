package top.novashen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    private String  id;
    private String title;
    private String author;
    private Date createTime;//名字不一样，数据库中是create_time，可以开启命名转换
    //sql的date和java的不一样
    private int views;

}
