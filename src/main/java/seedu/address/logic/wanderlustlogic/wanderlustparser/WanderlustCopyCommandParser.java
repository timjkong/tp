package seedu.address.logic.wanderlustlogic.wanderlustparser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.wanderlustlogic.wanderlustcommands.copy.CopyCommand;
import seedu.address.logic.wanderlustlogic.wanderlustparser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new CopyCommand object
 */
public class WanderlustCopyCommandParser implements WanderlustParserInterface<CopyCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the CopyCommand
     * and returns a CopyCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public CopyCommand parse(String args) throws ParseException {
        try {
            String[] keywords = args.split(" ");
            Index activityIndex = ParserUtil.parseIndex(keywords[1]);
            Index travelPlanIndex = ParserUtil.parseIndex(keywords[2]);

            return new CopyCommand(activityIndex, travelPlanIndex);
        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, CopyCommand.MESSAGE_USAGE), pe);
        }
    }

}
