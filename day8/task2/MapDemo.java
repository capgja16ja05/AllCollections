package day8.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import day6.task1.Camera;
import day6.task1.ElectronicDevice;
import day6.task1.Laptop;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("A", "bjibjkbjk");
		map.put("B", "2");
		map.put("C", "Two");
		map.put("A", "1+1");
		map.put("A", "2");
		
		
		System.out.println(map);
		String value = map.get("A");
		System.out.println(" Value "+value);
		
		new MapDemo().abcMapWork();
		
	}
	
	
	void abcMapWork()
	{
		Map<String, List<ElectronicDevice>> deviceMap = new HashMap<>();
		
		
		List<ElectronicDevice> hplaptopList = new ArrayList<>();
		hplaptopList.add(new Laptop("HP-123"));
		hplaptopList.add(new Laptop("HP-234"));
		hplaptopList.add(new Laptop("HP-544"));
		hplaptopList.add(new Laptop("HP-455"));
		
		insertDeviceIntoMap(deviceMap, "HP-Laptops", hplaptopList);
		
		List<ElectronicDevice> cameraList = new ArrayList<>();
		cameraList.add(new Camera("Sony-123"));
		cameraList.add(new Camera("Sony-435r3"));
		cameraList.add(new Camera("Sony-144r3"));
		cameraList.add(new Camera("Sony-54y3"));
		
		insertDeviceIntoMap(deviceMap, "Sony-Camera-InStock", cameraList);
		
		
		printMap(deviceMap);
		
		
		
	}
	
	
	

	public void insertDeviceIntoMap(Map<String, List<ElectronicDevice>> map,String key,List<ElectronicDevice> list)
	{
		map.put(key, list);
	}
	

	private void printMap(Map<String, List<ElectronicDevice>> deviceMap) {
		
		Iterator<String> itr = deviceMap.keySet().iterator();
		
		while(itr.hasNext())
		{
			String keyName = itr.next();
			List<ElectronicDevice> list = deviceMap.get(keyName);
			
			System.out.println("============="+" Device Information :- "+keyName+"=============");
			
			for (ElectronicDevice electronicDevice : list) {
				System.out.println(electronicDevice);
				
			}
		}
	}


}//end class















