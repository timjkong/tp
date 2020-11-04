package seedu.address.logic.command.copy;

import static java.util.Objects.requireNonNull;

import java.util.List;

import seedu.address.commons.core.Messages;
import seedu.address.commons.core.index.Index;
import seedu.address.logic.command.Command;
import seedu.address.logic.command.CommandResult;
import seedu.address.logic.command.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.activity.Activity;
import seedu.address.model.travelplan.TravelPlan;


public class CopyCommand extends Command {
    public static final String COMMAND_WORD = "copy";

    public static final String MESSAGE_USAGE =
            "copy: Copies the activity identified by the index number used in the wish list to the travel plan "
                    + "identified by the index number used in the travel planner.\n"
                    + "Parameters: INDEX (must be a positive integer)\n";

    public static final String MESSAGE_COPY_ACTIVITY_SUCCESS = "Copied activity %1$s to travel plan %2$s";
    public static final String MESSAGE_NOT_WISHLIST = "Please goto wish list before copying activities";

    private final Index activityIndex;
    private final Index travelPlanIndex;

    /**
     * Constructor for MoveCommand.
     *
     * @param activityIndex index of activity to be copied.
     * @param travelPlanIndex index of travel plan to add activity to.
     */
    public CopyCommand(Index targetIndex, Index travelPlanIndex) {
        this.activityIndex = targetIndex;
        this.travelPlanIndex = travelPlanIndex;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        boolean isTravelPlan = model.isDirectoryTypeTravelPlan();
        if (!isTravelPlan) {
            List<Activity> filteredActivityList = model.getFilteredActivityList();
            List<TravelPlan> travelPlanList = model.getFilteredTravelPlanList();

            if (activityIndex.getZeroBased() >= filteredActivityList.size()) {
                throw new CommandException(Messages.MESSAGE_INVALID_ACTIVITY_DISPLAYED_INDEX);
            }
            if (travelPlanIndex.getZeroBased() >= travelPlanList.size()) {
                throw new CommandException(Messages.MESSAGE_INVALID_TRAVELPLAN_DISPLAYED_INDEX);
            }

            Activity activityToCopy = filteredActivityList.get(activityIndex.getZeroBased());
            TravelPlan travelPlan = travelPlanList.get(travelPlanIndex.getZeroBased());

            model.copyActivity(activityToCopy, travelPlanIndex);
            assert travelPlan.getActivityList().hasActivity(activityToCopy) : "Activity was not copied";

            return new CommandResult(String.format(MESSAGE_COPY_ACTIVITY_SUCCESS,
                    activityIndex.getOneBased(), travelPlanIndex.getOneBased()));
        } else {
            throw new CommandException(MESSAGE_NOT_WISHLIST);
        }
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof CopyCommand // instanceof handles nulls
                && activityIndex.equals(((CopyCommand) other).activityIndex)
                && travelPlanIndex.equals(((CopyCommand) other).travelPlanIndex)); // state check
    }
}
