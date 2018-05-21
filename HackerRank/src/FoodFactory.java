public class FoodFactory {
		public Food getFood(String order) {
			Food food;
			if(!order.isEmpty()){
			    if(order.equalsIgnoreCase("cake")){
			         food = new Cake();
			        
			    } else if(order.equalsIgnoreCase("pizza"))
			    {
			         food = new Pizza();
			        
			    }    
			}
			    return food;
			}
			}
}