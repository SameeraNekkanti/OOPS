package eh;

class AutoSmartFilterx extends Watersource implements EmergencyShutdown{
	private int purityCoreLevel;
	private int maintenanceCycle;
	public AutoSmartFilterx(String sourceID, String location, int maxCapacity, int purityCoreLevel, int maintenanceCycle) {
		super(sourceID, location, maxCapacity);
		this.purityCoreLevel = purityCoreLevel;
		this.maintenanceCycle = maintenanceCycle;
	}
	

	public int getPurity() {
		return purityCoreLevel;
	}

	public void setPurityCoreLevel(int purityCoreLevel) {
		this.purityCoreLevel = purityCoreLevel;
	}

	public int getMaintenanceCycle() {
		return maintenanceCycle;
	}

	public void setMaintenanceCycle(int maintenanceCycle) {
		this.maintenanceCycle = maintenanceCycle;
	}

	@Override
	public void shutdown() {
		 System.out.println("[!] CRITICAL: SHUTDOWN TRIGGERED AT SOURCE " + getSourceID());
	        System.out.println("[!] REASON: Purity level below zero-waste threshold.");
	        
	}
	
	@Override
	public void systemCheck() {
	System.out.println("System Check: Source ID [" + getSourceID() + "] at " + getLocation());
    System.out.println("Purity Core Level: " + purityCoreLevel + "%");

    if (purityCoreLevel < 10) {
        shutdown();
    } else {
        System.out.println("Status: FLOW STABLE. AQUATOPIA STANDARDS SECURE.");
    }
    System.out.println("-------------------------------------------");
	}


	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		
	}
}

