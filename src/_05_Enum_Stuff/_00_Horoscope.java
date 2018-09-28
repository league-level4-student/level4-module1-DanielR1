package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void horoscope(Zodiac z) {
		switch(z) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "When a surge of energy enters you today, use it to help others. Instead of diving into a fun project or a favorite hobby (or hitting the mall), find out who needs some help around the house. An older family member will be very appreciative of the extra pair of hands. And you'll feel good because you'll know that you have the right priorities. Giving to others enables you to connect with others, which is something that you should never take for granted.");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "Spending so much time with like-minded people has been great for the harmony in your life, but it hasn't been too intellectually stimulating. Today, take some time to get into a scholarly debate -- or at least eavesdrop on a conversation you would never have yourself. You should definitely not go out looking for a fight, but it would not be a bad idea to step out of your comfort zone and experience a little bit of conflict right now. It will strengthen your resolve." );
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null,"You can never try too hard to express yourself clearly -- and clarity is especially important right now, so you need to put extra effort into making sure that you're saying what you mean (and meaning what you say) and that people understand you. If you don't, conflicts are a real danger. Double-check any emails you send today, and think through conversations before you open your mouth to speak. Being especially careful today will pay off big in the long run.");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null,"This is a day to use however you wish -- like the middle square on a bingo card, it can make you a winner in several different ways. But the universe doesn't hand these days out so you can waste them on housework or reorganizing your filing cabinet. Cherish this time, and use it to get closer to people around you. Spend the day sharing philosophies and expressing your feelings. Whether they are good or bad, your inner thoughts ought to be heard.");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "This month's most active phase is finally coming to a close, and you should be ready to slow down the pace and crawl into your own head for a while. This isn't necessarily a time for deep self-examination. But it's a very good day to do any research you need to do. Complicated charts, abstruse facts and myriad details will all make sense to you instantly. And if you listen to your instincts while you're making your decisions, you are sure to make wise ones.");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null,"The good news is that you will have a very relaxing, enjoyable day. The bad news is that this day can't last forever -- and that you won't get a lot of work done today. As long as you resign yourself to an unproductive day, you will be able to lay down any burdens you've put on yourself. Admit to yourself and to the powers that be that no headway will be made today. Chances are, this little delay in the schedule won't cause anyone too much stress.");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "Life doesn't always go the way you want it to, and you don't always get what you wish for. Today you will have to bravely face these truths. In terms of a romantic pursuit, don't get upset if things aren't progressing at the pace you'd like. There are two people here, and you both have to balance what you want with what the other person is willing to give. Apply some patience to this situation, and spend some time away from the person if you're feeling frustrated.");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "Your imagination, your dreams and even your fantasies are extremely crucial today. Apply your creative mind to some suspicions you've been having lately. Cook up a theory or two about what's been going on, and chances are excellent that you will be right on the money -- a conversation with a friend will prove that later today. Don't be discouraged by an admission of guilt. Instead, take this as a sign that your intuition is more on target than ever.");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null,"Your mind will be focused on the future right now, and it's a very good time to expand your horizons. Be ambitious and seek out something that offers you a major challenge -- and major fun. Someone close to you is excited about one of his or her newest endeavors, so pick this person's brain and find out how to get started on your own new adventure. Some ideas might seem far-fetched, but they will work. You need to take a leap of faith. Are you ready?");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "You will be exposed to some advance knowledge or insider information today -- use it wisely. This information could have a profound effect on a project you're involved with, and might mean the difference between your being a superstar and your being a backup singer. Are you ready for the spotlight? Hold on to what you know for a few days, and resist the urge to get a jump on the competition. After all, how do you know that they don't also have this information?");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null,"When you encounter some tough customers today, you'll have to choose to be compassionate -- because it might not come naturally. Sometimes it seems as though people are trying to tick you off, but you cannot give them that satisfaction. Step back and pretend that they're talking to themselves. After all, anyone who spews anger at you is truly angry at his or her own life, right? The best strategy is not confrontation -- it's empathy.");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "There's no such thing as too much experimentation for you right now. You are primed to be open to the unfamiliar, and your mind is ready to be temporarily confused. Go out and find something that will keep your brain busy: A long and complex novel or nonfiction book -- or even a collection of brainteasers or challenging recipes -- will give you a taste of what it's like to go for a goal and complete it. Challenge yourself today, and you won't be disappointed.");
			break;
		}
	}
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac e=Zodiac.ARIES;
		String[] options = { "ARIES", "TAURUS", "GEMINI", "CANCER", "LEO", "VIRGO", "LIBRA", "SCORPIO", "SAGITTARIUS", "CAPRICORN", "AQUARIUS", "PISCES" };

		int input = JOptionPane.showOptionDialog(null, "Choose your zodiac", "Custom Buttons", 0, -1, null,
				options, 0);
		if(input==0) {
			e=Zodiac.ARIES;
		}
		if(input==1) {
			e=Zodiac.TAURUS;
		}
		if(input==2) {
			e=Zodiac.GEMINI;
		}
		if(input==3) {
			e=Zodiac.CANCER;
		}
		if(input==4) {
			e=Zodiac.LEO;
		}
		if(input==5) {
			e=Zodiac.VIRGO;
		}
		if(input==6) {
			e=Zodiac.LIBRA;
		}
		if(input==7) {
			e=Zodiac.SCORPIO;
		}
		if(input==8) {
			e=Zodiac.SAGITTARIUS;
		}
		if(input==9) {
			e=Zodiac.CAPRICORN;
		}
		if(input==10) {
			e=Zodiac.AQUARIUS;
		}
		if(input==11) {
			e=Zodiac.PISCES;
		}
		horoscope(e);

	}
}
