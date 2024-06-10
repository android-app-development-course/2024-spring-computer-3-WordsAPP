package com.example.wordsapp.tools.httpHelper;

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
