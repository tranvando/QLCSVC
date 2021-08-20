/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTable;


    
    
import java.text.Format;
import javax.swing.table.DefaultTableCellRenderer;

/*
 *	Use a formatter to format the cell Object
 */
public class FormatRenderer extends DefaultTableCellRenderer
{
	private Format formatter;

	
	public FormatRenderer(Format formatter)
	{
		this.formatter = formatter;
	}

	public void setValue(Object value)
	{
		//  Format the Object before setting its value in the renderer

		try
		{
			if (value != null)
				value = formatter.format(value);
		}
		catch(IllegalArgumentException e) {}

		super.setValue(value);
	}
}