package com.github.zcmjs;

import com.github.zcmjs.method.StringConcatBenchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(StringConcatBenchmark.class.getSimpleName())
                .build();

        new Runner(opt).run();


//        Standardowe domyślne wartości JMH (gdy nigdzie ich nie nadpiszesz) to:
//        Forks: 5
//        Warmup Iterations: 5
//        Measurement Iterations: 5

//        https://stackoverflow.com/questions/36152872/jmh-start-script-e-g-set-iterations5

    }
}