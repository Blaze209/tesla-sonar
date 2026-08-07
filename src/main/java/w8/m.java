package w8;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements u {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f121345s = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final a f121346t = new a(new a.InterfaceC2601a() { // from class: w8.k
        @Override // w8.m.a.InterfaceC2601a
        public final Constructor a() {
            return m.l();
        }
    });

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final a f121347u = new a(new a.InterfaceC2601a() { // from class: w8.l
        @Override // w8.m.a.InterfaceC2601a
        public final Constructor a() {
            return m.m();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f121348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f121349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f121350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f121351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f121352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f121353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f121354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f121355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f121356j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f121358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.common.collect.x<p7.u> f121359m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f121363q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f121364r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f121357k = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f121360n = 112800;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private t9.q.a f121362p = new t9.g();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f121361o = true;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC2601a f121365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f121366b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Constructor<? extends p> f121367c;

        /* JADX INFO: renamed from: w8.m$a$a, reason: collision with other inner class name */
        public interface InterfaceC2601a {
            Constructor<? extends p> a();
        }

        public a(InterfaceC2601a interfaceC2601a) {
            this.f121365a = interfaceC2601a;
        }

        private Constructor<? extends p> b() {
            synchronized (this.f121366b) {
                if (this.f121366b.get()) {
                    return this.f121367c;
                }
                try {
                    return this.f121365a.a();
                } catch (ClassNotFoundException unused) {
                    this.f121366b.set(true);
                    return this.f121367c;
                } catch (Exception e11) {
                    throw new RuntimeException("Error instantiating extension", e11);
                }
            }
        }

        public p a(Object... objArr) {
            Constructor<? extends p> constructorB = b();
            if (constructorB == null) {
                return null;
            }
            try {
                return constructorB.newInstance(objArr);
            } catch (Exception e11) {
                throw new IllegalStateException("Unexpected error creating extractor", e11);
            }
        }
    }

    private void i(int i11, List<p> list) {
        switch (i11) {
            case 0:
                list.add(new da.b());
                break;
            case 1:
                list.add(new da.e());
                break;
            case 2:
                list.add(new da.h((this.f121349c ? 2 : 0) | ((this.f121350d | (this.f121348b ? 1 : 0)) == true ? 1 : 0)));
                break;
            case 3:
                list.add(new x8.b((this.f121349c ? 2 : 0) | this.f121351e | (this.f121348b ? 1 : 0)));
                break;
            case 4:
                p pVarA = f121346t.a(Integer.valueOf(this.f121352f));
                if (pVarA == null) {
                    list.add(new b9.d(this.f121352f));
                } else {
                    list.add(pVarA);
                }
                break;
            case 5:
                list.add(new androidx.media3.extractor.flv.b());
                break;
            case 6:
                list.add(new o9.e(this.f121362p, (this.f121361o ? 0 : 2) | this.f121353g));
                break;
            case 7:
                list.add(new p9.f((this.f121349c ? 2 : 0) | this.f121356j | (this.f121348b ? 1 : 0)));
                break;
            case 8:
                list.add(new q9.h(this.f121362p, this.f121355i | q9.h.g(this.f121363q) | (this.f121361o ? 0 : 32)));
                list.add(new q9.n(this.f121362p, (this.f121361o ? 0 : 16) | this.f121354h | q9.n.s(this.f121363q)));
                break;
            case 9:
                list.add(new r9.d());
                break;
            case 10:
                list.add(new da.c0());
                break;
            case 11:
                if (this.f121359m == null) {
                    this.f121359m = com.google.common.collect.x.r();
                }
                list.add(new da.k0(this.f121357k, !this.f121361o ? 1 : 0, this.f121362p, new s7.i0(0L), new da.j(this.f121358l, this.f121359m), this.f121360n));
                break;
            case 12:
                list.add(new ea.b());
                break;
            case 14:
                list.add(new e9.a(this.f121364r));
                break;
            case 15:
                p pVarA2 = f121347u.a(new Object[0]);
                if (pVarA2 != null) {
                    list.add(pVarA2);
                }
                break;
            case 16:
                list.add(new y8.b(!this.f121361o ? 1 : 0, this.f121362p));
                break;
            case 17:
                list.add(new s9.a());
                break;
            case 18:
                list.add(new fa.a());
                break;
            case 19:
                list.add(new a9.a());
                break;
            case 20:
                int i12 = this.f121354h;
                if ((i12 & 2) == 0 && (i12 & 4) == 0) {
                    list.add(new d9.a());
                    break;
                }
                break;
            case 21:
                list.add(new z8.a());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends p> l() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(p.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends p> m() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(p.class).getConstructor(null);
    }

    @Override // w8.u
    public synchronized p[] b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f121345s;
            arrayList = new ArrayList(iArr.length);
            int iB = p7.p.b(map);
            if (iB != -1) {
                i(iB, arrayList);
            }
            int iC = p7.p.c(uri);
            if (iC != -1 && iC != iB) {
                i(iC, arrayList);
            }
            for (int i11 : iArr) {
                if (i11 != iB && i11 != iC) {
                    i(i11, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (p[]) arrayList.toArray(new p[0]);
    }

    @Override // w8.u
    public synchronized p[] d() {
        return b(Uri.EMPTY, new HashMap());
    }

    @Override // w8.u
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized m c(int i11) {
        this.f121363q = i11;
        return this;
    }

    @Override // w8.u
    @Deprecated
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public synchronized m e(boolean z11) {
        this.f121361o = z11;
        return this;
    }

    public synchronized m n(int i11) {
        this.f121364r = i11;
        return this;
    }

    @Override // w8.u
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public synchronized m a(t9.q.a aVar) {
        this.f121362p = aVar;
        return this;
    }
}
