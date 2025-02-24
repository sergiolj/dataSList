package list1.tadExerc.tad;

import list1.tadExerc.interfaces.PriorityClassifications;
import list1.tadExerc.models.Patient;

public class TadHospital extends MyListQueue<Patient> implements PriorityClassifications<Patient> { ;

    @Override
    public int priorityRules(Patient obj) {
        return 0;
    }
}
