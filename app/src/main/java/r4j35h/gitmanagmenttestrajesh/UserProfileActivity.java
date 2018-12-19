package r4j35h.gitmanagmenttestrajesh;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import r4j35h.gitmanagmenttestrajesh.Objects.UserRepoObject;
import r4j35h.gitmanagmenttestrajesh.Presenter.UserProfilePresenter;
import r4j35h.gitmanagmenttestrajesh.View.UserProfileView;

public class UserProfileActivity extends AppCompatActivity implements UserProfileView {
    UserProfilePresenter userProfilePresenter;
    ImageView tvUserImage;
    TextView tvUserName;
    RecyclerView userListRecycler;
    UserListRecyclerAdapter userListRecyclerAdapter;
    ArrayList<UserRepoObject> list = new ArrayList<>();
    ProgressDialog progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        userProfilePresenter = new UserProfilePresenter(this, this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Picasso.get().load(extras.getString("userAvatar")).into(tvUserImage);
            tvUserName.setText(extras.getString("userName"));
        }
        userProfilePresenter.getData(extras.getString("userName"));

    }

    @Override
    public void loadData(ArrayList<UserRepoObject> list) {
        userListRecyclerAdapter.updateData2(list);
        this.list = list;
        progressBar.dismiss();

    }

    @Override
    public void init() {
        tvUserImage = findViewById(R.id.tvUserImage);
        tvUserName = findViewById(R.id.tvUserName);
        progressBar=new ProgressDialog(this);
        progressBar.setMessage("Loading...");
        userListRecycler = findViewById(R.id.userListRecycler);
        userListRecyclerAdapter = new UserListRecyclerAdapter(list, this, 0);
        userListRecycler.setLayoutManager(new LinearLayoutManager(this));
        userListRecycler.setAdapter(userListRecyclerAdapter);
        progressBar.show();

    }
}
