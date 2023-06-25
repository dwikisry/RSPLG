package com.dwiki.rsd.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dwiki.rsd.Model.ModelRumahSakit;
import com.dwiki.rsd.R;

import java.util.List;

public class AdapterRumahSakit extends RecyclerView.Adapter<AdapterRumahSakit.VHRumahSakit> {
    private Context ctx;
    private List<ModelRumahSakit> listRumahSakit;

    public AdapterRumahSakit(Context ctx, List<ModelRumahSakit> listRumahSakit) {
        this.ctx = ctx;
        this.listRumahSakit = listRumahSakit;
    }

    @NonNull
    @Override
    public VHRumahSakit onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View varView = LayoutInflater.from(ctx).inflate(R.layout.list_rumahsakit,parent,false);
        return new VHRumahSakit(varView);
    }

    @Override
    public void onBindViewHolder(@NonNull VHRumahSakit holder, int position) {
        ModelRumahSakit MRS = listRumahSakit.get(position);

        holder.tvId.setText(MRS.getId());
        holder.tvNama.setText(MRS.getNama());
        holder.tvFoto.setText(MRS.getFoto());
        holder.tvDeskripsi.setText(MRS.getDeskripsi());
        holder.tvLokasi.setText(MRS.getLokasi());
        holder.tvKoordinat.setText(MRS.getKoordinat());
        Glide
                .with(ctx)
                .load(MRS.getFoto())
                .into(holder.ivFoto);
    }

    @Override
    public int getItemCount() {
        return listRumahSakit.size();
    }

    public class VHRumahSakit extends RecyclerView.ViewHolder{
        private TextView tvId, tvNama, tvFoto, tvDeskripsi, tvLokasi, tvKoordinat;
        private Button btnHapus, btnUbah, btnDetail;
        private ImageView ivFoto;
        public VHRumahSakit(@NonNull View itemView) {
            super(itemView);
            tvId = itemView.findViewById(R.id.tv_id);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvFoto = itemView.findViewById(R.id.tv_foto);
            tvDeskripsi = itemView.findViewById(R.id.tv_deskripsi);
            tvLokasi = itemView.findViewById(R.id.tv_lokasi);
            tvKoordinat = itemView.findViewById(R.id.tv_koordinat);
            ivFoto = itemView.findViewById(R.id.iv_foto);
            btnHapus = itemView.findViewById(R.id.btn_hapus);
            btnUbah = itemView.findViewById(R.id.btn_ubah);
            btnDetail = itemView.findViewById(R.id.btn_detail);
        }
    }
}
