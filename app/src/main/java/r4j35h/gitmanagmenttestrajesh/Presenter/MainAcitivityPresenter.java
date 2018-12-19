package r4j35h.gitmanagmenttestrajesh.Presenter;

import android.app.Activity;
import android.widget.Toast;

import java.util.ArrayList;

import r4j35h.gitmanagmenttestrajesh.Network.ApiClient;
import r4j35h.gitmanagmenttestrajesh.Network.ApiInterface;
import r4j35h.gitmanagmenttestrajesh.Objects.UserObject;
import r4j35h.gitmanagmenttestrajesh.View.MainAcivityView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainAcitivityPresenter {

    ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
    MainAcivityView mainAcivityView;
    Activity mActivity;

    public MainAcitivityPresenter(MainAcivityView mainAcivityView, Activity mActivity) {
        this.mainAcivityView = mainAcivityView;
        this.mActivity = mActivity;
        this.mainAcivityView.init();
    }


    public void getData() {
        Call<ArrayList<UserObject>> call = apiInterface.getUsers();
        call.enqueue(new Callback<ArrayList<UserObject>>() {
            @Override
            public void onResponse(Call<ArrayList<UserObject>> call, Response<ArrayList<UserObject>> response) {
                if (response.isSuccessful()) {
                    mainAcivityView.loadData(response.body());
                }else {
                    Toast.makeText(mActivity, "Some Error!!!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ArrayList<UserObject>> call, Throwable t) {
                Toast.makeText(mActivity, "Network Error!!!", Toast.LENGTH_SHORT).show();

            }
        });
    }


}
