def solve(n, arr):
    # CODE HERE
    ans = [];
    setOfnumbers = set(arr);
    for x in range(n+2):
        if x not in setOfnumbers:
            ans.append(x);
    
    return ans;