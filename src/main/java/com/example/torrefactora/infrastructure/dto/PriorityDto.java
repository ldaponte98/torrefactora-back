package com.example.torrefactora.infrastructure.dto;
import lombok.Data;
import lombok.Generated;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import java.io.Serializable;

@Data
public class PriorityDto implements Serializable {
    private static final long serialVersionUID = -7197505601750548865L;
    private int id;
    private String name;
}
