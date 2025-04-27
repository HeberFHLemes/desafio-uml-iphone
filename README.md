# Modelagem e Diagramação de um Componente iPhone

### Diagrama UML das funcionalidades requisitadas do iPhone
##### UML desenvolvido com Mermaid

```mermaid
classDiagram
direction TB
    class IPhone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
    class ReprodutorMusical {
	    +tocar()
	    +pausar()
	    +selecionarMusica(String musica)
    }
    class AparelhoTelefonico {
	    +ligar(String numero)
	    +atender()
	    +iniciarCorreioVoz()
    }
    class NavegadorNaInternet {
	    +exibirPagina(String url)
	    +adicionarNovaAba()
	    +atualizarPagina()
    }
    <<Class>> IPhone
    <<Interface>> ReprodutorMusical
    <<Interface>> AparelhoTelefonico
    <<Interface>> NavegadorNaInternet
    IPhone ..|> ReprodutorMusical
    IPhone ..|> AparelhoTelefonico
    IPhone ..|> NavegadorNaInternet
```
<hr>

##### Neste repositório há um print de como é visualmente, no GitHub mesmo, o diagrama acima. (Conferir diagrama.png)

##### Os arquivos de projeto tratam-se de uma implementação-exemplo, bem simples, destas funcionalidades, focando no estudo de interfaces e programação orientada a objetos no geral.