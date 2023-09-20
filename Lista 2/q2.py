from random import randint

def main():
        
    dado1 = randint(1,6)
    dado2 = randint(1,6)
    pontos = dado1 + dado2

    print(f"Dado 1: {dado1}, Dado 2: {dado2}")
    print(f"Pontos: {pontos}")

    if pontos in [7, 11]:
        print("Voce ganhou!!")
        return

    if pontos in [2, 3, 12]:
        print("Voce perdeu.")
        return

    print("Fase 2")

    cont = 0

    while True:
        cont += 1
        dado1 = randint(1,6)
        dado2 = randint(1,6)
        pontos2 = dado1 + dado2

        print(f"Dado 1: {dado1}, Dado 2: {dado2}")
        print(f"Jogada {cont}, Pontos: {pontos2}")

        if pontos2 == 7:
            print("Voce perdeu.")
            return

        if pontos2 == pontos:
            print("Voce ganhou!!")
            return

if __name__ == "__main__":
        main()