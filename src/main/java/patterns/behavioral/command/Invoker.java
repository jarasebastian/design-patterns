package patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sebastianjara on 03-03-21
 * @project design-patterns
 */
public class Invoker {

    private List<IOperation> operations = new ArrayList<>();

    public void receiveOperation(IOperation operation){
        this.operations.add(operation);
    }

    public void doOperation(){
        this.operations.forEach(x -> x.execute());
        this.operations.clear();
    }

}
