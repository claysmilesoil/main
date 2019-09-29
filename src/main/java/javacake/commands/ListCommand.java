package javacake.commands;

import javacake.*;
import javacake.tasks.Task;
import javacake.topics.MainList;

public class ListCommand extends Command {
    public ListCommand() {
        type = CmdType.LIST;
    }

    /**
     * Execute the listing of current tasks on the Ui.
     * @param tasks TaskList containing current tasks
     * @param ui the Ui responsible for outputting messages
     * @param storage Storage needed to write the updated data
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage, Profile profile) throws DukeException {
        MainList ml = new MainList();
        ml.printList();
    }
}
