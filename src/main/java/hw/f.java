package hw;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements com.google.firebase.perf.application.a.InterfaceC0695a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kw.a f73672a = kw.a.e();

    @Override // com.google.firebase.perf.application.a.InterfaceC0695a
    public void a() {
        try {
            e.c();
        } catch (IllegalStateException e11) {
            f73672a.k("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e11);
        }
    }
}
