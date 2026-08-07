package v3;

import androidx.compose.ui.input.pointer.CancelTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import androidx.compose.ui.platform.e3;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.ContinuationKt;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001VBY\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b\u0012\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J[\u0010\u0016\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0000¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0018J*\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u0018J:\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010!2\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0096@¢\u0006\u0004\b$\u0010%R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\"\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R2\u0010-\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\"\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u000306R\u00020\u0000058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u000306R\u00020\u0000058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00103R\u001c\u0010@\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u0010?R\\\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\"\u0010A\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0014\u0010O\u001a\u00020L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001a\u0010R\u001a\u00020\u001c8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010U\u001a\u00020S8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bT\u0010Q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, d2 = {"Lv3/r0;", "Landroidx/compose/ui/d$c;", "Lv3/q0;", "Lv3/f0;", "Lw4/d;", "", "key1", "key2", "", "keys", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "pointerInputHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lwn0/p;)V", "Lv3/m;", "pointerEvent", "Lv3/o;", "pass", "A2", "(Lv3/m;Lv3/o;)V", "C2", "i2", "()V", "J1", "T1", "o1", "Lw4/r;", "bounds", "q0", "(Lv3/m;Lv3/o;J)V", "y0", "R", "Lv3/c;", "block", "z0", "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "Ljava/lang/Object;", "o", "p", "[Ljava/lang/Object;", "q", "Lwn0/p;", "_pointerInputHandler", "Lkotlinx/coroutines/Job;", "r", "Lkotlinx/coroutines/Job;", "pointerInputJob", "s", "Lv3/m;", "currentEvent", "Lt2/b;", "Lv3/r0$a;", "t", "Lt2/b;", "pointerHandlers", "u", "dispatchingPointerHandlers", "v", "lastPointerEvent", "w", "J", "boundsSize", "value", "B2", "()Lwn0/p;", "setPointerInputHandler", "(Lwn0/p;)V", "", "getDensity", "()F", "density", "M1", "fontScale", "Landroidx/compose/ui/platform/e3;", "getViewConfiguration", "()Landroidx/compose/ui/platform/e3;", "viewConfiguration", "e", "()J", "size", "Lj3/m;", "f1", "extendedTouchPadding", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r0 extends androidx.compose.ui.d.c implements q0, f0, w4.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Object key1;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Object key2;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Object[] keys;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private wn0.p<? super f0, ? super Continuation<? super jn0.h0>, ? extends Object> _pointerInputHandler;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Job pointerInputJob;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private m lastPointerEvent;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private m currentEvent = o0.f117722a;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final t2.b<a<?>> pointerHandlers = new t2.b<>(new a[16], 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final t2.b<a<?>> dispatchingPointerHandlers = new t2.b<>(new a[16], 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long boundsSize = w4.r.INSTANCE.a();

    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\b*\u00020\u000fH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\b*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000f*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\u0014*\u00020\u0015H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\f*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\f*\u00020\u000fH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020\"2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b-\u0010.JD\u00105\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010/2\u0006\u00101\u001a\u0002002\"\u00104\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010302H\u0096@¢\u0006\u0004\b5\u00106JB\u00107\u001a\u00028\u0001\"\u0004\b\u0001\u0010/2\u0006\u00101\u001a\u0002002\"\u00104\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010302H\u0096@¢\u0006\u0004\b7\u00106R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010F\u001a\u00020A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0014\u0010N\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001a\u0010Q\u001a\u00020O8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bB\u0010PR\u0014\u0010U\u001a\u00020R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u001a\u0010W\u001a\u00020\u00148VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bV\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, d2 = {"Lv3/r0$a;", "R", "Lv3/c;", "Lw4/d;", "Lkotlin/coroutines/Continuation;", "completion", "<init>", "(Lv3/r0;Lkotlin/coroutines/Continuation;)V", "Lw4/h;", "", "i1", "(F)I", "Lw4/v;", "p", "(J)F", "", "x", "(F)F", "w", "(I)F", "Lj3/m;", "Lw4/k;", "o", "(J)J", "O1", "m1", "C", "E", "(F)J", "s", "Lv3/m;", "event", "Lv3/o;", "pass", "Ljn0/h0;", "B", "(Lv3/m;Lv3/o;)V", "", "cause", "y", "(Ljava/lang/Throwable;)V", "Ljn0/s;", "result", "resumeWith", "(Ljava/lang/Object;)V", "S0", "(Lv3/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "", "block", "v0", "(JLwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o0", "a", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CancellableContinuation;", "c", "Lkotlinx/coroutines/CancellableContinuation;", "pointerAwaiter", DateTokenConverter.CONVERTER_KEY, "Lv3/o;", "awaitPass", "Lkotlin/coroutines/CoroutineContext;", "e", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "getDensity", "()F", "density", "M1", "fontScale", "s1", "()Lv3/m;", "currentEvent", "Lw4/r;", "()J", "size", "Landroidx/compose/ui/platform/e3;", "getViewConfiguration", "()Landroidx/compose/ui/platform/e3;", "viewConfiguration", "f1", "extendedTouchPadding", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a<R> implements v3.c, w4.d, Continuation<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Continuation<R> completion;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final /* synthetic */ r0 f117751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private CancellableContinuation<? super m> pointerAwaiter;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private o awaitPass = o.Main;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final CoroutineContext context = EmptyCoroutineContext.INSTANCE;

        /* JADX INFO: renamed from: v3.r0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {0}, l = {782}, m = "withTimeout", n = {"job"}, s = {"L$0"})
        static final class C2529a<T> extends ContinuationImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f117756n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f117757o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ a<R> f117758p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f117759q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2529a(a<R> aVar, Continuation<? super C2529a> continuation) {
                super(continuation);
                this.f117758p = aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f117757o = obj;
                this.f117759q |= Integer.MIN_VALUE;
                return this.f117758p.o0(0L, null, this);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {774, 775}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f117760n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ long f117761o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ a<R> f117762p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j11, a<R> aVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f117761o = j11;
                this.f117762p = aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f117761o, this.f117762p, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
            
                if (kotlinx.coroutines.DelayKt.delay(1, r8) == r0) goto L15;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r8.f117760n
                    r2 = 1
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r5) goto L1c
                    if (r1 != r4) goto L14
                    jn0.t.b(r9)
                    goto L38
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    jn0.t.b(r9)
                    goto L2f
                L20:
                    jn0.t.b(r9)
                    long r6 = r8.f117761o
                    long r6 = r6 - r2
                    r8.f117760n = r5
                    java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r6, r8)
                    if (r9 != r0) goto L2f
                    goto L37
                L2f:
                    r8.f117760n = r4
                    java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r2, r8)
                    if (r9 != r0) goto L38
                L37:
                    return r0
                L38:
                    v3.r0$a<R> r9 = r8.f117762p
                    kotlinx.coroutines.CancellableContinuation r9 = v3.r0.a.c(r9)
                    if (r9 == 0) goto L54
                    jn0.s$a r0 = jn0.s.INSTANCE
                    androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                    long r1 = r8.f117761o
                    r0.<init>(r1)
                    java.lang.Object r0 = jn0.t.a(r0)
                    java.lang.Object r0 = jn0.s.b(r0)
                    r9.resumeWith(r0)
                L54:
                    jn0.h0 r9 = jn0.h0.f84049a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: v3.r0.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {}, l = {753}, m = "withTimeoutOrNull", n = {}, s = {})
        static final class c<T> extends ContinuationImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f117763n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ a<R> f117764o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f117765p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a<R> aVar, Continuation<? super c> continuation) {
                super(continuation);
                this.f117764o = aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f117763n = obj;
                this.f117765p |= Integer.MIN_VALUE;
                return this.f117764o.v0(0L, null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Continuation<? super R> continuation) {
            this.completion = continuation;
            this.f117751b = r0.this;
        }

        public final void B(m event, o pass) {
            CancellableContinuation<? super m> cancellableContinuation;
            if (pass != this.awaitPass || (cancellableContinuation = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            cancellableContinuation.resumeWith(jn0.s.b(event));
        }

        @Override // w4.d
        public long C(long j11) {
            return this.f117751b.C(j11);
        }

        @Override // w4.l
        public long E(float f11) {
            return this.f117751b.E(f11);
        }

        @Override // w4.l
        /* JADX INFO: renamed from: M1 */
        public float getFontScale() {
            return this.f117751b.getFontScale();
        }

        @Override // w4.d
        public float O1(float f11) {
            return this.f117751b.O1(f11);
        }

        @Override // v3.c
        public Object S0(o oVar, Continuation<? super m> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.awaitPass = oVar;
            this.pointerAwaiter = cancellableContinuationImpl;
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        @Override // v3.c
        public long e() {
            return r0.this.boundsSize;
        }

        @Override // v3.c
        public long f1() {
            return r0.this.f1();
        }

        @Override // p013kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.context;
        }

        @Override // w4.d
        public float getDensity() {
            return this.f117751b.getDensity();
        }

        @Override // v3.c
        public e3 getViewConfiguration() {
            return r0.this.getViewConfiguration();
        }

        @Override // w4.d
        public int i1(float f11) {
            return this.f117751b.i1(f11);
        }

        @Override // w4.d
        public float m1(long j11) {
            return this.f117751b.m1(j11);
        }

        @Override // w4.d
        public long o(long j11) {
            return this.f117751b.o(j11);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r11v3, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // v3.c
        public <T> Object o0(long j11, wn0.p<? super v3.c, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
            C2529a c2529a;
            CancellableContinuation<? super m> cancellableContinuation;
            if (continuation instanceof C2529a) {
                c2529a = (C2529a) continuation;
                int i11 = c2529a.f117759q;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c2529a.f117759q = i11 - Integer.MIN_VALUE;
                } else {
                    c2529a = new C2529a(this, continuation);
                }
            } else {
                c2529a = new C2529a(this, continuation);
            }
            Object objInvoke = c2529a.f117757o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = c2529a.f117759q;
            try {
                if (i12 == 0) {
                    jn0.t.b(objInvoke);
                    if (j11 <= 0 && (cancellableContinuation = this.pointerAwaiter) != null) {
                        jn0.s.Companion companion = jn0.s.INSTANCE;
                        cancellableContinuation.resumeWith(jn0.s.b(jn0.t.a(new PointerEventTimeoutCancellationException(j11))));
                    }
                    Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(r0.this.X1(), null, null, new b(j11, this, null), 3, null);
                    c2529a.f117756n = jobLaunch$default;
                    c2529a.f117759q = 1;
                    objInvoke = pVar.invoke(this, c2529a);
                    j11 = jobLaunch$default;
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Job job = (Job) c2529a.f117756n;
                    jn0.t.b(objInvoke);
                    j11 = job;
                }
                j11.cancel(CancelTimeoutCancellationException.f5490a);
                return objInvoke;
            } catch (Throwable th2) {
                j11.cancel(CancelTimeoutCancellationException.f5490a);
                throw th2;
            }
        }

        @Override // w4.l
        public float p(long j11) {
            return this.f117751b.p(j11);
        }

        @Override // p013kotlin.coroutines.Continuation
        public void resumeWith(Object result) {
            t2.b bVar = r0.this.pointerHandlers;
            r0 r0Var = r0.this;
            synchronized (bVar) {
                r0Var.pointerHandlers.t(this);
                jn0.h0 h0Var = jn0.h0.f84049a;
            }
            this.completion.resumeWith(result);
        }

        @Override // w4.d
        public long s(float f11) {
            return this.f117751b.s(f11);
        }

        @Override // v3.c
        public m s1() {
            return r0.this.currentEvent;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // v3.c
        public <T> Object v0(long j11, wn0.p<? super v3.c, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
            c cVar;
            if (continuation instanceof c) {
                cVar = (c) continuation;
                int i11 = cVar.f117765p;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    cVar.f117765p = i11 - Integer.MIN_VALUE;
                } else {
                    cVar = new c(this, continuation);
                }
            } else {
                cVar = new c(this, continuation);
            }
            Object obj = cVar.f117763n;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = cVar.f117765p;
            try {
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                    return obj;
                }
                jn0.t.b(obj);
                cVar.f117765p = 1;
                Object objO0 = o0(j11, pVar, cVar);
                return objO0 == coroutine_suspended ? coroutine_suspended : objO0;
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
        }

        @Override // w4.d
        public float w(int i11) {
            return this.f117751b.w(i11);
        }

        @Override // w4.d
        public float x(float f11) {
            return this.f117751b.x(f11);
        }

        public final void y(Throwable cause) {
            CancellableContinuation<? super m> cancellableContinuation = this.pointerAwaiter;
            if (cancellableContinuation != null) {
                cancellableContinuation.cancel(cause);
            }
            this.pointerAwaiter = null;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f117766a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f117766a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a<R> f117767c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<R> aVar) {
            super(1);
            this.f117767c = aVar;
        }

        public final void a(Throwable th2) {
            this.f117767c.y(th2);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Throwable th2) {
            a(th2);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {616}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f117768n;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return r0.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f117768n;
            if (i11 == 0) {
                jn0.t.b(obj);
                wn0.p<f0, Continuation<? super jn0.h0>, Object> pVarB2 = r0.this.B2();
                r0 r0Var = r0.this;
                this.f117768n = 1;
                if (pVarB2.invoke(r0Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public r0(Object obj, Object obj2, Object[] objArr, wn0.p<? super f0, ? super Continuation<? super jn0.h0>, ? extends Object> pVar) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this._pointerInputHandler = pVar;
    }

    private final void A2(m pointerEvent, o pass) {
        t2.b<a<?>> bVar;
        int size;
        synchronized (this.pointerHandlers) {
            t2.b<a<?>> bVar2 = this.dispatchingPointerHandlers;
            bVar2.e(bVar2.getSize(), this.pointerHandlers);
        }
        try {
            int i11 = b.f117766a[pass.ordinal()];
            if (i11 == 1 || i11 == 2) {
                t2.b<a<?>> bVar3 = this.dispatchingPointerHandlers;
                int size2 = bVar3.getSize();
                if (size2 > 0) {
                    a<?>[] aVarArrM = bVar3.m();
                    int i12 = 0;
                    do {
                        aVarArrM[i12].B(pointerEvent, pass);
                        i12++;
                    } while (i12 < size2);
                }
            } else if (i11 == 3 && (size = (bVar = this.dispatchingPointerHandlers).getSize()) > 0) {
                int i13 = size - 1;
                a<?>[] aVarArrM2 = bVar.m();
                do {
                    aVarArrM2[i13].B(pointerEvent, pass);
                    i13--;
                } while (i13 >= 0);
            }
        } finally {
            this.dispatchingPointerHandlers.h();
        }
    }

    public wn0.p<f0, Continuation<? super jn0.h0>, Object> B2() {
        return this._pointerInputHandler;
    }

    public final void C2(Object key1, Object key2, Object[] keys, wn0.p<? super f0, ? super Continuation<? super jn0.h0>, ? extends Object> pointerInputHandler) {
        boolean z11 = !p013kotlin.jvm.internal.s.f(this.key1, key1);
        this.key1 = key1;
        if (!p013kotlin.jvm.internal.s.f(this.key2, key2)) {
            z11 = true;
        }
        this.key2 = key2;
        Object[] objArr = this.keys;
        if (objArr != null && keys == null) {
            z11 = true;
        }
        if (objArr == null && keys != null) {
            z11 = true;
        }
        boolean z12 = (objArr == null || keys == null || Arrays.equals(keys, objArr)) ? z11 : true;
        this.keys = keys;
        if (z12) {
            o1();
        }
        this._pointerInputHandler = pointerInputHandler;
    }

    @Override // b4.p1
    public void J1() {
        o1();
    }

    @Override // w4.l
    /* JADX INFO: renamed from: M1 */
    public float getFontScale() {
        return b4.k.m(this).getDensity().getFontScale();
    }

    @Override // b4.p1
    public void T1() {
        o1();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public long getBoundsSize() {
        return this.boundsSize;
    }

    public long f1() {
        long jC = C(getViewConfiguration().g());
        long boundsSize = getBoundsSize();
        return j3.n.a(Math.max(BitmapDescriptorFactory.HUE_RED, j3.m.k(jC) - w4.r.g(boundsSize)) / 2.0f, Math.max(BitmapDescriptorFactory.HUE_RED, j3.m.i(jC) - w4.r.f(boundsSize)) / 2.0f);
    }

    @Override // w4.d
    public float getDensity() {
        return b4.k.m(this).getDensity().getDensity();
    }

    @Override // v3.f0
    public e3 getViewConfiguration() {
        return b4.k.m(this).getViewConfiguration();
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        o1();
        super.i2();
    }

    @Override // v3.q0
    public void o1() {
        Job job = this.pointerInputJob;
        if (job != null) {
            job.cancel((CancellationException) new PointerInputResetException());
            this.pointerInputJob = null;
        }
    }

    @Override // b4.p1
    public void q0(m pointerEvent, o pass, long bounds) {
        this.boundsSize = bounds;
        if (pass == o.Initial) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            this.pointerInputJob = BuildersKt__Builders_commonKt.launch$default(X1(), null, CoroutineStart.UNDISPATCHED, new d(null), 1, null);
        }
        A2(pointerEvent, pass);
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z11 = true;
                break;
            } else if (!n.d(listC.get(i11))) {
                break;
            } else {
                i11++;
            }
        }
        if (z11) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // b4.p1
    public void y0() {
        m mVar = this.lastPointerEvent;
        if (mVar == null) {
            return;
        }
        List<PointerInputChange> listC = mVar.c();
        int size = listC.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (listC.get(i11).getPressed()) {
                List<PointerInputChange> listC2 = mVar.c();
                ArrayList arrayList = new ArrayList(listC2.size());
                int size2 = listC2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    PointerInputChange pointerInputChange = listC2.get(i12);
                    arrayList.add(new PointerInputChange(pointerInputChange.getId(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), 0, 0L, 1536, (DefaultConstructorMarker) null));
                }
                m mVar2 = new m(arrayList);
                this.currentEvent = mVar2;
                A2(mVar2, o.Initial);
                A2(mVar2, o.Main);
                A2(mVar2, o.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    @Override // v3.f0
    public <R> Object z0(wn0.p<? super v3.c, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        a aVar = new a(cancellableContinuationImpl);
        synchronized (this.pointerHandlers) {
            this.pointerHandlers.b(aVar);
            Continuation<jn0.h0> continuationCreateCoroutine = ContinuationKt.createCoroutine(pVar, aVar, aVar);
            jn0.s.Companion companion = jn0.s.INSTANCE;
            continuationCreateCoroutine.resumeWith(jn0.s.b(jn0.h0.f84049a));
        }
        cancellableContinuationImpl.invokeOnCancellation(new c(aVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
