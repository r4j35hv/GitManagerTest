package r4j35h.gitmanagmenttestrajesh.Network;

import java.util.ArrayList;

import r4j35h.gitmanagmenttestrajesh.Objects.ConributorObject;
import r4j35h.gitmanagmenttestrajesh.Objects.UserObject;
import r4j35h.gitmanagmenttestrajesh.Objects.UserRepoObject;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("/repositories")
    Call<ArrayList<UserObject>> getUsers();

    @GET("/repos/{user_name}/{repo_name}/contributors")
    Call<ArrayList<ConributorObject>> getConributors(@Path("repo_name") String repoName,@Path("user_name") String userName);

    @GET("/users/{user_name}/repos")
    Call<ArrayList<UserRepoObject>> getUserRepoList(@Path("user_name") String userName);
}
