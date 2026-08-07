package uj;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import xj.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c<T> implements j<T> {
    private final int height;
    private com.bumptech.glide.request.e request;
    private final int width;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // uj.j
    public final com.bumptech.glide.request.e getRequest() {
        return this.request;
    }

    @Override // uj.j
    public final void getSize(@NonNull i iVar) {
        iVar.e(this.width, this.height);
    }

    @Override // uj.j
    public final void setRequest(com.bumptech.glide.request.e eVar) {
        this.request = eVar;
    }

    public c(int i11, int i12) {
        if (l.u(i11, i12)) {
            this.width = i11;
            this.height = i12;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i11 + " and height: " + i12);
    }

    @Override // rj.l
    public void onDestroy() {
    }

    @Override // rj.l
    public void onStart() {
    }

    @Override // rj.l
    public void onStop() {
    }

    @Override // uj.j
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // uj.j
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // uj.j
    public final void removeCallback(@NonNull i iVar) {
    }
}
