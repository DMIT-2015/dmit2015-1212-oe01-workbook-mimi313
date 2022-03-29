package dmit2015.dmit20151212jsfdemo.view;

import dmit2015.dmit20151212jsfdemo.model.WeatherService;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.omnifaces.util.Messages;

@Named
public class WeatherServiceController {

    @Inject
    @RestClient
    private WeatherService _weatherService;

    @Inject
    @ConfigProperty(name="api.openweathermap.org.ApiKey")
    private String _weatherApi;

    @Getter
    private OpenWeatherData watherData;

    @PostConstruct
    void init() {
        try {
            watherData = _weatherService.findByCityName("Edmonton", _weatherApi, "metric");
        } catch (Exception ex) {
            ex.printStackTrace();
            Messages.addGlobalError("Error fetching weather data with exception {0}", ex.getMessage());
        }
    }
}
