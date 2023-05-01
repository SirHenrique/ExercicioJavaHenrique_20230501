import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javassist.NotFoundException;



@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired private Repositorio produtoRepository;
    @GetMapping("/{id}")
    public Produto getProduto(@PathVariable Long id) throws NotFoundException {
    	return produtoRepository.findById(id).orElseThrow(() -> new NotFoundException("Produto não encontrado"));
    }
    
    
    @PostMapping
    public Produto createProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
    
    @PutMapping("/{id}")
    public Produto updateProduto(@PathVariable Long id, @RequestBody Produto produto) throws NotFoundException {
        Produto p = produtoRepository.findById(id).orElseThrow(() -> new NotFoundException("Produto não encontrado"));
        p.setDescricao(produto.getDescricao());
        p.setMarca(produto.getMarca());
        p.setDepartamento(produto.getDepartamento());
        return produtoRepository.save(p);
    }
    
    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable Long id) throws NotFoundException {
        Produto p = produtoRepository.findById(id).orElseThrow(() -> new NotFoundException("Produto não encontrado"));
        produtoRepository.delete(p);
    }
}

