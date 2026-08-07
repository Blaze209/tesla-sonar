package hk0;

import java.lang.ref.WeakReference;
import org.zeroturnaround.javarebel.ClassEventListener;
import org.zeroturnaround.javarebel.ReloaderFactory;

/* JADX INFO: loaded from: classes8.dex */
class r implements o {

    private static class a implements ClassEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f73088a;

        a(p pVar) {
            this.f73088a = new WeakReference(pVar);
        }
    }

    r() {
    }

    @Override // hk0.o
    public void a(p pVar) {
        ReloaderFactory.getInstance().addClassReloadListener(new a(pVar));
    }
}
