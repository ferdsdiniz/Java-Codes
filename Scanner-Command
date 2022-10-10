---------------------------------------------------------------------Entrada de dados-------------------------------------------------------------------------------------

Um processo é uma sequência finita ordenada de passos que transforma uma determinada matéria prima. Quando a matéria prima usada no processo é abstrata, 
isto é, se apresenta na forma de valores e quantidades, então denomina-se de processamento de dados. Quando o processamento é realizado por um computador, 
a entrada refere-se aos dados obtidos na forma bruta, que são colhidos do mundo real através de um dispositivo de entrada, como por exemplo, o teclado.


-----------------------------------------------------------------------Classe Scanner-------------------------------------------------------------------------------------

 Em linguagens de programação estruturada, como C e Pascal, a entrada de dados usando o teclado é realizada utilizando subprogramas desenvolvidos para esta finalidade. 
Em C, por exemplo, tem-se a função scanf() e em Pascal, o procedimento readln().
Na linguagem Java, a partir do Java 1.5 ou Java 5.0, o pacote de classes java.util disponibilizou a classe Scanner, 
que implementa operações de entrada de dados pelo teclado.
A classe Scanner possui vários métodos que possibilitam a entrada de dados de diferentes tipos, entre eles destacam-se:

•String next() - retorna uma cadeia de caracteres simples, ou seja, que não usa o caractere espaço em branco;
•double nextDouble() - retorna um número em notação de ponto flutuante normalizada em precisão dupla de 64 bits (usado para receber valores reais ou monetários);
•boolean hasNextDouble() - retorna true se o próximo dado de entrada pode ser interpretado como um valor double;
•int nextInt() - retorna um número inteiro de 32 bits;
•boolean hasNextInt() - retorna true se o próximo dado de entrada pode ser interpretado como um valor int;
•String nextLine() - retorna uma cadeia de caracteres, por exemplo: “DevMedia - Canal Java”;
•long nextLong() - retorna um número inteiro de 64 bits.

Para utilizar a classe Scanner em uma aplicação Java deve-se proceder da seguinte maneira:

1. Importar o pacote java.util:
import java.util.Scanner;

3. Instanciar e criar um objeto Scanner usando o dispositivo padrão de entrada (System.in):
Scanner ler = new Scanner(System.in);

3. Utilizar os métodos da classe Scanner adequados aos tipos das variáveis envolvidas. 
Os exemplos de entradas de dados serão demonstrados usando as seguintes variáveis:

int n;
double preco;
String palavra;
String frase;

  3.1. Lendo um valor inteiro:
  System.out.printf("Informe um número para a tabuada:\n");
  n = ler.nextInt();
  
  3.2. Lendo um valor real: 
  System.out.printf("Informe o preço da mercadoria:\n");
  preco = ler.nextDouble();

  3.3. Lendo uma String: 
  System.out.printf("Informe uma palavra:\n");
  palavra = ler.next();
  
  3.4. Lendo uma String: 
  System.out.printf("Informe uma frase:\n");
  frase = ler.nextLine();

  
---------------------------------------------------------------------Minha primeira aplicação---------------------------------------------------------------------------

Os passos necessários para utilização da classe Scanner são demonstrados na classe Exemplo1, apresentada na Listagem 1. 
No código desta classe podemos verificar como usar o método nextInt() na entrada de dados numéricos do tipo inteiro (int), 
que em nosso exemplo são utilizados para a realização de operações matemáticas.

import java.util.Scanner; // 1. importando a classe Scanner

public class Exemplo1 {

  public static void main(String[] args) {
  Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
  int a, b;

  System.out.printf("Informe o primeiro valor: ");
  a = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)

  System.out.printf("Informe o segundo valor.: ");
  b = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)

  System.out.printf("\nResultados:\n");
  System.out.printf("%d + %d = %3d\n", a, b, (a + b));
  System.out.printf("%d - %d = %3d\n", a, b, (a - b));
  System.out.printf("%d * %d = %3d\n", a, b, (a * b));
  System.out.printf("%d / %d = %3d (divisão inteira)\n", a, b, (a / b));
  System.out.printf("%d / %d = %6.2f (divisão exata)\n", a, b, ((double)a / b));
  }

}

O código fonte, apresentado na Listagem 1, implementa a entrada de dois valores inteiros (variáveis a e b, respectivamente) 
que serão usados nas operações matemáticas de adição, subtração, multiplicação, divisão inteira e divisão exata realizadas nos comandos de saída System.out.printf(). 
Pode-se observar também que através de comentários foram colocados em destaque às etapas:

1. importando a classe Scanner;
2. instanciando e criando um objeto Scanner denominado ler; e
3. entrada de dados (lendo um valor inteiro); 
necessárias para utilizar a classe Scanner na entrada de dados do tipo inteiro (int). A Figura 2 ilustra a execução da classe Exemplo1.

-------------------------------------------------------------------Esvaziando o buffer do teclado-----------------------------------------------------------------------

O buffer de entrada é uma entidade intermediária estabelecida entre duas outras entidades:

o dispositivo de entrada utilizado (teclado), e
a aplicação Java. A primeira produzindo dados e a segunda consumindo através dos comandos de entrada.
Como estas entidades podem estar operando em diferentes velocidades, internamente, um buffer de entrada possui uma área de memória que é 
utilizada para o armazenamento temporário de dados que foram produzidos, mas ainda não foram consumidos.

Para utilização correta do buffer, quando existe a necessidade de realizar uma entrada consecutiva de dados numéricos e cadeias de caracteres, 
deve-se esvaziar o buffer depois da leitura do valor numérico e antes da leitura de um valor do tipo String, como implementado na classe Exemplo2, 
apresentada na Listagem 2.

import java.util.Sca // 1. importando a classe Scanner

public class Exemplo2 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in)
    // 2. instanciando e criando um objeto Scanner
    int idade;
    String nome;

    System.out.printf("Informe a sua idade:\n");
    idade = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)

    ler.nextLine(); // esvazia o buffer do teclado

    System.out.printf("\nInforme o seu nome:\n");
    nome = ler.nextLine(); // 3. entrada de dados (lendo uma String)

    System.out.printf("\nResultado:\n");
    System.out.printf("%s tem %d anos.\n", nome, idade);
  }

}


O código fonte, apresentado na Listagem 2, implementa três comandos de entrada de dados para:

a. efetuar a leitura da idade de uma pessoa;
b. consumir o valor armazenado no buffer para esvaziá-lo; e
c. obter o nome de uma pessoa.



-----------------------------------------------------------------------Lendo um caractere-------------------------------------------------------------------------------

Diferentemente do que ocorre com os tipos base int e double, a classe Scanner não oferece um método específico para a leitura de dados do tipo caractere (char). 
Assim, para ler um caractere deve-se utilizar o método read() da classe System através do fluxo de entrada de 
dados padrão System.in, como implementado na classe Exemplo3, apresentada na Listagem 3.


import java.io.IOException;
import java.util.Scanner;
// 1. importando a classe Scanner

public class Exemplo3 {

  public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
    // 2. instanciando e criando um objeto Scanner
   String nome;
   char sexo;

   System.out.printf("Informe um nome:\n");
   nome = ler.nextLine();
   // 3. entrada de dados (lendo uma String)

   System.out.printf("\nInforme o sexo (M/F): ");
   sexo = (char)System.in.read();
   // entrada de dados (lendo um caractere)

    System.out.printf("\nResultado:\n");
   if ((sexo == 'M') || (sexo == 'm'))
      System.out.printf("Seja bem vindo Sr. \"%s\".\n", nome);
   else System.out.printf("Seja bem vinda Sra. \"%s\".\n", nome);
  }

}


O código fonte, apresentado na Listagem 3, 
implementa dois comandos de entrada de dados para efetuar a leitura do nome e do sexo de uma pessoa, para em seguida mostrar uma 
mensagem particular de boas vindas. Também pode-se observar que na utilização do método read(), é necessário reportar o uso da cláusula throws 
com a exceção IOException no cabeçalho do método main(), para indicar que não serão tratados os possíveis erros que 
poderiam ocorrer na entrada de dados do tipo caractere com o respectivo método.


Outro exemplo para demonstrar uma entrada de dados do tipo caractere foi apresentado na classe Exemplo4, mostrada na Listagem 4, 
implementada para calcular o peso ideal de uma pessoa em função do seu sexo e da sua altura.


import java.io.IOException;
import java.util.Scanner;
// 1. importando a classe Scanner

public class Exemplo4 {

  public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
    // 2. instanciando e criando um objeto Scanner
    char sexo;
    double h, psIdeal;

    System.out.printf("Informe o sexo (M/F)........: ");
    sexo = (char)System.in.read();
    // entrada de dados (lendo um caractere)

    System.out.printf("Informe a altura (em metros): ");
   h = ler.nextDouble();
   // 3. entrada de dados (lendo um valor real)

    if ((sexo == 'M') || (sexo == 'm'))
      psIdeal = (72.7 * h) - 58;
    else psIdeal = (62.1 * h) - 44.7;

    System.out.printf("\nPeso Ideal = %.2f kgs\n", psIdeal);
  }

}


O código fonte, apresentado na Listagem 4, implementa dois comandos de entrada de dados para efetuar a 
leitura do sexo e da altura (como um valor em metros, variável h) de uma pessoa que serão aplicados nas seguintes fórmulas:


•Para homens, peso ideal = (72,7 * h) - 58;
•Para mulheres, peso ideal = (62,1 * h) - 44,7.


---------------------------------------------------------------------------Saída de Dados---------------------------------------------------------------------------------

Como já informado, no processamento de dados, a entrada refere-se à etapa em que os dados são colhidos do mundo real, externo ao computador,
e o processo refere-se a uma série finita de operações que são realizadas a partir destes dados,
a fim de transformá-los em alguma informação desejada disponibilizada ao usuário final através de um dispositivo de saída, por exemplo, o monitor de vídeo.

Método printf()
Uma saída pode ser composta por informações textuais individuais e na forma de tabelas, valores numéricos resultantes de cálculos, 
constantes e pelo conteúdo de variáveis definidas no programa. Estas informações ou resultados são apresentados, principalmente, na tela do computador 
e servem como forma de verificar se o problema foi resolvido.

A classe System oferece atributos e métodos que possibilitam obter uma referência às operações de entrada e saída. 
O atributo estático out, por exemplo, representa o fluxo padrão de saída de dados. Já o método printf(), incorporado à classe System a partir do Java 1.5, 
permite exibir dados formatados de forma equivalente à função de saída “printf” da linguagem C.

O método printf(), utilizado para realizar uma saída de dados no fluxo de saída padrão System.out, tem a seguinte forma geral:

System.out.printf(expressão_de_controle, argumento1, argumento2, ...);


A expressão_de_controle deve ser uma sequência de caracteres (portanto, delimitada por aspas duplas) que determina as informações que serão mostradas na tela. 
Nesta expressão podem existir dois tipos de informações: caracteres comuns e códigos de controle (ou especificadores de formato). 
Os códigos de controle, mostrados na Tabela 1, são precedidos por um % e são aplicados aos argumentos na mesma ordem em que aparecem. 
É importante destacar que deve existir para cada código de controle um argumento correspondente.

•%c - Caractere simples (char)
•%s - Cadeia de caracteres (String)
•%d - Inteiro decimal com sinal (int)
•%i - Inteiro decimal com sinal (int)
•%ld - Inteiro decimal longo (long)
•%f - Real em ponto flutuante (float ou double)
•%e - Número real em notação científica com o "e" minúsculo (float ou double)
•%E - Número real em notação científica com o "E" maiúsculo (float ou double)
•%% - Imprimir o próprio caractere %

Outro elemento que pode ser acrescentado à expressão_de_controle, usada no método printf(), são os caracteres de escape utilizados com o seu 
significado original alterado. Por exemplo, o caractere aspas dupla (“) é utilizado para delimitar uma cadeia de caracteres, desta forma, para usá-lo c
omo parte do conteúdo da própria cadeia deve-se transformá-lo em um caractere de escape, alterando assim sua finalidade inicial. 
A Tabela 2 mostra os principais caracteres de escape, que são sempre iniciados por uma barra invertida (\).

•\n - Nova linha
•\t - Tabulação horizontal (o mesmo que pressionar a tecla Tab)
•\" - Aspas duplas
•\\ - Barra invertida

-------------------------------------------------------------------Usando largura e precisão na saída-------------------------------------------------------------------
A formatação de uma informação na saída de dados pode ser incrementada especificando-se a largura e a precisão do campo de saída. 
O formato desejado é determinado acrescentando valores que indicam o tamanho e a precisão entre o símbolo % e o código de controle, por exemplo:

1. %3d - mostra o valor justificando à direita em três posições (ou colunas) da tela do computador:

//trecho de código:
int a = 1, b = 10, c = 100;
System.out.printf("'a' = %3d\n'b' = %3d\n'c' = %3d\n", a, b, c);

resultado: 

'a' =   1
'b' =  10
'c' = 100

2. %8.2f - indica que um número de ponto flutuante será mostrado justificado à direita dentro de um campo de saída de tamanho oito e com duas casas 
decimais de precisão fazendo arredondamentos (%8.2f mostra valores no formato 99999,99):

//trecho de código:
double a = 135.4528;
double b = 23050.568;
double c = 5.0;
System.out.printf("Variavel 'a' = %8.2f\n", a);
System.out.printf("Variável 'b' = %8.2f\n", b);
System.out.printf("Variável 'c' = %8.2f\n", c);

resultado:

Variável 'a' =   135,45
Variável 'b' = 23050,57
Variável 'c' =     5,00

A Tabela 3 mostra uma relação de códigos adicionais que podem ser empregados na formatação de saídas de dados.
____________________________________________________________________________________
| Código | Significado                                                             |
|    -   | Alinha o valor à esquerda dentro do campo de saída                      |
|    +   | Coloca sinal em valores numéricos                                       |
|    0   | Completa o campo de saída com zeros à esquerda                          |
|    ,   | Usa o separador de milhares: ponto na notação BR e vírgula na Americana |
|    (   | Mostra números negativos entre parênteses                               | 

Nas listagens a seguir serão apresentadas três aplicações Java desenvolvidas para exemplificar a 
utilização do método printf() no fluxo de saída de dados padrão System.out:

1. tabuada de um número;
2. mostrando os nomes dos meses; e
3. mostrando os elementos de um vetor.

A classe Exemplo5, mostrada na Listagem 5, implementa o algoritmo para calcular a tabuada de um número.

import java.util.Scanner;

public class Exemplo5 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int i, n;

    System.out.printf("Informe o número para a tabuada:\n");
    n = ler.nextInt();

    System.out.printf("\n+--Resultado--+\n");
    for (i=1; i<=10; i++) {
      System.out.printf("| %2d * %d = %2d |\n", i, n, (i*n));
    }
    System.out.printf("+-------------+\n");
  }

}

O código fonte, apresentado na Listagem 5, 
implementa uma entrada de dados para ler um número inteiro (variável n) usado no processo de repetição (for) para montar a tabuada de n. 

classe Exemplo6, mostrada na Listagem 6, imprime uma tabela com os nomes dos meses do ano.
 
public class Exemplo6 {

    public static void main(String[] args) {
      String nomeMes[] = {"Janeiro", "Fevereiro", "Março",
        "Abril", "Maio", "Junho", "Julho", "Agosto",
        "Setembro", "Outubro", "Novembro", "Dezembro"};

      System.out.println("================");
      System.out.println("Mês- Nome do Mês");
      System.out.println("================");
      for (int i=0; i<12; i++) {
        System.out.printf(" %0,2d- %s\n", (i+1), nomeMes[i]);
      }
      System.out.println("================");
    }

  }

O código fonte, apresentado na Listagem 6, implementa um vetor (variável nomeMes) que indexa os valores relacionados aos nomes dos meses para montar uma tabela.


A classe Exemplo7, mostrada na Listagem 7, imprime os valores armazenados em uma variável do tipo vetor (v), 
como pode ser observado através da sua execução.

public class Exemplo7 {

  public static void main(String[] args) {
    int i, v[] = {3, 7, 8, 20, 11, 0, 9, 43, 6, 5};

    for (i=0; i<v.length; i++) {
      System.out.printf("v[%d]= %2d\n", i, v[i]);
    }
  }

}



-----------------------------------------------------------------Exemplos de erros (exception)-------------------------------------------------------------------------
 Os códigos de controle, quando usados na expressão_de_controle de uma instrução System.out.printf(), devem corresponder à lista de argumentos declarada. 
Esta correspondência diz respeito aos tipos de dados envolvidos e também à quantidade de controles e argumentos declarados. 
As incompatibilidades, quando existirem, irão provocar erros do tipo:

1. Tentativa de exibir uma informação (variável b do tipo int) na saída de tipo diferente do especificado pelo código de controle (%f), por exemplo:

//trecho de código:
int a = 10, b = 5;
System.out.printf("Variável 'a' = %d\n", a);
System.out.printf("Variável 'b' = %f\n", b);

resultado:

Variável 'a' = 10
Variável 'b' = java.util.IllegalFormatConversionException

2. Quantidade de códigos de controle diferente da quantidade de argumentos. 
No exemplo a seguir, têm-se três códigos de controle (%d/%d/%d) para apenas dois argumentos (dia e mes):

//trecho de código:
int dia = 30, mes = 11, ano = 1965;
System.out.printf("Nascido em %d/%d/%d\n", dia, mes);

resultado:

Nascido em 30/11/java.util.MissingFormatArgumentException


-------------------------------------------------------------------Método print() e println()------------------------------------------------------------------------------

Usuários recorrem à utilização de programas de computador pela necessidade de informações rápidas para auxiliar no processo de tomada de decisão. 
Portanto, a tarefa de exibir os resultados na tela do computador acaba se constituindo uma das principais etapas do processamento de dados.

Outros métodos disponíveis na classe System para realizar uma saída de dados no monitor de vídeo são: print() e println(). 
Basicamente, o método println() imprime na tela uma cadeia de caracteres (ou String) que é enviada ao método como argumento usando a seguinte forma geral:

System.out.println(String);

A diferença entre os métodos print() e println() acontece uma vez que o método println() sempre pulará uma linha após mostrar o valor do seu argumento.

A aplicação Java que calcula o fatorial de um número, apresentada na Listagem 8, mostra um exemplo de como usar os métodos print() e println() para 
exibir resultados em uma operação de saída de dados usando o monitor de vídeo.

import java.util.Scanner;

  public class Exemplo8 {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int i, n, f;

      System.out.println("Informe o número para o fatorial:");
      n = ler.nextInt();

      System.out.println();
      System.out.println("Resultado:");
      System.out.print(n + "! = ");

      f = 1;
      for (i=n; i>=1; i--) {
        if (i != 1)
           System.out.print(i + " * ");
        else System.out.print(i + " = ");

        f = f * i;
      }

      System.out.println(f);
    }

  }

O código fonte, apresentado na Listagem 8, implementa uma entrada de dados para ler um número inteiro (variável n) usado no processo de repetição (for) 
para calcular o fatorial de n, que matematicamente é indicado como n!. A execução da classe ilustra o passo a passo do desenvolvimento do cálculo do fatorial 
usando adequadamente os métodos print() e println().

Conclusões
Neste artigo foram apresentados os conceitos fundamentais relacionados ao processamento de dados que corresponde à utilização do computador na solução lógica de problemas. 
O processamento transforma os dados como insumos (entradas) e produzem informações como resultados (saídas).
As operações de entrada de dados foram implementadas usando os métodos da classe Scanner do pacote java.util. 
Inicialmente foram relacionados os passos para importar o pacote, instanciar e criar um objeto de leitura e a utilização do método adequado na entrada de dados. 
Em seguida foi destacada a necessidade de esvaziar o buffer do teclado em uma entrada consecutiva de dados numéricos e cadeia de caracteres. 
A etapa de entrada de dados foi concluída apresentando como deve ser realizada a leitura de dados do tipo caractere.
As formas para exibir as informações produzidas pelo processamento de dados foram estudadas através dos métodos printf(), print() e println() da classe System. 
O maior destaque foi dado ao método printf(), que possibilita a formatação da saída através da utilização de códigos de controle e caracteres de escape na 
implementação.

Para finalizar, vale ressaltar que a entrada e a saída de dados representam etapas fundamentais do processamento de dados, uma vez que as aplicações em geral 
implementam algum tipo de interação com o usuário solicitando dados de entrada para transformá-los em informações uteis como resposta.















