package com.silence.arts.study;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import scala.Tuple2;

import java.util.Arrays;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) {

//        SparkConf conf = new SparkConf();
//        conf.setMaster("local");
//        conf.setAppName("wordCount");
//        JavaSparkContext sc = new JavaSparkContext(conf);
//
//        JavaRDD<String> input = sc.textFile("/opt/logs/adPv_dev_0");
//        JavaRDD<String> words = input.flatMap((FlatMapFunction<String, String>) x -> Arrays.asList((String) x.split(" ")));
//        JavaPairRDD<String, Integer> result = words.mapToPair(
//                (PairFunction<String, String, Integer>) x -> new Tuple2(x, 1)).reduceByKey(
//                (Function2<Integer, Integer, Integer>) (a, b) -> a + b);
//
//        Map<String, Integer> map = result.collectAsMap();
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + "---" + entry.getValue());
//        }

    }


}