package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.mygdx.game.Objects.Gatito;

public class Move {

   private float ms;
   private String name;
   private boolean loop = true;

    public float getMs() {
        return ms;
    }

    public String getName() {
        return name;
    }

    public Move(String name, float ms) {
        this.ms = ms;
        this.name = name;
    }

    public Animation.PlayMode loopMode() {
        if (loop) return Animation.PlayMode.LOOP;
        else return Animation.PlayMode.LOOP;
        //Playmode.Normal???????¿¿¿ no hace bucle or algo del stateTime ya lo harè
    }


    public void kick(Gatito gatito){
        gatito.getMove().name = "kick";
        gatito.getMove().ms = 0.02f;
        loop = false;
        gatito.addAction(Actions.moveBy(15, 5, 2));
        //depende de si está flipped, TODO
//        gatito.addAction(Actions.moveBy(-30, -30, 2));
    }

    public void punch(Gatito gatito){
        gatito.getMove().name = "punching";
        gatito.getMove().ms = 0.008f;
        loop = true;
        gatito.addAction(Actions.moveBy(-50, 0, 5));
        //depende de si está flipped, TODO
    }
}