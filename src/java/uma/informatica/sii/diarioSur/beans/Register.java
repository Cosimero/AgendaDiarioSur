/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uma.informatica.sii.diarioSur.beans;

import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import uma.informatica.sii.diarioSur.Usuario;

/**
 *
 * @author francis
 */
@Named(value = "register")
@RequestScoped
public class Register {


	private Usuario usuario;
	@Inject
	private ControlAutorizacion ctrl;

	/**
	 * Creates a new instance of Login
	 */
	public Register() throws IOException {
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

	public String Registrar(){
		ctrl.setUsuario(usuario);
		return "index.html";
	}
}
