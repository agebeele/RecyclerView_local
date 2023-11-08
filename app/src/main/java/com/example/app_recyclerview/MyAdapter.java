package com.example.app_recyclerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    //Para recibir los datos de la clase principal.
    private List<String> dataCorreo;
    private List<String> dataNombre;
    private List<String> dataTelefono;
    private List<String> dataUbicacion;
    private List<String> dataImagen;
    //Se necesita un arreglo por cada uno de los datos.
    private OnItemClickListener listener;
    public MyAdapter(List<String>dataCorreo, List<String> dataNombre, List<String> dataImagen,List<String> dataTelefono,List<String> dataUbicacion)
    {this.dataCorreo = dataCorreo; this.dataNombre = dataNombre; this.dataImagen = dataImagen; this.dataTelefono = dataTelefono; this.dataUbicacion = dataUbicacion;}

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {

        holder.txtCorreoE.setText(dataCorreo.get(position));
        holder.txtNombreC.setText(dataNombre.get(position));
        holder.txtTelefonoN.setText(dataTelefono.get(position));
        holder.txtUbicacionL.setText(dataUbicacion.get(position));
        holder.imageView1.setImageResource(Integer.parseInt(dataImagen.get(position)));

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (listener != null){
                    int pos = holder.getAbsoluteAdapterPosition();
                    listener.onItemClick(pos);
                }
            }
        });
    }
    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener;
    }

    @Override
    public int getItemCount() {return dataCorreo.size();}
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtNombreC, txtCorreoE, txtTelefonoN, txtUbicacionL;
        public ImageView imageView1;
        public ViewHolder(View itemView) {
            super(itemView);
            txtCorreoE = itemView.findViewById(R.id.txtCorreo);
            txtNombreC = itemView.findViewById(R.id.txtNombre);
            txtTelefonoN = itemView.findViewById(R.id.txtxTelefono);
            txtUbicacionL = itemView.findViewById(R.id.txtUbicacion);
            imageView1 = itemView.findViewById(R.id.imageView);
        }
    }
}
