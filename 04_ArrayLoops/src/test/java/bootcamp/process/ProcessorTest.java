package bootcamp.process;

import bootcamp.data.Summary;
import bootcamp.processor.Processor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class ProcessorTest {

    @Test
    public void shouldGetSummaryWithCorrectValuesWhenProcessingValidArray() {
        //given
        double[] ar = {5, 7, 9, 3, 1};
        //when
        Processor processor = new Processor(ar);
        Summary summary = processor.process();
        //then
        assertEquals(new Summary(1, 9, 25, 5, 5), summary);
    }

    @Test
    public void shouldGetDefaultSummaryWhenProcessingEmptyArray() {
        //given
        double[] ar = {};
        double zero = 0;
        double NaN = Double.NaN;
        //when
        Processor processor = new Processor(ar);
        Summary summary = processor.process();
        //then
        assertThat(summary.getMin(),is(NaN));
        assertThat(summary.getMax(),is(NaN));
        assertThat(summary.getAverage(),is(NaN));
        assertThat(summary.getSum(),is(zero));
        assertThat(summary.getCount(),is(zero));
    }

    @Test
    public void shouldReturnValueAtGivenArrayIndex() {
        //given
        double[] ar = {5, 7, 9, 3, 1};

        //when
        Processor processor = new Processor(ar);
        double result = processor.getValue(2);
        double expectedResult = 9;
        //then
        assertThat(result, is(expectedResult));

    }

    @Test
    public void shouldGetNaNFromGetValueWhenIndexTooLarge() {
        //given
        double[] ar = {5, 7, 9, 3, 1};
        //when
        Processor processor = new Processor(ar);
        double result = processor.getValue(7);
        //then
        assertThat(result, is(Double.NaN));
    }
}
