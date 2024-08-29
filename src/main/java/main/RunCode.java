package main.java.main;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

class RunCode {
    public static void main(String[] args) {
        int[] arr = {10, 13, 78, 99, 2, 0};
        String[] strArr = {"test", "hello", "ummokyeah", "a", "c", "yoo lets go fam"};
        
        System.out.println("Recursion Score");
        System.out.println("");
        RecursionTest(arr, strArr);
        System.out.println("");
        
        System.out.println("ArrayList Score");
        System.out.println("");
        ArrayListPracticeTest();
    }

    public static void RecursionTest(int[] arr, String[] strArr) {
        int score = 0;
        Recursion recursion = new Recursion();

        // Q1: Sumof
        if (isMethodDefined(recursion, "Sumof", int.class)) {
            try {
                if ((int) invokeMethod(recursion, "Sumof", 10) == 55) {
                    score += 1;
                    System.out.println("Q1 Correct");
                } else {
                    System.out.println("Q1 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q1 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q1 Function Not Defined");
        }

        // Q2: SumOdd
        if (isMethodDefined(recursion, "SumOdd", int.class)) {
            try {
                if ((int) invokeMethod(recursion, "SumOdd", 27) == 196) {
                    score += 1;
                    System.out.println("Q2 Correct");
                } else {
                    System.out.println("Q2 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q2 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q2 Function Not Defined");
        }

        // Q3: SumEven
        if (isMethodDefined(recursion, "SumEven", int.class)) {
            try {
                if ((int) invokeMethod(recursion, "SumEven", 39) == 380) {
                    score += 1;
                    System.out.println("Q3 Correct");
                } else {
                    System.out.println("Q3 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q3 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q3 Function Not Defined");
        }

        // Q4: CountFours
        if (isMethodDefined(recursion, "CountFours", int.class)) {
            try {
                if ((int) invokeMethod(recursion, "CountFours", 424564) == 3) {
                    score += 1;
                    System.out.println("Q4 Correct");
                } else {
                    System.out.println("Q4 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q4 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q4 Function Not Defined");
        }

        // Q5: SumOfAllFours
        if (isMethodDefined(recursion, "SumOfAllFours", int.class)) {
            try {
                if ((int) invokeMethod(recursion, "SumOfAllFours", 24464) == 4932) {
                    score += 1;
                    System.out.println("Q5 Correct");
                } else {
                    System.out.println("Q5 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q5 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q5 Function Not Defined");
        }

        // Q6: sumArray
        if (isMethodDefined(recursion, "sumArray", int.class, int[].class)) {
            try {
                if ((int) invokeMethod(recursion, "sumArray", 0, arr) == 202) {
                    score += 1;
                    System.out.println("Q6 Correct");
                } else {
                    System.out.println("Q6 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q6 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q6 Function Not Defined");
        }

        // Q7: sumStringArray
        if (isMethodDefined(recursion, "sumStringArray", int.class, String[].class)) {
            try {
                if ((int) invokeMethod(recursion, "sumStringArray", 0, strArr) == 35) {
                    score += 1;
                    System.out.println("Q7 Correct");
                } else {
                    System.out.println("Q7 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q7 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q7 Function Not Defined");
        }

        // Q8: countOddInArray
        if (isMethodDefined(recursion, "countOddInArray", int.class, int[].class)) {
            try {
                if ((int) invokeMethod(recursion, "countOddInArray", 0, arr) == 2) {
                    score += 1;
                    System.out.println("Q8 Correct");
                } else {
                    System.out.println("Q8 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q8 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q8 Function Not Defined");
        }
        // Q9: factorial
        if (isMethodDefined(recursion, "factorial", int.class)) {
            try {
                if ((int) invokeMethod(recursion, "factorial", 10) == 3628800) {
                    score += 1;
                    System.out.println("Q9 Correct");
                } else {
                    System.out.println("Q9 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q9 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q9 Function Not Defined");
        }

        // Q10: fibonacci 
        if (isMethodDefined(recursion, "fibonacci", int.class)) {
            try {
                if ((int) invokeMethod(recursion, "fibonacci", 10) == 55) {
                    score += 1;
                    System.out.println("Q10 Correct");
                } else {
                    System.out.println("Q10 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q10 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q10 Function Not Defined");
        }

        System.out.println("Score: " + score);
    }
    
    public static void ArrayListPracticeTest() {
        int score = 0;
        ArrayListPractice practice = new ArrayListPractice();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(20, 11, 9, 17, 10, 4, 777));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(7, 67, 9, 107, 9999, 0));
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("hi", "hello", "monkey yeah", "abz", "zebra", "test"));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(null, 11, 9, 17, null, null, 777));
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList(null, "hi","testing","square","data",null));
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(45, 67, 99, 10, 4, 7, 22, 45, 99, 1));
        ArrayList<Integer> sortedList1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        ArrayList<Integer> sortedList2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));

        // Q1: listSize
        if (isMethodDefined(practice, "listSize", ArrayList.class)) {
            try {
                if ((int) invokeMethod(practice, "listSize", list1) == 7) {
                    score += 1;
                    System.out.println("Q1 Correct");
                } else {
                    System.out.println("Q1 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q1 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q1 Function Not Defined");
        }

        // Q2: SumOddList
        if (isMethodDefined(practice, "SumOddList", ArrayList.class)) {
            try {
                if ((int) invokeMethod(practice, "SumOddList", list1) == 814) {
                    score += 1;
                    System.out.println("Q2 Correct");
                } else {
                    System.out.println("Q2 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q2 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q2 Function Not Defined");
        }

        // Q3: CountAllSevens
        if (isMethodDefined(practice, "CountAllSevens", ArrayList.class)) {
            try {
                if ((int) invokeMethod(practice, "CountAllSevens", list2) == 3) {
                    score += 1;
                    System.out.println("Q3 Correct");
                } else {
                    System.out.println("Q3 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q3 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q3 Function Not Defined");
        }

        // Q4: AscendList
        if (isMethodDefined(practice, "AscendList", ArrayList.class)) {
            try {
                ArrayList<Integer> sortedList = (ArrayList<Integer>) invokeMethod(practice, "AscendList", list2);
                if (sortedList.equals(new ArrayList<>(Arrays.asList(0, 7, 9, 67, 107, 9999)))) {
                    score += 1;
                    System.out.println("Q4 Correct");
                } else {
                    System.out.println("Q4 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q4 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q4 Function Not Defined");
        }

        // Q5: RemoveAboveFifty
        if (isMethodDefined(practice, "RemoveAboveFifty", ArrayList.class)) {
            try {
                ArrayList<Integer> filteredList = (ArrayList<Integer>) invokeMethod(practice, "RemoveAboveFifty", list2);
                if (filteredList.equals(new ArrayList<>(Arrays.asList(7, 9, 0)))) {
                    score += 1;
                    System.out.println("Q5 Correct");
                } else {
                    System.out.println("Q5 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q5 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q5 Function Not Defined");
        }

        // Q6: convertList
        if (isMethodDefined(practice, "convertList", ArrayList.class)) {
            try {
                ArrayList<Integer> lengthList = (ArrayList<Integer>) invokeMethod(practice, "convertList", strList);
                if (lengthList.equals(new ArrayList<>(Arrays.asList(2, 5, 11, 3, 5, 4)))) {
                    score += 1;
                    System.out.println("Q6 Correct");
                } else {
                    System.out.println("Q6 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q6 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q6 Function Not Defined");
        }

        // Q7: Sumof
        if (isMethodDefined(practice, "Sumof", int.class, ArrayList.class)) {
            try {
                if ((int) invokeMethod(practice, "Sumof", 0, list2) == 10189) {
                    score += 1;
                    System.out.println("Q7 Correct");
                } else {
                    System.out.println("Q7 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q7 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q7 Function Not Defined");
        }

        // Q8: makeRandomList
        if (isMethodDefined(practice, "makeRandomList", int.class, int.class, int.class)) {
            try {
                ArrayList<Integer> randomList = (ArrayList<Integer>) invokeMethod(practice, "makeRandomList", 9, 76, 159);
                if (randomList.size() == 9 && randomList.stream().allMatch(num -> num >= 76 && num <= 159)) {
                    score += 1;
                    System.out.println("Q8 Correct");
                } else {
                    System.out.println("Q8 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q8 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q8 Function Not Defined");
        }

        // Q9: SpecialSumOfList
        if (isMethodDefined(practice, "SpecialSumOfList", ArrayList.class, ArrayList.class)) {
            try {
                if ((int) invokeMethod(practice, "SpecialSumOfList", list3, list4) == 8) {
                    score += 1;
                    System.out.println("Q9 Correct");
                } else {
                    System.out.println("Q9 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q9 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q9 Function Not Defined");
        }

        // Q10: removeDuplicates
        if (isMethodDefined(practice, "removeDuplicates", ArrayList.class)) {
            try {
                ArrayList<Integer> uniqueList = (ArrayList<Integer>) invokeMethod(practice, "removeDuplicates", list5);
                if (uniqueList.equals(new ArrayList<>(Arrays.asList(45, 67, 99, 10, 4, 7, 22, 1)))) {
                    score += 1;
                    System.out.println("Q10 Correct");
                } else {
                    System.out.println("Q10 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q10 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q10 Function Not Defined");
        }

        // Q11: mergeSortedLists
        if (isMethodDefined(practice, "mergeSortedLists", ArrayList.class, ArrayList.class)) {
            try {
                ArrayList<Integer> mergedList = (ArrayList<Integer>) invokeMethod(practice, "mergeSortedLists", sortedList1, sortedList2);
                if (mergedList.equals(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))) {
                    score += 1;
                    System.out.println("Q11 Correct");
                } else {
                    System.out.println("Q11 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q11 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q11 Function Not Defined");
        }

        // Q12: secondLargest
        if (isMethodDefined(practice, "secondLargest", ArrayList.class)) {
            try {
                if ((int) invokeMethod(practice, "secondLargest", list5) == 67) {
                    score += 1;
                    System.out.println("Q12 Correct");
                } else {
                    System.out.println("Q12 Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Q12 Incorrect - Error during execution");
            }
        } else {
            System.out.println("Q12 Function Not Defined");
        }
         // Test Q13: findCommonElements
         ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
         ArrayList<Integer> expectedCommon = new ArrayList<>(Arrays.asList(3, 4, 5));
         if (isMethodDefined(practice, "findCommonElements", ArrayList.class, ArrayList.class)) {
             try {
                 ArrayList<Integer> resultCommon = (ArrayList<Integer>) invokeMethod(practice, "findCommonElements", list1, list6);
                 if (resultCommon.equals(expectedCommon)) {
                     score += 1;
                     System.out.println("Q13 Correct");
                 } else {
                     System.out.println("Q13 Incorrect");
                 }
             } catch (Exception e) {
                 System.out.println("Q13 Incorrect - Error during execution");
             }
         } else {
             System.out.println("Q13 Function Not Defined");
         }

        System.out.println("Score: " + score);
    }

    public static boolean isMethodDefined(Object obj, String methodName, Class<?>... parameterTypes) {
        try {
            Method method = obj.getClass().getMethod(methodName, parameterTypes);
            return method != null;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    public static Object invokeMethod(Object obj, String methodName, Object... args) throws Exception {
        Method method = obj.getClass().getMethod(methodName, toClasses(args));
        return method.invoke(obj, args);
    }

    private static Class<?>[] toClasses(Object... args) {
        Class<?>[] classes = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            classes[i] = args[i].getClass();
            if (classes[i] == Integer.class) classes[i] = int.class;
            if (classes[i] == Double.class) classes[i] = double.class;
            if (classes[i] == Boolean.class) classes[i] = boolean.class;
        }
        return classes;
    }
}

