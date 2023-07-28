package org.tnsif.hierachicalinheritance;

public class SnowCone extends Android{
	
	//private member
		private int version;
		
		//getters and setters
		public int getVersion() {
			return version;
		}


		public void setVersion(int version) {
			this.version = version;
		}

		
	public SnowCone(String brand, String slotTpye ,int version ) {
		super(brand, slotTpye );
		this.version=version;

	}

	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}

	
}
