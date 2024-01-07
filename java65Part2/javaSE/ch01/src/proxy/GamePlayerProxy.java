package proxy;

/**
 * 游戏玩家的代理类;
 * 静态代理要求代理类必须和被代理者实现相同的接口
 */
public class GamePlayerProxy implements IGame{
    // 被代理者的对象
    private IGame iGame;

    public GamePlayerProxy(IGame iGame) {
        this.iGame = iGame;
    }

    @Override
    public void login(String userName, String password) {
        System.out.println("---代理登录,开始计费---");
        // 被代理者执行方法前，代理可以方法参数进行逻辑处理
        this.iGame.login(userName, password);
    }

    @Override
    public void killBoss() {
        System.out.println("---代理开始打怪....---");
        this.iGame.killBoss();
    }

    @Override
    public void upgrade() {
        this.iGame.upgrade();
        System.out.println("---升级完成，通知用户代练完成---");
    }
}
