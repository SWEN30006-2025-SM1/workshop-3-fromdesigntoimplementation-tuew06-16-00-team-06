package com.unimelb.swen30006.workshops;

import java.util.Date;

// Sample private file class to be replaced by your implementaiton
class File {

    private Date createDate;
    private String fileName;
    private String fileData;

    public String fileType(){
        double num = Math.random();
        if(num<0.5){
            return "pdf";
        } else {
            return "docx";
        }
    }
}