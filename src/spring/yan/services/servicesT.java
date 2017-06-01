package spring.yan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import spring.yan.beans.beansT;

/**
 * Created by Administrator on 2017/5/31 0031.
 */
public class servicesT<T> {


    @Autowired
    public beansT<T> beansT ;
    @Autowired
    public JdbcTemplate jdbcTemp;

    public void select(){
        String sql="SELECT price FROM Company WHERE name = ? ";
        String chengyanfeng = jdbcTemp.queryForObject(sql, String.class, "param32423");
        System.out.print(chengyanfeng);
    }
    public void update(){
        String sql="update  Company set price=? WHERE name = ? ";
        jdbcTemp.update(sql, "10000", "chengyanfeng");
    }
    public void updatetow(){
        String sql="update  Company set price=? WHERE name = ? ";
        jdbcTemp.update(sql, "100", "chengyanfeng");
    }
    @Transactional
    public  void transactionManager(){
        updatetow();
        String sql="update farfe Company set price=? WHERE name = ? ";
        jdbcTemp.update(sql, "ggs", "ngyanfeng");

    }
}
