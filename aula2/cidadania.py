class Pessoa():
    nome = None
    idade = None
    sexo = None

    def __init__(self, nome, idade, sexo):
        self.nome = nome
        self.idade = idade
        self.sexo = sexo

class Cidadao(Pessoa):
    cpf = None

    def __init__(self, nome, idade, sexo, cpf):
        super().__init__(nome, idade, sexo)
        self.cpf = cpf

    def to_string(self):
        return f'Nome: {self.nome}\nIdade: {self.idade}\nSexo: {self.sexo}\nCPF: {self.cpf}'

if __name__ == '__main__':
    nome = input('Nome do cidadao: ')
    idade = input('Idade do cidadao: ')
    sexo = input('Sexo do cidadao: ')
    cpf = input('CPF do cidadao: ')

    cidadao = Cidadao(nome, idade, sexo, cpf)
    print(cidadao.to_string())
    