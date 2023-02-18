package tp0;

public class Date {
    int jour,mois,annee;

public int get_jour()
{return (jour);}
public int get_mois()
{return (mois);}
public int get_annee()
{return (annee);}
System.out.println("");
public void set_jour(int j)
{jour=j;}
public void set_mois(int m)
{mois=m;}
public void set_annee(int a)
{annee=a;}
public void set_date(int a,int b,int c)
{jour=a;
mois=b;
annee=c;}

public date(){};

public date(int jour,int m,int annee)
{this.jour=jour;
mois=m;
this.annee=annee;}

public void affiche(){
	System.out.println(jour+"/"+mois+"/"+annee);}

}

