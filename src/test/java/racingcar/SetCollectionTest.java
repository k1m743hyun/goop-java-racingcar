package racingcar;

import java.util.HashSet;
import java.util.Set;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetCollectionTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void firstOfRequirement1() {

        // given

        // when
        SetCollection setCollection = new SetCollection(numbers);
        int result = setCollection.size();

        // then
        Assertions.assertThat(result).isEqualTo(3);
    }
}
