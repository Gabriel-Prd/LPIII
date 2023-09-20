from math import sqrt

total = 0
medicao = []
variacao = 0

for i in range(10):
    medido = float(input(f"Medicao {i}: "))

    medicao.append(medido)
    total += medido
    
media = total/len(medicao)

for j in medicao:
    variacao += (j - media) ** 2
    
variacao /= len(medicao)

desvio = sqrt(variacao)

print(f"Media: {media}")
print(f"desvio: {desvio}")

if desvio > variacao * 0.1:
    print("O multimetro esta com defeito.")
else:
    print("O multimetro esta funcionando.")
