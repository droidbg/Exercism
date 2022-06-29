class TwelveDays {
    private String[] dayCount = {
            "first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
    };
    
    private String startPhrase = "On the ";
    private String startPhrasePart2 = " day of Christmas my true love gave to me: ";
    
    private String[] phrases = {
            "a Partridge in a Pear Tree.\n",
            "two Turtle Doves, ",
            "three French Hens, ",
            "four Calling Birds, ",
            "five Gold Rings, ",
            "six Geese-a-Laying, ",
            "seven Swans-a-Swimming, ",
            "eight Maids-a-Milking, ",
            "nine Ladies Dancing, ",
            "ten Lords-a-Leaping, ",
            "eleven Pipers Piping, ",
            "twelve Drummers Drumming, "
    };
    String verse(int verseNumber) {
       String verseLine="";
        verseLine+=startPhrase;
        verseLine+=dayCount[verseNumber-1];
        verseLine+=startPhrasePart2;
        for(int i=verseNumber-1;i>=0;i--)
            {
                 if(verseNumber>1 && i==0)
                 {
                     verseLine+="and ";
                 }
                verseLine+=phrases[i];
               
            }
        return verseLine;
    }
    String verses(int startVerse, int endVerse) {
        String versesLines="";
       for(int i=startVerse;i<=endVerse;i++)
           {
               versesLines+=verse(i);
               if(i!=endVerse)
               {
                   versesLines+="\n";
               }
           }
        return versesLines;
    }
    
    String sing() {
     return verses(1,12);
    }
}
