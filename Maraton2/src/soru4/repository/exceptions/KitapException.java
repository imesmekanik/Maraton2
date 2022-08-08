package soru4.repository.exceptions;

public class KitapException extends RuntimeException {

	String msj;

	public KitapException() {
		// TODO Auto-generated constructor stub
	}

	public KitapException(String msj) {
		super();
		this.msj = msj;
	}

	public String getMsj() {
		return msj;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return getMsj();
	}

}
