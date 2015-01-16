package info.tkware;

//All of our languages will have certain attributes, so we'll stick them together with a class.
//Normally I would do this with a struct, but Java doesn't have such a concept.

public class ProgrammingLanguage {
    public String name;
    public boolean verbose;
    public boolean easyToWrite;
    public boolean strangeConventions;
    public boolean fast;
    public String mostLike;
    public String comments;


    //All languages suck, usually at the same things, so let's just declare our insults ahead of time to save space.
    private String insultVerbosity = "Why not just write in COBOL instead? Why is this crap so verbose?";
    private String insultEasy = "Why do I require a CS degree to understand this language?";
    private String insultSlow = "A guy on an abacus would be faster! Why is this so slow?";
    private String insultStrange = "Who designed this crap?";
    private String universalDeclaration = "It sucks!";

    private boolean universalDeclarationMade = false; //We have nothing to complain about.. at first


    public void makeUniversalDeclarationIfNecessary() {
        if (!universalDeclarationMade) {
            System.out.println(universalDeclaration);
            this.universalDeclarationMade = true;
        }
    }

    //Here's our insulting function, mock().
    public void mock() {
        System.out.printf("Let's talk about %s.\n", this.name);
        System.out.printf("It's most like %s.\n", this.mostLike);
        System.out.printf("Also, %s\n", this.comments);


        if (this.isVerbose()) {
            makeUniversalDeclarationIfNecessary();
            System.out.println(insultVerbosity);
        }

        if (!this.isEasyToWrite()) {
            makeUniversalDeclarationIfNecessary();
            System.out.println(insultEasy);
        }

        if (!this.isFast()) {
            makeUniversalDeclarationIfNecessary();
            System.out.println(insultSlow);
        }

        if (this.isStrangeConventions()) {
            makeUniversalDeclarationIfNecessary();
            System.out.println(insultStrange);
        }

        //Laws of the universe dictate this assertion will never fail.
        assert universalDeclarationMade;

        System.out.println("\n\n");
    }

    //The IDE did all of the following for me - thanks IntelliJ :3
    public boolean isVerbose() {
        return verbose;
    }

    public boolean isStrangeConventions() {
        return strangeConventions;
    }

    public boolean isFast() {
        return fast;
    }

    public boolean isEasyToWrite() {
        return easyToWrite;
    }

}
