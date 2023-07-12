package ua.markonomikon.model.jaxb;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "to")
public class ToJaxb {
    @XmlElement(name = "number")
    public String number;
    @XmlElement(name = "name")
    public String name;
    @XmlElement(name = "surname")
    public String surname;
}
