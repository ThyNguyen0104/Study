package com.baothy.heath.core;

public class BmiCalculator {
    //hàm static tính chỉ số khối cơ thể dựa trên chiều cao và cân nặng
    // bmi = cân nặng (kg) / chiều cao (m) bình phương
    //bmi
    public double getBmi(double height, double weight) {
        return weight / (height * height);
    }
}
