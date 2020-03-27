package cww327;
import java.util.ArrayList;
import java.util.List;
   static class Card{
      private String rank;
      private String suit;

      public Card(String rank, String suit) {
          this.rank = rank;
          this.suit = suit;
      }

      public String getRank() {
          return rank;
      }


      public void setRank(String rank) {
          this.rank = rank;
      }

      public String getSuit() {
          return suit;
      }

      public void setSuit(String suit) {
          this.suit = suit;
      }
  }
public class Poke {
    {   //存放的扑克牌表
        List <Card> poker =  new ArrayList <>();
        String [] suits =  {"♥","♠","♣","♦"};//五种花色
        for (int i = 0; i <4 ; i++) {
            //处理四种花色
            for(int j =2;j<=10;j++){
                poker.add(new Card(String.valueOf(j),suits[i]));
//                poker.add(new Card(rank : "" + j));//正数转字符串
            }
            poker.add(new Card(rank:"J",suits[i]));
            poker.add(new Card(rank : "Q",suits[i]));
            poker.add(new Card(rank : "K",suits[i]));
            poker.add(new Card(rank : "A",suits[i]));
        }
        return  poker;
    }
}
