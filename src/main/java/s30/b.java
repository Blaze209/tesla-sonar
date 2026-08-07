package s30;

import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements qj0.e<Locale> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f109791a;

    public b(a aVar) {
        this.f109791a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static Locale c(a aVar) {
        return aVar.a();
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Locale get() {
        return c(this.f109791a);
    }
}
