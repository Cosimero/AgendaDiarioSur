/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uma.informatica.sii.diarioSur;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Acer
 */
@Named(value = "userDB")
@Dependent
public class UserDB {

private List<Usuario> usuarios;
	/**
	 * Creates a new instance of UserDB
	 */
	public UserDB() {
		usuarios= new ArrayList<>();
		usuarios.add(new Usuario("1", "1", "1", "Normal"));
	}
	public Usuario buscarUsuario(String nombre){
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
