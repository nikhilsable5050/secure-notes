package com.nikhilsable.notesapi.repositories;

import com.nikhilsable.notesapi.models.AppRole;
import com.nikhilsable.notesapi.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}
