package pokerBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HandTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void TestRoyalFlush() {	
		Hand h = new Hand();
		ArrayList<Card> RoyalFlush = new ArrayList<Card>();
		RoyalFlush.add(new Card(10,1,0));
		RoyalFlush.add(new Card(11,1,0));
		RoyalFlush.add(new Card(12,1,0));
		RoyalFlush.add(new Card(13,1,0));
		RoyalFlush.add(new Card(14,1,0));
		h.setHand(RoyalFlush);
		h.EvaluateHand();
		assertTrue(h.getHandStrength() == 10);
		
		Hand d = new Hand();
		ArrayList<Card> RoyalFlush2 = new ArrayList<Card>();
		RoyalFlush2.add(new Card(9,1,0));
		RoyalFlush2.add(new Card(11,1,0));
		RoyalFlush2.add(new Card(12,1,0));
		RoyalFlush2.add(new Card(13,1,0));
		RoyalFlush2.add(new Card(14,1,0));
		d.setHand(RoyalFlush2);
		d.EvaluateHand();
		assertTrue(d.getHandStrength() != 10);
		
		
		
	}

	@Test
	public void TestFourOfAKind() {	
		Hand c = new Hand();
		ArrayList<Card> FourOfAKind = new ArrayList<Card>();
		FourOfAKind.add(new Card(14,1,0));
		FourOfAKind.add(new Card(14,2,0));
		FourOfAKind.add(new Card(14,3,0));
		FourOfAKind.add(new Card(14,4,0));
		FourOfAKind.add(new Card(6,1,0));
		c.setHand(FourOfAKind);
		c.EvaluateHand();
		assertTrue(c.getHandStrength() == 8);
		
		Hand j = new Hand();
		ArrayList<Card> FourOfAKind2 = new ArrayList<Card>();
		FourOfAKind2.add(new Card(14,1,0));
		FourOfAKind2.add(new Card(14,2,0));
		FourOfAKind2.add(new Card(14,3,0));
		FourOfAKind2.add(new Card(7,4,0));
		FourOfAKind2.add(new Card(6,1,0));
		j.setHand(FourOfAKind2);
		j.EvaluateHand();
		assertTrue(j.getHandStrength() != 8);
		
		
	}

	@Test
	public void TestStraightFlush() {	
		Hand a = new Hand();
		ArrayList<Card> StraightFlush = new ArrayList<Card>();
		StraightFlush.add(new Card(4,2,0));
		StraightFlush.add(new Card(5,2,0));
		StraightFlush.add(new Card(6,2,0));
		StraightFlush.add(new Card(7,2,0));
		StraightFlush.add(new Card(8,2,0));
		a.setHand(StraightFlush);
		a.EvaluateHand();
		assertTrue(a.getHandStrength() == 9);
		
		Hand b = new Hand();
		ArrayList<Card> StraightFlush2 = new ArrayList<Card>();
		StraightFlush2.add(new Card(4,2,0));
		StraightFlush2.add(new Card(5,2,0));
		StraightFlush2.add(new Card(6,2,0));
		StraightFlush2.add(new Card(7,2,0));
		StraightFlush2.add(new Card(8,1,0));
		b.setHand(StraightFlush2);
		b.EvaluateHand();
		assertTrue(b.getHandStrength() != 9);
	}
	
}
