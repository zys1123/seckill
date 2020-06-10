package com.zys.seckill.common.response;

import com.zys.seckill.common.enums.HttpStatus;
import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseEntity<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int status;
    private String desc = "操作成功!";
    private String fileUrl; /**文件路径*/
    /**is success*/
    private boolean success = true;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**data: { key1: value1, ... }*/
    private T data;

    public ResponseEntity() {
    }
    public ResponseEntity(boolean success) {
        this.success = success;
    }

    public ResponseEntity(T data) {
        this.data = data;
    }

    public ResponseEntity(int status) {
        this.status = status;
    }

    public ResponseEntity(T data, HttpStatus status) {
        this.data = data;
        this.status = status.getCode();
    }
    public ResponseEntity(boolean success, int statu) {
        this.success = success;
        this.status = statu;
    }
    public static ResponseEntity ofFailed() {
        return new ResponseEntity(false,-1);
    }

    public static ResponseEntity ofSuccess() {
        return new ResponseEntity(true);
    }

    public ResponseEntity success(boolean success) {
        this.setSuccess(success);
        return this;
    }

    public ResponseEntity data(T data) {
        this.setData(data);
        return this;
    }

    public ResponseEntity desc(String desc) {
        this.setDesc(desc);
        return this;
    }

    public ResponseEntity status(HttpStatus status) {
        this.setStatus(status.getCode());
        return this;
    }


    public ResponseEntity fileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    public ResponseEntity(T data, HttpStatus status, boolean success, String desc,String fileUrl) {
        this.data = data;
        this.status = status.getCode();
        this.success = success;
        this.desc = desc;
        this.fileUrl = fileUrl;
    }
    public ResponseEntity(HttpStatus status, boolean success, String desc) {
        this.status = status.getCode();
        this.success = success;
        this.desc = desc;
    }
    public ResponseEntity(Integer status, boolean success, String desc) {
        this.status = status;
        this.success = success;
        this.desc = desc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
