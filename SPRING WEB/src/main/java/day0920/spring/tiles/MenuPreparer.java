package day0920.spring.tiles;

import java.util.ArrayList;
import java.util.List;

import org.apache.tiles.Attribute;
import org.apache.tiles.AttributeContext;
import org.apache.tiles.preparer.ViewPreparer;
import org.apache.tiles.request.Request;

public class MenuPreparer implements ViewPreparer{
	
	public void execute(Request tilesContext,
			AttributeContext attributeContext){
		List<String> menuList = new ArrayList<String>();
		menuList.add("Ȩ");
		menuList.add("�α���");
		menuList.add("ȸ������");
		
	}

}
