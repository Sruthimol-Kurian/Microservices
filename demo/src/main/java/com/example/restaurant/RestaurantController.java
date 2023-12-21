@RestController
public class RestaurantController{
	
	@Autowired
	private RestaurantService restaurantService;
	
	@GetMapping("/restaurant")
	public Restaurant restaurantName() {
		
		return restaurantService.getRestaurantName();

	}
}