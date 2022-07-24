def solve(n, nums):
    # CODE HERE
    occCount = {};
    for x in nums:
        if x in occCount:
            occCount[x] +=1;
        else:
            occCount[x] = 1;
    
    for el in occCount:
        if(occCount[el] ==1):
            return el;