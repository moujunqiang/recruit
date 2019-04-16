package com.admn.recruit.dao;

import com.admn.recruit.model.ResultEntity;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ResumeRepository {

    @POST("/resume/editResume/")
    Call<ResultEntity> editResume(@Query("userId") Integer userId, @Query("realName") String realName,
                                 @Query("sex") String sex, @Query("birthday") String birthday,
                                 @Query("userPhone") String userPhone, @Query("address") String address,
                                 @Query("marriage") String marriage, @Query("reserved1") String reserved1);

    @POST("/resume/getResumeByUserId")
    Call<ResultEntity> getResumeByUserId(@Query("userId") Integer userId);
}
