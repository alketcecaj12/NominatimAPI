package nominatim;

public class TestNominatim {

	
	public static void main (String [] args) throws Exception{
		
		NominatimReverseGeocodingJAPI nominatim = new NominatimReverseGeocodingJAPI(18); 
		//create instance with default zoom level (18)
		int zoom = 16;
		//NominatimReverseGeocodingJAPI nominatim2 = new NominatimReverseGeocodingJAPI(zoom); //create instance with given zoom level
//		double lon = 12.37321228;	
//		double lat = 42.06061087;
			
		double lat = 	45.39137825;
		double lon =     9.25778452;
		Address result = nominatim.getAdress(lat, lon); //returns Address object for the given position
		
		System.out.println(" "+result.getCity());
		System.out.println("id "+result.getOsmId());
		
		System.out.println("type "+result.getOsmType());
		System.out.println("Lod "+result.getLod());
		System.out.println("country code "+result.getCountryCode());
		System.out.println("country "+result.getCountry());
		System.out.println("postal code "+result.getPostcode());
		System.out.println("state "+result.getState());
		System.out.println("country "+result.getCounty());
		System.out.println("city "+result.getCity());
		System.out.println("suburb "+result.getSuburb());
		System.out.println("road "+result.getRoad());
		System.out.println("display "+result.getDisplayName());
	
	}
}
