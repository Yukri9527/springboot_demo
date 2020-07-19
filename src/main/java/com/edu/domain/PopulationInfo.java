package com.edu.domain;



public class PopulationInfo {

	private Integer lid;

	private String lname;

	private String municipalities;

	private Long totalPopulation;

	private Long population0_14;

	private Long population15_64;

	private Long population_65;

	private Long foreigners;

	private Long inhabitedPopulation;

	private Long liveBirths;

	private Long deaths;

	private Long imigrantsIn;

	private Long imigrantsOut;

	private Long daytimePopulation;

	private Long households;

	private Long privateHouseholds;

	private Long nuclearFamilies;

	private Long onepersonHouseholds;

	private Long nuclearFamily_65;

	private Long agedCouple;

	private Long singleAgedCouple;

	private Long marriages;

	private Long divorces;

	public PopulationInfo(Integer lid, String lname, String municipalities, Long totalPopulation, Long population0_14,
			Long population15_64, Long population_65, Long foreigners, Long inhabitedPopulation, Long liveBirths,
			Long deaths, Long imigrantsIn, Long imigrantsOut, Long daytimePopulation, Long households,
			Long privateHouseholds, Long nuclearFamilies, Long onepersonHouseholds, Long nuclearFamily_65,
			Long agedCouple, Long singleAgedCouple, Long marriages, Long divorces) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.municipalities = municipalities;
		this.totalPopulation = totalPopulation;
		this.population0_14 = population0_14;
		this.population15_64 = population15_64;
		this.population_65 = population_65;
		this.foreigners = foreigners;
		this.inhabitedPopulation = inhabitedPopulation;
		this.liveBirths = liveBirths;
		this.deaths = deaths;
		this.imigrantsIn = imigrantsIn;
		this.imigrantsOut = imigrantsOut;
		this.daytimePopulation = daytimePopulation;
		this.households = households;
		this.privateHouseholds = privateHouseholds;
		this.nuclearFamilies = nuclearFamilies;
		this.onepersonHouseholds = onepersonHouseholds;
		this.nuclearFamily_65 = nuclearFamily_65;
		this.agedCouple = agedCouple;
		this.singleAgedCouple = singleAgedCouple;
		this.marriages = marriages;
		this.divorces = divorces;
	}

	public PopulationInfo() {

	}

	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMunicipalities() {
		return municipalities;
	}

	public void setMunicipalities(String municipalities) {
		this.municipalities = municipalities;
	}

	public Long getTotalPopulation() {
		return totalPopulation;
	}

	public void setTotalPopulation(Long totalPopulation) {
		this.totalPopulation = totalPopulation;
	}

	public Long getPopulation0_14() {
		return population0_14;
	}

	public void setPopulation0_14(Long population0_14) {
		this.population0_14 = population0_14;
	}

	public Long getPopulation15_64() {
		return population15_64;
	}

	public void setPopulation15_64(Long population15_64) {
		this.population15_64 = population15_64;
	}

	public Long getPopulation_65() {
		return population_65;
	}

	public void setPopulation_65(Long population_65) {
		this.population_65 = population_65;
	}

	public Long getForeigners() {
		return foreigners;
	}

	public void setForeigners(Long foreigners) {
		this.foreigners = foreigners;
	}

	public Long getInhabitedPopulation() {
		return inhabitedPopulation;
	}

	public void setInhabitedPopulation(Long inhabitedPopulation) {
		this.inhabitedPopulation = inhabitedPopulation;
	}

	public Long getLiveBirths() {
		return liveBirths;
	}

	public void setLiveBirths(Long liveBirths) {
		this.liveBirths = liveBirths;
	}

	public Long getDeaths() {
		return deaths;
	}

	public void setDeaths(Long deaths) {
		this.deaths = deaths;
	}

	public Long getImigrantsIn() {
		return imigrantsIn;
	}

	public void setImigrantsIn(Long imigrantsIn) {
		this.imigrantsIn = imigrantsIn;
	}

	public Long getImigrantsOut() {
		return imigrantsOut;
	}

	public void setImigrantsOut(Long imigrantsOut) {
		this.imigrantsOut = imigrantsOut;
	}

	public Long getDaytimePopulation() {
		return daytimePopulation;
	}

	public void setDaytimePopulation(Long daytimePopulation) {
		this.daytimePopulation = daytimePopulation;
	}

	public Long getHouseholds() {
		return households;
	}

	public void setHouseholds(Long households) {
		this.households = households;
	}

	public Long getPrivateHouseholds() {
		return privateHouseholds;
	}

	public void setPrivateHouseholds(Long privateHouseholds) {
		this.privateHouseholds = privateHouseholds;
	}

	public Long getNuclearFamilies() {
		return nuclearFamilies;
	}

	public void setNuclearFamilies(Long nuclearFamilies) {
		this.nuclearFamilies = nuclearFamilies;
	}

	public Long getOnepersonHouseholds() {
		return onepersonHouseholds;
	}

	public void setOnepersonHouseholds(Long onepersonHouseholds) {
		this.onepersonHouseholds = onepersonHouseholds;
	}

	public Long getNuclearFamily_65() {
		return nuclearFamily_65;
	}

	public void setNuclearFamily_65(Long nuclearFamily_65) {
		this.nuclearFamily_65 = nuclearFamily_65;
	}

	public Long getAgedCouple() {
		return agedCouple;
	}

	public void setAgedCouple(Long agedCouple) {
		this.agedCouple = agedCouple;
	}

	public Long getSingleAgedCouple() {
		return singleAgedCouple;
	}

	public void setSingleAgedCouple(Long singleAgedCouple) {
		this.singleAgedCouple = singleAgedCouple;
	}

	public Long getMarriages() {
		return marriages;
	}

	public void setMarriages(Long marriages) {
		this.marriages = marriages;
	}

	public Long getDivorces() {
		return divorces;
	}

	public void setDivorces(Long divorces) {
		this.divorces = divorces;
	}

	@Override
	public String toString() {
		return "Population [lid=" + lid + ", lname=" + lname + ", municipalities=" + municipalities
				+ ", totalPopulation=" + totalPopulation + ", population0_14=" + population0_14 + ", population15_64="
				+ population15_64 + ", population_65=" + population_65 + ", foreigners=" + foreigners
				+ ", inhabitedPopulation=" + inhabitedPopulation + ", liveBirths=" + liveBirths + ", deaths=" + deaths
				+ ", imigrantsIn=" + imigrantsIn + ", imigrantsOut=" + imigrantsOut + ", daytimePopulation="
				+ daytimePopulation + ", households=" + households + ", privateHouseholds=" + privateHouseholds
				+ ", nuclearFamilies=" + nuclearFamilies + ", onepersonHouseholds=" + onepersonHouseholds
				+ ", nuclearFamily_65=" + nuclearFamily_65 + ", agedCouple=" + agedCouple + ", singleAgedCouple="
				+ singleAgedCouple + ", marriages=" + marriages + ", divorces=" + divorces + "]";
	}

}
