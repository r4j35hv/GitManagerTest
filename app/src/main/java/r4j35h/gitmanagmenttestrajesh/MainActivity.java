package r4j35h.gitmanagmenttestrajesh;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import java.util.ArrayList;

import r4j35h.gitmanagmenttestrajesh.Objects.UserObject;
import r4j35h.gitmanagmenttestrajesh.Presenter.MainAcitivityPresenter;
import r4j35h.gitmanagmenttestrajesh.View.MainAcivityView;

public class MainActivity extends AppCompatActivity implements MainAcivityView {
MainAcitivityPresenter mainAcitivityPresenter;
ArrayList<UserObject> userList=new ArrayList<>();
RecyclerView rvUserListRecycler;
UserListRecyclerAdapter userListRecyclerAdapter;
ProgressDialog progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainAcitivityPresenter=new MainAcitivityPresenter(this,this);
        mainAcitivityPresenter.getData();
    }

    @Override
    public void loadData(ArrayList<UserObject> list) {
        userListRecyclerAdapter.updateData1(list);
        userList=list;
        progressBar.dismiss();
    }

    @Override
    public void init() {
        rvUserListRecycler=findViewById(R.id.rvUserListRecycler);
        progressBar=new ProgressDialog(this);
        progressBar.setMessage("Loading...");
        userListRecyclerAdapter=new UserListRecyclerAdapter(userList,this);
        rvUserListRecycler.setLayoutManager(new LinearLayoutManager(this));
        rvUserListRecycler.setAdapter(userListRecyclerAdapter);
        progressBar.show();
    }
}
