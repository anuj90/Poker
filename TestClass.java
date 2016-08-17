package poker;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClass {

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
	public final void TestRoyalFlush1() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be rf:",eHandStrength.NaturalRoyalFlush.getHandStrength(),h.getHandStrength());
		
	}

	@Test
	public final void TestRoyalFlush2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be rf:",eHandStrength.NaturalRoyalFlush.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void TestStraightFlush1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Sf:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());		
	}
	
      public final void Fourofakind() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.KING));
		rfHand.add(new Card(eSuit.SPADES,eRank.KING));
		rfHand.add(new Card(eSuit.HEARTS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Sf:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());		
	}
      
      public final void Fiveofakind() {
  		
  		ArrayList<Card> rfHand = new ArrayList<Card>();
  		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
  		rfHand.add(new Card(eSuit.DIAMONDS,eRank.ACE));
  		rfHand.add(new Card(eSuit.SPADES,eRank.ACE));
  		rfHand.add(new Card(eSuit.HEARTS,eRank.ACE));
  		rfHand.add(new Card(eSuit.JOKER,eRank.ACE));
  		Hand h = Hand.EvalHand(rfHand);		
  		
  		assertEquals("Should be Sf:",eHandStrength.Fiveofakind.getHandStrength(),h.getHandStrength());		
  	}
      
      public final void FullHouse() {
    		
    		ArrayList<Card> rfHand = new ArrayList<Card>();
    		
    		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
    		rfHand.add(new Card(eSuit.DIAMONDS,eRank.KING));
    		rfHand.add(new Card(eSuit.SPADES,eRank.EIGHT));
    		rfHand.add(new Card(eSuit.HEARTS,eRank.EIGHT));
    		rfHand.add(new Card(eSuit.SPADES,eRank.EIGHT));
    		Hand h = Hand.EvalHand(rfHand);		
    		
    		assertEquals("Should be Sf:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());		
    	}

      public final void FullHouse1() {
  		
  		ArrayList<Card> rfHand = new ArrayList<Card>();
  		
  		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
  		rfHand.add(new Card(eSuit.DIAMONDS,eRank.KING));
  		rfHand.add(new Card(eSuit.SPADES,eRank.KING));
  		rfHand.add(new Card(eSuit.HEARTS,eRank.EIGHT));
  		rfHand.add(new Card(eSuit.SPADES,eRank.EIGHT));
  		Hand h = Hand.EvalHand(rfHand);		
  		
  		assertEquals("Should be Sf:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());		
  	}
      
      public final void Threeofakind() {
    		
    		ArrayList<Card> rfHand = new ArrayList<Card>();
    		
    		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
    		rfHand.add(new Card(eSuit.DIAMONDS,eRank.KING));
    		rfHand.add(new Card(eSuit.SPADES,eRank.KING));
    		rfHand.add(new Card(eSuit.HEARTS,eRank.SEVEN));
    		rfHand.add(new Card(eSuit.SPADES,eRank.EIGHT));
    		Hand h = Hand.EvalHand(rfHand);		
    		
    		assertEquals("Should be Sf:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());		
    	}


}
