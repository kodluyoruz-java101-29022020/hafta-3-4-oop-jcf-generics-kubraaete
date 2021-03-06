package account;

import java.util.ArrayList;

public abstract class Account implements Comparable<Account>{
	
	public ArrayList müsterilerinYaptigiSigortaları;
	public AuthenticationStatus status=AuthenticationStatus.FAIL;
	public final void showUserInfo() {
		
	}
	public boolean userLogin(String email, String password) throws InvalidAuthenticationException{
		if(email==email & password==password) {
			this.status=AuthenticationStatus.SUCCESS;
		}else
			throw new InvalidAuthenticationException("Gelen değer geçerli değil!");
		return true;

	}
	public abstract void insurancePolicy();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((müsterilerinYaptigiSigortaları == null) ? 0 : müsterilerinYaptigiSigortaları.hashCode());
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
		if (müsterilerinYaptigiSigortaları == null) {
			if (other.müsterilerinYaptigiSigortaları != null)
				return false;
		} else if (!müsterilerinYaptigiSigortaları.equals(other.müsterilerinYaptigiSigortaları))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
}
