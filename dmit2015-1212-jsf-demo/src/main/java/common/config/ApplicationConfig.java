package common.config;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.annotation.sql.DataSourceDefinitions;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.annotation.FacesConfig;

@DataSourceDefinitions({

		@DataSourceDefinition(
				name="java:app/datasources/mssqlDS",
				className="com.microsoft.sqlserver.jdbc.SQLServerDataSource",
				url="jdbc:sqlserver://DMIT-Capstone1.ad.sast.ca;databaseName=DMIT2015_1212_E01_mtada1;TrustServerCertificate=true",
				user="mtada1",
				password="RemotePassword200457656"),

})

@FacesConfig
@ApplicationScoped
public class ApplicationConfig {

}