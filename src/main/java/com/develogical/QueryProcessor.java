package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "CS";
        }
        if (query.toLowerCase().contains("largest")){
            Pattern regex = Pattern.compile("which of the following numbers is the largest: (\\d+), (\\d+)");
            Matcher matcher = regex.matcher(query.toLowerCase());
            if (Integer.parseInt(matcher.group(1)) > Integer.parseInt(matcher.group(2))) {
                return matcher.group(1);
            } else {
                return matcher.group(2);
            }
        }
        return "";
    }
}
