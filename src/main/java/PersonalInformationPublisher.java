import com.google.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import provider.PersonalDataProvider;

public class PersonalInformationPublisher {

    private static final Logger LOG = LogManager.getLogger();

    @Inject
    private PersonalDataProvider personalDataProvider;

    public void publishMultipleInformation() {
        LOG.info("\n Multiple records \n");
        personalDataProvider.getPersonalData(5).forEach(record -> LOG.info(record.toString()));
    }
}
