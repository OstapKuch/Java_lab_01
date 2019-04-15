package ua.lviv.iot.lab_08.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.lab_08.models.Animator;
import ua.lviv.iot.lab_08.repositories.AnimatorRepository;

import javax.validation.Valid;


@RestController
@Validated
public class HolidayController {
    @Autowired
    private AnimatorRepository animatorRepository;

    @GetMapping("/animators")
    public Iterable<Animator> getAllAxes() {

        return animatorRepository.findAll();

    }

    @GetMapping("/animators/{id}")
    public Animator getObject(@PathVariable Integer id) throws Exception {

        return (Animator) animatorRepository.findById(id).orElseThrow(()
                -> new Exception());
    }

    @PostMapping("/add")
    Animator NewAnimator(@Valid @RequestBody Animator newAnimator) {

        return animatorRepository.save(newAnimator);

    }

    @PutMapping("/animators/{id}")
    Animator updateAnimator(@Valid @RequestBody Animator newAnimator, @PathVariable Integer id) {

        return animatorRepository.findById(id)
                .map(animator -> {
                    animator.setAnimatorsQuantity(newAnimator.getAnimatorsQuantity());
                    animator.setAgeCategory(newAnimator.getAgeCategory());
                    animator.setChildrenNumber(newAnimator.getChildrenNumber());
                    animator.setDuration(newAnimator.getDuration());
                    animator.setId(newAnimator.getId());
                    animator.setPrice(newAnimator.getPrice());
                    animator.setType(newAnimator.getType());
                    animator.setId(id);
                    return animatorRepository.save(animator);
                })
                .orElseGet(() -> {
                    newAnimator.setId(id);
                    return animatorRepository.save(newAnimator);
                });

    }

    @DeleteMapping("/animators/delete/{id}")
    void deleteAnimators(@PathVariable Integer id) {

        animatorRepository.deleteById(id);

    }

}
