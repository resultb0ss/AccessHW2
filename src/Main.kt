fun main(){

    var array = arrayOf(
        arrayOf(1,2,3,4),
        arrayOf(5,6,7,8),
        arrayOf(9,10,11,12),
        arrayOf(13,14,15,16)
    )

    arrayCheckNum(array)

}

fun arrayCheckNum(array: Array<Array<Int>>){
    for (row in array){
        for (i in row){
            if (i % 2 == 0){
                println(i)
            }
        }
    }
}