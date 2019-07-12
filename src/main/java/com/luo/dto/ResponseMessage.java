package com.luo.dto;

/**
 * @author ljn
 * @date 2019/7/12.
 */
public class ResponseMessage {

    private String responseMessage;

    public ResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public ResponseMessage() {
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
