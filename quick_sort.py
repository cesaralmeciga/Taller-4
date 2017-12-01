from random import randint
#Author Cesar lmeciga
#date 29-11-17
#Version 2
#Program that arranges digits by the quick method
def Quick_sort(V):
    pivote = len(V)//2
    menor, igual, mayor = [],[],[]
    
    for i in range(len(V)):
        if(V[i] < V[pivote]): menor.append(V[i])
        elif(V[i]> V[pivote]): mayor.append(V[i])
        else: igual.append(V[i])
        
    if len(menor)>1: 
        menor = Quick_sort(menor)
    if len(mayor)>1: 
        mayor = Quick_sort(mayor)
    return menor + igual + mayor


def main():
    
    Tamain = (input("Escriba la Sucesion de numeros separados por comas \n"))
    print(Tamain)
    Tamain_2 = Tamain.split("," or ".")
    print(Tamain_2)
    print(Quick_sort(Tamain_2))
    
main()
