/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTable;

import java.text.NumberFormat;
import javax.swing.SwingConstants;

public class NumberRenderer extends FormatRenderer
{
	/*
	 *  Use the specified number formatter and right align the text
	 */
	public NumberRenderer(NumberFormat formatter)
	{
		super(formatter);
		setHorizontalAlignment( SwingConstants.LEFT );
	}

	public static NumberRenderer getIntegerRenderer()
	{
		return new NumberRenderer( NumberFormat.getIntegerInstance() );
	}

}
