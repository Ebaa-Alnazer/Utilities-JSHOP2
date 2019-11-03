package utilities.jshop2;

import java.util.LinkedList;

public interface AlgorithmInterface {

    void initialize(Domain domainIn, State stateIn);

    Domain getDomain();

    State getState();

    LinkedList findPlans(TaskList tasksIn, int planNoIn);

    String getName();

}
