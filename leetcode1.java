class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> lookup;
        int N = nums.size();
        for(int i = 0; i < N; i++)
        {
            int value = nums[i];
            if( lookup.count(target - value) )
            {
                vector<int> ret;
                ret.push_back(lookup[target - value]);
                ret.push_back(i);
                return ret;
            }
            lookup.insert(pair<int, int>(value, i));
        }
    }
};
