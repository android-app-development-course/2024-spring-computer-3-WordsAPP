package com.example.wordsapp.tools.httpHelper.jsonParse;

import java.util.ArrayList;

public class WordList {
    private ArrayList<WordListData> datas;
    private String msg;
    private String code;

    public String getMsg() {
        return msg;
    }

    public String getCode() {
        return code;
    }

    public ArrayList<WordListData> getDatas() {
        return datas;
    }
}
