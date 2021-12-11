package main.java.dogosan.DAO;

import main.java.dogosan.entity.Fridge;
import main.java.dogosan.entity.Kettle;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public interface KettleDAO {

    List<Kettle> allKettle() throws IOException, SAXException, ParserConfigurationException;
    Kettle getById(int id);

}
