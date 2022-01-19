package ca.nait.dmit.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlbertaCovid19CaseManagerTest {

//    private static AlbertaCovid19CaseManager caseManager;
//
//    @BeforeAll
//    static void beforeAll() throws IOException {
//        caseManager = new AlbertaCovid19CaseManager();
//    }

    AlbertaCovid19CaseManager caseManager;

    @BeforeEach
    void setUp() throws IOException {
//        caseManager = new AlbertaCovid19CaseManager();
        caseManager = AlbertaCovid19CaseManager.getInstance();
    }

    @Test
    void getAlbertaCovid19CaseList() {
        assertEquals(452381, caseManager.getAlbertaCovid19CaseList().size());
    }
    
    @Test
    void distinctAhsZone() {
//        caseManager.findDistinctAhsZone().forEach(System.out::println);
        List<String> ahsZoneList = caseManager.findDistinctAhsZone();

        // The next two lines are the same
//        ahsZoneList.stream().forEach(System.out::println);
        ahsZoneList.stream().forEach(item -> System.out.println(item));

        assertEquals(6, caseManager.findDistinctAhsZone().size());
    }

    @Test
    void activeCaseCount() {
        assertEquals(72_368, caseManager.activeCaseCount());
    }

    @Test
    void activeCaseCountByZone() {
        assertEquals(26_002, caseManager.activeCaseCountByAhsZone("Edmonton Zone"));
        assertEquals(29_544, caseManager.activeCaseCountByAhsZone("Calgary Zone"));
    }

    @Test
    void caseReportedCountByAhsZoneAndDateRange() {
        assertEquals(15_699, caseManager.caseReportedCountByAhsZoneAndDateRange("Edmonton Zone", LocalDate.parse("2022-01-07"), LocalDate.parse("2022-01-13")));
        assertEquals(19_434, caseManager.caseReportedCountByAhsZoneAndDateRange("Calgary Zone", LocalDate.parse("2022-01-07"), LocalDate.parse("2022-01-13")));
    }
}















