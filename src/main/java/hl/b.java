package hl;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class b extends hl.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f73115b = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f73119f = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<hl.a.InterfaceC1536a> f73117d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<hl.a.InterfaceC1536a> f73118e = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f73116c = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this.f73115b) {
                ArrayList arrayList = b.this.f73118e;
                b bVar = b.this;
                bVar.f73118e = bVar.f73117d;
                b.this.f73117d = arrayList;
            }
            int size = b.this.f73118e.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((hl.a.InterfaceC1536a) b.this.f73118e.get(i11)).release();
            }
            b.this.f73118e.clear();
        }
    }

    @Override // hl.a
    public void a(hl.a.InterfaceC1536a interfaceC1536a) {
        synchronized (this.f73115b) {
            this.f73117d.remove(interfaceC1536a);
        }
    }

    @Override // hl.a
    public void d(hl.a.InterfaceC1536a interfaceC1536a) {
        if (!hl.a.c()) {
            interfaceC1536a.release();
            return;
        }
        synchronized (this.f73115b) {
            try {
                if (this.f73117d.contains(interfaceC1536a)) {
                    return;
                }
                this.f73117d.add(interfaceC1536a);
                boolean z11 = true;
                if (this.f73117d.size() != 1) {
                    z11 = false;
                }
                if (z11) {
                    this.f73116c.post(this.f73119f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
