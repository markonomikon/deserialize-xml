package ua.markonomikon.service;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import ua.markonomikon.model.jackson.Message;
import ua.markonomikon.model.jaxb.MessageJaxb;

import static ua.markonomikon.management.AppConstants.DESERIALIZE_MESSAGE_PATH;

@Path(DESERIALIZE_MESSAGE_PATH)
public class DeserializeMessageJaxbService {
    @POST
    @Path("/jaxb")
    @Consumes(MediaType.APPLICATION_XML)
    public void deserializeMessageJaxb(MessageJaxb messageJaxb) {
        System.out.println("Deserializing using 'JAXB': "
                + "\nObject: " + messageJaxb.object
                + "\nEntry id: " + messageJaxb.entryJaxb.get(0).id
                + "\n From:"
                + "\n  name: " + messageJaxb.entryJaxb.get(0).metadataJaxb.get(0).fromJaxb.name
                + "\n  surname: " + messageJaxb.entryJaxb.get(0).metadataJaxb.get(0).fromJaxb.surname
                + "\n  number: " + messageJaxb.entryJaxb.get(0).metadataJaxb.get(0).fromJaxb.number
                + "\n To: "
                + "\n  name: " + messageJaxb.entryJaxb.get(0).metadataJaxb.get(0).toJaxb.name
                + "\n  surname: " + messageJaxb.entryJaxb.get(0).metadataJaxb.get(0).toJaxb.surname
                + "\n  number: " + messageJaxb.entryJaxb.get(0).metadataJaxb.get(0).toJaxb.number);
    }
    @POST
    @Path("/jackson")
    @Consumes(MediaType.APPLICATION_XML)
    public void deserializeMessageJackson(String xmlPayload) throws Exception {
        XmlMapper xmlMapper = new XmlMapper();
        var message = xmlMapper.readValue(xmlPayload, Message.class);

        System.out.println("Deserializing using 'JACKSON': "
            + "\nObject: " + message.object
            + "\nEntry id: " + message.entry.get(0).id
            + "\n From:"
            + "\n  name: " + message.entry.get(0).metadata.get(0).from.name
            + "\n  surname: " + message.entry.get(0).metadata.get(0).from.surname
            + "\n  number: " + message.entry.get(0).metadata.get(0).from.number
            + "\n To: "
            + "\n  name: " + message.entry.get(0).metadata.get(0).to.name
            + "\n  surname: " + message.entry.get(0).metadata.get(0).to.surname
            + "\n  number: " + message.entry.get(0).metadata.get(0).to.number);
    }
}








/*
 * Created by markonomikon.
 */