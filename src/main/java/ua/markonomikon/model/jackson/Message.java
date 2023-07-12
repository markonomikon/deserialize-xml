package ua.markonomikon.model.jackson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

public class Message {
    @JacksonXmlElementWrapper(useWrapping = false)
    public String object;
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<Entry> entry;
}








/*
 * Created by markonomikon.
 */