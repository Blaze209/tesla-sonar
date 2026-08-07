package u6;

import androidx.datastore.core.CorruptionException;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC4419g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u00136Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00120\b\u0002\u0010\u000b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00060\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0013\u001a\u00028\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001d\u0010\u001cJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b \u0010!J\u001e\u0010$\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0082@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tH\u0082@¢\u0006\u0004\b&\u0010\u001cJ\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b(\u0010\u001cJ<\u0010+\u001a\u00028\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00062\u0006\u0010*\u001a\u00020)H\u0082@¢\u0006\u0004\b+\u0010,J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010-\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b/\u0010!JI\u00103\u001a\u00028\u0001\"\u0004\b\u0001\u001002\u0006\u0010-\u001a\u00020\u00162\u001c\u00102\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\n01H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010R\u001a\f0OR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR \u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000T0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010V\u001a\u0004\bZ\u0010[R \u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R!\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00000T8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\ba\u0010b*\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lu6/j;", "T", "Lu6/h;", "Lu6/i0;", PlaceTypes.STORAGE, "", "Lkotlin/Function2;", "Lu6/r;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "initTasksList", "Lu6/d;", "corruptionHandler", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Lu6/i0;Ljava/util/List;Lu6/d;Lkotlinx/coroutines/CoroutineScope;)V", "transform", "a", "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newData", "", "updateCache", "", "B", "(Ljava/lang/Object;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "requireLock", "Lu6/h0;", "z", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lu6/v$a;", "update", "t", "(Lu6/v$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v", "w", "x", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "A", "(Lwn0/p;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasWriteFileLock", "Lu6/e;", "y", "R", "Lkotlin/Function1;", "block", "q", "(ZLwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lu6/i0;", "b", "Lu6/d;", "c", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/Flow;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "data", "Lkotlinx/coroutines/sync/Mutex;", "e", "Lkotlinx/coroutines/sync/Mutex;", "collectorMutex", "f", "I", "collectorCounter", "Lkotlinx/coroutines/Job;", "g", "Lkotlinx/coroutines/Job;", "collectorJob", "Lu6/k;", "h", "Lu6/k;", "inMemoryCache", "Lu6/j$b;", IntegerTokenConverter.CONVERTER_KEY, "Lu6/j$b;", "readAndInit", "Lkotlin/Lazy;", "Lu6/j0;", "j", "Lkotlin/Lazy;", "storageConnectionDelegate", "Lu6/s;", "k", "r", "()Lu6/s;", "coordinator", "Lu6/f0;", "l", "Lu6/f0;", "writeActor", "s", "()Lu6/j0;", "getStorageConnection$datastore_core_release$delegate", "(Lu6/j;)Ljava/lang/Object;", "storageConnection", "m", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j<T> implements u6.h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i0<T> storage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u6.d<T> corruptionHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Flow<T> data;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Mutex collectorMutex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int collectorCounter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Job collectorJob;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final u6.k<T> inMemoryCache;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final j<T>.b readAndInit;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy<j0<T>> storageConnectionDelegate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy coordinator;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final f0<u6.v.a<T>> writeActor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B7\u0012.\u0010\b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0094@¢\u0006\u0004\b\u000b\u0010\fR@\u0010\u000f\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lu6/j$b;", "Lu6/c0;", "", "Lkotlin/Function2;", "Lu6/r;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "initTasksList", "<init>", "(Lu6/j;Ljava/util/List;)V", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "Ljava/util/List;", "initTasks", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b extends c0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private List<? extends wn0.p<? super u6.r<T>, ? super Continuation<? super jn0.h0>, ? extends Object>> initTasks;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j<T> f115508d;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", i = {0, 1}, l = {430, 434}, m = "doRun", n = {"this", "this"}, s = {"L$0", "L$0"})
        static final class a extends ContinuationImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f115509n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f115510o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ j<T>.b f115511p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f115512q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j<T>.b bVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f115511p = bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f115510o = obj;
                this.f115512q |= Integer.MIN_VALUE;
                return this.f115511p.b(this);
            }
        }

        /* JADX INFO: renamed from: u6.j$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lu6/e;", "<anonymous>", "()Lu6/e;"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {437, 458, 546, 468}, m = "invokeSuspend", n = {"updateLock", "initializationComplete", "currentData", "updateLock", "initializationComplete", "currentData", "api", "initializationComplete", "currentData", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
        static final class C2478b extends SuspendLambda implements wn0.l<Continuation<? super u6.e<T>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f115513n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f115514o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f115515p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f115516q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f115517r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f115518s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f115519t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ j<T> f115520u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ j<T>.b f115521v;

            /* JADX INFO: renamed from: u6.j$b$b$a */
            @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J4\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"u6/j$b$b$a", "Lu6/r;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "transform", "a", "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class a implements u6.r<T> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Mutex f115522a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ p013kotlin.jvm.internal.j0 f115523b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ p013kotlin.jvm.internal.n0<T> f115524c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ j<T> f115525d;

                /* JADX INFO: renamed from: u6.j$b$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", i = {0, 0, 1, 2, 2}, l = {544, 447, 449}, m = "updateData", n = {"transform", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "newData"}, s = {"L$0", "L$1", "L$0", "L$0", "L$2"})
                static final class C2479a extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    Object f115526n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    Object f115527o;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    Object f115528p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    Object f115529q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    Object f115530r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    /* synthetic */ Object f115531s;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    int f115533u;

                    C2479a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f115531s = obj;
                        this.f115533u |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                a(Mutex mutex, p013kotlin.jvm.internal.j0 j0Var, p013kotlin.jvm.internal.n0<T> n0Var, j<T> jVar) {
                    this.f115522a = mutex;
                    this.f115523b = j0Var;
                    this.f115524c = n0Var;
                    this.f115525d = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
                /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // u6.r
                public Object a(wn0.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) throws Throwable {
                    C2479a c2479a;
                    Mutex mutex;
                    j jVar;
                    p013kotlin.jvm.internal.j0 j0Var;
                    p013kotlin.jvm.internal.n0<T> n0Var;
                    Mutex mutex2;
                    Mutex mutex3;
                    j jVar2;
                    T t11;
                    p013kotlin.jvm.internal.n0<T> n0Var2;
                    if (continuation instanceof C2479a) {
                        c2479a = (C2479a) continuation;
                        int i11 = c2479a.f115533u;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            c2479a.f115533u = i11 - Integer.MIN_VALUE;
                        } else {
                            c2479a = new C2479a(continuation);
                        }
                    } else {
                        c2479a = new C2479a(continuation);
                    }
                    Object obj = c2479a.f115531s;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = c2479a.f115533u;
                    try {
                        if (i12 == 0) {
                            jn0.t.b(obj);
                            mutex = this.f115522a;
                            p013kotlin.jvm.internal.j0 j0Var2 = this.f115523b;
                            p013kotlin.jvm.internal.n0<T> n0Var3 = this.f115524c;
                            jVar = this.f115525d;
                            c2479a.f115526n = pVar;
                            c2479a.f115527o = mutex;
                            c2479a.f115528p = j0Var2;
                            c2479a.f115529q = n0Var3;
                            c2479a.f115530r = jVar;
                            c2479a.f115533u = 1;
                            if (mutex.lock(null, c2479a) != coroutine_suspended) {
                                j0Var = j0Var2;
                                n0Var = n0Var3;
                            }
                            return coroutine_suspended;
                        }
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                t11 = (T) c2479a.f115528p;
                                n0Var2 = (p013kotlin.jvm.internal.n0) c2479a.f115527o;
                                mutex2 = (Mutex) c2479a.f115526n;
                                try {
                                    jn0.t.b(obj);
                                    n0Var2.f86529a = t11;
                                    n0Var = n0Var2;
                                    T t12 = n0Var.f86529a;
                                    mutex2.unlock(null);
                                    return t12;
                                } catch (Throwable th2) {
                                    th = th2;
                                    mutex2.unlock(null);
                                    throw th;
                                }
                            }
                            j jVar3 = (j) c2479a.f115528p;
                            n0Var = (p013kotlin.jvm.internal.n0) c2479a.f115527o;
                            mutex3 = (Mutex) c2479a.f115526n;
                            try {
                                jn0.t.b(obj);
                                jVar2 = jVar3;
                                if (!p013kotlin.jvm.internal.s.f(obj, n0Var.f86529a)) {
                                    c2479a.f115526n = mutex3;
                                    c2479a.f115527o = n0Var;
                                    c2479a.f115528p = obj;
                                    c2479a.f115533u = 3;
                                    if (jVar2.B(obj, false, c2479a) != coroutine_suspended) {
                                        t11 = (T) obj;
                                        n0Var2 = n0Var;
                                        mutex2 = mutex3;
                                        n0Var2.f86529a = t11;
                                        n0Var = n0Var2;
                                    }
                                    return coroutine_suspended;
                                }
                                mutex2 = mutex3;
                                T t13 = n0Var.f86529a;
                                mutex2.unlock(null);
                                return t13;
                            } catch (Throwable th3) {
                                th = th3;
                                mutex2 = mutex3;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        j jVar4 = (j) c2479a.f115530r;
                        n0Var = (p013kotlin.jvm.internal.n0) c2479a.f115529q;
                        j0Var = (p013kotlin.jvm.internal.j0) c2479a.f115528p;
                        Mutex mutex4 = (Mutex) c2479a.f115527o;
                        wn0.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar2 = (wn0.p) c2479a.f115526n;
                        jn0.t.b(obj);
                        jVar = jVar4;
                        pVar = pVar2;
                        mutex = mutex4;
                        if (j0Var.f86523a) {
                            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                        }
                        T t14 = n0Var.f86529a;
                        c2479a.f115526n = mutex;
                        c2479a.f115527o = n0Var;
                        c2479a.f115528p = jVar;
                        c2479a.f115529q = null;
                        c2479a.f115530r = null;
                        c2479a.f115533u = 2;
                        Object objInvoke = pVar.invoke(t14, c2479a);
                        if (objInvoke != coroutine_suspended) {
                            mutex3 = mutex;
                            obj = objInvoke;
                            jVar2 = jVar;
                            if (!p013kotlin.jvm.internal.s.f(obj, n0Var.f86529a)) {
                                c2479a.f115526n = mutex3;
                                c2479a.f115527o = n0Var;
                                c2479a.f115528p = obj;
                                c2479a.f115533u = 3;
                                if (jVar2.B(obj, false, c2479a) != coroutine_suspended) {
                                    t11 = (T) obj;
                                    n0Var2 = n0Var;
                                    mutex2 = mutex3;
                                    n0Var2.f86529a = t11;
                                    n0Var = n0Var2;
                                }
                            } else {
                                mutex2 = mutex3;
                            }
                            T t15 = n0Var.f86529a;
                            mutex2.unlock(null);
                            return t15;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th4) {
                        th = th4;
                        mutex2 = mutex;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2478b(j<T> jVar, j<T>.b bVar, Continuation<? super C2478b> continuation) {
                super(1, continuation);
                this.f115520u = jVar;
                this.f115521v = bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Continuation<?> continuation) {
                return new C2478b(this.f115520u, this.f115521v, continuation);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
            /* JADX WARN: Code duplicated, block: B:39:0x010f  */
            /* JADX WARN: Code duplicated, block: B:48:0x010e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x00ab->B:50:?, LOOP_END, SYNTHETIC] */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws CorruptionException {
                Mutex mutexMutex$default;
                p013kotlin.jvm.internal.j0 j0Var;
                p013kotlin.jvm.internal.n0 n0Var;
                p013kotlin.jvm.internal.n0 n0Var2;
                p013kotlin.jvm.internal.j0 j0Var2;
                Mutex mutex;
                Iterator<T> it;
                Mutex mutex2;
                p013kotlin.jvm.internal.j0 j0Var3;
                p013kotlin.jvm.internal.n0 n0Var3;
                a aVar;
                p013kotlin.jvm.internal.n0 n0Var4;
                wn0.p pVar;
                Object obj2;
                int iHashCode;
                int i11;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f115519t;
                if (i12 == 0) {
                    jn0.t.b(obj);
                    mutexMutex$default = MutexKt.Mutex$default(false, 1, null);
                    j0Var = new p013kotlin.jvm.internal.j0();
                    n0Var = new p013kotlin.jvm.internal.n0();
                    j<T> jVar = this.f115520u;
                    this.f115513n = mutexMutex$default;
                    this.f115514o = j0Var;
                    this.f115515p = n0Var;
                    this.f115516q = n0Var;
                    this.f115519t = 1;
                    obj = jVar.y(true, this);
                    if (obj != coroutine_suspended) {
                        n0Var2 = n0Var;
                    }
                    return coroutine_suspended;
                }
                if (i12 == 1) {
                    n0Var = (p013kotlin.jvm.internal.n0) this.f115516q;
                    n0Var2 = (p013kotlin.jvm.internal.n0) this.f115515p;
                    j0Var = (p013kotlin.jvm.internal.j0) this.f115514o;
                    mutexMutex$default = (Mutex) this.f115513n;
                    jn0.t.b(obj);
                } else {
                    if (i12 == 2) {
                        it = (Iterator) this.f115517r;
                        aVar = (a) this.f115516q;
                        n0Var3 = (p013kotlin.jvm.internal.n0) this.f115515p;
                        j0Var3 = (p013kotlin.jvm.internal.j0) this.f115514o;
                        mutex2 = (Mutex) this.f115513n;
                        jn0.t.b(obj);
                        while (it.hasNext()) {
                            pVar = (wn0.p) it.next();
                            this.f115513n = mutex2;
                            this.f115514o = j0Var3;
                            this.f115515p = n0Var3;
                            this.f115516q = aVar;
                            this.f115517r = it;
                            this.f115519t = 2;
                            if (pVar.invoke(aVar, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        n0Var2 = n0Var3;
                        j0Var2 = j0Var3;
                        mutex = mutex2;
                        ((b) this.f115521v).initTasks = null;
                        this.f115513n = j0Var2;
                        this.f115514o = n0Var2;
                        this.f115515p = mutex;
                        this.f115516q = null;
                        this.f115517r = null;
                        this.f115519t = 3;
                        if (mutex.lock(null, this) != coroutine_suspended) {
                            n0Var4 = n0Var2;
                            j0Var2.f86523a = true;
                            jn0.h0 h0Var = jn0.h0.f84049a;
                            mutex.unlock(null);
                            obj2 = n0Var4.f86529a;
                            if (obj2 != null) {
                            }
                            u6.s sVarR = this.f115520u.r();
                            this.f115513n = obj2;
                            this.f115514o = null;
                            this.f115515p = null;
                            this.f115518s = iHashCode;
                            this.f115519t = 4;
                            obj = sVarR.d(this);
                            if (obj != coroutine_suspended) {
                                i11 = iHashCode;
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i12 == 3) {
                        mutex = (Mutex) this.f115515p;
                        n0Var4 = (p013kotlin.jvm.internal.n0) this.f115514o;
                        j0Var2 = (p013kotlin.jvm.internal.j0) this.f115513n;
                        jn0.t.b(obj);
                        try {
                            j0Var2.f86523a = true;
                            jn0.h0 h0Var2 = jn0.h0.f84049a;
                            mutex.unlock(null);
                            obj2 = n0Var4.f86529a;
                            iHashCode = obj2 != null ? obj2.hashCode() : 0;
                            u6.s sVarR2 = this.f115520u.r();
                            this.f115513n = obj2;
                            this.f115514o = null;
                            this.f115515p = null;
                            this.f115518s = iHashCode;
                            this.f115519t = 4;
                            obj = sVarR2.d(this);
                            if (obj != coroutine_suspended) {
                                i11 = iHashCode;
                            }
                            return coroutine_suspended;
                        } catch (Throwable th2) {
                            mutex.unlock(null);
                            throw th2;
                        }
                    }
                    if (i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = this.f115518s;
                    obj2 = this.f115513n;
                    jn0.t.b(obj);
                }
                return new u6.e(obj2, i11, ((Number) obj).intValue());
                n0Var.f86529a = (T) ((u6.e) obj).c();
                a aVar2 = new a(mutexMutex$default, j0Var, n0Var2, this.f115520u);
                List list = ((b) this.f115521v).initTasks;
                if (list != null) {
                    it = list.iterator();
                    mutex2 = mutexMutex$default;
                    j0Var3 = j0Var;
                    n0Var3 = n0Var2;
                    aVar = aVar2;
                    while (it.hasNext()) {
                        pVar = (wn0.p) it.next();
                        this.f115513n = mutex2;
                        this.f115514o = j0Var3;
                        this.f115515p = n0Var3;
                        this.f115516q = aVar;
                        this.f115517r = it;
                        this.f115519t = 2;
                        if (pVar.invoke(aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    n0Var2 = n0Var3;
                    j0Var2 = j0Var3;
                    mutex = mutex2;
                } else {
                    j0Var2 = j0Var;
                    mutex = mutexMutex$default;
                }
                ((b) this.f115521v).initTasks = null;
                this.f115513n = j0Var2;
                this.f115514o = n0Var2;
                this.f115515p = mutex;
                this.f115516q = null;
                this.f115517r = null;
                this.f115519t = 3;
                if (mutex.lock(null, this) != coroutine_suspended) {
                    n0Var4 = n0Var2;
                    j0Var2.f86523a = true;
                    jn0.h0 h0Var3 = jn0.h0.f84049a;
                    mutex.unlock(null);
                    obj2 = n0Var4.f86529a;
                    if (obj2 != null) {
                    }
                    u6.s sVarR3 = this.f115520u.r();
                    this.f115513n = obj2;
                    this.f115514o = null;
                    this.f115515p = null;
                    this.f115518s = iHashCode;
                    this.f115519t = 4;
                    obj = sVarR3.d(this);
                    if (obj != coroutine_suspended) {
                        i11 = iHashCode;
                        return new u6.e(obj2, i11, ((Number) obj).intValue());
                    }
                }
                return coroutine_suspended;
            }

            @Override // wn0.l
            public final Object invoke(Continuation<? super u6.e<T>> continuation) {
                return ((C2478b) create(continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        public b(j jVar, List<? extends wn0.p<? super u6.r<T>, ? super Continuation<? super jn0.h0>, ? extends Object>> initTasksList) {
            p013kotlin.jvm.internal.s.k(initTasksList, "initTasksList");
            this.f115508d = jVar;
            this.initTasks = p013kotlin.collections.v.m1(initTasksList);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006e  */
        /* JADX WARN: Code duplicated, block: B:29:0x007c  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // u6.c0
        protected Object b(Continuation<? super jn0.h0> continuation) throws CorruptionException {
            a aVar;
            b bVar;
            u6.e eVar;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f115512q;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f115512q = i11 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, continuation);
                }
            } else {
                aVar = new a(this, continuation);
            }
            Object objY = aVar.f115510o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = aVar.f115512q;
            if (i12 == 0) {
                jn0.t.b(objY);
                List<? extends wn0.p<? super u6.r<T>, ? super Continuation<? super jn0.h0>, ? extends Object>> list = this.initTasks;
                if (list != null) {
                    p013kotlin.jvm.internal.s.h(list);
                    if (list.isEmpty()) {
                        j<T> jVar = this.f115508d;
                        aVar.f115509n = this;
                        aVar.f115512q = 1;
                        objY = jVar.y(false, aVar);
                        if (objY != coroutine_suspended) {
                            bVar = this;
                            eVar = (u6.e) objY;
                        }
                    } else {
                        u6.s sVarR = this.f115508d.r();
                        C2478b c2478b = new C2478b(this.f115508d, this, null);
                        aVar.f115509n = this;
                        aVar.f115512q = 2;
                        objY = sVarR.c(c2478b, aVar);
                        if (objY != coroutine_suspended) {
                            bVar = this;
                            eVar = (u6.e) objY;
                        }
                    }
                } else {
                    j<T> jVar2 = this.f115508d;
                    aVar.f115509n = this;
                    aVar.f115512q = 1;
                    objY = jVar2.y(false, aVar);
                    if (objY != coroutine_suspended) {
                        bVar = this;
                        eVar = (u6.e) objY;
                    }
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                bVar = (b) aVar.f115509n;
                jn0.t.b(objY);
                eVar = (u6.e) objY;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (b) aVar.f115509n;
                jn0.t.b(objY);
                eVar = (u6.e) objY;
            }
            ((j) bVar.f115508d).inMemoryCache.c(eVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lu6/s;", "b", "()Lu6/s;"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<u6.s> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j<T> f115534c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j<T> jVar) {
            super(0);
            this.f115534c = jVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u6.s invoke() {
            return this.f115534c.s().getCoordinator();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", i = {0, 1, 1}, l = {72, 74, 100}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "startState"}, s = {"L$0", "L$0", "L$1"})
    static final class d extends SuspendLambda implements wn0.p<FlowCollector<? super T>, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115535n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f115536o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f115537p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ j<T> f115538q;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lu6/h0;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<FlowCollector<? super h0<T>>, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f115539n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ j<T> f115540o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j<T> jVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f115540o = jVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f115540o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f115539n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    j<T> jVar = this.f115540o;
                    this.f115539n = 1;
                    if (jVar.u(this) == coroutine_suspended) {
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
            public final Object invoke(FlowCollector<? super h0<T>> flowCollector, Continuation<? super jn0.h0> continuation) {
                return ((a) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu6/h0;", "it", "", "<anonymous>", "(Lu6/h0;)Z"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements wn0.p<h0<T>, Continuation<? super Boolean>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f115541n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f115542o;

            b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h0<T> h0Var, Continuation<? super Boolean> continuation) {
                return ((b) create(h0Var, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(continuation);
                bVar.f115542o = obj;
                return bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f115541n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return Boxing.boxBoolean(!(((h0) this.f115542o) instanceof u6.q));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu6/h0;", "it", "", "<anonymous>", "(Lu6/h0;)Z"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends SuspendLambda implements wn0.p<h0<T>, Continuation<? super Boolean>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f115543n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f115544o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ h0<T> f115545p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(h0<T> h0Var, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f115545p = h0Var;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h0<T> h0Var, Continuation<? super Boolean> continuation) {
                return ((c) create(h0Var, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f115545p, continuation);
                cVar.f115544o = obj;
                return cVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f115543n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                h0 h0Var = (h0) this.f115544o;
                return Boxing.boxBoolean((h0Var instanceof u6.e) && h0Var.getVersion() <= this.f115545p.getVersion());
            }
        }

        /* JADX INFO: renamed from: u6.j$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
        static final class C2480d extends SuspendLambda implements wn0.q<FlowCollector<? super T>, Throwable, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f115546n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ j<T> f115547o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2480d(j<T> jVar, Continuation<? super C2480d> continuation) {
                super(3, continuation);
                this.f115547o = jVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f115546n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    j<T> jVar = this.f115547o;
                    this.f115546n = 1;
                    if (jVar.p(this) == coroutine_suspended) {
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

            @Override // wn0.q
            public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th2, Continuation<? super jn0.h0> continuation) {
                return new C2480d(this.f115547o, continuation).invokeSuspend(jn0.h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class e implements Flow<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Flow f115548a;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ FlowCollector f115549a;

                /* JADX INFO: renamed from: u6.j$d$e$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
                public static final class C2481a extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f115550n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    int f115551o;

                    public C2481a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f115550n = obj;
                        this.f115551o |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(FlowCollector flowCollector) {
                    this.f115549a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    C2481a c2481a;
                    if (continuation instanceof C2481a) {
                        c2481a = (C2481a) continuation;
                        int i11 = c2481a.f115551o;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            c2481a.f115551o = i11 - Integer.MIN_VALUE;
                        } else {
                            c2481a = new C2481a(continuation);
                        }
                    } else {
                        c2481a = new C2481a(continuation);
                    }
                    Object obj2 = c2481a.f115550n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = c2481a.f115551o;
                    if (i12 == 0) {
                        jn0.t.b(obj2);
                        FlowCollector flowCollector = this.f115549a;
                        h0 h0Var = (h0) obj;
                        if (h0Var instanceof a0) {
                            throw ((a0) h0Var).getReadException();
                        }
                        if (!(h0Var instanceof u6.e)) {
                            if (h0Var instanceof u6.q ? true : h0Var instanceof l0) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        Object objC = ((u6.e) h0Var).c();
                        c2481a.f115551o = 1;
                        if (flowCollector.emit(objC, c2481a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jn0.t.b(obj2);
                    }
                    return jn0.h0.f84049a;
                }
            }

            public e(Flow flow) {
                this.f115548a = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f115548a.collect(new a(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j<T> jVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f115538q = jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f115538q, continuation);
            dVar.f115537p = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll((kotlinx.coroutines.flow.FlowCollector) r1, r9, r8) == r0) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v6, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 208
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.j.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super jn0.h0> continuation) {
            return ((d) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0}, l = {544}, m = "decrementCollector", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115553n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f115554o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f115555p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ j<T> f115556q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f115557r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(j<T> jVar, Continuation<? super e> continuation) {
            super(continuation);
            this.f115556q = jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115555p = obj;
            this.f115557r |= Integer.MIN_VALUE;
            return this.f115556q.p(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", i = {}, l = {416}, m = "invokeSuspend", n = {}, s = {})
    static final class f<R> extends SuspendLambda implements wn0.l<Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f115558n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ wn0.l<Continuation<? super R>, Object> f115559o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(wn0.l<? super Continuation<? super R>, ? extends Object> lVar, Continuation<? super f> continuation) {
            super(1, continuation);
            this.f115559o = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return new f(this.f115559o, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f115558n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            wn0.l<Continuation<? super R>, Object> lVar = this.f115559o;
            this.f115558n = 1;
            Object objInvoke = lVar.invoke(this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super R> continuation) {
            return ((f) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {1, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE}, m = "handleUpdate", n = {"update", "$this$handleUpdate_u24lambda_u242"}, s = {"L$0", "L$1"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115560n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f115561o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f115562p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f115563q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ j<T> f115564r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f115565s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(j<T> jVar, Continuation<? super g> continuation) {
            super(continuation);
            this.f115564r = jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115563q = obj;
            this.f115565s |= Integer.MIN_VALUE;
            return this.f115564r.t(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0}, l = {544}, m = "incrementCollector", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115566n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f115567o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f115568p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ j<T> f115569q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f115570r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(j<T> jVar, Continuation<? super h> continuation) {
            super(continuation);
            this.f115569q = jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115568p = obj;
            this.f115570r |= Integer.MIN_VALUE;
            return this.f115569q.u(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", i = {}, l = {134, 135}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f115571n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ j<T> f115572o;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ljn0/h0;", "it", "a", "(Ljn0/h0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j<T> f115573a;

            a(j<T> jVar) {
                this.f115573a = jVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(jn0.h0 h0Var, Continuation<? super jn0.h0> continuation) {
                if (((j) this.f115573a).inMemoryCache.a() instanceof u6.q) {
                    return jn0.h0.f84049a;
                }
                Object objW = this.f115573a.w(true, continuation);
                return objW == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objW : jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(j<T> jVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f115572o = jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new i(this.f115572o, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r5.collect(r1, r4) == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f115571n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r5)
                goto L4e
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                jn0.t.b(r5)
                goto L30
            L1e:
                jn0.t.b(r5)
                u6.j<T> r5 = r4.f115572o
                u6.j$b r5 = u6.j.e(r5)
                r4.f115571n = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L30
                goto L4d
            L30:
                u6.j<T> r5 = r4.f115572o
                u6.s r5 = u6.j.c(r5)
                kotlinx.coroutines.flow.Flow r5 = r5.b()
                kotlinx.coroutines.flow.Flow r5 = kotlinx.coroutines.flow.FlowKt.conflate(r5)
                u6.j$i$a r1 = new u6.j$i$a
                u6.j<T> r3 = r4.f115572o
                r1.<init>(r3)
                r4.f115571n = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L4e
            L4d:
                return r0
            L4e:
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.j.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: u6.j$j, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 1, 1}, l = {EnumC4419g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, m = "readAndInitOrPropagateAndThrowFailure", n = {"this", "this", "preReadVersion"}, s = {"L$0", "L$0", "I$0"})
    static final class C2482j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115574n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f115575o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f115576p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ j<T> f115577q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f115578r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2482j(j<T> jVar, Continuation<? super C2482j> continuation) {
            super(continuation);
            this.f115577q = jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115576p = obj;
            this.f115578r |= Integer.MIN_VALUE;
            return this.f115577q.v(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0, 0, 1, 2}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, EnumC4419g.SDK_ASSET_LOADING_INDICATOR_VALUE, EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE}, m = "readDataAndUpdateCache", n = {"this", "currentState", "requireLock", "this", "this"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$0"})
    static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115579n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f115580o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f115581p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f115582q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ j<T> f115583r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f115584s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(j<T> jVar, Continuation<? super k> continuation) {
            super(continuation);
            this.f115583r = jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115582q = obj;
            this.f115584s |= Integer.MIN_VALUE;
            return this.f115583r.w(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/Pair;", "Lu6/h0;", "", "<anonymous>", "()Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", i = {}, l = {EnumC4419g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, 300}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements wn0.l<Continuation<? super Pair<? extends h0<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115585n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f115586o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ j<T> f115587p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(j<T> jVar, Continuation<? super l> continuation) {
            super(1, continuation);
            this.f115587p = jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return new l(this.f115587p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            h0 a0Var;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f115586o;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    j<T> jVar = this.f115587p;
                    this.f115586o = 1;
                    obj = jVar.y(true, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) this.f115585n;
                        jn0.t.b(obj);
                        a0Var = new a0(th2, ((Number) obj).intValue());
                        return jn0.x.a(a0Var, Boxing.boxBoolean(true));
                    }
                    jn0.t.b(obj);
                }
                a0Var = (h0) obj;
            } catch (Throwable th3) {
                u6.s sVarR = this.f115587p.r();
                this.f115585n = th3;
                this.f115586o = 2;
                Object objD = sVarR.d(this);
                if (objD != coroutine_suspended) {
                    th2 = th3;
                    obj = objD;
                }
                return coroutine_suspended;
            }
            return jn0.x.a(a0Var, Boxing.boxBoolean(true));
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super Pair<? extends h0<T>, Boolean>> continuation) {
            return ((l) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "locked", "Lkotlin/Pair;", "Lu6/h0;", "<anonymous>", "(Z)Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", i = {0, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {"locked", "locked"}, s = {"Z$0", "Z$0"})
    static final class m extends SuspendLambda implements wn0.p<Boolean, Continuation<? super Pair<? extends h0<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115588n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f115589o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ boolean f115590p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ j<T> f115591q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f115592r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(j<T> jVar, int i11, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f115591q = jVar;
            this.f115592r = i11;
        }

        public final Object a(boolean z11, Continuation<? super Pair<? extends h0<T>, Boolean>> continuation) {
            return ((m) create(Boolean.valueOf(z11), continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            m mVar = new m(this.f115591q, this.f115592r, continuation);
            mVar.f115590p = ((Boolean) obj).booleanValue();
            return mVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return a(bool.booleanValue(), (Continuation) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r4v0 */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            int iIntValue;
            ?? r11;
            ?? r12;
            h0 h0Var;
            ?? r13;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r14 = this.f115589o;
            try {
                if (r14 == 0) {
                    jn0.t.b(obj);
                    boolean z11 = this.f115590p;
                    j<T> jVar = this.f115591q;
                    this.f115590p = z11;
                    this.f115589o = 1;
                    obj = jVar.y(z11, this);
                    r14 = z11;
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (r14 != 1) {
                        if (r14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z12 = this.f115590p;
                        th2 = (Throwable) this.f115588n;
                        jn0.t.b(obj);
                        r12 = z12;
                        iIntValue = ((Number) obj).intValue();
                        r11 = r12;
                        a0 a0Var = new a0(th2, iIntValue);
                        r13 = r11;
                        h0Var = a0Var;
                        return jn0.x.a(h0Var, Boxing.boxBoolean(r13));
                    }
                    boolean z13 = this.f115590p;
                    jn0.t.b(obj);
                    r14 = z13;
                }
                h0Var = (h0) obj;
                r13 = r14;
            } catch (Throwable th3) {
                if (r14 != 0) {
                    u6.s sVarR = this.f115591q.r();
                    this.f115588n = th3;
                    this.f115590p = r14;
                    this.f115589o = 2;
                    Object objD = sVarR.d(this);
                    if (objD != coroutine_suspended) {
                        r12 = r14;
                        th2 = th3;
                        obj = objD;
                    }
                    return coroutine_suspended;
                }
                ?? r15 = r14;
                th2 = th3;
                iIntValue = this.f115592r;
                r11 = r15 == true ? 1 : 0;
            }
            return jn0.x.a(h0Var, Boxing.boxBoolean(r13));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5}, l = {365, 366, 368, 369, 380, KyberEngine.KyberPolyBytes}, m = "readDataOrHandleCorruption", n = {"this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "ex", "newData", "hasWriteFileLock", "ex", "newData", "version"}, s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2"})
    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115593n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f115594o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f115595p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f115596q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f115597r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f115598s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f115599t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ j<T> f115600u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f115601v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(j<T> jVar, Continuation<? super n> continuation) {
            super(continuation);
            this.f115600u = jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115599t = obj;
            this.f115601v |= Integer.MIN_VALUE;
            return this.f115600u.y(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "locked", "Lu6/e;", "<anonymous>", "(Z)Lu6/e;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", i = {0, 1}, l = {370, 371}, m = "invokeSuspend", n = {"locked", "data"}, s = {"Z$0", "L$0"})
    static final class o extends SuspendLambda implements wn0.p<Boolean, Continuation<? super u6.e<T>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115602n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f115603o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ boolean f115604p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ j<T> f115605q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f115606r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(j<T> jVar, int i11, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f115605q = jVar;
            this.f115606r = i11;
        }

        public final Object a(boolean z11, Continuation<? super u6.e<T>> continuation) {
            return ((o) create(Boolean.valueOf(z11), continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            o oVar = new o(this.f115605q, this.f115606r, continuation);
            oVar.f115604p = ((Boolean) obj).booleanValue();
            return oVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return a(bool.booleanValue(), (Continuation) obj);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0059  */
        /* JADX WARN: Code duplicated, block: B:23:0x005e  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11;
            Object obj2;
            int iIntValue;
            int iHashCode;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f115603o;
            if (i11 == 0) {
                jn0.t.b(obj);
                z11 = this.f115604p;
                j<T> jVar = this.f115605q;
                this.f115604p = z11;
                this.f115603o = 1;
                obj = jVar.x(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                z11 = this.f115604p;
                jn0.t.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f115602n;
                jn0.t.b(obj);
            }
            iIntValue = ((Number) obj).intValue();
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new u6.e(obj2, iHashCode, iIntValue);
            if (z11) {
                u6.s sVarR = this.f115605q.r();
                this.f115602n = obj;
                this.f115603o = 2;
                Object objD = sVarR.d(this);
                if (objD != coroutine_suspended) {
                    obj2 = obj;
                    obj = objD;
                    iIntValue = ((Number) obj).intValue();
                }
                return coroutine_suspended;
            }
            obj2 = obj;
            iIntValue = this.f115606r;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new u6.e(obj2, iHashCode, iIntValue);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", i = {}, l = {387, 388, 390}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends SuspendLambda implements wn0.l<Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115607n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f115608o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p013kotlin.jvm.internal.n0<T> f115609p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ j<T> f115610q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p013kotlin.jvm.internal.l0 f115611r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(p013kotlin.jvm.internal.n0<T> n0Var, j<T> jVar, p013kotlin.jvm.internal.l0 l0Var, Continuation<? super p> continuation) {
            super(1, continuation);
            this.f115609p = n0Var;
            this.f115610q = jVar;
            this.f115611r = l0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return new p(this.f115609p, this.f115610q, this.f115611r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            p013kotlin.jvm.internal.l0 l0Var;
            p013kotlin.jvm.internal.n0<T> n0Var;
            p013kotlin.jvm.internal.l0 l0Var2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f115608o;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    n0Var = this.f115609p;
                    j<T> jVar = this.f115610q;
                    this.f115607n = n0Var;
                    this.f115608o = 1;
                    obj = (T) jVar.x(this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i11 == 1) {
                    n0Var = (p013kotlin.jvm.internal.n0) this.f115607n;
                    jn0.t.b(obj);
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        l0Var = (p013kotlin.jvm.internal.l0) this.f115607n;
                        jn0.t.b(obj);
                        l0Var.f86527a = ((Number) obj).intValue();
                        return jn0.h0.f84049a;
                    }
                    l0Var2 = (p013kotlin.jvm.internal.l0) this.f115607n;
                    jn0.t.b(obj);
                }
                l0Var2.f86527a = ((Number) obj).intValue();
                return jn0.h0.f84049a;
                n0Var.f86529a = (T) obj;
                l0Var2 = this.f115611r;
                u6.s sVarR = this.f115610q.r();
                this.f115607n = l0Var2;
                this.f115608o = 2;
                obj = (T) sVarR.d(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                l0Var2.f86527a = ((Number) obj).intValue();
            } catch (CorruptionException unused) {
                p013kotlin.jvm.internal.l0 l0Var3 = this.f115611r;
                j<T> jVar2 = this.f115610q;
                T t11 = this.f115609p.f86529a;
                this.f115607n = l0Var3;
                this.f115608o = 3;
                Object objB = jVar2.B(t11, true, this);
                if (objB != coroutine_suspended) {
                    l0Var = l0Var3;
                    obj = (T) objB;
                }
                return coroutine_suspended;
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super jn0.h0> continuation) {
            return ((p) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lu6/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lu6/h0;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_QUESTION_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class q extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0<T>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f115612n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ j<T> f115613o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f115614p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(j<T> jVar, boolean z11, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f115613o = jVar;
            this.f115614p = z11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new q(this.f115613o, this.f115614p, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (r5 == r0) goto L22;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f115612n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r5)
                goto L54
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                jn0.t.b(r5)     // Catch: java.lang.Throwable -> L1e
                goto L47
            L1e:
                r5 = move-exception
                goto L57
            L20:
                jn0.t.b(r5)
                u6.j<T> r5 = r4.f115613o
                u6.k r5 = u6.j.d(r5)
                u6.h0 r5 = r5.a()
                boolean r5 = r5 instanceof u6.q
                if (r5 == 0) goto L3c
                u6.j<T> r5 = r4.f115613o
                u6.k r5 = u6.j.d(r5)
                u6.h0 r5 = r5.a()
                return r5
            L3c:
                u6.j<T> r5 = r4.f115613o     // Catch: java.lang.Throwable -> L1e
                r4.f115612n = r3     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r5 = u6.j.k(r5, r4)     // Catch: java.lang.Throwable -> L1e
                if (r5 != r0) goto L47
                goto L53
            L47:
                u6.j<T> r5 = r4.f115613o
                boolean r1 = r4.f115614p
                r4.f115612n = r2
                java.lang.Object r5 = u6.j.l(r5, r1, r4)
                if (r5 != r0) goto L54
            L53:
                return r0
            L54:
                u6.h0 r5 = (u6.h0) r5
                return r5
            L57:
                u6.a0 r0 = new u6.a0
                r1 = -1
                r0.<init>(r5, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.j.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0<T>> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lu6/j0;", "b", "()Lu6/j0;"}, k = 3, mv = {1, 8, 0})
    static final class r extends p013kotlin.jvm.internal.u implements wn0.a<j0<T>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j<T> f115615c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(j<T> jVar) {
            super(0);
            this.f115615c = jVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j0<T> invoke() {
            return ((j) this.f115615c).storage.createConnection();
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", i = {1, 2}, l = {330, 331, 337}, m = "invokeSuspend", n = {"curData", "newData"}, s = {"L$0", "L$0"})
    static final class s extends SuspendLambda implements wn0.l<Continuation<? super T>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115616n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f115617o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ j<T> f115618p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f115619q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ wn0.p<T, Continuation<? super T>, Object> f115620r;

        @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", i = {}, l = {331}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super T>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f115621n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ wn0.p<T, Continuation<? super T>, Object> f115622o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ u6.e<T> f115623p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(wn0.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar, u6.e<T> eVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f115622o = pVar;
                this.f115623p = eVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f115622o, this.f115623p, continuation);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to u6.j$s$a for r3v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r3.f115621n
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    jn0.t.b(r4)
                    return r4
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    jn0.t.b(r4)
                    wn0.p<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r4 = r3.f115622o
                    u6.e<T> r1 = r3.f115623p
                    java.lang.Object r1 = r1.c()
                    r3.f115621n = r2
                    java.lang.Object r4 = r4.invoke(r1, r3)
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: u6.j.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(j<T> jVar, CoroutineContext coroutineContext, wn0.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super s> continuation) {
            super(1, continuation);
            this.f115618p = jVar;
            this.f115619q = coroutineContext;
            this.f115620r = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return new s(this.f115618p, this.f115619q, this.f115620r, continuation);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to u6.j$s for r8v1 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f115617o
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.f115616n
                jn0.t.b(r9)
                return r0
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f115616n
                u6.e r1 = (u6.e) r1
                jn0.t.b(r9)
                goto L51
            L27:
                jn0.t.b(r9)
                goto L39
            L2b:
                jn0.t.b(r9)
                u6.j<T> r9 = r8.f115618p
                r8.f115617o = r4
                java.lang.Object r9 = u6.j.n(r9, r4, r8)
                if (r9 != r0) goto L39
                goto L6a
            L39:
                r1 = r9
                u6.e r1 = (u6.e) r1
                kotlin.coroutines.CoroutineContext r9 = r8.f115619q
                u6.j$s$a r5 = new u6.j$s$a
                wn0.p<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r6 = r8.f115620r
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.f115616n = r1
                r8.f115617o = r3
                java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r5, r8)
                if (r9 != r0) goto L51
                goto L6a
            L51:
                r1.b()
                java.lang.Object r1 = r1.c()
                boolean r1 = p013kotlin.jvm.internal.s.f(r1, r9)
                if (r1 != 0) goto L6b
                u6.j<T> r1 = r8.f115618p
                r8.f115616n = r9
                r8.f115617o = r2
                java.lang.Object r1 = r1.B(r9, r4, r8)
                if (r1 != r0) goto L6b
            L6a:
                return r0
            L6b:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.j.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super T> continuation) {
            return ((s) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
    static final class t extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super T>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f115624n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f115625o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ j<T> f115626p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ wn0.p<T, Continuation<? super T>, Object> f115627q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(j<T> jVar, wn0.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super t> continuation) {
            super(2, continuation);
            this.f115626p = jVar;
            this.f115627q = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            t tVar = new t(this.f115626p, this.f115627q, continuation);
            tVar.f115625o = obj;
            return tVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f115624n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f115625o;
            CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            ((j) this.f115626p).writeActor.e(new u6.v.a(this.f115627q, completableDeferredCompletableDeferred$default, ((j) this.f115626p).inMemoryCache.a(), coroutineScope.getCoroutineContext()));
            this.f115624n = 1;
            Object objAwait = completableDeferredCompletableDeferred$default.await(this);
            return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class u extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j<T> f115628c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(j<T> jVar) {
            super(1);
            this.f115628c = jVar;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                ((j) this.f115628c).inMemoryCache.c(new u6.q(th2));
            }
            if (((j) this.f115628c).storageConnectionDelegate.isInitialized()) {
                this.f115628c.s().close();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Throwable th2) {
            a(th2);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lu6/v$a;", "msg", "", "ex", "Ljn0/h0;", "a", "(Lu6/v$a;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class v extends p013kotlin.jvm.internal.u implements wn0.p<u6.v.a<T>, Throwable, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f115629c = new v();

        v() {
            super(2);
        }

        public final void a(u6.v.a<T> msg, Throwable th2) {
            p013kotlin.jvm.internal.s.k(msg, "msg");
            CompletableDeferred<T> completableDeferredA = msg.a();
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            completableDeferredA.completeExceptionally(th2);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Object obj, Throwable th2) {
            a((u6.v.a) obj, th2);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu6/v$a;", "msg", "Ljn0/h0;", "<anonymous>", "(Lu6/v$a;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_COMMENT_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class w extends SuspendLambda implements wn0.p<u6.v.a<T>, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f115630n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f115631o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ j<T> f115632p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(j<T> jVar, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f115632p = jVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u6.v.a<T> aVar, Continuation<? super jn0.h0> continuation) {
            return ((w) create(aVar, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            w wVar = new w(this.f115632p, continuation);
            wVar.f115631o = obj;
            return wVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f115630n;
            if (i11 == 0) {
                jn0.t.b(obj);
                u6.v.a aVar = (u6.v.a) this.f115631o;
                j<T> jVar = this.f115632p;
                this.f115630n = 1;
                if (jVar.t(aVar, this) == coroutine_suspended) {
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
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0}, l = {348}, m = "writeData$datastore_core_release", n = {"newVersion"}, s = {"L$0"})
    static final class x extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115633n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f115634o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ j<T> f115635p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f115636q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(j<T> jVar, Continuation<? super x> continuation) {
            super(continuation);
            this.f115635p = jVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f115634o = obj;
            this.f115636q |= Integer.MIN_VALUE;
            return this.f115635p.B(null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lu6/o0;", "Ljn0/h0;", "<anonymous>", "(Lu6/o0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", i = {0}, l = {352, 353}, m = "invokeSuspend", n = {"$this$writeScope"}, s = {"L$0"})
    static final class y extends SuspendLambda implements wn0.p<o0<T>, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f115637n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f115638o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f115639p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p013kotlin.jvm.internal.l0 f115640q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ j<T> f115641r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ T f115642s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f115643t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(p013kotlin.jvm.internal.l0 l0Var, j<T> jVar, T t11, boolean z11, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f115640q = l0Var;
            this.f115641r = jVar;
            this.f115642s = t11;
            this.f115643t = z11;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0<T> o0Var, Continuation<? super jn0.h0> continuation) {
            return ((y) create(o0Var, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            y yVar = new y(this.f115640q, this.f115641r, this.f115642s, this.f115643t, continuation);
            yVar.f115639p = obj;
            return yVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r3.a(r7, r6) == r0) goto L16;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f115638o
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r7)
                goto L5d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f115637n
                kotlin.jvm.internal.l0 r1 = (p013kotlin.jvm.internal.l0) r1
                java.lang.Object r3 = r6.f115639p
                u6.o0 r3 = (u6.o0) r3
                jn0.t.b(r7)
                goto L45
            L26:
                jn0.t.b(r7)
                java.lang.Object r7 = r6.f115639p
                u6.o0 r7 = (u6.o0) r7
                kotlin.jvm.internal.l0 r1 = r6.f115640q
                u6.j<T> r4 = r6.f115641r
                u6.s r4 = u6.j.c(r4)
                r6.f115639p = r7
                r6.f115637n = r1
                r6.f115638o = r3
                java.lang.Object r3 = r4.e(r6)
                if (r3 != r0) goto L42
                goto L5c
            L42:
                r5 = r3
                r3 = r7
                r7 = r5
            L45:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r1.f86527a = r7
                T r7 = r6.f115642s
                r1 = 0
                r6.f115639p = r1
                r6.f115637n = r1
                r6.f115638o = r2
                java.lang.Object r7 = r3.a(r7, r6)
                if (r7 != r0) goto L5d
            L5c:
                return r0
            L5d:
                boolean r7 = r6.f115643t
                if (r7 == 0) goto L7d
                u6.j<T> r7 = r6.f115641r
                u6.k r7 = u6.j.d(r7)
                u6.e r0 = new u6.e
                T r1 = r6.f115642s
                if (r1 == 0) goto L72
                int r2 = r1.hashCode()
                goto L73
            L72:
                r2 = 0
            L73:
                kotlin.jvm.internal.l0 r3 = r6.f115640q
                int r3 = r3.f86527a
                r0.<init>(r1, r2, r3)
                r7.c(r0)
            L7d:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.j.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public j(i0<T> storage, List<? extends wn0.p<? super u6.r<T>, ? super Continuation<? super jn0.h0>, ? extends Object>> initTasksList, u6.d<T> corruptionHandler, CoroutineScope scope) {
        p013kotlin.jvm.internal.s.k(storage, "storage");
        p013kotlin.jvm.internal.s.k(initTasksList, "initTasksList");
        p013kotlin.jvm.internal.s.k(corruptionHandler, "corruptionHandler");
        p013kotlin.jvm.internal.s.k(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = FlowKt.flow(new d(this, null));
        this.collectorMutex = MutexKt.Mutex$default(false, 1, null);
        this.inMemoryCache = new u6.k<>();
        this.readAndInit = new b(this, initTasksList);
        this.storageConnectionDelegate = jn0.m.b(new r(this));
        this.coordinator = jn0.m.b(new c(this));
        this.writeActor = new f0<>(scope, new u(this), v.f115629c, new w(this, null));
    }

    private final Object A(wn0.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar, CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        return r().c(new s(this, coroutineContext, pVar, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(Continuation<? super jn0.h0> continuation) {
        e eVar;
        j<T> jVar;
        Mutex mutex;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f115557r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f115557r = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, continuation);
            }
        } else {
            eVar = new e(this, continuation);
        }
        Object obj = eVar.f115555p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f115557r;
        if (i12 == 0) {
            jn0.t.b(obj);
            Mutex mutex2 = this.collectorMutex;
            eVar.f115553n = this;
            eVar.f115554o = mutex2;
            eVar.f115557r = 1;
            if (mutex2.lock(null, eVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
            mutex = mutex2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) eVar.f115554o;
            jVar = (j) eVar.f115553n;
            jn0.t.b(obj);
        }
        try {
            int i13 = jVar.collectorCounter - 1;
            jVar.collectorCounter = i13;
            if (i13 == 0) {
                Job job = jVar.collectorJob;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                jVar.collectorJob = null;
            }
            jn0.h0 h0Var = jn0.h0.f84049a;
            return jn0.h0.f84049a;
        } finally {
            mutex.unlock(null);
        }
    }

    private final <R> Object q(boolean z11, wn0.l<? super Continuation<? super R>, ? extends Object> lVar, Continuation<? super R> continuation) {
        return z11 ? lVar.invoke(continuation) : r().c(new f(lVar, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u6.s r() {
        return (u6.s) this.coordinator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        if (r9 == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [u6.j] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, u6.j, u6.j<T>] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(u6.v.a<T> r9, p013kotlin.coroutines.Continuation<? super jn0.h0> r10) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.j.t(u6.v$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(Continuation<? super jn0.h0> continuation) {
        h hVar;
        j<T> jVar;
        Mutex mutex;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f115570r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f115570r = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, continuation);
            }
        } else {
            hVar = new h(this, continuation);
        }
        Object obj = hVar.f115568p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hVar.f115570r;
        if (i12 == 0) {
            jn0.t.b(obj);
            Mutex mutex2 = this.collectorMutex;
            hVar.f115566n = this;
            hVar.f115567o = mutex2;
            hVar.f115570r = 1;
            if (mutex2.lock(null, hVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
            mutex = mutex2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) hVar.f115567o;
            jVar = (j) hVar.f115566n;
            jn0.t.b(obj);
        }
        try {
            int i13 = jVar.collectorCounter + 1;
            jVar.collectorCounter = i13;
            if (i13 == 1) {
                jVar.collectorJob = BuildersKt__Builders_commonKt.launch$default(jVar.scope, null, null, new i(jVar, null), 3, null);
            }
            jn0.h0 h0Var = jn0.h0.f84049a;
            return jn0.h0.f84049a;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r4.c(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(p013kotlin.coroutines.Continuation<? super jn0.h0> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof u6.j.C2482j
            if (r0 == 0) goto L13
            r0 = r6
            u6.j$j r0 = (u6.j.C2482j) r0
            int r1 = r0.f115578r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f115578r = r1
            goto L18
        L13:
            u6.j$j r0 = new u6.j$j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f115576p
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f115578r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.f115575o
            java.lang.Object r0 = r0.f115574n
            u6.j r0 = (u6.j) r0
            jn0.t.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.f115574n
            u6.j r2 = (u6.j) r2
            jn0.t.b(r6)
            goto L57
        L44:
            jn0.t.b(r6)
            u6.s r6 = r5.r()
            r0.f115574n = r5
            r0.f115578r = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L56
            goto L6b
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            u6.j<T>$b r4 = r2.readAndInit     // Catch: java.lang.Throwable -> L6f
            r0.f115574n = r2     // Catch: java.lang.Throwable -> L6f
            r0.f115575o = r6     // Catch: java.lang.Throwable -> L6f
            r0.f115578r = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.c(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        L6f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L73:
            u6.k<T> r0 = r0.inMemoryCache
            u6.a0 r2 = new u6.a0
            r2.<init>(r6, r1)
            r0.c(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.j.v(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r11 == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(boolean r10, p013kotlin.coroutines.Continuation<? super u6.h0<T>> r11) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.j.w(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(Continuation<? super T> continuation) {
        return k0.a(s(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:87:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, u6.j] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r6v10, types: [u6.j] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, u6.j] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, u6.j] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [u6.j] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, u6.j, u6.j<T>] */
    public final Object y(boolean z11, Continuation<? super u6.e<T>> continuation) throws CorruptionException {
        n nVar;
        ?? r11;
        p013kotlin.jvm.internal.n0 n0Var;
        Object objA;
        CorruptionException corruptionException;
        p013kotlin.jvm.internal.n0 n0Var2;
        ?? r12;
        p013kotlin.jvm.internal.l0 l0Var;
        CorruptionException corruptionException2;
        p pVar;
        p013kotlin.jvm.internal.l0 l0Var2;
        p013kotlin.jvm.internal.n0 n0Var3;
        ?? r13;
        ?? r14;
        int iHashCode;
        Object objD;
        boolean z12;
        int i11;
        Object obj;
        ?? r15;
        ?? r16;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i12 = nVar.f115601v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                nVar.f115601v = i12 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, continuation);
            }
        } else {
            nVar = new n(this, continuation);
        }
        Object obj2 = (T) nVar.f115599t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r17 = nVar.f115601v;
        try {
            switch (r17) {
                case 0:
                    jn0.t.b(obj2);
                    try {
                        if (z11) {
                            nVar.f115593n = this;
                            nVar.f115597r = z11;
                            nVar.f115601v = 1;
                            obj2 = (T) x(nVar);
                            if (obj2 != coroutine_suspended) {
                                r14 = this;
                                if (obj2 != null) {
                                    try {
                                        iHashCode = obj2.hashCode();
                                    } catch (CorruptionException e11) {
                                        e = e11;
                                        r15 = r14;
                                        r11 = r15;
                                        n0Var = new p013kotlin.jvm.internal.n0();
                                        u6.d<T> dVar = r11.corruptionHandler;
                                        nVar.f115593n = r11;
                                        nVar.f115594o = e;
                                        nVar.f115595p = n0Var;
                                        nVar.f115596q = n0Var;
                                        nVar.f115597r = z11;
                                        nVar.f115601v = 5;
                                        objA = dVar.a(e, nVar);
                                        if (objA != coroutine_suspended) {
                                            corruptionException = e;
                                            obj2 = (T) objA;
                                            n0Var2 = n0Var;
                                            r12 = r11;
                                            n0Var2.f86529a = (T) obj2;
                                            l0Var = new p013kotlin.jvm.internal.l0();
                                            try {
                                                pVar = new p(n0Var, r12, l0Var, null);
                                                nVar.f115593n = corruptionException;
                                                nVar.f115594o = n0Var;
                                                nVar.f115595p = l0Var;
                                                nVar.f115596q = null;
                                                nVar.f115601v = 6;
                                                if (r12.q(z11, pVar, nVar) != coroutine_suspended) {
                                                    l0Var2 = l0Var;
                                                    n0Var3 = n0Var;
                                                    T t11 = n0Var3.f86529a;
                                                    return new u6.e(t11, t11 != null ? t11.hashCode() : 0, l0Var2.f86527a);
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                corruptionException2 = corruptionException;
                                                jn0.g.a(corruptionException2, th);
                                                throw corruptionException2;
                                            }
                                        }
                                    }
                                } else {
                                    iHashCode = 0;
                                }
                                u6.s sVarR = r14.r();
                                nVar.f115593n = r14;
                                nVar.f115594o = obj2;
                                nVar.f115597r = z11;
                                nVar.f115598s = iHashCode;
                                nVar.f115601v = 2;
                                objD = sVarR.d(nVar);
                                if (objD != coroutine_suspended) {
                                    int i13 = iHashCode;
                                    z12 = z11;
                                    i11 = i13;
                                    obj = obj2;
                                    obj2 = (T) objD;
                                    r16 = r14;
                                    return new u6.e(obj, i11, ((Number) obj2).intValue());
                                }
                            }
                        } else {
                            u6.s sVarR2 = r();
                            nVar.f115593n = this;
                            nVar.f115597r = z11;
                            nVar.f115601v = 3;
                            obj2 = (T) sVarR2.d(nVar);
                            if (obj2 != coroutine_suspended) {
                                r13 = this;
                                int iIntValue = ((Number) obj2).intValue();
                                u6.s sVarR3 = r13.r();
                                o oVar = new o(r13, iIntValue, null);
                                nVar.f115593n = r13;
                                nVar.f115597r = z11;
                                nVar.f115601v = 4;
                                obj2 = (T) sVarR3.a(oVar, nVar);
                                if (obj2 == coroutine_suspended) {
                                }
                                return (u6.e) obj2;
                            }
                        }
                    } catch (CorruptionException e12) {
                        e = e12;
                        r11 = this;
                        n0Var = new p013kotlin.jvm.internal.n0();
                        u6.d<T> dVar2 = r11.corruptionHandler;
                        nVar.f115593n = r11;
                        nVar.f115594o = e;
                        nVar.f115595p = n0Var;
                        nVar.f115596q = n0Var;
                        nVar.f115597r = z11;
                        nVar.f115601v = 5;
                        objA = dVar2.a(e, nVar);
                        if (objA != coroutine_suspended) {
                            corruptionException = e;
                            obj2 = (T) objA;
                            n0Var2 = n0Var;
                            r12 = r11;
                            n0Var2.f86529a = (T) obj2;
                            l0Var = new p013kotlin.jvm.internal.l0();
                            pVar = new p(n0Var, r12, l0Var, null);
                            nVar.f115593n = corruptionException;
                            nVar.f115594o = n0Var;
                            nVar.f115595p = l0Var;
                            nVar.f115596q = null;
                            nVar.f115601v = 6;
                            if (r12.q(z11, pVar, nVar) != coroutine_suspended) {
                                l0Var2 = l0Var;
                                n0Var3 = n0Var;
                                T t12 = n0Var3.f86529a;
                                return new u6.e(t12, t12 != null ? t12.hashCode() : 0, l0Var2.f86527a);
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    z11 = nVar.f115597r;
                    j jVar = (j) nVar.f115593n;
                    jn0.t.b(obj2);
                    r14 = jVar;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    u6.s sVarR4 = r14.r();
                    nVar.f115593n = r14;
                    nVar.f115594o = obj2;
                    nVar.f115597r = z11;
                    nVar.f115598s = iHashCode;
                    nVar.f115601v = 2;
                    objD = sVarR4.d(nVar);
                    if (objD != coroutine_suspended) {
                        int i14 = iHashCode;
                        z12 = z11;
                        i11 = i14;
                        obj = obj2;
                        obj2 = (T) objD;
                        r16 = r14;
                        return new u6.e(obj, i11, ((Number) obj2).intValue());
                    }
                    return coroutine_suspended;
                case 2:
                    i11 = nVar.f115598s;
                    z12 = nVar.f115597r;
                    obj = nVar.f115594o;
                    r16 = (j) nVar.f115593n;
                    try {
                        jn0.t.b(obj2);
                        r16 = r16;
                        return new u6.e(obj, i11, ((Number) obj2).intValue());
                    } catch (CorruptionException e13) {
                        e = e13;
                        z11 = z12;
                        r15 = r16;
                        r11 = r15;
                        n0Var = new p013kotlin.jvm.internal.n0();
                        u6.d<T> dVar3 = r11.corruptionHandler;
                        nVar.f115593n = r11;
                        nVar.f115594o = e;
                        nVar.f115595p = n0Var;
                        nVar.f115596q = n0Var;
                        nVar.f115597r = z11;
                        nVar.f115601v = 5;
                        objA = dVar3.a(e, nVar);
                        if (objA != coroutine_suspended) {
                            corruptionException = e;
                            obj2 = (T) objA;
                            n0Var2 = n0Var;
                            r12 = r11;
                            n0Var2.f86529a = (T) obj2;
                            l0Var = new p013kotlin.jvm.internal.l0();
                            pVar = new p(n0Var, r12, l0Var, null);
                            nVar.f115593n = corruptionException;
                            nVar.f115594o = n0Var;
                            nVar.f115595p = l0Var;
                            nVar.f115596q = null;
                            nVar.f115601v = 6;
                            if (r12.q(z11, pVar, nVar) != coroutine_suspended) {
                                l0Var2 = l0Var;
                                n0Var3 = n0Var;
                                T t13 = n0Var3.f86529a;
                                return new u6.e(t13, t13 != null ? t13.hashCode() : 0, l0Var2.f86527a);
                            }
                        }
                        return coroutine_suspended;
                    }
                case 3:
                    z11 = nVar.f115597r;
                    j jVar2 = (j) nVar.f115593n;
                    jn0.t.b(obj2);
                    r13 = jVar2;
                    int iIntValue2 = ((Number) obj2).intValue();
                    u6.s sVarR5 = r13.r();
                    o oVar2 = new o(r13, iIntValue2, null);
                    nVar.f115593n = r13;
                    nVar.f115597r = z11;
                    nVar.f115601v = 4;
                    obj2 = (T) sVarR5.a(oVar2, nVar);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return (u6.e) obj2;
                case 4:
                    boolean z13 = nVar.f115597r;
                    jn0.t.b(obj2);
                    return (u6.e) obj2;
                case 5:
                    z11 = nVar.f115597r;
                    p013kotlin.jvm.internal.n0 n0Var4 = (p013kotlin.jvm.internal.n0) nVar.f115596q;
                    p013kotlin.jvm.internal.n0 n0Var5 = (p013kotlin.jvm.internal.n0) nVar.f115595p;
                    corruptionException = (CorruptionException) nVar.f115594o;
                    j jVar3 = (j) nVar.f115593n;
                    jn0.t.b(obj2);
                    n0Var2 = n0Var4;
                    n0Var = n0Var5;
                    r12 = jVar3;
                    n0Var2.f86529a = (T) obj2;
                    l0Var = new p013kotlin.jvm.internal.l0();
                    pVar = new p(n0Var, r12, l0Var, null);
                    nVar.f115593n = corruptionException;
                    nVar.f115594o = n0Var;
                    nVar.f115595p = l0Var;
                    nVar.f115596q = null;
                    nVar.f115601v = 6;
                    if (r12.q(z11, pVar, nVar) != coroutine_suspended) {
                        l0Var2 = l0Var;
                        n0Var3 = n0Var;
                        T t14 = n0Var3.f86529a;
                        return new u6.e(t14, t14 != null ? t14.hashCode() : 0, l0Var2.f86527a);
                    }
                    return coroutine_suspended;
                case 6:
                    l0Var2 = (p013kotlin.jvm.internal.l0) nVar.f115595p;
                    n0Var3 = (p013kotlin.jvm.internal.n0) nVar.f115594o;
                    corruptionException2 = (CorruptionException) nVar.f115593n;
                    try {
                        jn0.t.b(obj2);
                        T t15 = n0Var3.f86529a;
                        return new u6.e(t15, t15 != null ? t15.hashCode() : 0, l0Var2.f86527a);
                    } catch (Throwable th3) {
                        th = th3;
                        jn0.g.a(corruptionException2, th);
                        throw corruptionException2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CorruptionException e14) {
            e = e14;
            r11 = r17;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(boolean z11, Continuation<? super h0<T>> continuation) {
        return BuildersKt.withContext(this.scope.getCoroutineContext(), new q(this, z11, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(T t11, boolean z11, Continuation<? super Integer> continuation) {
        x xVar;
        p013kotlin.jvm.internal.l0 l0Var;
        if (continuation instanceof x) {
            xVar = (x) continuation;
            int i11 = xVar.f115636q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f115636q = i11 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, continuation);
            }
        } else {
            xVar = new x(this, continuation);
        }
        Object obj = xVar.f115634o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = xVar.f115636q;
        if (i12 == 0) {
            jn0.t.b(obj);
            p013kotlin.jvm.internal.l0 l0Var2 = new p013kotlin.jvm.internal.l0();
            j0<T> j0VarS = s();
            y yVar = new y(l0Var2, this, t11, z11, null);
            xVar.f115633n = l0Var2;
            xVar.f115636q = 1;
            if (j0VarS.b(yVar, xVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            l0Var = l0Var2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l0Var = (p013kotlin.jvm.internal.l0) xVar.f115633n;
            jn0.t.b(obj);
        }
        return Boxing.boxInt(l0Var.f86527a);
    }

    @Override // u6.h
    public Object a(wn0.p<? super T, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        n0 n0Var = (n0) continuation.getContext().get(n0.Companion.C2483a.f115669a);
        if (n0Var != null) {
            n0Var.a(this);
        }
        return BuildersKt.withContext(new n0(n0Var, this), new t(this, pVar, null), continuation);
    }

    @Override // u6.h
    public Flow<T> getData() {
        return this.data;
    }

    public final j0<T> s() {
        return this.storageConnectionDelegate.getValue();
    }
}
