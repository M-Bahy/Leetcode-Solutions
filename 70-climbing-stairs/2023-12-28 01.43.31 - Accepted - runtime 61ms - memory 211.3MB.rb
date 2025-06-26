# @param {Integer} n
# @return {Integer}
def climb_stairs(n)
    return n if n <= 2

    fib_sequence = [0, 1,2]

    (3..n).each do |i|
        fib_sequence[i] = fib_sequence[i - 1] + fib_sequence[i - 2]
    end

    fib_sequence[n]
end