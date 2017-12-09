package demo;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Start {

	public static void main(String[] args) throws URISyntaxException, IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
		List<String> warnings = new ArrayList<>();
		File configFile = new File(Start.class.getResource("/generatorConfig.xml").toURI());
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback shellCallback = new DefaultShellCallback(true);
		MyBatisGenerator mybatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
		mybatisGenerator.generate(null);
		System.out.println(warnings);
	}
}
