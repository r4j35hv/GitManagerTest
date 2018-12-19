package r4j35h.gitmanagmenttestrajesh;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import r4j35h.gitmanagmenttestrajesh.Objects.UserObject;
import r4j35h.gitmanagmenttestrajesh.Objects.UserRepoObject;

public class UserListRecyclerAdapter extends RecyclerView.Adapter<UserListRecyclerAdapter.UserViewHolder> {
    ArrayList<UserObject> list1 = new ArrayList<>();
    ArrayList<UserRepoObject> list2 = new ArrayList<>();
    Context mContext;

    public UserListRecyclerAdapter(ArrayList<UserObject> list, Context mContext) {
        this.list1 = list;
        this.mContext = mContext;
    }

    public UserListRecyclerAdapter(ArrayList<UserRepoObject> list, Context mContext, int i) {
        this.list2 = list;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.user_list_item, viewGroup, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder viewHolder, int i) {
        if (mContext instanceof MainActivity) {
            Picasso.get()
                    .load(list1.get(i)
                            .getOwner()
                            .getAvatarUrl()).into(viewHolder.ivUserImage);
            viewHolder.tvUserName.setText(list1.get(i).getName());
            viewHolder.tvUserDescription.setText(list1.get(i).getFullName());
        } else {
            Picasso.get()
                    .load(list2.get(i)
                            .getOwner()
                            .getAvatarUrl()).into(viewHolder.ivUserImage);
            viewHolder.tvUserName.setText(list2.get(i).getName());
            viewHolder.tvUserDescription.setText(list2.get(i).getFullName());
        }
    }

    @Override
    public int getItemCount() {
        return mContext instanceof MainActivity ? (list1.size() < 20 ? list1.size() : 20) : list2.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {
        ImageView ivUserImage;
        TextView tvUserName, tvUserDescription;

        public UserViewHolder(@NonNull final View itemView) {
            super(itemView);
            ivUserImage = itemView.findViewById(R.id.ivUserImage);
            tvUserName = itemView.findViewById(R.id.tvUserName);
            tvUserDescription = itemView.findViewById(R.id.tvUserDescription);
            if (mContext instanceof MainActivity)
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mContext.startActivity(
                                new Intent(mContext, RepoDetailsActivity.class)
                                        .putExtra("repoId", list1.get(getAdapterPosition()).getId())
                                        .putExtra("userId", list1.get(getAdapterPosition()).getOwner().getId())
                                        .putExtra("userName", list1.get(getAdapterPosition()).getOwner().getLogin())
                                        .putExtra("repoNameFull", list1.get(getAdapterPosition()).getFullName())
                                        .putExtra("repoName", list1.get(getAdapterPosition()).getName())
                                        .putExtra("userAvatar", list1.get(getAdapterPosition()).getOwner().getAvatarUrl())
                                        .putExtra("repoDescription", list1.get(getAdapterPosition()).getDescription())
                                        .putExtra("contributorsUrl", list1.get(getAdapterPosition()).getContributorsUrl())
                        );
                    }
                });
        }
    }

    void updateData1(ArrayList<UserObject> list) {
        this.list1 = list;
        notifyDataSetChanged();
    }

    void updateData2(ArrayList<UserRepoObject> list) {
        this.list2 = list;
        notifyDataSetChanged();
    }
}
