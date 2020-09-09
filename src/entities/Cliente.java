package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date dataNiver;
	
	public Cliente() {}

	public Cliente(String nome, String email, Date dataNiver) {
		this.nome = nome;
		this.email = email;
		this.dataNiver = dataNiver;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNiver() {
		return dataNiver;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append("(" + sdf.format(dataNiver));
		sb.append(") - " + email);
		return sb.toString();
	}

}
