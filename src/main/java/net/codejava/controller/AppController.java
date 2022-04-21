package net.codejava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.model.Pessoas;
import net.codejava.service.PessoaService;

//A camada Controller (controlador) lida com as requisições dos usuários. 
//É responsável por retornar uma resposta com a ajuda das camadas Model e View.

@Controller
public class AppController {

	@Autowired
	private PessoaService service; 
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Pessoas> listPessoas = service.pesquisar();
		model.addAttribute("listPessoas", listPessoas);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		Pessoas pessoas = new Pessoas();
		model.addAttribute("pessoa", pessoas);
		
		return "new_pessoa";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String savePessoa(@ModelAttribute("pessoa") Pessoas pessoas) {
		service.incluir(pessoas);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_pessoa");
		Pessoas pessoas = service.obter(id);
		mav.addObject("pessoa", pessoas);
		
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deletePessoa(@PathVariable(name = "id") int id) {
		service.deletar(id);
		return "redirect:/";		
	}
	
}
