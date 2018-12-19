package r4j35h.gitmanagmenttestrajesh.Presenter;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import r4j35h.gitmanagmenttestrajesh.Network.ApiClient;
import r4j35h.gitmanagmenttestrajesh.Network.ApiInterface;
import r4j35h.gitmanagmenttestrajesh.Objects.ConributorObject;
import r4j35h.gitmanagmenttestrajesh.Objects.UserRepoObject;
import r4j35h.gitmanagmenttestrajesh.View.UserProfileView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserProfilePresenter {

    ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
    UserProfileView UserProfileView;
    Activity mActivity;

    public UserProfilePresenter(UserProfileView UserProfileView, Activity mActivity) {
        this.UserProfileView = UserProfileView;
        this.mActivity = mActivity;
        this.UserProfileView.init();
    }


    public void getData(String userName) {
        Call<ArrayList<UserRepoObject>> call = apiInterface.getUserRepoList(userName);
        Log.e("URL",call.request().url().toString());
        call.enqueue(new Callback<ArrayList<UserRepoObject>>() {
            @Override
            public void onResponse(Call<ArrayList<UserRepoObject>> call, Response<ArrayList<UserRepoObject>> response) {
                if (response.isSuccessful()) {
                    UserProfileView.loadData(response.body());
                } else {
                    Toast.makeText(mActivity, "Some Error!!!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ArrayList<UserRepoObject>> call, Throwable t) {
                Toast.makeText(mActivity, "Network Error!!!", Toast.LENGTH_SHORT).show();

            }
        });
    }


}
