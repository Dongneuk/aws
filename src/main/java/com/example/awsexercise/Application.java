package com.example.awsexercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링부트의 자동 설정, 스프링 Bean 읽기와 생성 모두 자동 설정, 프로젝트 최상단에 위치해야 한다.
public class Application { // 앞으로 만들 프로젝트의 메인 클래스

    public static void main(String[] args) { // 내장 WAS 실행(별도로 외부에 WAS 두지 않고 내부 WAS 실행한다) -> 서버에 톰캣 설치할 필요 없고, 스프링 부트로 만들어진 Jar 파일로 실행한다.
        SpringApplication.run(Application.class, args);
    }
}
