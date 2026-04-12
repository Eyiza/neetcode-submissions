class MinStack {
    private ArrayList<Integer> stack;
    private int min;
    private ArrayList<Integer> updates;

    public MinStack() {
        stack = new ArrayList<>();
        updates = new ArrayList<>();
    }
    
    public void push(int val) {
        if (stack.size() != 0 && val <= min) {
            min = val;
        updates.add(min);
        }
        if (stack.size() == 0) {min = val;
        updates.add(min);
        }
        stack.add(val);
    }
    
    public void pop() {
        int a = updates.get(updates.size() - 1);
        int b = stack.get(stack.size() - 1);

        System.out.println(a == b);

        if(a == b) {
                    updates.remove(updates.size() - 1);
                    System.out.println("fffffffffff");

                    if(updates.size() == 0) min = 0;
                    if(updates.size() != 0) min = updates.get(updates.size() - 1);

                    System.out.println(updates);

        }
        stack.remove(stack.size() - 1);

    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return min;
    }
}
