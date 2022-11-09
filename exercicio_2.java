public class procurarNoNaABB {
    public static Node procurarNoNaABB(No no, int valor) {
        
        //caso base ou quando acaba arvore
        if(no == null) {
            return null;
        }

        //quando achamos o no na ABB
        if(no.valor == valor) {
            return no;
        } 

        //Se o numero/valor eh menor do que o do no atual, vai para sub-arvore da esquerda     
        else if(valor < no.valor)
            return procurarNoNaABB(no.esquerdo,valor);

        //Se o numero/valor eh maior do que o do no atual, vai para sub-arvore da direita
        else
            return procurarNoNaABB(no.direito,valor);
        
    }
}