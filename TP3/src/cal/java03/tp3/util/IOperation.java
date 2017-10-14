package cal.java03.tp3.util;

import java.math.BigDecimal;

import cal.java03.tp3.bean.Portefeuille;

public interface IOperation {
	public void acheterAction(String symboleAction,BigDecimal nbActions) throws Exception;
	public void vendreAction();
	public void fermerPortefeuille();
	public void  ouvrirPortefeuille();
}
