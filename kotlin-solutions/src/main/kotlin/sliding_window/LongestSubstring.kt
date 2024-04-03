package sliding_window

import java.lang.Integer.max

fun lengthOfLongestSubstring(s: String): Int {
    val chars = BooleanArray(255) { false }
    var longest = 0
    var left = 0
    var right = 0

    while (right < s.length){
        while (right < s.length && !chars[s[right].code]){
            chars[s[right].code] = true
            right++
        }
        longest = max(right - left, longest)
        chars[s[left].code] = false
        left++
    }
    return longest
}