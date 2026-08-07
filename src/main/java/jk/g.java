package jk;

/* JADX INFO: loaded from: classes3.dex */
public class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static g f83925a;

    private g() {
    }

    public static synchronized g b() {
        try {
            if (f83925a == null) {
                f83925a = new g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f83925a;
    }

    @Override // jk.a
    public void a(a.EnumC1775a enumC1775a, Class<?> cls, String str, Throwable th2) {
    }
}
