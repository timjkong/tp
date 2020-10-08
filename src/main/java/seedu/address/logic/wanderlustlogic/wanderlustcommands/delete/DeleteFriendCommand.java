package seedu.address.logic.wanderlustlogic.wanderlustcommands.delete;

import static java.util.Objects.requireNonNull;

import java.util.List;

import seedu.address.commons.core.Messages;
import seedu.address.commons.core.index.Index;
import seedu.address.logic.wanderlustlogic.wanderlustcommands.CommandResult;
import seedu.address.logic.wanderlustlogic.wanderlustcommands.exceptions.CommandException;
import seedu.address.model.commons.TravelPlanObject;
import seedu.address.model.travelplanner.Model;

public class DeleteFriendCommand extends DeleteCommand {
    public static final String COMMAND_WORD = "friend";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Deletes the friend identified by the index number used in the displayed travel plan list.\n"
            + "Parameters: INDEX (must be a positive integer)\n"
            + "Example: " + COMMAND_WORD + " 1";

    public static final String MESSAGE_DELETE_FRIEND_SUCCESS = "Deleted Friend: %1$s";

    private final Index targetIndex;

    /**
     * Constructor for delete friend command.
     * @param targetIndex index to be deleted.
     */
    public DeleteFriendCommand(Index targetIndex) {
        super(targetIndex);
        this.targetIndex = targetIndex;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<? extends TravelPlanObject> lastShownList = model.getFilteredTravelPlanObjectList();

        if (targetIndex.getZeroBased() >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_FRIEND_DISPLAYED_INDEX);
        }

        TravelPlanObject friendToDelete = lastShownList.get(targetIndex.getZeroBased());

        model.deleteTravelPlanObject(friendToDelete);
        return new CommandResult(String.format(MESSAGE_DELETE_FRIEND_SUCCESS, friendToDelete));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof DeleteFriendCommand // instanceof handles nulls
                && targetIndex.equals(((DeleteFriendCommand) other).targetIndex)); // state check
    }
}