package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.Model.shoeModel;

import jakarta.transaction.Transactional;

public interface shoeRepo extends JpaRepository<shoeModel, Integer> {

@Query(value="select * from ShoeModel ",nativeQuery=true)
public List<shoeModel> getAllData();

@Query(value="select * from ShoeModel where shoestorenum=:id",nativeQuery=true)
public List<shoeModel> byshoenum (@Param("id")int id);

@Query(value="select * from ShoeModel where shoestorenum between :start and :end",nativeQuery=true)
public List<shoeModel> startEnd(@Param("start") int start,@Param("end")int end);

@Modifying
@Transactional
@Query(value="delete from ShoeModel where shoestorenum=?1 and shoename=?2",nativeQuery = true)
Integer deleteD(@Param("id") int pid,@Param ("name") String pname);

@Modifying
@Transactional
@Query(value="update ShoeModel set shoestorenum=:pid where shoename=:pname",nativeQuery=true)
public void updateByQuery(@Param ("pid")int pid,@Param ("pname")String pname);

}