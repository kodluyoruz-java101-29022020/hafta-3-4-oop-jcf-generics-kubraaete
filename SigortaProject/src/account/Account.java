package account;

import java.util.ArrayList;

public abstract class Account implements Comparable<Account>{
	
	public ArrayList müsterilerinYaptigiSigortalarý;
	public AuthenticationStatus status=AuthenticationStatus.FAIL;
	public final void showUserInfo() {
		
	}
	public boolean userLogin(String email, String password) throws InvalidAuthenticationException{
		if(email==email & password==password) {
			this.status=AuthenticationStatus.SUCCESS;
		}else
			throw new InvalidAuthenticationException("Gelen deðer geçerli deðil!");
		return true;

	}
	public abstract void insurancePolicy();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((müsterilerinYaptigiSigortalarý == null) ? 0 : müsterilerinYaptigiSigortalarý.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (müsterilerinYaptigiSigortalarý == null) {
			if (other.müsterilerinYaptigiSigortalarý != null)
				return false;
		} else if (!müsterilerinYaptigiSigortalarý.equals(other.müsterilerinYaptigiSigortalarý))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
}
