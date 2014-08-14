package maze;

import java.util.ArrayList;

public class MazeStack implements StackInterface{
	
	public ArrayList<Object> mazeStack = new ArrayList<Object>();
	public int top = 0;
	@Override
	public void push(Object obj) {
		// TODO Auto-generated method stub
		mazeStack.add(top, obj);
		top++;
	}

	@Override
	public Object pop() {
		--top;
		Object result = mazeStack.get(top);
		mazeStack.remove(top);
		return result;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
