package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Object f23116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final EventDispatcher f23117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ReactApplicationContext f23118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final s0 f23119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p1 f23120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h1 f23121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u f23122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f23123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f23124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f23125j;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i0 f23126a;

        a(i0 i0Var) {
            this.f23126a = i0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            a1.this.f23119d.b(this.f23126a);
        }
    }

    a1(ReactApplicationContext reactApplicationContext, p1 p1Var, EventDispatcher eventDispatcher, int i11) {
        this(reactApplicationContext, p1Var, new h1(reactApplicationContext, new t(p1Var), i11), eventDispatcher);
    }

    private void A(i0 i0Var) {
        if (i0Var.hasUpdates()) {
            for (int i11 = 0; i11 < i0Var.getChildCount(); i11++) {
                A(i0Var.getChildAt(i11));
            }
            i0Var.onBeforeLayout(this.f23122g);
        }
    }

    private void L(i0 i0Var) {
        u.j(i0Var);
        this.f23119d.g(i0Var.getReactTag());
        for (int childCount = i0Var.getChildCount() - 1; childCount >= 0; childCount--) {
            L(i0Var.getChildAt(childCount));
        }
        i0Var.removeAndDisposeAllChildren();
    }

    private void c(i0 i0Var) {
        NativeModule nativeModule = (ViewManager) gn.a.c(this.f23120e.c(i0Var.getViewClass()));
        if (!(nativeModule instanceof i)) {
            throw new IllegalViewOperationException("Trying to use view " + i0Var.getViewClass() + " as a parent, but its Manager doesn't extends ViewGroupManager");
        }
        i iVar = (i) nativeModule;
        if (iVar == null || !iVar.needsCustomLayoutForChildren()) {
            return;
        }
        throw new IllegalViewOperationException("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + i0Var.getViewClass() + "). Use measure instead.");
    }

    private boolean e(int i11, String str) {
        if (this.f23119d.c(i11) != null) {
            return true;
        }
        String str2 = "Unable to execute operation " + str + " on view with tag: " + i11 + ", since the view does not exist";
        if (ln.a.DEBUG) {
            throw new IllegalViewOperationException(str2);
        }
        qk.a.I("ReactNative", str2);
        return false;
    }

    private void n() {
        if (this.f23121f.U()) {
            m(-1);
        }
    }

    private void y(int i11, int i12, int[] iArr) {
        i0 i0VarC = this.f23119d.c(i11);
        i0 i0VarC2 = this.f23119d.c(i12);
        if (i0VarC == null || i0VarC2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Tag ");
            if (i0VarC != null) {
                i11 = i12;
            }
            sb2.append(i11);
            sb2.append(" does not exist");
            throw new IllegalViewOperationException(sb2.toString());
        }
        if (i0VarC != i0VarC2) {
            for (i0 parent = i0VarC.getParent(); parent != i0VarC2; parent = parent.getParent()) {
                if (parent == null) {
                    throw new IllegalViewOperationException("Tag " + i12 + " is not an ancestor of tag " + i11);
                }
            }
        }
        z(i0VarC, i0VarC2, iArr);
    }

    private void z(i0 i0Var, i0 i0Var2, int[] iArr) {
        int iRound;
        int iRound2;
        if (i0Var == i0Var2 || i0Var.isVirtual()) {
            iRound = 0;
            iRound2 = 0;
        } else {
            iRound = Math.round(i0Var.getLayoutX());
            iRound2 = Math.round(i0Var.getLayoutY());
            for (i0 parent = i0Var.getParent(); parent != i0Var2; parent = parent.getParent()) {
                gn.a.c(parent);
                c(parent);
                iRound += Math.round(parent.getLayoutX());
                iRound2 += Math.round(parent.getLayoutY());
            }
            c(i0Var2);
        }
        iArr[0] = iRound;
        iArr[1] = iRound2;
        iArr[2] = i0Var.getScreenWidth();
        iArr[3] = i0Var.getScreenHeight();
    }

    public void B() {
        this.f23125j = false;
        this.f23120e.f();
    }

    public void C() {
    }

    public void D() {
        this.f23121f.V();
    }

    public void E() {
        this.f23121f.Y();
    }

    public void F(z0 z0Var) {
        this.f23121f.W(z0Var);
    }

    public void G() {
        this.f23121f.X();
    }

    public <T extends View> void H(T t11, int i11, v0 v0Var) {
        synchronized (this.f23116a) {
            i0 i0VarH = h();
            i0VarH.setReactTag(i11);
            i0VarH.setThemedContext(v0Var);
            v0Var.runOnNativeModulesQueueThread(new a(i0VarH));
            this.f23121f.y(i11, t11);
        }
    }

    public void I(int i11) {
        synchronized (this.f23116a) {
            this.f23119d.h(i11);
        }
    }

    public void J(int i11) {
        I(i11);
        this.f23121f.J(i11);
    }

    protected final void K(i0 i0Var) {
        L(i0Var);
        i0Var.dispose();
    }

    public int M(int i11) {
        if (this.f23119d.f(i11)) {
            return i11;
        }
        i0 i0VarN = N(i11);
        if (i0VarN != null) {
            return i0VarN.getRootTag();
        }
        qk.a.I("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i11);
        return 0;
    }

    public final i0 N(int i11) {
        return this.f23119d.c(i11);
    }

    protected final ViewManager O(String str) {
        return this.f23120e.e(str);
    }

    public void P(int i11, int i12) {
        this.f23121f.K(i11, i12);
    }

    public void Q(int i11, ReadableArray readableArray) {
        if (this.f23125j) {
            synchronized (this.f23116a) {
                try {
                    i0 i0VarC = this.f23119d.c(i11);
                    for (int i12 = 0; i12 < readableArray.size(); i12++) {
                        i0 i0VarC2 = this.f23119d.c(readableArray.getInt(i12));
                        if (i0VarC2 == null) {
                            throw new IllegalViewOperationException("Trying to add unknown view tag: " + readableArray.getInt(i12));
                        }
                        i0VarC.addChildAt(i0VarC2, i12);
                    }
                    this.f23122g.k(i0VarC, readableArray);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void R(int i11, boolean z11) {
        i0 i0VarC = this.f23119d.c(i11);
        if (i0VarC == null) {
            return;
        }
        while (i0VarC.getNativeKind() == s.NONE) {
            i0VarC = i0VarC.getParent();
        }
        this.f23121f.L(i0VarC.getReactTag(), i11, z11);
    }

    public void S(boolean z11) {
        this.f23121f.M(z11);
    }

    public void T(po.a aVar) {
        this.f23121f.Z(aVar);
    }

    public void U(int i11, Object obj) {
        i0 i0VarC = this.f23119d.c(i11);
        if (i0VarC != null) {
            i0VarC.setLocalData(obj);
            n();
        } else {
            qk.a.I("ReactNative", "Attempt to set local data for view with unknown tag: " + i11);
        }
    }

    public void V(int i11, k0 k0Var) {
        UiThreadUtil.assertOnUiThread();
        this.f23121f.S().updateProperties(i11, k0Var);
    }

    public void W(int i11, int i12, int i13, int i14, int i15) {
        i0 i0VarC = this.f23119d.c(i11);
        if (i0VarC == null) {
            qk.a.I("ReactNative", "Tried to update size of non-existent tag: " + i11);
            return;
        }
        i0VarC.setPadding(4, i13);
        i0VarC.setPadding(1, i12);
        i0VarC.setPadding(5, i15);
        i0VarC.setPadding(3, i14);
        n();
    }

    public void X(int i11, int i12, int i13) {
        i0 i0VarC = this.f23119d.c(i11);
        if (i0VarC != null) {
            i0VarC.setStyleWidth(i12);
            i0VarC.setStyleHeight(i13);
            n();
        } else {
            qk.a.I("ReactNative", "Tried to update size of non-existent tag: " + i11);
        }
    }

    public void Y(int i11, int i12, int i13) {
        i0 i0VarC = this.f23119d.c(i11);
        if (i0VarC != null) {
            Z(i0VarC, i12, i13);
            return;
        }
        qk.a.I("ReactNative", "Tried to update non-existent root tag: " + i11);
    }

    public void Z(i0 i0Var, int i11, int i12) {
        i0Var.setMeasureSpecs(i11, i12);
    }

    public void a(z0 z0Var) {
        this.f23121f.N(z0Var);
    }

    public void a0(int i11, String str, ReadableMap readableMap) {
        if (this.f23125j) {
            if (this.f23120e.c(str) == null) {
                throw new IllegalViewOperationException("Got unknown view type: " + str);
            }
            i0 i0VarC = this.f23119d.c(i11);
            if (i0VarC == null) {
                throw new IllegalViewOperationException("Trying to update non-existent view with tag " + i11);
            }
            if (readableMap != null) {
                k0 k0Var = new k0(readableMap);
                i0VarC.updateProperties(k0Var);
                t(i0VarC, str, k0Var);
            }
        }
    }

    protected void b(i0 i0Var, float f11, float f12, List<i0> list) {
        if (i0Var.hasUpdates()) {
            if (i0Var.dispatchUpdatesWillChangeLayout(f11, f12) && i0Var.shouldNotifyOnLayout() && !this.f23119d.f(i0Var.getReactTag())) {
                list.add(i0Var);
            }
            Iterable<? extends i0> iterableCalculateLayoutOnChildren = i0Var.calculateLayoutOnChildren();
            if (iterableCalculateLayoutOnChildren != null) {
                Iterator<? extends i0> it = iterableCalculateLayoutOnChildren.iterator();
                while (it.hasNext()) {
                    b(it.next(), i0Var.getLayoutX() + f11, i0Var.getLayoutY() + f12, list);
                }
            }
            i0Var.dispatchUpdates(f11, f12, this.f23121f, this.f23122g);
            i0Var.markUpdateSeen();
            this.f23122g.p(i0Var);
        }
    }

    protected void b0() {
        ep.a.c(0L, "UIImplementation.updateViewHierarchy");
        for (int i11 = 0; i11 < this.f23119d.d(); i11++) {
            try {
                i0 i0VarC = this.f23119d.c(this.f23119d.e(i11));
                if (i0VarC.getWidthMeasureSpec() != null && i0VarC.getHeightMeasureSpec() != null) {
                    ep.b.a(0L, "UIImplementation.notifyOnBeforeLayoutRecursive").a("rootTag", i0VarC.getReactTag()).c();
                    try {
                        A(i0VarC);
                        ep.a.i(0L);
                        d(i0VarC);
                        ep.b.a(0L, "UIImplementation.applyUpdatesRecursive").a("rootTag", i0VarC.getReactTag()).c();
                        try {
                            ArrayList arrayList = new ArrayList();
                            b(i0VarC, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, arrayList);
                            for (i0 i0Var : arrayList) {
                                this.f23117b.h(v.b(-1, i0Var.getReactTag(), i0Var.getScreenX(), i0Var.getScreenY(), i0Var.getScreenWidth(), i0Var.getScreenHeight()));
                            }
                            ep.a.i(0L);
                        } catch (Throwable th2) {
                            ep.a.i(0L);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        ep.a.i(0L);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                ep.a.i(0L);
                throw th4;
            }
        }
        ep.a.i(0L);
    }

    @Deprecated
    public void c0(int i11, int i12, Callback callback) {
        i0 i0VarC = this.f23119d.c(i11);
        i0 i0VarC2 = this.f23119d.c(i12);
        if (i0VarC == null || i0VarC2 == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.valueOf(i0VarC.isDescendantOf(i0VarC2)));
        }
    }

    protected void d(i0 i0Var) {
        ep.b.a(0L, "cssRoot.calculateLayout").a("rootTag", i0Var.getReactTag()).c();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            int iIntValue = i0Var.getWidthMeasureSpec().intValue();
            int iIntValue2 = i0Var.getHeightMeasureSpec().intValue();
            float size = Float.NaN;
            float size2 = View.MeasureSpec.getMode(iIntValue) == 0 ? Float.NaN : View.MeasureSpec.getSize(iIntValue);
            if (View.MeasureSpec.getMode(iIntValue2) != 0) {
                size = View.MeasureSpec.getSize(iIntValue2);
            }
            i0Var.calculateLayout(size2, size);
        } finally {
            ep.a.i(0L);
            this.f23124i = SystemClock.uptimeMillis() - jUptimeMillis;
        }
    }

    public void f() {
        this.f23121f.A();
    }

    public void g(ReadableMap readableMap, Callback callback) {
        this.f23121f.B(readableMap, callback);
    }

    protected i0 h() {
        j0 j0Var = new j0();
        if (com.facebook.react.modules.i18nmanager.a.f().i(this.f23118c)) {
            j0Var.setLayoutDirection(com.facebook.yoga.h.RTL);
        }
        j0Var.setViewClassName("Root");
        return j0Var;
    }

    protected i0 i(String str) {
        return this.f23120e.c(str).createShadowNodeInstance(this.f23118c);
    }

    public void j(int i11, String str, int i12, ReadableMap readableMap) {
        k0 k0Var;
        if (this.f23125j) {
            synchronized (this.f23116a) {
                try {
                    i0 i0VarI = i(str);
                    i0 i0VarC = this.f23119d.c(i12);
                    gn.a.d(i0VarC, "Root node with tag " + i12 + " doesn't exist");
                    i0VarI.setReactTag(i11);
                    i0VarI.setViewClassName(str);
                    i0VarI.setRootTag(i0VarC.getReactTag());
                    i0VarI.setThemedContext(i0VarC.getThemedContext());
                    this.f23119d.a(i0VarI);
                    if (readableMap != null) {
                        k0Var = new k0(readableMap);
                        i0VarI.updateProperties(k0Var);
                    } else {
                        k0Var = null;
                    }
                    s(i0VarI, i12, k0Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Deprecated
    public void k(int i11, int i12, ReadableArray readableArray) {
        if (e(i11, "dispatchViewManagerCommand: " + i12)) {
            this.f23121f.D(i11, i12, readableArray);
        }
    }

    public void l(int i11, String str, ReadableArray readableArray) {
        if (e(i11, "dispatchViewManagerCommand: " + str)) {
            this.f23121f.E(i11, str, readableArray);
        }
    }

    public void m(int i11) {
        ep.b.a(0L, "UIImplementation.dispatchViewUpdates").a("batchId", i11).c();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            b0();
            this.f23122g.o();
            this.f23121f.z(i11, jUptimeMillis, this.f23124i);
        } finally {
            ep.a.i(0L);
        }
    }

    public void o(int i11, float f11, float f12, Callback callback) {
        this.f23121f.F(i11, f11, f12, callback);
    }

    public Map<String, Long> p() {
        return this.f23121f.T();
    }

    public int q() {
        return this.f23121f.S().getRootViewNum();
    }

    h1 r() {
        return this.f23121f;
    }

    protected void s(i0 i0Var, int i11, k0 k0Var) {
        if (i0Var.isVirtual()) {
            return;
        }
        this.f23122g.g(i0Var, i0Var.getThemedContext(), k0Var);
    }

    protected void t(i0 i0Var, String str, k0 k0Var) {
        if (i0Var.isVirtual()) {
            return;
        }
        this.f23122g.m(i0Var, str, k0Var);
    }

    public void u(int i11, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        ReadableArray readableArray6 = readableArray;
        if (this.f23125j) {
            synchronized (this.f23116a) {
                try {
                    i0 i0VarC = this.f23119d.c(i11);
                    int size = readableArray6 == null ? 0 : readableArray6.size();
                    int size2 = readableArray3 == null ? 0 : readableArray3.size();
                    int size3 = readableArray5 == null ? 0 : readableArray5.size();
                    if (size != 0 && (readableArray2 == null || size != readableArray2.size())) {
                        throw new IllegalViewOperationException("Size of moveFrom != size of moveTo!");
                    }
                    if (size2 != 0 && (readableArray4 == null || size2 != readableArray4.size())) {
                        throw new IllegalViewOperationException("Size of addChildTags != size of addAtIndices!");
                    }
                    int i12 = size + size2;
                    j1[] j1VarArr = new j1[i12];
                    int i13 = size + size3;
                    int[] iArr = new int[i13];
                    int[] iArr2 = new int[i13];
                    int[] iArr3 = new int[size3];
                    if (size > 0) {
                        gn.a.c(readableArray6);
                        gn.a.c(readableArray2);
                        int i14 = 0;
                        while (i14 < size) {
                            int i15 = size;
                            int i16 = readableArray6.getInt(i14);
                            int reactTag = i0VarC.getChildAt(i16).getReactTag();
                            j1VarArr[i14] = new j1(reactTag, readableArray2.getInt(i14));
                            iArr[i14] = i16;
                            iArr2[i14] = reactTag;
                            i14++;
                            readableArray6 = readableArray;
                            size = i15;
                            i13 = i13;
                        }
                    }
                    int i17 = size;
                    int i18 = i13;
                    if (size2 > 0) {
                        gn.a.c(readableArray3);
                        gn.a.c(readableArray4);
                        for (int i19 = 0; i19 < size2; i19++) {
                            j1VarArr[i17 + i19] = new j1(readableArray3.getInt(i19), readableArray4.getInt(i19));
                        }
                    }
                    if (size3 > 0) {
                        gn.a.c(readableArray5);
                        for (int i21 = 0; i21 < size3; i21++) {
                            int i22 = readableArray5.getInt(i21);
                            int reactTag2 = i0VarC.getChildAt(i22).getReactTag();
                            int i23 = i17 + i21;
                            iArr[i23] = i22;
                            iArr2[i23] = reactTag2;
                            iArr3[i21] = reactTag2;
                        }
                    }
                    Arrays.sort(j1VarArr, j1.f23317c);
                    Arrays.sort(iArr);
                    int i24 = -1;
                    for (int i25 = i18 - 1; i25 >= 0; i25--) {
                        int i26 = iArr[i25];
                        if (i26 == i24) {
                            throw new IllegalViewOperationException("Repeated indices in Removal list for view tag: " + i11);
                        }
                        i0VarC.removeChildAt(i26);
                        i24 = iArr[i25];
                    }
                    for (int i27 = 0; i27 < i12; i27++) {
                        j1 j1Var = j1VarArr[i27];
                        i0 i0VarC2 = this.f23119d.c(j1Var.f23318a);
                        if (i0VarC2 == null) {
                            throw new IllegalViewOperationException("Trying to add unknown view tag: " + j1Var.f23318a);
                        }
                        i0VarC.addChildAt(i0VarC2, j1Var.f23319b);
                    }
                    this.f23122g.i(i0VarC, iArr, iArr2, j1VarArr, iArr3);
                    for (int i28 = 0; i28 < size3; i28++) {
                        K(this.f23119d.c(iArr3[i28]));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void v(int i11, Callback callback) {
        if (this.f23125j) {
            this.f23121f.H(i11, callback);
        }
    }

    public void w(int i11, Callback callback) {
        if (this.f23125j) {
            this.f23121f.I(i11, callback);
        }
    }

    public void x(int i11, int i12, Callback callback, Callback callback2) {
        if (this.f23125j) {
            try {
                y(i11, i12, this.f23123h);
                callback2.invoke(Float.valueOf(w.f(this.f23123h[0])), Float.valueOf(w.f(this.f23123h[1])), Float.valueOf(w.f(this.f23123h[2])), Float.valueOf(w.f(this.f23123h[3])));
            } catch (IllegalViewOperationException e11) {
                callback.invoke(e11.getMessage());
            }
        }
    }

    protected a1(ReactApplicationContext reactApplicationContext, p1 p1Var, h1 h1Var, EventDispatcher eventDispatcher) {
        this.f23116a = new Object();
        s0 s0Var = new s0();
        this.f23119d = s0Var;
        this.f23123h = new int[4];
        this.f23124i = 0L;
        this.f23125j = true;
        this.f23118c = reactApplicationContext;
        this.f23120e = p1Var;
        this.f23121f = h1Var;
        this.f23122g = new u(h1Var, s0Var);
        this.f23117b = eventDispatcher;
    }
}
