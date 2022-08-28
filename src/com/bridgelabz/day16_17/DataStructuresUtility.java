package com.bridgelabz.day16_17;

import java.io.*;

public class DataStructuresUtility {


    public static String readFile(String path) throws IOException {
        String str;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        str = bufferedReader.readLine();
        bufferedReader.close();
        return str;
    }


    public static String writeFile(String path, String str) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        bufferedWriter.write(str);
        bufferedWriter.close();
        return "\n File is Written...";
    }

    public static void printCalendar(int day, int days) {
        String[][] cal = new String[6][7];
        int temp;
        String weekday_str = "SUN MON TUE WED THU FRI SAT";
        System.out.println(weekday_str);
        switch (day) {
            case 0:
                temp = 1;
                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (temp <= 9) {
                            cal[i][j] = temp + "   ";
                        } else {
                            cal[i][j] = temp + "  ";
                        }
                        temp++;
                        if (temp == days + 1) {
                            break;
                        }
                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
            case 1:
                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j == 0) {
                            cal[i][j] = "    ";
                        } else {
                            if (i <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }

                }
                break;
            case 2:
                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j == 0 || i == 0 && j == 1) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }

                }
                break;
            case 3:
                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j >= 0 || i == 0 && j <= 2) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
            case 4:

                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j >= 0 || i == 0 && j <= 3) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
            case 5:

                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j >= 0 || i == 0 && j <= 4) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
            case 6:

                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j >= 0 || i == 0 && j <= 5) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
        }
        for (String[] strings : cal) {
            for (String string : strings) {
                if (string == null)
                    break;
                System.out.print(string);

            }
            if (strings == null)
                break;
            System.out.println();
        }

    }
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 || year % 400 == 0 && year % 100 != 0;
    }
    public static int calculateDayOfWeek(int day, int month, int year) {
        int y1, x, m, d1;
        y1 = year - (14 - month) / 12;
        x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
        m = month + 12 * ((14 - month) / 12) - 2;
        d1 = (day + x + 31 * m / 12) % 7;
        return d1;
    }
}
