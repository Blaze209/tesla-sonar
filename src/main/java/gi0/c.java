package gi0;

import qj0.e;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements e<b> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f68961a = new c();
    }

    public static c a() {
        return a.f68961a;
    }

    public static b c() {
        return new b();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c();
    }
}
