package mock;

import model.PersonalData;
import org.apache.commons.lang3.RandomStringUtils;
import provider.PersonalDataProvider;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonalDataProviderMock implements PersonalDataProvider {

    @Override
    public List<PersonalData> getPersonalData(int recordsNumber) {
        return Stream.iterate(0, n -> n + 1)
                .limit(recordsNumber)
                .map(magic -> createRandomPersonalData())
                .collect(Collectors.toList());
    }

    private PersonalData createRandomPersonalData() {
        String randomNumeric = RandomStringUtils.randomNumeric(4);
        String email = randomNumeric + "random@gmail.com";
        String name = "MockName_" + randomNumeric;
        String lastName = "MockLatName_" + randomNumeric;
        int personalNumber = Integer.valueOf(RandomStringUtils.randomNumeric(9));

        return new PersonalData(email, name, lastName, "Haifa", "Israel", personalNumber);
    }

}
