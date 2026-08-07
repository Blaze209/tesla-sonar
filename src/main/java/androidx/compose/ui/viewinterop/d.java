package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.r3;
import androidx.compose.ui.platform.y1;
import androidx.core.view.y;
import androidx.core.view.z;
import androidx.p003lifecycle.LifecycleOwner;
import b4.g0;
import b4.j1;
import b4.k1;
import b4.l1;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.List;
import jn0.h0;
import jn0.t;
import k3.f0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import z3.i0;
import z3.j0;
import z3.k0;
import z3.r;
import z3.v;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000 Ë\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001!B9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010 J\u001f\u0010%\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0014¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u001e¢\u0006\u0004\b'\u0010 J7\u0010-\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0014¢\u0006\u0004\b-\u0010.J\u0011\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u001e2\u0006\u00102\u001a\u00020(H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001eH\u0014¢\u0006\u0004\b5\u0010 J\u000f\u00106\u001a\u00020\u001eH\u0014¢\u0006\u0004\b6\u0010 J%\u0010<\u001a\u0004\u0018\u00010;2\b\u00108\u001a\u0004\u0018\u0001072\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010@\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\r2\u0006\u0010?\u001a\u00020\rH\u0016¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u001e¢\u0006\u0004\bB\u0010 J\u0017\u0010D\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020\tH\u0014¢\u0006\u0004\bD\u0010EJ\u0019\u0010H\u001a\u00020(2\b\u0010G\u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020(H\u0016¢\u0006\u0004\bJ\u0010KJ/\u0010N\u001a\u00020(2\u0006\u0010>\u001a\u00020\r2\u0006\u0010?\u001a\u00020\r2\u0006\u0010L\u001a\u00020\t2\u0006\u0010M\u001a\u00020\tH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\tH\u0016¢\u0006\u0004\bP\u0010QJ/\u0010R\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\r2\u0006\u0010?\u001a\u00020\r2\u0006\u0010L\u001a\u00020\t2\u0006\u0010M\u001a\u00020\tH\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010T\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\r2\u0006\u0010M\u001a\u00020\tH\u0016¢\u0006\u0004\bT\u0010UJG\u0010[\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\r2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t2\u0006\u0010X\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010M\u001a\u00020\t2\u0006\u0010Z\u001a\u000207H\u0016¢\u0006\u0004\b[\u0010\\J?\u0010[\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\r2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t2\u0006\u0010X\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010M\u001a\u00020\tH\u0016¢\u0006\u0004\b[\u0010]J7\u0010`\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\r2\u0006\u0010^\u001a\u00020\t2\u0006\u0010_\u001a\u00020\t2\u0006\u0010Z\u001a\u0002072\u0006\u0010M\u001a\u00020\tH\u0016¢\u0006\u0004\b`\u0010aJ/\u0010e\u001a\u00020(2\u0006\u0010?\u001a\u00020\r2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020b2\u0006\u0010Z\u001a\u00020(H\u0016¢\u0006\u0004\be\u0010fJ'\u0010g\u001a\u00020(2\u0006\u0010?\u001a\u00020\r2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020bH\u0016¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020(H\u0016¢\u0006\u0004\bi\u0010KR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010jR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010kR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR6\u0010y\u001a\b\u0012\u0004\u0012\u00020\u001e0q2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u001e0q8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0016\u0010|\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R8\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0q2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u001e0q8\u0006@DX\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010t\u001a\u0004\b\u007f\u0010v\"\u0005\b\u0080\u0001\u0010xR:\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0q2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u001e0q8\u0006@DX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010t\u001a\u0005\b\u0083\u0001\u0010v\"\u0005\b\u0084\u0001\u0010xR3\u0010\u008d\u0001\u001a\u00030\u0086\u00012\u0007\u0010r\u001a\u00030\u0086\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R9\u0010\u0095\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0086\u0001\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u008e\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R2\u0010\u009c\u0001\u001a\u00030\u0096\u00012\u0007\u0010r\u001a\u00030\u0096\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u001f\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R8\u0010\u009f\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0096\u0001\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u008e\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b*\u0010\u0090\u0001\u001a\u0006\b\u009d\u0001\u0010\u0092\u0001\"\u0006\b\u009e\u0001\u0010\u0094\u0001R6\u0010¦\u0001\u001a\u0005\u0018\u00010 \u00012\t\u0010r\u001a\u0005\u0018\u00010 \u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bB\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R7\u0010®\u0001\u001a\u0005\u0018\u00010§\u00012\t\u0010r\u001a\u0005\u0018\u00010§\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R\u001b\u0010¯\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010tR\u001b\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010tR8\u0010´\u0001\u001a\u0011\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u008e\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010\u0090\u0001\u001a\u0006\b²\u0001\u0010\u0092\u0001\"\u0006\b³\u0001\u0010\u0094\u0001R\u0015\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010µ\u0001R\u0018\u0010·\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010jR\u0017\u0010¸\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010jR\u0018\u0010¼\u0001\u001a\u00030¹\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0018\u0010¾\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b½\u0001\u0010{R\u001d\u0010Ä\u0001\u001a\u00030¿\u00018\u0006¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010È\u0001\u001a\u00030Å\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0016\u0010Ê\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010K¨\u0006Ì\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/d;", "Landroid/view/ViewGroup;", "Landroidx/core/view/y;", "Lr2/k;", "Lb4/k1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lr2/q;", "parentContext", "", "compositeKeyHash", "Lu3/b;", "dispatcher", "Landroid/view/View;", "view", "Lb4/j1;", "owner", "<init>", "(Landroid/content/Context;Lr2/q;ILu3/b;Landroid/view/View;Lb4/j1;)V", "min", "max", "preferred", "o", "(III)I", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Ljn0/h0;", "k", "()V", "b", "a", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "p", "", "changed", "l", "t", "r", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "m", "visibility", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "shouldDelayChildPressedState", "()Z", "axes", "type", "onStartNestedScroll", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "onNestedScrollAccepted", "(Landroid/view/View;Landroid/view/View;II)V", "onStopNestedScroll", "(Landroid/view/View;I)V", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "onNestedScroll", "(Landroid/view/View;IIIII[I)V", "(Landroid/view/View;IIIII)V", "dx", "dy", "onNestedPreScroll", "(Landroid/view/View;II[II)V", "", "velocityX", "velocityY", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "I", "Lu3/b;", "c", "Landroid/view/View;", "getView", DateTokenConverter.CONVERTER_KEY, "Lb4/j1;", "Lkotlin/Function0;", "value", "e", "Lwn0/a;", "getUpdate", "()Lwn0/a;", "setUpdate", "(Lwn0/a;)V", "update", "f", "Z", "hasUpdateBlock", "<set-?>", "g", "getReset", "setReset", "reset", "h", "getRelease", "setRelease", "release", "Landroidx/compose/ui/d;", IntegerTokenConverter.CONVERTER_KEY, "Landroidx/compose/ui/d;", "getModifier", "()Landroidx/compose/ui/d;", "setModifier", "(Landroidx/compose/ui/d;)V", "modifier", "Lkotlin/Function1;", "j", "Lwn0/l;", "getOnModifierChanged$ui_release", "()Lwn0/l;", "setOnModifierChanged$ui_release", "(Lwn0/l;)V", "onModifierChanged", "Lw4/d;", "Lw4/d;", "getDensity", "()Lw4/d;", "setDensity", "(Lw4/d;)V", "density", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycleOwner", "Lxa/d;", "n", "Lxa/d;", "getSavedStateRegistryOwner", "()Lxa/d;", "setSavedStateRegistryOwner", "(Lxa/d;)V", "savedStateRegistryOwner", "runUpdate", "runInvalidate", "q", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "[I", "s", "lastWidthMeasureSpec", "lastHeightMeasureSpec", "Landroidx/core/view/z;", "u", "Landroidx/core/view/z;", "nestedScrollingParentHelper", "v", "isDrawing", "Lb4/g0;", "w", "Lb4/g0;", "getLayoutNode", "()Lb4/g0;", "layoutNode", "Lb4/l1;", "getSnapshotObserver", "()Lb4/l1;", "snapshotObserver", "u0", "isValidOwnerScope", "x", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class d extends ViewGroup implements y, p020r2.k, k1 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f6198y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final wn0.l<d, h0> f6199z = a.f6223c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int compositeKeyHash;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u3.b dispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j1 owner;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> update;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hasUpdateBlock;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> reset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> release;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.d modifier;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super androidx.compose.ui.d, h0> onModifierChanged;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private w4.d density;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super w4.d, h0> onDensityChanged;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private xa.d savedStateRegistryOwner;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> runUpdate;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> runInvalidate;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super Boolean, h0> onRequestDisallowInterceptTouchEvent;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int[] location;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int lastWidthMeasureSpec;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int lastHeightMeasureSpec;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final z nestedScrollingParentHelper;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean isDrawing;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final g0 layoutNode;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/viewinterop/d;", "it", "Ljn0/h0;", "b", "(Landroidx/compose/ui/viewinterop/d;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.l<d, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f6223c = new a();

        a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(wn0.a aVar) {
            aVar.invoke();
        }

        public final void b(d dVar) {
            Handler handler = dVar.getHandler();
            final wn0.a aVar = dVar.runUpdate;
            handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.a.c(aVar);
                }
            });
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(d dVar) {
            b(dVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/d;", "it", "Ljn0/h0;", "a", "(Landroidx/compose/ui/d;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.l<androidx.compose.ui.d, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0 f6224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f6225d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g0 g0Var, androidx.compose.ui.d dVar) {
            super(1);
            this.f6224c = g0Var;
            this.f6225d = dVar;
        }

        public final void a(androidx.compose.ui.d dVar) {
            this.f6224c.i(dVar.g(this.f6225d));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(androidx.compose.ui.d dVar) {
            a(dVar);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw4/d;", "it", "Ljn0/h0;", "a", "(Lw4/d;)V"}, k = 3, mv = {1, 8, 0})
    static final class C0137d extends u implements wn0.l<w4.d, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0 f6226c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0137d(g0 g0Var) {
            super(1);
            this.f6226c = g0Var;
        }

        public final void a(w4.d dVar) {
            this.f6226c.d(dVar);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w4.d dVar) {
            a(dVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/j1;", "owner", "Ljn0/h0;", "a", "(Lb4/j1;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.l<j1, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g0 f6228d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g0 g0Var) {
            super(1);
            this.f6228d = g0Var;
        }

        public final void a(j1 j1Var) {
            AndroidComposeView androidComposeView = j1Var instanceof AndroidComposeView ? (AndroidComposeView) j1Var : null;
            if (androidComposeView != null) {
                androidComposeView.X(d.this, this.f6228d);
            }
            ViewParent parent = d.this.getView().getParent();
            d dVar = d.this;
            if (parent != dVar) {
                dVar.addView(dVar.getView());
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(j1 j1Var) {
            a(j1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/j1;", "owner", "Ljn0/h0;", "a", "(Lb4/j1;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.l<j1, h0> {
        f() {
            super(1);
        }

        public final void a(j1 j1Var) {
            AndroidComposeView androidComposeView = j1Var instanceof AndroidComposeView ? (AndroidComposeView) j1Var : null;
            if (androidComposeView != null) {
                androidComposeView.G0(d.this);
            }
            d.this.removeAllViewsInLayout();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(j1 j1Var) {
            a(j1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/f;", "Ljn0/h0;", "a", "(Lm3/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends u implements wn0.l<m3.f, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g0 f6237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f6238e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(g0 g0Var, d dVar) {
            super(1);
            this.f6237d = g0Var;
            this.f6238e = dVar;
        }

        public final void a(m3.f fVar) {
            d dVar = d.this;
            g0 g0Var = this.f6237d;
            d dVar2 = this.f6238e;
            k3.j1 j1VarA = fVar.getDrawContext().a();
            if (dVar.getView().getVisibility() != 8) {
                dVar.isDrawing = true;
                j1 owner = g0Var.getOwner();
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.g0(dVar2, f0.d(j1VarA));
                }
                dVar.isDrawing = false;
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(m3.f fVar) {
            a(fVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz3/v;", "it", "Ljn0/h0;", "a", "(Lz3/v;)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends u implements wn0.l<v, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g0 f6240d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(g0 g0Var) {
            super(1);
            this.f6240d = g0Var;
        }

        public final void a(v vVar) {
            androidx.compose.ui.viewinterop.e.f(d.this, this.f6240d);
            d.this.owner.e(d.this);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(v vVar) {
            a(vVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {565, 570}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6241n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f6242o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ d f6243p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f6244q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z11, d dVar, long j11, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f6242o = z11;
            this.f6243p = dVar;
            this.f6244q = j11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new k(this.f6242o, this.f6243p, this.f6244q, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r4.a(r5, r7, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r1.a(r2, r4, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            return r0;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f6241n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r11)
                goto L58
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                jn0.t.b(r11)
                r6 = r10
                goto L58
            L1f:
                jn0.t.b(r11)
                boolean r11 = r10.f6242o
                if (r11 != 0) goto L3f
                androidx.compose.ui.viewinterop.d r11 = r10.f6243p
                u3.b r4 = androidx.compose.ui.viewinterop.d.d(r11)
                w4.y$a r11 = w4.y.INSTANCE
                long r5 = r11.a()
                long r7 = r10.f6244q
                r10.f6241n = r3
                r9 = r10
                java.lang.Object r11 = r4.a(r5, r7, r9)
                r6 = r9
                if (r11 != r0) goto L58
                goto L57
            L3f:
                r6 = r10
                androidx.compose.ui.viewinterop.d r11 = r6.f6243p
                u3.b r1 = androidx.compose.ui.viewinterop.d.d(r11)
                r11 = r2
                long r2 = r6.f6244q
                w4.y$a r4 = w4.y.INSTANCE
                long r4 = r4.a()
                r6.f6241n = r11
                java.lang.Object r11 = r1.a(r2, r4, r6)
                if (r11 != r0) goto L58
            L57:
                return r0
            L58:
                jn0.h0 r11 = jn0.h0.f84049a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.d.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {583}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6245n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f6247p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(long j11, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f6247p = j11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new l(this.f6247p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f6245n;
            if (i11 == 0) {
                t.b(obj);
                u3.b bVar = d.this.dispatcher;
                long j11 = this.f6247p;
                this.f6245n = 1;
                if (bVar.c(j11, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class m extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f6248c = new m();

        m() {
            super(0);
        }

        public final void b() {
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class n extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f6249c = new n();

        n() {
            super(0);
        }

        public final void b() {
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class o extends u implements wn0.a<h0> {
        o() {
            super(0);
        }

        public final void b() {
            d.this.getLayoutNode().D0();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class p extends u implements wn0.a<h0> {
        p() {
            super(0);
        }

        public final void b() {
            if (d.this.hasUpdateBlock && d.this.isAttachedToWindow()) {
                ViewParent parent = d.this.getView().getParent();
                d dVar = d.this;
                if (parent == dVar) {
                    dVar.getSnapshotObserver().i(d.this, d.f6199z, d.this.getUpdate());
                }
            }
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class q extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f6252c = new q();

        q() {
            super(0);
        }

        public final void b() {
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    public d(Context context, p020r2.q qVar, int i11, u3.b bVar, View view, j1 j1Var) {
        super(context);
        this.compositeKeyHash = i11;
        this.dispatcher = bVar;
        this.view = view;
        this.owner = j1Var;
        if (qVar != null) {
            r3.i(this, qVar);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.update = q.f6252c;
        this.reset = n.f6249c;
        this.release = m.f6248c;
        androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
        this.modifier = companion;
        this.density = w4.f.b(1.0f, BitmapDescriptorFactory.HUE_RED, 2, null);
        this.runUpdate = new p();
        this.runInvalidate = new o();
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new z(this);
        g0 g0Var = new g0(false, 0, 3, null);
        g0Var.C1(this);
        androidx.compose.ui.d dVarA = androidx.compose.ui.layout.c.a(androidx.compose.ui.draw.b.b(v3.h0.a(g4.o.c(androidx.compose.ui.input.nestedscroll.a.a(companion, androidx.compose.ui.viewinterop.e.f6253a, bVar), true, h.f6235c), this), new i(g0Var, this)), new j(g0Var));
        g0Var.e(i11);
        g0Var.i(this.modifier.g(dVarA));
        this.onModifierChanged = new c(g0Var, dVarA);
        g0Var.d(this.density);
        this.onDensityChanged = new C0137d(g0Var);
        g0Var.G1(new e(g0Var));
        g0Var.H1(new f());
        g0Var.g(new g(g0Var));
        this.layoutNode = g0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            y3.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(wn0.a aVar) {
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int o(int min, int max, int preferred) {
        if (preferred >= 0 || min == max) {
            return View.MeasureSpec.makeMeasureSpec(bo0.n.n(preferred, min, max), 1073741824);
        }
        if (preferred != -2 || max == Integer.MAX_VALUE) {
            return (preferred != -1 || max == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
    }

    @Override // p020r2.k
    public void a() {
        this.release.invoke();
    }

    @Override // p020r2.k
    public void b() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i11 = iArr[0];
        region.op(i11, iArr[1], i11 + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final w4.d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final g0 getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final androidx.compose.ui.d getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.a();
    }

    public final wn0.l<w4.d, h0> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final wn0.l<androidx.compose.ui.d, h0> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final wn0.l<Boolean, h0> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final wn0.a<h0> getRelease() {
        return this.release;
    }

    public final wn0.a<h0> getReset() {
        return this.reset;
    }

    public final xa.d getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final wn0.a<h0> getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        m();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // p020r2.k
    public void k() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    public final void m() {
        if (!this.isDrawing) {
            this.layoutNode.D0();
            return;
        }
        View view = this.view;
        final wn0.a<h0> aVar = this.runInvalidate;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.b
            @Override // java.lang.Runnable
            public final void run() {
                d.n(aVar);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) {
        super.onDescendantInvalidated(child, target);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        this.view.layout(0, 0, r11 - l11, b11 - t11);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = widthMeasureSpec;
        this.lastHeightMeasureSpec = heightMeasureSpec;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.dispatcher.e(), null, null, new k(consumed, this, w4.z.a(androidx.compose.ui.viewinterop.e.h(velocityX), androidx.compose.ui.viewinterop.e.h(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.dispatcher.e(), null, null, new l(w4.z.a(androidx.compose.ui.viewinterop.e.h(velocityX), androidx.compose.ui.viewinterop.e.h(velocityY)), null), 3, null);
        return false;
    }

    @Override // androidx.core.view.x
    public void onNestedPreScroll(View target, int dx2, int dy2, int[] consumed, int type) {
        if (isNestedScrollingEnabled()) {
            long jD = this.dispatcher.d(j3.h.a(androidx.compose.ui.viewinterop.e.g(dx2), androidx.compose.ui.viewinterop.e.g(dy2)), androidx.compose.ui.viewinterop.e.i(type));
            consumed[0] = y1.b(j3.g.m(jD));
            consumed[1] = y1.b(j3.g.n(jD));
        }
    }

    @Override // androidx.core.view.y
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (isNestedScrollingEnabled()) {
            long jB = this.dispatcher.b(j3.h.a(androidx.compose.ui.viewinterop.e.g(dxConsumed), androidx.compose.ui.viewinterop.e.g(dyConsumed)), j3.h.a(androidx.compose.ui.viewinterop.e.g(dxUnconsumed), androidx.compose.ui.viewinterop.e.g(dyUnconsumed)), androidx.compose.ui.viewinterop.e.i(type));
            consumed[0] = y1.b(j3.g.m(jB));
            consumed[1] = y1.b(j3.g.n(jB));
        }
    }

    @Override // androidx.core.view.x
    public void onNestedScrollAccepted(View child, View target, int axes, int type) {
        this.nestedScrollingParentHelper.c(child, target, axes, type);
    }

    @Override // androidx.core.view.x
    public boolean onStartNestedScroll(View child, View target, int axes, int type) {
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.x
    public void onStopNestedScroll(View target, int type) {
        this.nestedScrollingParentHelper.e(target, type);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }

    public final void p() {
        int i11;
        int i12 = this.lastWidthMeasureSpec;
        if (i12 == Integer.MIN_VALUE || (i11 = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i12, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        wn0.l<? super Boolean, h0> lVar = this.onRequestDisallowInterceptTouchEvent;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public final void setDensity(w4.d dVar) {
        if (dVar != this.density) {
            this.density = dVar;
            wn0.l<? super w4.d, h0> lVar = this.onDensityChanged;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            androidx.p003lifecycle.View.b(this, lifecycleOwner);
        }
    }

    public final void setModifier(androidx.compose.ui.d dVar) {
        if (dVar != this.modifier) {
            this.modifier = dVar;
            wn0.l<? super androidx.compose.ui.d, h0> lVar = this.onModifierChanged;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(wn0.l<? super w4.d, h0> lVar) {
        this.onDensityChanged = lVar;
    }

    public final void setOnModifierChanged$ui_release(wn0.l<? super androidx.compose.ui.d, h0> lVar) {
        this.onModifierChanged = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(wn0.l<? super Boolean, h0> lVar) {
        this.onRequestDisallowInterceptTouchEvent = lVar;
    }

    protected final void setRelease(wn0.a<h0> aVar) {
        this.release = aVar;
    }

    protected final void setReset(wn0.a<h0> aVar) {
        this.reset = aVar;
    }

    public final void setSavedStateRegistryOwner(xa.d dVar) {
        if (dVar != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = dVar;
            xa.e.b(this, dVar);
        }
    }

    protected final void setUpdate(wn0.a<h0> aVar) {
        this.update = aVar;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // b4.k1
    public boolean u0() {
        return isAttachedToWindow();
    }

    @Override // androidx.core.view.x
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (isNestedScrollingEnabled()) {
            this.dispatcher.b(j3.h.a(androidx.compose.ui.viewinterop.e.g(dxConsumed), androidx.compose.ui.viewinterop.e.g(dyConsumed)), j3.h.a(androidx.compose.ui.viewinterop.e.g(dxUnconsumed), androidx.compose.ui.viewinterop.e.g(dyUnconsumed)), androidx.compose.ui.viewinterop.e.i(type));
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J,\u0010\u000f\u001a\u00020\u000e*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0015\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J)\u0010\u0016\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"androidx/compose/ui/viewinterop/d$g", "Lz3/i0;", "", Snapshot.HEIGHT, "b", "(I)I", Snapshot.WIDTH, "a", "Lz3/k0;", "", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;", "Lz3/r;", "Lz3/q;", "g", "(Lz3/r;Ljava/util/List;I)I", DateTokenConverter.CONVERTER_KEY, "j", IntegerTokenConverter.CONVERTER_KEY, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g implements i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f6231b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends u implements wn0.l<w0.a, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f6233c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ g0 f6234d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d dVar, g0 g0Var) {
                super(1);
                this.f6233c = dVar;
                this.f6234d = g0Var;
            }

            public final void a(w0.a aVar) {
                androidx.compose.ui.viewinterop.e.f(this.f6233c, this.f6234d);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
                a(aVar);
                return h0.f84049a;
            }
        }

        g(g0 g0Var) {
            this.f6231b = g0Var;
        }

        private final int a(int width) {
            d dVar = d.this;
            ViewGroup.LayoutParams layoutParams = dVar.getLayoutParams();
            s.h(layoutParams);
            dVar.measure(dVar.o(0, width, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return d.this.getMeasuredHeight();
        }

        private final int b(int height) {
            d dVar = d.this;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            d dVar2 = d.this;
            ViewGroup.LayoutParams layoutParams = dVar2.getLayoutParams();
            s.h(layoutParams);
            dVar.measure(iMakeMeasureSpec, dVar2.o(0, height, layoutParams.height));
            return d.this.getMeasuredWidth();
        }

        @Override // z3.i0
        public j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
            if (d.this.getChildCount() == 0) {
                return k0.N1(k0Var, w4.b.n(j11), w4.b.m(j11), null, a.f6232c, 4, null);
            }
            if (w4.b.n(j11) != 0) {
                d.this.getChildAt(0).setMinimumWidth(w4.b.n(j11));
            }
            if (w4.b.m(j11) != 0) {
                d.this.getChildAt(0).setMinimumHeight(w4.b.m(j11));
            }
            d dVar = d.this;
            int iN = w4.b.n(j11);
            int iL = w4.b.l(j11);
            ViewGroup.LayoutParams layoutParams = d.this.getLayoutParams();
            s.h(layoutParams);
            int iO = dVar.o(iN, iL, layoutParams.width);
            d dVar2 = d.this;
            int iM = w4.b.m(j11);
            int iK = w4.b.k(j11);
            ViewGroup.LayoutParams layoutParams2 = d.this.getLayoutParams();
            s.h(layoutParams2);
            dVar.measure(iO, dVar2.o(iM, iK, layoutParams2.height));
            return k0.N1(k0Var, d.this.getMeasuredWidth(), d.this.getMeasuredHeight(), null, new b(d.this, this.f6231b), 4, null);
        }

        @Override // z3.i0
        public int d(r rVar, List<? extends z3.q> list, int i11) {
            return b(i11);
        }

        @Override // z3.i0
        public int g(r rVar, List<? extends z3.q> list, int i11) {
            return b(i11);
        }

        @Override // z3.i0
        public int i(r rVar, List<? extends z3.q> list, int i11) {
            return a(i11);
        }

        @Override // z3.i0
        public int j(r rVar, List<? extends z3.q> list, int i11) {
            return a(i11);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<w0.a, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f6232c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
                a(aVar);
                return h0.f84049a;
            }

            public final void a(w0.a aVar) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends u implements wn0.l<g4.y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f6235c = new h();

        h() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(g4.y yVar) {
            a(yVar);
            return h0.f84049a;
        }

        public final void a(g4.y yVar) {
        }
    }
}
