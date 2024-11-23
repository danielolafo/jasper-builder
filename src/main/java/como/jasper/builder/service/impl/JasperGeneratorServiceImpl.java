package como.jasper.builder.service.impl;

import como.jasper.builder.exception.JasperException;
import como.jasper.builder.service.JasperGeneratorService;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;

public class JasperGeneratorServiceImpl implements JasperGeneratorService {

	@Override
	public JasperReport compileTemplate(JasperDesign jasperDesign) throws JasperException {
		// TODO Auto-generated method stub
		try {
			return JasperCompileManager.compileReport(jasperDesign);
		} catch (JRException e) {
			throw new JasperException();
		}
	}

	@Override
	public byte[] getFileContent(JasperPrint jasperPrint) {
		try {
			return JasperExportManager.exportReportToPdf(jasperPrint);
		} catch (JRException e) {
			return null;
		}
	}

}
