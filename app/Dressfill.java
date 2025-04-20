import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Dressfill extends RecyclerView.Adapter<Dressfill.ViewHolder>  {
    private List<Dress> dresses;

    public Dressfill(List<Dress> dresses) {
        this.dresses = dresses;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_dress, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Dress dress = dresses.get(position);
        holder.name.setText(dress.getName());
        holder.price.setText(dress.getPrice());
        holder.image.setImageResource(dress.getImageRes());
    }

    @Override
    public int getItemCount() {
        return dresses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, price;
        public ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.dressName);
            price = itemView.findViewById(R.id.dressPrice);
            image = itemView.findViewById(R.id.dressImage);
        }
    }
}
