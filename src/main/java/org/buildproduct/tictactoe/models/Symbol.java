package org.buildproduct.tictactoe.models;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Symbol {
    private char symbol;

    public Symbol(char symbol) {
        this.symbol = symbol;
    }



}
