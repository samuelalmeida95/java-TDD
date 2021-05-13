<h2 align="center"> 💻 Test-Driven Development Practices in Java</h2> 

<div align="center" > 
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
    <img src="https://img.shields.io/badge/Visual_Studio_Code-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white"/>
    <img src="https://img.shields.io/badge/Stack_Overflow-FE7A16?style=for-the-badge&logo=stack-overflow&logoColor=white"/>
</div>

<hr>
<div align="justfy"> 
 Olá! Atualmente decidi estudar sobre TDD (Test-Driven Development), e neste exercicio eu implementei alguns testes para verificar a funcionalidade de uma Pilha no Java, a seguir irei demonstrar os testes criados. 
</div>

<hr>

Deve ser capaz de: validar que uma pilha iniciada está vazia e que seu tamanho é 0. 
</br>

```java

    private Pilha p;

    @Before
    public void inicializaPilha() {
        p = new Pilha(10);
    }

    @Test
    public void pilhaVazia() {
        assertTrue(p.estaVazia());
        assertEquals(0, p.tamanho());
    }
   ``` 

  Deve ser capaz de: empilhar um elemento, validar que a pilha não é mais vazia, validar que o tamanho da pilha é 1 e validar que a mensagem do elemento no topo é o mesmo do elemento adicionado
   </br>
```java

    @Test
    public void empilhaUmElemento() {
        p.empilha("primeiro");
        assertFalse(p.estaVazia());
        assertEquals(1, p.tamanho());
        assertEquals("primeiro", p.topo());
    }   
 ```
 

Deve ser capaz de: empilhar dois elementos e desempilhar um, validar que o tamanho da pilha agora é 2, validar que o topo da pilha agora é o segundo elemento empilhado, a seguir após desempilhar um elemento é preciso validar que o tamanho da pilha agora passa a ser 1, validar que agora o topo da pilha é o primeiro elemento e validar que o elemento desempilhado foi o segundo
   </br> 

```java

    @Test
    public void empilhaEDesempilha() {
        p.empilha("primeiro");
        p.empilha("segundo");
        assertEquals(2, p.tamanho());
        assertEquals("segundo", p.topo());

        Object desempilhado = p.desempilha();
        assertEquals(1, p.tamanho());
        assertEquals("primeiro", p.topo());
        assertEquals("segundo", desempilhado);
    }   
 ```
 

 Deve ser capaz de: lancar uma exception do tipo `PilhaVaziaException` caso se tente remover um elemento de uma pilha que esteja vazia
   </br>
 ```java

    @Test(expected = PilhaVaziaException.class)
    public void removeDaPilhaVazia() {
        p.desempilha();
    }
 ```
  
  Deve ser capaz de: lancar uma exception do tipo `PilhaCheiaException` caso se tente adicionar um elemento em uma pilha que já tenha chegado ao seu limite de elementos.
   </br>
   ```java
   @Test
    public void adicionaNaPilhaCheia() {

        for (int i = 0; i < 10; i++) {
            p.empilha("elemento" + i);
        }
        try {
            p.empilha("BOOM");
            fail();

        } catch (PilhaCheiaException e) {}
    }    
 ```
