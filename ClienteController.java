package com.seuprojeto.mvcclienteboot.controller;
 
import com.seuprojeto.mvcclienteboot.model.Cliente;
import com.seuprojeto.mvcclienteboot.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
@RequestMapping("/clientes")
public class ClienteController {
 
    @Autowired // Injeca o Repository (acesso ao Model/Dados)
    private ClienteRepository clienteRepository;
 
    // Rota GET para exibir o formulário de cadastro
    @GetMapping("/novo")
    public String exibirFormularioCadastro(Model model) {
        model.addAttribute("cliente", new Cliente()); // Nome do atributo HTML (View)
        return "clientes-form";
    }
 
    // Rota POST para salvar o Cliente
    @PostMapping
    public String adicionarCliente(Cliente cliente) {
        // Controller salva os dados no Model
        clienteRepository.save(cliente);
 
        // Redireciona para a listagem (chama o GET /clientes)
        return "redirect:/clientes";
    }
 
    // Rota GET para listar todas as Clientes
    @GetMapping
    public String listarClientes(Model model) {
        // Controller busca a lista de dados no Model
        Iterable<Cliente> clientes = clienteRepository.findAll();
 
        // Anexa os dados no objeto Model para a View
        model.addAttribute("clientes", clientes);
 
        // Retorna o nome da View (clientes.html)
        return "clientes";
    }
}
