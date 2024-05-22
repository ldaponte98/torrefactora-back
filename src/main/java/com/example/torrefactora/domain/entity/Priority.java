package com.example.torrefactora.domain.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Builder;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "priority")
@Builder
/**
 * Entity Priority
 * Representation of assignable priorities in an activity
 * @author Luis Aponte
 * @version 0.1, 2024/05/22
 */
public class Priority implements Serializable {
    /**
     * serialVersionUID
     * Serial for the serialization.
     */
    private static final long serialVersionUID = 1L;
    /**
     * id
     * I'd autoincrement of the entity.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    /**
     * name
     * Column name of the entity.
     */
    @Column(name="name")
    private String name;
    /**
     * description
     * Column description of the entity.
     */
    @Column(name="description")
    private String description;
    /**
     * createdAt
     * Column created_at of the entity for know created at.
     */
    @Column(name="created_at")
    private Date createdAt;
}
