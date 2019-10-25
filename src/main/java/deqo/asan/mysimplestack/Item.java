package deqo.asan.mysimplestack;

public class Item {
    private int val;

    Item(){
        this.val = 0;
    }
    Item(int it) { this.val = it; }
    public int GetVal() {
        return val;
    }

    public void SetVal(int val) {
        this.val = val;
    }
}
