package com.android.sheshield.model;

@SuppressWarnings("unused")
public class NotificationSenderModel {

    public NotificationDataModel data;
    public String to;

    public NotificationSenderModel(NotificationDataModel data, String to) {
        this.data = data;
        this.to = to;
    }
}
