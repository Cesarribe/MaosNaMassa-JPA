import br.com.csribeiro.dao.IProdutoDao;
import br.com.csribeiro.dao.ProdutoDao;
import br.com.csribeiro.domain.Produto;
import org.junit.After;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {


        private IProdutoDao produtoDao;



        public ProdutoTest() {
            produtoDao = new ProdutoDao(); {
            }
        }

        @After
        public void end() {
            List<Produto> list = produtoDao.buscarTodos();
            list.forEach(prod -> produtoDao.excluir(prod));

        }

        @Test
        public void cadastrar() {

            Produto prod = new Produto();
           prod.setNome("Aveia");
           prod.setDescricao("Flocos finos");
            prod = produtoDao.cadastrar(prod);

            assertNotNull(prod);
            assertNotNull(prod.getId());
        }

    }
