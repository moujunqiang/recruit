package com.admn.recruit.index;

import com.admn.recruit.model.Resume;

import java.util.List;

public interface ResumeView {

    void showMsg(String msg);

    void showResumeList(List<Resume> resumeList);
}