package multiple_pointers

import kotlin.math.abs

fun threeSumClosest(nums: IntArray, target: Int): Int {
    nums.sort()
    var closest = nums[0] + nums[1] + nums[2]
    var prevDiff = Int.MAX_VALUE
    var diff = 0
    for (i in nums.indices) {
        var l = i + 1
        var r = nums.lastIndex
        while (l < r) {
            val sum = nums[i] + nums[l] + nums[r]
            if (sum < target) {
                l++
            }
            if (sum > target) {
                r--
            }
            if (sum == target) {
                return sum
            }
            diff = abs(target - sum)

            if (diff <= prevDiff) {
                closest = sum
                prevDiff = diff
            }
        }
    }
    return closest
}
