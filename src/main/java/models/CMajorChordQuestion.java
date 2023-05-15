//package models;
//
//import SoundFiles.*;
//import logger.Logger;
//import models.Chord;
//import ui.UserInput;
//import ui.UserOutput;
//
//import java.util.Map;
//import java.util.Random;
//import java.util.Scanner;
//
//public class CMajorChordQuestion {
//
//    private Chord C_I_Chord;
//    private String C_I_Question;
//    private String C_I_Answer;
//
//    private Chord C_ii_Chord;
//    private String C_ii_Question;
//    private String C_ii_Answer;
//
//    private Chord C_iii_Chord;
//    private String C_iii_Question;
//    private String C_iii_Answer;
//
//    private Chord C_IV_Chord;
//    private String C_IV_Question;
//    private String C_IV_Answer;
//
//    private Chord C_V_Chord;
//    private String C_V_Question;
//    private String C_V_Answer;
//
//    private Chord C_vi_Chord;
//    private String C_vi_Question;
//    private String C_vi_Answer;
//
//    private Chord C_viio_Chord;
//    private String C_viio_Question;
//    private String C_viio_Answer;
//
//    private Map<String, Chord> soundFilesMap;
//    private Logger logger;
//
//    public CMajorChordQuestion(Map<String, Chord> soundFilesMap, Logger logger) {
//        this.soundFilesMap = soundFilesMap;
//        this.logger = logger;
//        this.C_I_Chord = soundFilesMap.get("CEG");
//        this.C_I_Question = "Spell the notes for Chord I in C";
//        this.C_I_Answer = "CEG";
//
//        this.C_ii_Chord = soundFilesMap.get("DFA");
//        this.C_ii_Question = "Spell the notes for Chord ii in C";
//        this.C_ii_Answer = "DFA";
//
//        this.C_iii_Chord = soundFilesMap.get("EGB");
//        this.C_iii_Question = "Spell the notes for Chord iii in C";
//        this.C_iii_Answer = "EGB";
//
//        this.C_IV_Chord = soundFilesMap.get("FAC");
//        this.C_IV_Question = "Spell the notes for Chord IV in C";
//        this.C_IV_Answer = "FAC";
//
//        this.C_V_Chord = soundFilesMap.get("GBD");
//        this.C_V_Question = "Spell the notes for Chord V in C";
//        this.C_V_Answer = "GBD";
//
//        this.C_vi_Chord = soundFilesMap.get("ACE");
//        this.C_vi_Question = "Spell the notes for Chord vi in C";
//        this.C_vi_Answer = "ACE";
//
//        this.C_viio_Chord = soundFilesMap.get("BDF");
//        this.C_viio_Question = "Spell the notes for Chord viio in C";
//        this.C_viio_Answer= "BDF";
//    }
//
//    public void askQuestionInCMajor() {
//        Scanner scanner = new Scanner(System.in);
//        UserOutput.openingGraphics();
//
//        String choice = UserInput.chooseYourKeySignature();
//        System.out.println(choice);
//
//        System.out.println(C_I_Question);
//        String userQuestion = scanner.nextLine();
//
//        if (userQuestion.equalsIgnoreCase(C_I_Answer)) {
//            System.out.println("Correct!");
//            C_I_Chord.play();
//            logger.write2("C major", userQuestion, C_I_Answer);
//        } else {
//            System.out.println("Incorrect!");
//            playRandomWrongTracks(soundFilesMap);
//            logger.write2("C major", userQuestion, C_I_Answer);
//        }
//    }
//
//    private void playRandomWrongTracks(Map<String, Chord> soundFilesMap) {
//        String[] keys = {"DFA", "EGB", "FAC", "GBD", "ACE"};
//        String key = keys[new Random().nextInt(keys.length)];
//        soundFilesMap.get(key).play();
//    }
//}
