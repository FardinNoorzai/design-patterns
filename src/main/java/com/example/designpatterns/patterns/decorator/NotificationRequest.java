package com.example.designpatterns.patterns.decorator;

import java.util.Map;

public class NotificationRequest {


    String channel;
    String to;
    Map<String, Object> data;
    String requestId;

    public NotificationRequest(String channel, String to, Map<String, Object> data, String requestId) {
        this.channel = channel;
        this.to = to;
        this.data = data;
        this.requestId = requestId;
    }

    public NotificationRequest() {
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
