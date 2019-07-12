package com.newone.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MyGdxGame extends ApplicationAdapter {
	Texture img;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
	private Sprite sprite;

	@Override
	public void create () {

		// This is the test for master commit
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		texture = new Texture("badlogic.jpg");
		texture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		TextureRegion region = new TextureRegion(texture, 0, 0, 512, 275);
		sprite = new Sprite(region);
		sprite.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(-sprite.getWidth()/2, -sprite.getHeight()/2);
		//call of duty
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		texture.dispose();
	}


	@Override
	public void test () {
		System.out.println("Ajeel");
	}
}
