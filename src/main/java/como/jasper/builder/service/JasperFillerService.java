package como.jasper.builder.service;

import java.util.Map;

import net.sf.jasperreports.engine.JasperReport;

/**
 * 
 * 
 * @author Daniel Orlando López Ochoa
 */
public interface JasperFillerService {
	
	/**
	 * 
	 * @param parentReport
	 * @param subReport
	 * @param paramName
	 * @author Daniel Orlando López Ochoa
	 */
	public void addReportSubparam(
			JasperReport parentReport,
			JasperReport subReport, 
			String paramName);
	
	
	/**
	 * 
	 * @param mapParams
	 * @author Daniel Orlando López Ochoa
	 */
	public void addParams(Map<String,Object> mapParams);

}
