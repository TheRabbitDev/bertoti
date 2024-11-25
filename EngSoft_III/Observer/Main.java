class Observer {
    public static void main (String[] args){
        TopicoEmail games = new TopicoEmail("games");
        TopicoEmail youtube = new TopicoEmail("youtube");
        User arnold = new User("Arnold");
        User bianca = new User("Bianca");
        User carlos = new User("Carlos");

        System.out.println("\n\t*Subscribing users to games*");
        games.subscribe(arnold);
        games.subscribe(carlos);
        games.sendEmail();

        System.out.println("\n\t*Subscribing users to youtube*");
        youtube.subscribe(bianca);
        youtube.subscribe(carlos);
        youtube.sendEmail();

        System.out.println("\n\t*Unsubscribing user Arnold from games*");
        games.unsubscribe(arnold);
        games.sendEmail();
    }
}