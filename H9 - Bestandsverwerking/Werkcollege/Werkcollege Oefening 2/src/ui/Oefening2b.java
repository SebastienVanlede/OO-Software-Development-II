package ui;

import domein.DomeinController;
import domein.Speler;
import domein.Wapen;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Oefening2b
{
    public Oefening2b(DomeinController dc)
    {
        
        String spelers[][]={{"50","elf","zwaard","stof"},
            {"200","trol","aks","blote handen"},
            {"120","tovenaar","vloek","onzichtbaar"}};
       
        dc.serialiseerVolledigeLijst(spelers);
    }

}