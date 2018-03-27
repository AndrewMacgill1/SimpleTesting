package tester;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;

public class Service {
	
	private Map<Integer,Account> accountsMap = new HashMap<Integer,Account>();
	
	public void addAcc(Account acc) {
		
		accountsMap.put(acc.getAccNo(),acc);
		
	}
	
	public Account getAcc(int num) {
		
		return accountsMap.get(num);
		
	}
	
	public String Conversion() {
		
		Gson gson = new Gson();
		String json = gson.toJson(accountsMap);
		return json;
		
	}
	
	

}
