package dao;

import dto.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import utils.DruidUtils;

import java.sql.SQLException;

/**
 * 描述：
 * 作者：小陶不慌张
 * 文件：UserDAO
 * 日期：2023/6/7 20:26
 */

public class UserDAO {
    /**根据管理员登录名查询管理员信息
     */
    public User selectUserByUserName(String userName){
        User user = null;
        try{
            String sql="select user_id userId,user_name userName, user_rname userRName,user_pwd userPwd,user_gender userGender,user_tel userTel,user_desc userDesc form user where user_name=?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            user = queryRunner.query(sql,new BeanHandler<User>(User.class));
        }catch(SQLException e){
            e.printStackTrace();
        }
        return user;
    }
}
