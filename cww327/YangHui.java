package cww327;

import java.util.ArrayList;
import java.util.List;

public class YangHui {
  public List<List<Integer>> generate(int numRows){
      if(numRows<0){
          return  new ArrayList <>();
      }
        List<List<Integer>> result = new ArrayList <>();
      List<Integer> firstLine =  new ArrayList <>();
      firstLine.add(1);
      result.add(firstLine);
      //
      if(numRows==1){
          return  result;
      }
      List<Integer> secondLine =  new ArrayList <>();
      secondLine.add(1);
      result.add(secondLine);
      if(numRows==2){
          return  result;
      }
      //第i行
      for(int row =3;row<=numRows;row++){
          List<Integer> preLine =  result.get(row -1 -1);//row-1,得到行数，再减一得到row-1的下标
          List<Integer> curLine =  new ArrayList <>();
          curLine.add(1);
          for(int col =2;col< row;col++){
              int curNum = preLine.get(col-1-1)+preLine.get(col-1);//col减一列
              curLine.add(curNum);
          }
          curLine.add(1);
          result.add(curLine);
      }
      return  result;
  }
}
