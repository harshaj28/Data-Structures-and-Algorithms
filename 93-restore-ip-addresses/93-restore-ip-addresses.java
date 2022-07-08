class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> allIpAddresses=new ArrayList<>();
        int[]path=new int[4];
        snapshotIp(allIpAddresses,s,0,path,0);
        return allIpAddresses;
    }
    public void snapshotIp(List<String> allIpAddresses,String s,int builderindex,int[]path,int segment){
        if(segment==4&&builderindex==s.length()){
            allIpAddresses.add(path[0]+"."+path[1]+"."+path[2]+"."+path[3]);
            return;
        }
        else if(segment==4||builderindex==s.length()){
            return;
        }
        for(int len=1;len<=3&&builderindex+len<=s.length();len++){
            String snapshot=s.substring(builderindex,builderindex+len);
            int value=Integer.parseInt(snapshot);
            if(value>255||len>=2&&s.charAt(builderindex)=='0'){
                break;
            }
            path[segment]=value;
            snapshotIp(allIpAddresses,s,builderindex+len,path,segment+1);
            path[segment]=-1;
        }
    }
}