package r4j35h.gitmanagmenttestrajesh.View;

import java.util.ArrayList;

import r4j35h.gitmanagmenttestrajesh.Objects.ConributorObject;
import r4j35h.gitmanagmenttestrajesh.Objects.UserObject;

public interface RepoDetailsView {
    void loadData(ArrayList<ConributorObject> list);
    void init();
}
