/* Report Card- Name - String
              Class - int
              Section- Char   
              Roll -   int
              Marks     - float */

#include<stdio.h>
void main(){

    struct reportCard {
        char name[100]; //String
        int class;      // Integer
        char section;   // Charater
        int roll;       // integer
        float marks;    // Float
    } aditya, upa, arghya;

    printf("Enter detail of Aditya in the order of \n Name \n Class \n section \n Roll \n Marks");
    scanf("%s %d %c %d %f", aditya.name, &aditya.class, &aditya.section, &aditya.roll, &aditya.marks);
    
    printf("Enter detail of Upamanyu in the order of \n Name \n Class \n section \n Roll \n Marks");
    scanf("%s %d %c %d %f", upa.name, &upa.class, &upa.section, &upa.roll, &upa.marks);

    printf("Enter detail of Arghya in the order of \n Name \n Class \n section \n Roll \n Marks");
    scanf("%s %d %c %d %f", arghya.name, &arghya.class, &arghya.section, &arghya.roll, &arghya.marks);

    printf("Marks of Aditya = %f",aditya.marks);
    printf("Roll no of Arghya is = %d",arghya.roll);
    printf("Class of Upamanyu is = %d",upa.class);


}
