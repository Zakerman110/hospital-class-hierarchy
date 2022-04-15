package com.solvd.hospital.Exceptions;

public class IncorrectRangeException extends Exception{

    private final int size;

    public IncorrectRangeException(String message, int size)
    {
        super(message);
        this.size = size;
    }

    public int getSize(){return size;}
}
