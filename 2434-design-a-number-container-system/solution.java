class NumberContainers
{
    private Map<Integer, Integer> idxToNum; // index -> number mapping
    private Map<Integer, TreeSet<Integer>> numToIdx; // number -> sorted index set

    public NumberContainers()
    {
        idxToNum = new HashMap<>();
        numToIdx = new HashMap<>();
    }

    // Step 1: Remove previous number's index if it exists
    public void change(int index, int number)
    {
        if (idxToNum.containsKey(index))
        {
            int prevNum = idxToNum.get(index);
            numToIdx.get(prevNum).remove(index); // O(log n)
            if (numToIdx.get(prevNum).isEmpty()) 
            {
                numToIdx.remove(prevNum); // O(1)
            }
        }

        // Step 2: Update index mappings
        idxToNum.put(index, number);
        numToIdx.putIfAbsent(number, new TreeSet<>());
        numToIdx.get(number).add(index); // O(log n)
    }

    // Step 3: Retrieve the smallest index for a given number
    public int find(int number) {
        if (numToIdx.containsKey(number))
        {
            return numToIdx.get(number).first(); // O(1)
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
