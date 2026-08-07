package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class h1 {
    private static final String A = "h1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.facebook.react.uimanager.t f23216b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f23219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ReactApplicationContext f23220f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private po.a f23225k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f23229o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f23230p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f23231q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f23232r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f23233s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f23234t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f23235u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f23236v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f23237w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f23238x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f23239y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f23240z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f23215a = new int[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f23217c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f23218d = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<g> f23221g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<r> f23222h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<Runnable> f23223i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayDeque<r> f23224j = new ArrayDeque<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23226l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f23227m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f23228n = false;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f23241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f23242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayDeque f23243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f23244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f23245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f23246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f23247g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f23248h;

        a(int i11, ArrayList arrayList, ArrayDeque arrayDeque, ArrayList arrayList2, long j11, long j12, long j13, long j14) {
            this.f23241a = i11;
            this.f23242b = arrayList;
            this.f23243c = arrayDeque;
            this.f23244d = arrayList2;
            this.f23245e = j11;
            this.f23246f = j12;
            this.f23247g = j13;
            this.f23248h = j14;
        }

        @Override // java.lang.Runnable
        public void run() {
            ep.b.a(0L, "DispatchUI").a("BatchId", this.f23241a).c();
            try {
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    ArrayList<g> arrayList = this.f23242b;
                    if (arrayList != null) {
                        for (g gVar : arrayList) {
                            try {
                                gVar.c();
                            } catch (RetryableMountingLayerException e11) {
                                if (gVar.a() == 0) {
                                    gVar.b();
                                    h1.this.f23221g.add(gVar);
                                } else {
                                    ReactSoftExceptionLogger.logSoftException(h1.A, new ReactNoCrashSoftException(e11));
                                }
                            } catch (Throwable th2) {
                                ReactSoftExceptionLogger.logSoftException(h1.A, th2);
                            }
                        }
                    }
                    ArrayDeque arrayDeque = this.f23243c;
                    if (arrayDeque != null) {
                        Iterator it = arrayDeque.iterator();
                        while (it.hasNext()) {
                            ((r) it.next()).execute();
                        }
                    }
                    ArrayList arrayList2 = this.f23244d;
                    if (arrayList2 != null) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((r) it2.next()).execute();
                        }
                    }
                    if (h1.this.f23228n && h1.this.f23230p == 0) {
                        h1.this.f23230p = this.f23245e;
                        h1.this.f23231q = SystemClock.uptimeMillis();
                        h1.this.f23232r = this.f23246f;
                        h1.this.f23233s = this.f23247g;
                        h1.this.f23234t = jUptimeMillis;
                        h1 h1Var = h1.this;
                        h1Var.f23235u = h1Var.f23231q;
                        h1.this.f23238x = this.f23248h;
                        ep.a.b(0L, "delayBeforeDispatchViewUpdates", 0, h1.this.f23230p * 1000000);
                        ep.a.h(0L, "delayBeforeDispatchViewUpdates", 0, h1.this.f23233s * 1000000);
                        ep.a.b(0L, "delayBeforeBatchRunStart", 0, h1.this.f23233s * 1000000);
                        ep.a.h(0L, "delayBeforeBatchRunStart", 0, h1.this.f23234t * 1000000);
                    }
                    h1.this.f23216b.clearLayoutAnimation();
                    if (h1.this.f23225k != null) {
                        h1.this.f23225k.a();
                    }
                    ep.a.i(0L);
                } catch (Exception e12) {
                    h1.this.f23227m = true;
                    throw e12;
                }
            } catch (Throwable th3) {
                ep.a.i(0L);
                throw th3;
            }
        }
    }

    class b extends GuardedRunnable {
        b(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            h1.this.R();
        }
    }

    private final class c extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f23252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f23253e;

        public c(int i11, int i12, boolean z11, boolean z12) {
            super(i11);
            this.f23251c = i12;
            this.f23253e = z11;
            this.f23252d = z12;
        }

        @Override // com.facebook.react.uimanager.h1.r
        public void execute() {
            if (this.f23253e) {
                h1.this.f23216b.clearJSResponder();
            } else {
                h1.this.f23216b.setJSResponder(this.f23305a, this.f23251c, this.f23252d);
            }
        }
    }

    private class d implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReadableMap f23255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callback f23256b;

        @Override // com.facebook.react.uimanager.h1.r
        public void execute() {
            h1.this.f23216b.configureLayoutAnimation(this.f23255a, this.f23256b);
        }

        private d(ReadableMap readableMap, Callback callback) {
            this.f23255a = readableMap;
            this.f23256b = callback;
        }
    }

    private final class e extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v0 f23258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f23259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final k0 f23260e;

        public e(v0 v0Var, int i11, String str, k0 k0Var) {
            super(i11);
            this.f23258c = v0Var;
            this.f23259d = str;
            this.f23260e = k0Var;
            ep.a.l(0L, "createView", this.f23305a);
        }

        @Override // com.facebook.react.uimanager.h1.r
        public void execute() {
            ep.a.f(0L, "createView", this.f23305a);
            h1.this.f23216b.createView(this.f23258c, this.f23305a, this.f23259d, this.f23260e);
        }
    }

    @Deprecated
    private final class f extends v implements g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23262c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ReadableArray f23263d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23264e;

        public f(int i11, int i12, ReadableArray readableArray) {
            super(i11);
            this.f23264e = 0;
            this.f23262c = i12;
            this.f23263d = readableArray;
        }

        @Override // com.facebook.react.uimanager.h1.g
        public int a() {
            return this.f23264e;
        }

        @Override // com.facebook.react.uimanager.h1.g
        public void b() {
            this.f23264e++;
        }

        @Override // com.facebook.react.uimanager.h1.g
        public void c() {
            h1.this.f23216b.dispatchCommand(this.f23305a, this.f23262c, this.f23263d);
        }

        @Override // com.facebook.react.uimanager.h1.r
        public void execute() {
            try {
                h1.this.f23216b.dispatchCommand(this.f23305a, this.f23262c, this.f23263d);
            } catch (Throwable th2) {
                ReactSoftExceptionLogger.logSoftException(h1.A, new RuntimeException("Error dispatching View Command", th2));
            }
        }
    }

    private interface g {
        int a();

        void b();

        void c();
    }

    private final class h extends v implements g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f23266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ReadableArray f23267d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23268e;

        public h(int i11, String str, ReadableArray readableArray) {
            super(i11);
            this.f23268e = 0;
            this.f23266c = str;
            this.f23267d = readableArray;
        }

        @Override // com.facebook.react.uimanager.h1.g
        public int a() {
            return this.f23268e;
        }

        @Override // com.facebook.react.uimanager.h1.g
        public void b() {
            this.f23268e++;
        }

        @Override // com.facebook.react.uimanager.h1.g
        public void c() {
            h1.this.f23216b.dispatchCommand(this.f23305a, this.f23266c, this.f23267d);
        }

        @Override // com.facebook.react.uimanager.h1.r
        public void execute() {
            try {
                h1.this.f23216b.dispatchCommand(this.f23305a, this.f23266c, this.f23267d);
            } catch (Throwable th2) {
                ReactSoftExceptionLogger.logSoftException(h1.A, new RuntimeException("Error dispatching View Command", th2));
            }
        }
    }

    private class i extends com.facebook.react.uimanager.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23270a;

        private void a(long j11) throws Exception {
            r rVar;
            while (16 - ((System.nanoTime() - j11) / 1000000) >= this.f23270a) {
                synchronized (h1.this.f23218d) {
                    try {
                        if (h1.this.f23224j.isEmpty()) {
                            return;
                        } else {
                            rVar = (r) h1.this.f23224j.pollFirst();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    rVar.execute();
                    h1.this.f23229o += SystemClock.uptimeMillis() - jUptimeMillis;
                } catch (Exception e11) {
                    h1.this.f23227m = true;
                    throw e11;
                }
            }
        }

        @Override // com.facebook.react.uimanager.g
        public void doFrameGuarded(long j11) {
            if (h1.this.f23227m) {
                qk.a.I("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            ep.a.c(0L, "dispatchNonBatchedUIOperations");
            try {
                a(j11);
                ep.a.i(0L);
                h1.this.R();
                com.facebook.react.modules.core.b.h().k(com.facebook.react.modules.core.b.a.DISPATCH_UI, this);
            } catch (Throwable th2) {
                ep.a.i(0L);
                throw th2;
            }
        }

        private i(ReactContext reactContext, int i11) {
            super(reactContext);
            this.f23270a = i11;
        }
    }

    private final class j implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f23273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f23274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Callback f23275d;

        @Override // com.facebook.react.uimanager.h1.r
        public void execute() {
            try {
                h1.this.f23216b.measure(this.f23272a, h1.this.f23215a);
                float f11 = h1.this.f23215a[0];
                float f12 = h1.this.f23215a[1];
                int iFindTargetTagForTouch = h1.this.f23216b.findTargetTagForTouch(this.f23272a, this.f23273b, this.f23274c);
                try {
                    h1.this.f23216b.measure(iFindTargetTagForTouch, h1.this.f23215a);
                    this.f23275d.invoke(Integer.valueOf(iFindTargetTagForTouch), Float.valueOf(w.f(h1.this.f23215a[0] - f11)), Float.valueOf(w.f(h1.this.f23215a[1] - f12)), Float.valueOf(w.f(h1.this.f23215a[2])), Float.valueOf(w.f(h1.this.f23215a[3])));
                } catch (IllegalViewOperationException unused) {
                    this.f23275d.invoke(new Object[0]);
                }
            } catch (IllegalViewOperationException unused2) {
                this.f23275d.invoke(new Object[0]);
            }
        }

        private j(int i11, float f11, float f12, Callback callback) {
            this.f23272a = i11;
            this.f23273b = f11;
            this.f23274c = f12;
            this.f23275d = callback;
        }
    }

    private final class k extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f23277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final j1[] f23278d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f23279e;

        public k(int i11, int[] iArr, j1[] j1VarArr, int[] iArr2) {
            super(i11);
            this.f23277c = iArr;
            this.f23278d = j1VarArr;
            this.f23279e = iArr2;
        }

        @Override // com.facebook.react.uimanager.h1.r
        public void execute() throws Throwable {
            h1.this.f23216b.manageChildren(this.f23305a, this.f23277c, this.f23278d, this.f23279e);
        }
    }

    private final class l implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callback f23282b;

        @Override // com.facebook.react.uimanager.h1.r
        public void execute() {
            try {
                h1.this.f23216b.measureInWindow(this.f23281a, h1.this.f23215a);
                this.f23282b.invoke(Float.valueOf(w.f(h1.this.f23215a[0])), Float.valueOf(w.f(h1.this.f23215a[1])), Float.valueOf(w.f(h1.this.f23215a[2])), Float.valueOf(w.f(h1.this.f23215a[3])));
            } catch (NoSuchNativeViewException unused) {
                this.f23282b.invoke(new Object[0]);
            }
        }

        private l(int i11, Callback callback) {
            this.f23281a = i11;
            this.f23282b = callback;
        }
    }

    private final class m implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callback f23285b;

        @Override // com.facebook.react.uimanager.h1.r
        public void execute() {
            try {
                h1.this.f23216b.measure(this.f23284a, h1.this.f23215a);
                this.f23285b.invoke(0, 0, Float.valueOf(w.f(h1.this.f23215a[2])), Float.valueOf(w.f(h1.this.f23215a[3])), Float.valueOf(w.f(h1.this.f23215a[0])), Float.valueOf(w.f(h1.this.f23215a[1])));
            } catch (NoSuchNativeViewException unused) {
                this.f23285b.invoke(new Object[0]);
            }
        }

        private m(int i11, Callback callback) {
            this.f23284a = i11;
            this.f23285b = callback;
        }
    }

    private final class n extends v {
        public n(int i11) {
            super(i11);
        }

        @Override // com.facebook.react.uimanager.h1.r
        public void execute() {
            h1.this.f23216b.removeRootView(this.f23305a);
        }
    }

    private final class o extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23288c;

        @Override // com.facebook.react.uimanager.h1.r
        public void execute() {
            try {
                h1.this.f23216b.sendAccessibilityEvent(this.f23305a, this.f23288c);
            } catch (RetryableMountingLayerException e11) {
                ReactSoftExceptionLogger.logSoftException(h1.A, e11);
            }
        }

        private o(int i11, int i12) {
            super(i11);
            this.f23288c = i12;
        }
    }

    private class p implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f23290a;

        @Override // com.facebook.react.uimanager.h1.r
        public void execute() {
            h1.this.f23216b.setLayoutAnimationEnabled(this.f23290a);
        }

        private p(boolean z11) {
            this.f23290a = z11;
        }
    }

    private class q implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z0 f23292a;

        public q(z0 z0Var) {
            this.f23292a = z0Var;
        }

        @Override // com.facebook.react.uimanager.h1.r
        public void execute() {
            this.f23292a.execute(h1.this.f23216b);
        }
    }

    public interface r {
        void execute();
    }

    private final class s extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f23295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f23296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f23297f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f23298g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final com.facebook.yoga.h f23299h;

        public s(int i11, int i12, int i13, int i14, int i15, int i16, com.facebook.yoga.h hVar) {
            super(i12);
            this.f23294c = i11;
            this.f23295d = i13;
            this.f23296e = i14;
            this.f23297f = i15;
            this.f23298g = i16;
            this.f23299h = hVar;
            ep.a.l(0L, "updateLayout", this.f23305a);
        }

        @Override // com.facebook.react.uimanager.h1.r
        public void execute() throws Throwable {
            ep.a.f(0L, "updateLayout", this.f23305a);
            h1.this.f23216b.updateLayout(this.f23294c, this.f23305a, this.f23295d, this.f23296e, this.f23297f, this.f23298g, this.f23299h);
        }
    }

    private final class t extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final k0 f23301c;

        @Override // com.facebook.react.uimanager.h1.r
        public void execute() {
            h1.this.f23216b.updateProperties(this.f23305a, this.f23301c);
        }

        private t(int i11, k0 k0Var) {
            super(i11);
            this.f23301c = k0Var;
        }
    }

    private final class u extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f23303c;

        public u(int i11, Object obj) {
            super(i11);
            this.f23303c = obj;
        }

        @Override // com.facebook.react.uimanager.h1.r
        public void execute() {
            h1.this.f23216b.updateViewExtraData(this.f23305a, this.f23303c);
        }
    }

    private abstract class v implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23305a;

        public v(int i11) {
            this.f23305a = i11;
        }
    }

    public h1(ReactApplicationContext reactApplicationContext, com.facebook.react.uimanager.t tVar, int i11) {
        this.f23216b = tVar;
        this.f23219e = new i(reactApplicationContext, i11 == -1 ? 8 : i11);
        this.f23220f = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        if (this.f23227m) {
            qk.a.I("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.f23217c) {
            if (this.f23223i.isEmpty()) {
                return;
            }
            ArrayList<Runnable> arrayList = this.f23223i;
            this.f23223i = new ArrayList<>();
            long jUptimeMillis = SystemClock.uptimeMillis();
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            if (this.f23228n) {
                this.f23236v = SystemClock.uptimeMillis() - jUptimeMillis;
                this.f23237w = this.f23229o;
                this.f23228n = false;
                ep.a.b(0L, "batchedExecutionTime", 0, jUptimeMillis * 1000000);
                ep.a.g(0L, "batchedExecutionTime", 0);
            }
            this.f23229o = 0L;
        }
    }

    public void A() {
        this.f23222h.add(new c(0, 0, true, false));
    }

    public void B(ReadableMap readableMap, Callback callback) {
        this.f23222h.add(new d(readableMap, callback));
    }

    public void C(v0 v0Var, int i11, String str, k0 k0Var) {
        synchronized (this.f23218d) {
            this.f23239y++;
            this.f23224j.addLast(new e(v0Var, i11, str, k0Var));
        }
    }

    @Deprecated
    public void D(int i11, int i12, ReadableArray readableArray) {
        this.f23221g.add(new f(i11, i12, readableArray));
    }

    public void E(int i11, String str, ReadableArray readableArray) {
        this.f23221g.add(new h(i11, str, readableArray));
    }

    public void F(int i11, float f11, float f12, Callback callback) {
        this.f23222h.add(new j(i11, f11, f12, callback));
    }

    public void G(int i11, int[] iArr, j1[] j1VarArr, int[] iArr2) {
        this.f23222h.add(new k(i11, iArr, j1VarArr, iArr2));
    }

    public void H(int i11, Callback callback) {
        this.f23222h.add(new m(i11, callback));
    }

    public void I(int i11, Callback callback) {
        this.f23222h.add(new l(i11, callback));
    }

    public void J(int i11) {
        this.f23222h.add(new n(i11));
    }

    public void K(int i11, int i12) {
        this.f23222h.add(new o(i11, i12));
    }

    public void L(int i11, int i12, boolean z11) {
        this.f23222h.add(new c(i11, i12, false, z11));
    }

    public void M(boolean z11) {
        this.f23222h.add(new p(z11));
    }

    public void N(z0 z0Var) {
        this.f23222h.add(new q(z0Var));
    }

    public void O(int i11, Object obj) {
        this.f23222h.add(new u(i11, obj));
    }

    public void P(int i11, int i12, int i13, int i14, int i15, int i16, com.facebook.yoga.h hVar) {
        this.f23222h.add(new s(i11, i12, i13, i14, i15, i16, hVar));
    }

    public void Q(int i11, String str, k0 k0Var) {
        this.f23240z++;
        this.f23222h.add(new t(i11, k0Var));
    }

    com.facebook.react.uimanager.t S() {
        return this.f23216b;
    }

    public Map<String, Long> T() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.f23230p));
        map.put("CommitEndTime", Long.valueOf(this.f23231q));
        map.put("LayoutTime", Long.valueOf(this.f23232r));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.f23233s));
        map.put("RunStartTime", Long.valueOf(this.f23234t));
        map.put("RunEndTime", Long.valueOf(this.f23235u));
        map.put("BatchedExecutionTime", Long.valueOf(this.f23236v));
        map.put("NonBatchedExecutionTime", Long.valueOf(this.f23237w));
        map.put("NativeModulesThreadCpuTime", Long.valueOf(this.f23238x));
        map.put("CreateViewCount", Long.valueOf(this.f23239y));
        map.put("UpdatePropsCount", Long.valueOf(this.f23240z));
        return map;
    }

    public boolean U() {
        return this.f23222h.isEmpty() && this.f23221g.isEmpty();
    }

    void V() {
        this.f23226l = false;
        com.facebook.react.modules.core.b.h().n(com.facebook.react.modules.core.b.a.DISPATCH_UI, this.f23219e);
        R();
    }

    public void W(z0 z0Var) {
        this.f23222h.add(0, new q(z0Var));
    }

    public void X() {
        this.f23228n = true;
        this.f23230p = 0L;
        this.f23239y = 0L;
        this.f23240z = 0L;
    }

    void Y() {
        this.f23226l = true;
        com.facebook.react.modules.core.b.h().k(com.facebook.react.modules.core.b.a.DISPATCH_UI, this.f23219e);
    }

    public void Z(po.a aVar) {
        this.f23225k = aVar;
    }

    public void y(int i11, View view) {
        this.f23216b.addRootView(i11, view);
    }

    public void z(int i11, long j11, long j12) {
        ArrayList<g> arrayList;
        ArrayList<r> arrayList2;
        ep.b.a(0L, "UIViewOperationQueue.dispatchViewUpdates").a("batchId", i11).c();
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            ArrayDeque<r> arrayDeque = null;
            if (this.f23221g.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = this.f23221g;
                this.f23221g = new ArrayList<>();
            }
            if (this.f23222h.isEmpty()) {
                arrayList2 = null;
            } else {
                ArrayList<r> arrayList3 = this.f23222h;
                this.f23222h = new ArrayList<>();
                arrayList2 = arrayList3;
            }
            synchronized (this.f23218d) {
                try {
                    if (!this.f23224j.isEmpty()) {
                        arrayDeque = this.f23224j;
                        this.f23224j = new ArrayDeque<>();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            po.a aVar = this.f23225k;
            if (aVar != null) {
                aVar.b();
            }
            a aVar2 = new a(i11, arrayList, arrayDeque, arrayList2, j11, j12, jUptimeMillis, jCurrentThreadTimeMillis);
            ep.b.a(0L, "acquiring mDispatchRunnablesLock").a("batchId", i11).c();
            synchronized (this.f23217c) {
                ep.a.i(0L);
                this.f23223i.add(aVar2);
            }
            if (!this.f23226l) {
                UiThreadUtil.runOnUiThread(new b(this.f23220f));
            }
            ep.a.i(0L);
        } catch (Throwable th3) {
            ep.a.i(0L);
            throw th3;
        }
    }
}
