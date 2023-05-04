package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.Model.shoeModel;

import jakarta.transaction.Transactional;

public interface shoeRepo extends JpaRepository<shoeModel, Integer> {

@Query(value="select * from shoe_model ",nativeQuery=true)
public List<shoeModel> getAllData();

@Query(value="select * from shoe_model where shoestorenum=:id",nativeQuery=true)
public List<shoeModel> byshoenum (@Param("id")int id);

@Query(value="select * from shoe_model where shoestorenum between :start and :end",nativeQuery=true)
public List<shoeModel> startEnd(@Param("start") int start,@Param("end")int end);

@Modifying
@Transactional
@Query(value="delete from shoe_model where shoestorenum=?1 and shoename=?2",nativeQuery = true)
Integer deleteD(@Param("id") int pid,@Param ("name") String pname);

@Modifying
@Transactional
@Query(value="update shoe_model set shoestorenum=:pid where shoename=:pname",nativeQuery=true)
public void updateByQuery(@Param ("pid")int pid,@Param ("pname")String pname);

@Query(value="select c from shoeModel c")
List<shoeModel> jpqlQ();

@Query(value="select c from shoeModel c where c.shoestorenum=?1")
public List<shoeModel> jqBYCon(@Param ("id")int sid);
}