package com.kristiawan.springmvcsetup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by kristiawan on 6/25/2017.
 */
public class App {

    public static Logger getLogger(Object o) {
        return LoggerFactory.getLogger(o.getClass());
    }
}
