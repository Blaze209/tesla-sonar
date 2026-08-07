package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.h1;
import androidx.collection.x0;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.webrtc.MediaStreamTrack;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
class e extends AppCompatDelegate implements androidx.appcompat.view.menu.e.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final x0<String, Integer> f2038b0 = new x0<>();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final boolean f2039c0 = false;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int[] f2040d0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final boolean f2041e0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final boolean f2042f0 = true;
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    private boolean F;
    private s[] G;
    private s H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    boolean M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private o R;
    private o S;
    boolean T;
    int U;
    private final Runnable V;
    private boolean W;
    private Rect X;
    private Rect Y;
    private androidx.appcompat.app.j Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private androidx.appcompat.app.k f2043a0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f2044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Context f2045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Window f2046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private m f2047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final androidx.appcompat.app.d f2048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ActionBar f2049i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    MenuInflater f2050j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f2051k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d0 f2052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g f2053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private t f2054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ActionMode f2055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ActionBarContextView f2056p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    PopupWindow f2057q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Runnable f2058r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ViewPropertyAnimatorCompat f2059s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f2060t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f2061u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ViewGroup f2062v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private TextView f2063w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View f2064x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f2065y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f2066z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if ((eVar.U & 1) != 0) {
                eVar.Z(0);
            }
            e eVar2 = e.this;
            if ((eVar2.U & 4096) != 0) {
                eVar2.Z(108);
            }
            e eVar3 = e.this;
            eVar3.T = false;
            eVar3.U = 0;
        }
    }

    class b implements a0 {
        b() {
        }

        @Override // androidx.core.view.a0
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            int iM = windowInsetsCompat.m();
            int iP0 = e.this.P0(windowInsetsCompat, null);
            if (iM != iP0) {
                windowInsetsCompat = windowInsetsCompat.r(windowInsetsCompat.k(), iP0, windowInsetsCompat.l(), windowInsetsCompat.j());
            }
            return ViewCompat.b0(view, windowInsetsCompat);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            e.this.X();
        }
    }

    class d implements Runnable {

        class a extends androidx.core.view.x0 {
            a() {
            }

            @Override // androidx.core.view.w0
            public void b(View view) {
                e.this.f2056p.setAlpha(1.0f);
                e.this.f2059s.g(null);
                e.this.f2059s = null;
            }

            @Override // androidx.core.view.x0, androidx.core.view.w0
            public void c(View view) {
                e.this.f2056p.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f2057q.showAtLocation(eVar.f2056p, 55, 0, 0);
            e.this.a0();
            if (!e.this.I0()) {
                e.this.f2056p.setAlpha(1.0f);
                e.this.f2056p.setVisibility(0);
            } else {
                e.this.f2056p.setAlpha(BitmapDescriptorFactory.HUE_RED);
                e eVar2 = e.this;
                eVar2.f2059s = ViewCompat.e(eVar2.f2056p).b(1.0f);
                e.this.f2059s.g(new a());
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.e$e, reason: collision with other inner class name */
    class C0060e extends androidx.core.view.x0 {
        C0060e() {
        }

        @Override // androidx.core.view.w0
        public void b(View view) {
            e.this.f2056p.setAlpha(1.0f);
            e.this.f2059s.g(null);
            e.this.f2059s = null;
        }

        @Override // androidx.core.view.x0, androidx.core.view.w0
        public void c(View view) {
            e.this.f2056p.setVisibility(0);
            e.this.f2056p.sendAccessibilityEvent(32);
            if (e.this.f2056p.getParent() instanceof View) {
                ViewCompat.m0((View) e.this.f2056p.getParent());
            }
        }
    }

    private class f implements androidx.appcompat.app.a {
        f() {
        }
    }

    private final class g implements androidx.appcompat.view.menu.j.a {
        g() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar, boolean z11) {
            e.this.Q(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(@NonNull androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackK0 = e.this.k0();
            if (callbackK0 == null) {
                return true;
            }
            callbackK0.onMenuOpened(108, eVar);
            return true;
        }
    }

    class h implements ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ActionMode.Callback f2075a;

        class a extends androidx.core.view.x0 {
            a() {
            }

            @Override // androidx.core.view.w0
            public void b(View view) {
                e.this.f2056p.setVisibility(8);
                e eVar = e.this;
                PopupWindow popupWindow = eVar.f2057q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (eVar.f2056p.getParent() instanceof View) {
                    ViewCompat.m0((View) e.this.f2056p.getParent());
                }
                e.this.f2056p.k();
                e.this.f2059s.g(null);
                e eVar2 = e.this;
                eVar2.f2059s = null;
                ViewCompat.m0(eVar2.f2062v);
            }
        }

        public h(ActionMode.Callback callback) {
            this.f2075a = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean a(ActionMode actionMode, Menu menu) {
            return this.f2075a.a(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean b(ActionMode actionMode, MenuItem menuItem) {
            return this.f2075a.b(actionMode, menuItem);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean c(ActionMode actionMode, Menu menu) {
            ViewCompat.m0(e.this.f2062v);
            return this.f2075a.c(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void d(ActionMode actionMode) {
            this.f2075a.d(actionMode);
            e eVar = e.this;
            if (eVar.f2057q != null) {
                eVar.f2046f.getDecorView().removeCallbacks(e.this.f2058r);
            }
            e eVar2 = e.this;
            if (eVar2.f2056p != null) {
                eVar2.a0();
                e eVar3 = e.this;
                eVar3.f2059s = ViewCompat.e(eVar3.f2056p).b(BitmapDescriptorFactory.HUE_RED);
                e.this.f2059s.g(new a());
            }
            e eVar4 = e.this;
            androidx.appcompat.app.d dVar = eVar4.f2048h;
            if (dVar != null) {
                dVar.onSupportActionModeFinished(eVar4.f2055o);
            }
            e eVar5 = e.this;
            eVar5.f2055o = null;
            ViewCompat.m0(eVar5.f2062v);
        }
    }

    static class i {
        static Context a(@NonNull Context context, @NonNull Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            int i11 = configuration.densityDpi;
            int i12 = configuration2.densityDpi;
            if (i11 != i12) {
                configuration3.densityDpi = i12;
            }
        }
    }

    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    static class k {
        static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    static class l {
        static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            int i11 = configuration.colorMode & 3;
            int i12 = configuration2.colorMode;
            if (i11 != (i12 & 3)) {
                configuration3.colorMode |= i12 & 3;
            }
            int i13 = configuration.colorMode & 12;
            int i14 = configuration2.colorMode;
            if (i13 != (i14 & 12)) {
                configuration3.colorMode |= i14 & 12;
            }
        }
    }

    class m extends n.f {
        m(Window.Callback callback) {
            super(callback);
        }

        final android.view.ActionMode b(android.view.ActionMode.Callback callback) {
            androidx.appcompat.view.b.a aVar = new androidx.appcompat.view.b.a(e.this.f2045e, callback);
            ActionMode actionModeK = e.this.K(aVar);
            if (actionModeK != null) {
                return aVar.e(actionModeK);
            }
            return null;
        }

        @Override // n.f, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.Y(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // n.f, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || e.this.w0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // n.f, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // n.f, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i11, Menu menu) {
            if (i11 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i11, menu);
            }
            return false;
        }

        @Override // n.f, android.view.Window.Callback
        public boolean onMenuOpened(int i11, Menu menu) {
            super.onMenuOpened(i11, menu);
            e.this.z0(i11);
            return true;
        }

        @Override // n.f, android.view.Window.Callback
        public void onPanelClosed(int i11, Menu menu) {
            super.onPanelClosed(i11, menu);
            e.this.A0(i11);
        }

        @Override // n.f, android.view.Window.Callback
        public boolean onPreparePanel(int i11, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i11 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.e0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i11, view, menu);
            if (eVar != null) {
                eVar.e0(false);
            }
            return zOnPreparePanel;
        }

        @Override // n.f, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i11) {
            androidx.appcompat.view.menu.e eVar;
            s sVarI0 = e.this.i0(0, true);
            if (sVarI0 == null || (eVar = sVarI0.f2096j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i11);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i11);
            }
        }

        @Override // n.f, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
            return null;
        }

        @Override // n.f, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i11) {
            return (e.this.r0() && i11 == 0) ? b(callback) : super.onWindowStartingActionMode(callback, i11);
        }
    }

    private class n extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PowerManager f2079c;

        n(Context context) {
            super();
            this.f2079c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.e.o
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.e.o
        public int c() {
            return j.a(this.f2079c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.e.o
        public void d() {
            e.this.e();
        }
    }

    abstract class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f2081a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                o.this.d();
            }
        }

        o() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f2081a;
            if (broadcastReceiver != null) {
                try {
                    e.this.f2045e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f2081a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f2081a == null) {
                this.f2081a = new a();
            }
            e.this.f2045e.registerReceiver(this.f2081a, intentFilterB);
        }
    }

    private class p extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.appcompat.app.o f2084c;

        p(androidx.appcompat.app.o oVar) {
            super();
            this.f2084c = oVar;
        }

        @Override // androidx.appcompat.app.e.o
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.e.o
        public int c() {
            return this.f2084c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.e.o
        public void d() {
            e.this.e();
        }
    }

    private static class q {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean a(int i11, int i12) {
            return i11 < -5 || i12 < -5 || i11 > getWidth() + 5 || i12 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.Y(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            e.this.S(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i11) {
            setBackgroundDrawable(j.a.b(getContext(), i11));
        }
    }

    protected static final class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2092f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ViewGroup f2093g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        View f2094h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        View f2095i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f2096j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f2097k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Context f2098l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f2099m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f2100n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f2101o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f2102p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f2103q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f2104r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Bundle f2105s;

        s(int i11) {
            this.f2087a = i11;
        }

        androidx.appcompat.view.menu.k a(androidx.appcompat.view.menu.j.a aVar) {
            if (this.f2096j == null) {
                return null;
            }
            if (this.f2097k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f2098l, i.g.f73835j);
                this.f2097k = cVar;
                cVar.i(aVar);
                this.f2096j.b(this.f2097k);
            }
            return this.f2097k.j(this.f2093g);
        }

        public boolean b() {
            if (this.f2094h == null) {
                return false;
            }
            return this.f2095i != null || this.f2097k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f2096j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.Q(this.f2097k);
            }
            this.f2096j = eVar;
            if (eVar == null || (cVar = this.f2097k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(i.a.f73724a, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                themeNewTheme.applyStyle(i11, true);
            }
            themeNewTheme.resolveAttribute(i.a.I, typedValue, true);
            int i12 = typedValue.resourceId;
            if (i12 != 0) {
                themeNewTheme.applyStyle(i12, true);
            } else {
                themeNewTheme.applyStyle(i.i.f73862c, true);
            }
            n.c cVar = new n.c(context, 0);
            cVar.getTheme().setTo(themeNewTheme);
            this.f2098l = cVar;
            TypedArray typedArrayObtainStyledAttributes = cVar.obtainStyledAttributes(i.j.f73996z0);
            this.f2088b = typedArrayObtainStyledAttributes.getResourceId(i.j.C0, 0);
            this.f2092f = typedArrayObtainStyledAttributes.getResourceId(i.j.B0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class t implements androidx.appcompat.view.menu.j.a {
        t() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar, boolean z11) {
            androidx.appcompat.view.menu.e eVarF = eVar.F();
            boolean z12 = eVarF != eVar;
            e eVar2 = e.this;
            if (z12) {
                eVar = eVarF;
            }
            s sVarD0 = eVar2.d0(eVar);
            if (sVarD0 != null) {
                if (!z12) {
                    e.this.T(sVarD0, z11);
                } else {
                    e.this.P(sVarD0.f2087a, sVarD0, eVarF);
                    e.this.T(sVarD0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(@NonNull androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackK0;
            if (eVar != eVar.F()) {
                return true;
            }
            e eVar2 = e.this;
            if (!eVar2.A || (callbackK0 = eVar2.k0()) == null || e.this.M) {
                return true;
            }
            callbackK0.onMenuOpened(108, eVar);
            return true;
        }
    }

    e(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    private void C0(s sVar, KeyEvent keyEvent) {
        int i11;
        ViewGroup.LayoutParams layoutParams;
        if (sVar.f2101o || this.M) {
            return;
        }
        if (sVar.f2087a == 0 && (this.f2045e.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackK0 = k0();
        if (callbackK0 != null && !callbackK0.onMenuOpened(sVar.f2087a, sVar.f2096j)) {
            T(sVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f2045e.getSystemService("window");
        if (windowManager != null && F0(sVar, keyEvent)) {
            ViewGroup viewGroup = sVar.f2093g;
            if (viewGroup != null && !sVar.f2103q) {
                View view = sVar.f2095i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i11 = -1;
                }
                sVar.f2100n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i11, -2, sVar.f2090d, sVar.f2091e, 1002, 8519680, -3);
                layoutParams2.gravity = sVar.f2089c;
                layoutParams2.windowAnimations = sVar.f2092f;
                windowManager.addView(sVar.f2093g, layoutParams2);
                sVar.f2101o = true;
            }
            if (viewGroup == null) {
                if (!n0(sVar) || sVar.f2093g == null) {
                    return;
                }
            } else if (sVar.f2103q && viewGroup.getChildCount() > 0) {
                sVar.f2093g.removeAllViews();
            }
            if (!m0(sVar) || !sVar.b()) {
                sVar.f2103q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = sVar.f2094h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            sVar.f2093g.setBackgroundResource(sVar.f2088b);
            ViewParent parent = sVar.f2094h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(sVar.f2094h);
            }
            sVar.f2093g.addView(sVar.f2094h, layoutParams3);
            if (!sVar.f2094h.hasFocus()) {
                sVar.f2094h.requestFocus();
            }
            i11 = -2;
            sVar.f2100n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i11, -2, sVar.f2090d, sVar.f2091e, 1002, 8519680, -3);
            layoutParams4.gravity = sVar.f2089c;
            layoutParams4.windowAnimations = sVar.f2092f;
            windowManager.addView(sVar.f2093g, layoutParams4);
            sVar.f2101o = true;
        }
    }

    private boolean E0(s sVar, int i11, KeyEvent keyEvent, int i12) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f2099m || F0(sVar, keyEvent)) && (eVar = sVar.f2096j) != null) {
            zPerformShortcut = eVar.performShortcut(i11, keyEvent, i12);
        }
        if (zPerformShortcut && (i12 & 1) == 0 && this.f2052l == null) {
            T(sVar, true);
        }
        return zPerformShortcut;
    }

    private boolean F0(s sVar, KeyEvent keyEvent) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        if (this.M) {
            return false;
        }
        if (sVar.f2099m) {
            return true;
        }
        s sVar2 = this.H;
        if (sVar2 != null && sVar2 != sVar) {
            T(sVar2, false);
        }
        Window.Callback callbackK0 = k0();
        if (callbackK0 != null) {
            sVar.f2095i = callbackK0.onCreatePanelView(sVar.f2087a);
        }
        int i11 = sVar.f2087a;
        boolean z11 = i11 == 0 || i11 == 108;
        if (z11 && (d0Var3 = this.f2052l) != null) {
            d0Var3.setMenuPrepared();
        }
        if (sVar.f2095i == null && (!z11 || !(D0() instanceof androidx.appcompat.app.m))) {
            androidx.appcompat.view.menu.e eVar = sVar.f2096j;
            if (eVar == null || sVar.f2104r) {
                if (eVar == null && (!o0(sVar) || sVar.f2096j == null)) {
                    return false;
                }
                if (z11 && this.f2052l != null) {
                    if (this.f2053m == null) {
                        this.f2053m = new g();
                    }
                    this.f2052l.setMenu(sVar.f2096j, this.f2053m);
                }
                sVar.f2096j.h0();
                if (!callbackK0.onCreatePanelMenu(sVar.f2087a, sVar.f2096j)) {
                    sVar.c(null);
                    if (z11 && (d0Var = this.f2052l) != null) {
                        d0Var.setMenu(null, this.f2053m);
                    }
                    return false;
                }
                sVar.f2104r = false;
            }
            sVar.f2096j.h0();
            Bundle bundle = sVar.f2105s;
            if (bundle != null) {
                sVar.f2096j.R(bundle);
                sVar.f2105s = null;
            }
            if (!callbackK0.onPreparePanel(0, sVar.f2095i, sVar.f2096j)) {
                if (z11 && (d0Var2 = this.f2052l) != null) {
                    d0Var2.setMenu(null, this.f2053m);
                }
                sVar.f2096j.g0();
                return false;
            }
            boolean z12 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.f2102p = z12;
            sVar.f2096j.setQwertyMode(z12);
            sVar.f2096j.g0();
        }
        sVar.f2099m = true;
        sVar.f2100n = false;
        this.H = sVar;
        return true;
    }

    private void G0(boolean z11) {
        d0 d0Var = this.f2052l;
        if (d0Var == null || !d0Var.a() || (ViewConfiguration.get(this.f2045e).hasPermanentMenuKey() && !this.f2052l.f())) {
            s sVarI0 = i0(0, true);
            sVarI0.f2103q = true;
            T(sVarI0, false);
            C0(sVarI0, null);
            return;
        }
        Window.Callback callbackK0 = k0();
        if (this.f2052l.d() && z11) {
            this.f2052l.e();
            if (this.M) {
                return;
            }
            callbackK0.onPanelClosed(108, i0(0, true).f2096j);
            return;
        }
        if (callbackK0 == null || this.M) {
            return;
        }
        if (this.T && (this.U & 1) != 0) {
            this.f2046f.getDecorView().removeCallbacks(this.V);
            this.V.run();
        }
        s sVarI1 = i0(0, true);
        androidx.appcompat.view.menu.e eVar = sVarI1.f2096j;
        if (eVar == null || sVarI1.f2104r || !callbackK0.onPreparePanel(0, sVarI1.f2095i, eVar)) {
            return;
        }
        callbackK0.onMenuOpened(108, sVarI1.f2096j);
        this.f2052l.c();
    }

    private int H0(int i11) {
        if (i11 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i11 != 9) {
            return i11;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean J0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f2046f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ViewCompat.S((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean L(boolean z11) {
        if (this.M) {
            return false;
        }
        int iO = O();
        boolean zN0 = N0(s0(this.f2045e, iO), z11);
        if (iO == 0) {
            h0(this.f2045e).e();
        } else {
            o oVar = this.R;
            if (oVar != null) {
                oVar.a();
            }
        }
        if (iO == 3) {
            g0(this.f2045e).e();
            return zN0;
        }
        o oVar2 = this.S;
        if (oVar2 != null) {
            oVar2.a();
        }
        return zN0;
    }

    private void L0() {
        if (this.f2061u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void M() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f2062v.findViewById(R.id.content);
        View decorView = this.f2046f.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f2045e.obtainStyledAttributes(i.j.f73996z0);
        typedArrayObtainStyledAttributes.getValue(i.j.L0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(i.j.M0, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(i.j.J0)) {
            typedArrayObtainStyledAttributes.getValue(i.j.J0, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(i.j.K0)) {
            typedArrayObtainStyledAttributes.getValue(i.j.K0, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(i.j.H0)) {
            typedArrayObtainStyledAttributes.getValue(i.j.H0, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(i.j.I0)) {
            typedArrayObtainStyledAttributes.getValue(i.j.I0, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private androidx.appcompat.app.c M0() {
        for (Context baseContext = this.f2045e; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void N(@NonNull Window window) {
        if (this.f2046f != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof m) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        m mVar = new m(callback);
        this.f2047g = mVar;
        window.setCallback(mVar);
        b1 b1VarU = b1.u(this.f2045e, null, f2040d0);
        Drawable drawableH = b1VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        b1VarU.w();
        this.f2046f = window;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    private boolean N0(int i11, boolean z11) {
        boolean z12;
        Configuration configurationU = U(this.f2045e, i11, null);
        boolean zQ0 = q0();
        int i12 = this.f2045e.getResources().getConfiguration().uiMode & 48;
        int i13 = configurationU.uiMode & 48;
        boolean z13 = true;
        if (i12 != i13 && z11 && !zQ0 && this.J && (f2041e0 || this.K)) {
            Object obj = this.f2044d;
            if (!(obj instanceof Activity) || ((Activity) obj).isChild()) {
                z12 = false;
            } else {
                androidx.core.app.b.e((Activity) this.f2044d);
                z12 = true;
            }
        } else {
            z12 = false;
        }
        if (z12 || i12 == i13) {
            z13 = z12;
        } else {
            O0(i13, zQ0, null);
        }
        if (z13) {
            Object obj2 = this.f2044d;
            if (obj2 instanceof androidx.appcompat.app.c) {
                ((androidx.appcompat.app.c) obj2).onNightModeChanged(i11);
            }
        }
        return z13;
    }

    private int O() {
        int i11 = this.N;
        return i11 != -100 ? i11 : AppCompatDelegate.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void O0(int i11, boolean z11, Configuration configuration) {
        Resources resources = this.f2045e.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i11 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.l.a(resources);
        }
        int i12 = this.O;
        if (i12 != 0) {
            this.f2045e.setTheme(i12);
            this.f2045e.getTheme().applyStyle(this.O, true);
        }
        if (z11) {
            Object obj = this.f2044d;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof LifecycleOwner) {
                    if (((LifecycleOwner) activity).getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.L) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    private void Q0(View view) {
        view.setBackgroundColor((ViewCompat.M(view) & PKIFailureInfo.certRevoked) != 0 ? androidx.core.content.b.getColor(this.f2045e, i.c.f73752b) : androidx.core.content.b.getColor(this.f2045e, i.c.f73751a));
    }

    private void R() {
        o oVar = this.R;
        if (oVar != null) {
            oVar.a();
        }
        o oVar2 = this.S;
        if (oVar2 != null) {
            oVar2.a();
        }
    }

    @NonNull
    private Configuration U(@NonNull Context context, int i11, Configuration configuration) {
        int i12;
        if (i11 != 1) {
            i12 = i11 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i12 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = BitmapDescriptorFactory.HUE_RED;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i12 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup V() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f2045e.obtainStyledAttributes(i.j.f73996z0);
        if (!typedArrayObtainStyledAttributes.hasValue(i.j.E0)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.N0, false)) {
            C(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i.j.E0, false)) {
            C(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.F0, false)) {
            C(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.G0, false)) {
            C(10);
        }
        this.D = typedArrayObtainStyledAttributes.getBoolean(i.j.A0, false);
        typedArrayObtainStyledAttributes.recycle();
        c0();
        this.f2046f.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f2045e);
        if (this.E) {
            viewGroup = this.C ? (ViewGroup) layoutInflaterFrom.inflate(i.g.f73840o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(i.g.f73839n, (ViewGroup) null);
        } else if (this.D) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(i.g.f73831f, (ViewGroup) null);
            this.B = false;
            this.A = false;
        } else if (this.A) {
            TypedValue typedValue = new TypedValue();
            this.f2045e.getTheme().resolveAttribute(i.a.f73730g, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new n.c(this.f2045e, typedValue.resourceId) : this.f2045e).inflate(i.g.f73841p, (ViewGroup) null);
            d0 d0Var = (d0) viewGroup.findViewById(i.f.f73816q);
            this.f2052l = d0Var;
            d0Var.setWindowCallback(k0());
            if (this.B) {
                this.f2052l.g(109);
            }
            if (this.f2065y) {
                this.f2052l.g(2);
            }
            if (this.f2066z) {
                this.f2052l.g(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.A + ", windowActionBarOverlay: " + this.B + ", android:windowIsFloating: " + this.D + ", windowActionModeOverlay: " + this.C + ", windowNoTitle: " + this.E + " }");
        }
        ViewCompat.E0(viewGroup, new b());
        if (this.f2052l == null) {
            this.f2063w = (TextView) viewGroup.findViewById(i.f.N);
        }
        h1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(i.f.f73801b);
        ViewGroup viewGroup2 = (ViewGroup) this.f2046f.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f2046f.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void b0() {
        if (this.f2061u) {
            return;
        }
        this.f2062v = V();
        CharSequence charSequenceJ0 = j0();
        if (!TextUtils.isEmpty(charSequenceJ0)) {
            d0 d0Var = this.f2052l;
            if (d0Var != null) {
                d0Var.setWindowTitle(charSequenceJ0);
            } else if (D0() != null) {
                D0().C(charSequenceJ0);
            } else {
                TextView textView = this.f2063w;
                if (textView != null) {
                    textView.setText(charSequenceJ0);
                }
            }
        }
        M();
        B0(this.f2062v);
        this.f2061u = true;
        s sVarI0 = i0(0, false);
        if (this.M) {
            return;
        }
        if (sVarI0 == null || sVarI0.f2096j == null) {
            p0(108);
        }
    }

    private void c0() {
        if (this.f2046f == null) {
            Object obj = this.f2044d;
            if (obj instanceof Activity) {
                N(((Activity) obj).getWindow());
            }
        }
        if (this.f2046f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @NonNull
    private static Configuration e0(@NonNull Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = BitmapDescriptorFactory.HUE_RED;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f11 = configuration.fontScale;
            float f12 = configuration2.fontScale;
            if (f11 != f12) {
                configuration3.fontScale = f12;
            }
            int i11 = configuration.mcc;
            int i12 = configuration2.mcc;
            if (i11 != i12) {
                configuration3.mcc = i12;
            }
            int i13 = configuration.mnc;
            int i14 = configuration2.mnc;
            if (i13 != i14) {
                configuration3.mnc = i14;
            }
            int i15 = Build.VERSION.SDK_INT;
            k.a(configuration, configuration2, configuration3);
            int i16 = configuration.touchscreen;
            int i17 = configuration2.touchscreen;
            if (i16 != i17) {
                configuration3.touchscreen = i17;
            }
            int i18 = configuration.keyboard;
            int i19 = configuration2.keyboard;
            if (i18 != i19) {
                configuration3.keyboard = i19;
            }
            int i21 = configuration.keyboardHidden;
            int i22 = configuration2.keyboardHidden;
            if (i21 != i22) {
                configuration3.keyboardHidden = i22;
            }
            int i23 = configuration.navigation;
            int i24 = configuration2.navigation;
            if (i23 != i24) {
                configuration3.navigation = i24;
            }
            int i25 = configuration.navigationHidden;
            int i26 = configuration2.navigationHidden;
            if (i25 != i26) {
                configuration3.navigationHidden = i26;
            }
            int i27 = configuration.orientation;
            int i28 = configuration2.orientation;
            if (i27 != i28) {
                configuration3.orientation = i28;
            }
            int i29 = configuration.screenLayout & 15;
            int i31 = configuration2.screenLayout;
            if (i29 != (i31 & 15)) {
                configuration3.screenLayout |= i31 & 15;
            }
            int i32 = configuration.screenLayout & 192;
            int i33 = configuration2.screenLayout;
            if (i32 != (i33 & 192)) {
                configuration3.screenLayout |= i33 & 192;
            }
            int i34 = configuration.screenLayout & 48;
            int i35 = configuration2.screenLayout;
            if (i34 != (i35 & 48)) {
                configuration3.screenLayout |= i35 & 48;
            }
            int i36 = configuration.screenLayout & 768;
            int i37 = configuration2.screenLayout;
            if (i36 != (i37 & 768)) {
                configuration3.screenLayout |= i37 & 768;
            }
            if (i15 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i38 = configuration.uiMode & 15;
            int i39 = configuration2.uiMode;
            if (i38 != (i39 & 15)) {
                configuration3.uiMode |= i39 & 15;
            }
            int i41 = configuration.uiMode & 48;
            int i42 = configuration2.uiMode;
            if (i41 != (i42 & 48)) {
                configuration3.uiMode |= i42 & 48;
            }
            int i43 = configuration.screenWidthDp;
            int i44 = configuration2.screenWidthDp;
            if (i43 != i44) {
                configuration3.screenWidthDp = i44;
            }
            int i45 = configuration.screenHeightDp;
            int i46 = configuration2.screenHeightDp;
            if (i45 != i46) {
                configuration3.screenHeightDp = i46;
            }
            int i47 = configuration.smallestScreenWidthDp;
            int i48 = configuration2.smallestScreenWidthDp;
            if (i47 != i48) {
                configuration3.smallestScreenWidthDp = i48;
            }
            i.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private o g0(@NonNull Context context) {
        if (this.S == null) {
            this.S = new n(context);
        }
        return this.S;
    }

    private o h0(@NonNull Context context) {
        if (this.R == null) {
            this.R = new p(androidx.appcompat.app.o.a(context));
        }
        return this.R;
    }

    private void l0() {
        b0();
        if (this.A && this.f2049i == null) {
            Object obj = this.f2044d;
            if (obj instanceof Activity) {
                this.f2049i = new androidx.appcompat.app.p((Activity) this.f2044d, this.B);
            } else if (obj instanceof Dialog) {
                this.f2049i = new androidx.appcompat.app.p((Dialog) this.f2044d);
            }
            ActionBar actionBar = this.f2049i;
            if (actionBar != null) {
                actionBar.t(this.W);
            }
        }
    }

    private boolean m0(s sVar) {
        View view = sVar.f2095i;
        if (view != null) {
            sVar.f2094h = view;
            return true;
        }
        if (sVar.f2096j == null) {
            return false;
        }
        if (this.f2054n == null) {
            this.f2054n = new t();
        }
        View view2 = (View) sVar.a(this.f2054n);
        sVar.f2094h = view2;
        return view2 != null;
    }

    private boolean n0(s sVar) {
        sVar.d(f0());
        sVar.f2093g = new r(sVar.f2098l);
        sVar.f2089c = 81;
        return true;
    }

    private boolean o0(s sVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f2045e;
        int i11 = sVar.f2087a;
        if ((i11 == 0 || i11 == 108) && this.f2052l != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(i.a.f73730g, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(i.a.f73731h, typedValue, true);
            } else {
                theme.resolveAttribute(i.a.f73731h, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                n.c cVar = new n.c(context, 0);
                cVar.getTheme().setTo(themeNewTheme);
                context = cVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.V(this);
        sVar.c(eVar);
        return true;
    }

    private void p0(int i11) {
        this.U = (1 << i11) | this.U;
        if (this.T) {
            return;
        }
        ViewCompat.h0(this.f2046f.getDecorView(), this.V);
        this.T = true;
    }

    private boolean q0() {
        if (!this.Q && (this.f2044d instanceof Activity)) {
            PackageManager packageManager = this.f2045e.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f2045e, this.f2044d.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                this.P = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e11) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e11);
                this.P = false;
            }
        }
        this.Q = true;
        return this.P;
    }

    private boolean v0(int i11, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        s sVarI0 = i0(i11, true);
        if (sVarI0.f2101o) {
            return false;
        }
        return F0(sVarI0, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    private boolean y0(int i11, KeyEvent keyEvent) {
        boolean zF0;
        d0 d0Var;
        if (this.f2055o != null) {
            return false;
        }
        boolean zE = true;
        s sVarI0 = i0(i11, true);
        if (i11 != 0 || (d0Var = this.f2052l) == null || !d0Var.a() || ViewConfiguration.get(this.f2045e).hasPermanentMenuKey()) {
            boolean z11 = sVarI0.f2101o;
            if (z11 || sVarI0.f2100n) {
                T(sVarI0, true);
                zE = z11;
            } else if (sVarI0.f2099m) {
                if (sVarI0.f2104r) {
                    sVarI0.f2099m = false;
                    zF0 = F0(sVarI0, keyEvent);
                } else {
                    zF0 = true;
                }
                if (zF0) {
                    C0(sVarI0, keyEvent);
                } else {
                    zE = false;
                }
            } else {
                zE = false;
            }
        } else if (this.f2052l.d()) {
            zE = this.f2052l.e();
        } else if (this.M || !F0(sVarI0, keyEvent)) {
            zE = false;
        } else {
            zE = this.f2052l.c();
        }
        if (zE) {
            AudioManager audioManager = (AudioManager) this.f2045e.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return zE;
            }
            Log.w("AppCompatDelegate", "Couldn't get audio manager");
        }
        return zE;
    }

    void A0(int i11) {
        if (i11 == 108) {
            ActionBar actionBarP = p();
            if (actionBarP != null) {
                actionBarP.h(false);
                return;
            }
            return;
        }
        if (i11 == 0) {
            s sVarI0 = i0(i11, true);
            if (sVarI0.f2101o) {
                T(sVarI0, false);
            }
        }
    }

    void B0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean C(int i11) {
        int iH0 = H0(i11);
        if (this.E && iH0 == 108) {
            return false;
        }
        if (this.A && iH0 == 1) {
            this.A = false;
        }
        if (iH0 == 1) {
            L0();
            this.E = true;
            return true;
        }
        if (iH0 == 2) {
            L0();
            this.f2065y = true;
            return true;
        }
        if (iH0 == 5) {
            L0();
            this.f2066z = true;
            return true;
        }
        if (iH0 == 10) {
            L0();
            this.C = true;
            return true;
        }
        if (iH0 == 108) {
            L0();
            this.A = true;
            return true;
        }
        if (iH0 != 109) {
            return this.f2046f.requestFeature(iH0);
        }
        L0();
        this.B = true;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void D(int i11) {
        b0();
        ViewGroup viewGroup = (ViewGroup) this.f2062v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2045e).inflate(i11, viewGroup);
        this.f2047g.a().onContentChanged();
    }

    final ActionBar D0() {
        return this.f2049i;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void E(View view) {
        b0();
        ViewGroup viewGroup = (ViewGroup) this.f2062v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2047g.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void F(View view, ViewGroup.LayoutParams layoutParams) {
        b0();
        ViewGroup viewGroup = (ViewGroup) this.f2062v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2047g.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void H(Toolbar toolbar) {
        if (this.f2044d instanceof Activity) {
            ActionBar actionBarP = p();
            if (actionBarP instanceof androidx.appcompat.app.p) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f2050j = null;
            if (actionBarP != null) {
                actionBarP.n();
            }
            if (toolbar != null) {
                androidx.appcompat.app.m mVar = new androidx.appcompat.app.m(toolbar, j0(), this.f2047g);
                this.f2049i = mVar;
                this.f2046f.setCallback(mVar.F());
            } else {
                this.f2049i = null;
                this.f2046f.setCallback(this.f2047g);
            }
            r();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void I(int i11) {
        this.O = i11;
    }

    final boolean I0() {
        ViewGroup viewGroup;
        return this.f2061u && (viewGroup = this.f2062v) != null && ViewCompat.U(viewGroup);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void J(CharSequence charSequence) {
        this.f2051k = charSequence;
        d0 d0Var = this.f2052l;
        if (d0Var != null) {
            d0Var.setWindowTitle(charSequence);
            return;
        }
        if (D0() != null) {
            D0().C(charSequence);
            return;
        }
        TextView textView = this.f2063w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public ActionMode K(@NonNull ActionMode.Callback callback) {
        androidx.appcompat.app.d dVar;
        if (callback == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        ActionMode actionMode = this.f2055o;
        if (actionMode != null) {
            actionMode.c();
        }
        h hVar = new h(callback);
        ActionBar actionBarP = p();
        if (actionBarP != null) {
            ActionMode actionModeD = actionBarP.D(hVar);
            this.f2055o = actionModeD;
            if (actionModeD != null && (dVar = this.f2048h) != null) {
                dVar.onSupportActionModeStarted(actionModeD);
            }
        }
        if (this.f2055o == null) {
            this.f2055o = K0(hVar);
        }
        return this.f2055o;
    }

    ActionMode K0(@NonNull ActionMode.Callback callback) {
        ActionMode actionModeOnWindowStartingSupportActionMode;
        Context cVar;
        androidx.appcompat.app.d dVar;
        a0();
        ActionMode actionMode = this.f2055o;
        if (actionMode != null) {
            actionMode.c();
        }
        if (!(callback instanceof h)) {
            callback = new h(callback);
        }
        androidx.appcompat.app.d dVar2 = this.f2048h;
        if (dVar2 == null || this.M) {
            actionModeOnWindowStartingSupportActionMode = null;
        } else {
            try {
                actionModeOnWindowStartingSupportActionMode = dVar2.onWindowStartingSupportActionMode(callback);
            } catch (AbstractMethodError unused) {
                actionModeOnWindowStartingSupportActionMode = null;
            }
        }
        if (actionModeOnWindowStartingSupportActionMode != null) {
            this.f2055o = actionModeOnWindowStartingSupportActionMode;
        } else {
            if (this.f2056p == null) {
                if (this.D) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f2045e.getTheme();
                    theme.resolveAttribute(i.a.f73730g, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f2045e.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        cVar = new n.c(this.f2045e, 0);
                        cVar.getTheme().setTo(themeNewTheme);
                    } else {
                        cVar = this.f2045e;
                    }
                    this.f2056p = new ActionBarContextView(cVar);
                    PopupWindow popupWindow = new PopupWindow(cVar, (AttributeSet) null, i.a.f73733j);
                    this.f2057q = popupWindow;
                    androidx.core.widget.l.b(popupWindow, 2);
                    this.f2057q.setContentView(this.f2056p);
                    this.f2057q.setWidth(-1);
                    cVar.getTheme().resolveAttribute(i.a.f73725b, typedValue, true);
                    this.f2056p.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, cVar.getResources().getDisplayMetrics()));
                    this.f2057q.setHeight(-2);
                    this.f2058r = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f2062v.findViewById(i.f.f73808i);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(f0()));
                        this.f2056p = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f2056p != null) {
                a0();
                this.f2056p.k();
                androidx.appcompat.view.a aVar = new androidx.appcompat.view.a(this.f2056p.getContext(), this.f2056p, callback, this.f2057q == null);
                if (callback.a(aVar, aVar.e())) {
                    aVar.k();
                    this.f2056p.h(aVar);
                    this.f2055o = aVar;
                    if (I0()) {
                        this.f2056p.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatB = ViewCompat.e(this.f2056p).b(1.0f);
                        this.f2059s = viewPropertyAnimatorCompatB;
                        viewPropertyAnimatorCompatB.g(new C0060e());
                    } else {
                        this.f2056p.setAlpha(1.0f);
                        this.f2056p.setVisibility(0);
                        this.f2056p.sendAccessibilityEvent(32);
                        if (this.f2056p.getParent() instanceof View) {
                            ViewCompat.m0((View) this.f2056p.getParent());
                        }
                    }
                    if (this.f2057q != null) {
                        this.f2046f.getDecorView().post(this.f2058r);
                    }
                } else {
                    this.f2055o = null;
                }
            }
        }
        ActionMode actionMode2 = this.f2055o;
        if (actionMode2 != null && (dVar = this.f2048h) != null) {
            dVar.onSupportActionModeStarted(actionMode2);
        }
        return this.f2055o;
    }

    void P(int i11, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i11 >= 0) {
                s[] sVarArr = this.G;
                if (i11 < sVarArr.length) {
                    sVar = sVarArr[i11];
                }
            }
            if (sVar != null) {
                menu = sVar.f2096j;
            }
        }
        if ((sVar == null || sVar.f2101o) && !this.M) {
            this.f2047g.a().onPanelClosed(i11, menu);
        }
    }

    final int P0(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        int iM;
        boolean z11;
        boolean z12;
        if (windowInsetsCompat != null) {
            iM = windowInsetsCompat.m();
        } else {
            iM = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f2056p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z11 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2056p.getLayoutParams();
            boolean z13 = true;
            if (this.f2056p.isShown()) {
                if (this.X == null) {
                    this.X = new Rect();
                    this.Y = new Rect();
                }
                Rect rect2 = this.X;
                Rect rect3 = this.Y;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.k(), windowInsetsCompat.m(), windowInsetsCompat.l(), windowInsetsCompat.j());
                }
                h1.a(this.f2062v, rect2, rect3);
                int i11 = rect2.top;
                int i12 = rect2.left;
                int i13 = rect2.right;
                WindowInsetsCompat windowInsetsCompatH = ViewCompat.H(this.f2062v);
                int iK = windowInsetsCompatH == null ? 0 : windowInsetsCompatH.k();
                int iL = windowInsetsCompatH == null ? 0 : windowInsetsCompatH.l();
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z12 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z12 = true;
                }
                if (i11 <= 0 || this.f2064x != null) {
                    View view = this.f2064x;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != iK || marginLayoutParams2.rightMargin != iL) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = iK;
                            marginLayoutParams2.rightMargin = iL;
                            this.f2064x.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f2045e);
                    this.f2064x = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iK;
                    layoutParams.rightMargin = iL;
                    this.f2062v.addView(this.f2064x, -1, layoutParams);
                }
                View view3 = this.f2064x;
                z13 = view3 != null;
                if (z13 && view3.getVisibility() != 0) {
                    Q0(this.f2064x);
                }
                if (!this.C && z13) {
                    iM = 0;
                }
                z11 = z13;
                z13 = z12;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z11 = false;
            } else {
                z11 = false;
                z13 = false;
            }
            if (z13) {
                this.f2056p.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f2064x;
        if (view4 != null) {
            view4.setVisibility(z11 ? 0 : 8);
        }
        return iM;
    }

    void Q(@NonNull androidx.appcompat.view.menu.e eVar) {
        if (this.F) {
            return;
        }
        this.F = true;
        this.f2052l.h();
        Window.Callback callbackK0 = k0();
        if (callbackK0 != null && !this.M) {
            callbackK0.onPanelClosed(108, eVar);
        }
        this.F = false;
    }

    void S(int i11) {
        T(i0(i11, true), true);
    }

    void T(s sVar, boolean z11) {
        ViewGroup viewGroup;
        d0 d0Var;
        if (z11 && sVar.f2087a == 0 && (d0Var = this.f2052l) != null && d0Var.d()) {
            Q(sVar.f2096j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f2045e.getSystemService("window");
        if (windowManager != null && sVar.f2101o && (viewGroup = sVar.f2093g) != null) {
            windowManager.removeView(viewGroup);
            if (z11) {
                P(sVar.f2087a, sVar, null);
            }
        }
        sVar.f2099m = false;
        sVar.f2100n = false;
        sVar.f2101o = false;
        sVar.f2094h = null;
        sVar.f2103q = true;
        if (this.H == sVar) {
            this.H = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View W(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean z11;
        if (this.Z == null) {
            String string = this.f2045e.obtainStyledAttributes(i.j.f73996z0).getString(i.j.D0);
            if (string == null) {
                this.Z = new androidx.appcompat.app.j();
            } else {
                try {
                    this.Z = (androidx.appcompat.app.j) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.Z = new androidx.appcompat.app.j();
                }
            }
        }
        boolean z12 = f2039c0;
        boolean zJ0 = false;
        if (z12) {
            if (this.f2043a0 == null) {
                this.f2043a0 = new androidx.appcompat.app.k();
            }
            if (this.f2043a0.a(attributeSet)) {
                z11 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zJ0 = J0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zJ0 = true;
                }
                z11 = zJ0;
            }
        } else {
            z11 = zJ0;
        }
        return this.Z.q(view, str, context, attributeSet, z11, z12, true, g1.b());
    }

    void X() {
        androidx.appcompat.view.menu.e eVar;
        d0 d0Var = this.f2052l;
        if (d0Var != null) {
            d0Var.h();
        }
        if (this.f2057q != null) {
            this.f2046f.getDecorView().removeCallbacks(this.f2058r);
            if (this.f2057q.isShowing()) {
                try {
                    this.f2057q.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f2057q = null;
        }
        a0();
        s sVarI0 = i0(0, false);
        if (sVarI0 == null || (eVar = sVarI0.f2096j) == null) {
            return;
        }
        eVar.close();
    }

    boolean Y(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f2044d;
        if (((obj instanceof androidx.core.view.l.a) || (obj instanceof androidx.appcompat.app.h)) && (decorView = this.f2046f.getDecorView()) != null && androidx.core.view.l.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f2047g.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? u0(keyCode, keyEvent) : x0(keyCode, keyEvent);
    }

    void Z(int i11) {
        s sVarI0;
        s sVarI1 = i0(i11, true);
        if (sVarI1.f2096j != null) {
            Bundle bundle = new Bundle();
            sVarI1.f2096j.T(bundle);
            if (bundle.size() > 0) {
                sVarI1.f2105s = bundle;
            }
            sVarI1.f2096j.h0();
            sVarI1.f2096j.clear();
        }
        sVarI1.f2104r = true;
        sVarI1.f2103q = true;
        if ((i11 != 108 && i11 != 0) || this.f2052l == null || (sVarI0 = i0(0, false)) == null) {
            return;
        }
        sVarI0.f2099m = false;
        F0(sVarI0, null);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
        s sVarD0;
        Window.Callback callbackK0 = k0();
        if (callbackK0 == null || this.M || (sVarD0 = d0(eVar.F())) == null) {
            return false;
        }
        return callbackK0.onMenuItemSelected(sVarD0.f2087a, menuItem);
    }

    void a0() {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f2059s;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.c();
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
        G0(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        b0();
        ((ViewGroup) this.f2062v.findViewById(R.id.content)).addView(view, layoutParams);
        this.f2047g.a().onContentChanged();
    }

    s d0(Menu menu) {
        s[] sVarArr = this.G;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i11 = 0; i11 < length; i11++) {
            s sVar = sVarArr[i11];
            if (sVar != null && sVar.f2096j == menu) {
                return sVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean e() {
        return L(true);
    }

    final Context f0() {
        ActionBar actionBarP = p();
        Context contextJ = actionBarP != null ? actionBarP.j() : null;
        return contextJ == null ? this.f2045e : contextJ;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    @NonNull
    public Context h(@NonNull Context context) {
        this.J = true;
        int iS0 = s0(context, O());
        if (f2042f0 && (context instanceof ContextThemeWrapper)) {
            try {
                q.a((ContextThemeWrapper) context, U(context, iS0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof n.c) {
            try {
                ((n.c) context).a(U(context, iS0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f2041e0) {
            return super.h(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = BitmapDescriptorFactory.HUE_RED;
        Configuration configuration2 = i.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationU = U(context, iS0, configuration2.equals(configuration3) ? null : e0(configuration2, configuration3));
        n.c cVar = new n.c(context, i.i.f73863d);
        cVar.a(configurationU);
        try {
            if (context.getTheme() != null) {
                j5.h.g.a(cVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.h(cVar);
    }

    protected s i0(int i11, boolean z11) {
        s[] sVarArr = this.G;
        if (sVarArr == null || sVarArr.length <= i11) {
            s[] sVarArr2 = new s[i11 + 1];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.G = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i11];
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(i11);
        sVarArr[i11] = sVar2;
        return sVar2;
    }

    final CharSequence j0() {
        Object obj = this.f2044d;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2051k;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public <T extends View> T k(int i11) {
        b0();
        return (T) this.f2046f.findViewById(i11);
    }

    final Window.Callback k0() {
        return this.f2046f.getCallback();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final androidx.appcompat.app.a m() {
        return new f();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public int n() {
        return this.N;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public MenuInflater o() {
        if (this.f2050j == null) {
            l0();
            ActionBar actionBar = this.f2049i;
            this.f2050j = new n.d(actionBar != null ? actionBar.j() : this.f2045e);
        }
        return this.f2050j;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return W(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public ActionBar p() {
        l0();
        return this.f2049i;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void q() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f2045e);
        if (layoutInflaterFrom.getFactory() == null) {
            androidx.core.view.m.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof e) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void r() {
        ActionBar actionBarP = p();
        if (actionBarP == null || !actionBarP.l()) {
            p0(0);
        }
    }

    public boolean r0() {
        return this.f2060t;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void s(Configuration configuration) {
        ActionBar actionBarP;
        if (this.A && this.f2061u && (actionBarP = p()) != null) {
            actionBarP.m(configuration);
        }
        androidx.appcompat.widget.h.b().g(this.f2045e);
        L(false);
    }

    int s0(@NonNull Context context, int i11) {
        if (i11 == -100) {
            return -1;
        }
        if (i11 != -1) {
            if (i11 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return h0(context).c();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3) {
                    return g0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i11;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void t(Bundle bundle) {
        String strC;
        this.J = true;
        L(false);
        c0();
        Object obj = this.f2044d;
        if (obj instanceof Activity) {
            try {
                strC = androidx.core.app.m.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                ActionBar actionBarD0 = D0();
                if (actionBarD0 == null) {
                    this.W = true;
                } else {
                    actionBarD0.t(true);
                }
            }
            AppCompatDelegate.c(this);
        }
        this.K = true;
    }

    boolean t0() {
        ActionMode actionMode = this.f2055o;
        if (actionMode != null) {
            actionMode.c();
            return true;
        }
        ActionBar actionBarP = p();
        return actionBarP != null && actionBarP.g();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    public void u() {
        if (this.f2044d instanceof Activity) {
            AppCompatDelegate.A(this);
        }
        if (this.T) {
            this.f2046f.getDecorView().removeCallbacks(this.V);
        }
        this.L = false;
        this.M = true;
        if (this.N != -100) {
            Object obj = this.f2044d;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2038b0.put(this.f2044d.getClass().getName(), Integer.valueOf(this.N));
            } else {
                f2038b0.remove(this.f2044d.getClass().getName());
            }
        } else {
            f2038b0.remove(this.f2044d.getClass().getName());
        }
        ActionBar actionBar = this.f2049i;
        if (actionBar != null) {
            actionBar.n();
        }
        R();
    }

    boolean u0(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            this.I = (keyEvent.getFlags() & 128) != 0;
        } else if (i11 == 82) {
            v0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void v(Bundle bundle) {
        b0();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void w() {
        ActionBar actionBarP = p();
        if (actionBarP != null) {
            actionBarP.z(true);
        }
    }

    boolean w0(int i11, KeyEvent keyEvent) {
        ActionBar actionBarP = p();
        if (actionBarP != null && actionBarP.o(i11, keyEvent)) {
            return true;
        }
        s sVar = this.H;
        if (sVar != null && E0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            s sVar2 = this.H;
            if (sVar2 != null) {
                sVar2.f2100n = true;
            }
            return true;
        }
        if (this.H == null) {
            s sVarI0 = i0(0, true);
            F0(sVarI0, keyEvent);
            boolean zE0 = E0(sVarI0, keyEvent.getKeyCode(), keyEvent, 1);
            sVarI0.f2099m = false;
            if (zE0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void x(Bundle bundle) {
    }

    boolean x0(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            boolean z11 = this.I;
            this.I = false;
            s sVarI0 = i0(0, false);
            if (sVarI0 != null && sVarI0.f2101o) {
                if (!z11) {
                    T(sVarI0, true);
                }
                return true;
            }
            if (t0()) {
                return true;
            }
        } else if (i11 == 82) {
            y0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void y() {
        this.L = true;
        e();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void z() {
        this.L = false;
        ActionBar actionBarP = p();
        if (actionBarP != null) {
            actionBarP.z(false);
        }
    }

    void z0(int i11) {
        ActionBar actionBarP;
        if (i11 != 108 || (actionBarP = p()) == null) {
            return;
        }
        actionBarP.h(true);
    }

    e(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private e(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        x0<String, Integer> x0Var;
        Integer num;
        androidx.appcompat.app.c cVarM0;
        this.f2059s = null;
        this.f2060t = true;
        this.N = -100;
        this.V = new a();
        this.f2045e = context;
        this.f2048h = dVar;
        this.f2044d = obj;
        if (this.N == -100 && (obj instanceof Dialog) && (cVarM0 = M0()) != null) {
            this.N = cVarM0.getDelegate().n();
        }
        if (this.N == -100 && (num = (x0Var = f2038b0).get(obj.getClass().getName())) != null) {
            this.N = num.intValue();
            x0Var.remove(obj.getClass().getName());
        }
        if (window != null) {
            N(window);
        }
        androidx.appcompat.widget.h.h();
    }
}
