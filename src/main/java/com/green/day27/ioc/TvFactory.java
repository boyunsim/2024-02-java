package com.green.day27.ioc;

import com.green.day27.*;

public class TvFactory {
    //SingleTon 패턴, 싱글톤 패턴
    //객체는 딱 하나만 만들어서 돌려쓴다.
    private static TvFactory tvFactory;
    public static TvFactory getInstance() {
        if(tvFactory == null) {
            tvFactory = new TvFactory();
        }
        return tvFactory;
    }


    private TvFactory() {} //생성자 앞에 private을 붙여서 외부에서는 객체화 할 수 없게 만들었다.

    public Tv factory (String tvName, String speakerName, String wooferName) {
        Woofer woofer = switch (wooferName) {
            case "hanil" -> new HanilWoofer();
            case "marten" -> new MartenWoofer();
            default -> null;
        };

        Speaker speaker = switch (speakerName) {
            case "bose" -> new BoseSpeaker(woofer);
            case "genelec" -> new GenelecSpeaker(woofer);
            default -> null;
        };

        Tv tv = switch (tvName) {
            case "lg" -> new LgTv(speaker);
            default -> null;
        };
        return tv;
    }
}
