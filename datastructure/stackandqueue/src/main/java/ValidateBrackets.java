public class ValidateBrackets {
    public static Boolean validateBrackets(String brackets){
        Stack<Character> validateBracketsStack =new Stack<Character>();
        char[] br = brackets.toCharArray();
        String checkForMotion = "";
        for (Character rr :br) {
            if (rr.equals('(')  || rr.equals(')') )   {
                if  ( rr.equals ('(') ){
                    validateBracketsStack.push(rr);
                  checkForMotion=validateBracketsStack.toString();
                }if (rr.equals(')')){
                    if (validateBracketsStack.top!=null){
                        validateBracketsStack.pop();
                    checkForMotion=validateBracketsStack.toString();
                    }else return false;
                }
            }
        }
           for (Character rr : br) {
               if (rr.equals('[') || rr.equals(']')) {
                   if (rr.equals('[')) {
                       validateBracketsStack.push(rr);
                       checkForMotion = validateBracketsStack.toString();
                   } if (rr.equals(']')) {
                       if (validateBracketsStack.top != null) {
                           validateBracketsStack.pop();
                           checkForMotion = validateBracketsStack.toString();
                       } else return false;
                   }
               }
           }
           if (true) {
               for (Character rr : br) {
                   if (rr.equals('{') || rr.equals('}')) {
                       if (rr.equals('{')) {
                           validateBracketsStack.push(rr);
                           checkForMotion = validateBracketsStack.toString();
                       }
                       if (rr.equals('}')) {
                           if (validateBracketsStack.top != null) {
                               validateBracketsStack.pop();
                               checkForMotion = validateBracketsStack.toString();
                           } else return false;
                       }
                   }
               }
//               checkForMotion="]";
//               System.out.println(checkForMotion.length());


               if (checkForMotion.length() == 4) {
                   return true;
               }
           }
        return false;
    }
}
//     second method without using stacks
//        for (int i = 0; i < br.length; i++) {
//
//
//            if (br[i] == '('||br[i] == ')') {
//                if (br[i]==')'){
//                    parentheses--;
//
//                    if (parentheses<0){
//                        return false;
//                    }
//                }else{
//                    validateBracketsStack.pushChacr(br[i]);
//                    parentheses++;
//                }
//            }
//            if (br[i] == '{' || br[i] == '}') {
//                if (br[i]=='}'){
//                    validateBracketsStack.pop();
//                    carlyBraces--;
//                    if (carlyBraces<0){
//                        return false;
//                    }
//                }else{
//                    validateBracketsStack.pushChacr(br[i]);
//                    carlyBraces++;
//                }
//            }
//            if (br[i] == '[' || br[i] == ']') {
//                if (br[i]==']'){
//                    squareBraces--;
//                    if (squareBraces<0){
//                        return false;
//                    }
//                }else{
//                    validateBracketsStack.pushChacr(br[i]);
//                    squareBraces++;
//                }
//            }
//        }
//        if (squareBraces>0 ||parentheses>0||carlyBraces>0){
//            return false;
//        }

//    return true;
//    }
//}
