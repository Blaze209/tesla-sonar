package ah;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f1043a;

    public c(b bVar) {
        this.f1043a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f1043a.b();
        } catch (Exception e11) {
            d.c(e11);
        }
    }
}
