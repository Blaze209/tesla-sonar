package m40;

import o30.ApiVersion;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements qj0.e<ApiVersion> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f91175a = new g();
    }

    public static g a() {
        return a.f91175a;
    }

    public static ApiVersion c() {
        return (ApiVersion) qj0.h.d(f.f91173a.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ApiVersion get() {
        return c();
    }
}
