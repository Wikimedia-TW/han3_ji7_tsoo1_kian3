package cc.moveable_type;

import cc.adjusting.ChineseCharacterTypeAdjuster;
import cc.core.ChineseCharacter;
import cc.printing.ChineseCharacterTypePrinter;

/**
 * 漢字活字樹狀結構的葉子。「獨體為文，合體為字」，樹狀結構中的葉子為文，其他上層節點為字。
 * <code>ChineseCharacterMovableTypeWen</code> 記錄活字的排版資訊。
 * 
 * @author Ihc
 */
public class ChineseCharacterMovableTypeWen extends ChineseCharacterMovableType
{
	/**
	 * 以<code>ChineseCharacter</code>部件結構建立文活字結構
	 * 
	 * @param chineseCharacter
	 *            部件結構
	 */
	public ChineseCharacterMovableTypeWen(ChineseCharacter chineseCharacter)
	{
		super(chineseCharacter);
	}

	@Override
	public void adjust(ChineseCharacterTypeAdjuster adjuster)
	{
		adjuster.adjustWen(this);
		return;
	}

	@Override
	public void print(ChineseCharacterTypePrinter printer)
	{
		printer.printWen(this);
		return;
	}
}
