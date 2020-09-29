package ee.sdatest.unit;

public class RemoveDuplications {

    // apple, strawberry, watermelon, apple

    public String[] removeDuplicates(String[] fruits){
        if(fruits == null || fruits.length == 0){
            return new String[]{};
        }

        // Set
        String[] tempArray = new String[fruits.length];

        int counter = 0;
        for (String fruit:fruits) {
            for (int i = 0; i < tempArray.length; i++) {
                if(fruit.equals(tempArray[i])){
                    break;
                }
            }

            tempArray[counter] = fruit;
            counter++;
        }

        return tempArray;
    }
}
