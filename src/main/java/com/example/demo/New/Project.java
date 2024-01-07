package com.example.demo.New;
//
//
//
//import org.json.JSONObject;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//
public class Project {



        public static void main(String[] args)
        {
            String s1 = "HELLO";
            String s2 = "HELLO";
            String s3 =  new String("HELLO");
            String s4 =  new String("HELLO");

            System.out.println(s1 == s2); //true
            System.out.println(s1 == s3); //false
            System.out.println(s1.equals(s2)); // true
            System.out.println(s1.equals(s3)); // true
            System.out.println(s4 == s3); // false
        }
    }

//
//    public static Map<String, String> getResponse(Map<String, String> entitiesMap, String intent) {
//        Map<String, String> respMap = new HashMap<>();
//
//        try {
//            if (jsonResponse.has(intent)) {
//                JSONObject intentData = jsonResponse.getJSONObject(intent);
//
//                if (entitiesMap.isEmpty()) {
//                    if (intentData.has("")) {
//                        respMap.put("response", intentData.getString(""));
//                    }
//                } else {
//                    for (String key : intentData.keySet()) {
//                        String[] keyEntities = key.split(",");
//                        keyEntities = Arrays.stream(keyEntities).map(String::trim).toArray(String[]::new);
//
//                        if (keyEntities.length == entitiesMap.size()) {
//                            boolean match = true;
//
//                            for (String entity : entitiesMap.keySet()) {
//                                if (!Arrays.asList(keyEntities).contains(entity)) {
//                                    match = false;
//                                    break;
//                                }
//                            }
//
//                            if (match) {
//                                Object response = intentData.get(key);
//
//                                if (response instanceof JSONObject) {
//                                    boolean contains = false;
//                                    JSONObject responseObj = (JSONObject) response;
//                                    Iterator<String> values = responseObj.keys();
//
//                                    while (values.hasNext()) {
//                                        String value = values.next();
//
//                                        if (value.contains(",")) {
//                                            String[] valueEntities = value.split(",");
//
//                                            if (valueEntities.length == entitiesMap.size()) {
//                                                for (String entityValues : entitiesMap.values()) {
//                                                    contains = true;
//                                                    if (!Arrays.asList(valueEntities).contains(entityValues)) {
//                                                        contains = false;
//                                                        break;
//                                                    }
//                                                }
//
//                                                if (contains) {
//                                                    respMap.put("response", responseObj.getString(value));
//                                                    return respMap;
//                                                }
//                                            }
//                                        } else if (!value.contains(",") && !value.equals("default")) {
//                                            for (String entityValues : entitiesMap.values()) {
//                                                contains = false;
//
//                                                if (value.equals(entityValues)) {
//                                                    contains = true;
//                                                    continue;
//                                                }
//                                            }
//
//                                            if (contains) {
//                                                respMap.put("response", responseObj.getString(value));
//                                            }
//                                        } else if (value.equals("default")) {
//                                            respMap.put("response", responseObj.getString("default"));
//                                        }
//
//                                        continue;
//                                    }
//                                } else if (response instanceof String) {
//                                    respMap.put("response", (String) response);
//                                    return respMap;
//                                }
//
//                                break;
//                            } else if (!match) {
//                                continue;
//                            }
//                        }
//                    }
//                }
//            } else {
//                respMap.put("response", "Sorry, I couldn't find a relevant response.");
//                return respMap;
//            }
//
//            if (respMap.isEmpty()) {
//                respMap.put("response", "Sorry, I couldn't find a relevant response.");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            respMap.put("response", "An error occurred while processing the request.");
//        }
//
//        return respMap;
//    }
//}
//
