package com.example.vuquangdong.dao;



import com.example.vuquangdong.entity.PhoneEntity;
import com.example.vuquangdong.util.connectUtili;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhoneDao {
    Connection connection = connectUtili.getConnection();
    public List<PhoneEntity> getAllPhone(){
        List<PhoneEntity> list = new ArrayList<>();
        try{
            String sql = "SELECT * FROM `phone`";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                PhoneEntity e = new PhoneEntity();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setBrand(rs.getString("brand"));
                e.setPrice(rs.getString("price"));
                e.setDescription(rs.getString("description"));
                list.add(e);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    public String insertPhone(PhoneEntity e){
        String sql = "insert into `phone` (name,brand,price,description) values (?,?,?,?)";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,e.getName());
            ps.setString(2,e.getBrand());
            ps.setString(3,e.getPrice());
            ps.setString(4,e.getDescription());
            int suss = ps.executeUpdate();
            if(suss > 0){
                return "Success";
            }
        }catch (SQLException exception){
            exception.printStackTrace();
        }
        return "fail";
    }
}
