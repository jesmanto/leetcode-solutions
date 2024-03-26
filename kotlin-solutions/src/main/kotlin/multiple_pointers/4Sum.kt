package multiple_pointers

fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    nums.sort()
    val result = mutableListOf<List<Int>>()
    for (i in 0 .. nums.size - 4) {
        if (i > 0 && nums[i] == nums[i-1]) continue
        for (j in i+1 .. nums.size-3){
            if (j > 1 && nums[j] == nums[j-1]) continue
            var left = j + 1
            var right = nums.lastIndex
            while (left < right) {
                val sum: Long = nums[i].toLong() + nums[j].toLong() + nums[left].toLong() + nums[right].toLong()
                if (sum < target) left++
                else if (sum > target) right--
                else {
                    result.add(listOf(nums[i], nums[j], nums[left], nums[right]))
                    left++
                    while (left < right){
                        if (nums[left] == nums[left - 1]) left++
                        else break
                    }
                }
            }
        }
    }

    return result
}