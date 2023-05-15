package PhamVanThanh.hutech.BT_CRUD_3a_PhamVanThanh.repository;

import PhamVanThanh.hutech.BT_CRUD_3a_PhamVanThanh.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}