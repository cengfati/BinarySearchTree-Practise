package model;

public class Worker implements ComparableContent<Worker>{
    private String name;
    private Queue<Task> allTasks;

    public Worker(String name){
        this.name = name;
        allTasks = new Queue<>();
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean isGreater(Worker pContent) {
        if(this.getName().compareTo(pContent.getName()) > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean isEqual(Worker pContent) {
        if(this.getName().compareTo(pContent.getName()) == 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean isLess(Worker pContent) {
        if(this.getName().compareTo(pContent.getName()) < 0){
            return true;
        }
        return false;
    }

    public void addTask(int id){
        allTasks.enqueue(new Task(id));
    }

    public Task completeTask(){
        Task t = allTasks.front();
        allTasks.dequeue();
        return t;
    }
}
