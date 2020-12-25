package kz.duman;

import org.telegram.telegrambots.ApiContextInitializer;

public class App {


    public static void main(String[] args) {
        ApiContextInitializer.init();
        Bot test_habr_bot = new Bot("mydumanbot", "1416972439:AAEV1AjHe_Z4zaA7hnOOpWUe1QQY7fXDVmA");
        test_habr_bot.botConnect();
    }
}
