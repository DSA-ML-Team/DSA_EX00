# -*- coding: utf-8 -*-
import matplotlib.pyplot as plt
import numpy as np


def load_wine_dataset():
    from sklearn import datasets
    wine = datasets.load_wine()
    X = wine.data
    y = wine.target
    return X, y
    
X, y = load_wine_dataset()

NumberOfSamples = X.shape[0]
print("Number of Samples:",NumberOfSamples)

NumberOfClass0 = y[y == 0].size
NumberOfClass1 = y[y == 1].size
NumberOfClass2 = y[y == 2].size

#range(0,3) will iterate in 0,1,2 stop at 3
#but 3 will not be included
for i in range(0,3):
    print("Number of class",i,"is:", y[y == i].size)
    
#####mean#####
featureMean = np.mean(X, axis = 0) 
featureSTD  = np.std(X, axis = 0)
for i in range(13):
    print("Mean of attribute ",i,"is :",featureMean[i] )
    print("STD of attribute ",i,"is :",featureSTD[i] )


###plotting
merged_set = np.column_stack([y,X])
Alcohol_set = merged_set[:,1]
Magnesium_set = merged_set[:,5] 
color = []
for i in merged_set[:,0]:
    if i == 0:
        color.append("red")
    if i == 1:  
        color.append("blue")
    if i == 2:
        color.append("green")
plt.scatter(Alcohol_set, Magnesium_set, c=color, alpha=0.5)
    
##########
def train_test_split(X,y):
    pick_list = np.array(range(0,X.shape[0]))
    np.random.shuffle(pick_list)
    #now compute the size to split
    set_size = X.shape[0]
    train_size = int(set_size*0.7)
    #apply it as the index
    #checked: train_index+test_index = 178= pick_list
    train_index = pick_list[0 : train_size]
    test_index = pick_list[ (train_size): ]
    #now assign the origin data along the index
    X_train = np.ndarray(shape = (train_size, 13) )
    X_test = np.ndarray(shape = (( set_size- train_size), 13) )
    y_train = np.ndarray(shape = (train_size, 1))
    y_test = np.ndarray( shape = (( set_size- train_size), 1))
    #now put it inside the results sets
    for i in range(train_size):
        X_train[i, ] = X[ train_index[i] ,]
        y_train[i , ] = y[train_index[i] ,]
    for i in range(set_size - train_size ):
        X_test[i, ] = X[test_index[i], ]
        y_test[i , ] = y[test_index[i], ]

    return X_train, X_test, y_train, y_test        


X_train, X_test, y_train, y_test = train_test_split(X, y)



