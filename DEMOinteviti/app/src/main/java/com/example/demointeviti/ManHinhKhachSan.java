package com.example.demointeviti;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class ManHinhKhachSan extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter adapter;


    Button buttonlistks1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_khach_san);

        RecyclerView RecyclerViewKhachSan = findViewById(R.id.RecyclerViewKhachSan);
        List<String> items = Arrays.asList("Khách sạn Thanh Bình Quận 9, tiện nghi.", "Khách sạn ngọc châu Quận 9, có bãi đậu xe.", "Hello Motel Vũng tàu", "An Binh House Saigon", "Căn hộ 30m2 1 phòng ngủ, 1 phòng tắm riêng ở quận 9", "Cozrum Homes Chamrming Corner", "Vinhome Grand Park - Homestay cao cấp 2 phòng ngủ");

        CustomAdapter Adapter = new CustomAdapter(items,this);
        RecyclerViewKhachSan.setLayoutManager(new LinearLayoutManager(this));
        RecyclerViewKhachSan.setAdapter(Adapter);

    }

    public static class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
        private List<String> items;
        private Context context;



        public interface ItemClickListener {
            void onClick(View view, int position,boolean isLongClick);
        }


        public CustomAdapter(List<String> items, Context context ) {
            this.context = context;
            this.items = items;
        }


        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater inflater = LayoutInflater.from(parent.getContext());

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_khachsan,parent, false);
            ViewHolder viewHolder = new ViewHolder(view);
            viewHolder.setItemClickListener(new ItemClickListener() {
                @Override
                public void onClick(View view, int position, boolean isLongClick) {
                    if(isLongClick){
                        Toast.makeText(context, "Long Click: "+items.get(position), Toast.LENGTH_SHORT).show();

                    }

                    else
                        Toast.makeText(context, "Short Click: "+items.get(position), Toast.LENGTH_SHORT).show();
                }
            });
            return viewHolder;
        }


        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.bind(items.get(position), position);

            holder.setItemClickListener(new ItemClickListener() {
                @Override
                public void onClick(View view, int position, boolean isLongClick) {
                    if (isLongClick)
                        Toast.makeText(context, "Long Click: " + items.get(position), Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(context, "Short Click: " + items.get(position), Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return items.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder{
            private TextView text_viewlistks2;
            private ItemClickListener itemClickListener;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                text_viewlistks2 = (TextView) itemView.findViewById(R.id.text_viewlistks2);
                /*Hỏi lại chỗ này tại sao lại ép kiểu*/
            }

            public void setItemClickListener(ItemClickListener itemClickListener) {
                this.itemClickListener = itemClickListener;
            }

            public TextView getText_viewlistks2() {
                return text_viewlistks2;
            }

            public void setText_viewlistks2(TextView text_viewlistks2) {
                this.text_viewlistks2 = text_viewlistks2;
            }

            public void bind(String s, int position) {
                text_viewlistks2.setText(s);

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (itemClickListener != null) {
                            itemClickListener.onClick(view, position, false);
                        }
                    }
                });

                itemView.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {
                        if (itemClickListener != null) {
                            itemClickListener.onClick(view, position, true);
                        }
                        return true;
                    }
                });

            }

        }

        public class RecyclerViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener,View.OnLongClickListener{
            public TextView txt_description;
            private ItemClickListener itemClickListener;

            public RecyclerViewHolder(View itemView) {
                super(itemView);
                txt_description = (TextView)itemView.findViewById(R.id.text_viewlistks2);
                itemView.setOnClickListener(this);
                itemView.setOnLongClickListener(this);
            }

            @Override
            public void onClick(View v) {
                itemClickListener.onClick(v,getAdapterPosition(),false);
            }

            @Override
            public boolean onLongClick(View v) {
                itemClickListener.onClick(v,getAdapterPosition(),true);
                return true;
            }
        }

    }
}






  /*  public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
        private List<String> items;


    public class ViewHolder extends RecyclerView.ViewHolder {

        private  TextView text_viewlistks2;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            text_viewlistks2 = (TextView) view.findViewById(R.id.text_viewlistks2);
        }

        public TextView getTextView() {
            return text_viewlistks2;
        }

        public void bind(String s, int position) {
            text_viewlistks2.setText(s);
        }
    }


    public CustomAdapter(List<String> items) {
            this.items = items;
        }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.items_khachsan, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.bind(items.get(position), position);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return items.size();
    }
    }
*/
