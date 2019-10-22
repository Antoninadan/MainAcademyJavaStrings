package com.mainacad.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberManipulationServiceTest {

    @Test
    void testGetSumByDivision() {
        int result = NumberManipulationService.getSumByDivision(12345);
        assertEquals(15, result);
    }

    @Test
    void testGetSumByTypeManipulation() {
        int result = NumberManipulationService.getSumByTypeManipulation(12345);
        assertEquals(15, result);
    }
}