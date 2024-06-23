package ma.dalal.projetangular.repositories;

import ma.dalal.projetangular.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String > {

}
