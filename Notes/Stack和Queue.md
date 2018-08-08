### Java Stack 类

| 序号 | 方法描述                                                     |
| ---- | ------------------------------------------------------------ |
| 1    | boolean empty()  测试堆栈是否为空。                          |
| 2    | Object peek( ) 查看堆栈顶部的对象，但不从堆栈中移除它。      |
| 3    | Object pop( ) 移除堆栈顶部的对象，并作为此函数的值返回该对象。 |
| 4    | Object push(Object element) 把项压入堆栈顶部。               |
| 5    | int search(Object element) 返回对象在堆栈中的位置，以 1 为基数。 |



### Queue 类

| 序号 | 方法描述                                                     |
| ---- | ------------------------------------------------------------ |
| 1    | boolean add( ) 增加一个元素，如果队列已满， 则抛出一个IIIegaISlabEepeplian异常 |
| 2    | Object remove( ) 移除并返回队列头部的元素， 如果队列为空，则抛出一个NoSuchElementException异常 |
| 3    | Object element( ) 返回队列头部的元素， 如果队列为空，则抛出一个NoSuchElementException异常 |
| 4    | boolean offer( ) 添加一个元素并返回 true, 如果队列已满则返回 false |
| 5    | Object poll( ) 移除并返回队列头部的元素，如果队列为空，则返回 null |
| 6    | Object peek() 返回队列头部的元素，如果队列为空，则返回 null  |