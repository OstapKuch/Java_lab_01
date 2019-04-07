package ua.lviv.iot.lab_08.repositories;

import ua.lviv.iot.lab_08.models.TrampolineJumping;

import javax.transaction.Transactional;

@Transactional
public interface TrampolineRepository
        extends HolidayRepository<TrampolineJumping> {
}
