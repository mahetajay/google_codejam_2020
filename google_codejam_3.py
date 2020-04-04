#!/usr/bin/env python
# coding: utf-8

# In[4]:


test=int(input())
def fun1(item):                                                         
    return item[0]
def fun2(item):
    return item[2]                                                      

list1=[]
list2=[]
for i in range(0,test):
    n=int(input())                                                
    list1.clear()
    for j in range(0,n):
        list2=[]
        list2=[int(x) for x in input().split(" ")]
        list2.append(j)
        list1.append(list2)
    list1.sort(key=fun1)
    c=-1
    j=-1
    temp=True
    for a in list1:
        temp1=a[0]                                                
        temp2=a[1]
        if(c==-1):
            c=temp2
            a.append('C')
        elif(temp1>=c):
            c=temp2
            a.append('C')                                           
        elif(temp1<c and temp1>=j):
            j=temp2
            a.append('J')                                          
        elif(temp1<c and temp1<j):
            temp=False
            break
    if(temp==False):
        str="IMPOSSIBLE"
    else:
        str=""
        list1.sort(key=fun2)
        str=str.join([a[3] for a in list1])
    print("Case #{}: {}".format(i+1,str))                                                      


# In[ ]:




