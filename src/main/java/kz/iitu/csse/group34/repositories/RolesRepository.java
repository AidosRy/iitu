package kz.iitu.csse.group34.repositories;

import kz.iitu.csse.group34.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RolesRepository extends JpaRepository<Roles, Long> {

    Optional<Roles> findById(Long id);

}
