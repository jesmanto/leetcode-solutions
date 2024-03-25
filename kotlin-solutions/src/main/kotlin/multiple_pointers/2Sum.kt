package multiple_pointers

fun twoSum(nums: MutableList<Int>, target: Int): IntArray? {
    val hashNums = mutableMapOf<Int, Int>()
    var rem: Int
    for (i in nums.indices) {
        rem = target - nums[i]
        if (hashNums.containsKey(rem)) {
            return intArrayOf(nums[hashNums[rem]!!], nums[i])
        }
        hashNums[nums[i]] = i
    }
    return null
}