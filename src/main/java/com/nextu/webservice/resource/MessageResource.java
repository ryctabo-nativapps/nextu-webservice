/*
 * Copyright 2017 Gustavo Pacheco <ryctabo@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nextu.webservice.resource;

import com.nextu.webservice.model.Message;
import com.nextu.webservice.services.MessageService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Gustavo Pacheco <ryctabo@gmail.com>
 * @version 1.0
 */
@Path("messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageResource {

    private final MessageService service = new MessageService();

    @GET
    public List<Message> getAll() {
        return service.getAllMessages();
    }

    @GET
    @Path("{messageId}")
    public Message get(@PathParam("messageId") Long id) {
        return service.getMessage(id);
    }

    @POST
    public Message add(Message message) {
        return service.addNewMessage(message);
    }

    @PUT
    @Path("{messageId}")
    public Message update(@PathParam("messageId") Long id, Message message) {
        return service.updateMessage(id, message);
    }

    @DELETE
    @Path("{messageId}")
    public Message delete(@PathParam("messageId") Long id) {
        return service.removeMessage(id);
    }

}
