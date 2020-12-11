##滑动窗口模板
```
slidewin(str, str可选):
    //滑动窗口算法配套变量
    int[] window;
    int left,right;
    int res/array/winContainValid...
    int[] need; // 可选
    //初始化need
    need[]<-str可选
    //扩大窗口
    while(right<str.len):
        window[str[right]]++
        //更新变量
        winContainValid++
        right++//可能会变化位置
        //收缩窗口
        while(收缩条件[配套变量相关条件]):
            window[str[left]]--
            //更新变量
            left++
        //right++也可能出现在这里
    return res
```
        
        
    