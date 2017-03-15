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
package com.nextu.webservice.database;

import com.nextu.webservice.model.Message;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Pacheco <ryctabo@gmail.com>
 * @version 1.0
 */
public class DatabaseClass {

    private static final Map<Long, Message> MESSAGES = new HashMap<>();

    public static Map<Long, Message> getMessages() {
        return MESSAGES;
    }

}
