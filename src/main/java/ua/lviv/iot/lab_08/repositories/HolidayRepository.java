package ua.lviv.iot.lab_08.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.lab_08.models.HolidayForChildren;

public interface HolidayRepository<T extends HolidayForChildren>
        extends CrudRepository<T, Integer> {
}
