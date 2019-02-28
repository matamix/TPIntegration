package monPackage;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriTableauTest {
	
	TriTableau tritableau = null;
	int tab1[] = {1,2,3,4,5};
	int tab2[] = {5,4,3,2,1};
	int tab3[] = {1,2,3};
	int tab4[] = {3,2,1};
	@BeforeEach
	void setUp() throws Exception {
		
		tritableau = new TriTableau();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTriCroissant() {
		tritableau.triCroissant(tab2);
		assertArrayEquals(tab1, tab2);
		
	}

	@Test
	void testTriDecroissant() {
		tritableau.triDecroissant(tab3);
		assertArrayEquals(tab4, tab3);
	}

}
