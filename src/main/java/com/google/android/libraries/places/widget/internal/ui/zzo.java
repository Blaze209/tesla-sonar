package com.google.android.libraries.places.widget.internal.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.internal.zzgb;
import i7.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzo extends g {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();
    private final int zzd;

    public zzo(Resources resources) {
        this.zzd = resources.getDimensionPixelSize(R.dimen.places_autocomplete_vertical_dropdown);
    }

    private final void zzd(RecyclerView.g0 g0Var) {
        View view = g0Var.itemView;
        this.zzc.add(g0Var);
        long moveDuration = getMoveDuration();
        int layoutPosition = g0Var.getLayoutPosition();
        view.setTranslationY(-this.zzd);
        view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        viewPropertyAnimatorAnimate.cancel();
        viewPropertyAnimatorAnimate.translationY(BitmapDescriptorFactory.HUE_RED).alpha(1.0f).setDuration(133L).setInterpolator(new b()).setStartDelay(moveDuration + ((long) (layoutPosition * 67)));
        viewPropertyAnimatorAnimate.setListener(new zzn(this, view, g0Var, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzf(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.x
    public final boolean animateAdd(RecyclerView.g0 g0Var) throws Throwable {
        try {
            endAnimation(g0Var);
            g0Var.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            if (((zzt) g0Var).zzb()) {
                this.zza.add(g0Var);
                return true;
            }
            this.zzb.add(g0Var);
            return true;
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

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.n
    public final void endAnimation(RecyclerView.g0 g0Var) throws Throwable {
        try {
            super.endAnimation(g0Var);
            if (this.zza.remove(g0Var)) {
                zzf(g0Var.itemView);
                dispatchAddFinished(g0Var);
            }
            zze();
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

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.n
    public final void endAnimations() throws Throwable {
        try {
            int size = this.zza.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                RecyclerView.g0 g0Var = (RecyclerView.g0) this.zza.get(size);
                zzf(g0Var.itemView);
                dispatchAddFinished(g0Var);
                this.zza.remove(size);
            }
            List list = this.zzc;
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    super.endAnimations();
                    return;
                }
                ((RecyclerView.g0) list.get(size2)).itemView.animate().cancel();
            }
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

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.n
    public final boolean isRunning() {
        try {
            return (!super.isRunning() && this.zzb.isEmpty() && this.zza.isEmpty() && this.zzc.isEmpty()) ? false : true;
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.n
    public final void runPendingAnimations() throws Throwable {
        try {
            Iterator it = this.zzb.iterator();
            while (it.hasNext()) {
                super.animateAdd((RecyclerView.g0) it.next());
            }
            this.zzb.clear();
            super.runPendingAnimations();
            if (this.zza.isEmpty()) {
                return;
            }
            ArrayList<RecyclerView.g0> arrayList = new ArrayList(this.zza);
            this.zza.clear();
            for (RecyclerView.g0 g0Var : arrayList) {
                View view = g0Var.itemView;
                this.zzc.add(g0Var);
                long moveDuration = getMoveDuration() + ((long) (g0Var.getLayoutPosition() * 67));
                view.setTranslationY(-this.zzd);
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                viewPropertyAnimatorAnimate.cancel();
                viewPropertyAnimatorAnimate.translationY(BitmapDescriptorFactory.HUE_RED).alpha(1.0f).setDuration(133L).setInterpolator(new b()).setStartDelay(moveDuration);
                viewPropertyAnimatorAnimate.setListener(new zzn(this, view, g0Var, viewPropertyAnimatorAnimate)).start();
            }
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
}
