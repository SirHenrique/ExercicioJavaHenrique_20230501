import java.util.Optional;

public interface Repositorio extends JpaRepository<Produto, Long> {

	Optional<Produto> findById(Long id);

	Produto save(Produto produto);

	void delete(Produto p);

	

}
