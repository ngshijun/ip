package duke.command;

import duke.DukeException;
import duke.Storage;
import duke.TaskList;
import duke.Ui;

public abstract class Command {
    public static boolean isExit = false;
    public abstract void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException;
}
