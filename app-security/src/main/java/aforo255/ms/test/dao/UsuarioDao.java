package aforo255.ms.test.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import aforo255.ms.test.entity.Usuario;





public interface UsuarioDao  extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername (@Param ("nombre") String Username);
}
