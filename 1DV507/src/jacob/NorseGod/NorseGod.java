/**
 * 
 */
package fa222rw_assign3.NorseGod;

/**
 * @author Fredrik
 *
 */
public class NorseGod {
	// the different fields. 
	// the gods name
	private String name;
	// the gods race
	private String race;
	// the gods description.
	private String desc;
	
	// empty constructor 
	public NorseGod() {}
	// constructor that fills all the fields.
	public NorseGod(String name, String race, String desc) {
		this.name = name;
		this.race = race;
		this.desc = desc;
	}
	
	// get the name
	public String getName() {
		return name;
	}
	// get description
	public String getDesc() {
		return desc;
	}
	// get race
	public String getRace() {
		return race;
	}
	// set the name
	public void setName(String name) {
		this.name = name;
	}
	// set the race
	public void setRace(String race) {
		this.race = race;
	}
	// set desc
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
