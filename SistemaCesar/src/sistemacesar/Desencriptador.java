/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacesar;

/**
 *
 * @author Sergio y Camilo
 */
public class Desencriptador {
    public String a;
    public static String Revelado;
    public static char[] caracteres = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public static int aux;
    public static char aux2;
    
    public static String Revelar(String a){
   
    String s = a;
    Revelado = "";
    int[] equivnumerico1 = new int[s.length()];
    int[] equivnumerico2 = new int[s.length()]; 
    for(int i=0;i<s.length();i++)
    {
        for(int j=0;j<25;j++)        //Equivalente numérico
        {
            if(a.charAt(i) == caracteres[j])
            {
                equivnumerico1[i] = j;
                break;
            }
        }
    }
    
    for(int k=0;k<s.length();k++) 
    {                                            
        aux = equivnumerico1[k];
        
        if (aux < 4)
        {
            aux = aux + 26;
        }
        
        equivnumerico2[k] = (aux-3)%26;
    }
    
    for(int l=0;l<s.length();l++)     
    {
        for(int m=0;m<25;m++)        
        {
            if(equivnumerico2[l] == m)
            {
                aux2 = caracteres[m];
                Revelado = Revelado + aux2;
                break;
            }
        }                                         
    }
    
    return Revelado;
    }    
}
