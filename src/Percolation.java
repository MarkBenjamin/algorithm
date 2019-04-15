import edu.princeton.cs.algs4.*;

public class Percolation {
    private int[][] id;
    private int numberOfOpenSites;

    /**
     * to set a percolation module
     * when id is 0, then this site is closed
     * when id is 1,then this site is open
     * when id is more than 1, hat this site its own id.
     *
     * @param n is the size of the percolation module
     */
    public Percolation(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                id[i][j] = 0;
            }
        }
    }

    /**
     * @param row to locate the position in this percolation module
     * @param col to locate the position in this percolation module
     */
    public void open(int row, int col) {
        id[row][col] = 1;
        numberOfOpenSites++;
    }

    /**
     * to exam weather the site is open
     * when the id of this site is larger than 0, the site is open, otherwise it is closed.
     *
     * @param row to locate the position, witch is to prof.
     * @param col to locate the position, witch is to prof.
     * @return when the site is open, return true, otherwise return false.
     */
    public boolean isOpen(int row, int col) {
        boolean isOpen = false;
        if (row >= id.length || col >= id.length) {
            StdOut.println("this row or the col is illegal!");
        }

        return id[row][col] != 0;
    }

    /**
     * to prof whether the site is full or not.
     *
     * @param row to locate the position, witch is to prof.
     * @param col to locate the position, witch is to prof.
     * @return when this id is larger than 1, then is this site full, otherwise is it not full.
     */
    public boolean isFull(int row, int col) {
        if (row > id.length || col > id.length) {
            StdOut.println("this row or col is illegal!");
        }

        return id[row][col] > 1;

    }

    /**
     *
     * @return the number of sites.
     */
    public int numberOfOpenSites() {
        return numberOfOpenSites;
    }

    public boolean percolates(){
        
    }
}
