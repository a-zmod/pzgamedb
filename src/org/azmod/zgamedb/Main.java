package org.azmod.zgamedb;

import com.avrix.events.EventManager;
import com.avrix.plugin.Metadata;
import com.avrix.plugin.Plugin;
import com.avrix.plugin.ServiceManager;
import org.azmod.zgamedb.util.GameDB;
import org.azmod.zgamedb.util.GameDBUtil;

public class Main extends Plugin {
    /**
     * Constructs a new {@link Plugin} with the specified metadata.
     * Metadata is transferred when the plugin is loaded into the game context.
     *
     * @param metadata The {@link Metadata} associated with this plugin.
     */
    public Main(Metadata metadata) {
        super(metadata);
    }

    public GameDBUtil gameDBUtil;

    /**
     * Called when the plugin is initialized.
     * <p>
     * Implementing classes should override this method to provide the initialization logic.
     */
    @Override
    public void onInitialize() {
        ServiceManager.register(GameDB.class, new GameDBUtil());
        gameDBUtil = new GameDBUtil();

        loadDefaultConfig();

        EventManager.addListener(new OnServerInitHandler(this));
    }
}