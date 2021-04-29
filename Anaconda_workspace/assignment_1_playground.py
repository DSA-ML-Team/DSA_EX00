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
    














