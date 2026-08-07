package com.google.android.libraries.places.widget.internal.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.q;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzgb;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzr extends q {
    private int zza;
    private boolean zzb;
    private final zzb zzc;

    public zzr(zzb zzbVar, byte[] bArr) {
        super(new zzq(null));
        this.zzb = true;
        this.zzc = zzbVar;
    }

    @Override // androidx.recyclerview.widget.q
    public final void submitList(List list) {
        try {
            int size = 0;
            this.zzb = (this.zza != 0 || list == null || list.isEmpty()) ? false : true;
            if (list != null) {
                size = list.size();
            }
            this.zza = size;
            super.submitList(list);
        } catch (Error e11) {
            e = e11;
            zzgb.zzb(e);
            throw e;
        } catch (RuntimeException e12) {
            e = e12;
            zzgb.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzt onCreateViewHolder(ViewGroup viewGroup, int i11) {
        try {
            return new zzt(this.zzc, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.places_autocomplete_prediction, viewGroup, false), null);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(zzt zztVar, int i11) {
        try {
            zztVar.zza((AutocompletePrediction) getItem(i11), this.zzb);
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }
}
