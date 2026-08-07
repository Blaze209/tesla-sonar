package eg0;

import android.content.Context;
import qj0.e;
import qj0.i;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements e<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i<Context> f62937a;

    public c(i<Context> iVar) {
        this.f62937a = iVar;
    }

    public static c a(i<Context> iVar) {
        return new c(iVar);
    }

    public static b c(Context context) {
        return new b(context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f62937a.get());
    }
}
