import binds.MockBinding;
import com.google.inject.Guice;

public class Run {

    public static void main(String args[]) {
        Guice.createInjector(new MockBinding())
                .getInstance(PersonalInformationPublisher.class)
                .publishMultipleInformation();
    }
}
