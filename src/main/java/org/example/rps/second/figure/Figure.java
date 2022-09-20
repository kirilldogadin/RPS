package org.example.rps.second.figure;



/**
 * Players step's figure
 */
//сделать Сomparable?
public interface Figure {

    /**
     * сама фигура умеет высчитывать против другой выиграла она или проиграла, например
     * камень бьет ножницы,
     * @param figure
     * @return
     */
    Result fight(Figure figure);

    enum Result {
        WIN,
        LOSS,
        DRAW
    }
}
