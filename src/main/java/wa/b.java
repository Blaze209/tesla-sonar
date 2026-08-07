package wa;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.b0;
import java.io.File;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"wa/c", "wa/d"}, d2 = {}, k = 4, mv = {2, 0, 0}, xi = 48)
public final class b {
    @jn0.e
    public static final CancellationSignal a() {
        return d.a();
    }

    public static final void b(ya.b bVar) {
        c.a(bVar);
    }

    @jn0.e
    public static final void c(za.c cVar) {
        d.b(cVar);
    }

    public static final Object d(b0 b0Var, boolean z11, Continuation<? super CoroutineContext> continuation) {
        return d.c(b0Var, z11, continuation);
    }

    public static final <R> R e(b0 b0Var, boolean z11, boolean z12, wn0.l<? super ya.b, ? extends R> lVar) {
        return (R) d.d(b0Var, z11, z12, lVar);
    }

    public static final <R> Object f(b0 b0Var, boolean z11, boolean z12, wn0.l<? super ya.b, ? extends R> lVar, Continuation<? super R> continuation) {
        return d.e(b0Var, z11, z12, lVar, continuation);
    }

    public static final Cursor g(b0 b0Var, za.f fVar, boolean z11, CancellationSignal cancellationSignal) {
        return d.f(b0Var, fVar, z11, cancellationSignal);
    }

    public static final int h(File file) {
        return d.g(file);
    }
}
