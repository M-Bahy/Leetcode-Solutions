/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    if( 1 === n )
    return 1 ;
    if( 2 === n )
    return 2 ;
    var result = [n+1];
    result[1]=1;
    result[2]=2;
    for (var i = 3;i<=n;i++){
        result[i] =  result[i-1]+ result[i-2];
    }
    return  result[n];
};