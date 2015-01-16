/**
 * programming.java -- Hello world, with an acerbic twist
 *
 * @author Michael Parks <mparks@tkware.info>
 * @version 1.0
 *
 */
package info.tkware;

import java.util.ArrayList;
import java.util.List;

public class main {


    public static void main(String[] args) {
        System.out.println("Programming language criticisms!\n");

        //Here's the languages we'll test and some general observations
        ProgrammingLanguage golang = new ProgrammingLanguage() {{
            name = "Go";
            verbose = true;
            easyToWrite = true;
            strangeConventions = true;
            fast = true;
            mostLike = "C languages";
            comments = "It's a Googler's best friend!";
        }};
        ProgrammingLanguage java = new ProgrammingLanguage() {{
            name = "Java";
            verbose = true;
            easyToWrite = false;
            strangeConventions = true;
            fast = true;
            mostLike = "nothing, it's in a class of its own";
            comments = "Holy verbosity batman!";
        }};
        ProgrammingLanguage ruby = new ProgrammingLanguage() {{
            name = "Ruby";
            verbose = false;
            easyToWrite = true;
            strangeConventions = true;
            fast = false;
            mostLike = "Smalltalk or Perl";
            comments = "It's extraordinarily easy to read and write (if a bit slow!)";
        }};
        ProgrammingLanguage python = new ProgrammingLanguage() {{
            name = "Python";
            verbose = false;
            easyToWrite = true;
            strangeConventions = true;
            fast = true;
            mostLike = "Pseudocode. seriously.";
            comments = "It's fast and easy to write, but mind the whitespace!";
        }};
        ProgrammingLanguage c = new ProgrammingLanguage() {{
            name = "C";
            verbose = true;
            easyToWrite = false;
            strangeConventions = false;
            fast = true;
            mostLike = "nothing else";
            comments = "It's super fast, but super verbose! Watch for memory leaks!";
        }};

        //Let's stick these in an array or something so we can iterate them:

        List<ProgrammingLanguage> languages = new ArrayList<>();

        languages.add(java);
        languages.add(golang);
        languages.add(ruby);
        languages.add(c);
        languages.add(python);

        for (ProgrammingLanguage lang : languages) {
            lang.mock();
        }

    }
}
