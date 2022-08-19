class Pessoa():
    nome = None
    idade = None

    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def envelhecer(self):
        self.idade += 1

class Atleta(Pessoa):
    peso = None
    aposentado = None

    def __init__(self, nome, idade, peso):
        super().__init__(nome, idade)
        self.peso = peso

    def aquecer(self):
        print('Atleta aquecido.')

    def aposentar(self):
        self.aposentado = True

class Corredor(Atleta):
    def correr(self):
        print('Corredor correndo.')

class Nadador(Atleta):
    def nadar(self):
        print('Nadador nadando.')

class Ciclista(Atleta):
    def pedalar(self):
        print('Ciclista pedalando.')


if __name__ == '__main__':
    corredor_1 = Corredor('Vanderlei', 27, 75)
    corredor_1.aquecer()
    corredor_1.correr()
    
    nadador_1 = Nadador('Gustavo', 35, 80)
    print('Nadador 1 aposentado?',
                'Sim' if nadador_1.aposentado else 'Nao')

    nadador_1.nadar()
    nadador_1.envelhecer()
    nadador_1.aposentar()
    print('Nadador 1 já aposentou?',
                'Sim' if nadador_1.aposentado else 'Nao')
