package p020r2;

import androidx.collection.l0;
import androidx.collection.v0;
import androidx.compose.runtime.ComposeRuntimeError;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import jn0.h0;
import jn0.s;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import u2.a;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ¶\u00012\u00020\u0001:\u0004CQbeB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0017\u001a\u00020\u00072\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0007H\u0082@¢\u0006\u0004\b \u0010!J:\u0010(\u001a\u00020\u00072(\u0010'\u001a$\b\u0001\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070%\u0012\u0006\u0012\u0004\u0018\u00010&0\"H\u0082@¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b*\u0010\u001dJ)\u0010-\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J3\u00102\u001a\b\u0012\u0004\u0012\u00020\u00140/2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010+H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0007H\u0002¢\u0006\u0004\b4\u0010\u001aJ#\u00106\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0007052\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b6\u00107J3\u00108\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0007052\u0006\u0010\u001b\u001a\u00020\u00142\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010+H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b>\u0010!J\r\u0010?\u001a\u00020\u0007¢\u0006\u0004\b?\u0010\u001aJ\u0010\u0010@\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b@\u0010!J%\u0010C\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00142\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00070AH\u0010¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u0007¢\u0006\u0004\bE\u0010\u001aJ\r\u0010F\u001a\u00020\u0007¢\u0006\u0004\bF\u0010\u001aJ\u001d\u0010J\u001a\u00020\u00072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020H0GH\u0010¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0010¢\u0006\u0004\bL\u0010\u001dJ\u0017\u0010M\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0010¢\u0006\u0004\bM\u0010\u001dJ\u0017\u0010O\u001a\u00020\u00072\u0006\u0010N\u001a\u000200H\u0010¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u00072\u0006\u0010N\u001a\u000200H\u0010¢\u0006\u0004\bQ\u0010PJ\u001f\u0010T\u001a\u00020\u00072\u0006\u0010N\u001a\u0002002\u0006\u0010S\u001a\u00020RH\u0010¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0010¢\u0006\u0004\bV\u0010\u001dJ\u0019\u0010W\u001a\u0004\u0018\u00010R2\u0006\u0010N\u001a\u000200H\u0010¢\u0006\u0004\bW\u0010XR$\u0010^\u001a\u00020Y2\u0006\u0010Z\u001a\u00020Y8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010`R\u0014\u0010d\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010g\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010j\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010iR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00140k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001e\u0010p\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010mR\u001c\u0010s\u001a\b\u0012\u0004\u0012\u00020&0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00140t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00140k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010mR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u0002000k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010mR.\u0010~\u001a\u001c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010&0|\u0012\n\u0012\b\u0012\u0004\u0012\u0002000k0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010}R \u0010\u007f\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020R0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010}R\u001f\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010mR \u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bJ\u0010\u0081\u0001R!\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0088\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bV\u0010\u0087\u0001R\u0018\u0010\u008a\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010 R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010 R\u001f\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0005\bu\u0010\u009b\u0001R\u001c\u0010\u009f\u0001\u001a\u00070\u009c\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001d\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140/8BX\u0082\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0016\u0010¤\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010\fR\u0016\u0010¦\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010\fR\u0016\u0010¨\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b§\u0001\u0010\fR\u0016\u0010ª\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010\fR\u0016\u0010¬\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010\fR\u001c\u0010°\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u00ad\u00018F¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0017\u0010²\u0001\u001a\u00030\u0086\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bq\u0010±\u0001R\u0015\u0010³\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\be\u0010\fR\u0015\u0010´\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u0015\u0010µ\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\f¨\u0006·\u0001"}, d2 = {"Lr2/m2;", "Lr2/q;", "Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Lkotlinx/coroutines/CancellableContinuation;", "Ljn0/h0;", "c0", "()Lkotlinx/coroutines/CancellableContinuation;", "", "w0", "()Z", "Lkotlinx/coroutines/Job;", "callingJob", "y0", "(Lkotlinx/coroutines/Job;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Lr2/e0;", "failedInitialComposition", "recoverable", "s0", "(Ljava/lang/Exception;Lr2/e0;Z)V", "b0", "()V", "composition", "z0", "(Lr2/e0;)V", "X", "x0", "Z", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lr2/f1;", "Lkotlin/coroutines/Continuation;", "", "block", "v0", "(Lwn0/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o0", "Landroidx/collection/l0;", "modifiedValues", "r0", "(Lr2/e0;Landroidx/collection/l0;)Lr2/e0;", "", "Lr2/k1;", "references", "q0", "(Ljava/util/List;Landroidx/collection/l0;)Ljava/util/List;", "d0", "Lkotlin/Function1;", "u0", "(Lr2/e0;)Lwn0/l;", "C0", "(Lr2/e0;Landroidx/collection/l0;)Lwn0/l;", "Landroidx/compose/runtime/snapshots/b;", "snapshot", "Y", "(Landroidx/compose/runtime/snapshots/b;)V", "B0", "a0", "m0", "Lkotlin/Function0;", "content", "a", "(Lr2/e0;Lwn0/p;)V", "n0", "A0", "", "Lc3/a;", "table", "o", "(Ljava/util/Set;)V", "t", "l", "reference", "k", "(Lr2/k1;)V", "b", "Lr2/j1;", "data", "m", "(Lr2/k1;Lr2/j1;)V", "q", "n", "(Lr2/k1;)Lr2/j1;", "", "<set-?>", "J", "e0", "()J", "changeCount", "Lr2/h;", "Lr2/h;", "broadcastFrameClock", "c", "Ljava/lang/Object;", "stateLock", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/Job;", "runnerJob", "", "Ljava/lang/Throwable;", "closeCause", "", "f", "Ljava/util/List;", "_knownCompositions", "g", "_knownCompositionsCache", "h", "Landroidx/collection/l0;", "snapshotInvalidations", "Lt2/b;", IntegerTokenConverter.CONVERTER_KEY, "Lt2/b;", "compositionInvalidations", "j", "compositionsAwaitingApply", "compositionValuesAwaitingInsert", "", "Lr2/i1;", "Ljava/util/Map;", "compositionValuesRemoved", "compositionValueStatesAvailable", "failedCompositions", "Ljava/util/Set;", "compositionsRemoved", "p", "Lkotlinx/coroutines/CancellableContinuation;", "workContinuation", "", "I", "concurrentCompositionsOutstanding", "r", "isClosed", "Lr2/m2$b;", "s", "Lr2/m2$b;", "errorState", "frameClockPaused", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lr2/m2$d;", "u", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_state", "Lkotlinx/coroutines/CompletableJob;", "v", "Lkotlinx/coroutines/CompletableJob;", "effectJob", "w", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "Lr2/m2$c;", "x", "Lr2/m2$c;", "recomposerInfo", "k0", "()Ljava/util/List;", "knownCompositions", "h0", "hasBroadcastFrameClockAwaitersLocked", "g0", "hasBroadcastFrameClockAwaiters", "l0", "shouldKeepRecomposing", "j0", "hasSchedulingWork", "i0", "hasFrameWorkLocked", "Lkotlinx/coroutines/flow/StateFlow;", "f0", "()Lkotlinx/coroutines/flow/StateFlow;", "currentState", "()I", "compoundHashKey", "collectingCallByInformation", "collectingParameterInformation", "collectingSourceInformation", "y", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m2 extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long changeCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p020r2.h broadcastFrameClock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object stateLock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Job runnerJob;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Throwable closeCause;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<e0> _knownCompositions;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List<? extends e0> _knownCompositionsCache;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private l0<Object> snapshotInvalidations;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final t2.b<e0> compositionInvalidations;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<e0> compositionsAwaitingApply;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final List<k1> compositionValuesAwaitingInsert;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Map<i1<Object>, List<k1>> compositionValuesRemoved;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Map<k1, j1> compositionValueStatesAvailable;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private List<e0> failedCompositions;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Set<e0> compositionsRemoved;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private CancellableContinuation<? super h0> workContinuation;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int concurrentCompositionsOutstanding;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private b errorState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean frameClockPaused;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<d> _state;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final CompletableJob effectJob;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext effectCoroutineContext;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final c recomposerInfo;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f106660z = 8;
    private static final MutableStateFlow<u2.f<c>> A = StateFlowKt.MutableStateFlow(a.b());
    private static final AtomicReference<Boolean> B = new AtomicReference<>(Boolean.FALSE);

    /* JADX INFO: renamed from: r2.m2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR4\u0010\u000f\u001a\"\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bj\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lr2/m2$a;", "", "<init>", "()V", "Lr2/m2$c;", "Lr2/m2;", "info", "Ljn0/h0;", "c", "(Lr2/m2$c;)V", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lu2/f;", "_runningRecomposers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(c info) {
            u2.f fVar;
            u2.f fVarAdd;
            do {
                fVar = (u2.f) m2.A.getValue();
                fVarAdd = fVar.add(info);
                if (fVar == fVarAdd) {
                    return;
                }
            } while (!m2.A.compareAndSet(fVar, fVarAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(c info) {
            u2.f fVar;
            u2.f fVarRemove;
            do {
                fVar = (u2.f) m2.A.getValue();
                fVarRemove = fVar.remove(info);
                if (fVar == fVarRemove) {
                    return;
                }
            } while (!m2.A.compareAndSet(fVar, fVarRemove));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Lr2/m2$b;", "", "", "recoverable", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "<init>", "(ZLjava/lang/Exception;)V", "a", "Z", "getRecoverable", "()Z", "b", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean recoverable;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Exception cause;

        public b(boolean z11, Exception exc) {
            this.recoverable = z11;
            this.cause = exc;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public Exception getCause() {
            return this.cause;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr2/m2$c;", "", "<init>", "(Lr2/m2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class c {
        public c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lr2/m2$d;", "", "<init>", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum d {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.a<h0> {
        e() {
            super(0);
        }

        public final void b() {
            CancellableContinuation cancellableContinuationC0;
            Object obj = m2.this.stateLock;
            m2 m2Var = m2.this;
            synchronized (obj) {
                cancellableContinuationC0 = m2Var.c0();
                if (((d) m2Var._state.getValue()).compareTo(d.ShuttingDown) <= 0) {
                    throw ExceptionsKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", m2Var.closeCause);
                }
            }
            if (cancellableContinuationC0 != null) {
                s.Companion companion = s.INSTANCE;
                cancellableContinuationC0.resumeWith(s.b(h0.f84049a));
            }
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.l<Throwable, h0> {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "runnerJobCause", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<Throwable, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m2 f106690c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Throwable f106691d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m2 m2Var, Throwable th2) {
                super(1);
                this.f106690c = m2Var;
                this.f106691d = th2;
            }

            public final void a(Throwable th2) {
                Object obj = this.f106690c.stateLock;
                m2 m2Var = this.f106690c;
                Throwable th3 = this.f106691d;
                synchronized (obj) {
                    if (th3 == null) {
                        th3 = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                jn0.g.a(th3, th2);
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    m2Var.closeCause = th3;
                    m2Var._state.setValue(d.ShutDown);
                    h0 h0Var = h0.f84049a;
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
                a(th2);
                return h0.f84049a;
            }
        }

        f() {
            super(1);
        }

        public final void a(Throwable th2) {
            CancellableContinuation cancellableContinuation;
            CancellableContinuation cancellableContinuation2;
            CancellationException CancellationException = ExceptionsKt.CancellationException("Recomposer effect job completed", th2);
            Object obj = m2.this.stateLock;
            m2 m2Var = m2.this;
            synchronized (obj) {
                try {
                    Job job = m2Var.runnerJob;
                    cancellableContinuation = null;
                    if (job != null) {
                        m2Var._state.setValue(d.ShuttingDown);
                        if (m2Var.isClosed) {
                            if (m2Var.workContinuation != null) {
                                cancellableContinuation2 = m2Var.workContinuation;
                            }
                            m2Var.workContinuation = null;
                            job.invokeOnCompletion(new a(m2Var, th2));
                            cancellableContinuation = cancellableContinuation2;
                        } else {
                            job.cancel(CancellationException);
                        }
                        cancellableContinuation2 = null;
                        m2Var.workContinuation = null;
                        job.invokeOnCompletion(new a(m2Var, th2));
                        cancellableContinuation = cancellableContinuation2;
                    } else {
                        m2Var.closeCause = CancellationException;
                        m2Var._state.setValue(d.ShutDown);
                        h0 h0Var = h0.f84049a;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (cancellableContinuation != null) {
                s.Companion companion = s.INSTANCE;
                cancellableContinuation.resumeWith(s.b(h0.f84049a));
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr2/m2$d;", "it", "", "<anonymous>", "(Lr2/m2$d;)Z"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<d, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f106692n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f106693o;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, Continuation<? super Boolean> continuation) {
            return ((g) create(dVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(continuation);
            gVar.f106693o = obj;
            return gVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f106692n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxBoolean(((d) this.f106693o) == d.ShutDown);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class h extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0<Object> f106694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e0 f106695d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(l0<Object> l0Var, e0 e0Var) {
            super(0);
            this.f106694c = l0Var;
            this.f106695d = e0Var;
        }

        public final void b() {
            l0<Object> l0Var = this.f106694c;
            e0 e0Var = this.f106695d;
            Object[] objArr = l0Var.elements;
            long[] jArr = l0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            e0Var.r(objArr[(i11 << 3) + i13]);
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 == length) {
                    return;
                } else {
                    i11++;
                }
            }
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends u implements wn0.l<Object, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e0 f106696c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(e0 e0Var) {
            super(1);
            this.f106696c = e0Var;
        }

        public final void b(Object obj) {
            this.f106696c.a(obj);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
            b(obj);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {1054}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
    static final class j extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f106697n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f106698o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f106699p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ q<CoroutineScope, f1, Continuation<? super h0>, Object> f106701r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ f1 f106702s;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", i = {}, l = {1055}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f106703n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f106704o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ q<CoroutineScope, f1, Continuation<? super h0>, Object> f106705p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ f1 f106706q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(q<? super CoroutineScope, ? super f1, ? super Continuation<? super h0>, ? extends Object> qVar, f1 f1Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f106705p = qVar;
                this.f106706q = f1Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f106705p, this.f106706q, continuation);
                aVar.f106704o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f106703n;
                if (i11 == 0) {
                    t.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f106704o;
                    q<CoroutineScope, f1, Continuation<? super h0>, Object> qVar = this.f106705p;
                    f1 f1Var = this.f106706q;
                    this.f106703n = 1;
                    if (qVar.invoke(coroutineScope, f1Var, this) == coroutine_suspended) {
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
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "changed", "Landroidx/compose/runtime/snapshots/g;", "<anonymous parameter 1>", "Ljn0/h0;", "a", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/g;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends u implements p<Set<? extends Object>, androidx.compose.runtime.snapshots.g, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m2 f106707c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(m2 m2Var) {
                super(2);
                this.f106707c = m2Var;
            }

            public final void a(Set<? extends Object> set, androidx.compose.runtime.snapshots.g gVar) {
                CancellableContinuation cancellableContinuationC0;
                Object obj = this.f106707c.stateLock;
                m2 m2Var = this.f106707c;
                synchronized (obj) {
                    try {
                        if (((d) m2Var._state.getValue()).compareTo(d.Idle) >= 0) {
                            l0 l0Var = m2Var.snapshotInvalidations;
                            if (set instanceof t2.d) {
                                v0 v0VarB = ((t2.d) set).b();
                                Object[] objArr = v0VarB.elements;
                                long[] jArr = v0VarB.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i11 = 0;
                                    while (true) {
                                        long j11 = jArr[i11];
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                                            for (int i13 = 0; i13 < i12; i13++) {
                                                if ((255 & j11) < 128) {
                                                    Object obj2 = objArr[(i11 << 3) + i13];
                                                    if (!(obj2 instanceof b3.l) || ((b3.l) obj2).D(androidx.compose.runtime.snapshots.e.a(1))) {
                                                        l0Var.h(obj2);
                                                    }
                                                }
                                                j11 >>= 8;
                                            }
                                            if (i12 != 8) {
                                                break;
                                            }
                                        }
                                        if (i11 == length) {
                                            break;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj3 : set) {
                                    if (!(obj3 instanceof b3.l) || ((b3.l) obj3).D(androidx.compose.runtime.snapshots.e.a(1))) {
                                        l0Var.h(obj3);
                                    }
                                }
                            }
                            cancellableContinuationC0 = m2Var.c0();
                        } else {
                            cancellableContinuationC0 = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (cancellableContinuationC0 != null) {
                    s.Companion companion = s.INSTANCE;
                    cancellableContinuationC0.resumeWith(s.b(h0.f84049a));
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Set<? extends Object> set, androidx.compose.runtime.snapshots.g gVar) {
                a(set, gVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(q<? super CoroutineScope, ? super f1, ? super Continuation<? super h0>, ? extends Object> qVar, f1 f1Var, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f106701r = qVar;
            this.f106702s = f1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            j jVar = m2.this.new j(this.f106701r, this.f106702s, continuation);
            jVar.f106699p = obj;
            return jVar;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x009f A[Catch: all -> 0x00a3, TryCatch #2 {all -> 0x00a3, blocks: (B:28:0x0099, B:30:0x009f, B:33:0x00a5), top: B:58:0x0099 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00ce A[Catch: all -> 0x00d2, TryCatch #1 {all -> 0x00d2, blocks: (B:44:0x00c8, B:46:0x00ce, B:49:0x00d4), top: B:56:0x00c8 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:58:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Job job;
            b3.b bVar;
            Throwable th2;
            List listK0;
            Object obj2;
            m2 m2Var;
            Object obj3;
            m2 m2Var2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f106698o;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (b3.b) this.f106697n;
                job = (Job) this.f106699p;
                try {
                    t.b(obj);
                    bVar.dispose();
                    obj3 = m2.this.stateLock;
                    m2Var2 = m2.this;
                    synchronized (obj3) {
                        try {
                            if (m2Var2.runnerJob == job) {
                                m2Var2.runnerJob = null;
                            }
                            m2Var2.c0();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    m2.INSTANCE.d(m2.this.recomposerInfo);
                    return h0.f84049a;
                } catch (Throwable th4) {
                    th2 = th4;
                    bVar.dispose();
                    obj2 = m2.this.stateLock;
                    m2Var = m2.this;
                    synchronized (obj2) {
                        try {
                            if (m2Var.runnerJob == job) {
                                m2Var.runnerJob = null;
                            }
                            m2Var.c0();
                            m2.INSTANCE.d(m2.this.recomposerInfo);
                            throw th2;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            }
            t.b(obj);
            job = JobKt.getJob(((CoroutineScope) this.f106699p).getCoroutineContext());
            m2.this.y0(job);
            b3.b bVarI = androidx.compose.runtime.snapshots.g.INSTANCE.i(new b(m2.this));
            m2.INSTANCE.c(m2.this.recomposerInfo);
            try {
                Object obj4 = m2.this.stateLock;
                m2 m2Var3 = m2.this;
                synchronized (obj4) {
                    listK0 = m2Var3.k0();
                }
                int size = listK0.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((e0) listK0.get(i12)).b();
                }
                a aVar = new a(this.f106701r, this.f106702s, null);
                this.f106699p = job;
                this.f106697n = bVarI;
                this.f106698o = 1;
                if (CoroutineScopeKt.coroutineScope(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bVar = bVarI;
                bVar.dispose();
                obj3 = m2.this.stateLock;
                m2Var2 = m2.this;
                synchronized (obj3) {
                    if (m2Var2.runnerJob == job) {
                        m2Var2.runnerJob = null;
                    }
                    m2Var2.c0();
                    m2.INSTANCE.d(m2.this.recomposerInfo);
                    return h0.f84049a;
                }
            } catch (Throwable th6) {
                bVar = bVarI;
                th2 = th6;
                bVar.dispose();
                obj2 = m2.this.stateLock;
                m2Var = m2.this;
                synchronized (obj2) {
                    if (m2Var.runnerJob == job) {
                        m2Var.runnerJob = null;
                    }
                    m2Var.c0();
                }
                m2.INSTANCE.d(m2.this.recomposerInfo);
                throw th2;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lr2/f1;", "parentFrameClock", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;Lr2/f1;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {574, 585}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    static final class k extends SuspendLambda implements q<CoroutineScope, f1, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f106708n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f106709o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f106710p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f106711q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f106712r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f106713s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f106714t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f106715u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f106716v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f106717w;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTime", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<Long, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m2 f106719c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ l0<Object> f106720d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ l0<e0> f106721e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<e0> f106722f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<k1> f106723g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ l0<e0> f106724h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ List<e0> f106725i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ l0<e0> f106726j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ Set<Object> f106727k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m2 m2Var, l0<Object> l0Var, l0<e0> l0Var2, List<e0> list, List<k1> list2, l0<e0> l0Var3, List<e0> list3, l0<e0> l0Var4, Set<? extends Object> set) {
                super(1);
                this.f106719c = m2Var;
                this.f106720d = l0Var;
                this.f106721e = l0Var2;
                this.f106722f = list;
                this.f106723g = list2;
                this.f106724h = l0Var3;
                this.f106725i = list3;
                this.f106726j = l0Var4;
                this.f106727k = set;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x018f  */
            /* JADX WARN: Code duplicated, block: B:106:0x01a2  */
            /* JADX WARN: Code duplicated, block: B:109:0x01b1 A[Catch: all -> 0x01d3, Exception -> 0x01d5, TryCatch #10 {Exception -> 0x01d5, blocks: (B:104:0x0199, B:107:0x01a3, B:109:0x01b1, B:111:0x01bd, B:113:0x01c3), top: B:231:0x0199, outer: #2 }] */
            /* JADX WARN: Code duplicated, block: B:111:0x01bd A[Catch: all -> 0x01d3, Exception -> 0x01d5, TryCatch #10 {Exception -> 0x01d5, blocks: (B:104:0x0199, B:107:0x01a3, B:109:0x01b1, B:111:0x01bd, B:113:0x01c3), top: B:231:0x0199, outer: #2 }] */
            /* JADX WARN: Code duplicated, block: B:113:0x01c3 A[Catch: all -> 0x01d3, Exception -> 0x01d5, TRY_LEAVE, TryCatch #10 {Exception -> 0x01d5, blocks: (B:104:0x0199, B:107:0x01a3, B:109:0x01b1, B:111:0x01bd, B:113:0x01c3), top: B:231:0x0199, outer: #2 }] */
            /* JADX WARN: Code duplicated, block: B:123:0x01e3  */
            /* JADX WARN: Code duplicated, block: B:125:0x01e7 A[LOOP:4: B:107:0x01a3->B:125:0x01e7, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:138:0x020d A[Catch: all -> 0x00e1, TryCatch #2 {all -> 0x00e1, blocks: (B:11:0x0049, B:12:0x0050, B:23:0x0082, B:24:0x0083, B:25:0x0089, B:27:0x0092, B:30:0x009d, B:32:0x00a6, B:44:0x00dd, B:58:0x00ff, B:59:0x0102, B:53:0x00f4, B:60:0x0103, B:96:0x0184, B:99:0x018b, B:100:0x018e, B:89:0x016c, B:102:0x0193, B:126:0x01ee, B:138:0x020d, B:139:0x0211, B:141:0x0215, B:142:0x0216, B:144:0x022a, B:145:0x022b, B:136:0x0209, B:137:0x020c, B:133:0x0202, B:157:0x0256, B:159:0x025f, B:188:0x02f1, B:190:0x02f7, B:191:0x02fa, B:193:0x0303, B:199:0x031d, B:163:0x026e, B:164:0x0272, B:187:0x02f0, B:200:0x032a, B:201:0x032b, B:208:0x0341, B:209:0x0344, B:206:0x033b, B:210:0x0345, B:211:0x0346, B:146:0x022c, B:148:0x0233, B:150:0x023f, B:155:0x0250, B:140:0x0212, B:104:0x0199, B:107:0x01a3, B:109:0x01b1, B:111:0x01bd, B:113:0x01c3, B:13:0x0051, B:15:0x005b, B:16:0x0060, B:22:0x0079, B:165:0x0273, B:167:0x027e, B:169:0x028a, B:171:0x0290, B:174:0x029a, B:175:0x029d, B:177:0x02a9, B:179:0x02b7, B:181:0x02bd, B:185:0x02da, B:184:0x02cc, B:186:0x02df, B:33:0x00b1, B:35:0x00b8, B:40:0x00ca, B:42:0x00d1), top: B:218:0x0049, inners: #1, #3, #8, #10, #14, #15, #16 }] */
            /* JADX WARN: Code duplicated, block: B:227:0x0212 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:231:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:235:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:252:0x01ee A[EDGE_INSN: B:252:0x01ee->B:126:0x01ee BREAK  A[LOOP:4: B:107:0x01a3->B:125:0x01e7], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:253:0x01ee A[EDGE_INSN: B:253:0x01ee->B:126:0x01ee BREAK  A[LOOP:4: B:107:0x01a3->B:125:0x01e7], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:255:0x016c A[EDGE_INSN: B:255:0x016c->B:89:0x016c BREAK  A[LOOP:6: B:66:0x0121->B:85:0x0161], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:256:0x016c A[EDGE_INSN: B:256:0x016c->B:89:0x016c BREAK  A[LOOP:6: B:66:0x0121->B:85:0x0161], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:258:0x0154 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:65:0x0120  */
            /* JADX WARN: Code duplicated, block: B:69:0x0133  */
            /* JADX WARN: Code duplicated, block: B:71:0x013d  */
            /* JADX WARN: Code duplicated, block: B:73:0x0143  */
            /* JADX WARN: Code duplicated, block: B:83:0x015d  */
            /* JADX WARN: Code duplicated, block: B:85:0x0161 A[LOOP:6: B:66:0x0121->B:85:0x0161, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:88:0x016a  */
            public final void a(long j11) {
                List<e0> list;
                Set<? extends Object> set;
                Set<? extends Object> set2;
                l0<Object> l0Var;
                Object[] objArr;
                char c11;
                long[] jArr;
                long j12;
                int length;
                int i11;
                int i12;
                long j13;
                int i13;
                int i14;
                Object[] objArr2;
                long[] jArr2;
                int length2;
                int i15;
                long j14;
                Object[] objArr3;
                int i16;
                int i17;
                List<e0> list2;
                if (this.f106719c.g0()) {
                    m2 m2Var = this.f106719c;
                    c4 c4Var = c4.f106500a;
                    Object objA = c4Var.a("Recomposer:animation");
                    try {
                        m2Var.broadcastFrameClock.i(j11);
                        androidx.compose.runtime.snapshots.g.INSTANCE.n();
                        h0 h0Var = h0.f84049a;
                        c4Var.b(objA);
                    } catch (Throwable th2) {
                        c4.f106500a.b(objA);
                        throw th2;
                    }
                }
                m2 m2Var2 = this.f106719c;
                l0<Object> l0Var2 = this.f106720d;
                l0<e0> l0Var3 = this.f106721e;
                List<e0> list3 = this.f106722f;
                List<k1> list4 = this.f106723g;
                l0<e0> l0Var4 = this.f106724h;
                List<e0> list5 = this.f106725i;
                l0<e0> l0Var5 = this.f106726j;
                Set<? extends Object> set3 = this.f106727k;
                Object objA2 = c4.f106500a.a("Recomposer:recompose");
                try {
                    m2Var2.w0();
                    synchronized (m2Var2.stateLock) {
                        try {
                            t2.b bVar = m2Var2.compositionInvalidations;
                            int size = bVar.getSize();
                            if (size > 0) {
                                Object[] objArrM = bVar.m();
                                int i18 = 0;
                                while (true) {
                                    Object[] objArr4 = objArrM;
                                    list3.add((e0) objArrM[i18]);
                                    i18++;
                                    if (i18 >= size) {
                                        break;
                                    } else {
                                        objArrM = objArr4;
                                    }
                                }
                            }
                            m2Var2.compositionInvalidations.h();
                            h0 h0Var2 = h0.f84049a;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    l0Var2.m();
                    l0Var3.m();
                    while (true) {
                        if (list3.isEmpty() && list4.isEmpty()) {
                            break;
                        }
                        try {
                            try {
                                int size2 = list3.size();
                                for (int i19 = 0; i19 < size2; i19++) {
                                    e0 e0Var = list3.get(i19);
                                    e0 e0VarR0 = m2Var2.r0(e0Var, l0Var2);
                                    if (e0VarR0 != null) {
                                        list5.add(e0VarR0);
                                        h0 h0Var3 = h0.f84049a;
                                    }
                                    l0Var3.h(e0Var);
                                }
                                list3.clear();
                                if (l0Var2.e() || m2Var2.compositionInvalidations.q()) {
                                    synchronized (m2Var2.stateLock) {
                                        try {
                                            List listK0 = m2Var2.k0();
                                            int size3 = listK0.size();
                                            for (int i21 = 0; i21 < size3; i21++) {
                                                e0 e0Var2 = (e0) listK0.get(i21);
                                                if (!l0Var3.a(e0Var2) && e0Var2.f(set3)) {
                                                    list3.add(e0Var2);
                                                }
                                            }
                                            t2.b bVar2 = m2Var2.compositionInvalidations;
                                            int size4 = bVar2.getSize();
                                            int i22 = 0;
                                            int i23 = 0;
                                            while (i22 < size4) {
                                                e0 e0Var3 = (e0) bVar2.m()[i22];
                                                if (l0Var3.a(e0Var3) || list3.contains(e0Var3)) {
                                                    set2 = set3;
                                                    if (i23 > 0) {
                                                        bVar2.m()[i22 - i23] = bVar2.m()[i22];
                                                    }
                                                } else {
                                                    set2 = set3;
                                                    list3.add(e0Var3);
                                                    i23++;
                                                }
                                                i22++;
                                                set3 = set2;
                                            }
                                            set = set3;
                                            int i24 = size4 - i23;
                                            n.z(bVar2.m(), null, i24, size4);
                                            bVar2.z(i24);
                                            h0 h0Var4 = h0.f84049a;
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                } else {
                                    set = set3;
                                }
                                if (list3.isEmpty()) {
                                    try {
                                        k.f(list4, m2Var2);
                                        while (!list4.isEmpty()) {
                                            l0Var4.v(m2Var2.q0(list4, l0Var2));
                                            k.f(list4, m2Var2);
                                        }
                                    } catch (Exception e11) {
                                        m2.t0(m2Var2, e11, null, true, 2, null);
                                        k.e(m2Var2, list3, list4, list5, l0Var4, l0Var5, l0Var2, l0Var3);
                                    }
                                }
                                set3 = set;
                            } catch (Exception e12) {
                                m2.t0(m2Var2, e12, null, true, 2, null);
                                list = list3;
                                try {
                                    k.e(m2Var2, list, list4, list5, l0Var4, l0Var5, l0Var2, l0Var3);
                                    list.clear();
                                } catch (Throwable th5) {
                                    th = th5;
                                    list.clear();
                                    throw th;
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            list = list3;
                            list.clear();
                            throw th;
                        }
                        c4.f106500a.b(objA2);
                    }
                    if (list5.isEmpty()) {
                        if (l0Var4.e()) {
                            l0Var5.u(l0Var4);
                            objArr = l0Var4.elements;
                            c11 = 7;
                            jArr = l0Var4.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                            j12 = 128;
                            length = jArr.length - 2;
                            if (length >= 0) {
                                i11 = 0;
                                while (true) {
                                    i12 = length;
                                    j13 = jArr[i11];
                                    l0Var = l0Var2;
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        length = i12;
                                        if (i11 != length) {
                                            break;
                                            break;
                                        } else {
                                            i11++;
                                            l0Var2 = l0Var;
                                        }
                                    } else {
                                        i13 = 8 - ((~(i11 - i12)) >>> 31);
                                        for (i14 = 0; i14 < i13; i14++) {
                                            if ((j13 & 255) < 128) {
                                                ((e0) objArr[(i11 << 3) + i14]).k();
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i13 == 8) {
                                            break;
                                            break;
                                        }
                                        length = i12;
                                        if (i11 != length) {
                                            break;
                                            break;
                                        } else {
                                            i11++;
                                            l0Var2 = l0Var;
                                        }
                                    }
                                }
                            } else {
                                l0Var = l0Var2;
                            }
                            l0Var4.m();
                            l0Var2 = l0Var;
                        } else {
                            c11 = 7;
                            j12 = 128;
                        }
                        if (l0Var5.e()) {
                            objArr2 = l0Var5.elements;
                            jArr2 = l0Var5.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                            length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                i15 = 0;
                                while (true) {
                                    j14 = jArr2[i15];
                                    objArr3 = objArr2;
                                    if ((((~j14) << c11) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        for (i17 = 0; i17 < i16; i17++) {
                                            if ((j14 & 255) < j12) {
                                                ((e0) objArr3[(i15 << 3) + i17]).h();
                                            }
                                            j14 >>= 8;
                                        }
                                        if (i16 == 8) {
                                            break;
                                            break;
                                        }
                                    }
                                    if (i15 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i15++;
                                        objArr2 = objArr3;
                                    }
                                }
                            }
                            l0Var5.m();
                            synchronized (m2Var2.stateLock) {
                                m2Var2.c0();
                                androidx.compose.runtime.snapshots.g.INSTANCE.g();
                                l0Var3.m();
                                l0Var2.m();
                                m2Var2.compositionsRemoved = null;
                                h0 h0Var5 = h0.f84049a;
                            }
                        } else {
                            synchronized (m2Var2.stateLock) {
                                m2Var2.c0();
                                androidx.compose.runtime.snapshots.g.INSTANCE.g();
                                l0Var3.m();
                                l0Var2.m();
                                m2Var2.compositionsRemoved = null;
                                h0 h0Var6 = h0.f84049a;
                            }
                        }
                    } else {
                        m2Var2.changeCount = m2Var2.getChangeCount() + 1;
                        try {
                            try {
                                int size5 = list5.size();
                                for (int i25 = 0; i25 < size5; i25++) {
                                    l0Var5.h(list5.get(i25));
                                }
                                int size6 = list5.size();
                                for (int i26 = 0; i26 < size6; i26++) {
                                    list5.get(i26).p();
                                }
                                list5.clear();
                                if (l0Var4.e()) {
                                    try {
                                        try {
                                            l0Var5.u(l0Var4);
                                            objArr = l0Var4.elements;
                                            c11 = 7;
                                            jArr = l0Var4.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                            j12 = 128;
                                            length = jArr.length - 2;
                                            if (length >= 0) {
                                                i11 = 0;
                                                while (true) {
                                                    i12 = length;
                                                    j13 = jArr[i11];
                                                    l0Var = l0Var2;
                                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        length = i12;
                                                        if (i11 != length) {
                                                            break;
                                                            break;
                                                        } else {
                                                            i11++;
                                                            l0Var2 = l0Var;
                                                        }
                                                    } else {
                                                        i13 = 8 - ((~(i11 - i12)) >>> 31);
                                                        while (i14 < i13) {
                                                            if ((j13 & 255) < 128) {
                                                                try {
                                                                    ((e0) objArr[(i11 << 3) + i14]).k();
                                                                } catch (Exception e13) {
                                                                    e = e13;
                                                                    m2.t0(m2Var2, e, null, false, 6, null);
                                                                    try {
                                                                        k.e(m2Var2, list3, list4, list5, l0Var4, l0Var5, l0Var, l0Var3);
                                                                        l0Var4.m();
                                                                        c4.f106500a.b(objA2);
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        l0Var4 = l0Var4;
                                                                        l0Var4.m();
                                                                        throw th;
                                                                    }
                                                                }
                                                            }
                                                            j13 >>= 8;
                                                        }
                                                        if (i13 == 8) {
                                                            break;
                                                        }
                                                        length = i12;
                                                        if (i11 != length) {
                                                            break;
                                                        }
                                                        i11++;
                                                        l0Var2 = l0Var;
                                                    }
                                                }
                                            } else {
                                                l0Var = l0Var2;
                                            }
                                            l0Var4.m();
                                            l0Var2 = l0Var;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            l0Var4.m();
                                            throw th;
                                        }
                                    } catch (Exception e14) {
                                        e = e14;
                                        l0Var = l0Var2;
                                    }
                                } else {
                                    c11 = 7;
                                    j12 = 128;
                                }
                                if (l0Var5.e()) {
                                    try {
                                        try {
                                            objArr2 = l0Var5.elements;
                                            jArr2 = l0Var5.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                            length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                i15 = 0;
                                                while (true) {
                                                    j14 = jArr2[i15];
                                                    objArr3 = objArr2;
                                                    if ((((~j14) << c11) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                        while (i17 < i16) {
                                                            if ((j14 & 255) < j12) {
                                                                ((e0) objArr3[(i15 << 3) + i17]).h();
                                                            }
                                                            j14 >>= 8;
                                                        }
                                                        if (i16 == 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i15 != length2) {
                                                        break;
                                                    }
                                                    i15++;
                                                    objArr2 = objArr3;
                                                }
                                            }
                                            l0Var5.m();
                                            synchronized (m2Var2.stateLock) {
                                                m2Var2.c0();
                                            }
                                            androidx.compose.runtime.snapshots.g.INSTANCE.g();
                                            l0Var3.m();
                                            l0Var2.m();
                                            m2Var2.compositionsRemoved = null;
                                            h0 h0Var7 = h0.f84049a;
                                        } catch (Exception e15) {
                                            m2.t0(m2Var2, e15, null, false, 6, null);
                                            try {
                                                k.e(m2Var2, list3, list4, list5, l0Var4, l0Var5, l0Var2, l0Var3);
                                                l0Var5.m();
                                            } catch (Throwable th9) {
                                                th = th9;
                                                l0Var5 = l0Var5;
                                                l0Var5.m();
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        l0Var5.m();
                                        throw th;
                                    }
                                } else {
                                    synchronized (m2Var2.stateLock) {
                                        m2Var2.c0();
                                        androidx.compose.runtime.snapshots.g.INSTANCE.g();
                                        l0Var3.m();
                                        l0Var2.m();
                                        m2Var2.compositionsRemoved = null;
                                        h0 h0Var8 = h0.f84049a;
                                    }
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                list2 = list5;
                                list2.clear();
                                throw th;
                            }
                        } catch (Exception e16) {
                            m2.t0(m2Var2, e16, null, false, 6, null);
                            try {
                                k.e(m2Var2, list3, list4, list5, l0Var4, l0Var5, l0Var2, l0Var3);
                                list5.clear();
                            } catch (Throwable th12) {
                                th = th12;
                                list2 = list5;
                                list2.clear();
                                throw th;
                            }
                        }
                    }
                    c4.f106500a.b(objA2);
                } catch (Throwable th13) {
                    c4.f106500a.b(objA2);
                    throw th13;
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Long l11) {
                a(l11.longValue());
                return h0.f84049a;
            }
        }

        k(Continuation<? super k> continuation) {
            super(3, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:21:0x0077 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x0079 A[Catch: all -> 0x002b, LOOP:1: B:12:0x0043->B:22:0x0079, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x000d, B:6:0x001a, B:9:0x002e, B:12:0x0043, B:14:0x0054, B:16:0x005e, B:18:0x0064, B:19:0x0071, B:24:0x0084, B:27:0x0091, B:29:0x009c, B:31:0x00a6, B:33:0x00ac, B:34:0x00b6, B:37:0x00be, B:38:0x00c1, B:41:0x00d1, B:43:0x00dc, B:45:0x00e6, B:47:0x00ec, B:48:0x00f9, B:51:0x0101, B:52:0x0104, B:22:0x0079), top: B:57:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00bc A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:37:0x00be A[Catch: all -> 0x002b, LOOP:3: B:27:0x0091->B:37:0x00be, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x000d, B:6:0x001a, B:9:0x002e, B:12:0x0043, B:14:0x0054, B:16:0x005e, B:18:0x0064, B:19:0x0071, B:24:0x0084, B:27:0x0091, B:29:0x009c, B:31:0x00a6, B:33:0x00ac, B:34:0x00b6, B:37:0x00be, B:38:0x00c1, B:41:0x00d1, B:43:0x00dc, B:45:0x00e6, B:47:0x00ec, B:48:0x00f9, B:51:0x0101, B:52:0x0104, B:22:0x0079), top: B:57:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:50:0x00ff A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x0101 A[Catch: all -> 0x002b, LOOP:5: B:41:0x00d1->B:51:0x0101, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x000d, B:6:0x001a, B:9:0x002e, B:12:0x0043, B:14:0x0054, B:16:0x005e, B:18:0x0064, B:19:0x0071, B:24:0x0084, B:27:0x0091, B:29:0x009c, B:31:0x00a6, B:33:0x00ac, B:34:0x00b6, B:37:0x00be, B:38:0x00c1, B:41:0x00d1, B:43:0x00dc, B:45:0x00e6, B:47:0x00ec, B:48:0x00f9, B:51:0x0101, B:52:0x0104, B:22:0x0079), top: B:57:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0084 A[EDGE_INSN: B:61:0x0084->B:24:0x0084 BREAK  A[LOOP:1: B:12:0x0043->B:22:0x0079], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x00c1 A[EDGE_INSN: B:66:0x00c1->B:38:0x00c1 BREAK  A[LOOP:3: B:27:0x0091->B:37:0x00be], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:71:0x0104 A[EDGE_INSN: B:71:0x0104->B:52:0x0104 BREAK  A[LOOP:5: B:41:0x00d1->B:51:0x0101], SYNTHETIC] */
        public static final void e(m2 m2Var, List<e0> list, List<k1> list2, List<e0> list3, l0<e0> l0Var, l0<e0> l0Var2, l0<Object> l0Var3, l0<e0> l0Var4) {
            char c11;
            long j11;
            long j12;
            synchronized (m2Var.stateLock) {
                try {
                    list.clear();
                    list2.clear();
                    int size = list3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        e0 e0Var = list3.get(i11);
                        e0Var.t();
                        m2Var.x0(e0Var);
                    }
                    list3.clear();
                    Object[] objArr = l0Var.elements;
                    long[] jArr = l0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i12 = 0;
                        j11 = 255;
                        while (true) {
                            long j13 = jArr[i12];
                            c11 = 7;
                            j12 = -9187201950435737472L;
                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i12 != length) {
                                    break;
                                    break;
                                }
                                i12++;
                            } else {
                                int i13 = 8 - ((~(i12 - length)) >>> 31);
                                for (int i14 = 0; i14 < i13; i14++) {
                                    if ((j13 & 255) < 128) {
                                        e0 e0Var2 = (e0) objArr[(i12 << 3) + i14];
                                        e0Var2.t();
                                        m2Var.x0(e0Var2);
                                    }
                                    j13 >>= 8;
                                }
                                if (i13 != 8) {
                                    break;
                                } else if (i12 != length) {
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                        }
                    } else {
                        c11 = 7;
                        j11 = 255;
                        j12 = -9187201950435737472L;
                    }
                    l0Var.m();
                    Object[] objArr2 = l0Var2.elements;
                    long[] jArr2 = l0Var2.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j14 = jArr2[i15];
                            if ((((~j14) << c11) & j14 & j12) == j12) {
                                if (i15 != length2) {
                                    break;
                                    break;
                                }
                                i15++;
                            } else {
                                int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j14 & j11) < 128) {
                                        ((e0) objArr2[(i15 << 3) + i17]).h();
                                    }
                                    j14 >>= 8;
                                }
                                if (i16 != 8) {
                                    break;
                                } else if (i15 != length2) {
                                    break;
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                    l0Var2.m();
                    l0Var3.m();
                    Object[] objArr3 = l0Var4.elements;
                    long[] jArr3 = l0Var4.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                    int length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        int i18 = 0;
                        while (true) {
                            long j15 = jArr3[i18];
                            if ((((~j15) << c11) & j15 & j12) == j12) {
                                if (i18 != length3) {
                                    break;
                                    break;
                                }
                                i18++;
                            } else {
                                int i19 = 8 - ((~(i18 - length3)) >>> 31);
                                for (int i21 = 0; i21 < i19; i21++) {
                                    if ((j15 & j11) < 128) {
                                        e0 e0Var3 = (e0) objArr3[(i18 << 3) + i21];
                                        e0Var3.t();
                                        m2Var.x0(e0Var3);
                                    }
                                    j15 >>= 8;
                                }
                                if (i19 != 8) {
                                    break;
                                } else if (i18 != length3) {
                                    break;
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                    l0Var4.m();
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(List<k1> list, m2 m2Var) {
            list.clear();
            synchronized (m2Var.stateLock) {
                try {
                    List list2 = m2Var.compositionValuesAwaitingInsert;
                    int size = list2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        list.add((k1) list2.get(i11));
                    }
                    m2Var.compositionValuesAwaitingInsert.clear();
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, f1 f1Var, Continuation<? super h0> continuation) {
            k kVar = m2.this.new k(continuation);
            kVar.f106717w = f1Var;
            return kVar.invokeSuspend(h0.f84049a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:17:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:20:0x00df  */
        /* JADX WARN: Code duplicated, block: B:23:0x0101  */
        /* JADX WARN: Code duplicated, block: B:25:0x010f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0101 -> B:24:0x0109). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x010f -> B:12:0x00ac). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 283
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r2.m2.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends u implements wn0.l<Object, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e0 f106728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l0<Object> f106729d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(e0 e0Var, l0<Object> l0Var) {
            super(1);
            this.f106728c = e0Var;
            this.f106729d = l0Var;
        }

        public final void b(Object obj) {
            this.f106728c.r(obj);
            l0<Object> l0Var = this.f106729d;
            if (l0Var != null) {
                l0Var.h(obj);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
            b(obj);
            return h0.f84049a;
        }
    }

    public m2(CoroutineContext coroutineContext) {
        p020r2.h hVar = new p020r2.h(new e());
        this.broadcastFrameClock = hVar;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new l0<>(0, 1, null);
        this.compositionInvalidations = new t2.b<>(new e0[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.compositionValuesAwaitingInsert = new ArrayList();
        this.compositionValuesRemoved = new LinkedHashMap();
        this.compositionValueStatesAvailable = new LinkedHashMap();
        this._state = StateFlowKt.MutableStateFlow(d.Inactive);
        CompletableJob completableJobJob = JobKt.Job((Job) coroutineContext.get(Job.INSTANCE));
        completableJobJob.invokeOnCompletion(new f());
        this.effectJob = completableJobJob;
        this.effectCoroutineContext = coroutineContext.plus(hVar).plus(completableJobJob);
        this.recomposerInfo = new c();
    }

    private final wn0.l<Object, h0> C0(e0 composition, l0<Object> modifiedValues) {
        return new l(composition, modifiedValues);
    }

    private final void X(e0 composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
    }

    private final void Y(androidx.compose.runtime.snapshots.b snapshot) {
        try {
            if (snapshot.C() instanceof androidx.compose.runtime.snapshots.h.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            snapshot.d();
        } catch (Throwable th2) {
            snapshot.d();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Z(Continuation<? super h0> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl;
        if (j0()) {
            return h0.f84049a;
        }
        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl2.initCancellability();
        synchronized (this.stateLock) {
            if (j0()) {
                cancellableContinuationImpl = cancellableContinuationImpl2;
            } else {
                this.workContinuation = cancellableContinuationImpl2;
                cancellableContinuationImpl = null;
            }
        }
        if (cancellableContinuationImpl != null) {
            s.Companion companion = s.INSTANCE;
            cancellableContinuationImpl.resumeWith(s.b(h0.f84049a));
        }
        Object result = cancellableContinuationImpl2.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : h0.f84049a;
    }

    private final void b0() {
        this._knownCompositions.clear();
        this._knownCompositionsCache = v.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CancellableContinuation<h0> c0() {
        d dVar;
        int i11 = 0;
        int i12 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (this._state.getValue().compareTo(d.ShuttingDown) <= 0) {
            b0();
            this.snapshotInvalidations = new l0<>(i11, i12, defaultConstructorMarker);
            this.compositionInvalidations.h();
            this.compositionsAwaitingApply.clear();
            this.compositionValuesAwaitingInsert.clear();
            this.failedCompositions = null;
            CancellableContinuation<? super h0> cancellableContinuation = this.workContinuation;
            if (cancellableContinuation != null) {
                CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            dVar = d.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new l0<>(i11, i12, defaultConstructorMarker);
            this.compositionInvalidations.h();
            dVar = h0() ? d.InactivePendingWork : d.Inactive;
        } else {
            dVar = (this.compositionInvalidations.q() || this.snapshotInvalidations.e() || !this.compositionsAwaitingApply.isEmpty() || !this.compositionValuesAwaitingInsert.isEmpty() || this.concurrentCompositionsOutstanding > 0 || h0()) ? d.PendingWork : d.Idle;
        }
        this._state.setValue(dVar);
        if (dVar != d.PendingWork) {
            return null;
        }
        CancellableContinuation cancellableContinuation2 = this.workContinuation;
        this.workContinuation = null;
        return cancellableContinuation2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0() {
        int i11;
        List listM;
        synchronized (this.stateLock) {
            try {
                if (this.compositionValuesRemoved.isEmpty()) {
                    listM = v.m();
                } else {
                    List listA = v.A(this.compositionValuesRemoved.values());
                    this.compositionValuesRemoved.clear();
                    listM = new ArrayList(listA.size());
                    int size = listA.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        k1 k1Var = (k1) listA.get(i12);
                        listM.add(x.a(k1Var, this.compositionValueStatesAvailable.get(k1Var)));
                    }
                    this.compositionValueStatesAvailable.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size2 = listM.size();
        for (i11 = 0; i11 < size2; i11++) {
            Pair pair = (Pair) listM.get(i11);
            k1 k1Var2 = (k1) pair.a();
            j1 j1Var = (j1) pair.b();
            if (j1Var != null) {
                k1Var2.getComposition().j(j1Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g0() {
        boolean zH0;
        synchronized (this.stateLock) {
            zH0 = h0();
        }
        return zH0;
    }

    private final boolean h0() {
        return !this.frameClockPaused && this.broadcastFrameClock.h();
    }

    private final boolean i0() {
        return this.compositionInvalidations.q() || h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j0() {
        boolean z11;
        synchronized (this.stateLock) {
            z11 = this.snapshotInvalidations.e() || this.compositionInvalidations.q() || h0();
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<e0> k0() {
        List list = this._knownCompositionsCache;
        List list2 = list;
        if (list == null) {
            List<e0> list3 = this._knownCompositions;
            List listM = list3.isEmpty() ? v.m() : new ArrayList(list3);
            this._knownCompositionsCache = listM;
            list2 = listM;
        }
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l0() {
        boolean z11;
        synchronized (this.stateLock) {
            z11 = this.isClosed;
        }
        if (!z11) {
            return true;
        }
        Iterator<Job> it = this.effectJob.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next().isActive()) {
                return true;
            }
        }
        return false;
    }

    private final void o0(e0 composition) {
        synchronized (this.stateLock) {
            List<k1> list = this.compositionValuesAwaitingInsert;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (p013kotlin.jvm.internal.s.f(list.get(i11).getComposition(), composition)) {
                    h0 h0Var = h0.f84049a;
                    ArrayList arrayList = new ArrayList();
                    p0(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        q0(arrayList, null);
                        p0(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    private static final void p0(List<k1> list, m2 m2Var, e0 e0Var) {
        list.clear();
        synchronized (m2Var.stateLock) {
            try {
                Iterator<k1> it = m2Var.compositionValuesAwaitingInsert.iterator();
                while (it.hasNext()) {
                    k1 next = it.next();
                    if (p013kotlin.jvm.internal.s.f(next.getComposition(), e0Var)) {
                        list.add(next);
                        it.remove();
                    }
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<e0> q0(List<k1> references, l0<Object> modifiedValues) {
        ArrayList arrayList;
        HashMap map = new HashMap(references.size());
        int size = references.size();
        for (int i11 = 0; i11 < size; i11++) {
            k1 k1Var = references.get(i11);
            e0 e0VarB = k1Var.getComposition();
            Object arrayList2 = map.get(e0VarB);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(e0VarB, arrayList2);
            }
            ((ArrayList) arrayList2).add(k1Var);
        }
        for (Map.Entry entry : map.entrySet()) {
            e0 e0Var = (e0) entry.getKey();
            List list = (List) entry.getValue();
            o.Q(!e0Var.q());
            androidx.compose.runtime.snapshots.b bVarO = androidx.compose.runtime.snapshots.g.INSTANCE.o(u0(e0Var), C0(e0Var, modifiedValues));
            try {
                androidx.compose.runtime.snapshots.g gVarL = bVarO.l();
                try {
                    synchronized (this.stateLock) {
                        arrayList = new ArrayList(list.size());
                        int size2 = list.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            k1 k1Var2 = (k1) list.get(i12);
                            arrayList.add(x.a(k1Var2, n2.b(this.compositionValuesRemoved, k1Var2.c())));
                        }
                    }
                    int size3 = arrayList.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        if (arrayList.get(i13).f() != null) {
                            int size4 = arrayList.size();
                            for (int i14 = 0; i14 < size4; i14++) {
                                if (arrayList.get(i14).f() == null) {
                                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                                    int size5 = arrayList.size();
                                    for (int i15 = 0; i15 < size5; i15++) {
                                        Pair<k1, k1> pair = arrayList.get(i15);
                                        k1 k1VarE = pair.f() == null ? pair.e() : null;
                                        if (k1VarE != null) {
                                            arrayList3.add(k1VarE);
                                        }
                                    }
                                    synchronized (this.stateLock) {
                                        v.E(this.compositionValuesAwaitingInsert, arrayList3);
                                        h0 h0Var = h0.f84049a;
                                    }
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size6 = arrayList.size();
                                    for (int i16 = 0; i16 < size6; i16++) {
                                        Pair<k1, k1> pair2 = arrayList.get(i16);
                                        if (pair2.f() != null) {
                                            arrayList4.add(pair2);
                                        }
                                    }
                                    arrayList = arrayList4;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    e0Var.m(arrayList);
                    h0 h0Var2 = h0.f84049a;
                    bVarO.s(gVarL);
                    Y(bVarO);
                } catch (Throwable th2) {
                    bVarO.s(gVarL);
                    throw th2;
                }
            } catch (Throwable th3) {
                Y(bVarO);
                throw th3;
            }
        }
        return v.m1(map.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e0 r0(e0 composition, l0<Object> modifiedValues) {
        Set<e0> set;
        if (composition.q() || composition.getDisposed() || ((set = this.compositionsRemoved) != null && set.contains(composition))) {
            return null;
        }
        androidx.compose.runtime.snapshots.b bVarO = androidx.compose.runtime.snapshots.g.INSTANCE.o(u0(composition), C0(composition, modifiedValues));
        try {
            androidx.compose.runtime.snapshots.g gVarL = bVarO.l();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.e()) {
                        composition.i(new h(modifiedValues, composition));
                    }
                } catch (Throwable th2) {
                    bVarO.s(gVarL);
                    throw th2;
                }
            }
            boolean zN = composition.n();
            bVarO.s(gVarL);
            Y(bVarO);
            if (zN) {
                return composition;
            }
            return null;
        } catch (Throwable th3) {
            Y(bVarO);
            throw th3;
        }
    }

    private final void s0(Exception e11, e0 failedInitialComposition, boolean recoverable) throws Exception {
        int i11 = 0;
        if (!B.get().booleanValue() || (e11 instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                b bVar = this.errorState;
                if (bVar != null) {
                    throw bVar.getCause();
                }
                this.errorState = new b(false, e11);
                h0 h0Var = h0.f84049a;
            }
            throw e11;
        }
        synchronized (this.stateLock) {
            try {
                p020r2.b.f("Error was captured in composition while live edit was enabled.", e11);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.h();
                this.snapshotInvalidations = new l0<>(i11, 1, null);
                this.compositionValuesAwaitingInsert.clear();
                this.compositionValuesRemoved.clear();
                this.compositionValueStatesAvailable.clear();
                this.errorState = new b(recoverable, e11);
                if (failedInitialComposition != null) {
                    x0(failedInitialComposition);
                }
                c0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* synthetic */ void t0(m2 m2Var, Exception exc, e0 e0Var, boolean z11, int i11, Object obj) throws Exception {
        if ((i11 & 2) != 0) {
            e0Var = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        m2Var.s0(exc, e0Var, z11);
    }

    private final wn0.l<Object, h0> u0(e0 composition) {
        return new i(composition);
    }

    private final Object v0(q<? super CoroutineScope, ? super f1, ? super Continuation<? super h0>, ? extends Object> qVar, Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(this.broadcastFrameClock, new j(qVar, h1.a(continuation.getContext()), null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w0() {
        List<e0> listK0;
        boolean zI0;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.d()) {
                return i0();
            }
            Set<? extends Object> setA = t2.e.a(this.snapshotInvalidations);
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i11 = 1;
            int i12 = 0;
            this.snapshotInvalidations = new l0<>(i12, i11, defaultConstructorMarker);
            synchronized (this.stateLock) {
                listK0 = k0();
            }
            try {
                int size = listK0.size();
                for (int i13 = 0; i13 < size; i13++) {
                    listK0.get(i13).o(setA);
                    if (this._state.getValue().compareTo(d.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    this.snapshotInvalidations = new l0<>(i12, i11, defaultConstructorMarker);
                    h0 h0Var = h0.f84049a;
                }
                synchronized (this.stateLock) {
                    if (c0() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zI0 = i0();
                }
                return zI0;
            } catch (Throwable th2) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.j(setA);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(e0 composition) {
        List arrayList = this.failedCompositions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.failedCompositions = arrayList;
        }
        if (!arrayList.contains(composition)) {
            arrayList.add(composition);
        }
        z0(composition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(Job callingJob) {
        synchronized (this.stateLock) {
            Throwable th2 = this.closeCause;
            if (th2 != null) {
                throw th2;
            }
            if (this._state.getValue().compareTo(d.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = callingJob;
            c0();
        }
    }

    private final void z0(e0 composition) {
        this._knownCompositions.remove(composition);
        this._knownCompositionsCache = null;
    }

    public final void A0() {
        CancellableContinuation<h0> cancellableContinuationC0;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                cancellableContinuationC0 = c0();
            } else {
                cancellableContinuationC0 = null;
            }
        }
        if (cancellableContinuationC0 != null) {
            s.Companion companion = s.INSTANCE;
            cancellableContinuationC0.resumeWith(s.b(h0.f84049a));
        }
    }

    public final Object B0(Continuation<? super h0> continuation) {
        Object objV0 = v0(new k(null), continuation);
        return objV0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objV0 : h0.f84049a;
    }

    @Override // p020r2.q
    public void a(e0 composition, p<? super p020r2.l, ? super Integer, h0> content) throws Exception {
        Throwable th2;
        boolean zQ = composition.q();
        try {
            androidx.compose.runtime.snapshots.g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            androidx.compose.runtime.snapshots.b bVarO = companion.o(u0(composition), C0(composition, null));
            try {
                androidx.compose.runtime.snapshots.g gVarL = bVarO.l();
                try {
                    composition.u(content);
                    h0 h0Var = h0.f84049a;
                    bVarO.s(gVarL);
                    Y(bVarO);
                    if (!zQ) {
                        companion.g();
                    }
                    synchronized (this.stateLock) {
                        try {
                            if (this._state.getValue().compareTo(d.ShuttingDown) > 0) {
                                try {
                                    if (!k0().contains(composition)) {
                                        X(composition);
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            try {
                                o0(composition);
                                try {
                                    composition.p();
                                    composition.k();
                                    if (zQ) {
                                        return;
                                    }
                                    companion.g();
                                } catch (Exception e11) {
                                    t0(this, e11, null, false, 6, null);
                                }
                            } catch (Exception e12) {
                                s0(e12, composition, true);
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        bVarO.s(gVarL);
                        throw th5;
                    } catch (Throwable th6) {
                        th = th6;
                        Throwable th7 = th;
                        try {
                            Y(bVarO);
                            throw th7;
                        } catch (Exception e13) {
                            e = e13;
                            s0(e, composition, true);
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    public final void a0() {
        synchronized (this.stateLock) {
            try {
                if (this._state.getValue().compareTo(d.Idle) >= 0) {
                    this._state.setValue(d.ShuttingDown);
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Job.DefaultImpls.cancel$default((Job) this.effectJob, (CancellationException) null, 1, (Object) null);
    }

    @Override // p020r2.q
    public void b(k1 reference) {
        synchronized (this.stateLock) {
            n2.a(this.compositionValuesRemoved, reference.c(), reference);
        }
    }

    @Override // p020r2.q
    public boolean d() {
        return B.get().booleanValue();
    }

    @Override // p020r2.q
    public boolean e() {
        return false;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // p020r2.q
    public boolean f() {
        return false;
    }

    public final StateFlow<d> f0() {
        return this._state;
    }

    @Override // p020r2.q
    public int h() {
        return 1000;
    }

    @Override // p020r2.q
    /* JADX INFO: renamed from: i, reason: from getter */
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    @Override // p020r2.q
    public void k(k1 reference) {
        CancellableContinuation<h0> cancellableContinuationC0;
        synchronized (this.stateLock) {
            this.compositionValuesAwaitingInsert.add(reference);
            cancellableContinuationC0 = c0();
        }
        if (cancellableContinuationC0 != null) {
            s.Companion companion = s.INSTANCE;
            cancellableContinuationC0.resumeWith(s.b(h0.f84049a));
        }
    }

    @Override // p020r2.q
    public void l(e0 composition) {
        CancellableContinuation<h0> cancellableContinuationC0;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.i(composition)) {
                cancellableContinuationC0 = null;
            } else {
                this.compositionInvalidations.b(composition);
                cancellableContinuationC0 = c0();
            }
        }
        if (cancellableContinuationC0 != null) {
            s.Companion companion = s.INSTANCE;
            cancellableContinuationC0.resumeWith(s.b(h0.f84049a));
        }
    }

    @Override // p020r2.q
    public void m(k1 reference, j1 data) {
        synchronized (this.stateLock) {
            this.compositionValueStatesAvailable.put(reference, data);
            h0 h0Var = h0.f84049a;
        }
    }

    public final Object m0(Continuation<? super h0> continuation) {
        Object objFirst = FlowKt.first(f0(), new g(null), continuation);
        return objFirst == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFirst : h0.f84049a;
    }

    @Override // p020r2.q
    public j1 n(k1 reference) {
        j1 j1VarRemove;
        synchronized (this.stateLock) {
            j1VarRemove = this.compositionValueStatesAvailable.remove(reference);
        }
        return j1VarRemove;
    }

    public final void n0() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            h0 h0Var = h0.f84049a;
        }
    }

    @Override // p020r2.q
    public void q(e0 composition) {
        synchronized (this.stateLock) {
            try {
                Set linkedHashSet = this.compositionsRemoved;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.compositionsRemoved = linkedHashSet;
                }
                linkedHashSet.add(composition);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p020r2.q
    public void t(e0 composition) {
        synchronized (this.stateLock) {
            z0(composition);
            this.compositionInvalidations.t(composition);
            this.compositionsAwaitingApply.remove(composition);
            h0 h0Var = h0.f84049a;
        }
    }

    @Override // p020r2.q
    public void o(Set<c3.a> table) {
    }
}
