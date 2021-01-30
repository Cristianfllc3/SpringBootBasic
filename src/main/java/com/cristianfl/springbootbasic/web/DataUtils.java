package com.cristianfl.springbootbasic.web;

import org.springframework.jdbc.datasource.lookup.SingleDataSourceLookup;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-mm-dd");

    public static Date createDateFromDateString(String dataString)
    {
        Date date = null;
        if(null!=dataString){
            try{
                date = DATE_FORMAT.parse(dataString);
            }catch (ParseException pe){
                date = new Date();
            }
        }
        else{
            date = new Date();
        }
        return date;
    }
}
