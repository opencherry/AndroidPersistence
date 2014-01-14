package org.cherry.persistence;
public class QueryException extends PersistenceException {

	private static final long serialVersionUID = -3816965842838894324L;
	private String queryString;

	public QueryException(String message) {
		super(message);
	}
	public QueryException(String message, Throwable e) {
		super(message, e);
	}

	public QueryException(String message, String queryString) {
		super(message);
		this.queryString = queryString;
	}

	public QueryException(Exception e) {
		super(e);
	}
	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	public String getMessage() {
		String msg = super.getMessage();
		if ( queryString!=null ) msg += " [" + queryString + ']';
		return msg;
	}

}