def solve(n, nums):
    # CODE HERE

    start = 0;
    end = len(nums)-1;

    while(start <= end):

        if(nums[start] <= nums[end]):
            return nums[0];
        
        mid = (start+ end)//2;
        nex = (mid + 1)%n;
        prev = (mid -1 + n)%n

        if(nums[mid] <= nums[prev]  and nums[mid] <= nums[nex]):
            return nums[mid];

        if(nums[start] <= nums[mid]):
            start = mid;
        else:
            end = mid;

    