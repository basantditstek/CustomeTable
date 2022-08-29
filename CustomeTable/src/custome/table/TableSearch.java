

package custome.table;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

class TableSearch  
{
    
    
    public static void main(String[] args)throws Exception
    {
        
        
      HashMap<String,Integer> columns = new HashMap<String,Integer>();
      columns.put("Exp", 2);
      columns.put("Name",0);
      columns.put("Technology",1);
      columns.put("Version",3); 
        
      String search[]={"Technology","Version","Name"};
       //String search[]={"Name"};
      String columnNamesPrint[]= {"Technology","Exp","Version"};
       
      // String columnNamesPrint[]={"City"};
      Object rowData[][]={{"Raja", "Java","5","7"},{"Vineet", "Java Script","3","2"},{"Archana", "Python","5","1"},{"Krishna", "Scala","8","8"},{"Adithya", "AWS","7","7"},{"Jai", ".Net","6","6"}};;
       
      String title="Custom Table Search";
      
      String imgName="hth_logo.png";
       
       int frameWidth=650;
       int frameHeight=650;
       
       
      //new CustomTable(search,columnNamesPrint,rowData,columns,title,frameHeight,frameWidth);
      
      CustomTable technologyTable=new CustomTable();
      technologyTable.setTitle(title);
      technologyTable.setColumnNamesPrint(columnNamesPrint);
      technologyTable.setColumns(columns);
      technologyTable.setRowData(rowData);
      technologyTable.setSearch(search);
      technologyTable.setFrameHeight(frameHeight);
      technologyTable.setFrameWidth(frameWidth);
     //technologyTable.setImageName(imgName);
      technologyTable.drawTable();
      
    }
}
