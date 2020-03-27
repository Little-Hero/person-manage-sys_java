package com.example.jpa.repository;

        import com.example.jpa.entity.Users;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;

        import java.util.List;

public interface UsersDAO extends JpaRepository<Users,Integer> {
        @Query(value = "select * from users where id = ?1",nativeQuery = true)
        Users findByUserId(Integer id);

        List<Users> findByDepartment(String department);


//        @Modifying
//        @Transactional
//        @Query(value = "update users set name=?1 where id=?2 ", nativeQuery = true)
//        int updateUsers(String name,Integer id);
}
