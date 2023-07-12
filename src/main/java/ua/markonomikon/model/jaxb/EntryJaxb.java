package ua.markonomikon.model.jaxb;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "entry")
public class EntryJaxb {
    @XmlElement(name = "id")
    public String id;
    @XmlElement(name = "metadata")
    public List<MetadataJaxb> metadataJaxb;
}








/*
 * Created by markonomikon.
 */