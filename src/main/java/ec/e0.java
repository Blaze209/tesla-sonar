package ec;

import android.content.Context;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lec/c0$a;", "a", "Lec/c0$a;", "DefaultSingletonImageLoaderFactory", "Lec/l$c;", "Ljn0/h0;", "b", "Lec/l$c;", "DefaultSingletonImageLoaderKey", "coil_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c0.a f62465a = new c0.a() { // from class: ec.d0
        @Override // ec.c0.a
        public final r a(Context context) {
            return e0.b(context);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Extras.c<jn0.h0> f62466b = new Extras.c<>(jn0.h0.f84049a);

    /* JADX INFO: Access modifiers changed from: private */
    public static final r b(Context context) {
        r.a aVar = new r.a(context);
        aVar.getExtras().b(f62466b, jn0.h0.f84049a);
        return aVar.c();
    }
}
