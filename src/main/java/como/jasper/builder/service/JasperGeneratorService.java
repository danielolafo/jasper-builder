package como.jasper.builder.service;

import como.jasper.builder.exception.JasperException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;

public interface JasperGeneratorService {
	
	
	/**
	 * 
	 * @param jasperDesign
	 * @return
	 * @author Daniel Orlando López Ochoa
	 * @throws JasperException 
	 */
	public JasperReport compileTemplate(JasperDesign jasperDesign) throws JasperException;
	
	
	/**
	 * 
	 * @param jasperPrint
	 * @return
	 * @author Daniel Orlando López Ochoa
	 */
	public byte[] getFileContent(JasperPrint jasperPrint);

}
