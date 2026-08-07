package iu;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f81923a;

    private x(Object obj) {
        this.f81923a = obj;
    }

    public static w b(Object obj) {
        if (obj != null) {
            return new x(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // iu.b0
    public final Object a() {
        return this.f81923a;
    }
}
