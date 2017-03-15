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
package com.nextu.webservice.services;

import com.nextu.webservice.database.DatabaseClass;
import com.nextu.webservice.model.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Gustavo Pacheco <ryctabo@gmail.com>
 * @version 1.0
 */
public class MessageService {

    private final Map<Long, Message> messages = DatabaseClass.getMessages();

    public MessageService() {
        this.messages.put(1L, new Message(1L, "ryctabo", "nextu", "Hi, NextU!"));
        this.messages.put(2L, new Message(2L, "nextu", "ryctabo", "Hi, how are you?"));
        this.messages.put(3L, new Message(3L, "ryctabo", "nextu", "Fine! and you?"));
        this.messages.put(4L, new Message(4L, "nextu", "ryctabo", "Very good :)"));
    }

    public List<Message> getAllMessages() {
        return new ArrayList<>(this.messages.values());
    }

    public Message getMessage(Long id) {
        if (isInvalidID(id))
            return null;
        return this.messages.get(id);
    }

    private boolean isInvalidID(Long id) {
        return id != null || id <= 0 || id > this.messages.size() + 1;
    }

    public Message addNewMessage(Message message) {
        message.setId(this.messages.size() + 1);
        return this.messages.put(message.getId(), message);
    }

    public Message updateMessage(Long id, Message message) {
        if (isInvalidID(id))
            return null;
        return this.messages.put(id, message);
    }

    public Message removeMessage(Long id) {
        if (isInvalidID(id))
            return null;
        return this.messages.remove(id);
    }

}
