package main.java.dogosan.DAO;

import main.java.dogosan.entity.Fridge;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public interface FridgeDAO {

    List<Fridge> allFridge() throws IOException, SAXException, ParserConfigurationException;
    Fridge getById(int id);

}
