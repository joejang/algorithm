# 关于黑盒单元测试的通用技巧

## 维度

| 序号 | 测试类型       | 说明                                                         |
| ---- | -------------- | ------------------------------------------------------------ |
| 1    | 简单边界       | NIN,-1,0,1,MAX                                               |
| 2    | 跨界（跨范围） | 从小到大、从大到小、大小交替、小大交替                       |
| 3    | 指定边界       | 指定MIN、MAX、特定值                                         |
| 4    | 初始值         | -1、0、MAX、[0]、[end]                                       |
| 5    | 数组边界       | [start-1]、[start]、[end]、[end+1]                           |
| 6    | 数组初始值     | [\*]=-1、[\*]=0、[\*]=1、[\*]=MAX、[\*]=MIN                  |
| 7    | 融合变化值     | 极大值、极小值、0、相加超界值、相减为负值                    |
| 8    | 重复个数       | 重复值、缺少值                                               |
| 9    | 最小变化       | 初始值（左右的变化形式）->第一次迭代（左右的变化形式）->末次迭代（左右的变化形式） |