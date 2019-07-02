import java.util.ArrayList;
import java.util.HashMap;

/**
  Data structure for tasks.

  Allows tasks to be added, removed, searched, and swapped.
  Prioritizes linear time complexity.

  Vars:
    - taskList: primary list containing Task objects.
    - indexMap: HashMap used for storing a Task's index.
      k: id
      v: index
*/
public class TaskList{
  private ArrayList<Task> taskList = new ArrayList<>();
  private HashMap<Integer, Integer> indexMap = new HashMap<>();

  /**
    Adds Task t to taskList.

    Return true if operation is successful.
    Otherwise, return false.
  */
  public boolean addTask(Task t){
    if(!indexMap.containsKey(t.getId())){
      taskList.add(t);
      indexMap.put(t.getId(), taskList.size() - 1);
      return true;
    }

    return false;
  }

  /**
    Remove Task t from taskList if it is in the TaskList.
    Tasks must be removed in specific order, so swap trick
    (swapping target obj and last obj, for O(1) removal) can't
    be done here.

    Return true if operation is successful.
    Otherwise, return false.
  */
  public boolean removeTask(Task t){
    int id = t.getId();

    if(indexMap.containsKey(id)){
      taskList.remove(indexMap.get(id));
      indexMap.remove(id);
      return true;
    }
    return false;
  }

  /**
    Swaps the location of tasks.
    Swaps indexes in indexMap, then positions in the taskList.

    Return true if operation is successful.
    Otherwise, return false.
  */
  public boolean swapTasks(Task t1, Task t2){
    int id1 = t1.getId();
    int id2 = t2.getId();

    if(indexMap.containsKey(id1) && indexMap.containsKey(id2)){
      int index1 = indexMap.get(id1);

      indexMap.put(id1, indexMap.get(id2));
      indexMap.put(id2, index1);

      taskList.set(indexMap.get(id1), t1);
      taskList.set(indexMap.get(id2), t2);

      return true;
    }

    return false;
  }

  /**
    Search taskList for Task t.
    
    Return the index of the target task.
  */
  public int findTask(Task t){
    return indexMap.get(t.getId());
  }

  public ArrayList<Task> getTaskList(){
    return this.taskList;
  }
}
