package r4j35h.gitmanagmenttestrajesh;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import r4j35h.gitmanagmenttestrajesh.Objects.ConributorObject;

public class UserGridRecyclerAdapter extends RecyclerView.Adapter<UserGridRecyclerAdapter.ContributorViewHolder> {
    Context mContext;
    ArrayList<ConributorObject> list = new ArrayList<>();

    public UserGridRecyclerAdapter(Context mContext, ArrayList<ConributorObject> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @NonNull
    @Override
    public ContributorViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        View
        return new ContributorViewHolder(LayoutInflater.from(mContext).inflate(R.layout.contributor_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContributorViewHolder viewHolder, int i) {
        Picasso.get().load(list.get(i).getAvatarUrl()).into(viewHolder.tvUserImage);
        viewHolder.tvUserName.setText(list.get(i).getLogin());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ContributorViewHolder extends RecyclerView.ViewHolder {
        ImageView tvUserImage;
        TextView tvUserName;

        public ContributorViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUserImage = itemView.findViewById(R.id.tvUserImage);
            tvUserName = itemView.findViewById(R.id.tvUserName);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mContext.startActivity(
                            new Intent(mContext,UserProfileActivity.class)
                                    .putExtra("userId",list.get(getAdapterPosition()).getId())
                                    .putExtra("userAvatar",list.get(getAdapterPosition()).getAvatarUrl())
                                    .putExtra("userName",list.get(getAdapterPosition()).getLogin())


                    );
                }
            });
        }
    }

    public void updateData(ArrayList<ConributorObject> list){
        this.list=list;
        notifyDataSetChanged();
    }
}
