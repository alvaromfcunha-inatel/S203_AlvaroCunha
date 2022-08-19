class Pai(object):
    nome = 'Carlos'
    sobrenome = 'Oliveria'
    residencia = 'Ilha Bela'
    olhos = 'azuis'

class Filha(Pai):
    nome = 'Luciana'
    olhos = 'castanhos'

class Neta(Filha):
    nome = 'Maria'

print('Nomes:')
print(Pai.nome, Pai.sobrenome)
print(Filha.nome, Filha.sobrenome)
print(Neta.nome, Neta.sobrenome)