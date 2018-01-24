package ip4addr;

public class Ip4Address {
    
    private int octet1, octet2, octet3, octet4;

    public Ip4Address(int n1, int n2, int n3, int n4) {
        octet1 = n1;
        octet2 = n2;
        octet3 = n3;
        octet4 = n4;
    }
    
    public Ip4Address(String addr) {
        String[] s = addr.split("\\.");
        octet1 = Integer.parseInt(s[0]);
        octet2 = Integer.parseInt(s[1]);
        octet3 = Integer.parseInt(s[2]);
        octet4 = Integer.parseInt(s[3]);
    }
    
    public String toString() {
        return octet1 + "." + octet2 + "." + octet3 + "." + octet4;
    }
    
    public String getIp4Class() {
        if ((octet1 >> 7) == 0)
            return "A";
        if ((octet1 >> 6) == 2)
            return "B";
        if ((octet1 >> 5) == 6)
            return "C";
        if ((octet1 >> 4) == 14)
            return "D";
        return "E";
    }
    
    public Ip4Address getNetwork() {
        if (getIp4Class().equals("A"))
            return new Ip4Address(octet1, 0, 0, 0);
        if (getIp4Class().equals("B"))
            return new Ip4Address(octet1, octet2, 0, 0);
        if (getIp4Class().equals("C"))
            return new Ip4Address(octet1, octet2, octet3, 0);
        return null;
    }
  }
  