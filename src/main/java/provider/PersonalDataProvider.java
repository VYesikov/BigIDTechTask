package provider;

import model.PersonalData;

import java.util.List;

public interface PersonalDataProvider {

    List<PersonalData> getPersonalData(int recordsNumber);
}


