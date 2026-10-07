package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int hourlyRate  = 123;
        int hours       = 8;
        int days_per_year= 280;
        int earn;

        earn = hourlyRate *hours*days_per_year;
        System.out.println("Earn Per Year: " + earn);

        int rent_perMonth = 12000;
        int save_perYear;
        save_perYear = earn - 12*rent_perMonth;
        System.out.println("Save Per Year: " + save_perYear);
    }
}
