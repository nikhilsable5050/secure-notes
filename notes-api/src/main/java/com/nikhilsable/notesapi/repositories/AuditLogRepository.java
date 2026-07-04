package com.nikhilsable.notesapi.repositories;

import com.nikhilsable.notesapi.models.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
}
