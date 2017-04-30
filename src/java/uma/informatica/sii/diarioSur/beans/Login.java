/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uma.informatica.sii.diarioSur.beans;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import uma.informatica.sii.diarioSur.Usuario;

/**
 *
 * @author francis
 */
@Named(value = "login")
@SessionScoped
public class Login {

    public String usuario;
    public String contrasenia;
	private boolean verificado;

	List<Usuario> usuarios;
    
    /**
     * Creates a new instance of Login
     */
    public Login() {
        usuarios = new ArrayList<>();
		usuarios.add(new Usuario("1", "1", "1", "Normal"));
		verificado=false;
		usuario="";
		contrasenia="";
	}

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String autenticar() {
        // Implementar este método
        FacesContext ctx = FacesContext.getCurrentInstance();
        String devolver=null;
        Usuario u=buscarUsuario(usuario);
            if(u.getNombre().equals(usuario)){
                if(u.getContrasena().equals(contrasenia)){
                    verificado=true;
                    devolver="index.html";//TODO
                }
            }
        
        if(devolver==null) ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario o contraseña incorrectos", "Usuario o contraseña incorrectos"));
        return devolver;
    }

	public boolean isVerificado() {
		return verificado;
	}
	
	private Usuario buscarUsuario(String nombre){
		Usuario buscar=null;
		for(Usuario u:usuarios){
			if(u.getNombre().equals(nombre)){
				buscar= u;
				break;
			}
		}
		return buscar;
	}
}
