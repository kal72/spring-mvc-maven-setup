package com.kristiawan.springmvcsetup.controller;

/**
 * Created by kristiawan on 6/25/2017.
 */
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Base class of controller to provide general method and behaviour to other
 * controller, all controller on this project should extend this class
 *
 * @author krissadewo <dailycode.org>
 * @date Jun 25, 2013
 */
public class BaseController {

    protected Locale ID = new Locale("id");

    /**
     * Converting entity object to json value with specific format
     *
     * @param data
     * @param status
     * @return
     */
    protected Map<String, Object> convertModel(Object data, Object status) {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("data", data);
        model.put("status", status);
        return model;
    }

    protected Map<String, Object> convertModel(Object data, Object rows, Object status) {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("data", data);
        model.put("rows", rows);
        model.put("status", status);
        return model;
    }

    /**
     * @param data
     * @return
     */
    protected Map<String, Object> convertModel(Object data) {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("data", data);
        return model;
    }

    /**
     * Converting entity object to json value with specific format
     *
     * @param status
     * @return
     */
    protected Map<String, Object> convertModel(String status) {
        Map<String, Object> model = new HashMap();
        model.put("data", status);
        return model;
    }

}