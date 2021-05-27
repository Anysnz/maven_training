package fr.lernejo;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    static final Sample s = new Sample();

    @org.junit.jupiter.api.Test
    void Add_addition() {
        assertEquals(4, s.op(Sample.Operation.ADD, 2,2));
    }

    @org.junit.jupiter.api.Test
    void Add_soustraction() {
        assertEquals(-1, s.op(Sample.Operation.ADD, 1,-2));
    }

    @org.junit.jupiter.api.Test
    void Mult_deux() {
        assertEquals(4, s.op(Sample.Operation.MULT, 2,2));
    }

    @org.junit.jupiter.api.Test
    void Mult_trois() {
        assertEquals(330, s.op(Sample.Operation.MULT, 33,10));
    }

    @org.junit.jupiter.api.Test
    void Fact_zero() {
        assertEquals(1, new Sample().fact(0));
    }

    @org.junit.jupiter.api.Test
    void Fact_seven() {
        assertEquals(5040, new Sample().fact(7));
    }

    @org.junit.jupiter.api.Test
    void Fact_negative() {
        assertThrows(IllegalArgumentException.class, () -> new Sample().fact(-10));
    }

}
