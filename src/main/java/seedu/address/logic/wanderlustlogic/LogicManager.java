package seedu.address.logic.wanderlustlogic;

//import java.io.IOException;
import java.nio.file.Path;
import java.util.logging.Logger;

import javafx.collections.ObservableList;
import seedu.address.commons.core.GuiSettings;
import seedu.address.commons.core.LogsCenter;
import seedu.address.logic.wanderlustlogic.wanderlustcommands.Command;
import seedu.address.logic.wanderlustlogic.wanderlustcommands.CommandResult;
import seedu.address.logic.wanderlustlogic.wanderlustcommands.exceptions.CommandException;
import seedu.address.logic.wanderlustlogic.wanderlustparser.WanderlustParser;
import seedu.address.logic.wanderlustlogic.wanderlustparser.exceptions.ParseException;
import seedu.address.model.travelplan.TravelPlan;
import seedu.address.model.travelplanner.Model;
import seedu.address.model.travelplanner.ReadOnlyTravelPlanner;
import seedu.address.storage.Storage;

/**
 * The main LogicManager of the app.
 */
public class LogicManager implements Logic {
    public static final String FILE_OPS_ERROR_MESSAGE = "Could not save data to file: ";
    private final Logger logger = LogsCenter.getLogger(seedu.address.logic.LogicManager.class);

    private final Model model;
    private final Storage storage;
    private final WanderlustParser wanderlustParser;

    /**
     * Constructs a {@code LogicManager} with the given {@code Model} and {@code Storage}.
     */
    public LogicManager(Model model, Storage storage) {
        this.model = model;
        this.storage = storage;
        wanderlustParser = new WanderlustParser();
    }

    @Override
    public CommandResult execute(String commandText) throws CommandException, ParseException {
        logger.info("----------------[USER COMMAND][" + commandText + "]");

        CommandResult commandResult;
        Command command = wanderlustParser.parseCommand(commandText);
        commandResult = command.execute(model);

        //        try {
        //            storage.saveAddressBook(model.getTravelPlanner());
        //        } catch (IOException ioe) {
        //            throw new CommandException(FILE_OPS_ERROR_MESSAGE + ioe, ioe);
        //        }

        return commandResult;
    }

    @Override
    public ReadOnlyTravelPlanner getTravelPlanner() {
        return model.getTravelPlanner();
    }

    @Override
    public ObservableList<TravelPlan> getFilteredTravelPlan() {
        return model.getFilteredTravelPlanList();
    }

    @Override
    public Path getTravelPlannerFilePath() {
        return model.getTravelPlannerFilePath();
    }

    @Override
    public GuiSettings getGuiSettings() {
        return model.getGuiSettings();
    }

    @Override
    public void setGuiSettings(GuiSettings guiSettings) {
        model.setGuiSettings(guiSettings);
    }
}