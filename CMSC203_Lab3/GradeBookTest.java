import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTest {
	private GradeBook g1;
	private GradeBook g2;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		g1=new GradeBook(5);
		g2=new GradeBook(5);
		g1.addScore(10);
		g1.addScore(20);
		g1.addScore(30);
		g1.addScore(40);
		g2.addScore(20);
		g2.addScore(40);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		g1=null;
		g2=null;
		
	}



		@Test
		void testAddScore() {
		    assertTrue(g1.toString().equals("10.0 20.0 30.0 40.0 "));
		    assertEquals(4, g1.getScoreSize());
		}
		
		
		@Test
		void testSum() {
		    assertEquals(100.0, g1.sum(), 0.0001);
		}
		
		@Test
		void testMinimum() {
		    assertEquals(10.0, g1.minimum(), 0.0001);
		}
		
		@Test
		void testFinalScore() {
		    assertEquals(90.0, g1.finalScore(), 0.0001);
		}
	}
