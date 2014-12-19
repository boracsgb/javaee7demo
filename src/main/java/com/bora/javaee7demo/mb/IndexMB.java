package com.bora.javaee7demo.mb;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


@Named(value = "indexMB")
@SessionScoped
public class IndexMB implements Serializable {

    
    public IndexMB() {
    }
    
}
