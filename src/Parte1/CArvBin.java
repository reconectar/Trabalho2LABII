package Parte1;

public class CArvBin {

    class CNo {
        private int chave;
        private CNo esq, dir;

        public CNo(int k)
        {
            chave = k;
            esq = null;
            dir = null;
        }

        public CNo(int k, CNo e, CNo d)
        {
            chave = k;
            esq = e;
            dir = d;
        }
    }
    private CNo raiz = null;

    public Object get(int k)
    {
        return get(raiz, k);
    }

    private Object get(CNo no, int k)
    {
        if (no == null)
            return null;
        if (k < no.chave)
            return get(no.esq, k);
        else
            if (k > no.chave)
                return get(no.dir, k);
        return null;
    }

    public void put(int k)
    {
        raiz = put(raiz, k);
    }

    private CNo put(CNo no, int k)
    {
        if (no == null)
            return new CNo(k);
        if (k < no.chave)
            no.esq = put(no.esq, k);
        else
            if (k > no.chave)
                no.dir = put(no.dir, k);
            return no;
    }

    private void emOrdem(CNo no)
    {
        if (no != null) {
            emOrdem(no.esq);
            System.out.println(no.chave);
            emOrdem(no.dir);
        }
    }

    private void preOrdem(CNo no)
    {
        if (no != null) {
            System.out.println(no.chave);
            preOrdem(no.esq);
            preOrdem(no.dir);
        }
    }

    private void posOrdem(CNo no)
    {
        if (no != null) {
            posOrdem(no.esq);
            posOrdem(no.dir);
            System.out.println(no.chave);
        }
    }

    public void imprimeABP(int op)
    {
        if(op == 1)
            preOrdem(raiz);
        else
            if (op == 2)
               emOrdem(raiz);
            else
                if (op == 3)
                    posOrdem(raiz);
                else
                    System.out.println("Opção de impressão inválida.");
    }

    private int somaNosInt(CNo no)
    {
        if (no != null && (no.dir != null || no.esq != null))
            return no.chave + somaNosInt(no.esq) + somaNosInt(no.dir);
        else
            return 0;
    }

    public int somaNosInt()
    {
        return somaNosInt(raiz);
    }

    // Realiza a contagem de nos a partir de um dado no
    private int contaNos(CNo no)
    {
        if (no != null)
            return 1 + contaNos(no.esq) + contaNos(no.dir);
        else
            return 0;
    }

    // Chama o metodo ContaNos passando a raiz como no inicial
    public int contaNos()
    {
        return contaNos(raiz);
    }

    // Realiza a contagem de nos folhas a partir de determinado no
    private int qtdeNosFolha(CNo no)
    {
        if (no != null)
        {
            int incremento = 0;
            if (no.esq == null && no.dir == null)
                incremento++;
            return incremento + qtdeNosFolha(no.dir) + qtdeNosFolha(no.esq);
        }
        else
            return 0;
    }

    // Chama o metodo QtdeNosFolha passando a raiz como no inicial
    public int qtdeNosFolha()
    {
        return qtdeNosFolha(raiz);
    }

    // Realiza a contagem de nos internos a partir de determinado no
    private int qtdeNosInternos(CNo no)
    {
        if (no != null)
        {
            int incremento = 0;
            if (no.esq != null || no.dir != null)
                incremento++;
            return incremento + qtdeNosInternos(no.dir) + qtdeNosInternos(no.esq);
        }
        else
            return 0;
    }

    // Chama o metodo QtdeNosInternos passando a raiz como no inicial
    public int qtdeNosInternos()
    {
        return qtdeNosInternos(raiz);
    }

    // Imprime os nos folha no percurso em ordem
    private void imprimeNosFolhaEmOrdem(CNo no)
    {
        if (no != null)
        {
            imprimeNosFolhaEmOrdem(no.esq);
            if (no.esq == null && no.dir == null)
            {
                System.out.println(no.chave);
            }
            imprimeNosFolhaEmOrdem(no.dir);
        }
    }

    // Chama o metodo ImprimeNosFolhaEmOrdem passando a raiz como parametro
    public void imprimeNosFolhaEmOrdem()
    {
        imprimeNosFolhaEmOrdem(raiz);
    }

    // Imprime os nos folha no percurso em ordem
    private void imprimeNosInternosEmOrdem(CNo no)
    {
        if (no != null)
        {
            imprimeNosInternosEmOrdem(no.esq);
            if (no.esq != null || no.dir != null)
                System.out.println(no.chave);
            imprimeNosInternosEmOrdem(no.dir);
        }
    }

    // Chama o metodo ImprimeNosFolhaEmOrdem passando a raiz como parametro
    public void imprimeNosInternosEmOrdem()
    {
        imprimeNosInternosEmOrdem(raiz);
    }

    // Chama o metodo ImprimeNosFolhaEmOrdem passando a raiz como parametro
    public void ImprimeNosInternosEmOrdem()
    {
        imprimeNosInternosEmOrdem(raiz);
    }

    public void imprimeInformacoesNos()
    {
        imprimeInformacoesNos(raiz);
    }

    private void imprimeInformacoesNos(CNo no) {
        if (no != null) {
            System.out.println("Nó " + no.chave);
            int filhos = 0;
            Object filhoEsq, filhoDir;
            if (no.esq != null) {
                filhos++;
                filhoEsq = no.esq.chave;
            } else
                filhoEsq = null;

            if (no.dir != null) {
                filhos++;
                filhoDir = no.dir.chave;
            } else
                filhoDir = null;

            System.out.println("  Qtde. Filhos: " + filhos);
            System.out.println("  Filho esquerda: " + filhoEsq);
            System.out.println("  Filho direita: " + filhoDir);
            System.out.println("  Nó interno ou folha? " + (filhoEsq == null && filhoDir == null ? "Folha" : "Interno"));
            System.out.println();
            System.out.println();

            imprimeInformacoesNos(no.esq);
            imprimeInformacoesNos(no.dir);
        }
    }

    public Object maiorNo()
    {
        if (raiz != null)
            return maiorNo(raiz);
        else
            return -1;
    }

    private Object maiorNo(CNo no)
    {
        if (no.dir != null)
            return maiorNo(no.dir);
        else
            return no.chave;
    }

    private Object menorNo(CNo no)
    {
        if (no.esq != null)
            return menorNo(no.esq);
        else
            return no.chave;
    }

    public Object menorNo()
    {
        if (raiz != null)
            return menorNo(raiz);
        else
            return -1;
    }

    public boolean achou(int k)
    {
        return achouRec(raiz, k);
    }

    private boolean achouRec(CNo no, int k)
    {
        if (no != null && no.chave != k)
        {
            if (k < no.chave)
                return achouRec(no.esq, k);
            else
                return achouRec(no.dir, k);
        }

        return no != null ? true : false;
    }
    
}
