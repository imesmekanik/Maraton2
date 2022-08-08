package soru4.repository.exceptions;

public class MusteriException extends RuntimeException {

	String msj;

	public MusteriException() {
		// TODO Auto-generated constructor stub
	}

	public MusteriException(String msj) {
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
