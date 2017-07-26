package com.lionssharewebdev;

/**
 * Created by adrienne on 7/26/17.
 */

public class JsonParse {

    private static final String filePath = "C:\\Users\\katerina\\Desktop\\jsonTestFile.json";
        public static void main(String[] args) {
            18

            19
            try {
                20
                // read the json file
                21
                FileReader reader = new FileReader(filePath);
                22

                23
                JSONParser jsonParser = new JSONParser();
                24
                JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
                25

                26
                // get a String from the JSON object
                27
                String firstName = (String) jsonObject.get("firstname");
                28
                System.out.println("The first name is: " + firstName);
                29

                30
                // get a number from the JSON object
                31
                long id =  (long) jsonObject.get("id");
                32
                System.out.println("The id is: " + id);
                33

                34
                // get an array from the JSON object
                35
                JSONArray lang= (JSONArray) jsonObject.get("languages");
                36

                37
                // take the elements of the json array
                38
                for(int i=0; i<lang.size(); i++){
                    39
                    System.out.println("The " + i + " element of the array: "+lang.get(i));
                    40
                }
                41
                Iterator i = lang.iterator();
                42

                43
                // take each value from the json array separately
                44
                while (i.hasNext()) {
                    45
                    JSONObject innerObj = (JSONObject) i.next();
                    46
                    System.out.println("language "+ innerObj.get("lang") +
                                    47
                            " with level " + innerObj.get("knowledge"));
                    48
                }
                49
                // handle a structure into the json object
                50
                JSONObject structure = (JSONObject) jsonObject.get("job");
                51
                System.out.println("Into job structure, name: " + structure.get("name"));
                52

                53
            } catch (FileNotFoundException ex) {
                54
                ex.printStackTrace();
                55
            } catch (IOException ex) {
                56
                ex.printStackTrace();
                57
            } catch (ParseException ex) {
                58
                ex.printStackTrace();
                59
            } catch (NullPointerException ex) {
                60
                ex.printStackTrace();
                61
            }
            62

            63
        }
64

        65
    }

}
