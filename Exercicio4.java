public class Exercicio4 {
        public static void main(String[] args) {
            int populacaoPaisA = 80000, populacaoPaisB = 200000, numeroAnos = 0;
            double taxaCrescimentoA = 0.03, taxaCrescimentoB = 0.015;
            
            while (populacaoPaisA <= populacaoPaisB) {
                populacaoPaisA += (int) (populacaoPaisA * taxaCrescimentoA);
                populacaoPaisB += (int) (populacaoPaisB * taxaCrescimentoB);
                numeroAnos++;
            }
    
            System.out.println("Serão necessários "+numeroAnos+" anos para a população do País A ultrapassar ou igualar a população do País B");
        }

    
}
