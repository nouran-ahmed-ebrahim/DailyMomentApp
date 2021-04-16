
package frams;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;


public class CustomCellRenderer extends ListPanel implements ListCellRenderer<ListPanel>{

    public CustomCellRenderer() {
        setOpaque(true);
    }

  
  

    @Override
    public Component getListCellRendererComponent(JList<? extends ListPanel> jlist, ListPanel e, int i, boolean bln, boolean bln1) {

      //  int SelectedIndex = ((Integer)e);
        if(bln)
        {
            setBackground(jlist.getSelectionBackground());
            setForeground(jlist.getSelectionForeground());
        }
        else
        {
             setBackground(jlist.getBackground());
            setForeground(jlist.getForeground());
        }
                
        this.fillPanel(e.getMomentName(), e.getMomentType(), "Rate : "+e.getRate(), "Year : "+e.getYear());
        
        return this;
    }
    
}
