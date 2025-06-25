package com.example.ungdungmuonsach.repository;

import com.example.ungdungmuonsach.model.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBorrowRepository extends JpaRepository<BorrowRecord, String> {
}
