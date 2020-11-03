package com.joejang.algorithm.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JiBenJiSuanQiIII {

    Map<String, Integer> priority = new HashMap<String, Integer>() {
        {
            put("+", 0);
            put("-", 0);
            put("*", 1);
            put("/", 1);
            put("MAX", 2);
            put("MIN", 2);
            put("LOWEST", -1);
        }
    };

    public int calculate(String s) {
        String[] strs = s.replaceAll("[0-9]+", " $0")
            .replaceAll("[+/\\-*(),]", " $0")
            .replaceAll("(MAX|MIN)", " $0")
            .trim()
            .split(" ");

        List infixExp = convertMinMax2InfixExpr(strs);

        List postfixExp = convertInfix2Postfix(infixExp);

        int res = compute(postfixExp);

        return res;
    }

    private int compute(List<String> postfixExp) {
        Stack<Long> num = new Stack<>();
        String opt = null;
        for (int i = 0; i < postfixExp.size(); i++) {
            if (isNum(postfixExp.get(i))) {
                String str = postfixExp.get(i);
                Long lnum = Long.valueOf(str);
                num.push(lnum);
            } else {
                long numB = num.pop();
                long numA = num.pop();
                opt = postfixExp.get(i);
                long tmpRes = 0;
                if (opt.equals("MAX")) {
                    tmpRes = Math.max(numA, numB);
                } else if (opt.equals("MIN")) {
                    tmpRes = Math.min(numA, numB);
                } else if (opt.equals("/")) {
                    tmpRes = numA / numB;
                } else if (opt.equals("*")) {
                    tmpRes = numA * numB;
                } else if (opt.equals("+")) {
                    tmpRes = numA + numB;
                } else {
                    tmpRes = numA - numB;
                }
                num.push(tmpRes);
            }
        }
        return num.pop().intValue();
    }

    private List convertInfix2Postfix(List<String> infixExp) {
        List<String> res = new ArrayList<>();
        Stack<String> opt = new Stack<>();
        opt.push("LOWEST");
        for (int i = 0; i < infixExp.size(); i++) {
            String str = infixExp.get(i);
            if (isNum(str)) {
                res.add(str);
            } else if (str.equals("(")) {
                opt.push("(");
            } else if (str.equals(")")) {
                String top = opt.pop();
                while (!top.equals("(")) {
                    res.add(top);
                    top = opt.pop();
                }
            } else {
                String top = opt.peek();
                while (!top.equals("(") && !top.equals("LOWEST") && priority.get(top) >= priority.get(str)) {
                    res.add(top);
                    opt.pop();
                    top = opt.peek();
                }
                opt.push(str);
            }
        }
        String top = opt.peek();
        while (!top.equals("LOWEST")) {
            res.add(top);
            opt.pop();
            top = opt.peek();
        }
        return res;
    }

    private Pattern pattern = Pattern.compile("[0-9]+");

    private boolean isNum(String str) {
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    private List<String> convertMinMax2InfixExpr(String[] strs) {
        List<String> res = new ArrayList<>();
        Stack<String> opt = new Stack<>();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() == 0) {
                continue;
            }
            if (strs[i].equals("(")) {
                if (i > 0) {
                    if (strs[i - 1].equals("MAX") || strs[i - 1].equals("MIN")) {
                        res.remove(res.size() - 1);
                        res.add("(");
                    }
                    opt.add(strs[i - 1]);
                }
                res.add("(");
            } else if (strs[i].equals(")")) {
                if (!opt.isEmpty()) {
                    if (opt.peek().equals("MAX") || opt.peek().equals("MIN")) {
                        res.add(")");
                    }
                    opt.pop();
                }
                res.add(")");
            } else if (strs[i].equals(",")) {
                String prevOpt = opt.peek();
                if (prevOpt.equals("MAX") || prevOpt.equals("MIN")) {
                    res.add(")");
                    res.add(prevOpt);
                    res.add("(");
                } else {
                    res.add(prevOpt);
                }
            } else {
                res.add(strs[i]);
            }
        }

        return res;
    }

}
