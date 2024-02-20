package com.example.demointeviti;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.demointeviti.Adapter.tenkhachsanAdapter;
import com.example.demointeviti.model.tenkhachsan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Home extends AppCompatActivity {
    Button ButtonI211, buttonBoyIII1, buttonBoyIII5;
    private ViewPager2 viewPager;

 /*   private List<tenkhachsan> listtenkhachsan;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        viewPager = findViewById(R.id.view_pager);
        List<String> items = Arrays.asList("Khách sạn Thanh Bình Quận 9, tiện nghi.", "Khách sạn ngọc châu Quận 9, có bãi đậu xe.", "Hello Motel Vũng tàu", "An Binh House Saigon", "Căn hộ 30m2 1 phòng ngủ, 1 phòng tắm riêng ở quận 9", "Cozrum Homes Chamrming Corner", "Vinhome Grand Park - Homestay cao cấp 2 phòng ngủ");
        ViewPagerAdapter Adapter = new ViewPagerAdapter(items);
        viewPager.setAdapter(Adapter);

        ButtonI211 = findViewById(R.id.ButtonI211);
        ButtonI211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, ManHinhKhachSan.class);
                startActivity(intent);
            }
        });

        buttonBoyIII1 = findViewById(R.id.buttonBoyIII1);
        buttonBoyIII1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Home.class);
                startActivity(intent);
            }
        });

        buttonBoyIII5 = findViewById(R.id.buttonBoyIII5);
        buttonBoyIII5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, ManHinh_Them.class);
                startActivity(intent);
            }
        });
        /*mPhần viewPartm*/


/*
*/
       /* TenkhachsanAdapter = new tenkhachsanAdapter(listtenkhachsan);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rectenks.setLayoutManager(linearLayoutManager);
        rectenks.setAdapter(TenkhachsanAdapter);*/
    }

   @Override
    protected void onPause() {
        super.onPause();
        // Gán trạng thái hiện tại của ViewPager
        viewPager.setCurrentItem(0);
    }

    private class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ViewHolder> {

        private List<String> items;

        public ViewPagerAdapter(List<String> items) {
            this.items = items;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.viewpart_home1, parent, false);

            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.bind(items.get(position), position);

        }

        @Override
        public int getItemCount() {
            return items.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {

            private TextView textView;
            private Button button;

            public ViewHolder(View itemView) {
                super(itemView);
                
                textView = itemView.findViewById(R.id.text_view);
                button = itemView.findViewById(R.id.button);
            }

            public void bind(String item, int position) {
                textView.setText(item);
                button.setId(position);
            }
        }
    }

    /*mmmm-----------------------------------------------------------------------------------------------------------------------mmmm*/

}