/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake_game;

/**
 *
 * @author pc
 */


import javax.swing.text.Position;
import java.util.HashSet;
import java.util.Set;


public class Obstacle {

    
     private final Set<Position> body;

    public Obstacle() {
        body = new HashSet<>();
    }

    public void addLine(Position start, Position end) {
        int startX;
         startX = start.getX();
        int endX = end.getX();
        int distX = endX - startX;

        int startY = start.getY();
        int endY = end.getY();
        int distY = endY - startY;

        int steps = Math.max(Math.abs(distX), Math.abs(distY));
        float stepX = (float) distX / (float) steps;
        float stepY = (float) distY / (float) steps;

        double x = startX;
        double y = startY;

        for (int i = 0; i <= steps; i++) {
            Position position = new Position((int) Math.round(x), (int) Math.round(y));
            body.add(position);

            x += stepX;
            y += stepY;
        }
    }

    public void addLineMirrorH(Position start, Position end, int maxX) {
        int startX = start.getX();
        int endX = end.getX();
        int distX = endX - startX;

        int startY = start.getY();
        int endY = end.getY();
        int distY = endY - startY;

        int steps = Math.max(Math.abs(distX), Math.abs(distY));
        float stepX = (float) distX / (float) steps;
        float stepY = (float) distY / (float) steps;

        double x = startX;
        double y = startY;

        for (int i = 0; i <= steps; i++) {
            int screenX = (int) Math.round(x);
            int screenY = (int) Math.round(y);
            body.add((Position) () -> {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            });

            x += stepX;
            y += stepY;
        }
    }

    public boolean contains(Position position) {
        return body.contains(position);
    }

    public Set<Position> getBody() {
        return body;
    }
    
}
