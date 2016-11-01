package org.prueba.openejb.ejb;

import javax.ejb.Local;

@Local
public interface SimpleStatelessEJBLocal {

	public String getMensaje();
}
