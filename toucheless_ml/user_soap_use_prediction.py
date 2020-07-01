import json
import pandas as pd
import matplotlib.pyplot as plt
import numpy as np


class NN(object):
    def __init__(self):
        self.TCE = 100
        self.TCS = 1
        self.TCC = 100

        self.W1 = np.random.randn(self.TCE, self.TCC)  # 4*3
        print(self.W1)

        self.W2 = np.random.randn(self.TCC, self.TCS)  # 3*1
        print(self.W2)

    def propavant(self, X):
        self.z = np.dot(X, self.W1)
        self.a1 = self.sigmo(self.z)

        self.zz = np.dot(self.a1, self.W2)
        o = self.sigmo(self.zz)

        return o

    def sigmo(self, s):
        return 1 / (1 + np.exp(-s))

    def dsigmo(self, s):
        return s * (1 - s)

    def proparriere(self, X, y, o):
        self.o_erreur = y - o
        self.o_delta = self.o_erreur * self.dsigmo(o)


        self.a1_erreur = self.o_delta.dot(self.W2.T)
        self.a1_delta = self.a1_erreur * self.dsigmo(self.a1)

        self.W1 = self.W1 + X.T.dot(self.a1_delta)
        self.W2 = self.W2 + self.a1.T.dot(self.o_delta)

    def train(self, X, y):
        o = self.propavant(X)
        self.proparriere(X, y, o)

    def savepoids(self):
        np.savetxt("mW1.txt", self.W1, fmt="%s")
        np.savetxt("mW2.txt", self.W2, fmt="%s")

    def prediction(self):
        print("la moyenne prédite par notre reseau:")
        print("entrée normalisé de xPredicted" + str(xPredicted2))
        print("moyenne prédite normalisée:" + str(self.propavant(xPredicted2)))
        print("moyenne prédite sur 20    :" + str(self.propavant(xPredicted2) * 20))


with open('user_dummy_dataset.json') as json_dataset:
    data2 = json.load(json_dataset)
tap_uptime = [i['TAP_UPTIME'] for i in data2]
used_soap = [i['USED_SOAP'] for i in data2]

df1 = pd.DataFrame({'TAP_UPTIME': tap_uptime})
df2 = pd.DataFrame({'USED_SOAP': used_soap})
arr1 = df1.to_numpy()
arr2 = df2.to_numpy()
arr1 = list(map(int, arr1))
arr2 = list(map(int, arr2))


X = arr1

tt = np.amax(X, axis=0)
print("les valeurs maximales de x sont:")
print(tt)

y = arr2

xPredicted = [70]

print(' *****  avant normalisation   ****')
print(X)
print(y)
print(xPredicted)

print(' *****  apres normalisation   ****')
X = X / tt
print('X normalisée=')
print(X)
print('xPredicted normalisée=')
xPredicted2 = xPredicted / tt
print(" xPredicted normalié :")
print(xPredicted2)

print('y normalisée=')
print(y)

RN = NN()
niter = 1000
for i in range(niter):
    print("*******************   iteration numer:" + str(i) + "\n")
    print("sortie exacte=\n" + str(y))
    print("sortie reseau=\n" + str(RN.propavant(X)))
    RN.train(X, y)

RN.savepoids()
RN.prediction()
plt.plot(y, RN.propavant(X))
a = np.square(np.subtract(y, RN.propavant(X)).mean())
