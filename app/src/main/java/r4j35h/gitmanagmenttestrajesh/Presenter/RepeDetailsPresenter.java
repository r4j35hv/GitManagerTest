package r4j35h.gitmanagmenttestrajesh.Presenter;

import android.app.Activity;
import android.widget.Toast;

import java.util.ArrayList;

import r4j35h.gitmanagmenttestrajesh.Network.ApiClient;
import r4j35h.gitmanagmenttestrajesh.Network.ApiInterface;
import r4j35h.gitmanagmenttestrajesh.Objects.ConributorObject;
import r4j35h.gitmanagmenttestrajesh.Objects.UserObject;
import r4j35h.gitmanagmenttestrajesh.View.RepoDetailsView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepeDetailsPresenter {

    ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
    RepoDetailsView RepoDetailsView;
    Activity mActivity;

    public RepeDetailsPresenter(RepoDetailsView RepoDetailsView, Activity mActivity) {
        this.RepoDetailsView = RepoDetailsView;
        this.mActivity = mActivity;
        this.RepoDetailsView.init();

    }


    public void getData(String repoName,String userName) {
        Call<ArrayList<ConributorObject>> call = apiInterface.getConributors(repoName,userName);
        call.enqueue(new Callback<ArrayList<ConributorObject>>() {
            @Override
            public void onResponse(Call<ArrayList<ConributorObject>> call, Response<ArrayList<ConributorObject>> response) {
                if (response.isSuccessful()) {
                    RepoDetailsView.loadData(response.body());
                } else {
                    Toast.makeText(mActivity, "Some Error!!!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ArrayList<ConributorObject>> call, Throwable t) {
                Toast.makeText(mActivity, "Network Error!!!", Toast.LENGTH_SHORT).show();

            }
        });
    }


}
