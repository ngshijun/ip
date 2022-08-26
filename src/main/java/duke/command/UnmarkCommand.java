package duke.command;

import duke.DukeException;
import duke.Storage;
import duke.task.Task;
import duke.TaskList;
import duke.Ui;

public class UnmarkCommand extends Command {
    private Task task;

    private int idx;

    public UnmarkCommand(int idx) {
        this.idx = idx;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        try {
            task = tasks.get(idx);
            task.markAsNotDone();
            ui.UnmarkTask(task);
            storage.update(tasks.getTasks());
        } catch (IndexOutOfBoundsException e) {
            throw new DukeException("Invalid index.");
        }
    }
}
