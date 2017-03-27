package attractions;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Attractions {
	
	public long place_id;
	public String license;
	public String osm_type;
	public long osm_id;
	public double lat;
	public double lon;
	public String display_name;
	public String type;
	public double importance;
	List<String>l = null;
	public Attractions(String jsonstring){
	l = new ArrayList<String>();
		try {			
	//		JSONObject jObject = new JSONObject(jsonstring);	
			
			JSONArray jarr = new JSONArray(jsonstring);
			System.out.println(jarr.length());
			for(int i = 0; i < jarr.length(); i++){
				Object jo = jarr.get(i);
				JSONObject jso = (JSONObject)jo;
				place_id = jso.getLong("place_id");
				lat = jso.getDouble("lat");
				lon = jso.getDouble("lon");
				
				importance = jso.getDouble("importance");
//				
				display_name = jso.getString("display_name");	
				
				String finresult = place_id+"\t"+display_name+"\t"+lat+"\t"+lon+"\t"+importance;
				l.add(finresult);
				
			}

			//viewpoint
			//attraction
			//church
			//park

		} catch (JSONException e) {
			System.err.println("Can't parse JSON string");
			e.printStackTrace();
		}
	}

	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}

	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public String getDisplayName() {
		return display_name;
	}
	public void setDisplayName(String diplayName) {
		this.display_name = diplayName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getImportance() {
		return importance;
	}
	public void setImportance(double importance) {
		this.importance = importance;
	} 
	
//	[{"place_id":"40289454",
//		"licence":"Data © OpenStreetMap contributors, ODbL 1.0. http:\/\/www.openstreetmap.org\/copyright",
//		"osm_type":"node",
//		"osm_id":"3012322815",
//		"boundingbox":["44.6929011","44.6930011","10.6297879","10.6298879"],
//		"lat":"44.6929511","lon":"10.6298379",
//		"display_name":"Baretto, Piazza Armando Diaz, Reggio nell'Emilia, Rosta Nuova, Reggio nell'Emilia, RE, Emilia-Romagna, 42121, Italia",
//		"class":"amenity",
//		"type":"bar",
//		"importance":0.101,
//		"icon":"http:\/\/nominatim.openstreetmap.org\/images\/mapicons\/food_bar.p.20.png"},

}
