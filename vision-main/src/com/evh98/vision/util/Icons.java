/**
 * Vision
 *
 * Created and owned by James T Saeed (EddieVanHalen98)
 */

package com.evh98.vision.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Icons {
	
	public static Sprite APPS;
	public static Sprite COLLECTIONS;
	public static Sprite GAMES;
	public static Sprite INFO;
	public static Sprite MOVIES;
	public static Sprite MOVIES_ALT;
	public static Sprite MUSIC;
	public static Sprite SEARCH;
	public static Sprite SETTINGS;
	public static Sprite SPOTIFY;
	public static Sprite TV_GUIDE;
	public static Sprite YOUTUBE;
	
	public static void loadAll() {
    	Icons.APPS = Graphics.createSprite(Gdx.files.internal("icons/apps.png"));
    	Icons.COLLECTIONS = Graphics.createSprite(Gdx.files.internal("icons/collections.png"));
    	Icons.GAMES = Graphics.createSprite(Gdx.files.internal("icons/games.png"));
    	Icons.INFO = Graphics.createSprite(Gdx.files.internal("icons/info.png"));
    	Icons.MOVIES = Graphics.createSprite(Gdx.files.internal("icons/movies.png"));
    	Icons.MOVIES_ALT = Graphics.createSprite(Gdx.files.internal("icons/movies_alt.png"));
    	Icons.MUSIC = Graphics.createSprite(Gdx.files.internal("icons/music.png"));
    	Icons.SEARCH = Graphics.createSprite(Gdx.files.internal("icons/search.png"));
    	Icons.SETTINGS = Graphics.createSprite(Gdx.files.internal("icons/settings.png"));
    	Icons.SPOTIFY = Graphics.createSprite(Gdx.files.internal("icons/spotify.png"));
    	Icons.TV_GUIDE = Graphics.createSprite(Gdx.files.internal("icons/tv_guide.png"));
    	Icons.YOUTUBE = Graphics.createSprite(Gdx.files.internal("icons/youtube.png"));
	}
}