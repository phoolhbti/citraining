package com.citraining.tag;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import tldgen.Tag;
import tldgen.TagAttribute;


@Tag
public class HelloTag extends SimpleTagSupport{
    private String name;

    @TagAttribute(required=true)
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().print("Hello, "+name+"!");
    }
    
}
