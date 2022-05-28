package springboot.app.repository;

import springboot.app.model.Organization;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
