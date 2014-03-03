package ch10.inheritance2;

public abstract class Vehicle {
  
  private double _maxSpeed;
  protected double _currentSpeed;
  
  public Vehicle(double maxSpeed) {
    _maxSpeed = maxSpeed;
  }
  
  abstract void accelerate();

  public double getMaxSpeed() {
    return _maxSpeed;
  }

  public double getCurrentSpeed() {
    return _currentSpeed;
  }
  
  public void pedalToTheMetal(){
    while (_currentSpeed <= _maxSpeed) {
      accelerate();
    }
  }
}
