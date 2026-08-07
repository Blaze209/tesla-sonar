package v1;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.WeakHashMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0001\u0015B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010 \u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\"\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b!\u0010\u0018R\u0017\u0010$\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u0017\u0010&\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b%\u0010\u0018R\u0017\u0010(\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u0017\u0010*\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u0017\u00100\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00105\u001a\u0002018\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R\u0017\u00107\u001a\u0002018\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b6\u00104R\u0017\u0010:\u001a\u0002018\u0006¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\b9\u00104R\u0017\u0010=\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b<\u0010/R\u0017\u0010@\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b?\u0010/R\u0017\u0010C\u001a\u00020+8\u0006¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\bB\u0010/R\u0017\u0010F\u001a\u00020+8\u0006¢\u0006\f\n\u0004\bD\u0010-\u001a\u0004\bE\u0010/R\u0017\u0010I\u001a\u00020+8\u0006¢\u0006\f\n\u0004\bG\u0010-\u001a\u0004\bH\u0010/R\u0017\u0010L\u001a\u00020+8\u0006¢\u0006\f\n\u0004\bJ\u0010-\u001a\u0004\bK\u0010/R\u0017\u0010O\u001a\u00020+8\u0006¢\u0006\f\n\u0004\bM\u0010-\u001a\u0004\bN\u0010/R\u0017\u0010T\u001a\u00020P8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\b\u001c\u0010SR\u0016\u0010W\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006]"}, d2 = {"Lv1/n0;", "", "Landroidx/core/view/WindowInsetsCompat;", "insets", "Landroid/view/View;", "view", "<init>", "(Landroidx/core/view/WindowInsetsCompat;Landroid/view/View;)V", "Ljn0/h0;", "h", "(Landroid/view/View;)V", "b", "windowInsets", "", "types", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/core/view/WindowInsetsCompat;I)V", "k", "(Landroidx/core/view/WindowInsetsCompat;)V", "l", "Lv1/a;", "a", "Lv1/a;", "getCaptionBar", "()Lv1/a;", "captionBar", "getDisplayCutout", "displayCutout", "c", DateTokenConverter.CONVERTER_KEY, "ime", "getMandatorySystemGestures", "mandatorySystemGestures", "e", "navigationBars", "f", "statusBars", "g", "systemBars", "getSystemGestures", "systemGestures", "getTappableElement", "tappableElement", "Lv1/l0;", "j", "Lv1/l0;", "getWaterfall", "()Lv1/l0;", "waterfall", "Lv1/m0;", "Lv1/m0;", "getSafeDrawing", "()Lv1/m0;", "safeDrawing", "getSafeGestures", "safeGestures", "m", "getSafeContent", "safeContent", "n", "getCaptionBarIgnoringVisibility", "captionBarIgnoringVisibility", "o", "getNavigationBarsIgnoringVisibility", "navigationBarsIgnoringVisibility", "p", "getStatusBarsIgnoringVisibility", "statusBarsIgnoringVisibility", "q", "getSystemBarsIgnoringVisibility", "systemBarsIgnoringVisibility", "r", "getTappableElementIgnoringVisibility", "tappableElementIgnoringVisibility", "s", "getImeAnimationTarget", "imeAnimationTarget", "t", "getImeAnimationSource", "imeAnimationSource", "", "u", "Z", "()Z", "consumes", "v", "I", "accessCount", "Lv1/r;", "w", "Lv1/r;", "insetsListener", "x", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n0 {
    private static boolean A;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f117524y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final WeakHashMap<View, n0> f117525z = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a captionBar;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a displayCutout;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a ime;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a mandatorySystemGestures;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a navigationBars;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a statusBars;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a systemBars;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a systemGestures;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final a tappableElement;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l0 waterfall;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final m0 safeDrawing;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final m0 safeGestures;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final m0 safeContent;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final l0 captionBarIgnoringVisibility;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final l0 navigationBarsIgnoringVisibility;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final l0 statusBarsIgnoringVisibility;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final l0 systemBarsIgnoringVisibility;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final l0 tappableElementIgnoringVisibility;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final l0 imeAnimationTarget;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final l0 imeAnimationSource;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean consumes;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int accessCount;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final r insetsListener;

    /* JADX INFO: renamed from: v1.n0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lv1/n0$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lv1/n0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;)Lv1/n0;", "Landroidx/core/view/WindowInsetsCompat;", "windowInsets", "", "type", "", "name", "Lv1/a;", "e", "(Landroidx/core/view/WindowInsetsCompat;ILjava/lang/String;)Lv1/a;", "Lv1/l0;", "f", "(Landroidx/core/view/WindowInsetsCompat;ILjava/lang/String;)Lv1/l0;", "c", "(Lr2/l;I)Lv1/n0;", "", "testInsets", "Z", "Ljava/util/WeakHashMap;", "viewMap", "Ljava/util/WeakHashMap;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: v1.n0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
        static final class C2524a extends p013kotlin.jvm.internal.u implements wn0.l<p020r2.l0, p020r2.k0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ n0 f117549c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ View f117550d;

            /* JADX INFO: renamed from: v1.n0$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"v1/n0$a$a$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class C2525a implements p020r2.k0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ n0 f117551a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f117552b;

                public C2525a(n0 n0Var, View view) {
                    this.f117551a = n0Var;
                    this.f117552b = view;
                }

                @Override // p020r2.k0
                public void dispose() {
                    this.f117551a.b(this.f117552b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2524a(n0 n0Var, View view) {
                super(1);
                this.f117549c = n0Var;
                this.f117550d = view;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p020r2.k0 invoke(p020r2.l0 l0Var) {
                this.f117549c.h(this.f117550d);
                return new C2525a(this.f117549c, this.f117550d);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final n0 d(View view) {
            n0 n0Var;
            synchronized (n0.f117525z) {
                try {
                    WeakHashMap weakHashMap = n0.f117525z;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        n0 n0Var2 = new n0(null, view, false ? 1 : 0);
                        weakHashMap.put(view, n0Var2);
                        obj2 = n0Var2;
                    }
                    n0Var = (n0) obj2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return n0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final a e(WindowInsetsCompat windowInsets, int type, String name) {
            a aVar = new a(type, name);
            if (windowInsets != null) {
                aVar.h(windowInsets, type);
            }
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final l0 f(WindowInsetsCompat windowInsets, int type, String name) {
            k5.e eVarG;
            if (windowInsets == null || (eVarG = windowInsets.g(type)) == null) {
                eVarG = k5.e.f84923e;
            }
            return s0.a(eVarG, name);
        }

        public final n0 c(p020r2.l lVar, int i11) {
            if (p020r2.o.J()) {
                p020r2.o.S(-1366542614, i11, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            View view = (View) lVar.U(AndroidCompositionLocals_androidKt.k());
            n0 n0VarD = d(view);
            boolean zK = lVar.K(n0VarD) | lVar.K(view);
            Object objI = lVar.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new C2524a(n0VarD, view);
                lVar.B(objI);
            }
            Function0.c(n0VarD, (wn0.l) objI, lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            return n0VarD;
        }

        private Companion() {
        }
    }

    public /* synthetic */ n0(WindowInsetsCompat windowInsetsCompat, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsetsCompat, view);
    }

    public static /* synthetic */ void j(n0 n0Var, WindowInsetsCompat windowInsetsCompat, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        n0Var.i(windowInsetsCompat, i11);
    }

    public final void b(View view) {
        int i11 = this.accessCount - 1;
        this.accessCount = i11;
        if (i11 == 0) {
            ViewCompat.E0(view, null);
            ViewCompat.L0(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getConsumes() {
        return this.consumes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getIme() {
        return this.ime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getNavigationBars() {
        return this.navigationBars;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getStatusBars() {
        return this.statusBars;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final a getSystemBars() {
        return this.systemBars;
    }

    public final void h(View view) {
        if (this.accessCount == 0) {
            ViewCompat.E0(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            ViewCompat.L0(view, this.insetsListener);
        }
        this.accessCount++;
    }

    public final void i(WindowInsetsCompat windowInsets, int types) {
        if (A) {
            WindowInsets windowInsetsX = windowInsets.x();
            p013kotlin.jvm.internal.s.h(windowInsetsX);
            windowInsets = WindowInsetsCompat.y(windowInsetsX);
        }
        this.captionBar.h(windowInsets, types);
        this.ime.h(windowInsets, types);
        this.displayCutout.h(windowInsets, types);
        this.navigationBars.h(windowInsets, types);
        this.statusBars.h(windowInsets, types);
        this.systemBars.h(windowInsets, types);
        this.systemGestures.h(windowInsets, types);
        this.tappableElement.h(windowInsets, types);
        this.mandatorySystemGestures.h(windowInsets, types);
        if (types == 0) {
            this.captionBarIgnoringVisibility.f(s0.e(windowInsets.g(WindowInsetsCompat.n.a())));
            this.navigationBarsIgnoringVisibility.f(s0.e(windowInsets.g(WindowInsetsCompat.n.f())));
            this.statusBarsIgnoringVisibility.f(s0.e(windowInsets.g(WindowInsetsCompat.n.g())));
            this.systemBarsIgnoringVisibility.f(s0.e(windowInsets.g(WindowInsetsCompat.n.h())));
            this.tappableElementIgnoringVisibility.f(s0.e(windowInsets.g(WindowInsetsCompat.n.j())));
            androidx.core.view.j jVarE = windowInsets.e();
            if (jVarE != null) {
                this.waterfall.f(s0.e(jVarE.e()));
            }
        }
        androidx.compose.runtime.snapshots.g.INSTANCE.n();
    }

    public final void k(WindowInsetsCompat windowInsets) {
        this.imeAnimationSource.f(s0.e(windowInsets.f(WindowInsetsCompat.n.c())));
    }

    public final void l(WindowInsetsCompat windowInsets) {
        this.imeAnimationTarget.f(s0.e(windowInsets.f(WindowInsetsCompat.n.c())));
    }

    private n0(WindowInsetsCompat windowInsetsCompat, View view) {
        androidx.core.view.j jVarE;
        k5.e eVarE;
        Companion companion = INSTANCE;
        this.captionBar = companion.e(windowInsetsCompat, WindowInsetsCompat.n.a(), "captionBar");
        a aVarE = companion.e(windowInsetsCompat, WindowInsetsCompat.n.b(), "displayCutout");
        this.displayCutout = aVarE;
        a aVarE2 = companion.e(windowInsetsCompat, WindowInsetsCompat.n.c(), "ime");
        this.ime = aVarE2;
        a aVarE3 = companion.e(windowInsetsCompat, WindowInsetsCompat.n.e(), "mandatorySystemGestures");
        this.mandatorySystemGestures = aVarE3;
        this.navigationBars = companion.e(windowInsetsCompat, WindowInsetsCompat.n.f(), "navigationBars");
        this.statusBars = companion.e(windowInsetsCompat, WindowInsetsCompat.n.g(), "statusBars");
        a aVarE4 = companion.e(windowInsetsCompat, WindowInsetsCompat.n.h(), "systemBars");
        this.systemBars = aVarE4;
        a aVarE5 = companion.e(windowInsetsCompat, WindowInsetsCompat.n.i(), "systemGestures");
        this.systemGestures = aVarE5;
        a aVarE6 = companion.e(windowInsetsCompat, WindowInsetsCompat.n.j(), "tappableElement");
        this.tappableElement = aVarE6;
        l0 l0VarA = s0.a((windowInsetsCompat == null || (jVarE = windowInsetsCompat.e()) == null || (eVarE = jVarE.e()) == null) ? k5.e.f84923e : eVarE, "waterfall");
        this.waterfall = l0VarA;
        m0 m0VarF = o0.f(o0.f(aVarE4, aVarE2), aVarE);
        this.safeDrawing = m0VarF;
        m0 m0VarF2 = o0.f(o0.f(o0.f(aVarE6, aVarE3), aVarE5), l0VarA);
        this.safeGestures = m0VarF2;
        this.safeContent = o0.f(m0VarF, m0VarF2);
        this.captionBarIgnoringVisibility = companion.f(windowInsetsCompat, WindowInsetsCompat.n.a(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.f(windowInsetsCompat, WindowInsetsCompat.n.f(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.f(windowInsetsCompat, WindowInsetsCompat.n.g(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.f(windowInsetsCompat, WindowInsetsCompat.n.h(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.f(windowInsetsCompat, WindowInsetsCompat.n.j(), "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = companion.f(windowInsetsCompat, WindowInsetsCompat.n.c(), "imeAnimationTarget");
        this.imeAnimationSource = companion.f(windowInsetsCompat, WindowInsetsCompat.n.c(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(d3.h.I) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : true;
        this.insetsListener = new r(this);
    }
}
