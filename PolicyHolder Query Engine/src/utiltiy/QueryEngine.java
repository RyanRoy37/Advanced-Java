package utiltiy;

import java.util.Scanner;

public abstract class QueryEngine {
    abstract public void engine(Scanner input) throws Exception;
    //abstract public void engine(String input, Policyholder holder ) throws Exception;

    public abstract boolean engine(Scanner input, Policyholder holder) throws Exception;
}


