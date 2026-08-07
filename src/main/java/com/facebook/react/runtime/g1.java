package com.facebook.react.runtime;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class g1 implements rn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<h1> f23008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<ReactHostImpl> f23009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rn.b f23010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f23011d;

    public g1(Context context, String str, Bundle bundle) {
        this(new SurfaceHandlerBinding(str), context);
        this.f23010c.setProps(bundle == null ? new WritableNativeMap() : (NativeMap) Arguments.fromBundle(bundle));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f23010c.setLayoutConstraints(View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE), 0, 0, f(context), o(context), j(context));
    }

    public static g1 e(Context context, String str, Bundle bundle) {
        g1 g1Var = new g1(context, str, bundle);
        g1Var.c(new h1(context, g1Var));
        return g1Var;
    }

    private static boolean f(Context context) {
        return com.facebook.react.modules.i18nmanager.a.f().d(context);
    }

    private static float j(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    private static boolean o(Context context) {
        return com.facebook.react.modules.i18nmanager.a.f().i(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        h1 h1Var = (h1) getView();
        if (h1Var != null) {
            h1Var.removeAllViews();
            h1Var.setId(-1);
        }
    }

    public void b(com.facebook.react.a0 a0Var) {
        boolean z11 = a0Var instanceof ReactHostImpl;
        if (z11 && !androidx.camera.view.i.a(this.f23009b, null, (ReactHostImpl) a0Var)) {
            throw new IllegalStateException("This surface is already attached to a host!");
        }
        if (!z11) {
            throw new IllegalArgumentException("ReactSurfaceImpl.attach can only attach to ReactHostImpl.");
        }
    }

    public void c(h1 h1Var) {
        if (!androidx.camera.view.i.a(this.f23008a, null, h1Var)) {
            throw new IllegalStateException("Trying to call ReactSurface.attachView(), but the view is already attached.");
        }
        this.f23011d = h1Var.getContext();
    }

    public void d() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.runtime.f1
            @Override // java.lang.Runnable
            public final void run() {
                this.f23004a.q();
            }
        });
    }

    public Context g() {
        return this.f23011d;
    }

    @Override // rn.a
    public ViewGroup getView() {
        return this.f23008a.get();
    }

    EventDispatcher h() {
        ReactHostImpl reactHostImpl = this.f23009b.get();
        if (reactHostImpl == null) {
            return null;
        }
        return reactHostImpl.m0();
    }

    public String i() {
        return this.f23010c.getModuleName();
    }

    ReactHostImpl k() {
        return this.f23009b.get();
    }

    rn.b l() {
        return this.f23010c;
    }

    public int m() {
        return this.f23010c.getSurfaceId();
    }

    boolean n() {
        return this.f23009b.get() != null;
    }

    public boolean p() {
        return this.f23010c.isRunning();
    }

    synchronized void r(int i11, int i12, int i13, int i14) {
        this.f23010c.setLayoutConstraints(i11, i12, i13, i14, f(this.f23011d), o(this.f23011d), j(this.f23011d));
    }

    @Override // rn.a
    public qn.a<Void> start() {
        if (this.f23008a.get() == null) {
            return ko.c.l(new IllegalStateException("Trying to call ReactSurface.start(), but view is not created."));
        }
        ReactHostImpl reactHostImpl = this.f23009b.get();
        return reactHostImpl == null ? ko.c.l(new IllegalStateException("Trying to call ReactSurface.start(), but no ReactHost is attached.")) : reactHostImpl.C1(this);
    }

    @Override // rn.a
    public qn.a<Void> stop() {
        ReactHostImpl reactHostImpl = this.f23009b.get();
        return reactHostImpl == null ? ko.c.l(new IllegalStateException("Trying to call ReactSurface.stop(), but no ReactHost is attached.")) : reactHostImpl.E1(this);
    }

    g1(rn.b bVar, Context context) {
        this.f23008a = new AtomicReference<>(null);
        this.f23009b = new AtomicReference<>(null);
        this.f23010c = bVar;
        this.f23011d = context;
    }
}
