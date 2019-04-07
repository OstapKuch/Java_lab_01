package ua.lviv.iot.lab_08.repositories;

import ua.lviv.iot.lab_08.models.Animator;

import javax.transaction.Transactional;

@Transactional
public interface AnimatorRepository extends HolidayRepository<Animator> {
}
