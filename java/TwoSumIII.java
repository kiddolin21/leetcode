
public class TwoSum {
	private Map<Integer,Integer> table = new HashMap<>();
	
	private void add(int input) {
		int count = table.containsKey(input)? table.get(input):0;
		table.put(input,count+1);
	}
	
	private boolean find(int value) {
		for(Map.Entry<Integer, Integer>entry:table.entrySet()) {
			int num = entry.getKey();
			int y = value - num;
			if(y==num) {
				if(entry.getValue()>=2) {
					return true;
				}
				else if(table.containsKey(y)) {
					return true;
				}
			}
		}
		return false;
	}

}

