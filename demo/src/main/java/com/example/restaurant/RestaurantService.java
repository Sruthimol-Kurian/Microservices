@Service
public class RestaurantService{
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	public Restaurant getRestaurantName() {
		return restaurantRepository.getRestaurantName();
	}
}