package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
class c extends WindowInsetsAnimationCompat.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f41665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f41668d;

    public c(View view) {
        super(0);
        this.f41668d = new int[2];
        this.f41665a = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f41665a.setTranslationY(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onPrepare(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f41665a.getLocationOnScreen(this.f41668d);
        this.f41666b = this.f41668d[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NonNull
    public WindowInsetsCompat onProgress(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list) {
        for (WindowInsetsAnimationCompat windowInsetsAnimationCompat : list) {
            if ((windowInsetsAnimationCompat.c() & WindowInsetsCompat.n.c()) != 0) {
                this.f41665a.setTranslationY(at.b.c(this.f41667c, 0, windowInsetsAnimationCompat.b()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NonNull
    public WindowInsetsAnimationCompat.a onStart(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat, @NonNull WindowInsetsAnimationCompat.a aVar) {
        this.f41665a.getLocationOnScreen(this.f41668d);
        int i11 = this.f41666b - this.f41668d[1];
        this.f41667c = i11;
        this.f41665a.setTranslationY(i11);
        return aVar;
    }
}
