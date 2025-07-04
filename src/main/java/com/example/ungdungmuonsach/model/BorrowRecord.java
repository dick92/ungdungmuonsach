package com.example.ungdungmuonsach.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BorrowRecord {
    @Id
    private String borrowCode; // 5-digit code

    @ManyToOne
    private Book book;
}
