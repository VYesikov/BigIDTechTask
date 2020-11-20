package binds;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import mock.PersonalDataProviderMock;
import provider.PersonalDataProvider;

public class MockBinding extends AbstractModule {

    @Override
    protected void configure() {
        bind(PersonalDataProvider.class).to(PersonalDataProviderMock.class).in(Singleton.class);
    }
}
