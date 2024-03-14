package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExerciseTest {
    @Test
    void returnsHelloWorld() {
        Exercise exercise = new Exercise();

        assertThat(exercise.helloWorld()).isEqualTo("Hello world");
    }
}