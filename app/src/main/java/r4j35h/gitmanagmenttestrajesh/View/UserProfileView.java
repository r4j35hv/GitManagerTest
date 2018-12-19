package r4j35h.gitmanagmenttestrajesh.View;

import java.util.ArrayList;

import r4j35h.gitmanagmenttestrajesh.Objects.ConributorObject;
import r4j35h.gitmanagmenttestrajesh.Objects.UserRepoObject;

public interface UserProfileView {
    void loadData(ArrayList<UserRepoObject> list);
    void init();
}
