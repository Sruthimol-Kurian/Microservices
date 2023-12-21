@Service
public class UserService{
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	RestTemplate restTemplate = new RestTemplate();
	
	public Restaurant getUserRestaurantDetails(String restaurantName) {
		HashMap<String, String> params = new HashMap<>(); 
		//params.put("restaurantId", orderDetails.restaurantId()); 
		//params.put("restaurantName", restaurantName);
		params.put("restaurantName", null);
		try { 
			ResponseEntity<Restaurant> response 
				= restTemplate.getForEntity("http://localhost:8080/restaurant", Restaurant.class, params); 
		} 
		catch (Exception ex) { 
			throw new InvalidRestaurantIdException("Restaurant Name Not Found"); 
		}
		
		return response;
	}
	
}