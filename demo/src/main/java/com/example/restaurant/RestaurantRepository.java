@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant>{
	
	@Query("SELECT * FROM Restaurant WHERE status = '1';" )
	public Restaurant getRestaurantName();
}