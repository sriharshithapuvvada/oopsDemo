package com.valuemomentum.training.collections;
class Employee10{
	String name;

	public Employee10(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
interface pair<K,V>{
	public K getKey();
	public V getValue();
	
}
class OderedPair<K,V> implements pair{
	private K key;
    private V value;
    
	public OderedPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public Object getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public Object getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
}
public class GenericMultipleTypeParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    OderedPair<Integer,String> op1=new OderedPair<Integer,String>(1,"java");
    System.out.println(op1.getKey()+" :"+op1.getValue());
    
    OderedPair<String,String> op2=new OderedPair<String,String>("core","java");
    System.out.println(op2.getKey()+" "+op2.getValue());
    

    OderedPair<Integer,Employee10> op3=new OderedPair<Integer,Employee10>(10,new Employee10("harshi"));
    System.out.println(op3.getKey()+" ="+((Employee10) op3.getValue()).getName());
    
	}

}
