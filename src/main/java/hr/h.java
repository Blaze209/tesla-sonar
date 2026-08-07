package hr;

import android.net.Uri;
import com.google.android.exoplayer2.u0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import rr.h0;
import ts.m0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h implements p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f73355o = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f73356p = new a(new a.InterfaceC1542a() { // from class: hr.f
        @Override // hr.h.a.InterfaceC1542a
        public final Constructor a() {
            return h.g();
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final a f73357q = new a(new a.InterfaceC1542a() { // from class: hr.g
        @Override // hr.h.a.InterfaceC1542a
        public final Constructor a() {
            return h.h();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f73358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f73359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f73360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f73361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f73362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f73363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f73364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f73365i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f73366j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f73368l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.common.collect.x<u0> f73369m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f73367k = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f73370n = 112800;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC1542a f73371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f73372b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Constructor<? extends k> f73373c;

        /* JADX INFO: renamed from: hr.h$a$a, reason: collision with other inner class name */
        public interface InterfaceC1542a {
            Constructor<? extends k> a();
        }

        public a(InterfaceC1542a interfaceC1542a) {
            this.f73371a = interfaceC1542a;
        }

        private Constructor<? extends k> b() {
            synchronized (this.f73372b) {
                if (this.f73372b.get()) {
                    return this.f73373c;
                }
                try {
                    return this.f73371a.a();
                } catch (ClassNotFoundException unused) {
                    this.f73372b.set(true);
                    return this.f73373c;
                } catch (Exception e11) {
                    throw new RuntimeException("Error instantiating extension", e11);
                }
            }
        }

        public k a(Object... objArr) {
            Constructor<? extends k> constructorB = b();
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

    private void f(int i11, List<k> list) {
        switch (i11) {
            case 0:
                list.add(new rr.b());
                break;
            case 1:
                list.add(new rr.e());
                break;
            case 2:
                list.add(new rr.h((this.f73359c ? 2 : 0) | ((this.f73360d | (this.f73358b ? 1 : 0)) == true ? 1 : 0)));
                break;
            case 3:
                list.add(new ir.b((this.f73359c ? 2 : 0) | this.f73361e | (this.f73358b ? 1 : 0)));
                break;
            case 4:
                k kVarA = f73356p.a(Integer.valueOf(this.f73362f));
                if (kVarA == null) {
                    list.add(new kr.d(this.f73362f));
                } else {
                    list.add(kVarA);
                }
                break;
            case 5:
                list.add(new com.google.android.exoplayer2.extractor.flv.b());
                break;
            case 6:
                list.add(new nr.e(this.f73363g));
                break;
            case 7:
                list.add(new or.f((this.f73359c ? 2 : 0) | this.f73366j | (this.f73358b ? 1 : 0)));
                break;
            case 8:
                list.add(new pr.g(this.f73365i));
                list.add(new pr.k(this.f73364h));
                break;
            case 9:
                list.add(new qr.d());
                break;
            case 10:
                list.add(new rr.a0());
                break;
            case 11:
                if (this.f73369m == null) {
                    this.f73369m = com.google.common.collect.x.r();
                }
                list.add(new h0(this.f73367k, new m0(0L), new rr.j(this.f73368l, this.f73369m), this.f73370n));
                break;
            case 12:
                list.add(new sr.b());
                break;
            case 14:
                list.add(new mr.a());
                break;
            case 15:
                k kVarA2 = f73357q.a(new Object[0]);
                if (kVarA2 != null) {
                    list.add(kVarA2);
                }
                break;
            case 16:
                list.add(new jr.b());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends k> g() {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(k.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends k> h() {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(k.class).getConstructor(null);
    }

    @Override // hr.p
    public synchronized k[] b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f73355o;
            arrayList = new ArrayList(iArr.length);
            int iB = ts.n.b(map);
            if (iB != -1) {
                f(iB, arrayList);
            }
            int iC = ts.n.c(uri);
            if (iC != -1 && iC != iB) {
                f(iC, arrayList);
            }
            for (int i11 : iArr) {
                if (i11 != iB && i11 != iC) {
                    f(i11, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (k[]) arrayList.toArray(new k[arrayList.size()]);
    }

    @Override // hr.p
    public synchronized k[] d() {
        return b(Uri.EMPTY, new HashMap());
    }
}
