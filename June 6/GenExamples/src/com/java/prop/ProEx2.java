package com.java.prop;

class Agent {
	
	int agentId;
	String agentName;
	double premium;
	
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	
	public void setPremium(double premium) {
		this.premium = premium;
	}
	
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", agentName=" + agentName + ", premium=" + premium + "]";
	}
	
}
public class ProEx2 {
	public static void main(String[] args) {
		Agent objAgent = new Agent();
		objAgent.setAgentId(1);
		objAgent.setAgentName("Mahathi");
		objAgent.setPremium(93245);
		System.out.println(objAgent);
	}
}
