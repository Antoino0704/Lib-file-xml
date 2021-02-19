package xmllib;

import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXml {
	private File fp;
	private DocumentBuilderFactory fv;
	private DocumentBuilder fb;
	private Document doc;
	private NodeList nd;
	private Node n;
	private Element el;
	
	
	public ReadXml(String path)
	{
		fp = new File(path);
		try {
			fv = DocumentBuilderFactory.newInstance();
			fb = fv.newDocumentBuilder();
			doc = fb.parse(fp);
		}
		catch (Exception e1) {
			return;
		}
	}
	
	
	public String getTag(String tag, int count)
	{
		String testo = null;
		n = nd.item(count);
		el = (Element) n;
		testo = el.getElementsByTagName(tag).item(0).getTextContent();

		return testo;
	}
	
	public String getTag(String listaNodo, String tag, int count)
	{
		String testo = null;
		nd = doc.getElementsByTagName(listaNodo);
		n = nd.item(count);
		el = (Element) n;
		testo = el.getElementsByTagName(tag).item(0).getTextContent();

		return testo;
	}
	
	public int getLenght(String listaNodo) {
		nd = doc.getElementsByTagName(listaNodo);
		return nd.getLength();
	}
}
