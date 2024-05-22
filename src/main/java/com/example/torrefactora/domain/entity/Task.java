package com.example.torrefactora.domain.entity;
import javax.persistence.*;

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
public class Task implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="begin_date")
    private Date beginDate;
    @Column(name="end_date")
    private Date endDate;
    @OneToOne
    @JoinColumn(name = "status_id", insertable = true, updatable = true)
    private Status status;
    @OneToOne
    @JoinColumn(name = "priority_id", insertable = true, updatable = true)
    private Priority priority;
    @Column(name="created_at")
    private Date createdAt;
}
