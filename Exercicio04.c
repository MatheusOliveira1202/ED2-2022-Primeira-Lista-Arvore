typedef struct no{
    int valor;
    struct no *direita, *esquerda;
}NoAbb;

void inserir_iterativo(NoAbb **raiz, int num){
    NoAbb *aux = *raiz;
    while(aux){
        if(num < aux->valor)
            raiz = &aux->esquerda;
        else
            raiz = &aux->direita;
        aux = *raiz;
    }
    aux = malloc(sizeof(NoAbb));
    aux->valor = num;
    aux->esquerda = NULL;
    aux->direita = NULL;
    *raiz = aux;
}
