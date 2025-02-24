package list1.tadExerc.tad;

import list1.tadExerc.interfaces.PriorityClassifications;
import list1.tadExerc.models.NaturalPerson;

import java.time.LocalDate;

public class TadHospital extends MyListQueue<NaturalPerson> implements PriorityClassifications<NaturalPerson> {
    private LocalDate timeArrived;

    @Override
    public int priorityRules(NaturalPerson obj) {
        return 0;
    }
}
