//Quiz Questions

//What gas is most responsible for human-caused global warming?

//1. Oxygen

//2. Carbon dioxide

//3. Nitrogen

//4. Hydrogen

//What activity releases large amounts of carbon dioxide into the atmosphere?

//1. Burning fossil fuels

//2. Planting trees

//3. Recycling plastic

//4. Saving electricity

//What do some climate skeptics argue?

//1. Climate never changes

//2. Global warming is caused only by the sun

//3. Human impact may be exaggerated

//4. Ice never melts

//What international organization studies climate change?

//1. NASA

//2. World Bank

//3. Intergovernmental Panel on Climate Change

//4. WHO

//What is one possible effect of global warming?

//1. Rising sea levels

//2. Decreasing rainfall everywhere

//3. The moon moving closer

//4. Earth losing gravity

//Correct answers:
// 2, 1, 3, 3, 1

import java.util.Scanner;

public class Exercise4_30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int score = 0;
        int answer;

        System.out.println("Global Warming Quiz");

        System.out.println("1. What gas is most responsible for global warming?");
        System.out.println("1) Oxygen  2) Carbon dioxide  3) Nitrogen  4) Hydrogen");
        answer = input.nextInt();
        if (answer == 2) score++;

        System.out.println("2. What activity releases large CO2?");
        System.out.println("1) Burning fossil fuels 2) Planting trees 3) Recycling 4) Saving energy");
        answer = input.nextInt();
        if (answer == 1) score++;

        System.out.println("3. What do climate skeptics argue?");
        System.out.println("1) Climate never changes 2) Only sun causes warming 3) Human impact may be exaggerated 4) Ice never melts");
        answer = input.nextInt();
        if (answer == 3) score++;

        System.out.println("4. Which organization studies climate change?");
        System.out.println("1) NASA 2) World Bank 3) IPCC 4) WHO");
        answer = input.nextInt();
        if (answer == 3) score++;

        System.out.println("5. One possible effect of global warming?");
        System.out.println("1) Rising sea levels 2) Moon moving closer 3) No rain 4) Earth losing gravity");
        answer = input.nextInt();
        if (answer == 1) score++;

        System.out.println("Correct answers: " + score);

        if (score == 5)
            System.out.println("Excellent");
        else if (score == 4)
            System.out.println("Very good");
        else {
            System.out.println("Time to brush up on your knowledge of global warming.");
            System.out.println("Useful websites:");
            System.out.println("www.climate.nasa.gov");
            System.out.println("www.ipcc.ch");
        }
    }
}