package org.prueba.openejb.ejb;

import javax.ejb.Remote;

@Remote
public interface SimpleStatelessEJBRemote {
	public String getMensaje();
}
