package com.zys.seckill.common.enums;

public enum HttpStatus {
    CONTINUE(100, "Continue");
    private int code;
    private String reasonPhrase;

    HttpStatus(int code, String reasonPhrase) {
        this.code = code;
        this.reasonPhrase = reasonPhrase;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }

    public int getCode() {
        return code;
    }
    public boolean equals(String input) {
        return code == Integer.parseInt(input);
    }
}
