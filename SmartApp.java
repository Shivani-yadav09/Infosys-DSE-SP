/*Question 1 — Smart Card Entry Audit
EASY
Topic area: Arrays / Hashing   |   Pass requirement: all test cases   |   Suggested time: 30 minutes
Problem Statement
An office building uses smart cards for entry and exit. Every time an employee taps their card, the system
records their employee ID in a log, in chronological order. A properly behaving employee taps an even number
of times in a day (every entry has a matching exit).
At the end of the day, the security team discovers that exactly one employee tapped an odd number of times —
meaning they either entered without exiting or exited without a recorded entry. Given the full day's tap log,
identify the employee ID of this person.
Input Format
l The first line contains a single integer N — the total number of taps recorded in the day.
l The second line contains N space-separated integers, where the i-th integer is the employee ID of the i-th
tap.
Output Format
l Print a single integer — the employee ID that appears an odd number of times in the log.
Constraints
l 1 £ N £ 106 (N is always odd, since exactly one ID has an odd count)
l 1 £ employee ID £ 109
l Exactly one employee ID appears an odd number of times; every other ID appears an even number of
times.
Sample Test Case 1
Input: 7 104 202 104 305 202 305 305 Output: 305
Explanation: ID 104 taps twice, ID 202 taps twice, but ID 305 taps three times (odd) — so employee 305 is
the one with the unmatched entry/exit.
Sample Test Case 2
Input: 1 999999999 Output: 999999999
Explanation: Only one tap exists in the entire log, so that single ID trivially has an odd count.
Points to consider before coding
l N can be as large as 106 — think about whether your approach stays fast at that size.
l Employee IDs go up to 109 — they cannot be used directly as array indices.
l The answer is guaranteed to exist and be unique; no need to handle a 'no answer' case */
import java.util.Scanner;
public class SmartApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        int n = sc.nextInt();

        int answer = 0;

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            answer = answer ^ id;
        }

        System.out.println(answer);

        sc.close();
    }
}