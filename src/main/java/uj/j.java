package uj;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import rj.l;

/* JADX INFO: loaded from: classes3.dex */
public interface j<R> extends l {
    com.bumptech.glide.request.e getRequest();

    void getSize(@NonNull i iVar);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(@NonNull R r11, vj.b<? super R> bVar);

    void removeCallback(@NonNull i iVar);

    void setRequest(com.bumptech.glide.request.e eVar);
}
