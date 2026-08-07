package kotlinx.coroutines.debug.internal;

import ch.qos.logback.core.CoreConstants;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ScopeCoroutine;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u009a\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J;\u0010\u0014\u001a\u00020\u0006*\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J@\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\b\b\u0000\u0010\u0016*\u00020\u00012\u001e\b\u0004\u0010\u001a\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u0017H\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u0012*\u00020\u0001H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0018H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J%\u0010(\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001bH\u0002¢\u0006\u0004\b(\u0010)J5\u0010.\u001a\b\u0012\u0004\u0012\u00020&0\u001b2\u0006\u0010*\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020&0\u001bH\u0002¢\u0006\u0004\b.\u0010/J?\u00105\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000200042\u0006\u00101\u001a\u0002002\f\u00103\u001a\b\u0012\u0004\u0012\u00020&022\f\u0010-\u001a\b\u0012\u0004\u0012\u00020&0\u001bH\u0002¢\u0006\u0004\b5\u00106J3\u00108\u001a\u0002002\u0006\u00107\u001a\u0002002\f\u00103\u001a\b\u0012\u0004\u0012\u00020&022\f\u0010-\u001a\b\u0012\u0004\u0012\u00020&0\u001bH\u0002¢\u0006\u0004\b8\u00109J#\u0010<\u001a\u00020\u00062\n\u0010;\u001a\u0006\u0012\u0002\b\u00030:2\u0006\u0010*\u001a\u00020\u0012H\u0002¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u00020\u00062\u0006\u0010;\u001a\u00020>2\u0006\u0010*\u001a\u00020\u0012H\u0002¢\u0006\u0004\b?\u0010@J\u0016\u0010A\u001a\u0004\u0018\u00010>*\u00020>H\u0082\u0010¢\u0006\u0004\bA\u0010BJ/\u0010<\u001a\u00020\u00062\n\u0010C\u001a\u0006\u0012\u0002\b\u00030\u00182\n\u0010;\u001a\u0006\u0012\u0002\b\u00030:2\u0006\u0010*\u001a\u00020\u0012H\u0002¢\u0006\u0004\b<\u0010DJ\u001d\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030:H\u0002¢\u0006\u0004\bC\u0010EJ\u001a\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018*\u00020>H\u0082\u0010¢\u0006\u0004\bC\u0010FJ\u0019\u0010H\u001a\u00020G*\b\u0012\u0004\u0012\u00020&0\u001bH\u0002¢\u0006\u0004\bH\u0010IJ3\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000:\"\u0004\b\u0000\u0010J2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000:2\b\u0010;\u001a\u0004\u0018\u00010GH\u0002¢\u0006\u0004\bL\u0010MJ\u001b\u0010N\u001a\u00020\u00062\n\u0010C\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0002¢\u0006\u0004\bN\u0010OJ'\u0010R\u001a\b\u0012\u0004\u0012\u00020&0\u001b\"\b\b\u0000\u0010J*\u00020P2\u0006\u0010Q\u001a\u00028\u0000H\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010U\u001a\u00020\u0006H\u0000¢\u0006\u0004\bT\u0010\u0003J\u000f\u0010W\u001a\u00020\u0006H\u0000¢\u0006\u0004\bV\u0010\u0003J\u0017\u0010[\u001a\u00020\u00122\u0006\u0010X\u001a\u00020\u000bH\u0000¢\u0006\u0004\bY\u0010ZJ\u0013\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000102¢\u0006\u0004\b\\\u0010]J\u0015\u0010`\u001a\u00020\u00122\u0006\u0010_\u001a\u00020^¢\u0006\u0004\b`\u0010aJ\u0013\u0010b\u001a\b\u0012\u0004\u0012\u00020^0\u001b¢\u0006\u0004\bb\u0010cJ\u0013\u0010e\u001a\b\u0012\u0004\u0012\u00020d0\u001b¢\u0006\u0004\be\u0010cJ\u0017\u0010f\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\bf\u0010%J)\u0010g\u001a\b\u0012\u0004\u0012\u00020&0\u001b2\u0006\u0010_\u001a\u00020^2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020&0\u001b¢\u0006\u0004\bg\u0010hJ\u001b\u0010k\u001a\u00020\u00062\n\u0010;\u001a\u0006\u0012\u0002\b\u00030:H\u0000¢\u0006\u0004\bi\u0010jJ\u001b\u0010m\u001a\u00020\u00062\n\u0010;\u001a\u0006\u0012\u0002\b\u00030:H\u0000¢\u0006\u0004\bl\u0010jJ)\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000:\"\u0004\b\u0000\u0010J2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000:H\u0000¢\u0006\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010v\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR$\u0010y\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0018\u0012\u0004\u0012\u00020\u00050x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR#\u0010{\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R'\u0010\u0081\u0001\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0081\u0001\u0010|\u001a\u0005\b\u0082\u0001\u0010~\"\u0006\b\u0083\u0001\u0010\u0080\u0001R'\u0010\u0084\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0084\u0001\u0010|\u001a\u0005\b\u0085\u0001\u0010~\"\u0006\b\u0086\u0001\u0010\u0080\u0001R%\u0010\u0087\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\"\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\r0x8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010zR\"\u0010\u008d\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u008a\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\"\u0010\u0091\u0001\u001a\u00020\u0012*\u00020\u000b8BX\u0082\u0004¢\u0006\u000f\u0012\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0005\b\u008e\u0001\u0010ZR\u001b\u0010\u0092\u0001\u001a\u00020\u0005*\u00020&8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0013\u0010\u0095\u0001\u001a\u00020\u00058G¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010~R\r\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004R\r\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¨\u0006\u009b\u0001"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "", "<init>", "()V", "Lkotlin/Function1;", "", "Ljn0/h0;", "getDynamicAttach", "()Lwn0/l;", "startWeakRefCleanerThread", "stopWeakRefCleanerThread", "Lkotlinx/coroutines/Job;", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "indent", "build", "(Lkotlinx/coroutines/Job;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "Lkotlin/coroutines/CoroutineContext;", "create", "", "dumpCoroutinesInfoImpl", "(Lwn0/p;)Ljava/util/List;", "toStringRepr", "(Ljava/lang/Object;)Ljava/lang/String;", "isFinished", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)Z", "Ljava/io/PrintStream;", "out", "dumpCoroutinesSynchronized", "(Ljava/io/PrintStream;)V", "Ljava/lang/StackTraceElement;", "frames", "printStackTrace", "(Ljava/io/PrintStream;Ljava/util/List;)V", "state", "Ljava/lang/Thread;", "thread", "coroutineTrace", "enhanceStackTraceWithThreadDumpImpl", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "", "actualTrace", "Lkotlin/Pair;", "findContinuationStartIndex", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "frameIndex", "findIndexOfFrame", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lkotlin/coroutines/Continuation;", "frame", "updateState", "(Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "updateRunningState", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Ljava/lang/String;)V", "realCaller", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "owner", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "(Lkotlin/coroutines/Continuation;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "toStackTraceFrame", "(Ljava/util/List;)Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "T", "completion", "createOwner", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/StackTraceFrame;)Lkotlin/coroutines/Continuation;", "probeCoroutineCompleted", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)V", "", "throwable", "sanitizeStackTrace", "(Ljava/lang/Throwable;)Ljava/util/List;", "install$kotlinx_coroutines_core", "install", "uninstall$kotlinx_coroutines_core", "uninstall", "job", "hierarchyToString$kotlinx_coroutines_core", "(Lkotlinx/coroutines/Job;)Ljava/lang/String;", "hierarchyToString", "dumpCoroutinesInfoAsJsonAndReferences", "()[Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "info", "enhanceStackTraceWithThreadDumpAsJson", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;)Ljava/lang/String;", "dumpCoroutinesInfo", "()Ljava/util/List;", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "dumpDebuggerInfo", "dumpCoroutines", "enhanceStackTraceWithThreadDump", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;Ljava/util/List;)Ljava/util/List;", "probeCoroutineResumed$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)V", "probeCoroutineResumed", "probeCoroutineSuspended$kotlinx_coroutines_core", "probeCoroutineSuspended", "probeCoroutineCreated$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "probeCoroutineCreated", "ARTIFICIAL_FRAME", "Ljava/lang/StackTraceElement;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "weakRefCleanerThread", "Ljava/lang/Thread;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "capturedCoroutinesMap", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "sanitizeStackTraces", "Z", "getSanitizeStackTraces$kotlinx_coroutines_core", "()Z", "setSanitizeStackTraces$kotlinx_coroutines_core", "(Z)V", "enableCreationStackTraces", "getEnableCreationStackTraces$kotlinx_coroutines_core", "setEnableCreationStackTraces$kotlinx_coroutines_core", "ignoreCoroutinesWithEmptyContext", "getIgnoreCoroutinesWithEmptyContext", "setIgnoreCoroutinesWithEmptyContext", "dynamicAttach", "Lwn0/l;", "callerInfoCache", "", "getCapturedCoroutines", "()Ljava/util/Set;", "capturedCoroutines", "getDebugString", "getDebugString$annotations", "(Lkotlinx/coroutines/Job;)V", "debugString", "isInternalMethod", "(Ljava/lang/StackTraceElement;)Z", "isInstalled$kotlinx_coroutines_debug", "isInstalled", "Lkotlinx/atomicfu/AtomicInt;", "installations", "Lkotlinx/atomicfu/AtomicLong;", "sequenceNumber", "CoroutineOwner", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DebugProbesImpl {
    private static final StackTraceElement ARTIFICIAL_FRAME;
    public static final DebugProbesImpl INSTANCE;
    private static final ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfo> callerInfoCache;
    private static final ConcurrentWeakMap<CoroutineOwner<?>, Boolean> capturedCoroutinesMap;
    private static final SimpleDateFormat dateFormat;
    private static final l<Boolean, h0> dynamicAttach;
    private static boolean enableCreationStackTraces;
    private static boolean ignoreCoroutinesWithEmptyContext;
    private static final /* synthetic */ AtomicInteger installations;
    private static boolean sanitizeStackTraces;
    private static final /* synthetic */ AtomicLong sequenceNumber;
    private static Thread weakRefCleanerThread;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "info", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Ljn0/s;", "result", "Ljn0/h0;", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "getFrame", "()Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "frame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CoroutineOwner<T> implements Continuation<T>, CoroutineStackFrame {
        public final Continuation<T> delegate;
        public final DebugCoroutineInfo info;

        /* JADX WARN: Multi-variable type inference failed */
        public CoroutineOwner(Continuation<? super T> continuation, DebugCoroutineInfo debugCoroutineInfo) {
            this.delegate = continuation;
            this.info = debugCoroutineInfo;
        }

        private final StackTraceFrame getFrame() {
            return this.info.getCreationStackBottom();
        }

        @Override // p013kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public CoroutineStackFrame getCallerFrame() {
            StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getCallerFrame();
            }
            return null;
        }

        @Override // p013kotlin.coroutines.Continuation
        /* JADX INFO: renamed from: getContext */
        public CoroutineContext get$context() {
            return this.delegate.get$context();
        }

        @Override // p013kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public StackTraceElement getStackTraceElement() {
            StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getStackTraceElement();
            }
            return null;
        }

        @Override // p013kotlin.coroutines.Continuation
        public void resumeWith(Object result) {
            DebugProbesImpl.INSTANCE.probeCoroutineCompleted(this);
            this.delegate.resumeWith(result);
        }

        public String toString() {
            return this.delegate.toString();
        }
    }

    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        INSTANCE = debugProbesImpl;
        ARTIFICIAL_FRAME = new b.a().b();
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        capturedCoroutinesMap = new ConcurrentWeakMap<>(false, 1, null);
        installations = new AtomicInteger(0);
        sequenceNumber = new AtomicLong(0L);
        sanitizeStackTraces = true;
        ignoreCoroutinesWithEmptyContext = true;
        dynamicAttach = debugProbesImpl.getDynamicAttach();
        callerInfoCache = new ConcurrentWeakMap<>(true);
    }

    private DebugProbesImpl() {
    }

    private final void build(Job job, Map<Job, DebugCoroutineInfo> map, StringBuilder sb2, String str) {
        DebugCoroutineInfo debugCoroutineInfo = map.get(job);
        if (debugCoroutineInfo != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) v.q0(debugCoroutineInfo.lastObservedStackTrace$kotlinx_coroutines_core());
            sb2.append(str + getDebugString(job) + ", continuation is " + debugCoroutineInfo.get_state() + " at line " + stackTraceElement + '\n');
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append('\t');
            str = sb3.toString();
        } else if (!(job instanceof ScopeCoroutine)) {
            sb2.append(str + getDebugString(job) + '\n');
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append('\t');
            str = sb4.toString();
        }
        Iterator<Job> it = job.getChildren().iterator();
        while (it.hasNext()) {
            build(it.next(), map, sb2, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> Continuation<T> createOwner(Continuation<? super T> completion, StackTraceFrame frame) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return completion;
        }
        CoroutineOwner<?> coroutineOwner = new CoroutineOwner<>(completion, new DebugCoroutineInfo(completion.get$context(), frame, getSequenceNumber().incrementAndGet()));
        ConcurrentWeakMap<CoroutineOwner<?>, Boolean> concurrentWeakMap = capturedCoroutinesMap;
        concurrentWeakMap.put(coroutineOwner, Boolean.TRUE);
        if (!isInstalled$kotlinx_coroutines_debug()) {
            concurrentWeakMap.clear();
        }
        return coroutineOwner;
    }

    private final <R> List<R> dumpCoroutinesInfoImpl(final p<? super CoroutineOwner<?>, ? super CoroutineContext, ? extends R> create) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return ho0.l.c0(ho0.l.V(ho0.l.Z(v.e0(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new l<CoroutineOwner<?>, R>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesInfoImpl.3
                @Override // wn0.l
                public final R invoke(CoroutineOwner<?> coroutineOwner) {
                    CoroutineContext context;
                    if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return create.invoke(coroutineOwner, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    private final void dumpCoroutinesSynchronized(PrintStream out) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        out.print("Coroutines dump " + dateFormat.format(Long.valueOf(System.currentTimeMillis())));
        for (CoroutineOwner coroutineOwner : ho0.l.Z(ho0.l.H(v.e0(getCapturedCoroutines()), new l() { // from class: kotlinx.coroutines.debug.internal.d
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DebugProbesImpl.dumpCoroutinesSynchronized$lambda$14((DebugProbesImpl.CoroutineOwner) obj));
            }
        }), new Comparator() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return mn0.a.d(Long.valueOf(((DebugProbesImpl.CoroutineOwner) t11).info.sequenceNumber), Long.valueOf(((DebugProbesImpl.CoroutineOwner) t12).info.sequenceNumber));
            }
        })) {
            DebugCoroutineInfo debugCoroutineInfo = coroutineOwner.info;
            List<StackTraceElement> listLastObservedStackTrace$kotlinx_coroutines_core = debugCoroutineInfo.lastObservedStackTrace$kotlinx_coroutines_core();
            DebugProbesImpl debugProbesImpl = INSTANCE;
            List<StackTraceElement> listEnhanceStackTraceWithThreadDumpImpl = debugProbesImpl.enhanceStackTraceWithThreadDumpImpl(debugCoroutineInfo.get_state(), debugCoroutineInfo.lastObservedThread, listLastObservedStackTrace$kotlinx_coroutines_core);
            out.print("\n\nCoroutine " + coroutineOwner.delegate + ", state: " + ((s.f(debugCoroutineInfo.get_state(), DebugCoroutineInfoImplKt.RUNNING) && listEnhanceStackTraceWithThreadDumpImpl == listLastObservedStackTrace$kotlinx_coroutines_core) ? debugCoroutineInfo.get_state() + " (Last suspension stacktrace, not an actual stacktrace)" : debugCoroutineInfo.get_state()));
            if (listLastObservedStackTrace$kotlinx_coroutines_core.isEmpty()) {
                out.print("\n\tat " + ARTIFICIAL_FRAME);
                debugProbesImpl.printStackTrace(out, debugCoroutineInfo.getCreationStackTrace());
            } else {
                debugProbesImpl.printStackTrace(out, listEnhanceStackTraceWithThreadDumpImpl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dumpCoroutinesSynchronized$lambda$14(CoroutineOwner coroutineOwner) {
        return !INSTANCE.isFinished(coroutineOwner);
    }

    private final List<StackTraceElement> enhanceStackTraceWithThreadDumpImpl(String state, Thread thread, List<StackTraceElement> coroutineTrace) {
        Object objB;
        if (s.f(state, DebugCoroutineInfoImplKt.RUNNING) && thread != null) {
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(thread.getStackTrace());
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            if (jn0.s.g(objB)) {
                objB = null;
            }
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) objB;
            if (stackTraceElementArr != null) {
                int length = stackTraceElementArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTraceElementArr[i11];
                    if (s.f(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && s.f(stackTraceElement.getMethodName(), "resumeWith") && s.f(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                        break;
                    }
                    i11++;
                }
                Pair<Integer, Integer> pairFindContinuationStartIndex = findContinuationStartIndex(i11, stackTraceElementArr, coroutineTrace);
                int iIntValue = pairFindContinuationStartIndex.a().intValue();
                int iIntValue2 = pairFindContinuationStartIndex.b().intValue();
                if (iIntValue != -1) {
                    ArrayList arrayList = new ArrayList((((coroutineTrace.size() + i11) - iIntValue) - 1) - iIntValue2);
                    int i12 = i11 - iIntValue2;
                    for (int i13 = 0; i13 < i12; i13++) {
                        arrayList.add(stackTraceElementArr[i13]);
                    }
                    int size = coroutineTrace.size();
                    for (int i14 = iIntValue + 1; i14 < size; i14++) {
                        arrayList.add(coroutineTrace.get(i14));
                    }
                    return arrayList;
                }
            }
        }
        return coroutineTrace;
    }

    private final Pair<Integer, Integer> findContinuationStartIndex(int indexOfResumeWith, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        for (int i11 = 0; i11 < 3; i11++) {
            int iFindIndexOfFrame = INSTANCE.findIndexOfFrame((indexOfResumeWith - 1) - i11, actualTrace, coroutineTrace);
            if (iFindIndexOfFrame != -1) {
                return x.a(Integer.valueOf(iFindIndexOfFrame), Integer.valueOf(i11));
            }
        }
        return x.a(-1, 0);
    }

    private final int findIndexOfFrame(int frameIndex, StackTraceElement[] actualTrace, List<StackTraceElement> coroutineTrace) {
        StackTraceElement stackTraceElement = (StackTraceElement) n.x0(actualTrace, frameIndex);
        if (stackTraceElement == null) {
            return -1;
        }
        int i11 = 0;
        for (StackTraceElement stackTraceElement2 : coroutineTrace) {
            if (s.f(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && s.f(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && s.f(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    private final Set<CoroutineOwner<?>> getCapturedCoroutines() {
        return capturedCoroutinesMap.keySet();
    }

    private final String getDebugString(Job job) {
        return job instanceof JobSupport ? ((JobSupport) job).toDebugString() : job.toString();
    }

    private static /* synthetic */ void getDebugString$annotations(Job job) {
    }

    private final l<Boolean, h0> getDynamicAttach() {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            s.i(objNewInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            objB = jn0.s.b((l) u0.g(objNewInstance, 1));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        return (l) (jn0.s.g(objB) ? null : objB);
    }

    private final /* synthetic */ AtomicInteger getInstallations() {
        return installations;
    }

    private final /* synthetic */ AtomicLong getSequenceNumber() {
        return sequenceNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFinished(CoroutineOwner<?> coroutineOwner) {
        Job job;
        CoroutineContext context = coroutineOwner.info.getContext();
        if (context == null || (job = (Job) context.get(Job.INSTANCE)) == null || !job.isCompleted()) {
            return false;
        }
        capturedCoroutinesMap.remove(coroutineOwner);
        return true;
    }

    private final boolean isInternalMethod(StackTraceElement stackTraceElement) {
        return p013kotlin.text.t.b0(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    private final CoroutineOwner<?> owner(Continuation<?> continuation) {
        CoroutineStackFrame coroutineStackFrame = continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null;
        if (coroutineStackFrame != null) {
            return owner(coroutineStackFrame);
        }
        return null;
    }

    private final void printStackTrace(PrintStream out, List<StackTraceElement> frames) {
        Iterator<T> it = frames.iterator();
        while (it.hasNext()) {
            out.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void probeCoroutineCompleted(CoroutineOwner<?> owner) {
        CoroutineStackFrame coroutineStackFrameRealCaller;
        capturedCoroutinesMap.remove(owner);
        CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = owner.info.getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null || (coroutineStackFrameRealCaller = realCaller(lastObservedFrame$kotlinx_coroutines_core)) == null) {
            return;
        }
        callerInfoCache.remove(coroutineStackFrameRealCaller);
    }

    private final CoroutineStackFrame realCaller(CoroutineStackFrame coroutineStackFrame) {
        do {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        } while (coroutineStackFrame.getStackTraceElement() == null);
        return coroutineStackFrame;
    }

    private final <T extends Throwable> List<StackTraceElement> sanitizeStackTrace(T throwable) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        int length = stackTrace.length;
        int i11 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i12 = length2 - 1;
                if (s.f(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i11 = length2;
                    break;
                }
                if (i12 < 0) {
                    break;
                }
                length2 = i12;
            }
        }
        int i13 = i11 + 1;
        if (!sanitizeStackTraces) {
            int i14 = length - i13;
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                arrayList.add(stackTrace[i15 + i13]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i13) + 1);
        while (i13 < length) {
            if (isInternalMethod(stackTrace[i13])) {
                arrayList2.add(stackTrace[i13]);
                int i16 = i13 + 1;
                while (i16 < length && isInternalMethod(stackTrace[i16])) {
                    i16++;
                }
                int i17 = i16 - 1;
                int i18 = i17;
                while (i18 > i13 && stackTrace[i18].getFileName() == null) {
                    i18--;
                }
                if (i18 > i13 && i18 < i17) {
                    arrayList2.add(stackTrace[i18]);
                }
                arrayList2.add(stackTrace[i17]);
                i13 = i16;
            } else {
                arrayList2.add(stackTrace[i13]);
                i13++;
            }
        }
        return arrayList2;
    }

    private final void startWeakRefCleanerThread() {
        weakRefCleanerThread = nn0.a.b(false, true, null, "Coroutines Debugger Cleaner", 0, new wn0.a() { // from class: kotlinx.coroutines.debug.internal.e
            @Override // wn0.a
            public final Object invoke() {
                return DebugProbesImpl.startWeakRefCleanerThread$lambda$2();
            }
        }, 21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 startWeakRefCleanerThread$lambda$2() {
        callerInfoCache.runWeakRefQueueCleaningLoopUntilInterrupted();
        return h0.f84049a;
    }

    private final void stopWeakRefCleanerThread() throws InterruptedException {
        Thread thread = weakRefCleanerThread;
        if (thread == null) {
            return;
        }
        weakRefCleanerThread = null;
        thread.interrupt();
        thread.join();
    }

    private final StackTraceFrame toStackTraceFrame(List<StackTraceElement> list) {
        StackTraceFrame stackTraceFrame = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                stackTraceFrame = new StackTraceFrame(stackTraceFrame, listIterator.previous());
            }
        }
        return new StackTraceFrame(stackTraceFrame, ARTIFICIAL_FRAME);
    }

    private final String toStringRepr(Object obj) {
        return DebugProbesImplKt.repr(obj.toString());
    }

    private final void updateRunningState(CoroutineStackFrame frame, String state) {
        boolean z11;
        if (isInstalled$kotlinx_coroutines_debug()) {
            ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfo> concurrentWeakMap = callerInfoCache;
            DebugCoroutineInfo debugCoroutineInfoRemove = concurrentWeakMap.remove(frame);
            if (debugCoroutineInfoRemove != null) {
                z11 = false;
            } else {
                CoroutineOwner<?> coroutineOwnerOwner = owner(frame);
                if (coroutineOwnerOwner == null || (debugCoroutineInfoRemove = coroutineOwnerOwner.info) == null) {
                    return;
                }
                CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = debugCoroutineInfoRemove.getLastObservedFrame$kotlinx_coroutines_core();
                CoroutineStackFrame coroutineStackFrameRealCaller = lastObservedFrame$kotlinx_coroutines_core != null ? realCaller(lastObservedFrame$kotlinx_coroutines_core) : null;
                if (coroutineStackFrameRealCaller != null) {
                    concurrentWeakMap.remove(coroutineStackFrameRealCaller);
                }
                z11 = true;
            }
            s.i(frame, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
            debugCoroutineInfoRemove.updateState$kotlinx_coroutines_core(state, (Continuation) frame, z11);
            CoroutineStackFrame coroutineStackFrameRealCaller2 = realCaller(frame);
            if (coroutineStackFrameRealCaller2 == null) {
                return;
            }
            concurrentWeakMap.put(coroutineStackFrameRealCaller2, debugCoroutineInfoRemove);
        }
    }

    private final void updateState(Continuation<?> frame, String state) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            if (ignoreCoroutinesWithEmptyContext && frame.get$context() == EmptyCoroutineContext.INSTANCE) {
                return;
            }
            if (s.f(state, DebugCoroutineInfoImplKt.RUNNING)) {
                CoroutineStackFrame coroutineStackFrame = frame instanceof CoroutineStackFrame ? (CoroutineStackFrame) frame : null;
                if (coroutineStackFrame == null) {
                    return;
                }
                updateRunningState(coroutineStackFrame, state);
                return;
            }
            CoroutineOwner<?> coroutineOwnerOwner = owner(frame);
            if (coroutineOwnerOwner == null) {
                return;
            }
            updateState(coroutineOwnerOwner, frame, state);
        }
    }

    public final void dumpCoroutines(PrintStream out) {
        synchronized (out) {
            INSTANCE.dumpCoroutinesSynchronized(out);
            h0 h0Var = h0.f84049a;
        }
    }

    public final List<DebugCoroutineInfo> dumpCoroutinesInfo() {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return ho0.l.c0(ho0.l.V(ho0.l.Z(v.e0(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new l<CoroutineOwner<?>, DebugCoroutineInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // wn0.l
                public final DebugCoroutineInfo invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                    CoroutineContext context;
                    if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return new DebugCoroutineInfo(coroutineOwner.info, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    public final Object[] dumpCoroutinesInfoAsJsonAndReferences() {
        String name;
        List<DebugCoroutineInfo> listDumpCoroutinesInfo = dumpCoroutinesInfo();
        int size = listDumpCoroutinesInfo.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (DebugCoroutineInfo debugCoroutineInfo : listDumpCoroutinesInfo) {
            CoroutineContext context = debugCoroutineInfo.getContext();
            CoroutineName coroutineName = (CoroutineName) context.get(CoroutineName.INSTANCE);
            Long lValueOf = null;
            String stringRepr = (coroutineName == null || (name = coroutineName.getName()) == null) ? null : toStringRepr(name);
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) context.get(CoroutineDispatcher.INSTANCE);
            String stringRepr2 = coroutineDispatcher != null ? toStringRepr(coroutineDispatcher) : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n                {\n                    \"name\": ");
            sb2.append(stringRepr);
            sb2.append(",\n                    \"id\": ");
            CoroutineId coroutineId = (CoroutineId) context.get(CoroutineId.INSTANCE);
            if (coroutineId != null) {
                lValueOf = Long.valueOf(coroutineId.getId());
            }
            sb2.append(lValueOf);
            sb2.append(",\n                    \"dispatcher\": ");
            sb2.append(stringRepr2);
            sb2.append(",\n                    \"sequenceNumber\": ");
            sb2.append(debugCoroutineInfo.getSequenceNumber());
            sb2.append(",\n                    \"state\": \"");
            sb2.append(debugCoroutineInfo.getState());
            sb2.append("\"\n                } \n                ");
            arrayList3.add(p013kotlin.text.t.n(sb2.toString()));
            arrayList2.add(debugCoroutineInfo.getLastObservedFrame());
            arrayList.add(debugCoroutineInfo.getLastObservedThread());
        }
        return new Object[]{'[' + v.y0(arrayList3, null, null, null, 0, null, null, 63, null) + ']', arrayList.toArray(new Thread[0]), arrayList2.toArray(new CoroutineStackFrame[0]), listDumpCoroutinesInfo.toArray(new DebugCoroutineInfo[0])};
    }

    public final List<DebuggerInfo> dumpDebuggerInfo() {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return ho0.l.c0(ho0.l.V(ho0.l.Z(v.e0(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new l<CoroutineOwner<?>, DebuggerInfo>() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // wn0.l
                public final DebuggerInfo invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                    CoroutineContext context;
                    if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return new DebuggerInfo(coroutineOwner.info, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    public final List<StackTraceElement> enhanceStackTraceWithThreadDump(DebugCoroutineInfo info, List<StackTraceElement> coroutineTrace) {
        return enhanceStackTraceWithThreadDumpImpl(info.getState(), info.getLastObservedThread(), coroutineTrace);
    }

    public final String enhanceStackTraceWithThreadDumpAsJson(DebugCoroutineInfo info) {
        List<StackTraceElement> listEnhanceStackTraceWithThreadDump = enhanceStackTraceWithThreadDump(info, info.lastObservedStackTrace());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : listEnhanceStackTraceWithThreadDump) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n                {\n                    \"declaringClass\": \"");
            sb2.append(stackTraceElement.getClassName());
            sb2.append("\",\n                    \"methodName\": \"");
            sb2.append(stackTraceElement.getMethodName());
            sb2.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb2.append(fileName != null ? toStringRepr(fileName) : null);
            sb2.append(",\n                    \"lineNumber\": ");
            sb2.append(stackTraceElement.getLineNumber());
            sb2.append("\n                }\n                ");
            arrayList.add(p013kotlin.text.t.n(sb2.toString()));
        }
        return '[' + v.y0(arrayList, null, null, null, 0, null, null, 63, null) + ']';
    }

    public final boolean getEnableCreationStackTraces$kotlinx_coroutines_core() {
        return enableCreationStackTraces;
    }

    public final boolean getIgnoreCoroutinesWithEmptyContext() {
        return ignoreCoroutinesWithEmptyContext;
    }

    public final boolean getSanitizeStackTraces$kotlinx_coroutines_core() {
        return sanitizeStackTraces;
    }

    public final String hierarchyToString$kotlinx_coroutines_core(Job job) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        Set<CoroutineOwner<?>> capturedCoroutines = getCapturedCoroutines();
        ArrayList<CoroutineOwner> arrayList = new ArrayList();
        for (Object obj : capturedCoroutines) {
            if (((CoroutineOwner) obj).delegate.get$context().get(Job.INSTANCE) != null) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(v0.e(v.y(arrayList, 10)), 16));
        for (CoroutineOwner coroutineOwner : arrayList) {
            linkedHashMap.put(JobKt.getJob(coroutineOwner.delegate.get$context()), coroutineOwner.info);
        }
        StringBuilder sb2 = new StringBuilder();
        INSTANCE.build(job, linkedHashMap, sb2, "");
        return sb2.toString();
    }

    public final void install$kotlinx_coroutines_core() {
        l<Boolean, h0> lVar;
        if (getInstallations().incrementAndGet() > 1) {
            return;
        }
        startWeakRefCleanerThread();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (lVar = dynamicAttach) == null) {
            return;
        }
        lVar.invoke(Boolean.TRUE);
    }

    public final boolean isInstalled$kotlinx_coroutines_debug() {
        return getInstallations().get() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Continuation<T> probeCoroutineCreated$kotlinx_coroutines_core(Continuation<? super T> completion) {
        if (isInstalled$kotlinx_coroutines_debug() && (!(ignoreCoroutinesWithEmptyContext && completion.get$context() == EmptyCoroutineContext.INSTANCE) && owner(completion) == null)) {
            return createOwner(completion, enableCreationStackTraces ? toStackTraceFrame(sanitizeStackTrace(new Exception())) : null);
        }
        return completion;
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(Continuation<?> frame) {
        updateState(frame, DebugCoroutineInfoImplKt.RUNNING);
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(Continuation<?> frame) {
        updateState(frame, DebugCoroutineInfoImplKt.SUSPENDED);
    }

    public final void setEnableCreationStackTraces$kotlinx_coroutines_core(boolean z11) {
        enableCreationStackTraces = z11;
    }

    public final void setIgnoreCoroutinesWithEmptyContext(boolean z11) {
        ignoreCoroutinesWithEmptyContext = z11;
    }

    public final void setSanitizeStackTraces$kotlinx_coroutines_core(boolean z11) {
        sanitizeStackTraces = z11;
    }

    public final void uninstall$kotlinx_coroutines_core() throws InterruptedException {
        l<Boolean, h0> lVar;
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Agent was not installed");
        }
        if (getInstallations().decrementAndGet() != 0) {
            return;
        }
        stopWeakRefCleanerThread();
        capturedCoroutinesMap.clear();
        callerInfoCache.clear();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (lVar = dynamicAttach) == null) {
            return;
        }
        lVar.invoke(Boolean.FALSE);
    }

    private final CoroutineOwner<?> owner(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof CoroutineOwner)) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        }
        return (CoroutineOwner) coroutineStackFrame;
    }

    private final void updateState(CoroutineOwner<?> owner, Continuation<?> frame, String state) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            owner.info.updateState$kotlinx_coroutines_core(state, frame, true);
        }
    }
}
