public class Movies {
	private Boolean age;			//true, if lower 13
	private Boolean tv_series;		//true if TvSeries
	private Boolean ongoing;		//true if ongoing
	private Boolean hollywood; 		//true if hollywood
	private Boolean alone;			//true if alone
	private Boolean partner;		//true if with partner
	private Boolean comedy;			//true if comedy false if action
		

	public Boolean isComedy()
	{
		return this.comedy;
	}
	
	public void setComedy(Boolean comedy)
	{
		this.comedy = comedy;
	}
	
	public Boolean isAlone()
	{
		return this.alone;
	}
	
	public void setAlone(Boolean alone)
	{
		this.alone = alone;
	}
	
	public Boolean isPartner()
	{
		return this.partner;
	}
	
	public void setPartner(Boolean partner)
	{
		this.partner = partner;
	}
	
	public Boolean isAge()
	{
		return this.age;
	}
	
	public void setAge(Boolean age)
	{
		this.age = age;
	}
	
	public Boolean isHollywood()
	{
		return this.hollywood;
	}
	
	public void setHollywood(Boolean hollywood)
	{
		this.hollywood = hollywood;
	}
	
	public Boolean isOngoing()
	{
		return this.ongoing;
	}
	
	public void setOngoing(Boolean ongoing)
	{
		this.ongoing = ongoing;
	}
	
	public Boolean isTv()
	{
		return this.tv_series;
	}
	
	public void setTv(Boolean tv_series)
	{
		this.tv_series = tv_series;
	}
	
}
