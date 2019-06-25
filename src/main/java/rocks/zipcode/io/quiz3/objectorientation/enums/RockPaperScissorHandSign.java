package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("ROCK","SCISSOR","PAPER"), PAPER("PAPER", "ROCK", "SCISSOR"), SCISSOR("SCISSOR", "PAPER", "ROCK");

    private String value;
    private String beats;
    private String loses;

    RockPaperScissorHandSign(String value, String beats, String loses){
        this.value = value;
        this.beats = beats;
        this.loses = loses;
    }


    public RockPaperScissorHandSign getWinner() {
        System.out.println(valueOf(loses));
        return this.valueOf(loses);
    }

    public RockPaperScissorHandSign getLoser() {
        return this.valueOf(beats);
    }

}
