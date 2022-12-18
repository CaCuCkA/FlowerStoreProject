package flower.store.items;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.concurrent.Flow;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {

}
