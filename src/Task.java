/*
Task:
    - Class for making task instance variables.
    -

Vars:
    - id: the task's unique ID
    - name: User-given task name
    - description: User-given task description
    - time: Length of task
**/
public class Task {
  private int id;
  private String name;
  private String description;
  private double time;
  private double startTime;
  private double endTime;

  public void setName(String name){
    this.name = name;
  }

  public void setDescription(String description){
    this.description = description;
  }

  public void setTime(int time){
    this.time = time;
  }

  public void setStartTime(int start){
    this.startTime = start;
  }

  public void setEndTime(){
    this.endTime = this.startTime + this.endTime;
  }

  public int getId(){
    return this.id;
  }

  public String getName(){
    return this.name;
  }

  public String getDescription(){
    return this.description;
  }

  public double getTime(){
    return this.time;
  }

  public double getStartTime(){
    return this.startTime;
  }

  public double getEndTime(){
    return this.endTime;
  }

}
