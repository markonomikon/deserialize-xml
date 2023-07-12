package ua.markonomikon.model.jackson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;
import java.util.List;

public class Entry {
    public String id;
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<Metadata> metadata = new ArrayList<>();
}








/*
 * Created by markonomikon.
 */