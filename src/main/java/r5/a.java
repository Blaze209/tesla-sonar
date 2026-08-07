package r5;

import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.c f106981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f106982b;

    /* JADX INFO: renamed from: r5.a$a, reason: collision with other inner class name */
    class RunnableC2273a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f106983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f106984b;

        RunnableC2273a(g.c cVar, Typeface typeface) {
            this.f106983a = cVar;
            this.f106984b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f106983a.b(this.f106984b);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f106986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f106987b;

        b(g.c cVar, int i11) {
            this.f106986a = cVar;
            this.f106987b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f106986a.a(this.f106987b);
        }
    }

    a(g.c cVar, Executor executor) {
        this.f106981a = cVar;
        this.f106982b = executor;
    }

    private void a(int i11) {
        this.f106982b.execute(new b(this.f106981a, i11));
    }

    private void c(Typeface typeface) {
        this.f106982b.execute(new RunnableC2273a(this.f106981a, typeface));
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f107015a);
        } else {
            a(eVar.f107016b);
        }
    }
}
