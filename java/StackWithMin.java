import java.util.Stack;

public class StackWithMin extends Stack<NodeWithMin>{
	public void push(int value) {
		int NewMin = Math.min(value, min());
		super.push(new NodeWithMin(value,NewMin));
	}
	
	public int min(){
		if(this.empty()) return Integer.MAX_VALUE;
		else {
			return peek().min;
		}
	}
}

	class NodeWithMin {
		public int value;
		public int min;
		public NodeWithMin(int v,int min) {
			value = v;
			this.min = min;
		}
		
	}


