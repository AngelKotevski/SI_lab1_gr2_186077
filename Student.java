class Student {
	String index;
	String firstName;
	String lastName;
	int grades=[6,6,7,8,5,8,9,10,8,9,7,7]
	//TODO constructor
	 StudentString index, String firstName,String lastName,int grades)
	{
		this.index=index;
		this.firstName=firstName;
		this.lastName=lastName;
		this.grades=grades
	}
	//TODO seters & getters
	void setthemAll(index,firstName,lastName,grades)
	{
		this.index=index;
		this.firstName=firstName;
		this.lastName=lastName;
		this.grades=grades
	}
	String vratiIndeks()
	{return this.index;}
	String vratiIme(){return this.firstName;}
	String vratiPrz(){return this.lastName;}
	int vratiNiza(){return this.grades;}

	public double getAverage() {
		//TODO
	int sum=0
	for(int i=0; i< len(this.grades);i++)
	{
		sum+=this.grades[i];
	}
	return (sum/len(this.grades)
	}

	public int ECTSCredits() {
		//TODO
	kolku=0;
	for(int i=0;i<len(this.grades);i++)
	{
		if(this.grades[i]>5)
		{
			kolku+=6;
		}
	}
	return kolku;
	}
}
