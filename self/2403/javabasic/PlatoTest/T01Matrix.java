package com.ruby.java.jvbasicTest;

/*
 * 클래스 메소드 구현 실습 목적
 */
import java.util.Random;

class Matrix {
    int rows; // 행의 개수를 나타내는 변수
    int cols; // 열의 개수를 나타내는 변수
    int[] data; // 행렬의 데이터를 저장하는 배열

    // 생성자
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows * cols]; // 행렬의 크기에 맞게 데이터 배열 생성
    }

    // 난수로 데이터 초기화 메소드
    void getData() {
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(); // 데이터 배열에 랜덤한 값 할당
        }
    }

    // 행렬 덧셈 메소드
    Matrix addMatrix(Matrix b) { // Matrix b 는 더할 행렬(매개변수로 전달된 행렬)
        Matrix m = new Matrix(this.rows, this.cols); // 결과 행렬 생성
        // 각 요소별로 덧셈 연산 수행
        for (int i = 0; i < data.length; i++) {
            m.data[i] = this.data[i] + b.data[i];
        }
        return m; // 결과 행렬 반환, 호출한 곳으로 전달
    }

    // 행렬 곱셈 메소드
    Matrix multiplyMatrix(Matrix b) {
        Matrix m = new Matrix(this.rows, b.cols);
        // 행렬 곱셈 연산 수행
        for (int i = 0; i < this.rows; i++) { // i 는 결과 행렬의 행 인덱스 의미
            for (int j = 0; j < b.cols; j++) { // j 는 결과 행렬의 열 인덱스 의미
                for (int k = 0; k < this.cols; k++) { // k 는 내부 반복에 사용
                    m.data[i * m.cols + j] += this.data[i * this.cols + k] * b.data[k * b.cols + j];
                    // 결과 행렬 m 의 (i, j) 위치에 해당하는 요소의 값
                    // 현재 객체(왼쪽 행렬)의 (i, k)에 위치한 요소 * 인수로 전달된 행렬의 (k, j)에 위치한 요소
                }
            }
        }
        return m; // 결과 행렬 반환
    }

    // 행렬 전치 메소드
    Matrix transposeMatrix() {
        Matrix m = new Matrix(this.cols, this.rows); // 결과 행렬 생성
        // 행렬의 행과 열을 전치하여 저장
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                m.data[j * m.cols + i] = this.data[i * this.cols + j];
            }
        }
        return m; // 결과 행렬 반환
    }

    // 행렬 출력 메소드
    void showMatrix(String str) {
        System.out.println(str + ":");
        // 행렬을 행별로 출력
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i * cols + j] + "\t"); // 각 요소 출력
            }
            System.out.println(); // 행마다 줄바꿈
        }
        System.out.println(); // 전체 행렬 출력 후 한 줄 띄기
    }
}

public class T01Matrix {
    public static void main(String[] args) {
        /*
         * 난수 생성으로 초기화 A[3][4] = B[3][4] + C[3][4]; D[3][5] = B[3][4] * E[4][5]; F[4][3] = B[3][4]의 전치 행렬
         */
        Matrix B = new Matrix(3, 4); // B 행렬 생성
        Matrix C = new Matrix(3, 4); // C 행렬 생성
        Matrix A, D, F; // 결과 행렬을 저장할 변수 선언
        Matrix E = new Matrix(4, 5); // E 행렬 생성

        System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
        B.getData(); // B 행렬에 데이터 할당
        C.getData(); // C 행렬에 데이터 할당
        E.getData(); // E 행렬에 데이터 할당

        A = B.addMatrix(C); // B와 C 행렬을 더하여 A에 저장
        B.showMatrix("B[3][4]"); // B 행렬 출력
        C.showMatrix("C[3][4]"); // C 행렬 출력
        A.showMatrix("A[3][4]"); // A 행렬 출력

        System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
        D = B.multiplyMatrix(E); // B와 E 행렬을 곱하여 D에 저장
        B.showMatrix("B[3][4]"); // B 행렬 출력
        E.showMatrix("E[4][5]"); // E 행렬 출력
        D.showMatrix("D[3][5]"); // D 행렬 출력

        System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
        F = B.transposeMatrix(); // B 행렬의 전치 행렬을 구하여 F에 저장
        B.showMatrix("B[3][4]"); // B 행렬 출력
        F.showMatrix("F[4][3]"); // F 행렬 출력
    }
}
