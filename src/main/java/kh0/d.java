package kh0;

import android.content.Context;
import qj0.i;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements qj0.e<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i<Context> f86121a;

    public d(i<Context> iVar) {
        this.f86121a = iVar;
    }

    public static d a(i<Context> iVar) {
        return new d(iVar);
    }

    public static b c(Context context) {
        return new b(context);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f86121a.get());
    }
}
