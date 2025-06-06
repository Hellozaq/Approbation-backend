package tn.esprit.pfe.approbation.token;


import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.pfe.approbation.entities.User;

public interface TokenRepository extends JpaRepository<Token, Integer> {

    @Query(value = """

            select t from Token t inner join user u\s
      on t.user.id = u.id\s
      where u.id = :id and (t.expired = false or t.revoked = false)\s
      """)
    List<Token> findAllValidTokenByUser(Integer id);

    Optional<Token> findByToken(String token);

    void deleteByUserId(Integer userId);
}