package ua.markonomikon.service;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import ua.markonomikon.model.jaxb.MessageJaxb;

import static ua.markonomikon.management.AppConstants.DESERIALIZE_MESSAGE_PATH;

@Path(DESERIALIZE_MESSAGE_PATH)
public class DeserializeMessageJaxbService {
    @POST
    @Path("/deserialize")
    @Consumes(MediaType.APPLICATION_XML)
    public void deserializeMessage(MessageJaxb messageJaxb) {
        System.out.println("Deserialized Message object:");
        System.out.println("Object: " + messageJaxb.object);
        System.out.println("Entry ID: " + messageJaxb.entryJaxb.get(0).id);
        System.out.println("From Number: " + messageJaxb.entryJaxb.get(0).metadata.get(0).fromJaxb.number);
        System.out.println("To Name: " + messageJaxb.entryJaxb.get(0).metadata.get(0).toJaxb.name);
    }
}
