public class SpecialSubstringOfLengthK {
        public boolean hasSpecialSubstring(String s, int k) {
           int n = s.length();
            
            if (k > n) return false; 
    
            for (int i = 0; i <= n - k; i++) {
                char firstChar = s.charAt(i);
                
               
                boolean allSame = true;
                for (int j = i; j < i + k; j++) {
                    if (s.charAt(j) != firstChar) {
                        allSame = false;
                        break;
                    }
                }
                
              
                if (allSame) {
                    boolean leftValid = (i == 0) || (s.charAt(i - 1) != firstChar);
                    boolean rightValid = (i + k == n) || (s.charAt(i + k) != firstChar);
                    
                    if (leftValid && rightValid) {
                        return true;
                    }
                }
            }
    
            return false;
        
            
        }
    }

