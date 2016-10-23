package lifegame;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;

import org.junit.runner.RunWith;

public class GamemapTest {

	private final char CELL_ALIVE='A';
	private final char CELL_DEAD='D';
	
	Gamemap gamemap;
	@Before
	public void setUp() throws Exception {
		gamemap = new Gamemap();
	}
	
	@After
    public void tearDown() throws Exception{
		
	}

	@Ignore
	@Test
	public void testGamemap() {
		fail("Not yet implemented");
	}

	@Test
	public void testStartgame() {
		//fail("Not yet implemented");
		boolean a = gamemap.startgame();
		assertEquals(a,true);
	}

	@Test
	public void testCountneighborcell() {
		//fail("Not yet implemented");
		char[][] tempMap={
				{'A','D','D','A','A'},
				{'D','D','D','D','D'},
				{'A','A','D','A','D'},
				{'A','A','D','A','D'},
				{'A','A','A','D','D'}
		};
		gamemap.settempStatus(tempMap);
		int a=gamemap.countneighborcell(3, 3);
		assertEquals(2,a);
	}

	@Test
	public void testChangecellstatus() {
		//fail("Not yet implemented");
		char[][] tempMap={
				{'A','D','D','A','A'},
				{'D','D','D','D','D'},
				{'A','A','D','A','D'},
				{'A','A','D','A','D'},
				{'A','A','A','D','D'}
		};
		char[][] tempStatus={
				{'D','D','D','D','D'},
				{'A','A','A','A','A'},
				{'A','A','D','A','A'},
				{'D','D','D','A','A'},
				{'A','A','A','A','A'}
		};
		gamemap.settempStatus(tempMap);
		gamemap.setnextStatus(tempMap);
		gamemap.changecellstatus();
		char [][] testStatus=tempMap;
		gamemap.gettempStatus(testStatus);
		assertEquals(testStatus[1][1],'A');
	}

}