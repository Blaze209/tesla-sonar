package kotlinx.coroutines.channels;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import org.slf4j.Marker;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;
import wn0.l;
import wn0.q;
import wn0.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004\u0084\u0002\u0085\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0092\u0001\u0010&\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001c2\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001f2\u001e\u0010\"\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00010!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f2,\b\u0002\u0010%\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00010$H\u0082\b¢\u0006\u0004\b&\u0010'JZ\u0010(\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u001fH\u0082\b¢\u0006\u0004\b(\u0010)JG\u0010,\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-JG\u0010.\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b.\u0010-J\u0017\u00100\u001a\u00020*2\u0006\u0010/\u001a\u00020\u0011H\u0003¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020*2\u0006\u00102\u001a\u00020\u0011H\u0002¢\u0006\u0004\b3\u00101J\u001b\u00104\u001a\u00020**\u00020\u001d2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b4\u00105J.\u00107\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b7\u00108J)\u00109\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b9\u0010\u0017J\u001d\u0010:\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b:\u0010;J4\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000<2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b=\u00108J#\u0010?\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<0\u0018H\u0002¢\u0006\u0004\b?\u0010;J\u0090\u0001\u0010B\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052$\u0010\"\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00010A2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f2&\b\u0002\u0010%\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00010AH\u0082\b¢\u0006\u0004\bB\u0010CJX\u0010D\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00152\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u001fH\u0082\b¢\u0006\u0004\bD\u0010EJ9\u0010F\u001a\u0004\u0018\u00010\u001d2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\bF\u0010GJ9\u0010H\u001a\u0004\u0018\u00010\u001d2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\bH\u0010GJ)\u0010I\u001a\u00020**\u00020\u001d2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bK\u0010LJ-\u0010N\u001a\u00020*2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u0011H\u0002¢\u0006\u0004\bN\u0010OJ-\u0010P\u001a\u00020*2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u0011H\u0002¢\u0006\u0004\bP\u0010OJ\u0019\u0010R\u001a\u00020\u00062\b\b\u0002\u0010Q\u001a\u00020\u0011H\u0002¢\u0006\u0004\bR\u0010SJ#\u0010V\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\n\u0010U\u001a\u0006\u0012\u0002\b\u00030TH\u0002¢\u0006\u0004\bV\u0010WJ%\u0010Z\u001a\u0004\u0018\u00010\u001d2\b\u0010X\u001a\u0004\u0018\u00010\u001d2\b\u0010Y\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\bZ\u0010[J%\u0010\\\u001a\u00020\u00062\n\u0010U\u001a\u0006\u0012\u0002\b\u00030T2\b\u0010X\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\\\u0010]J\u001b\u0010^\u001a\u00020\u00062\n\u0010U\u001a\u0006\u0012\u0002\b\u00030TH\u0002¢\u0006\u0004\b^\u0010_J%\u0010`\u001a\u0004\u0018\u00010\u001d2\b\u0010X\u001a\u0004\u0018\u00010\u001d2\b\u0010Y\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b`\u0010[J%\u0010a\u001a\u0004\u0018\u00010\u001d2\b\u0010X\u001a\u0004\u0018\u00010\u001d2\b\u0010Y\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\ba\u0010[J%\u0010b\u001a\u0004\u0018\u00010\u001d2\b\u0010X\u001a\u0004\u0018\u00010\u001d2\b\u0010Y\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\bb\u0010[J\u000f\u0010c\u001a\u00020\u0006H\u0002¢\u0006\u0004\bc\u0010LJ\u000f\u0010d\u001a\u00020\u0006H\u0002¢\u0006\u0004\bd\u0010LJ\u000f\u0010e\u001a\u00020\u0006H\u0002¢\u0006\u0004\be\u0010LJ\u000f\u0010f\u001a\u00020\u0006H\u0002¢\u0006\u0004\bf\u0010LJ\u000f\u0010g\u001a\u00020\u0006H\u0002¢\u0006\u0004\bg\u0010LJ\u001d\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010h\u001a\u00020\u0011H\u0002¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u0011H\u0002¢\u0006\u0004\bk\u0010SJ\u0015\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bl\u0010mJ\u001d\u0010o\u001a\u00020\u00112\f\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bo\u0010pJ\u001d\u0010q\u001a\u00020\u00062\f\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bq\u0010rJ%\u0010t\u001a\u00020\u00062\f\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010s\u001a\u00020\u0011H\u0002¢\u0006\u0004\bt\u0010uJ\u0013\u0010v\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\bv\u0010wJ\u0013\u0010x\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\bx\u0010wJ\u001b\u0010z\u001a\u00020\u0006*\u00020\u00152\u0006\u0010y\u001a\u00020*H\u0002¢\u0006\u0004\bz\u0010{J\u001f\u0010~\u001a\u00020*2\u0006\u0010|\u001a\u00020\u00112\u0006\u0010}\u001a\u00020*H\u0002¢\u0006\u0004\b~\u0010\u007fJ0\u0010\u0081\u0001\u001a\u00020*2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0007\u0010\u0080\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0081\u0001\u0010OJ2\u0010\u0084\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0007\u0010\u0082\u0001\u001a\u00020\u00112\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J2\u0010\u0086\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0007\u0010\u0082\u0001\u001a\u00020\u00112\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0085\u0001J;\u0010\u0088\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0007\u0010\u0082\u0001\u001a\u00020\u00112\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0007\u0010\u0087\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J*\u0010\u008a\u0001\u001a\u00020\u00062\u0007\u0010\u0082\u0001\u001a\u00020\u00112\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001a\u0010\u008d\u0001\u001a\u00020\u00062\u0007\u0010\u008c\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008d\u0001\u0010SJ\u001a\u0010\u008e\u0001\u001a\u00020\u00062\u0007\u0010\u008c\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008e\u0001\u0010SJM\u0010\u0092\u0001\u001a#\u0012\u0005\u0012\u00030\u0090\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0005\u0012\u00030\u0091\u0001\u0012\u0004\u0012\u00020\u00060\u008f\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J4\u0010\u0098\u0001\u001a\u00020\u00062\b\u0010\u0094\u0001\u001a\u00030\u0090\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000<2\b\u0010\u0095\u0001\u001a\u00030\u0091\u0001H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001JP\u0010\u0099\u0001\u001a\u001e\u0012\u0005\u0012\u00030\u0090\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0005\u0012\u00030\u0091\u0001\u0012\u0004\u0012\u00020\u00060A*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001JG\u0010\u0099\u0001\u001a\u001d\u0012\u0005\u0012\u00030\u0090\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0091\u0001\u0012\u0004\u0012\u00020\u00060\u008f\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u0093\u0001J.\u0010\u009b\u0001\u001a\u00020\u00062\b\u0010\u0094\u0001\u001a\u00030\u0090\u00012\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\u0095\u0001\u001a\u00030\u0091\u0001H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u0097\u0001J\u001a\u0010\u009c\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0005\b\u009c\u0001\u0010\rJ \u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060<2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001a\u0010¡\u0001\u001a\u00020*2\u0006\u0010\u000b\u001a\u00028\u0000H\u0090@¢\u0006\u0005\b \u0001\u0010\rJ \u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060<2\u0006\u0010\u000b\u001a\u00028\u0000H\u0004¢\u0006\u0006\b¢\u0001\u0010\u009e\u0001J\u0011\u00100\u001a\u00020*H\u0010¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0011\u0010¦\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b¦\u0001\u0010LJ\u0011\u0010§\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b§\u0001\u0010LJ\u0013\u0010¨\u0001\u001a\u00028\u0000H\u0096@¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0019\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000<H\u0096@¢\u0006\u0006\bª\u0001\u0010©\u0001J\u0018\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000<H\u0016¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u001a\u0010°\u0001\u001a\u00020\u00062\u0007\u0010¯\u0001\u001a\u00020\u0011H\u0004¢\u0006\u0005\b°\u0001\u0010SJ\u001a\u0010²\u0001\u001a\u00020\u00062\u0007\u0010\u0080\u0001\u001a\u00020\u0011H\u0000¢\u0006\u0005\b±\u0001\u0010SJ'\u0010³\u0001\u001a\u00020\u00062\n\u0010U\u001a\u0006\u0012\u0002\b\u00030T2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0005\b³\u0001\u0010]J\u001a\u0010µ\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000´\u0001H\u0096\u0002¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0011\u0010·\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b·\u0001\u0010LJ\u001e\u0010¸\u0001\u001a\u00020*2\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0016¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001c\u0010º\u0001\u001a\u00020*2\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0090\u0001¢\u0006\u0006\bº\u0001\u0010¹\u0001J\u000f\u0010º\u0001\u001a\u00020\u0006¢\u0006\u0005\bº\u0001\u0010LJ#\u0010º\u0001\u001a\u00020\u00062\u0011\u0010\u0094\u0001\u001a\f\u0018\u00010»\u0001j\u0005\u0018\u0001`¼\u0001¢\u0006\u0006\bº\u0001\u0010½\u0001J\u001e\u0010¿\u0001\u001a\u00020*2\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0010¢\u0006\u0006\b¾\u0001\u0010¹\u0001J'\u0010À\u0001\u001a\u00020*2\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0090\u00012\u0007\u0010º\u0001\u001a\u00020*H\u0014¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J*\u0010Ã\u0001\u001a\u00020\u00062\u0016\u0010Â\u0001\u001a\u0011\u0012\u0007\u0012\u0005\u0018\u00010\u0090\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u0012\u0010Æ\u0001\u001a\u00020*H\u0000¢\u0006\u0006\bÅ\u0001\u0010¥\u0001J\u0013\u0010È\u0001\u001a\u00030Ç\u0001H\u0016¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u0013\u0010Ë\u0001\u001a\u00030Ç\u0001H\u0000¢\u0006\u0006\bÊ\u0001\u0010É\u0001J\u000f\u0010Ì\u0001\u001a\u00020\u0006¢\u0006\u0005\bÌ\u0001\u0010LR\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010Í\u0001R/\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b\b\u0010Î\u0001Rc\u0010Ð\u0001\u001aG\u0012\b\u0012\u0006\u0012\u0002\b\u00030T\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012 \u0012\u001e\u0012\u0005\u0012\u00030\u0090\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0005\u0012\u00030\u0091\u0001\u0012\u0004\u0012\u00020\u00060A\u0018\u00010Aj\u0005\u0018\u0001`Ï\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\bÐ\u0001\u0010Ñ\u0001\u0012\u0005\bÒ\u0001\u0010LR\u0017\u0010Õ\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u0017\u0010Ö\u0001\u001a\u00020*8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010¥\u0001R1\u0010Û\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000×\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÚ\u0001\u0010L\u001a\u0006\bØ\u0001\u0010Ù\u0001R%\u0010à\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Ü\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bß\u0001\u0010L\u001a\u0006\bÝ\u0001\u0010Þ\u0001R+\u0010ã\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<0Ü\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bâ\u0001\u0010L\u001a\u0006\bá\u0001\u0010Þ\u0001R'\u0010æ\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000Ü\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bå\u0001\u0010L\u001a\u0006\bä\u0001\u0010Þ\u0001R\u0018\u0010é\u0001\u001a\u00030\u0090\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bç\u0001\u0010è\u0001R\u001e\u0010ê\u0001\u001a\u00020*8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bë\u0001\u0010L\u001a\u0006\bê\u0001\u0010¥\u0001R\u001a\u0010ì\u0001\u001a\u00020**\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bì\u0001\u00101R\u001c\u0010}\u001a\u00020*8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bí\u0001\u0010L\u001a\u0005\b}\u0010¥\u0001R\u001a\u0010î\u0001\u001a\u00020**\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bî\u0001\u00101R\u001e\u0010ï\u0001\u001a\u00020*8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bð\u0001\u0010L\u001a\u0006\bï\u0001\u0010¥\u0001R\u0016\u0010s\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\bñ\u0001\u0010Ô\u0001R\u0017\u0010ó\u0001\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\bò\u0001\u0010Ô\u0001R\u001a\u0010õ\u0001\u001a\u0005\u0018\u00010\u0090\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\bô\u0001\u0010è\u0001R\u0018\u0010÷\u0001\u001a\u00030\u0090\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\bö\u0001\u0010è\u0001R\u0017\u0010ø\u0001\u001a\u00020*8TX\u0094\u0004¢\u0006\b\u001a\u0006\bø\u0001\u0010¥\u0001R\r\u0010ú\u0001\u001a\u00030ù\u00018\u0002X\u0082\u0004R\r\u0010û\u0001\u001a\u00030ù\u00018\u0002X\u0082\u0004R\r\u0010ü\u0001\u001a\u00030ù\u00018\u0002X\u0082\u0004R\r\u0010ý\u0001\u001a\u00030ù\u00018\u0002X\u0082\u0004R\u0019\u0010ÿ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0þ\u00018\u0002X\u0082\u0004R\u0019\u0010\u0080\u0002\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0þ\u00018\u0002X\u0082\u0004R\u0019\u0010\u0081\u0002\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0þ\u00018\u0002X\u0082\u0004R\u0015\u0010\u0082\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001d0þ\u00018\u0002X\u0082\u0004R\u0015\u0010\u0083\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001d0þ\u00018\u0002X\u0082\u0004¨\u0006\u0086\u0002"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", "E", "Lkotlinx/coroutines/channels/Channel;", "", "capacity", "Lkotlin/Function1;", "Ljn0/h0;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILwn0/l;)V", "element", "onClosedSend", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelSegment;", "segment", "index", "", "s", "sendOnNoWaiterSuspend", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/Waiter;", "prepareSenderForSuspension", "(Lkotlinx/coroutines/Waiter;Lkotlinx/coroutines/channels/ChannelSegment;I)V", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "onClosedSendOnNoWaiterSuspend", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "R", "", "waiter", "Lkotlin/Function0;", "onRendezvousOrBuffered", "Lkotlin/Function2;", "onSuspend", "onClosed", "Lkotlin/Function4;", "onNoWaiterSuspend", "sendImpl", "(Ljava/lang/Object;Ljava/lang/Object;Lwn0/a;Lwn0/p;Lwn0/a;Lwn0/r;)Ljava/lang/Object;", "sendImplOnNoWaiter", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlinx/coroutines/Waiter;Lwn0/a;Lwn0/a;)V", "", "closed", "updateCellSend", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLjava/lang/Object;Z)I", "updateCellSendSlow", "curSendersAndCloseStatus", "shouldSendSuspend", "(J)Z", "curSenders", "bufferOrRendezvousSend", "tryResumeReceiver", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "r", "receiveOnNoWaiterSuspend", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareReceiverForSuspension", "onClosedReceiveOnNoWaiterSuspend", "(Lkotlinx/coroutines/CancellableContinuation;)V", "Lkotlinx/coroutines/channels/ChannelResult;", "receiveCatchingOnNoWaiterSuspend-GKJJFZk", "receiveCatchingOnNoWaiterSuspend", "onClosedReceiveCatchingOnNoWaiterSuspend", "onElementRetrieved", "Lkotlin/Function3;", "receiveImpl", "(Ljava/lang/Object;Lwn0/l;Lwn0/q;Lwn0/a;Lwn0/q;)Ljava/lang/Object;", "receiveImplOnNoWaiter", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlinx/coroutines/Waiter;Lwn0/l;Lwn0/a;)V", "updateCellReceive", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLjava/lang/Object;)Ljava/lang/Object;", "updateCellReceiveSlow", "tryResumeSender", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/ChannelSegment;I)Z", "expandBuffer", "()V", "b", "updateCellExpandBuffer", "(Lkotlinx/coroutines/channels/ChannelSegment;IJ)Z", "updateCellExpandBufferSlow", "nAttempts", "incCompletedExpandBufferAttempts", "(J)V", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "onClosedSelectOnSend", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)V", "ignoredParam", "selectResult", "processResultSelectSend", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "registerSelectForReceive", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "onClosedSelectOnReceive", "(Lkotlinx/coroutines/selects/SelectInstance;)V", "processResultSelectReceive", "processResultSelectReceiveOrNull", "processResultSelectReceiveCatching", "invokeCloseHandler", "markClosed", "markCancelled", "markCancellationStarted", "completeCloseOrCancel", "sendersCur", "completeClose", "(J)Lkotlinx/coroutines/channels/ChannelSegment;", "completeCancel", "closeLinkedList", "()Lkotlinx/coroutines/channels/ChannelSegment;", "lastSegment", "markAllEmptyCellsAsClosed", "(Lkotlinx/coroutines/channels/ChannelSegment;)J", "removeUnprocessedElements", "(Lkotlinx/coroutines/channels/ChannelSegment;)V", "sendersCounter", "cancelSuspendedReceiveRequests", "(Lkotlinx/coroutines/channels/ChannelSegment;J)V", "resumeReceiverOnClosedChannel", "(Lkotlinx/coroutines/Waiter;)V", "resumeSenderOnCancelledChannel", "receiver", "resumeWaiterOnClosedChannel", "(Lkotlinx/coroutines/Waiter;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", "isClosed", "(JZ)Z", "globalIndex", "isCellNonEmpty", "id", "startFrom", "findSegmentSend", "(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", "findSegmentReceive", "currentBufferEndCounter", "findSegmentBufferEnd", "(JLkotlinx/coroutines/channels/ChannelSegment;J)Lkotlinx/coroutines/channels/ChannelSegment;", "moveSegmentBufferEndToSpecifiedOrLast", "(JLkotlinx/coroutines/channels/ChannelSegment;)V", "value", "updateSendersCounterIfLower", "updateReceiversCounterIfLower", "Lkotlin/reflect/KFunction3;", "", "Lkotlin/coroutines/CoroutineContext;", "bindCancellationFunResult", "(Lwn0/l;)Lco0/h;", "cause", CoreConstants.CONTEXT_SCOPE_VALUE, "onCancellationChannelResultImplDoNotCall-5_sEAP8", "(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "onCancellationChannelResultImplDoNotCall", "bindCancellationFun", "(Lwn0/l;Ljava/lang/Object;)Lwn0/q;", "onCancellationImplDoNotCall", "send", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "sendBroadcast$kotlinx_coroutines_core", "sendBroadcast", "trySendDropOldest-JP2dKIU", "trySendDropOldest", "shouldSendSuspend$kotlinx_coroutines_core", "()Z", "onReceiveEnqueued", "onReceiveDequeued", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching-JP2dKIU", "receiveCatching", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "tryReceive", "globalCellIndex", "dropFirstElementUntilTheSpecifiedCellIsInTheBuffer", "waitExpandBufferCompletion$kotlinx_coroutines_core", "waitExpandBufferCompletion", "registerSelectForSend", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "()Lkotlinx/coroutines/channels/ChannelIterator;", "onClosedIdempotent", "close", "(Ljava/lang/Throwable;)Z", "cancel", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelImpl$kotlinx_coroutines_core", "cancelImpl", "closeOrCancelImpl", "(Ljava/lang/Throwable;Z)Z", "handler", "invokeOnClose", "(Lwn0/l;)V", "hasElements$kotlinx_coroutines_core", "hasElements", "", "toString", "()Ljava/lang/String;", "toStringDebug$kotlinx_coroutines_core", "toStringDebug", "checkSegmentStructureInvariants", "I", "Lwn0/l;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onUndeliveredElementReceiveCancellationConstructor", "Lwn0/q;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "getBufferEndCounter", "()J", "bufferEndCounter", "isRendezvousOrUnlimited", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend$annotations", "onSend", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive$annotations", "onReceive", "getOnReceiveCatching", "getOnReceiveCatching$annotations", "onReceiveCatching", "getOnReceiveOrNull", "getOnReceiveOrNull$annotations", "onReceiveOrNull", "getReceiveException", "()Ljava/lang/Throwable;", "receiveException", "isClosedForSend", "isClosedForSend$annotations", "isClosedForSend0", "isClosedForReceive$annotations", "isClosedForReceive0", "isEmpty", "isEmpty$annotations", "getSendersCounter$kotlinx_coroutines_core", "getReceiversCounter$kotlinx_coroutines_core", "receiversCounter", "getCloseCause", "closeCause", "getSendException", "sendException", "isConflatedDropOldest", "Lkotlinx/atomicfu/AtomicLong;", "sendersAndCloseStatus", "receivers", "bufferEnd", "completedExpandBuffersAndPauseFlag", "Lkotlinx/atomicfu/AtomicRef;", "sendSegment", "receiveSegment", "bufferEndSegment", "_closeCause", "closeHandler", "SendBroadcast", "BufferedChannelIterator", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BufferedChannel<E> implements Channel<E> {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private final int capacity;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final l<E, h0> onUndeliveredElement;
    private final q<SelectInstance<?>, Object, Object, q<Throwable, Object, CoroutineContext, h0>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    private static final /* synthetic */ AtomicLongFieldUpdater sendersAndCloseStatus$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater receivers$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater bufferEnd$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater sendSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater receiveSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater bufferEndSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _closeCause$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater closeHandler$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000e\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u00102\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0012R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator;", "Lkotlinx/coroutines/channels/ChannelIterator;", "Lkotlinx/coroutines/Waiter;", "<init>", "(Lkotlinx/coroutines/channels/BufferedChannel;)V", "", "onClosedHasNext", "()Z", "Lkotlinx/coroutines/channels/ChannelSegment;", "segment", "", "index", "", "r", "hasNextOnNoWaiterSuspend", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", "onClosedHasNextNoWaiterSuspend", "()V", "hasNext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Segment;", "invokeOnCancellation", "(Lkotlinx/coroutines/internal/Segment;I)V", "next", "()Ljava/lang/Object;", "element", "tryResumeHasNext", "(Ljava/lang/Object;)Z", "tryResumeHasNextOnClosedChannel", "", "receiveResult", "Ljava/lang/Object;", "Lkotlinx/coroutines/CancellableContinuationImpl;", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class BufferedChannelIterator implements ChannelIterator<E>, Waiter {
        private CancellableContinuationImpl<? super Boolean> continuation;
        private Object receiveResult = BufferedChannelKt.NO_RECEIVE_RESULT;

        public BufferedChannelIterator() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object hasNextOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i11, long j11, Continuation<? super Boolean> continuation) throws Throwable {
            Boolean boolBoxBoolean;
            l<E, h0> lVar;
            ChannelSegment channelSegmentFindSegmentReceive;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
            try {
                this.continuation = orCreateCancellableContinuation;
                try {
                    Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i11, j11, this);
                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                        bufferedChannel.prepareReceiverForSuspension(this, channelSegment, i11);
                    } else {
                        q qVarBindCancellationFun = null;
                        if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                            if (j11 < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment.cleanPrev();
                            }
                            ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.getReceiveSegment$volatile$FU().get(bufferedChannel);
                            while (true) {
                                if (bufferedChannel.isClosedForReceive()) {
                                    onClosedHasNextNoWaiterSuspend();
                                } else {
                                    long andIncrement = BufferedChannel.getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                                    int i12 = BufferedChannelKt.SEGMENT_SIZE;
                                    long j12 = andIncrement / ((long) i12);
                                    int i13 = (int) (andIncrement % ((long) i12));
                                    if (channelSegment2.id != j12) {
                                        channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j12, channelSegment2);
                                        if (channelSegmentFindSegmentReceive == null) {
                                        }
                                    } else {
                                        channelSegmentFindSegmentReceive = channelSegment2;
                                    }
                                    objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegmentFindSegmentReceive, i13, andIncrement, this);
                                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                                        bufferedChannel.prepareReceiverForSuspension(this, channelSegmentFindSegmentReceive, i13);
                                    } else if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                                        if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                            channelSegmentFindSegmentReceive.cleanPrev();
                                        }
                                        channelSegment2 = channelSegmentFindSegmentReceive;
                                    } else {
                                        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        channelSegmentFindSegmentReceive.cleanPrev();
                                        this.receiveResult = objUpdateCellReceive;
                                        this.continuation = null;
                                        boolBoxBoolean = Boxing.boxBoolean(true);
                                        lVar = bufferedChannel.onUndeliveredElement;
                                        if (lVar != null) {
                                            qVarBindCancellationFun = bufferedChannel.bindCancellationFun(lVar, objUpdateCellReceive);
                                        }
                                        orCreateCancellableContinuation.resume(boolBoxBoolean, (q<? super Throwable, ? super Boolean, ? super CoroutineContext, h0>) qVarBindCancellationFun);
                                    }
                                }
                            }
                        } else {
                            channelSegment.cleanPrev();
                            this.receiveResult = objUpdateCellReceive;
                            this.continuation = null;
                            boolBoxBoolean = Boxing.boxBoolean(true);
                            lVar = bufferedChannel.onUndeliveredElement;
                            if (lVar != null) {
                                qVarBindCancellationFun = bufferedChannel.bindCancellationFun(lVar, objUpdateCellReceive);
                            }
                            orCreateCancellableContinuation.resume(boolBoxBoolean, (q<? super Throwable, ? super Boolean, ? super CoroutineContext, h0>) qVarBindCancellationFun);
                        }
                    }
                    Object result = orCreateCancellableContinuation.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                    return result;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        private final boolean onClosedHasNext() throws Throwable {
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                return false;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(closeCause);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onClosedHasNextNoWaiterSuspend() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            s.h(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuationImpl.resumeWith(jn0.s.b(Boolean.FALSE));
            } else {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                cancellableContinuationImpl.resumeWith(jn0.s.b(t.a(closeCause)));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object hasNext(Continuation<? super Boolean> continuation) throws Throwable {
            ChannelSegment<E> channelSegmentFindSegmentReceive;
            boolean zOnClosedHasNext = true;
            if (this.receiveResult == BufferedChannelKt.NO_RECEIVE_RESULT || this.receiveResult == BufferedChannelKt.getCHANNEL_CLOSED()) {
                BufferedChannel<E> bufferedChannel = BufferedChannel.this;
                ChannelSegment<E> channelSegment = (ChannelSegment) BufferedChannel.getReceiveSegment$volatile$FU().get(bufferedChannel);
                while (!bufferedChannel.isClosedForReceive()) {
                    long andIncrement = BufferedChannel.getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                    int i11 = BufferedChannelKt.SEGMENT_SIZE;
                    long j11 = andIncrement / ((long) i11);
                    int i12 = (int) (andIncrement % ((long) i11));
                    if (channelSegment.id != j11) {
                        channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j11, channelSegment);
                        if (channelSegmentFindSegmentReceive == null) {
                            continue;
                        }
                    } else {
                        channelSegmentFindSegmentReceive = channelSegment;
                    }
                    Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegmentFindSegmentReceive, i12, andIncrement, null);
                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                        if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegmentFindSegmentReceive.cleanPrev();
                        }
                        channelSegment = channelSegmentFindSegmentReceive;
                    } else {
                        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                            return hasNextOnNoWaiterSuspend(channelSegmentFindSegmentReceive, i12, andIncrement, continuation);
                        }
                        channelSegmentFindSegmentReceive.cleanPrev();
                        this.receiveResult = objUpdateCellReceive;
                    }
                }
                zOnClosedHasNext = onClosedHasNext();
            }
            return Boxing.boxBoolean(zOnClosedHasNext);
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int index) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.invokeOnCancellation(segment, index);
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @jn0.e
        public /* synthetic */ Object next(Continuation continuation) {
            return ChannelIterator.DefaultImpls.next(this, continuation);
        }

        public final boolean tryResumeHasNext(E element) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            s.h(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = element;
            Boolean bool = Boolean.TRUE;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            l<E, h0> lVar = bufferedChannel.onUndeliveredElement;
            return BufferedChannelKt.tryResume0(cancellableContinuationImpl, bool, lVar != null ? bufferedChannel.bindCancellationFun(lVar, element) : null);
        }

        public final void tryResumeHasNextOnClosedChannel() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            s.h(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuationImpl.resumeWith(jn0.s.b(Boolean.FALSE));
            } else {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                cancellableContinuationImpl.resumeWith(jn0.s.b(t.a(closeCause)));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() throws Throwable {
            E e11 = (E) this.receiveResult;
            if (e11 == BufferedChannelKt.NO_RECEIVE_RESULT) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.receiveResult = BufferedChannelKt.NO_RECEIVE_RESULT;
            if (e11 != BufferedChannelKt.getCHANNEL_CLOSED()) {
                return e11;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(BufferedChannel.this.getReceiveException());
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$SendBroadcast;", "Lkotlinx/coroutines/Waiter;", "Lkotlinx/coroutines/CancellableContinuation;", "", "cont", "<init>", "(Lkotlinx/coroutines/CancellableContinuation;)V", "Lkotlinx/coroutines/internal/Segment;", "segment", "", "index", "Ljn0/h0;", "invokeOnCancellation", "(Lkotlinx/coroutines/internal/Segment;I)V", "Lkotlinx/coroutines/CancellableContinuation;", "getCont", "()Lkotlinx/coroutines/CancellableContinuation;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class SendBroadcast implements Waiter {
        private final /* synthetic */ CancellableContinuationImpl<Boolean> $$delegate_0;
        private final CancellableContinuation<Boolean> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public SendBroadcast(CancellableContinuation<? super Boolean> cancellableContinuation) {
            s.i(cancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.$$delegate_0 = (CancellableContinuationImpl) cancellableContinuation;
            this.cont = cancellableContinuation;
        }

        public final CancellableContinuation<Boolean> getCont() {
            return this.cont;
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int index) {
            this.$$delegate_0.invokeOnCancellation(segment, index);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannel$bindCancellationFun$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class AnonymousClass2 extends p implements q<Throwable, E, CoroutineContext, h0> {
        AnonymousClass2(Object obj) {
            super(3, obj, BufferedChannel.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            invoke2(th2, obj, coroutineContext);
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2, E e11, CoroutineContext coroutineContext) {
            ((BufferedChannel) this.receiver).onCancellationImplDoNotCall(th2, e11, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannel$bindCancellationFunResult$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends p implements q<Throwable, ChannelResult<? extends E>, CoroutineContext, h0> {
        AnonymousClass1(Object obj) {
            super(3, obj, BufferedChannel.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            m525invoke5_sEAP8(th2, ((ChannelResult) obj).getHolder(), coroutineContext);
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: invoke-5_sEAP8, reason: not valid java name */
        public final void m525invoke5_sEAP8(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            ((BufferedChannel) this.receiver).m519onCancellationChannelResultImplDoNotCall5_sEAP8(th2, obj, coroutineContext);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedChannel(int i11, l<? super E, h0> lVar) {
        this.capacity = i11;
        this.onUndeliveredElement = lVar;
        if (i11 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i11 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = BufferedChannelKt.initialBufferEnd(i11);
        this.completedExpandBuffersAndPauseFlag$volatile = getBufferEndCounter();
        ChannelSegment channelSegment = new ChannelSegment(0L, null, this, 3);
        this.sendSegment$volatile = channelSegment;
        this.receiveSegment$volatile = channelSegment;
        if (isRendezvousOrUnlimited()) {
            channelSegment = BufferedChannelKt.NULL_SEGMENT;
            s.i(channelSegment, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = channelSegment;
        this.onUndeliveredElementReceiveCancellationConstructor = lVar != 0 ? new q() { // from class: kotlinx.coroutines.channels.c
            @Override // wn0.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56(this.f89214a, (SelectInstance) obj, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = BufferedChannelKt.NO_CLOSE_CAUSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q<Throwable, Object, CoroutineContext, h0> bindCancellationFun(final l<? super E, h0> lVar, final E e11) {
        return new q() { // from class: kotlinx.coroutines.channels.d
            @Override // wn0.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BufferedChannel.bindCancellationFun$lambda$89(lVar, e11, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 bindCancellationFun$lambda$89(l lVar, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        OnUndeliveredElementKt.callUndeliveredElement(lVar, obj, coroutineContext);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final co0.h<h0> bindCancellationFunResult(l<? super E, h0> lVar) {
        return new AnonymousClass1(this);
    }

    private final boolean bufferOrRendezvousSend(long curSenders) {
        return curSenders < getBufferEndCounter() || curSenders < getReceiversCounter$kotlinx_coroutines_core() + ((long) this.capacity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void cancelSuspendedReceiveRequests(ChannelSegment<E> lastSegment, long sendersCounter) {
        Object objM565constructorimpl$default = InlineList.m565constructorimpl$default(null, 1, null);
        loop0: while (lastSegment != null) {
            for (int i11 = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i11; i11--) {
                if ((lastSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i11) < sendersCounter) {
                    break loop0;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = lastSegment.getState$kotlinx_coroutines_core(i11);
                    if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                        if (!(state$kotlinx_coroutines_core instanceof WaiterEB)) {
                            if (!(state$kotlinx_coroutines_core instanceof Waiter)) {
                                break;
                            }
                            if (lastSegment.casState$kotlinx_coroutines_core(i11, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                objM565constructorimpl$default = InlineList.m570plusFjFbRPM(objM565constructorimpl$default, state$kotlinx_coroutines_core);
                                lastSegment.onCancelledRequest(i11, true);
                                break;
                            }
                        } else {
                            if (lastSegment.casState$kotlinx_coroutines_core(i11, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                objM565constructorimpl$default = InlineList.m570plusFjFbRPM(objM565constructorimpl$default, ((WaiterEB) state$kotlinx_coroutines_core).waiter);
                                lastSegment.onCancelledRequest(i11, true);
                                break;
                            }
                        }
                    } else {
                        if (lastSegment.casState$kotlinx_coroutines_core(i11, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            lastSegment.onSlotCleaned();
                            break;
                        }
                    }
                }
            }
            lastSegment = (ChannelSegment) lastSegment.getPrev();
        }
        if (objM565constructorimpl$default != null) {
            if (!(objM565constructorimpl$default instanceof ArrayList)) {
                resumeReceiverOnClosedChannel((Waiter) objM565constructorimpl$default);
                return;
            }
            s.i(objM565constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objM565constructorimpl$default;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                resumeReceiverOnClosedChannel((Waiter) arrayList.get(size));
            }
        }
    }

    private final ChannelSegment<E> closeLinkedList() {
        Object obj = bufferEndSegment$volatile$FU.get(this);
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        if (channelSegment.id > ((ChannelSegment) obj).id) {
            obj = channelSegment;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        if (channelSegment2.id > ((ChannelSegment) obj).id) {
            obj = channelSegment2;
        }
        return (ChannelSegment) ConcurrentLinkedListKt.close((ConcurrentLinkedListNode) obj);
    }

    private final void completeCancel(long sendersCur) {
        removeUnprocessedElements(completeClose(sendersCur));
    }

    private final ChannelSegment<E> completeClose(long sendersCur) {
        ChannelSegment<E> channelSegmentCloseLinkedList = closeLinkedList();
        if (isConflatedDropOldest()) {
            long jMarkAllEmptyCellsAsClosed = markAllEmptyCellsAsClosed(channelSegmentCloseLinkedList);
            if (jMarkAllEmptyCellsAsClosed != -1) {
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(jMarkAllEmptyCellsAsClosed);
            }
        }
        cancelSuspendedReceiveRequests(channelSegmentCloseLinkedList, sendersCur);
        return channelSegmentCloseLinkedList;
    }

    private final void completeCloseOrCancel() {
        isClosedForSend();
    }

    private final void expandBuffer() {
        if (isRendezvousOrUnlimited()) {
            return;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) bufferEndSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = bufferEnd$volatile$FU.getAndIncrement(this);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = andIncrement / ((long) i11);
            if (getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (channelSegment.id < j11 && channelSegment.getNext() != 0) {
                    moveSegmentBufferEndToSpecifiedOrLast(j11, channelSegment);
                }
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            if (channelSegment.id != j11) {
                ChannelSegment<E> channelSegmentFindSegmentBufferEnd = findSegmentBufferEnd(j11, channelSegment, andIncrement);
                if (channelSegmentFindSegmentBufferEnd == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentBufferEnd;
                }
            }
            if (updateCellExpandBuffer(channelSegment, (int) (andIncrement % ((long) i11)), andIncrement)) {
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
    }

    private final ChannelSegment<E> findSegmentBufferEnd(long id2, ChannelSegment<E> startFrom, long currentBufferEndCounter) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
        wn0.p pVar = (wn0.p) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(startFrom, id2, pVar);
            if (!SegmentOrClosed.m582isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM580getSegmentimpl = SegmentOrClosed.m580getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM580getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM580getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, segment, segmentM580getSegmentimpl)) {
                        if (!segment.decPointers$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        segment.remove();
                        break loop0;
                    }
                    if (segmentM580getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM580getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m582isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            moveSegmentBufferEndToSpecifiedOrLast(id2, startFrom);
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
            return null;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) SegmentOrClosed.m580getSegmentimpl(objFindSegmentInternal);
        if (channelSegment.id <= id2) {
            return channelSegment;
        }
        long j11 = channelSegment.id;
        int i11 = BufferedChannelKt.SEGMENT_SIZE;
        if (bufferEnd$volatile$FU.compareAndSet(this, currentBufferEndCounter + 1, j11 * ((long) i11))) {
            incCompletedExpandBufferAttempts((channelSegment.id * ((long) i11)) - currentBufferEndCounter);
        } else {
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelSegment<E> findSegmentReceive(long id2, ChannelSegment<E> startFrom) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$volatile$FU;
        wn0.p pVar = (wn0.p) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(startFrom, id2, pVar);
            if (!SegmentOrClosed.m582isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM580getSegmentimpl = SegmentOrClosed.m580getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM580getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM580getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, segment, segmentM580getSegmentimpl)) {
                        if (!segment.decPointers$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        segment.remove();
                        break loop0;
                    }
                    if (segmentM580getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM580getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m582isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (startFrom.id * ((long) BufferedChannelKt.SEGMENT_SIZE) < getSendersCounter$kotlinx_coroutines_core()) {
                startFrom.cleanPrev();
            }
            return null;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) SegmentOrClosed.m580getSegmentimpl(objFindSegmentInternal);
        if (!isRendezvousOrUnlimited() && id2 <= getBufferEndCounter() / ((long) BufferedChannelKt.SEGMENT_SIZE)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = bufferEndSegment$volatile$FU;
            while (true) {
                Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                if (segment2.id >= channelSegment.id || !channelSegment.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, segment2, channelSegment)) {
                    if (!segment2.decPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    segment2.remove();
                    break;
                }
                if (channelSegment.decPointers$kotlinx_coroutines_core()) {
                    channelSegment.remove();
                }
            }
        }
        long j11 = channelSegment.id;
        if (j11 <= id2) {
            return channelSegment;
        }
        int i11 = BufferedChannelKt.SEGMENT_SIZE;
        updateReceiversCounterIfLower(j11 * ((long) i11));
        if (channelSegment.id * ((long) i11) < getSendersCounter$kotlinx_coroutines_core()) {
            channelSegment.cleanPrev();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelSegment<E> findSegmentSend(long id2, ChannelSegment<E> startFrom) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$volatile$FU;
        wn0.p pVar = (wn0.p) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(startFrom, id2, pVar);
            if (!SegmentOrClosed.m582isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM580getSegmentimpl = SegmentOrClosed.m580getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM580getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM580getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, segment, segmentM580getSegmentimpl)) {
                        if (!segment.decPointers$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        segment.remove();
                        break loop0;
                    }
                    if (segmentM580getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM580getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m582isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (startFrom.id * ((long) BufferedChannelKt.SEGMENT_SIZE) < getReceiversCounter$kotlinx_coroutines_core()) {
                startFrom.cleanPrev();
            }
            return null;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) SegmentOrClosed.m580getSegmentimpl(objFindSegmentInternal);
        long j11 = channelSegment.id;
        if (j11 <= id2) {
            return channelSegment;
        }
        int i11 = BufferedChannelKt.SEGMENT_SIZE;
        updateSendersCounterIfLower(j11 * ((long) i11));
        if (channelSegment.id * ((long) i11) < getReceiversCounter$kotlinx_coroutines_core()) {
            channelSegment.cleanPrev();
        }
        return null;
    }

    private final /* synthetic */ Object getAndUpdate$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, l<Object, ? extends Object> lVar) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
        return obj2;
    }

    private final /* synthetic */ long getBufferEnd$volatile() {
        return this.bufferEnd$volatile;
    }

    private final long getBufferEndCounter() {
        return bufferEnd$volatile$FU.get(this);
    }

    private final /* synthetic */ Object getBufferEndSegment$volatile() {
        return this.bufferEndSegment$volatile;
    }

    private final /* synthetic */ Object getCloseHandler$volatile() {
        return this.closeHandler$volatile;
    }

    private final /* synthetic */ long getCompletedExpandBuffersAndPauseFlag$volatile() {
        return this.completedExpandBuffersAndPauseFlag$volatile;
    }

    public static /* synthetic */ void getOnReceive$annotations() {
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private static /* synthetic */ void getOnUndeliveredElementReceiveCancellationConstructor$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable getReceiveException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedReceiveChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    private final /* synthetic */ Object getReceiveSegment$volatile() {
        return this.receiveSegment$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getReceiveSegment$volatile$FU() {
        return receiveSegment$volatile$FU;
    }

    private final /* synthetic */ long getReceivers$volatile() {
        return this.receivers$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater getReceivers$volatile$FU() {
        return receivers$volatile$FU;
    }

    private final /* synthetic */ Object getSendSegment$volatile() {
        return this.sendSegment$volatile;
    }

    private final /* synthetic */ long getSendersAndCloseStatus$volatile() {
        return this.sendersAndCloseStatus$volatile;
    }

    private final /* synthetic */ Object get_closeCause$volatile() {
        return this._closeCause$volatile;
    }

    private final void incCompletedExpandBufferAttempts(long nAttempts) {
        if ((completedExpandBuffersAndPauseFlag$volatile$FU.addAndGet(this, nAttempts) & 4611686018427387904L) != 0) {
            while ((completedExpandBuffersAndPauseFlag$volatile$FU.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    static /* synthetic */ void incCompletedExpandBufferAttempts$default(BufferedChannel bufferedChannel, long j11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i11 & 1) != 0) {
            j11 = 1;
        }
        bufferedChannel.incCompletedExpandBufferAttempts(j11);
    }

    private final void invokeCloseHandler() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$volatile$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.CLOSE_HANDLER_CLOSED : BufferedChannelKt.CLOSE_HANDLER_INVOKED));
        if (obj == null) {
            return;
        }
        ((l) obj).invoke(getCloseCause());
    }

    private final boolean isCellNonEmpty(ChannelSegment<E> segment, int index, long globalIndex) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                    return true;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED() || state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.POISONED) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.RESUMING_BY_EB) {
                    return true;
                }
                return state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV && globalIndex == getReceiversCounter$kotlinx_coroutines_core();
            }
        } while (!segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.POISONED));
        expandBuffer();
        return false;
    }

    private final boolean isClosed(long sendersAndCloseStatusCur, boolean isClosedForReceive) {
        int i11 = (int) (sendersAndCloseStatusCur >> 60);
        if (i11 == 0 || i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            completeClose(sendersAndCloseStatusCur & 1152921504606846975L);
            return (isClosedForReceive && hasElements$kotlinx_coroutines_core()) ? false : true;
        }
        if (i11 == 3) {
            completeCancel(sendersAndCloseStatusCur & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i11).toString());
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void isClosedForReceive$annotations() {
    }

    private final boolean isClosedForReceive0(long j11) {
        return isClosed(j11, true);
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isClosedForSend0(long j11) {
        return isClosed(j11, false);
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void isEmpty$annotations() {
    }

    private final boolean isRendezvousOrUnlimited() {
        long bufferEndCounter = getBufferEndCounter();
        return bufferEndCounter == 0 || bufferEndCounter == Long.MAX_VALUE;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, l<Object, h0> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Long(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, l<? super Long, h0> lVar) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long markAllEmptyCellsAsClosed(ChannelSegment<E> lastSegment) {
        do {
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            while (true) {
                i11--;
                if (-1 < i11) {
                    long j11 = (lastSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i11);
                    if (j11 >= getReceiversCounter$kotlinx_coroutines_core()) {
                        while (true) {
                            Object state$kotlinx_coroutines_core = lastSegment.getState$kotlinx_coroutines_core(i11);
                            if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                                if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                                    break;
                                }
                                return j11;
                            }
                            if (lastSegment.casState$kotlinx_coroutines_core(i11, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                lastSegment.onSlotCleaned();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            lastSegment = (ChannelSegment) lastSegment.getPrev();
        } while (lastSegment != null);
        return -1L;
    }

    private final void markCancellationStarted() {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (((int) (j11 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j11, 1)));
    }

    private final void markCancelled() {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j11 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j11, 3)));
    }

    private final void markClosed() {
        long j11;
        long jConstructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            int i11 = (int) (j11 >> 60);
            if (i11 == 0) {
                jConstructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j11, 2);
            } else if (i11 != 1) {
                return;
            } else {
                jConstructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j11, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, jConstructSendersAndCloseStatus));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void moveSegmentBufferEndToSpecifiedOrLast(long id2, ChannelSegment<E> startFrom) {
        ChannelSegment<E> channelSegment;
        ChannelSegment<E> channelSegment2;
        while (startFrom.id < id2 && (channelSegment2 = (ChannelSegment) startFrom.getNext()) != null) {
            startFrom = channelSegment2;
        }
        while (true) {
            if (!startFrom.isRemoved() || (channelSegment = (ChannelSegment) startFrom.getNext()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= startFrom.id) {
                        return;
                    }
                    if (!startFrom.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, segment, startFrom)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                            return;
                        }
                        return;
                    } else if (startFrom.decPointers$kotlinx_coroutines_core()) {
                        startFrom.remove();
                    }
                }
            } else {
                startFrom = channelSegment;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCancellationChannelResultImplDoNotCall-5_sEAP8, reason: not valid java name */
    public final void m519onCancellationChannelResultImplDoNotCall5_sEAP8(Throwable cause, Object element, CoroutineContext context) {
        l<E, h0> lVar = this.onUndeliveredElement;
        s.h(lVar);
        Object objM535getOrNullimpl = ChannelResult.m535getOrNullimpl(element);
        s.h(objM535getOrNullimpl);
        OnUndeliveredElementKt.callUndeliveredElement(lVar, objM535getOrNullimpl, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancellationImplDoNotCall(Throwable cause, E element, CoroutineContext context) {
        l<E, h0> lVar = this.onUndeliveredElement;
        s.h(lVar);
        OnUndeliveredElementKt.callUndeliveredElement(lVar, element, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveCatchingOnNoWaiterSuspend(CancellableContinuation<? super ChannelResult<? extends E>> cont) {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        cont.resumeWith(jn0.s.b(ChannelResult.m530boximpl(ChannelResult.INSTANCE.m543closedJP2dKIU(getCloseCause()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveOnNoWaiterSuspend(CancellableContinuation<? super E> cont) {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        cont.resumeWith(jn0.s.b(t.a(getReceiveException())));
    }

    private final void onClosedSelectOnReceive(SelectInstance<?> select) {
        select.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    private final void onClosedSelectOnSend(E element, SelectInstance<?> select) {
        l<E, h0> lVar = this.onUndeliveredElement;
        if (lVar != null) {
            OnUndeliveredElementKt.callUndeliveredElement(lVar, element, select.getContext());
        }
        select.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onClosedSend(E e11, Continuation<? super h0> continuation) {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        l<E, h0> lVar = this.onUndeliveredElement;
        if (lVar == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lVar, e11, null, 2, null)) == null) {
            Throwable sendException = getSendException();
            jn0.s.Companion companion = jn0.s.INSTANCE;
            cancellableContinuationImpl.resumeWith(jn0.s.b(t.a(sendException)));
        } else {
            jn0.g.a(undeliveredElementExceptionCallUndeliveredElementCatchingException$default, getSendException());
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            cancellableContinuationImpl.resumeWith(jn0.s.b(t.a(undeliveredElementExceptionCallUndeliveredElementCatchingException$default)));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedSendOnNoWaiterSuspend(E element, CancellableContinuation<? super h0> cont) {
        l<E, h0> lVar = this.onUndeliveredElement;
        if (lVar != null) {
            OnUndeliveredElementKt.callUndeliveredElement(lVar, element, cont.getContext());
        }
        Throwable sendException = getSendException();
        jn0.s.Companion companion = jn0.s.INSTANCE;
        cont.resumeWith(jn0.s.b(t.a(sendException)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56(final BufferedChannel bufferedChannel, final SelectInstance selectInstance, Object obj, final Object obj2) {
        return new q() { // from class: kotlinx.coroutines.channels.b
            @Override // wn0.q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(obj2, bufferedChannel, selectInstance, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(Object obj, BufferedChannel bufferedChannel, SelectInstance selectInstance, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        if (obj != BufferedChannelKt.getCHANNEL_CLOSED()) {
            OnUndeliveredElementKt.callUndeliveredElement(bufferedChannel.onUndeliveredElement, obj, selectInstance.getContext());
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareReceiverForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i11) {
        onReceiveEnqueued();
        waiter.invokeOnCancellation(channelSegment, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareSenderForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i11) {
        waiter.invokeOnCancellation(channelSegment, i11 + BufferedChannelKt.SEGMENT_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceive(Object ignoredParam, Object selectResult) throws Throwable {
        if (selectResult != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return selectResult;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveCatching(Object ignoredParam, Object selectResult) {
        return ChannelResult.m530boximpl(selectResult == BufferedChannelKt.getCHANNEL_CLOSED() ? ChannelResult.INSTANCE.m543closedJP2dKIU(getCloseCause()) : ChannelResult.INSTANCE.m545successJP2dKIU(selectResult));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveOrNull(Object ignoredParam, Object selectResult) throws Throwable {
        if (selectResult != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return selectResult;
        }
        if (getCloseCause() == null) {
            return null;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectSend(Object ignoredParam, Object selectResult) throws Throwable {
        if (selectResult != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return this;
        }
        throw getSendException();
    }

    static /* synthetic */ <E> Object receive$suspendImpl(BufferedChannel<E> bufferedChannel, Continuation<? super E> continuation) throws Throwable {
        ChannelSegment<E> channelSegment;
        ChannelSegment<E> channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = andIncrement / ((long) i11);
            int i12 = (int) (andIncrement % ((long) i11));
            if (channelSegment2.id != j11) {
                ChannelSegment<E> channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j11, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Object objUpdateCellReceive = bufferedChannel2.updateCellReceive(channelSegment, i12, andIncrement, null);
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                throw new IllegalStateException("unexpected");
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    return bufferedChannel2.receiveOnNoWaiterSuspend(channelSegment, i12, andIncrement, continuation);
                }
                channelSegment.cleanPrev();
                return objUpdateCellReceive;
            }
            if (andIncrement < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            bufferedChannel = bufferedChannel2;
            channelSegment2 = channelSegment;
        }
        throw StackTraceRecoveryKt.recoverStackTrace(bufferedChannel.getReceiveException());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU$suspendImpl, reason: not valid java name */
    static /* synthetic */ <E> Object m520receiveCatchingJP2dKIU$suspendImpl(BufferedChannel<E> bufferedChannel, Continuation<? super ChannelResult<? extends E>> continuation) throws Throwable {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        ChannelSegment<E> channelSegment;
        if (continuation instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) continuation;
            int i11 = bufferedChannel$receiveCatching$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.label = i11 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, continuation);
            }
        } else {
            bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, continuation);
        }
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$2 = bufferedChannel$receiveCatching$1;
        Object obj = bufferedChannel$receiveCatching$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bufferedChannel$receiveCatching$2.label;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((ChannelResult) obj).getHolder();
        }
        t.b(obj);
        ChannelSegment<E> channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            int i13 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = andIncrement / ((long) i13);
            int i14 = (int) (andIncrement % ((long) i13));
            if (channelSegment2.id != j11) {
                ChannelSegment<E> channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j11, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Object objUpdateCellReceive = bufferedChannel2.updateCellReceive(channelSegment, i14, andIncrement, null);
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                throw new IllegalStateException("unexpected");
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive != BufferedChannelKt.SUSPEND_NO_WAITER) {
                    channelSegment.cleanPrev();
                    return ChannelResult.INSTANCE.m545successJP2dKIU(objUpdateCellReceive);
                }
                bufferedChannel$receiveCatching$2.label = 1;
                Object objM521receiveCatchingOnNoWaiterSuspendGKJJFZk = bufferedChannel2.m521receiveCatchingOnNoWaiterSuspendGKJJFZk(channelSegment, i14, andIncrement, bufferedChannel$receiveCatching$2);
                return objM521receiveCatchingOnNoWaiterSuspendGKJJFZk == coroutine_suspended ? coroutine_suspended : objM521receiveCatchingOnNoWaiterSuspendGKJJFZk;
            }
            if (andIncrement < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            bufferedChannel = bufferedChannel2;
            channelSegment2 = channelSegment;
        }
        return ChannelResult.INSTANCE.m543closedJP2dKIU(bufferedChannel.getCloseCause());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    public final Object m521receiveCatchingOnNoWaiterSuspendGKJJFZk(ChannelSegment<E> channelSegment, int i11, long j11, Continuation<? super ChannelResult<? extends E>> continuation) throws Throwable {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        ChannelResult channelResultM530boximpl;
        ChannelSegment channelSegment2;
        if (continuation instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuation;
            int i12 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = i12 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuation);
            }
        } else {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuation);
        }
        Object result = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
        if (i13 == 0) {
            t.b(result);
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$0 = this;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$1 = channelSegment;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0 = i11;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0 = j11;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = 1;
            CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1));
            try {
                s.i(orCreateCancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>");
                ReceiveCatching receiveCatching = new ReceiveCatching(orCreateCancellableContinuation);
                try {
                    Object objUpdateCellReceive = updateCellReceive(channelSegment, i11, j11, receiveCatching);
                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                        prepareReceiverForSuspension(receiveCatching, channelSegment, i11);
                    } else {
                        co0.h hVarBindCancellationFunResult = null;
                        if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                            if (j11 < getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment.cleanPrev();
                            }
                            ChannelSegment channelSegment3 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
                            while (true) {
                                if (isClosedForReceive()) {
                                    onClosedReceiveCatchingOnNoWaiterSuspend(orCreateCancellableContinuation);
                                } else {
                                    long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                                    int i14 = BufferedChannelKt.SEGMENT_SIZE;
                                    long j12 = andIncrement / ((long) i14);
                                    int i15 = (int) (andIncrement % ((long) i14));
                                    if (channelSegment3.id != j12) {
                                        ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j12, channelSegment3);
                                        if (channelSegmentFindSegmentReceive != null) {
                                            channelSegment2 = channelSegmentFindSegmentReceive;
                                        }
                                    } else {
                                        channelSegment2 = channelSegment3;
                                    }
                                    Object objUpdateCellReceive2 = updateCellReceive(channelSegment2, i15, andIncrement, receiveCatching);
                                    ChannelSegment channelSegment4 = channelSegment2;
                                    if (objUpdateCellReceive2 == BufferedChannelKt.SUSPEND) {
                                        prepareReceiverForSuspension(receiveCatching, channelSegment4, i15);
                                    } else if (objUpdateCellReceive2 == BufferedChannelKt.FAILED) {
                                        if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                            channelSegment4.cleanPrev();
                                        }
                                        channelSegment3 = channelSegment4;
                                    } else {
                                        if (objUpdateCellReceive2 == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        channelSegment4.cleanPrev();
                                        channelResultM530boximpl = ChannelResult.m530boximpl(ChannelResult.INSTANCE.m545successJP2dKIU(objUpdateCellReceive2));
                                        l<E, h0> lVar = this.onUndeliveredElement;
                                        if (lVar != null) {
                                            hVarBindCancellationFunResult = bindCancellationFunResult(lVar);
                                        }
                                    }
                                }
                            }
                        } else {
                            channelSegment.cleanPrev();
                            channelResultM530boximpl = ChannelResult.m530boximpl(ChannelResult.INSTANCE.m545successJP2dKIU(objUpdateCellReceive));
                            l<E, h0> lVar2 = this.onUndeliveredElement;
                            if (lVar2 != null) {
                                hVarBindCancellationFunResult = bindCancellationFunResult(lVar2);
                            }
                        }
                        orCreateCancellableContinuation.resume(channelResultM530boximpl, (q<? super Throwable, ? super ChannelResult, ? super CoroutineContext, h0>) hVarBindCancellationFunResult);
                    }
                    result = orCreateCancellableContinuation.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(result);
        }
        return ((ChannelResult) result).getHolder();
    }

    private final <R> R receiveImpl(Object waiter, l<? super E, ? extends R> onElementRetrieved, q<? super ChannelSegment<E>, ? super Integer, ? super Long, ? extends R> onSuspend, wn0.a<? extends R> onClosed, q<? super ChannelSegment<E>, ? super Integer, ? super Long, ? extends R> onNoWaiterSuspend) {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = andIncrement / ((long) i11);
            int i12 = (int) (andIncrement % ((long) i11));
            if (channelSegment2.id != j11) {
                ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j11, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            Object obj = waiter;
            Symbol symbol = (Object) updateCellReceive(channelSegment, i12, andIncrement, obj);
            channelSegment2 = channelSegment;
            if (symbol == BufferedChannelKt.SUSPEND) {
                Waiter waiter2 = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter2 != null) {
                    prepareReceiverForSuspension(waiter2, channelSegment2, i12);
                }
                return onSuspend.invoke(channelSegment2, Integer.valueOf(i12), Long.valueOf(andIncrement));
            }
            if (symbol != BufferedChannelKt.FAILED) {
                if (symbol == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    return onNoWaiterSuspend.invoke(channelSegment2, Integer.valueOf(i12), Long.valueOf(andIncrement));
                }
                channelSegment2.cleanPrev();
                return onElementRetrieved.invoke(symbol);
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
            waiter = obj;
        }
        return onClosed.invoke();
    }

    static /* synthetic */ Object receiveImpl$default(BufferedChannel bufferedChannel, Object obj, l lVar, q qVar, wn0.a aVar, q qVar2, int i11, Object obj2) {
        ChannelSegment channelSegment;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
        }
        if ((i11 & 16) != 0) {
            qVar2 = new q() { // from class: kotlinx.coroutines.channels.BufferedChannel.receiveImpl.1
                @Override // wn0.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                    return invoke((ChannelSegment) obj3, ((Number) obj4).intValue(), ((Number) obj5).longValue());
                }

                public final Void invoke(ChannelSegment<E> channelSegment2, int i12, long j11) {
                    throw new IllegalStateException("unexpected");
                }
            };
        }
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            int i12 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = andIncrement / ((long) i12);
            int i13 = (int) (andIncrement % ((long) i12));
            if (channelSegment2.id != j11) {
                ChannelSegment channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j11, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel bufferedChannel2 = bufferedChannel;
            Object obj3 = obj;
            Object objUpdateCellReceive = bufferedChannel2.updateCellReceive(channelSegment, i13, andIncrement, obj3);
            channelSegment2 = channelSegment;
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = obj3 instanceof Waiter ? (Waiter) obj3 : null;
                if (waiter != null) {
                    bufferedChannel2.prepareReceiverForSuspension(waiter, channelSegment2, i13);
                }
                return qVar.invoke(channelSegment2, Integer.valueOf(i13), Long.valueOf(andIncrement));
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    return qVar2.invoke(channelSegment2, Integer.valueOf(i13), Long.valueOf(andIncrement));
                }
                channelSegment2.cleanPrev();
                return lVar.invoke(objUpdateCellReceive);
            }
            if (andIncrement < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
            bufferedChannel = bufferedChannel2;
            obj = obj3;
        }
        return aVar.invoke();
    }

    private final void receiveImplOnNoWaiter(ChannelSegment<E> segment, int index, long r11, Waiter waiter, l<? super E, h0> onElementRetrieved, wn0.a<h0> onClosed) {
        ChannelSegment channelSegment;
        Waiter waiter2;
        Symbol symbol = (Object) updateCellReceive(segment, index, r11, waiter);
        BufferedChannel<E> bufferedChannel = this;
        if (symbol == BufferedChannelKt.SUSPEND) {
            prepareReceiverForSuspension(waiter, segment, index);
            return;
        }
        if (symbol != BufferedChannelKt.FAILED) {
            segment.cleanPrev();
            onElementRetrieved.invoke(symbol);
            return;
        }
        if (r11 < getSendersCounter$kotlinx_coroutines_core()) {
            segment.cleanPrev();
        }
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = andIncrement / ((long) i11);
            int i12 = (int) (andIncrement % ((long) i11));
            if (channelSegment2.id != j11) {
                ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j11, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Symbol symbol2 = (Object) bufferedChannel2.updateCellReceive(channelSegment, i12, andIncrement, waiter);
            channelSegment2 = channelSegment;
            if (symbol2 == BufferedChannelKt.SUSPEND) {
                if (waiter == null) {
                    waiter2 = null;
                }
                if (waiter2 != null) {
                    waiter2 = waiter;
                    prepareReceiverForSuspension(waiter2, channelSegment2, i12);
                }
                waiter2 = waiter;
                h0 h0Var = h0.f84049a;
                return;
            }
            if (symbol2 != BufferedChannelKt.FAILED) {
                if (symbol2 == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    throw new IllegalStateException("unexpected");
                }
                channelSegment2.cleanPrev();
                onElementRetrieved.invoke(symbol2);
                return;
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
            bufferedChannel = bufferedChannel2;
        }
        onClosed.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object receiveOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i11, long j11, Continuation<? super E> continuation) {
        ChannelSegment channelSegment2;
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            Object objUpdateCellReceive = updateCellReceive(channelSegment, i11, j11, orCreateCancellableContinuation);
            if (objUpdateCellReceive != BufferedChannelKt.SUSPEND) {
                co0.h hVarBindCancellationFun = null;
                hVarBindCancellationFun = null;
                if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                    if (j11 < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    ChannelSegment channelSegment3 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            onClosedReceiveOnNoWaiterSuspend(orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                        int i12 = BufferedChannelKt.SEGMENT_SIZE;
                        long j12 = andIncrement / ((long) i12);
                        int i13 = (int) (andIncrement % ((long) i12));
                        if (channelSegment3.id != j12) {
                            ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j12, channelSegment3);
                            if (channelSegmentFindSegmentReceive != null) {
                                channelSegment2 = channelSegmentFindSegmentReceive;
                            }
                        } else {
                            channelSegment2 = channelSegment3;
                        }
                        objUpdateCellReceive = updateCellReceive(channelSegment2, i13, andIncrement, orCreateCancellableContinuation);
                        ChannelSegment channelSegment4 = channelSegment2;
                        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                            CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation != null ? orCreateCancellableContinuation : null;
                            if (cancellableContinuationImpl == null) {
                                break;
                            }
                            prepareReceiverForSuspension(cancellableContinuationImpl, channelSegment4, i13);
                            break;
                        }
                        if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment4.cleanPrev();
                            }
                            channelSegment3 = channelSegment4;
                        } else {
                            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                throw new IllegalStateException("unexpected");
                            }
                            channelSegment4.cleanPrev();
                            l<E, h0> lVar = this.onUndeliveredElement;
                            if (lVar != null) {
                                hVarBindCancellationFun = bindCancellationFun(lVar);
                            }
                        }
                    }
                } else {
                    channelSegment.cleanPrev();
                    l<E, h0> lVar2 = this.onUndeliveredElement;
                    if (lVar2 != null) {
                        hVarBindCancellationFun = bindCancellationFun(lVar2);
                    }
                }
                orCreateCancellableContinuation.resume(objUpdateCellReceive, (q<? super Throwable, ? super Object, ? super CoroutineContext, h0>) hVarBindCancellationFun);
                break;
            }
            prepareReceiverForSuspension(orCreateCancellableContinuation, channelSegment, i11);
            Object result = orCreateCancellableContinuation.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (Throwable th2) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForReceive(SelectInstance<?> select, Object ignoredParam) {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = andIncrement / ((long) i11);
            int i12 = (int) (andIncrement % ((long) i11));
            if (channelSegment2.id != j11) {
                ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j11, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            SelectInstance<?> selectInstance = select;
            Object objUpdateCellReceive = updateCellReceive(channelSegment, i12, andIncrement, selectInstance);
            channelSegment2 = channelSegment;
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = selectInstance instanceof Waiter ? (Waiter) selectInstance : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment2, i12);
                    return;
                }
                return;
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    throw new IllegalStateException("unexpected");
                }
                channelSegment2.cleanPrev();
                selectInstance.selectInRegistrationPhase(objUpdateCellReceive);
                return;
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
            select = selectInstance;
        }
        onClosedSelectOnReceive(select);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void removeUnprocessedElements(ChannelSegment<E> lastSegment) {
        l<E, h0> lVar = this.onUndeliveredElement;
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException = null;
        Object objM565constructorimpl$default = InlineList.m565constructorimpl$default(null, 1, null);
        loop0: do {
            for (int i11 = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i11; i11--) {
                long j11 = (lastSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i11);
                while (true) {
                    Object state$kotlinx_coroutines_core = lastSegment.getState$kotlinx_coroutines_core(i11);
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV) {
                        break loop0;
                    }
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                        if (state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER && state$kotlinx_coroutines_core != null) {
                            if (!(state$kotlinx_coroutines_core instanceof Waiter) && !(state$kotlinx_coroutines_core instanceof WaiterEB)) {
                                if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB && state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV) {
                                    if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j11 < getReceiversCounter$kotlinx_coroutines_core()) {
                                    break loop0;
                                }
                                Waiter waiter = state$kotlinx_coroutines_core instanceof WaiterEB ? ((WaiterEB) state$kotlinx_coroutines_core).waiter : (Waiter) state$kotlinx_coroutines_core;
                                if (lastSegment.casState$kotlinx_coroutines_core(i11, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                    if (lVar != null) {
                                        undeliveredElementExceptionCallUndeliveredElementCatchingException = OnUndeliveredElementKt.callUndeliveredElementCatchingException(lVar, lastSegment.getElement$kotlinx_coroutines_core(i11), undeliveredElementExceptionCallUndeliveredElementCatchingException);
                                    }
                                    objM565constructorimpl$default = InlineList.m570plusFjFbRPM(objM565constructorimpl$default, waiter);
                                    lastSegment.cleanElement$kotlinx_coroutines_core(i11);
                                    lastSegment.onSlotCleaned();
                                    break;
                                }
                            }
                        } else {
                            if (lastSegment.casState$kotlinx_coroutines_core(i11, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                lastSegment.onSlotCleaned();
                                break;
                            }
                        }
                    } else {
                        if (j11 < getReceiversCounter$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        if (lastSegment.casState$kotlinx_coroutines_core(i11, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            if (lVar != null) {
                                undeliveredElementExceptionCallUndeliveredElementCatchingException = OnUndeliveredElementKt.callUndeliveredElementCatchingException(lVar, lastSegment.getElement$kotlinx_coroutines_core(i11), undeliveredElementExceptionCallUndeliveredElementCatchingException);
                            }
                            lastSegment.cleanElement$kotlinx_coroutines_core(i11);
                            lastSegment.onSlotCleaned();
                            break;
                        }
                    }
                }
            }
            lastSegment = (ChannelSegment) lastSegment.getPrev();
        } while (lastSegment != null);
        if (objM565constructorimpl$default != null) {
            if (objM565constructorimpl$default instanceof ArrayList) {
                s.i(objM565constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) objM565constructorimpl$default;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    resumeSenderOnCancelledChannel((Waiter) arrayList.get(size));
                }
            } else {
                resumeSenderOnCancelledChannel((Waiter) objM565constructorimpl$default);
            }
        }
        if (undeliveredElementExceptionCallUndeliveredElementCatchingException != null) {
            throw undeliveredElementExceptionCallUndeliveredElementCatchingException;
        }
    }

    private final void resumeReceiverOnClosedChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, true);
    }

    private final void resumeSenderOnCancelledChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, false);
    }

    private final void resumeWaiterOnClosedChannel(Waiter waiter, boolean z11) {
        if (waiter instanceof SendBroadcast) {
            CancellableContinuation<Boolean> cont = ((SendBroadcast) waiter).getCont();
            jn0.s.Companion companion = jn0.s.INSTANCE;
            cont.resumeWith(jn0.s.b(Boolean.FALSE));
            return;
        }
        if (waiter instanceof CancellableContinuation) {
            Continuation continuation = (Continuation) waiter;
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            continuation.resumeWith(jn0.s.b(t.a(z11 ? getReceiveException() : getSendException())));
        } else if (waiter instanceof ReceiveCatching) {
            CancellableContinuationImpl<ChannelResult<? extends E>> cancellableContinuationImpl = ((ReceiveCatching) waiter).cont;
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            cancellableContinuationImpl.resumeWith(jn0.s.b(ChannelResult.m530boximpl(ChannelResult.INSTANCE.m543closedJP2dKIU(getCloseCause()))));
        } else if (waiter instanceof BufferedChannelIterator) {
            ((BufferedChannelIterator) waiter).tryResumeHasNextOnClosedChannel();
        } else {
            if (waiter instanceof SelectInstance) {
                ((SelectInstance) waiter).trySelect(this, BufferedChannelKt.getCHANNEL_CLOSED());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + waiter).toString());
        }
    }

    static /* synthetic */ <E> Object send$suspendImpl(BufferedChannel<E> bufferedChannel, E e11, Continuation<? super h0> continuation) {
        ChannelSegment<E> channelSegment;
        ChannelSegment<E> channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j11 = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j12 = j11 / ((long) i11);
            int i12 = (int) (j11 % ((long) i11));
            if (channelSegment2.id != j12) {
                ChannelSegment<E> channelSegmentFindSegmentSend = bufferedChannel.findSegmentSend(j12, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    Object objOnClosedSend = bufferedChannel.onClosedSend(e11, continuation);
                    if (objOnClosedSend != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        break;
                    }
                    return objOnClosedSend;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            E e12 = e11;
            int iUpdateCellSend = bufferedChannel2.updateCellSend(channelSegment, i12, e12, j11, null, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            }
            if (iUpdateCellSend != 1) {
                if (iUpdateCellSend == 2) {
                    if (!zIsClosedForSend0) {
                        break;
                    }
                    channelSegment.onSlotCleaned();
                    Object objOnClosedSend2 = bufferedChannel2.onClosedSend(e12, continuation);
                    if (objOnClosedSend2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        break;
                    }
                    return objOnClosedSend2;
                }
                if (iUpdateCellSend == 3) {
                    Object objSendOnNoWaiterSuspend = bufferedChannel2.sendOnNoWaiterSuspend(channelSegment, i12, e12, j11, continuation);
                    if (objSendOnNoWaiterSuspend != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        break;
                    }
                    return objSendOnNoWaiterSuspend;
                }
                if (iUpdateCellSend == 4) {
                    if (j11 < bufferedChannel2.getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    Object objOnClosedSend3 = bufferedChannel2.onClosedSend(e12, continuation);
                    if (objOnClosedSend3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        break;
                    }
                    return objOnClosedSend3;
                }
                if (iUpdateCellSend == 5) {
                    channelSegment.cleanPrev();
                }
                bufferedChannel = bufferedChannel2;
                channelSegment2 = channelSegment;
                e11 = e12;
            } else {
                break;
            }
        }
        return h0.f84049a;
    }

    static /* synthetic */ <E> Object sendBroadcast$suspendImpl(BufferedChannel<E> bufferedChannel, E e11, Continuation<? super Boolean> continuation) {
        ChannelSegment channelSegmentFindSegmentSend;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (bufferedChannel.onUndeliveredElement != null) {
            throw new IllegalStateException("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`");
        }
        SendBroadcast sendBroadcast = new SendBroadcast(cancellableContinuationImpl);
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j11 = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j12 = j11 / ((long) i11);
            int i12 = (int) (j11 % ((long) i11));
            if (channelSegment.id != j12) {
                channelSegmentFindSegmentSend = bufferedChannel.findSegmentSend(j12, channelSegment);
                if (channelSegmentFindSegmentSend == null) {
                    if (zIsClosedForSend0) {
                        jn0.s.Companion companion = jn0.s.INSTANCE;
                        cancellableContinuationImpl.resumeWith(jn0.s.b(Boxing.boxBoolean(false)));
                        break;
                    }
                }
            } else {
                channelSegmentFindSegmentSend = channelSegment;
            }
            E e12 = e11;
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            int iUpdateCellSend = bufferedChannel2.updateCellSend(channelSegmentFindSegmentSend, i12, e12, j11, sendBroadcast, zIsClosedForSend0);
            channelSegment = channelSegmentFindSegmentSend;
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
            } else if (iUpdateCellSend != 1) {
                if (iUpdateCellSend == 2) {
                    if (!zIsClosedForSend0) {
                        bufferedChannel2.prepareSenderForSuspension(sendBroadcast, channelSegment, i12);
                        break;
                    }
                    channelSegment.onSlotCleaned();
                } else {
                    if (iUpdateCellSend == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iUpdateCellSend != 4) {
                        if (iUpdateCellSend == 5) {
                            channelSegment.cleanPrev();
                        }
                        bufferedChannel = bufferedChannel2;
                        e11 = e12;
                    } else if (j11 < bufferedChannel2.getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                }
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                cancellableContinuationImpl.resumeWith(jn0.s.b(Boxing.boxBoolean(false)));
                break;
            }
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            cancellableContinuationImpl.resumeWith(jn0.s.b(Boxing.boxBoolean(true)));
            break;
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    private final <R> R sendImpl(E element, Object waiter, wn0.a<? extends R> onRendezvousOrBuffered, wn0.p<? super ChannelSegment<E>, ? super Integer, ? extends R> onSuspend, wn0.a<? extends R> onClosed, r<? super ChannelSegment<E>, ? super Integer, ? super E, ? super Long, ? extends R> onNoWaiterSuspend) {
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j11 = 1152921504606846975L & andIncrement;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j12 = j11 / ((long) i11);
            int i12 = (int) (j11 % ((long) i11));
            if (channelSegment.id != j12) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j12, channelSegment);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return onClosed.invoke();
                }
            }
            int iUpdateCellSend = updateCellSend(channelSegment, i12, element, j11, waiter, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return onRendezvousOrBuffered.invoke();
            }
            if (iUpdateCellSend == 1) {
                return onRendezvousOrBuffered.invoke();
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return onClosed.invoke();
                }
                Waiter waiter2 = waiter instanceof Waiter ? (Waiter) waiter : null;
                if (waiter2 != null) {
                    prepareSenderForSuspension(waiter2, channelSegment, i12);
                }
                return onSuspend.invoke(channelSegment, Integer.valueOf(i12));
            }
            if (iUpdateCellSend == 3) {
                return onNoWaiterSuspend.invoke(channelSegment, Integer.valueOf(i12), element, Long.valueOf(j11));
            }
            if (iUpdateCellSend == 4) {
                if (j11 < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return onClosed.invoke();
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
        }
    }

    static /* synthetic */ Object sendImpl$default(BufferedChannel bufferedChannel, Object obj, Object obj2, wn0.a aVar, wn0.p pVar, wn0.a aVar2, r rVar, int i11, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
        r rVar2 = (i11 & 32) != 0 ? new r() { // from class: kotlinx.coroutines.channels.BufferedChannel.sendImpl.1
            @Override // wn0.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                return invoke((ChannelSegment<Object>) obj4, ((Number) obj5).intValue(), obj6, ((Number) obj7).longValue());
            }

            public final Void invoke(ChannelSegment<E> channelSegment, int i12, E e11, long j11) {
                throw new IllegalStateException("unexpected");
            }
        } : rVar;
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j11 = 1152921504606846975L & andIncrement;
            boolean zIsClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i12 = BufferedChannelKt.SEGMENT_SIZE;
            long j12 = j11 / ((long) i12);
            int i13 = (int) (j11 % ((long) i12));
            if (channelSegment.id != j12) {
                ChannelSegment channelSegmentFindSegmentSend = bufferedChannel.findSegmentSend(j12, channelSegment);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return aVar2.invoke();
                }
            }
            int iUpdateCellSend = bufferedChannel.updateCellSend(channelSegment, i13, obj, j11, obj2, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return aVar.invoke();
            }
            if (iUpdateCellSend == 1) {
                return aVar.invoke();
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return aVar2.invoke();
                }
                Waiter waiter = obj2 instanceof Waiter ? (Waiter) obj2 : null;
                if (waiter != null) {
                    bufferedChannel.prepareSenderForSuspension(waiter, channelSegment, i13);
                }
                return pVar.invoke(channelSegment, Integer.valueOf(i13));
            }
            if (iUpdateCellSend == 3) {
                return rVar2.invoke(channelSegment, Integer.valueOf(i13), obj, Long.valueOf(j11));
            }
            if (iUpdateCellSend == 4) {
                if (j11 < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return aVar2.invoke();
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
        }
    }

    private final void sendImplOnNoWaiter(ChannelSegment<E> segment, int index, E element, long s11, Waiter waiter, wn0.a<h0> onRendezvousOrBuffered, wn0.a<h0> onClosed) {
        h0 h0VarInvoke;
        int iUpdateCellSend = updateCellSend(segment, index, element, s11, waiter, false);
        if (iUpdateCellSend == 0) {
            segment.cleanPrev();
            onRendezvousOrBuffered.invoke();
            return;
        }
        if (iUpdateCellSend == 1) {
            onRendezvousOrBuffered.invoke();
            return;
        }
        if (iUpdateCellSend == 2) {
            prepareSenderForSuspension(waiter, segment, index);
            return;
        }
        if (iUpdateCellSend == 4) {
            if (s11 < getReceiversCounter$kotlinx_coroutines_core()) {
                segment.cleanPrev();
            }
            onClosed.invoke();
            return;
        }
        String str = "unexpected";
        if (iUpdateCellSend != 5) {
            throw new IllegalStateException("unexpected");
        }
        segment.cleanPrev();
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j11 = 1152921504606846975L & andIncrement;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j12 = j11 / ((long) i11);
            int i12 = (int) (j11 % ((long) i11));
            str = str;
            if (channelSegment.id != j12) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j12, channelSegment);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    h0VarInvoke = onClosed.invoke();
                    break;
                }
            }
            int iUpdateCellSend2 = updateCellSend(channelSegment, i12, element, j11, waiter, zIsClosedForSend0);
            if (iUpdateCellSend2 == 0) {
                channelSegment.cleanPrev();
                h0VarInvoke = onRendezvousOrBuffered.invoke();
                break;
            }
            if (iUpdateCellSend2 == 1) {
                h0VarInvoke = onRendezvousOrBuffered.invoke();
                break;
            }
            if (iUpdateCellSend2 == 2) {
                if (!zIsClosedForSend0) {
                    Waiter waiter2 = waiter != 0 ? waiter : null;
                    if (waiter2 != null) {
                        prepareSenderForSuspension(waiter2, channelSegment, i12);
                    }
                    h0VarInvoke = h0.f84049a;
                    break;
                }
                channelSegment.onSlotCleaned();
                h0VarInvoke = onClosed.invoke();
                break;
            }
            if (iUpdateCellSend2 == 3) {
                throw new IllegalStateException(str);
            }
            if (iUpdateCellSend2 == 4) {
                if (j11 < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                h0VarInvoke = onClosed.invoke();
                break;
            } else if (iUpdateCellSend2 == 5) {
                channelSegment.cleanPrev();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:62:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    public final Object sendOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i11, E e11, long j11, Continuation<? super h0> continuation) {
        h0 h0Var;
        Object result;
        ChannelSegment channelSegmentFindSegmentSend;
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            int iUpdateCellSend = updateCellSend(channelSegment, i11, e11, j11, orCreateCancellableContinuation, false);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                jn0.s.Companion companion = jn0.s.INSTANCE;
                h0Var = h0.f84049a;
            } else {
                if (iUpdateCellSend != 1) {
                    if (iUpdateCellSend != 2) {
                        if (iUpdateCellSend != 4) {
                            String str = "unexpected";
                            if (iUpdateCellSend != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            channelSegment.cleanPrev();
                            ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
                            while (true) {
                                long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
                                long j12 = 1152921504606846975L & andIncrement;
                                boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
                                int i12 = BufferedChannelKt.SEGMENT_SIZE;
                                long j13 = j12 / ((long) i12);
                                int i13 = (int) (j12 % ((long) i12));
                                str = str;
                                if (channelSegment2.id != j13) {
                                    channelSegmentFindSegmentSend = findSegmentSend(j13, channelSegment2);
                                    if (channelSegmentFindSegmentSend == null) {
                                        if (zIsClosedForSend0) {
                                        }
                                    }
                                } else {
                                    channelSegmentFindSegmentSend = channelSegment2;
                                }
                                int iUpdateCellSend2 = updateCellSend(channelSegmentFindSegmentSend, i13, e11, j12, orCreateCancellableContinuation, zIsClosedForSend0);
                                if (iUpdateCellSend2 == 0) {
                                    channelSegmentFindSegmentSend.cleanPrev();
                                    jn0.s.Companion companion2 = jn0.s.INSTANCE;
                                    h0Var = h0.f84049a;
                                } else if (iUpdateCellSend2 == 1) {
                                    jn0.s.Companion companion3 = jn0.s.INSTANCE;
                                    h0Var = h0.f84049a;
                                } else if (iUpdateCellSend2 == 2) {
                                    if (!zIsClosedForSend0) {
                                        CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation != null ? orCreateCancellableContinuation : null;
                                        if (cancellableContinuationImpl == null) {
                                            break;
                                        }
                                        prepareSenderForSuspension(cancellableContinuationImpl, channelSegmentFindSegmentSend, i13);
                                        break;
                                    }
                                    channelSegmentFindSegmentSend.onSlotCleaned();
                                } else {
                                    if (iUpdateCellSend2 == 3) {
                                        throw new IllegalStateException(str);
                                    }
                                    if (iUpdateCellSend2 != 4) {
                                        if (iUpdateCellSend2 == 5) {
                                            channelSegmentFindSegmentSend.cleanPrev();
                                        }
                                        channelSegment2 = channelSegmentFindSegmentSend;
                                    } else if (j12 < getReceiversCounter$kotlinx_coroutines_core()) {
                                        channelSegmentFindSegmentSend.cleanPrev();
                                    }
                                }
                            }
                        } else if (j11 < getReceiversCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        onClosedSendOnNoWaiterSuspend(e11, orCreateCancellableContinuation);
                        break;
                    } else {
                        prepareSenderForSuspension(orCreateCancellableContinuation, channelSegment, i11);
                    }
                    result = orCreateCancellableContinuation.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return result;
                    }
                    return h0.f84049a;
                }
                jn0.s.Companion companion4 = jn0.s.INSTANCE;
                h0Var = h0.f84049a;
            }
            orCreateCancellableContinuation.resumeWith(jn0.s.b(h0Var));
            result = orCreateCancellableContinuation.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return result;
            }
            return h0.f84049a;
        } catch (Throwable th2) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th2;
        }
    }

    private final /* synthetic */ void setBufferEnd$volatile(long j11) {
        this.bufferEnd$volatile = j11;
    }

    private final /* synthetic */ void setBufferEndSegment$volatile(Object obj) {
        this.bufferEndSegment$volatile = obj;
    }

    private final /* synthetic */ void setCloseHandler$volatile(Object obj) {
        this.closeHandler$volatile = obj;
    }

    private final /* synthetic */ void setCompletedExpandBuffersAndPauseFlag$volatile(long j11) {
        this.completedExpandBuffersAndPauseFlag$volatile = j11;
    }

    private final /* synthetic */ void setReceiveSegment$volatile(Object obj) {
        this.receiveSegment$volatile = obj;
    }

    private final /* synthetic */ void setReceivers$volatile(long j11) {
        this.receivers$volatile = j11;
    }

    private final /* synthetic */ void setSendSegment$volatile(Object obj) {
        this.sendSegment$volatile = obj;
    }

    private final /* synthetic */ void setSendersAndCloseStatus$volatile(long j11) {
        this.sendersAndCloseStatus$volatile = j11;
    }

    private final /* synthetic */ void set_closeCause$volatile(Object obj) {
        this._closeCause$volatile = obj;
    }

    private final boolean shouldSendSuspend(long curSendersAndCloseStatus) {
        if (isClosedForSend0(curSendersAndCloseStatus)) {
            return false;
        }
        return !bufferOrRendezvousSend(curSendersAndCloseStatus & 1152921504606846975L);
    }

    private final boolean tryResumeReceiver(Object obj, E e11) {
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).trySelect(this, e11);
        }
        if (obj instanceof ReceiveCatching) {
            s.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            CancellableContinuationImpl<ChannelResult<? extends E>> cancellableContinuationImpl = ((ReceiveCatching) obj).cont;
            ChannelResult channelResultM530boximpl = ChannelResult.m530boximpl(ChannelResult.INSTANCE.m545successJP2dKIU(e11));
            l<E, h0> lVar = this.onUndeliveredElement;
            return BufferedChannelKt.tryResume0(cancellableContinuationImpl, channelResultM530boximpl, (q) (lVar != null ? bindCancellationFunResult(lVar) : null));
        }
        if (obj instanceof BufferedChannelIterator) {
            s.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((BufferedChannelIterator) obj).tryResumeHasNext(e11);
        }
        if (obj instanceof CancellableContinuation) {
            s.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
            l<E, h0> lVar2 = this.onUndeliveredElement;
            return BufferedChannelKt.tryResume0(cancellableContinuation, e11, (q) (lVar2 != null ? bindCancellationFun(lVar2) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final boolean tryResumeSender(Object obj, ChannelSegment<E> channelSegment, int i11) {
        if (obj instanceof CancellableContinuation) {
            s.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.tryResume0$default((CancellableContinuation) obj, h0.f84049a, null, 2, null);
        }
        if (obj instanceof SelectInstance) {
            s.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            TrySelectDetailedResult trySelectDetailedResultTrySelectDetailed = ((SelectImplementation) obj).trySelectDetailed(this, h0.f84049a);
            if (trySelectDetailedResultTrySelectDetailed == TrySelectDetailedResult.REREGISTER) {
                channelSegment.cleanElement$kotlinx_coroutines_core(i11);
            }
            return trySelectDetailedResultTrySelectDetailed == TrySelectDetailedResult.SUCCESSFUL;
        }
        if (obj instanceof SendBroadcast) {
            return BufferedChannelKt.tryResume0$default(((SendBroadcast) obj).getCont(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Long(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, l<? super Long, Long> lVar) {
        while (true) {
            long j11 = atomicLongFieldUpdater.get(obj);
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            Object obj2 = obj;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j11, lVar.invoke(Long.valueOf(j11)).longValue())) {
                return;
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    private final boolean updateCellExpandBuffer(ChannelSegment<E> segment, int index, long b11) {
        Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if (!(state$kotlinx_coroutines_core instanceof Waiter) || b11 < receivers$volatile$FU.get(this) || !segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
            return updateCellExpandBufferSlow(segment, index, b11);
        }
        if (tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
            segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.BUFFERED);
            return true;
        }
        segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.INTERRUPTED_SEND);
        segment.onCancelledRequest(index, false);
        return false;
    }

    private final boolean updateCellExpandBufferSlow(ChannelSegment<E> segment, int index, long b11) {
        while (true) {
            Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core instanceof Waiter) {
                if (b11 < receivers$volatile$FU.get(this)) {
                    if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, new WaiterEB((Waiter) state$kotlinx_coroutines_core))) {
                        return true;
                    }
                } else if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
                    if (tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                        segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.BUFFERED);
                        return true;
                    }
                    segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.INTERRUPTED_SEND);
                    segment.onCancelledRequest(index, false);
                    return false;
                }
            } else {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == null) {
                    if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.IN_BUFFER)) {
                        return true;
                    }
                } else {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED || state$kotlinx_coroutines_core == BufferedChannelKt.POISONED || state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        return true;
                    }
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV) {
                        throw new IllegalStateException(("Unexpected cell state: " + state$kotlinx_coroutines_core).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateCellReceive(ChannelSegment<E> segment, int index, long r11, Object waiter) {
        Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if (state$kotlinx_coroutines_core == null) {
            if (r11 >= (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
                if (waiter == null) {
                    return BufferedChannelKt.SUSPEND_NO_WAITER;
                }
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, waiter)) {
                    expandBuffer();
                    return BufferedChannelKt.SUSPEND;
                }
            }
        } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED && segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
            expandBuffer();
            return segment.retrieveElement$kotlinx_coroutines_core(index);
        }
        return updateCellReceiveSlow(segment, index, r11, waiter);
    }

    private final Object updateCellReceiveSlow(ChannelSegment<E> segment, int index, long r11, Object waiter) {
        while (true) {
            Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core == null || state$kotlinx_coroutines_core == BufferedChannelKt.IN_BUFFER) {
                if (r11 < (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
                    if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.POISONED)) {
                        expandBuffer();
                        return BufferedChannelKt.FAILED;
                    }
                } else {
                    if (waiter == null) {
                        return BufferedChannelKt.SUSPEND_NO_WAITER;
                    }
                    if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, waiter)) {
                        expandBuffer();
                        return BufferedChannelKt.SUSPEND;
                    }
                }
            } else {
                if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.INTERRUPTED_SEND && state$kotlinx_coroutines_core != BufferedChannelKt.POISONED) {
                        if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                            expandBuffer();
                            return BufferedChannelKt.FAILED;
                        }
                        if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB && segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_RCV)) {
                            boolean z11 = state$kotlinx_coroutines_core instanceof WaiterEB;
                            if (z11) {
                                state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                            }
                            if (tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                                segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.DONE_RCV);
                                expandBuffer();
                                return segment.retrieveElement$kotlinx_coroutines_core(index);
                            }
                            segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.INTERRUPTED_SEND);
                            segment.onCancelledRequest(index, false);
                            if (z11) {
                                expandBuffer();
                            }
                            return BufferedChannelKt.FAILED;
                        }
                    }
                    return BufferedChannelKt.FAILED;
                }
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
                    expandBuffer();
                    return segment.retrieveElement$kotlinx_coroutines_core(index);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int updateCellSend(ChannelSegment<E> segment, int index, E element, long s11, Object waiter, boolean closed) {
        segment.storeElement$kotlinx_coroutines_core(index, element);
        if (closed) {
            return updateCellSendSlow(segment, index, element, s11, waiter, closed);
        }
        Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if (state$kotlinx_coroutines_core == null) {
            if (bufferOrRendezvousSend(s11)) {
                if (segment.casState$kotlinx_coroutines_core(index, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (waiter == null) {
                    return 3;
                }
                if (segment.casState$kotlinx_coroutines_core(index, null, waiter)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof Waiter) {
            segment.cleanElement$kotlinx_coroutines_core(index);
            if (tryResumeReceiver(state$kotlinx_coroutines_core, element)) {
                segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.DONE_RCV);
                onReceiveDequeued();
                return 0;
            }
            if (segment.getAndSetState$kotlinx_coroutines_core(index, BufferedChannelKt.INTERRUPTED_RCV) == BufferedChannelKt.INTERRUPTED_RCV) {
                return 5;
            }
            segment.onCancelledRequest(index, true);
            return 5;
        }
        return updateCellSendSlow(segment, index, element, s11, waiter, closed);
    }

    private final int updateCellSendSlow(ChannelSegment<E> segment, int index, E element, long s11, Object waiter, boolean closed) {
        while (true) {
            Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core == null) {
                if (!bufferOrRendezvousSend(s11) || closed) {
                    if (closed) {
                        if (segment.casState$kotlinx_coroutines_core(index, null, BufferedChannelKt.INTERRUPTED_SEND)) {
                            segment.onCancelledRequest(index, false);
                            return 4;
                        }
                    } else {
                        if (waiter == null) {
                            return 3;
                        }
                        if (segment.casState$kotlinx_coroutines_core(index, null, waiter)) {
                            return 2;
                        }
                    }
                } else if (segment.casState$kotlinx_coroutines_core(index, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_RCV) {
                        segment.cleanElement$kotlinx_coroutines_core(index);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.POISONED) {
                        segment.cleanElement$kotlinx_coroutines_core(index);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        segment.cleanElement$kotlinx_coroutines_core(index);
                        completeCloseOrCancel();
                        return 4;
                    }
                    segment.cleanElement$kotlinx_coroutines_core(index);
                    if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                        state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                    }
                    if (tryResumeReceiver(state$kotlinx_coroutines_core, element)) {
                        segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.DONE_RCV);
                        onReceiveDequeued();
                        return 0;
                    }
                    if (segment.getAndSetState$kotlinx_coroutines_core(index, BufferedChannelKt.INTERRUPTED_RCV) != BufferedChannelKt.INTERRUPTED_RCV) {
                        segment.onCancelledRequest(index, true);
                    }
                    return 5;
                }
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            }
        }
    }

    private final void updateReceiversCounterIfLower(long value) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= value) {
                return;
            }
            long j12 = value;
            if (receivers$volatile$FU.compareAndSet(this, j11, j12)) {
                return;
            } else {
                value = j12;
            }
        }
    }

    private final void updateSendersCounterIfLower(long value) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 >= value) {
                return;
            }
        } while (!sendersAndCloseStatus$volatile$FU.compareAndSet(this, j11, BufferedChannelKt.constructSendersAndCloseStatus(j12, (int) (j11 >> 60))));
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(Throwable cause) {
        return cancelImpl$kotlinx_coroutines_core(cause);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(Throwable cause) {
        if (cause == null) {
            cause = new CancellationException("Channel was cancelled");
        }
        return closeOrCancelImpl(cause, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void checkSegmentStructureInvariants() {
        if (isRendezvousOrUnlimited()) {
            if (bufferEndSegment$volatile$FU.get(this) != BufferedChannelKt.NULL_SEGMENT) {
                throw new IllegalStateException(("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: " + this).toString());
            }
        } else if (((ChannelSegment) receiveSegment$volatile$FU.get(this)).id > ((ChannelSegment) bufferEndSegment$volatile$FU.get(this)).id) {
            throw new IllegalStateException(("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: " + this).toString());
        }
        List listP = v.p(receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (((ChannelSegment) obj) != BufferedChannelKt.NULL_SEGMENT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j11 = ((ChannelSegment) next).id;
            do {
                Object next2 = it.next();
                long j12 = ((ChannelSegment) next2).id;
                if (j11 > j12) {
                    next = next2;
                    j11 = j12;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        if (channelSegment.getPrev() != 0) {
            throw new IllegalStateException(("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: " + this).toString());
        }
        while (channelSegment.getNext() != 0) {
            S next3 = channelSegment.getNext();
            s.h(next3);
            if (((ChannelSegment) next3).getPrev() != 0) {
                S next4 = channelSegment.getNext();
                s.h(next4);
                if (((ChannelSegment) next4).getPrev() != channelSegment) {
                    throw new IllegalStateException(("The `segment.next.prev === segment` invariant is violated.\nChannel state: " + this).toString());
                }
            }
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i13);
                if (!s.f(state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED) && !(state$kotlinx_coroutines_core instanceof Waiter)) {
                    if (s.f(state$kotlinx_coroutines_core, BufferedChannelKt.INTERRUPTED_RCV) || s.f(state$kotlinx_coroutines_core, BufferedChannelKt.INTERRUPTED_SEND) || s.f(state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                        if (channelSegment.getElement$kotlinx_coroutines_core(i13) != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        i12++;
                    } else {
                        if (!s.f(state$kotlinx_coroutines_core, BufferedChannelKt.POISONED) && !s.f(state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
                            throw new IllegalStateException(("Unexpected segment cell state: " + state$kotlinx_coroutines_core + ".\nChannel state: " + this).toString());
                        }
                        if (channelSegment.getElement$kotlinx_coroutines_core(i13) != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                }
            }
            if (i12 == BufferedChannelKt.SEGMENT_SIZE && channelSegment != receiveSegment$volatile$FU.get(this) && channelSegment != sendSegment$volatile$FU.get(this) && channelSegment != bufferEndSegment$volatile$FU.get(this)) {
                throw new IllegalStateException(("Logically removed segment is reachable.\nChannel state: " + this).toString());
            }
            S next5 = channelSegment.getNext();
            s.h(next5);
            channelSegment = (ChannelSegment) next5;
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable cause) {
        return closeOrCancelImpl(cause, false);
    }

    protected boolean closeOrCancelImpl(Throwable cause, boolean cancel) {
        if (cancel) {
            markCancellationStarted();
        }
        boolean zA = androidx.concurrent.futures.b.a(_closeCause$volatile$FU, this, BufferedChannelKt.NO_CLOSE_CAUSE, cause);
        if (cancel) {
            markCancelled();
        } else {
            markClosed();
        }
        completeCloseOrCancel();
        onClosedIdempotent();
        if (zA) {
            invokeCloseHandler();
        }
        return zA;
    }

    protected final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long globalCellIndex) {
        ChannelSegment<E> channelSegmentFindSegmentReceive;
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        ChannelSegment<E> channelSegment = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        while (true) {
            long j11 = receivers$volatile$FU.get(this);
            if (globalCellIndex < Math.max(((long) this.capacity) + j11, getBufferEndCounter())) {
                return;
            }
            if (receivers$volatile$FU.compareAndSet(this, j11, 1 + j11)) {
                int i11 = BufferedChannelKt.SEGMENT_SIZE;
                long j12 = j11 / ((long) i11);
                int i12 = (int) (j11 % ((long) i11));
                if (channelSegment.id != j12) {
                    channelSegmentFindSegmentReceive = findSegmentReceive(j12, channelSegment);
                    if (channelSegmentFindSegmentReceive == null) {
                        continue;
                    }
                } else {
                    channelSegmentFindSegmentReceive = channelSegment;
                }
                Object objUpdateCellReceive = updateCellReceive(channelSegmentFindSegmentReceive, i12, j11, null);
                if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                    channelSegmentFindSegmentReceive.cleanPrev();
                    l<E, h0> lVar = this.onUndeliveredElement;
                    if (lVar != null && (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lVar, objUpdateCellReceive, null, 2, null)) != null) {
                        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
                    }
                } else if (j11 < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegmentFindSegmentReceive.cleanPrev();
                }
                channelSegment = channelSegmentFindSegmentReceive;
            }
        }
    }

    protected final Throwable getCloseCause() {
        return (Throwable) _closeCause$volatile$FU.get(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceive() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        s.i(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        q qVar = (q) u0.g(bufferedChannel$onReceive$1, 3);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        s.i(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause1Impl(this, qVar, (q) u0.g(bufferedChannel$onReceive$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<ChannelResult<E>> getOnReceiveCatching() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        s.i(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        q qVar = (q) u0.g(bufferedChannel$onReceiveCatching$1, 3);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        s.i(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause1Impl(this, qVar, (q) u0.g(bufferedChannel$onReceiveCatching$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceiveOrNull() {
        BufferedChannel$onReceiveOrNull$1 bufferedChannel$onReceiveOrNull$1 = BufferedChannel$onReceiveOrNull$1.INSTANCE;
        s.i(bufferedChannel$onReceiveOrNull$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        q qVar = (q) u0.g(bufferedChannel$onReceiveOrNull$1, 3);
        BufferedChannel$onReceiveOrNull$2 bufferedChannel$onReceiveOrNull$2 = BufferedChannel$onReceiveOrNull$2.INSTANCE;
        s.i(bufferedChannel$onReceiveOrNull$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause1Impl(this, qVar, (q) u0.g(bufferedChannel$onReceiveOrNull$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, BufferedChannel<E>> getOnSend() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.INSTANCE;
        s.i(bufferedChannel$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        q qVar = (q) u0.g(bufferedChannel$onSend$1, 3);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.INSTANCE;
        s.i(bufferedChannel$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause2Impl(this, qVar, (q) u0.g(bufferedChannel$onSend$2, 3), null, 8, null);
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return receivers$volatile$FU.get(this);
    }

    protected final Throwable getSendException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedSendChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L;
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            ChannelSegment<E> channelSegmentFindSegmentReceive = (ChannelSegment) receiveSegment$volatile$FU.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j11 = receiversCounter$kotlinx_coroutines_core / ((long) i11);
            if (channelSegmentFindSegmentReceive.id == j11 || (channelSegmentFindSegmentReceive = findSegmentReceive(j11, channelSegmentFindSegmentReceive)) != null) {
                channelSegmentFindSegmentReceive.cleanPrev();
                if (isCellNonEmpty(channelSegmentFindSegmentReceive, (int) (receiversCounter$kotlinx_coroutines_core % ((long) i11)), receiversCounter$kotlinx_coroutines_core)) {
                    return true;
                }
                receivers$volatile$FU.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, 1 + receiversCounter$kotlinx_coroutines_core);
            } else if (((ChannelSegment) receiveSegment$volatile$FU.get(this)).id < j11) {
                return false;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: invokeOnClose */
    public void mo586invokeOnClose(l<? super Throwable, h0> handler) {
        if (androidx.concurrent.futures.b.a(closeHandler$volatile$FU, this, null, handler)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$volatile$FU;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != BufferedChannelKt.CLOSE_HANDLER_CLOSED) {
                if (obj == BufferedChannelKt.CLOSE_HANDLER_INVOKED) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(closeHandler$volatile$FU, this, BufferedChannelKt.CLOSE_HANDLER_CLOSED, BufferedChannelKt.CLOSE_HANDLER_INVOKED));
        handler.invoke(getCloseCause());
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return isClosedForReceive0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return isClosedForSend0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    protected boolean isConflatedDropOldest() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        if (isClosedForReceive() || hasElements$kotlinx_coroutines_core()) {
            return false;
        }
        return !isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return new BufferedChannelIterator();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @jn0.e
    public boolean offer(E e11) {
        return Channel.DefaultImpls.offer(this, e11);
    }

    protected void onClosedIdempotent() {
    }

    protected void onReceiveDequeued() {
    }

    protected void onReceiveEnqueued() {
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @jn0.e
    public E poll() {
        return (E) Channel.DefaultImpls.poll(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(Continuation<? super E> continuation) {
        return receive$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public Object mo522receiveCatchingJP2dKIU(Continuation<? super ChannelResult<? extends E>> continuation) {
        return m520receiveCatchingJP2dKIU$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @jn0.e
    public Object receiveOrNull(Continuation<? super E> continuation) {
        return Channel.DefaultImpls.receiveOrNull(this, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void registerSelectForSend(SelectInstance<?> select, Object element) {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j11 = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j12 = j11 / ((long) i11);
            int i12 = (int) (j11 % ((long) i11));
            if (channelSegment2.id != j12) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j12, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    onClosedSelectOnSend(element, select);
                    return;
                }
            } else {
                channelSegment = channelSegment2;
            }
            SelectInstance<?> selectInstance = select;
            Object obj = element;
            int iUpdateCellSend = updateCellSend(channelSegment, i12, obj, j11, selectInstance, zIsClosedForSend0);
            channelSegment2 = channelSegment;
            if (iUpdateCellSend == 0) {
                channelSegment2.cleanPrev();
                selectInstance.selectInRegistrationPhase(h0.f84049a);
                return;
            }
            if (iUpdateCellSend == 1) {
                selectInstance.selectInRegistrationPhase(h0.f84049a);
                return;
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment2.onSlotCleaned();
                    onClosedSelectOnSend(obj, selectInstance);
                    return;
                } else {
                    Waiter waiter = selectInstance instanceof Waiter ? (Waiter) selectInstance : null;
                    if (waiter != null) {
                        prepareSenderForSuspension(waiter, channelSegment2, i12);
                        return;
                    }
                    return;
                }
            }
            if (iUpdateCellSend == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iUpdateCellSend == 4) {
                if (j11 < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                onClosedSelectOnSend(obj, selectInstance);
                return;
            } else {
                if (iUpdateCellSend == 5) {
                    channelSegment2.cleanPrev();
                }
                element = obj;
                select = selectInstance;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e11, Continuation<? super h0> continuation) {
        return send$suspendImpl(this, e11, continuation);
    }

    public Object sendBroadcast$kotlinx_coroutines_core(E e11, Continuation<? super Boolean> continuation) {
        return sendBroadcast$suspendImpl(this, e11, continuation);
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return shouldSendSuspend(sendersAndCloseStatus$volatile$FU.get(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i11 = (int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60);
        if (i11 == 2) {
            sb2.append("closed,");
        } else if (i11 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.capacity + CoreConstants.COMMA_CHAR);
        sb2.append("data=[");
        int i12 = 0;
        boolean z11 = true;
        List listP = v.p(receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (((ChannelSegment) obj) != BufferedChannelKt.NULL_SEGMENT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j11 = ((ChannelSegment) next).id;
            do {
                Object next2 = it.next();
                long j12 = ((ChannelSegment) next2).id;
                if (j11 > j12) {
                    next = next2;
                    j11 = j12;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
        long sendersCounter$kotlinx_coroutines_core = getSendersCounter$kotlinx_coroutines_core();
        loop2: while (true) {
            int i13 = BufferedChannelKt.SEGMENT_SIZE;
            int i14 = i12;
            while (i14 < i13) {
                long j13 = (channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i14);
                if (j13 >= sendersCounter$kotlinx_coroutines_core && j13 >= receiversCounter$kotlinx_coroutines_core) {
                    break loop2;
                }
                Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i14);
                Object element$kotlinx_coroutines_core = channelSegment.getElement$kotlinx_coroutines_core(i14);
                boolean z12 = z11;
                if (state$kotlinx_coroutines_core instanceof CancellableContinuation) {
                    string = (j13 >= receiversCounter$kotlinx_coroutines_core || j13 < sendersCounter$kotlinx_coroutines_core) ? (j13 >= sendersCounter$kotlinx_coroutines_core || j13 < receiversCounter$kotlinx_coroutines_core) ? "cont" : "send" : "receive";
                } else if (state$kotlinx_coroutines_core instanceof SelectInstance) {
                    string = (j13 >= receiversCounter$kotlinx_coroutines_core || j13 < sendersCounter$kotlinx_coroutines_core) ? (j13 >= sendersCounter$kotlinx_coroutines_core || j13 < receiversCounter$kotlinx_coroutines_core) ? "select" : "onSend" : "onReceive";
                } else if (state$kotlinx_coroutines_core instanceof ReceiveCatching) {
                    string = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof SendBroadcast) {
                    string = "sendBroadcast";
                } else if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                    string = "EB(" + state$kotlinx_coroutines_core + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                } else if (s.f(state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_RCV) || s.f(state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
                    string = "resuming_sender";
                } else {
                    if (state$kotlinx_coroutines_core != null && !s.f(state$kotlinx_coroutines_core, BufferedChannelKt.IN_BUFFER) && !s.f(state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV) && !s.f(state$kotlinx_coroutines_core, BufferedChannelKt.POISONED) && !s.f(state$kotlinx_coroutines_core, BufferedChannelKt.INTERRUPTED_RCV) && !s.f(state$kotlinx_coroutines_core, BufferedChannelKt.INTERRUPTED_SEND) && !s.f(state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                        string = state$kotlinx_coroutines_core.toString();
                    }
                    i14++;
                    z11 = z12;
                }
                if (element$kotlinx_coroutines_core != null) {
                    sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR + string + CoreConstants.COMMA_CHAR + element$kotlinx_coroutines_core + "),");
                } else {
                    sb2.append(string + CoreConstants.COMMA_CHAR);
                }
                i14++;
                z11 = z12;
            }
            boolean z13 = z11;
            channelSegment = (ChannelSegment) channelSegment.getNext();
            if (channelSegment == null) {
                break;
            }
            z11 = z13;
            i12 = 0;
        }
        if (p013kotlin.text.t.Q1(sb2) == ',') {
            s.j(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toStringDebug$kotlinx_coroutines_core() {
        String strValueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("S=" + getSendersCounter$kotlinx_coroutines_core() + ",R=" + getReceiversCounter$kotlinx_coroutines_core() + ",B=" + getBufferEndCounter() + ",B'=" + completedExpandBuffersAndPauseFlag$volatile$FU.get(this) + ",C=" + ((int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60)) + CoreConstants.COMMA_CHAR);
        int i11 = (int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60);
        if (i11 == 1) {
            sb2.append("CANCELLATION_STARTED,");
        } else if (i11 == 2) {
            sb2.append("CLOSED,");
        } else if (i11 == 3) {
            sb2.append("CANCELLED,");
        }
        sb2.append("SEND_SEGM=" + DebugStringsKt.getHexAddress(sendSegment$volatile$FU.get(this)) + ",RCV_SEGM=" + DebugStringsKt.getHexAddress(receiveSegment$volatile$FU.get(this)));
        if (!isRendezvousOrUnlimited()) {
            sb2.append(",EB_SEGM=" + DebugStringsKt.getHexAddress(bufferEndSegment$volatile$FU.get(this)));
        }
        sb2.append("  ");
        List listP = v.p(receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (((ChannelSegment) obj) != BufferedChannelKt.NULL_SEGMENT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j11 = ((ChannelSegment) next).id;
            do {
                Object next2 = it.next();
                long j12 = ((ChannelSegment) next2).id;
                if (j11 > j12) {
                    next = next2;
                    j11 = j12;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        do {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(DebugStringsKt.getHexAddress(channelSegment));
            sb3.append("=[");
            sb3.append(channelSegment.isRemoved() ? Marker.ANY_MARKER : "");
            sb3.append(channelSegment.id);
            sb3.append(",prev=");
            ChannelSegment channelSegment2 = (ChannelSegment) channelSegment.getPrev();
            sb3.append(channelSegment2 != null ? DebugStringsKt.getHexAddress(channelSegment2) : null);
            sb3.append(CoreConstants.COMMA_CHAR);
            sb2.append(sb3.toString());
            int i12 = BufferedChannelKt.SEGMENT_SIZE;
            for (int i13 = 0; i13 < i12; i13++) {
                Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i13);
                Object element$kotlinx_coroutines_core = channelSegment.getElement$kotlinx_coroutines_core(i13);
                if (state$kotlinx_coroutines_core instanceof CancellableContinuation) {
                    strValueOf = "cont";
                } else if (state$kotlinx_coroutines_core instanceof SelectInstance) {
                    strValueOf = "select";
                } else if (state$kotlinx_coroutines_core instanceof ReceiveCatching) {
                    strValueOf = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof SendBroadcast) {
                    strValueOf = "send(broadcast)";
                } else if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                    strValueOf = "EB(" + state$kotlinx_coroutines_core + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                } else {
                    strValueOf = String.valueOf(state$kotlinx_coroutines_core);
                }
                sb2.append('[' + i13 + "]=(" + strValueOf + CoreConstants.COMMA_CHAR + element$kotlinx_coroutines_core + "),");
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("next=");
            ChannelSegment channelSegment3 = (ChannelSegment) channelSegment.getNext();
            sb4.append(channelSegment3 != null ? DebugStringsKt.getHexAddress(channelSegment3) : null);
            sb4.append("]  ");
            sb2.append(sb4.toString());
            channelSegment = (ChannelSegment) channelSegment.getNext();
        } while (channelSegment != null);
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public Object mo523tryReceivePtdJZtk() {
        ChannelSegment channelSegmentFindSegmentReceive;
        long j11 = receivers$volatile$FU.get(this);
        long j12 = sendersAndCloseStatus$volatile$FU.get(this);
        if (isClosedForReceive0(j12)) {
            return ChannelResult.INSTANCE.m543closedJP2dKIU(getCloseCause());
        }
        if (j11 >= (j12 & 1152921504606846975L)) {
            return ChannelResult.INSTANCE.m544failurePtdJZtk();
        }
        Object obj = BufferedChannelKt.INTERRUPTED_RCV;
        ChannelSegment channelSegment = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j13 = andIncrement / ((long) i11);
            int i12 = (int) (andIncrement % ((long) i11));
            if (channelSegment.id != j13) {
                channelSegmentFindSegmentReceive = findSegmentReceive(j13, channelSegment);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                }
            } else {
                channelSegmentFindSegmentReceive = channelSegment;
            }
            Object objUpdateCellReceive = updateCellReceive(channelSegmentFindSegmentReceive, i12, andIncrement, obj);
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegmentFindSegmentReceive, i12);
                }
                waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                channelSegmentFindSegmentReceive.onSlotCleaned();
                return ChannelResult.INSTANCE.m544failurePtdJZtk();
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    throw new IllegalStateException("unexpected");
                }
                channelSegmentFindSegmentReceive.cleanPrev();
                return ChannelResult.INSTANCE.m545successJP2dKIU(objUpdateCellReceive);
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegmentFindSegmentReceive.cleanPrev();
            }
            channelSegment = channelSegmentFindSegmentReceive;
        }
        return ChannelResult.INSTANCE.m543closedJP2dKIU(getCloseCause());
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo85trySendJP2dKIU(E element) {
        ChannelSegment channelSegment;
        if (shouldSendSuspend(sendersAndCloseStatus$volatile$FU.get(this))) {
            return ChannelResult.INSTANCE.m544failurePtdJZtk();
        }
        Object obj = BufferedChannelKt.INTERRUPTED_SEND;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j11 = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j12 = j11 / ((long) i11);
            int i12 = (int) (j11 % ((long) i11));
            if (channelSegment2.id != j12) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j12, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return ChannelResult.INSTANCE.m543closedJP2dKIU(getSendException());
                }
            } else {
                channelSegment = channelSegment2;
            }
            int iUpdateCellSend = updateCellSend(channelSegment, i12, element, j11, obj, zIsClosedForSend0);
            channelSegment2 = channelSegment;
            if (iUpdateCellSend == 0) {
                channelSegment2.cleanPrev();
                return ChannelResult.INSTANCE.m545successJP2dKIU(h0.f84049a);
            }
            if (iUpdateCellSend == 1) {
                return ChannelResult.INSTANCE.m545successJP2dKIU(h0.f84049a);
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment2.onSlotCleaned();
                    return ChannelResult.INSTANCE.m543closedJP2dKIU(getSendException());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment2, i12);
                }
                channelSegment2.onSlotCleaned();
                return ChannelResult.INSTANCE.m544failurePtdJZtk();
            }
            if (iUpdateCellSend == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iUpdateCellSend == 4) {
                if (j11 < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                return ChannelResult.INSTANCE.m543closedJP2dKIU(getSendException());
            }
            if (iUpdateCellSend == 5) {
                channelSegment2.cleanPrev();
            }
            element = element;
        }
    }

    /* JADX INFO: renamed from: trySendDropOldest-JP2dKIU, reason: not valid java name */
    protected final Object m524trySendDropOldestJP2dKIU(E element) {
        ChannelSegment channelSegmentFindSegmentSend;
        Object obj = BufferedChannelKt.BUFFERED;
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j11 = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i11 = BufferedChannelKt.SEGMENT_SIZE;
            long j12 = j11 / ((long) i11);
            int i12 = (int) (j11 % ((long) i11));
            if (channelSegment.id != j12) {
                channelSegmentFindSegmentSend = findSegmentSend(j12, channelSegment);
                if (channelSegmentFindSegmentSend == null) {
                    if (zIsClosedForSend0) {
                        return ChannelResult.INSTANCE.m543closedJP2dKIU(getSendException());
                    }
                }
            } else {
                channelSegmentFindSegmentSend = channelSegment;
            }
            E e11 = element;
            int iUpdateCellSend = updateCellSend(channelSegmentFindSegmentSend, i12, e11, j11, obj, zIsClosedForSend0);
            channelSegment = channelSegmentFindSegmentSend;
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return ChannelResult.INSTANCE.m545successJP2dKIU(h0.f84049a);
            }
            if (iUpdateCellSend == 1) {
                return ChannelResult.INSTANCE.m545successJP2dKIU(h0.f84049a);
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return ChannelResult.INSTANCE.m543closedJP2dKIU(getSendException());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i12);
                }
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((channelSegment.id * ((long) i11)) + ((long) i12));
                return ChannelResult.INSTANCE.m545successJP2dKIU(h0.f84049a);
            }
            if (iUpdateCellSend == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iUpdateCellSend == 4) {
                if (j11 < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return ChannelResult.INSTANCE.m543closedJP2dKIU(getSendException());
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            element = e11;
        }
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long globalIndex) {
        BufferedChannel<E> bufferedChannel = this;
        if (bufferedChannel.isRendezvousOrUnlimited()) {
            return;
        }
        while (bufferedChannel.getBufferEndCounter() <= globalIndex) {
            bufferedChannel = this;
        }
        int i11 = BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS;
        for (int i12 = 0; i12 < i11; i12++) {
            long bufferEndCounter = bufferedChannel.getBufferEndCounter();
            if (bufferEndCounter == (4611686018427387903L & completedExpandBuffersAndPauseFlag$volatile$FU.get(bufferedChannel)) && bufferEndCounter == bufferedChannel.getBufferEndCounter()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$volatile$FU;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(bufferedChannel);
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j11, BufferedChannelKt.constructEBCompletedAndPauseFlag(j11 & 4611686018427387903L, true))) {
                break;
            } else {
                bufferedChannel = this;
            }
        }
        while (true) {
            long bufferEndCounter2 = bufferedChannel.getBufferEndCounter();
            long j12 = completedExpandBuffersAndPauseFlag$volatile$FU.get(bufferedChannel);
            long j13 = j12 & 4611686018427387903L;
            boolean z11 = (4611686018427387904L & j12) != 0;
            if (bufferEndCounter2 == j13 && bufferEndCounter2 == bufferedChannel.getBufferEndCounter()) {
                break;
            }
            if (z11) {
                bufferedChannel = this;
            } else {
                bufferedChannel = this;
                completedExpandBuffersAndPauseFlag$volatile$FU.compareAndSet(bufferedChannel, j12, BufferedChannelKt.constructEBCompletedAndPauseFlag(j13, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = completedExpandBuffersAndPauseFlag$volatile$FU;
        while (true) {
            long j14 = atomicLongFieldUpdater2.get(bufferedChannel);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j14, BufferedChannelKt.constructEBCompletedAndPauseFlag(j14 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            bufferedChannel = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final co0.h<h0> bindCancellationFun(l<? super E, h0> lVar) {
        return new AnonymousClass2(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
        cancelImpl$kotlinx_coroutines_core(null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(CancellationException cause) {
        cancelImpl$kotlinx_coroutines_core(cause);
    }

    public /* synthetic */ BufferedChannel(int i11, l lVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : lVar);
    }
}
