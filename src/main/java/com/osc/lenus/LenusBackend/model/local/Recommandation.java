package com.osc.lenus.LenusBackend.model.local;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Recommendations")
@Data
public class Recommandation {
    @Id
    private String id;
    private String resCode;
    private String type;
    private String name;
    private String imgUrl;
    private String description;
}
