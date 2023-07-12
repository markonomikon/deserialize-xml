package ua.markonomikon.model.jaxb;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "message")
public class MessageJaxb {
    @XmlElement(name = "object")
    public String object;
    @XmlElement(name = "entry")
    public List<EntryJaxb> entryJaxb;
}
