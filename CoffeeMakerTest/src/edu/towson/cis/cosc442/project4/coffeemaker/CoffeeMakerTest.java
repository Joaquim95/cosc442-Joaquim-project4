package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CoffeeMakerTest</code> contains tests for the class <code>{@link CoffeeMaker}</code>.
 *
 * @generatedBy CodePro at 3/22/18, 4:43 PM
 * @author rjoaq
 * @version $Revision: 1.0 $
 */
public class CoffeeMakerTest {
	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testCoffeeMaker_1()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testCoffeeMaker_2()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testAddInventory5()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 0;
		int amtMilk = 0;
		int amtSugar = 0;
		int amtChocolate = -1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testAddInventory1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 0;
		int amtMilk = 0;
		int amtSugar = 0;
		int amtChocolate = 0;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testAddInventory2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = -1;
		int amtMilk = 0;
		int amtSugar = 0;
		int amtChocolate = 0;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testAddInventory3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 0;
		int amtMilk = -1;
		int amtSugar = 0;
		int amtChocolate = 0;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testAddInventory4()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		int amtCoffee = 0;
		int amtMilk = 0;
		int amtSugar = -1;
		int amtChocolate = 0;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testAddRecipe1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();
		
		r.setName("Coffee");
		r.setPrice(50);
		r.setAmtCoffee(3);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setAmtChocolate(0);

		boolean result = fixture.addRecipe(r);

		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testAddRecipe2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();
		r.setName("Coffee");
		Recipe r1 = new Recipe();
		r1.setName("Coffee2");
		Recipe r2 = new Recipe();
		r2.setName("Coffee3");
		Recipe r3 = new Recipe();
		r3.setName("Coffee4");
		Recipe r4 = new Recipe();
		r4.setName("Coffee5");
		
		fixture.addRecipe(r);
		fixture.addRecipe(r1);
		fixture.addRecipe(r2);
		fixture.addRecipe(r3);
		
		boolean result = fixture.addRecipe(r4);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testAddRecipe3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();
		
		r.setName("Coffee");
		r.setPrice(50);
		r.setAmtCoffee(3);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setAmtChocolate(0);
		fixture.addRecipe(r);
		
		Recipe r2 = new Recipe();
		
		r2.setName("Coffee");
		r2.setPrice(50);
		r2.setAmtCoffee(3);
		r2.setAmtMilk(1);
		r2.setAmtSugar(1);
		r2.setAmtChocolate(0);

		boolean result = fixture.addRecipe(r2);

		// add additional test code here
		assertEquals(false, result);
	}


	/**
	 * Run the Inventory checkInventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testCheckInventory()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();

		Inventory result = fixture.checkInventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getChocolate());
		assertEquals(15, result.getCoffee());
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testDeleteRecipe1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();
		
		r.setName("Coffee");
		r.setPrice(50);
		r.setAmtCoffee(3);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setAmtChocolate(0);
		fixture.addRecipe(r);
		
		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testDeleteRecipe2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();

		boolean result = fixture.deleteRecipe(r);

		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testEditRecipe1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();
		
		r.setName("Coffee");
		r.setPrice(50);
		r.setAmtCoffee(3);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setAmtChocolate(0);
		fixture.addRecipe(r);
		Recipe r2 = new Recipe();
		
		r2.setName("Coffee");
		r2.setPrice(50);
		r2.setAmtCoffee(3);
		r2.setAmtMilk(1);
		r2.setAmtSugar(1);
		r2.setAmtChocolate(0);

		boolean result = fixture.editRecipe(r, r2);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testEditRecipe2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();
		
		r.setName("Coffee");
		r.setPrice(50);
		r.setAmtCoffee(3);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setAmtChocolate(0);
		
		Recipe r2 = new Recipe();
		
		r2.setName("Coffee");
		r2.setPrice(50);
		r2.setAmtCoffee(3);
		r2.setAmtMilk(1);
		r2.setAmtSugar(1);
		r2.setAmtChocolate(0);

		boolean result = fixture.editRecipe(r, r2);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testGetRecipeForName1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtMilk());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testGetRecipeForName_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtMilk());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testGetRecipeForName_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtMilk());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testGetRecipeForName_4()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtMilk());
	}
	
	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testGetRecipeForName_5()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();
		
		r.setName("Coffee");
		r.setPrice(50);
		r.setAmtCoffee(3);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setAmtChocolate(0);
		fixture.addRecipe(r);
		String name = "Coffee";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee", result.toString());
		assertEquals("Coffee", result.getName());
		assertEquals(3, result.getAmtCoffee());
		assertEquals(1, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(50, result.getPrice());
		assertEquals(1, result.getAmtMilk());
	}
	
	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testGetRecipeForName_6()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();
		
		r.setName("Coffee");
		r.setPrice(50);
		r.setAmtCoffee(3);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setAmtChocolate(0);
		fixture.addRecipe(r);

		String name = "Coffee2";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtMilk());
	}

	/**
	 * Run the Recipe[] getRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testGetRecipes_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();

		Recipe[] result = fixture.getRecipes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].toString());
		assertEquals(null, result[0].getName());
		assertEquals(0, result[0].getAmtCoffee());
		assertEquals(0, result[0].getAmtSugar());
		assertEquals(0, result[0].getAmtChocolate());
		assertEquals(0, result[0].getPrice());
		assertEquals(0, result[0].getAmtMilk());
		assertNotNull(result[1]);
		assertEquals(null, result[1].toString());
		assertEquals(null, result[1].getName());
		assertEquals(0, result[1].getAmtCoffee());
		assertEquals(0, result[1].getAmtSugar());
		assertEquals(0, result[1].getAmtChocolate());
		assertEquals(0, result[1].getPrice());
		assertEquals(0, result[1].getAmtMilk());
		assertNotNull(result[2]);
		assertEquals(null, result[2].toString());
		assertEquals(null, result[2].getName());
		assertEquals(0, result[2].getAmtCoffee());
		assertEquals(0, result[2].getAmtSugar());
		assertEquals(0, result[2].getAmtChocolate());
		assertEquals(0, result[2].getPrice());
		assertEquals(0, result[2].getAmtMilk());
		assertNotNull(result[3]);
		assertEquals(null, result[3].toString());
		assertEquals(null, result[3].getName());
		assertEquals(0, result[3].getAmtCoffee());
		assertEquals(0, result[3].getAmtSugar());
		assertEquals(0, result[3].getAmtChocolate());
		assertEquals(0, result[3].getPrice());
		assertEquals(0, result[3].getAmtMilk());
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testMakeCoffee_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();
		int amtPaid = 1;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testMakeCoffee_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();
		int amtPaid = 1;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(1, result);
	}
	
	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testMakeCoffee_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();
		
		r.setName("Coffee");
		r.setPrice(50);
		r.setAmtCoffee(3);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setAmtChocolate(0);
		fixture.addRecipe(r);
		int amtPaid = 1;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(1, result);
	}
	
	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Test
	public void testMakeCoffee_4()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		Recipe r = new Recipe();
		
		r.setName("Coffee");
		r.setPrice(50);
		r.setAmtCoffee(16);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setAmtChocolate(0);
		fixture.addRecipe(r);
		int amtPaid = 50;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(50, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/22/18, 4:43 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CoffeeMakerTest.class);
	}
}