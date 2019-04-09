package com.learnspark.demo;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;

public class FirstSparkCodeDemo {
    public static void main(String[] args){
        SparkConf conf = new SparkConf().setMaster("local").setAppName("My App");
        JavaSparkContext sc = new JavaSparkContext(conf);
        JavaRDD<String> lines = sc.textFile("D:\\学习\\spark\\spark-2.4.0-bin-hadoop2.7\\README.md");
        System.out.println(lines.count());
        System.out.println(lines.first());;

//        JavaRDD<String> pythonlines = lines.filter(
//                new Function<String, Boolean>() {
//                    public Boolean call(String line) throws Exception {
//                        return line.contains("Python");
//                    }
//                }
//        );
    }
}
