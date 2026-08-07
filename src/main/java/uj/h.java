package uj;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.bumptech.glide.l;

/* JADX INFO: loaded from: classes3.dex */
public final class h<Z> extends c<Z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Handler f116377b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f116378a;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((h) message.obj).a();
            return true;
        }
    }

    private h(l lVar, int i11, int i12) {
        super(i11, i12);
        this.f116378a = lVar;
    }

    public static <Z> h<Z> b(l lVar, int i11, int i12) {
        return new h<>(lVar, i11, i12);
    }

    void a() {
        this.f116378a.clear(this);
    }

    @Override // uj.j
    public void onResourceReady(@NonNull Z z11, vj.b<? super Z> bVar) {
        com.bumptech.glide.request.e request = getRequest();
        if (request == null || !request.isComplete()) {
            return;
        }
        f116377b.obtainMessage(1, this).sendToTarget();
    }

    @Override // uj.j
    public void onLoadCleared(Drawable drawable) {
    }
}
