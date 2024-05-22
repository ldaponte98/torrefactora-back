package com.example.torrefactora.domain.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

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
@Table(name = "task")
@Builder
/**
 * Entity Task
 * Representation of an activity
 * @author Luis Aponte
 * @version 0.1, 2024/05/22
 */
public class Task implements Serializable {
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
     * beginDate
     * Column begin_date of the entity.
     */
    @Column(name="begin_date")
    private Date beginDate;
    /**
     * endDate
     * Column end_date of the entity.
     */
    @Column(name="end_date")
    private Date endDate;

    /**
     * status
     * Column status_id of the entity relationship with Status Entity.
     */
    @OneToOne
    @JoinColumn(name = "status", insertable = true, updatable = true)
    private Status status;
    /**
     * priority
     * Column priority_id of the entity relationship with Priority Entity.
     */
    @OneToOne
    @JoinColumn(name = "priority_id", insertable = true, updatable = true)
    private Priority priority;
    /**
     * createdAt
     * Column created_at of the entity for know created at.
     */
    @Column(name="created_at")
    private Date createdAt;
}
