package com.github.zcmjs.method;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Fork(value = 1, warmups = 1)
public class StringConcatBenchmark {

    @Benchmark
    public String testStringPlus() {
        String a = "Micro";
        String b = "benchmark";
        return a + b;
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public String testStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("Micro");
        sb.append("benchmark");
        return sb.toString();
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public String testStringBuffer() {
        StringBuffer sb = new StringBuffer();
        sb.append("Micro");
        sb.append("benchmark");
        return sb.toString();
    }

}
