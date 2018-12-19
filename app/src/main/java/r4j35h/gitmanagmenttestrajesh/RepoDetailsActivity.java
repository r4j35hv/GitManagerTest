package r4j35h.gitmanagmenttestrajesh;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import r4j35h.gitmanagmenttestrajesh.Objects.ConributorObject;
import r4j35h.gitmanagmenttestrajesh.Objects.UserObject;
import r4j35h.gitmanagmenttestrajesh.Presenter.RepeDetailsPresenter;
import r4j35h.gitmanagmenttestrajesh.View.RepoDetailsView;

public class RepoDetailsActivity extends AppCompatActivity implements RepoDetailsView {
    RepeDetailsPresenter repeDetailsPresenter;
    ImageView ivUserImage;
    TextView tvUserName, tvUserDescription, tvDescription;
    RecyclerView rvContributorList;
    UserGridRecyclerAdapter userGridRecyclerAdapter;
    ArrayList<ConributorObject> list=new ArrayList<>();
    ProgressDialog progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repo_details);
        repeDetailsPresenter = new RepeDetailsPresenter(this, this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Picasso.get().load(extras.getString("userAvatar")).into(ivUserImage);
            tvUserName.setText(extras.getString("repoName"));
            tvUserDescription.setText(extras.getString("repoNameFull"));
            tvDescription.setText(extras.getString("repoDescription"));
            repeDetailsPresenter.getData(extras.getString("repoName"),extras.getString("userName"));
        }
    }

    @Override
    public void loadData(ArrayList<ConributorObject> list) {
        userGridRecyclerAdapter.updateData(list);
        this.list=list;
        progressBar.dismiss();

    }

    @Override
    public void init() {
        progressBar=new ProgressDialog(this);
        progressBar.setMessage("Loading...");
        ivUserImage = findViewById(R.id.ivUserImage);
        tvUserName = findViewById(R.id.tvUserName);
        tvUserDescription = findViewById(R.id.tvUserDescription);
        tvDescription = findViewById(R.id.tvDescription);
        rvContributorList = findViewById(R.id.rvContributorList);
        rvContributorList.setLayoutManager(new GridLayoutManager(this,3));
        userGridRecyclerAdapter=new UserGridRecyclerAdapter(this,list);
        rvContributorList.setAdapter(userGridRecyclerAdapter);
        progressBar.show();

    }



}
