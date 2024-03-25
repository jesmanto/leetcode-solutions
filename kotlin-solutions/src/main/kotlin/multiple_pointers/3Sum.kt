package multiple_pointers

fun threeSum(nums: IntArray): List<List<Int>> {
    nums.sort()
    val arr = mutableListOf<List<Int>>()
    for (i in nums.indices) {
        if (i > 0 && nums[i] == nums[i - 1]) continue
        var l = i + 1
        var r = nums.lastIndex
        while (l < r) {
            val sum = nums[i] + nums[l] + nums[r]
            if (sum < 0) l++
            if (sum > 0) r--
            if (sum == 0) {
                arr.add(listOf(nums[i], nums[l], nums[r]))
                l++
                while (nums[l] == nums[l - 1] && l < r) {
                    l++
                }
            }
        }
    }
    return arr
}