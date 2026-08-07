package gj0;

/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f69002b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.wix.reactnativenotifications.core.notification.b f69003a;

    d() {
    }

    public static d c() {
        if (f69002b == null) {
            f69002b = new d();
        }
        return f69002b;
    }

    public void a() {
        this.f69003a = null;
    }

    public com.wix.reactnativenotifications.core.notification.b b() {
        return this.f69003a;
    }

    public void d(com.wix.reactnativenotifications.core.notification.b bVar) {
        this.f69003a = bVar;
    }
}
