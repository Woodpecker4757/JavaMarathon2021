package day7;

public class Player {
    private int stamina;

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6 && stamina>MIN_STAMINA && stamina <= MAX_STAMINA) {
            countPlayers++;
        }if(stamina <= MIN_STAMINA){
            System.out.println("Создать " + countPlayers + " из за нехватки выносливости");
        }if(stamina > MAX_STAMINA ){
            System.out.println("Создать " + countPlayers + " из за переизбытка выносливости");
        }
    }
        public void run(){
            if(stamina <= 0){
                countPlayers--;
                stamina--;
                System.out.println("Игрок слишком устал."+stamina);
                stamina = 0;
            }else {
                stamina--;
                System.out.println("Пробежка удалась " + stamina);
            }


        }


    public static void info(){
        if(countPlayers < 6){
            System.out.println("Команды не полные, еще есть " + (6 - countPlayers) + " свободных мест");
        }else {
            System.out.println("Мест в командах больше нет");
        }
    }
}
