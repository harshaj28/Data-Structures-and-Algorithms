class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Character, Integer> sm = new HashMap<>();
        HashMap<Integer, Integer> rm = new HashMap<>();
    
        for(int i = 0; i < 5 ; i++){
            sm.put(suits[i], sm.getOrDefault(suits[i],0)+1);
            rm.put(ranks[i], rm.getOrDefault(ranks[i],0)+1);
        }
        
            if(sm.get(suits[0]) == 5){
                return "Flush";
            }
        
        for(int cr : ranks){
            if(rm.get(cr) >= 3){
                return "Three of a Kind";
            }
        }
        for(int cr : ranks){
            if(rm.get(cr) == 2){
                return "Pair";
            }
        }
        
        return "High Card";
    }
}