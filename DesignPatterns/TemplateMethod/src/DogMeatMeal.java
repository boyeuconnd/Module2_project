public class DogMeatMeal extends Meal {
    @Override
    public void prepareIngredients() {
        System.out.println("Chọc tiết, thui rơm, làm lòng");
    }

    @Override
    public void cook() {
        System.out.println("Làm đĩa luộc, làm rượu mận, làm món nướng, làm dồi, làm tiết canh, làm xáo măng, làm cút rượu...");
    }

    @Override
    public void cleanUp() {
        System.out.println("Rượu vào thì làm sao mà dọn được nữa, để đó đi ngủ, mai tính...");

    }
}
