public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal da TV? " + smartTv.canal);
        System.out.println("Qual o volume da TV? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Comando 1 do Usuário - A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Comando 2 do Usuário - A TV está ligada? " + smartTv.ligada);

        smartTv.aumentarCanal();
        smartTv.aumentarVolume();
        System.out.println("Comando 3 do Usuário - Qual o canal da TV? " + smartTv.canal);
        System.out.println("Comando 4 do Usuário - Qual o volume da TV? " + smartTv.volume);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Comando 5 do Usuário - Qual o canal da TV? " +smartTv.canal);

        smartTv.digitarCanal(10);
        System.out.println("Comando 6 do Usuário - Qual o canal da TV? " +smartTv.canal);


    }
}
