package com.enrico200165.utils.rdb_jdbc;


import org.apache.log4j.Logger;

public class RDBManagerDB2 extends RDBManager {

	public RDBManagerDB2(String driverClassName /*
												 * superfluo. dovrei pescarlo
												 * dalle costanti
												 */, String DBMSURLPar, String varURL, String DBName, String username, String password)
			throws ClassNotFoundException {

		super(DBConst.JDBC_DRV_DB2, DBConst.JDBC_DB_URL_SCHEME_DB2 +"//"+ varURL + ":50000/" + DBName,DBName,username, password);
	}

	public boolean startDBServer() {
		return true;
	}

	private static org.apache.log4j.Logger log = Logger.getLogger(RDBManagerDB2.class);

	@Override
	protected String buildConnStr() {
		if (DBMSFullURL == null) {
			log.error("DB URL is null, cannot open it");
			return "";
		}
		return DBMSFullURL;
	}

}
