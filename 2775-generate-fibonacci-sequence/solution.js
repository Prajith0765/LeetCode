/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let pre = -1, curr = 1;

    while(true){
        yield pre + curr;
        let temp = pre + curr;
        pre = curr;
        curr = temp;
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */
