package com.example.torrefactora.infrastructure.dto;
import com.example.torrefactora.domain.entity.Priority;
import com.example.torrefactora.domain.entity.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Generated;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import java.io.Serializable;
import java.util.Date;

@Data
@Generated
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetTasksDto implements Serializable {
    private static final long serialVersionUID = -7197505601750548865L;
    private int id;
    private String name;
    private String description;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date beginDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endDate;
    private PriorityDto priority;
    private StatusDto Status;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdAt;
}
