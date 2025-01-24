class FooBar {
    private int n;
    boolean flag = false;

    public FooBar(int n) {
        this.n = n;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while(flag){
                try{
                    wait(100);
                } catch(Exception e){
                   
                }
               
            }
            System.out.println("foo");
            flag = true;
            notify();
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
        }
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while(!flag){
                try{
                    wait(100);
                } catch(Exception e){
                    
                }
               
            }
            System.out.println("bar");
            flag = false;
            notify();
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
        }
    }
}
