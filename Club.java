
public class Club {
	private int quantityLimit = 20;
	private Member member[] = new Member[quantityLimit];
	private int quantityCurrent = 0;
	
	public void addMember(Member m) {
		if(quantityCurrent < quantityLimit) {
			member[quantityCurrent++] = m;
		}
	}
	public int totalFees() {
		int total = 0;
		for(int i = 0 ; i < member.length ; i++) {
			if(member[i] != null) {
				total += member[i].getFee();
			}
		}
		return total;
	}
	public int getQuantity() {
		return quantityCurrent;
	}
	public String toString() {
		String output = "";
		for(int i = 0 ; i < member.length ; i++) {
			if(member[i] != null) {
				output += member[i].getName() + "\tMembership fee:" + member[i].getFee() + "\n";
			}
		}
		return output;
	}
}
