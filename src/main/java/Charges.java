public class Charges {
    private final int malePenguin;
    private final int femalePenguin;
    private final int childPenguin;
    private final int festivalHikeForMale;
    private final int festivalHikeForFemale;
    private final int festivalHikeForBaby;
    private final int discountFor1000;

    public int getDiscountFor1000() {
        return discountFor1000;
    }

    public int getDiscountFor2000() {
        return discountFor2000;
    }

    private final int discountFor2000;


    public Charges(int malePenguin, int femalePenguin, int childPenguin, int festivalHikeForMale, int festivalHikeForFemale, int festivalHikeForBaby, int discountFor1000, int discountFor2000) {
        this.malePenguin = malePenguin;
        this.femalePenguin = femalePenguin;
        this.childPenguin = childPenguin;
        this.festivalHikeForMale = festivalHikeForMale;
        this.festivalHikeForFemale = festivalHikeForFemale;
        this.festivalHikeForBaby = festivalHikeForBaby;
        this.discountFor1000 = discountFor1000;
        this.discountFor2000 = discountFor2000;

    }


    public int getMalePenguin() {
        return malePenguin;
    }

    public int getFemalePenguin() {
        return femalePenguin;
    }

    public int getChildPenguin() {
        return childPenguin;
    }

    public int getFestivalHikeForMale() {
        return festivalHikeForMale;
    }

    public int getFestivalHikeForFemale() {
        return festivalHikeForFemale;
    }

    public int getFestivalHikeForBaby() {
        return festivalHikeForBaby;
    }


}
