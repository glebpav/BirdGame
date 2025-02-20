package ru.samsung.gamestudio;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import ru.samsung.gamestudio.screens.GameScreen;
import ru.samsung.gamestudio.screens.MenuScreen;
import ru.samsung.gamestudio.screens.RestartScreen;

public class Main extends Game {

    public GameScreen gameScreen;
    public MenuScreen menuScreen;
    public RestartScreen restartScreen;

    public SpriteBatch batch;
    public OrthographicCamera camera;

    @Override
    public void create() {
        batch = new SpriteBatch();
        camera = new OrthographicCamera();
        camera.setToOrtho(false, GamesSettings.SCREEN_WIGHT, GamesSettings.SCREEN_HEIGHT);

        gameScreen = new GameScreen(this);
        menuScreen = new MenuScreen();
        restartScreen = new RestartScreen(this);

        setScreen(gameScreen);
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
