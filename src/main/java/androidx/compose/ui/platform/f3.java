package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.MutableRect;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k3.a4;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 {2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002MOBA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ!\u0010$\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010*J7\u00101\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00152\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020,H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000bH\u0016¢\u0006\u0004\b3\u0010*J\u000f\u00104\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u0010*J\u000f\u00105\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u0010*J\"\u00108\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020:2\u0006\u00107\u001a\u00020\u0015H\u0016¢\u0006\u0004\b<\u0010=J9\u0010>\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016¢\u0006\u0004\b>\u0010?J\u001a\u0010B\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020@H\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001a\u0010-\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020@H\u0016ø\u0001\u0000¢\u0006\u0004\b-\u0010CJ\u000f\u0010D\u001a\u00020\u000bH\u0002¢\u0006\u0004\bD\u0010*J\u000f\u0010E\u001a\u00020\u000bH\u0002¢\u0006\u0004\bE\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010J\u001a\u0004\bK\u0010LR,\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010RR\u0016\u0010U\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010WR*\u0010]\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010T\u001a\u0004\bZ\u0010\u0017\"\u0004\b[\u0010\\R\u0016\u0010^\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010TR\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010`R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00010b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010cR\u001c\u0010g\u001a\u00020e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u0010fR\u0016\u0010h\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010TR\u001a\u0010l\u001a\u00020i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010f\u001a\u0004\bj\u0010kR\u0016\u0010n\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010mR\u0014\u0010p\u001a\u00020i8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010kR$\u0010v\u001a\u00020q2\u0006\u0010Y\u001a\u00020q8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0016\u0010z\u001a\u0004\u0018\u00010w8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006|"}, d2 = {"Landroidx/compose/ui/platform/f3;", "Landroid/view/View;", "Lb4/i1;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/g1;", "container", "Lkotlin/Function2;", "Lk3/j1;", "Ln3/c;", "Ljn0/h0;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/g1;Lwn0/p;Lwn0/a;)V", "Landroidx/compose/ui/graphics/d;", "scope", "k", "(Landroidx/compose/ui/graphics/d;)V", "", "hasOverlappingRendering", "()Z", "Lj3/g;", "position", "j", "(J)Z", "Lw4/r;", "size", IntegerTokenConverter.CONVERTER_KEY, "(J)V", "Lw4/n;", "m", "canvas", "parentLayer", "f", "(Lk3/j1;Ln3/c;)V", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "invalidate", "()V", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "destroy", "n", "forceLayout", "point", "inverse", "g", "(JZ)J", "Lj3/e;", "rect", "h", "(Lj3/e;Z)V", "o", "(Lwn0/p;Lwn0/a;)V", "Lk3/n3;", "matrix", "e", "([F)V", "w", "v", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/g1;", "getContainer", "()Landroidx/compose/ui/platform/g1;", "c", "Lwn0/p;", DateTokenConverter.CONVERTER_KEY, "Lwn0/a;", "Landroidx/compose/ui/platform/z1;", "Landroidx/compose/ui/platform/z1;", "outlineResolver", "Z", "clipToBounds", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "clipBoundsCache", "value", "u", "setInvalidated", "(Z)V", "isInvalidated", "drawnWithZ", "Lk3/k1;", "Lk3/k1;", "canvasHolder", "Landroidx/compose/ui/platform/u1;", "Landroidx/compose/ui/platform/u1;", "matrixCache", "Landroidx/compose/ui/graphics/f;", "J", "mTransformOrigin", "mHasOverlappingRendering", "", "getLayerId", "()J", "layerId", "I", "mutatedFields", "getOwnerViewId", "ownerViewId", "", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "Lk3/t3;", "getManualClipPath", "()Lk3/t3;", "manualClipPath", "p", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f3 extends View implements b4.i1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f5707q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final wn0.p<View, Matrix, jn0.h0> f5708r = b.f5729c;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final ViewOutlineProvider f5709s = new a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Method f5710t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static Field f5711u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static boolean f5712v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static boolean f5713w;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g1 container;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private wn0.p<? super k3.j1, ? super n3.c, jn0.h0> drawBlock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private wn0.a<jn0.h0> invalidateParentLayer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final z1 outlineResolver;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Rect clipBoundsCache;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean drawnWithZ;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k3.k1 canvasHolder;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final u1<View> matrixCache;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long mTransformOrigin;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean mHasOverlappingRendering;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long layerId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/f3$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Ljn0/h0;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            p013kotlin.jvm.internal.s.i(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline outlineB = ((f3) view).outlineResolver.b();
            p013kotlin.jvm.internal.s.h(outlineB);
            outline.set(outlineB);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "view", "Landroid/graphics/Matrix;", "matrix", "Ljn0/h0;", "a", "(Landroid/view/View;Landroid/graphics/Matrix;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<View, Matrix, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f5729c = new b();

        b() {
            super(2);
        }

        public final void a(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(View view, Matrix matrix) {
            a(view, matrix);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.f3$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/f3$c;", "", "<init>", "()V", "Landroid/view/View;", "view", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;)V", "", "<set-?>", "hasRetrievedMethod", "Z", "a", "()Z", "shouldUseDispatchDraw", "b", "c", "(Z)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getMatrix", "Lwn0/p;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return f3.f5712v;
        }

        public final boolean b() {
            return f3.f5713w;
        }

        public final void c(boolean z11) {
            f3.f5713w = z11;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void d(View view) {
            try {
                if (!a()) {
                    f3.f5712v = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        f3.f5710t = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        f3.f5711u = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        f3.f5710t = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        f3.f5711u = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = f3.f5710t;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = f3.f5711u;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = f3.f5711u;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = f3.f5710t;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/f3$d;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f5730a = new d();

        private d() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public f3(AndroidComposeView androidComposeView, g1 g1Var, wn0.p<? super k3.j1, ? super n3.c, jn0.h0> pVar, wn0.a<jn0.h0> aVar) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = g1Var;
        this.drawBlock = pVar;
        this.invalidateParentLayer = aVar;
        this.outlineResolver = new z1();
        this.canvasHolder = new k3.k1();
        this.matrixCache = new u1<>(f5708r);
        this.mTransformOrigin = androidx.compose.ui.graphics.f.INSTANCE.a();
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        g1Var.addView(this);
        this.layerId = View.generateViewId();
    }

    private final k3.t3 getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.e()) {
            return null;
        }
        return this.outlineResolver.d();
    }

    private final void setInvalidated(boolean z11) {
        if (z11 != this.isInvalidated) {
            this.isInvalidated = z11;
            this.ownerView.w0(this, z11);
        }
    }

    private final void v() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                p013kotlin.jvm.internal.s.h(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void w() {
        setOutlineProvider(this.outlineResolver.b() != null ? f5709s : null);
    }

    @Override // b4.i1
    public void destroy() {
        setInvalidated(false);
        this.ownerView.H0();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.F0(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        boolean z11;
        k3.k1 k1Var = this.canvasHolder;
        Canvas canvasB = k1Var.getAndroidCanvas().getInternalCanvas();
        k1Var.getAndroidCanvas().z(canvas);
        k3.e0 e0VarA = k1Var.getAndroidCanvas();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z11 = false;
        } else {
            e0VarA.u();
            this.outlineResolver.a(e0VarA);
            z11 = true;
        }
        wn0.p<? super k3.j1, ? super n3.c, jn0.h0> pVar = this.drawBlock;
        if (pVar != null) {
            pVar.invoke(e0VarA, null);
        }
        if (z11) {
            e0VarA.o();
        }
        k1Var.getAndroidCanvas().z(canvasB);
        setInvalidated(false);
    }

    @Override // b4.i1
    public void e(float[] matrix) {
        k3.n3.p(matrix, this.matrixCache.b(this));
    }

    @Override // b4.i1
    public void f(k3.j1 canvas, n3.c parentLayer) {
        boolean z11 = getElevation() > BitmapDescriptorFactory.HUE_RED;
        this.drawnWithZ = z11;
        if (z11) {
            canvas.p();
        }
        this.container.a(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.j();
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // b4.i1
    public long g(long point, boolean inverse) {
        if (!inverse) {
            return k3.n3.g(this.matrixCache.b(this), point);
        }
        float[] fArrA = this.matrixCache.a(this);
        return fArrA != null ? k3.n3.g(fArrA, point) : j3.g.INSTANCE.a();
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final g1 getContainer() {
        return this.container;
    }

    public long getLayerId() {
        return this.layerId;
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(this.ownerView);
        }
        return -1L;
    }

    @Override // b4.i1
    public void h(MutableRect rect, boolean inverse) {
        if (!inverse) {
            k3.n3.i(this.matrixCache.b(this), rect);
            return;
        }
        float[] fArrA = this.matrixCache.a(this);
        if (fArrA != null) {
            k3.n3.i(fArrA, rect);
        } else {
            rect.g(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // b4.i1
    public void i(long size) {
        int iG = w4.r.g(size);
        int iF = w4.r.f(size);
        if (iG == getWidth() && iF == getHeight()) {
            return;
        }
        setPivotX(androidx.compose.ui.graphics.f.f(this.mTransformOrigin) * iG);
        setPivotY(androidx.compose.ui.graphics.f.g(this.mTransformOrigin) * iF);
        w();
        layout(getLeft(), getTop(), getLeft() + iG, getTop() + iF);
        v();
        this.matrixCache.c();
    }

    @Override // android.view.View, b4.i1
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // b4.i1
    public boolean j(long position) {
        float fM = j3.g.m(position);
        float fN = j3.g.n(position);
        if (this.clipToBounds) {
            return BitmapDescriptorFactory.HUE_RED <= fM && fM < ((float) getWidth()) && BitmapDescriptorFactory.HUE_RED <= fN && fN < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.f(position);
        }
        return true;
    }

    @Override // b4.i1
    public void k(androidx.compose.ui.graphics.d scope) {
        wn0.a<jn0.h0> aVar;
        int iF = scope.getMutatedFields() | this.mutatedFields;
        if ((iF & 4096) != 0) {
            long jH1 = scope.getTransformOrigin();
            this.mTransformOrigin = jH1;
            setPivotX(androidx.compose.ui.graphics.f.f(jH1) * getWidth());
            setPivotY(androidx.compose.ui.graphics.f.g(this.mTransformOrigin) * getHeight());
        }
        if ((iF & 1) != 0) {
            setScaleX(scope.getScaleX());
        }
        if ((iF & 2) != 0) {
            setScaleY(scope.getScaleY());
        }
        if ((iF & 4) != 0) {
            setAlpha(scope.getAlpha());
        }
        if ((iF & 8) != 0) {
            setTranslationX(scope.getTranslationX());
        }
        if ((iF & 16) != 0) {
            setTranslationY(scope.getTranslationY());
        }
        if ((iF & 32) != 0) {
            setElevation(scope.getShadowElevation());
        }
        if ((iF & 1024) != 0) {
            setRotation(scope.getRotationZ());
        }
        if ((iF & 256) != 0) {
            setRotationX(scope.getRotationX());
        }
        if ((iF & 512) != 0) {
            setRotationY(scope.getRotationY());
        }
        if ((iF & 2048) != 0) {
            setCameraDistancePx(scope.getCameraDistance());
        }
        boolean z11 = false;
        boolean z12 = getManualClipPath() != null;
        boolean z13 = scope.getClip() && scope.getShape() != a4.a();
        if ((iF & 24576) != 0) {
            this.clipToBounds = scope.getClip() && scope.getShape() == a4.a();
            v();
            setClipToOutline(z13);
        }
        boolean zH = this.outlineResolver.h(scope.getOutline(), scope.getAlpha(), z13, scope.getShadowElevation(), scope.getSize());
        if (this.outlineResolver.getCacheIsDirty()) {
            w();
        }
        boolean z14 = getManualClipPath() != null;
        if (z12 != z14 || (z14 && zH)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > BitmapDescriptorFactory.HUE_RED && (aVar = this.invalidateParentLayer) != null) {
            aVar.invoke();
        }
        if ((iF & 7963) != 0) {
            this.matrixCache.c();
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            if ((iF & 64) != 0) {
                h3.f5755a.a(this, k3.r1.k(scope.getAmbientShadowColor()));
            }
            if ((iF & 128) != 0) {
                h3.f5755a.b(this, k3.r1.k(scope.getSpotShadowColor()));
            }
        }
        if (i11 >= 31 && (131072 & iF) != 0) {
            i3 i3Var = i3.f5767a;
            scope.I();
            i3Var.a(this, null);
        }
        if ((iF & 32768) != 0) {
            int iY = scope.getCompositingStrategy();
            androidx.compose.ui.graphics.a.Companion companion = androidx.compose.ui.graphics.a.INSTANCE;
            if (androidx.compose.ui.graphics.a.e(iY, companion.c())) {
                setLayerType(2, null);
            } else {
                if (androidx.compose.ui.graphics.a.e(iY, companion.b())) {
                    setLayerType(0, null);
                } else {
                    setLayerType(0, null);
                }
                this.mHasOverlappingRendering = z11;
            }
            z11 = true;
            this.mHasOverlappingRendering = z11;
        }
        this.mutatedFields = scope.getMutatedFields();
    }

    @Override // b4.i1
    public void l(float[] matrix) {
        float[] fArrA = this.matrixCache.a(this);
        if (fArrA != null) {
            k3.n3.p(matrix, fArrA);
        }
    }

    @Override // b4.i1
    public void m(long position) {
        int iH = w4.n.h(position);
        if (iH != getLeft()) {
            offsetLeftAndRight(iH - getLeft());
            this.matrixCache.c();
        }
        int i11 = w4.n.i(position);
        if (i11 != getTop()) {
            offsetTopAndBottom(i11 - getTop());
            this.matrixCache.c();
        }
    }

    @Override // b4.i1
    public void n() {
        if (!this.isInvalidated || f5713w) {
            return;
        }
        INSTANCE.d(this);
        setInvalidated(false);
    }

    @Override // b4.i1
    public void o(wn0.p<? super k3.j1, ? super n3.c, jn0.h0> drawBlock, wn0.a<jn0.h0> invalidateParentLayer) {
        this.container.addView(this);
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = androidx.compose.ui.graphics.f.INSTANCE.a();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
    }

    public final void setCameraDistancePx(float f11) {
        setCameraDistance(f11 * getResources().getDisplayMetrics().densityDpi);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }
}
