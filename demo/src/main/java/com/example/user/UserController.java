@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/restaurant/{restaurantName}")
	public Restaurant getUserRestaurant(@PathVariable String restaurantName) {
		return userService.getUserRestaurantDetails(restaurantName);
	}
}