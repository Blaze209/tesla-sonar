package ga;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.v f67690a;

    public /* synthetic */ j(androidx.media3.session.v vVar) {
        this.f67690a = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f67690a.release();
    }
}
