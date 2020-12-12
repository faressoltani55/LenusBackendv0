package com.osc.lenus.LenusBackend.model.central;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Responses")
@Data
public class Response {
    @Id
    private String id;
    private String clientId;
    private String key; // view, evenement
    private int[] answers = new int[4]; // 0100
}