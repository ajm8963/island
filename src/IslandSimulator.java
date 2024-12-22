public class IslandSimulator {
    CreateIsland [][] island;

    public IslandSimulator(int width, int heigth){
        island = new CreateIsland[width][heigth];
        for(int i = 0; i < width;i++){
            for (int j = 0; j < heigth; j++) {
                island[i][j] = new CreateIsland();
            }
        }
    }
    public void simulateStep(){
        for(CreateIsland[] row : island){
            for(CreateIsland createIsland : row){

            }
        }
    }
}
