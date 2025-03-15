class Spreadsheet {

    private int[][] grid;
    private int rows;
    
    public Spreadsheet(int rows) {
        this.rows = rows;
        this.grid = new int[rows][26];
    }
    
    public void setCell(String cell, int value) {
        int[] position = getPosition(cell);
        grid[position[0]][position[1]] = value;
    }
    
    public void resetCell(String cell) {
        int[] position = getPosition(cell);
        grid[position[0]][position[1]] = 0;
    }
    
    public int getValue(String formula) {
        if(!formula.startsWith("=")){
            return Integer.parseInt(formula);
        }

        formula = formula.substring(1);
        String[] parts = formula.split("\\+");
        int result = 0;
        for(String part : parts){
            if(Character.isLetter(part.charAt(0))){
                int[] position = getPosition(part);
                result += grid[position[0]][position[1]];
            } else {
                result += Integer.parseInt(part);
            }
        }
        return result;
    }

    private int[] getPosition(String cell){
        char colChar = cell.charAt(0);
        int colIndex = colChar - 'A';

        int rowIndex = Integer.parseInt(cell.substring(1)) - 1;

        return new int[]{rowIndex, colIndex};
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */
