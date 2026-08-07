package ec;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import rc.ImageRequest;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lrc/g;", "request", "Lkotlinx/coroutines/Deferred;", "Lrc/j;", "job", "Lrc/d;", "c", "(Lrc/g;Lkotlinx/coroutines/Deferred;)Lrc/d;", "Lec/h$a;", "Lec/v$a;", "options", "a", "(Lec/h$a;Lec/v$a;)Lec/h$a;", "", "b", "(Lec/v$a;)Z", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z {
    public static final h.a a(h.a aVar, v.Options options) {
        aVar.k(new lc.a(), o0.b(Uri.class));
        aVar.k(new lc.e(), o0.b(Integer.class));
        aVar.j(new kc.a(), o0.b(g0.class));
        aVar.h(new ic.a.C1631a(), o0.b(g0.class));
        aVar.h(new ic.f.a(), o0.b(g0.class));
        aVar.h(new ic.n.a(), o0.b(g0.class));
        aVar.h(new ic.h.a(), o0.b(Drawable.class));
        aVar.h(new ic.b.a(), o0.b(Bitmap.class));
        Semaphore semaphoreSemaphore$default = SemaphoreKt.Semaphore$default(t.b(options), 0, 2, null);
        if (b(options)) {
            aVar.g(new gc.z.a(semaphoreSemaphore$default));
        }
        aVar.g(new gc.e.c(semaphoreSemaphore$default, t.a(options)));
        return aVar;
    }

    private static final boolean b(v.Options options) {
        return Build.VERSION.SDK_INT >= 29 && t.c(options) && p013kotlin.jvm.internal.s.f(t.a(options), gc.q.f67824c);
    }

    public static final rc.d c(ImageRequest imageRequest, Deferred<? extends rc.j> deferred) {
        return imageRequest.getTarget() instanceof vc.d ? rc.v.a(((vc.d) imageRequest.getTarget()).getView()).b(deferred) : new rc.m(deferred);
    }
}
