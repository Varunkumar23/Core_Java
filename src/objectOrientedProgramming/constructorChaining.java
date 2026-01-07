package objectOrientedProgramming;

public class constructorChaining {
	String pan;
	String adhar;
	String voter;

//	public constructorChaining() {
//
//	}
//
//	public constructorChaining(String pan) {
//		this();
//		this.pan = pan;
//	}
//
//	public constructorChaining(String pan, String adhar) {
//		this.pan=pan;
//		this.adhar = adhar;
//
//	}
//
//	public constructorChaining(String pan, String adhar, String voter) {
//		this.pan=pan;
//		this.adhar = adhar;
//		this.voter = voter;
//
//	}

//the code which is written above is not up to the mark as per the industry standards because as a programmer we have to reduce the repetitive code 
// So thats where constructor chaining comes into image where we can call one cons from another by using to special key words this and super 
	// this should be only 1 and it should be the first statement in the cons
	public constructorChaining() {

	}

	public constructorChaining(String pan) {
		this.pan = pan;
	}

	public constructorChaining(String pan, String adhar) {
		this(pan);
		this.adhar = adhar;

	}

	public constructorChaining(String pan, String adhar, String voter) {
		this(pan, adhar);
		this.voter = voter;

	}

}
