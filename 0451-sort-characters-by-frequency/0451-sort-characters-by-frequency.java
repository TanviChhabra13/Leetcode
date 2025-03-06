class pair{
    int freq;
    char ch;
    pair(int freq,char ch){
        this.freq=freq;
        this.ch=ch;
    }
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freq=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<pair> q=new PriorityQueue<>((a,b)->b.freq-a.freq);
        for(Map.Entry<Character,Integer> hm:freq.entrySet()){
            pair p=new pair(hm.getValue(),hm.getKey());
            q.offer(p);
        } 
        StringBuilder sb=new StringBuilder();
        while(!q.isEmpty()){
            pair temp=q.poll();
            char ch=temp.ch;
            int fre=temp.freq;
            for(int i=0;i<fre;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}