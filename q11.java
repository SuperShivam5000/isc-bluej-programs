class q11
{
void main(String s)
{
s=s.substring(0,s.length()-1);
s=" "+s+" ";
int i,l=s.length(),maxlength=0,p1=0,p2=0;
String word,result="";
while(true)
{
    p2= s.indexOf(" ",p1+1);
    if (p2==-1) break;
    word=s.substring(p1+1,p2);
    p1=p2;
    if (word.length()>maxlength) maxlength=word.length();
}
for(i=1;i<=maxlength;i++)
{
p1=0;p2=0;
while(true)
{
    p2= s.indexOf(" ",p1+1);
    if (p2==-1) break;
    word=s.substring(p1+1,p2);
    p1=p2;
    if (word.length()==i) result=result+word+" ";
}
}
char c=result.charAt(0);
c=Character.toUpperCase(c);
result=c+result.substring(1,result.length()-1)+".";
System.out.println(result);
}
}