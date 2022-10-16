//실습 6번
package problem;

import java.util.*;

class Location{
    private String cityname;
    private int longitude;
    private int latitude;

    public Location(String cityname, int longitude, int latitude) { this.cityname=cityname; this.longitude=longitude; this.latitude=latitude;}

    public String getCityName() { return cityname;}
    public int getLongitude(){ return longitude;}
    public int getLatitude() {return latitude;}

    public void findCity(String cityname) {
        if(cityname.equals(this.cityname)) System.out.println(this.cityname + " " + this.longitude + " " + this.latitude);
    }
}

public class LocHash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Location[] locations = new Location[4];

        HashMap<String, Location> manage = new HashMap<String, Location>();

        System.out.println("도시, 경도, 위도를 입력하세요.");
        for(int i=0; i<locations.length; i++){//도시 정보를 입력받음
            System.out.print(">>");
            String text = scanner.nextLine();
            StringTokenizer tok = new StringTokenizer(text, ", ");

            String cityname = tok.nextToken().trim();
            int longitude = Integer.parseInt(tok.nextToken().trim());
            int latitude = Integer.parseInt(tok.nextToken().trim());
            locations[i] = new Location(cityname, longitude, latitude);

            manage.put(cityname, locations[i]);
        }

        Set<String> key = manage.keySet();
        Iterator<String> it = key.iterator();
        System.out.println("----------------------------------------");

        while(it.hasNext()){//도시에 대한 정보 출력
            String cityname = it.next();
            Location s = manage.get(cityname);
            System.out.println(s.getCityName() + " " + s.getLongitude() + " " + s.getLatitude());
        }
        System.out.println("----------------------------------------");

        while(true){//도시이름을 그만이 입력되기 전까지 입력받고 탐색
            System.out.print("도시 이름 >> ");
            String cityname = scanner.next();

            if(cityname.equals("그만")) break;
            Location s = manage.get(cityname);
            if(s == null) System.out.println(cityname + "은 없는 도시입니다.");
            else s.findCity(cityname);
        }
        scanner.close();
        
    }
}
