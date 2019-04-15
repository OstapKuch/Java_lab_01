package ua.lviv.iot.lab_08.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import ua.lviv.iot.lab_08.models.Animator;
import ua.lviv.iot.lab_08.models.AnimatorType;
import ua.lviv.iot.lab_08.repositories.AnimatorRepository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application-test.properties")
public class HolidayControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    AnimatorRepository animatorRepository;

    private Animator animator;

    public static String asJson(final Object obj) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonContent = mapper.writeValueAsString(obj);
            return jsonContent;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Before
    public void setUp() {
        this.animator = new Animator(
                1200.0,
                2.5,
                3,
                6,
                AnimatorType.PHAMTOMIMIST,
                12);
        animatorRepository.save(this.animator);
    }

    @After
    public void cleanUp() {
        Integer id = this.animator.getId();
        if (animatorRepository.findById(id).isPresent()) {
            animatorRepository.deleteById(id);
        }
    }

    @Test
    public void writeToDBTest() {
        if (animatorRepository.findById(animator.getId()).isPresent()) {
            assertEquals(this.animator.toString(), animatorRepository.findById(animator.getId()).get().toString());
        }
    }

    @Test
    public void returningAnimatorTest() throws Exception {
        Integer id = this.animator.getId();
        this.mockMvc.perform(get("/animators/{id}", id.toString()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.type").value(AnimatorType.PHAMTOMIMIST.toString()));
    }

    @Test
    public void creatingAnimatorTest() throws Exception {
        this.mockMvc.perform(post("/add")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJson(this.animator)))
                .andExpect(status().isOk());
    }

    @Test
    public void updatingAnimatorTest() throws Exception {
        Integer id = this.animator.getId();
        Animator animator = new Animator(
                1200.0,
                2.5,
                3,
                6,
                AnimatorType.PHAMTOMIMIST,
                12);
        this.mockMvc.perform(put("/animators/{id}", id.toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJson(animator)))
                .andExpect(status().isOk());
        if(animatorRepository.findById(id).isPresent()) {
            Animator foundAnimator = animatorRepository.findById(id).get();
            assertEquals(animator.getChildrenNumber(), foundAnimator.getChildrenNumber());
        }
        }

    @Test
    public void deletingAnimatorTest() throws Exception {
        Integer id = this.animator.getId();
        this.mockMvc.perform(delete("/animators/delete/{id}", id.toString()))
                .andExpect(status().isOk());
        assertFalse(animatorRepository.findById(id).isPresent());
    }

    @Test
    public void validationCreationTest() throws Exception {
        this.mockMvc.perform(post("/animators")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJson("Not valid animator")))
                .andExpect(status().is(405));
    }

    @Test
    public void validationUpdatingTest() throws Exception {
        Integer id = this.animator.getId();
        this.mockMvc.perform(put("/animators/{id}", id.toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJson("Not valid animator")))
                .andExpect(status().is(400));
    }
}
