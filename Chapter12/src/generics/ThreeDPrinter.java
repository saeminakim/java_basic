package generics;

public class ThreeDPrinter<T extends Material> {
	// T type에 제한을 두고 싶다면 재료를 통합하는 상위 클래스를 만들고
	// 상속을 이용하면 됨

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;	
		
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
}
