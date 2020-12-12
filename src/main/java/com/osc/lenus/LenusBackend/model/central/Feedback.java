package com.osc.lenus.LenusBackend.model.central;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Feedbacks")
@Data
public class Feedback {
    @Id
    private String id;
    private String hotelId;
    private String clientId;
    private String name;
    private String department; // Housekeeping, Restaurant, Hospitality
    private String text; //
    private int stars; // 1 2 3 4 5
}
