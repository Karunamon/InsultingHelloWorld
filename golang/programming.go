//programming.go - Hello world, with an acerbic twist
//Michael Parks, 2014, WTFPL

package main //Every standalone program begins with this package

import "fmt" //We need this to output to the screen

//All languages suck, usually at the same things, so let's just declare our insults head of time to save space.
//All string constants, note the reverse declaration order (name) (type)
const InsultVerbosity string = "Why not just write in COBOL instead? Why is this crap so verbose?"
const InsultEasy string = "Why do I require a CS degree to understand this language?"
const InsultSlow string = "A guy on an abacus would be faster! Why is this so slow?"
const InsultStrange string = "Who desgined this crap?"
const UniversalDeclaration string = "It sucks!"

//All of our languages will have certain attributes. A type can be many things, but in this case,
//we're declaring a struct.
type ProgrammingLanguage struct {
	Name               string
	Verbose            bool
	EasyToWrite        bool
	StrangeConventions bool
	Fast               bool
	MostLike           string
	Comments           string
}

//Here's the languages we'll test and some general observations
var langs = map[string]ProgrammingLanguage{
	//We can declare struct contents either positionally or with names of the struct members
	"Go":     ProgrammingLanguage{Name: "Go", Verbose: true, EasyToWrite: true, StrangeConventions: true, Fast: true, MostLike: "C languages", Comments: "You're using it right now!"},
	"Java":   ProgrammingLanguage{"Java", true, false, false, true, "nothing, really", "It's quite popular and runs anywhere!"},
	"Ruby":   ProgrammingLanguage{"Ruby", false, true, true, false, "perl or smalltalk", "It's easy to write and read!"},
	"Python": ProgrammingLanguage{"Python", false, true, true, true, "pseudocode", "It's extraordinarily easy to read!"},
	"C":      ProgrammingLanguage{"C", true, false, false, true, "nothing else", "It's *the* low level language!"},
}

/*
/Here's our insulting function, Mock. ProgrammingLanguage is a "reciever" of
/this function, or more accurately, every instance of ProgrammingLanguage now
/has it as a valid method. We don't need to declare a return type since there
/is no return here.
*/

func (p ProgrammingLanguage) Mock() {
	insulted := false //We have nothing to complain about to start.

	fmt.Println("Let's talk about " + p.Name)
	fmt.Println("It's most like " + p.MostLike)
	fmt.Println("Also, " + p.Comments)

	if p.Verbose == true {
		if insulted == false {
			fmt.Println(UniversalDeclaration)
			insulted = true
		}
		fmt.Println(InsultVerbosity)
	}

	if p.EasyToWrite == false {
		if insulted == false {
			fmt.Println(UniversalDeclaration)
			insulted = true
		}
		fmt.Println(InsultEasy)
	}

	if p.StrangeConventions == true {
		if insulted == false {
			fmt.Println(UniversalDeclaration)
			insulted = true
		}
		fmt.Println(InsultStrange)
	}

	if p.Fast == false {
		if insulted == false {
			fmt.Println(UniversalDeclaration)
			insulted = true
		}
		fmt.Println(InsultSlow)
	}

	//Laws of the universe dictate we will never get here.
	if insulted == false {
		fmt.Println("I have nothing bad to say about " + p.Name)
	}

}

func main() {
	fmt.Println("Programming language criticisms")
	//Range takes two args in this case. We don't care about the key, only the value,
	//so we set the first argument to "_", which just discards that var.
	//Note that iteration over a map happens in random order.
	for _, value := range langs {
		value.Mock()
	}
}
