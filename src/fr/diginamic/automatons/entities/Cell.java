package fr.diginamic.automatons.entities;

import fr.diginamic.automatons.utils.CellStateEnum;

public class Cell {
  private CellStateEnum state;
  private CellStateEnum nextState;
  private int i;
  private int j;

  public Cell(CellStateEnum state, int i, int j) {
    this.state = state;
    this.i = i;
    this.j = j;
  }

  public CellStateEnum getState() {
    return state;
  }

  public CellStateEnum getNewState() {
    state = nextState;
    return state;
  }

  public int[] getPosition() {
    return new int[] { i, j };
  }

  public void setNextState(CellStateEnum nextState) {
    this.nextState = nextState;
  }

  @Override
  public String toString() {
    return state == CellStateEnum.ALIVE ? " + " : "   ";
  }
}
