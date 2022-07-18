def solve(n, nums): 
    # CODE HERE idx1,idx2=-1,-1 n =len(nums) if n==1: return for i in range(n-2,-1,-1): if nums[i]<nums[i+1]: idx1=i break

    if idx1<0:
    return nums[::-1]
    else:
        for i in range(n-1,-1,-1):
            if nums[i]>nums[idx1]:
                idx2=i
                break
    nums[idx1],nums[idx2]=nums[idx2],nums[idx1]
    nums[idx1+1:]=sorted(nums[idx1+1:])

    return nums