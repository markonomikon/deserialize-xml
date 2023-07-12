package ua.markonomikon.model.jaxb;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "metadata")
public class MetadataJaxb {
    @XmlElement(name = "from")
    public FromJaxb fromJaxb;
    @XmlElement(name = "to")
    public ToJaxb toJaxb;
}
