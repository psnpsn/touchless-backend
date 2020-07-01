import json
import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
from bin import prediction
from bin import idUsr

with open('dummy_dataset.json') as json_dataset:
    data = json.load(json_dataset)

print(data)

tap_uptime = [i['TAP_UPTIME'] for i in data]
uses = [i['USES'] for i in data]

df = pd.DataFrame({'TAP_UPTIME': tap_uptime, 'USES': uses})

print(df.sort_values(by='USES'))

plt.bar(tap_uptime, uses)
plt.show()

with open('user_dummy_dataset.json') as json_dataset:
    data2 = json.load(json_dataset)

print(data2)

tap_uptime1 = [i['TAP_UPTIME'] for i in data2]
used_soap = [i['USED_SOAP'] for i in data2]

df1 = pd.DataFrame({'USED_SOAP': used_soap})
print(df1)

arr = df1.to_numpy()
print(arr)
arr1 = arr
arr1 = list(map(int, arr1))

countF = 0
countT = 0
for val in arr1:
    if val == 1:
        countT += 1
    else:
        countF += 1
print(countF, countT)
values = [countT, countF]
explode = (0, 0.1)
plt.pie(values, explode=explode, labels=('True', 'False)'), startangle=90)
plt.show()
print("In the next use, the user ", idUsr, " will use the soap :", prediction)