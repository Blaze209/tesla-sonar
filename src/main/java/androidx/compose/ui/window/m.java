package androidx.compose.ui.window;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.ui.platform.j3;
import androidx.p003lifecycle.C2797h1;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.UUID;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.m0;
import p020r2.k2;
import p020r2.n3;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import p020r2.y3;
import z3.v;
import z3.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u000e\b\u0001\u0018\u0000 \u009e\u00012\u00020\u00012\u00020\u0002:\u0002\u009f\u0001BQ\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u0017J#\u0010&\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0017¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0004H\u0014¢\u0006\u0004\b*\u0010\u0017J\u000f\u0010+\u001a\u00020\u0004H\u0014¢\u0006\u0004\b+\u0010\u0017J\u001f\u0010/\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0010¢\u0006\u0004\b/\u00100J7\u00107\u001a\u00020\u00042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u00105\u001a\u00020,2\u0006\u00106\u001a\u00020,H\u0010¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u0002012\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J5\u0010=\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b=\u0010>J\u0015\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u0004¢\u0006\u0004\bC\u0010\u0017J\u000f\u0010D\u001a\u00020\u0004H\u0001¢\u0006\u0004\bD\u0010\u0017J\r\u0010E\u001a\u00020\u0004¢\u0006\u0004\bE\u0010\u0017J\r\u0010F\u001a\u00020\u0004¢\u0006\u0004\bF\u0010\u0017J\u0019\u0010H\u001a\u0002012\b\u0010:\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020,H\u0016¢\u0006\u0004\bJ\u0010KR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010VR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010WR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010YR \u0010^\u001a\u00020\u001f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010[\u0012\u0004\b]\u0010\u0017\u001a\u0004\b\\\u0010!R\"\u0010d\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010i\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010\u001eR5\u0010q\u001a\u0004\u0018\u00010j2\b\u0010k\u001a\u0004\u0018\u00010j8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR/\u0010@\u001a\u0004\u0018\u00010?2\b\u0010k\u001a\u0004\u0018\u00010?8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010l\u001a\u0004\br\u0010s\"\u0004\bt\u0010BR\u0018\u0010w\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010vR\u001b\u0010{\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u0010x\u001a\u0004\by\u0010zR\u001a\u0010~\u001a\u00020|8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010}R\u0016\u0010\u0081\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bE\u0010\u0080\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R;\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0005\b\u008a\u0001\u0010l\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0005\b&\u0010\u008d\u0001R(\u0010\u0091\u0001\u001a\u0002012\u0006\u0010k\u001a\u0002018\u0014@RX\u0094\u000e¢\u0006\u000f\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010zR\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0017\u0010\u0098\u0001\u001a\u00020,8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0017\u0010\u009a\u0001\u001a\u00020,8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u0097\u0001R\u0017\u0010\u009d\u0001\u001a\u00020\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 \u0001"}, d2 = {"Landroidx/compose/ui/window/m;", "Landroidx/compose/ui/platform/a;", "Landroidx/compose/ui/platform/j3;", "Lkotlin/Function0;", "Ljn0/h0;", "onDismissRequest", "Landroidx/compose/ui/window/s;", "properties", "", "testTag", "Landroid/view/View;", "composeView", "Lw4/d;", "density", "Landroidx/compose/ui/window/r;", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "Landroidx/compose/ui/window/o;", "popupLayoutHelper", "<init>", "(Lwn0/a;Landroidx/compose/ui/window/s;Ljava/lang/String;Landroid/view/View;Lw4/d;Landroidx/compose/ui/window/r;Ljava/util/UUID;Landroidx/compose/ui/window/o;)V", "n", "()V", "o", "v", "(Landroidx/compose/ui/window/s;)V", "Lw4/t;", "layoutDirection", "r", "(Lw4/t;)V", "Landroid/view/WindowManager$LayoutParams;", "l", "()Landroid/view/WindowManager$LayoutParams;", "q", "Lr2/q;", "parent", "content", "setContent", "(Lr2/q;Lwn0/p;)V", "a", "(Lr2/l;I)V", "onAttachedToWindow", "onDetachedFromWindow", "", "widthMeasureSpec", "heightMeasureSpec", "h", "(II)V", "", "changed", "left", "top", "right", "bottom", "g", "(ZIIII)V", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "s", "(Lwn0/a;Landroidx/compose/ui/window/s;Ljava/lang/String;Lw4/t;)V", "Lz3/v;", "parentLayoutCoordinates", "u", "(Lz3/v;)V", "p", "t", "w", "m", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "setLayoutDirection", "(I)V", IntegerTokenConverter.CONVERTER_KEY, "Lwn0/a;", "j", "Landroidx/compose/ui/window/s;", "k", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "Landroid/view/View;", "Landroidx/compose/ui/window/o;", "Landroid/view/WindowManager;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "getParams$ui_release$annotations", "params", "Landroidx/compose/ui/window/r;", "getPositionProvider", "()Landroidx/compose/ui/window/r;", "setPositionProvider", "(Landroidx/compose/ui/window/r;)V", "positionProvider", "Lw4/t;", "getParentLayoutDirection", "()Lw4/t;", "setParentLayoutDirection", "parentLayoutDirection", "Lw4/r;", "<set-?>", "Lr2/p1;", "getPopupContentSize-bOM6tXw", "()Lw4/r;", "setPopupContentSize-fhxjrPA", "(Lw4/r;)V", "popupContentSize", "getParentLayoutCoordinates", "()Lz3/v;", "setParentLayoutCoordinates", "Lw4/p;", "Lw4/p;", "parentBounds", "Lr2/y3;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Lw4/h;", Gender.FEMALE, "maxSupportedElevation", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "Landroidx/compose/runtime/snapshots/l;", "x", "Landroidx/compose/runtime/snapshots/l;", "snapshotStateObserver", "", "y", "Ljava/lang/Object;", "backCallback", "z", "getContent", "()Lwn0/p;", "(Lwn0/p;)V", "A", "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "", "B", "[I", "locationOnScreen", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "getSubCompositionView", "()Landroidx/compose/ui/platform/a;", "subCompositionView", "C", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class m extends androidx.compose.ui.platform.a implements j3 {
    private static final c C = new c(null);
    public static final int D = 8;
    private static final wn0.l<m, h0> E = b.f6404c;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final int[] locationOnScreen;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> onDismissRequest;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private s properties;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private String testTag;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final View composeView;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final o popupLayoutHelper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final WindowManager windowManager;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final WindowManager.LayoutParams params;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private r positionProvider;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private w4.t parentLayoutDirection;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p1 popupContentSize;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p1 parentLayoutCoordinates;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private w4.p parentBounds;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final y3 canCalculatePosition;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final float maxSupportedElevation;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Rect previousWindowVisibleFrame;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.runtime.snapshots.l snapshotStateObserver;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private Object backCallback;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final p1 content;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/window/m$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "Ljn0/h0;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline result) {
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/window/m;", "popupLayout", "Ljn0/h0;", "a", "(Landroidx/compose/ui/window/m;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<m, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f6404c = new b();

        b() {
            super(1);
        }

        public final void a(m mVar) {
            if (mVar.isAttachedToWindow()) {
                mVar.w();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(m mVar) {
            a(mVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/window/m$c;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/window/m;", "Ljn0/h0;", "onCommitAffectingPopupPosition", "Lwn0/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6406d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11) {
            super(2);
            this.f6406d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            m.this.a(lVar, k2.a(this.f6406d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6407a;

        static {
            int[] iArr = new int[w4.t.values().length];
            try {
                iArr[w4.t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w4.t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6407a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            v parentLayoutCoordinates = m.this.getParentLayoutCoordinates();
            if (parentLayoutCoordinates == null || !parentLayoutCoordinates.b0()) {
                parentLayoutCoordinates = null;
            }
            return Boolean.valueOf((parentLayoutCoordinates == null || m.this.m4getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "command", "b", "(Lwn0/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.l<wn0.a<? extends h0>, h0> {
        g() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(wn0.a aVar) {
            aVar.invoke();
        }

        public final void b(final wn0.a<h0> aVar) {
            Handler handler = m.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar.invoke();
                return;
            }
            Handler handler2 = m.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.window.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.g.c(aVar);
                    }
                });
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(wn0.a<? extends h0> aVar) {
            b(aVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m0 f6410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m f6411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w4.p f6412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f6413f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f6414g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(m0 m0Var, m mVar, w4.p pVar, long j11, long j12) {
            super(0);
            this.f6410c = m0Var;
            this.f6411d = mVar;
            this.f6412e = pVar;
            this.f6413f = j11;
            this.f6414g = j12;
        }

        public final void b() {
            this.f6410c.f86528a = this.f6411d.getPositionProvider().a(this.f6412e, this.f6413f, this.f6411d.getParentLayoutDirection(), this.f6414g);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ m(wn0.a aVar, s sVar, String str, View view, w4.d dVar, r rVar, UUID uuid, o oVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        o pVar;
        if ((i11 & 128) != 0) {
            pVar = Build.VERSION.SDK_INT >= 29 ? new p() : new q();
        } else {
            pVar = oVar;
        }
        this(aVar, sVar, str, view, dVar, rVar, uuid, pVar);
    }

    private final wn0.p<p020r2.l, Integer, h0> getContent() {
        return (wn0.p) this.content.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v getParentLayoutCoordinates() {
        return (v) this.parentLayoutCoordinates.getValue();
    }

    private final WindowManager.LayoutParams l() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = androidx.compose.ui.window.c.i(this.properties, androidx.compose.ui.window.c.j(this.composeView));
        layoutParams.type = 1002;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(d3.i.f59318d));
        return layoutParams;
    }

    private final void n() {
        if (!this.properties.getDismissOnBackPress() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.backCallback == null) {
            this.backCallback = androidx.compose.ui.window.f.b(this.onDismissRequest);
        }
        androidx.compose.ui.window.f.d(this, this.backCallback);
    }

    private final void o() {
        if (Build.VERSION.SDK_INT >= 33) {
            androidx.compose.ui.window.f.e(this, this.backCallback);
        }
        this.backCallback = null;
    }

    private final void r(w4.t layoutDirection) {
        int i11 = e.f6407a[layoutDirection.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i12);
    }

    private final void setContent(wn0.p<? super p020r2.l, ? super Integer, h0> pVar) {
        this.content.setValue(pVar);
    }

    private final void setParentLayoutCoordinates(v vVar) {
        this.parentLayoutCoordinates.setValue(vVar);
    }

    private final void v(s properties) {
        if (p013kotlin.jvm.internal.s.f(this.properties, properties)) {
            return;
        }
        if (properties.getUsePlatformDefaultWidth() && !this.properties.getUsePlatformDefaultWidth()) {
            WindowManager.LayoutParams layoutParams = this.params;
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        this.properties = properties;
        this.params.flags = androidx.compose.ui.window.c.i(properties, androidx.compose.ui.window.c.j(this.composeView));
        this.popupLayoutHelper.a(this.windowManager, this, this.params);
    }

    @Override // androidx.compose.ui.platform.a
    public void a(p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(-857613600);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-857613600, i12, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
            }
            getContent().invoke(lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(i11));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (event.getKeyCode() == 4 && this.properties.getDismissOnBackPress()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                wn0.a<h0> aVar = this.onDismissRequest;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // androidx.compose.ui.platform.a
    public void g(boolean changed, int left, int top, int right, int bottom) {
        View childAt;
        super.g(changed, left, top, right, bottom);
        if (this.properties.getUsePlatformDefaultWidth() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.params.width = childAt.getMeasuredWidth();
        this.params.height = childAt.getMeasuredHeight();
        this.popupLayoutHelper.a(this.windowManager, this, this.params);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: getParams$ui_release, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    public final w4.t getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final w4.r m4getPopupContentSizebOM6tXw() {
        return (w4.r) this.popupContentSize.getValue();
    }

    public final r getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.j3
    public androidx.compose.ui.platform.a getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    @Override // androidx.compose.ui.platform.j3
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    @Override // androidx.compose.ui.platform.a
    public void h(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.properties.getUsePlatformDefaultWidth()) {
            super.h(widthMeasureSpec, heightMeasureSpec);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void m() {
        androidx.p003lifecycle.View.b(this, null);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // androidx.compose.ui.platform.a, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.s();
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotStateObserver.t();
        this.snapshotStateObserver.j();
        o();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(event);
        }
        if (event != null && event.getAction() == 0 && (event.getX() < BitmapDescriptorFactory.HUE_RED || event.getX() >= getWidth() || event.getY() < BitmapDescriptorFactory.HUE_RED || event.getY() >= getHeight())) {
            wn0.a<h0> aVar = this.onDismissRequest;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (event == null || event.getAction() != 4) {
            return super.onTouchEvent(event);
        }
        wn0.a<h0> aVar2 = this.onDismissRequest;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    public final void p() {
        int[] iArr = this.locationOnScreen;
        int i11 = iArr[0];
        int i12 = iArr[1];
        this.composeView.getLocationOnScreen(iArr);
        int[] iArr2 = this.locationOnScreen;
        if (i11 == iArr2[0] && i12 == iArr2[1]) {
            return;
        }
        t();
    }

    public final void q() {
        this.windowManager.addView(this, this.params);
    }

    public final void s(wn0.a<h0> onDismissRequest, s properties, String testTag, w4.t layoutDirection) {
        this.onDismissRequest = onDismissRequest;
        this.testTag = testTag;
        v(properties);
        r(layoutDirection);
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    public final void setParentLayoutDirection(w4.t tVar) {
        this.parentLayoutDirection = tVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m5setPopupContentSizefhxjrPA(w4.r rVar) {
        this.popupContentSize.setValue(rVar);
    }

    public final void setPositionProvider(r rVar) {
        this.positionProvider = rVar;
    }

    public final void setTestTag(String str) {
        this.testTag = str;
    }

    public final void t() {
        v parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.b0()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jE = parentLayoutCoordinates.e();
            long jG = w.g(parentLayoutCoordinates);
            w4.p pVarA = w4.q.a(w4.o.a(Math.round(j3.g.m(jG)), Math.round(j3.g.n(jG))), jE);
            if (p013kotlin.jvm.internal.s.f(pVarA, this.parentBounds)) {
                return;
            }
            this.parentBounds = pVarA;
            w();
        }
    }

    public final void u(v parentLayoutCoordinates) {
        setParentLayoutCoordinates(parentLayoutCoordinates);
        t();
    }

    public final void w() {
        w4.r rVarM4getPopupContentSizebOM6tXw;
        w4.p pVar = this.parentBounds;
        if (pVar == null || (rVarM4getPopupContentSizebOM6tXw = m4getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long packedValue = rVarM4getPopupContentSizebOM6tXw.getPackedValue();
        Rect rect = this.previousWindowVisibleFrame;
        this.popupLayoutHelper.c(this.composeView, rect);
        w4.p pVarK = androidx.compose.ui.window.c.k(rect);
        long jA = w4.s.a(pVarK.k(), pVarK.e());
        m0 m0Var = new m0();
        m0Var.f86528a = w4.n.INSTANCE.a();
        this.snapshotStateObserver.o(this, E, new h(m0Var, this, pVar, jA, packedValue));
        this.params.x = w4.n.h(m0Var.f86528a);
        this.params.y = w4.n.i(m0Var.f86528a);
        if (this.properties.getExcludeFromSystemGesture()) {
            this.popupLayoutHelper.b(this, w4.r.g(jA), w4.r.f(jA));
        }
        this.popupLayoutHelper.a(this.windowManager, this, this.params);
    }

    public final void setContent(p020r2.q parent, wn0.p<? super p020r2.l, ? super Integer, h0> content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public m(wn0.a<h0> aVar, s sVar, String str, View view, w4.d dVar, r rVar, UUID uuid, o oVar) {
        super(view.getContext(), null, 0, 6, null);
        this.onDismissRequest = aVar;
        this.properties = sVar;
        this.testTag = str;
        this.composeView = view;
        this.popupLayoutHelper = oVar;
        Object systemService = view.getContext().getSystemService("window");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        this.params = l();
        this.positionProvider = rVar;
        this.parentLayoutDirection = w4.t.Ltr;
        this.popupContentSize = s3.d(null, null, 2, null);
        this.parentLayoutCoordinates = s3.d(null, null, 2, null);
        this.canCalculatePosition = n3.e(new f());
        float fG = w4.h.g(8);
        this.maxSupportedElevation = fG;
        this.previousWindowVisibleFrame = new Rect();
        this.snapshotStateObserver = new androidx.compose.runtime.snapshots.l(new g());
        setId(R.id.content);
        androidx.p003lifecycle.View.b(this, androidx.p003lifecycle.View.a(view));
        C2797h1.b(this, C2797h1.a(view));
        xa.e.b(this, xa.e.a(view));
        setTag(d3.h.H, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.O1(fG));
        setOutlineProvider(new a());
        this.content = s3.d(androidx.compose.ui.window.h.f6364a.a(), null, 2, null);
        this.locationOnScreen = new int[2];
    }
}
