package uistore;

public class JobsLocators {
    private String searchByRole="//input[@placeholder='Search by Role or Keyword']";
    private String searchLocation="//input[@placeholder='Enter Location']";
    private String minnesota="//ul/descendant::a[text()='Minnesota, US']";
    private String searchIcon="//div[@class='search-form-fields']/button";
    public String getSearchByRole() {
        return searchByRole;
    }
    public String getSearchLocation() {
        return searchLocation;
    }
    public String getMinnesota() {
        return minnesota;
    }
    public String getSearchIcon() {
        return searchIcon;
    }
    
    
    
}
