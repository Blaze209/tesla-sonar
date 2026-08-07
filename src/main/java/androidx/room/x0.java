package androidx.room;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.wallet.WalletConstants;
import com.plaid.internal.EnumC4419g;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.internal.http.StatusLine;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 !2\u00020\u0001:\u00018Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J9\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070'2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000bH\u0000¢\u0006\u0004\b(\u0010)J1\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0004\u0012\u00020$0*2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b0\u0010\u001dJ/\u00104\u001a\u00020\u000f2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f01H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R&\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010;R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u00060Nj\u0002`O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010PR(\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000b018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Landroidx/room/x0;", "", "Landroidx/room/b0;", "database", "", "", "shadowTablesMap", "", "viewTables", "", "tableNames", "", "useTempTable", "Lkotlin/Function1;", "", "Ljn0/h0;", "onInvalidatedTablesIds", "<init>", "(Landroidx/room/b0;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;ZLwn0/l;)V", "names", "t", "([Ljava/lang/String;)[Ljava/lang/String;", "Landroidx/room/u;", "connection", "tableId", "v", "(Landroidx/room/u;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w", "n", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "(Landroidx/room/u;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lya/b;", "l", "(Lya/b;)V", "resolvedTableNames", "", "tableIds", "emitInitialState", "Lkotlinx/coroutines/flow/Flow;", "m", "([Ljava/lang/String;[IZ)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "y", "([Ljava/lang/String;)Lkotlin/Pair;", "p", "([I)Z", "q", "x", "Lkotlin/Function0;", "onRefreshScheduled", "onRefreshCompleted", "r", "(Lwn0/a;Lwn0/a;)V", "s", "()V", "a", "Landroidx/room/b0;", "b", "Ljava/util/Map;", "c", DateTokenConverter.CONVERTER_KEY, "Z", "e", "Lwn0/l;", "f", "tableIdLookup", "g", "[Ljava/lang/String;", "tablesNames", "Landroidx/room/r;", "h", "Landroidx/room/r;", "observedTableStates", "Landroidx/room/s;", IntegerTokenConverter.CONVERTER_KEY, "Landroidx/room/s;", "observedTableVersions", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "k", "Lwn0/a;", "getOnAllowRefresh$room_runtime_release", "()Lwn0/a;", "u", "(Lwn0/a;)V", "onAllowRefresh", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f13820m = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 database;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> shadowTablesMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Set<String>> viewTables;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean useTempTable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Set<Integer>, jn0.h0> onInvalidatedTablesIds;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> tableIdLookup;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String[] tablesNames;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final r observedTableStates;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final s observedTableVersions;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean pendingRefresh;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private wn0.a<Boolean> onAllowRefresh;

    /* JADX INFO: renamed from: androidx.room.x0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/room/x0$a;", "", "<init>", "()V", "", "tableName", "triggerType", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "Ljava/lang/String;", "TABLE_ID_COLUMN_NAME", "INVALIDATED_COLUMN_NAME", "CREATE_TRACKING_TABLE_SQL", "DROP_TRACKING_TABLE_SQL", "SELECT_UPDATED_TABLES_SQL", "RESET_UPDATED_TABLES_SQL", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String tableName, String triggerType) {
            return "room_table_modification_trigger_" + tableName + '_' + triggerType;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 1}, l = {440, 448}, m = "checkInvalidatedTables", n = {"connection", "invalidatedTableIds"}, s = {"L$0", "L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f13832n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f13833o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f13835q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13833o = obj;
            this.f13835q |= Integer.MIN_VALUE;
            return x0.this.j(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", f = "InvalidationTracker.kt", i = {0, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    static final class c extends SuspendLambda implements wn0.p<FlowCollector<? super Set<? extends String>>, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f13836n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f13837o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int[] f13839q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f13840r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String[] f13841s;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", f = "InvalidationTracker.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f13842n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ x0 f13843o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x0 x0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f13843o = x0Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f13843o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f13842n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    x0 x0Var = this.f13843o;
                    this.f13842n = 1;
                    if (x0Var.x(this) == coroutine_suspended) {
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
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class b<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p013kotlin.jvm.internal.n0<int[]> f13844a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f13845b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ FlowCollector<Set<String>> f13846c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String[] f13847d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int[] f13848e;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", f = "InvalidationTracker.kt", i = {0, 0, 1, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE}, m = "emit", n = {"this", "newVersions", "this", "newVersions"}, s = {"L$0", "L$1", "L$0", "L$1"})
            static final class a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f13849n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                Object f13850o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                /* synthetic */ Object f13851p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ b<T> f13852q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f13853r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(b<? super T> bVar, Continuation<? super a> continuation) {
                    super(continuation);
                    this.f13852q = bVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f13851p = obj;
                    this.f13853r |= Integer.MIN_VALUE;
                    return this.f13852q.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(p013kotlin.jvm.internal.n0<int[]> n0Var, boolean z11, FlowCollector<? super Set<String>> flowCollector, String[] strArr, int[] iArr) {
                this.f13844a = n0Var;
                this.f13845b = z11;
                this.f13846c = flowCollector;
                this.f13847d = strArr;
                this.f13848e = iArr;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
            
                if (r14.emit(r2, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
            
                if (r14.emit(r2, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
            
                return r1;
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(int[] r13, p013kotlin.coroutines.Continuation<? super jn0.h0> r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof androidx.room.x0.c.b.a
                    if (r0 == 0) goto L13
                    r0 = r14
                    androidx.room.x0$c$b$a r0 = (androidx.room.x0.c.b.a) r0
                    int r1 = r0.f13853r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f13853r = r1
                    goto L18
                L13:
                    androidx.room.x0$c$b$a r0 = new androidx.room.x0$c$b$a
                    r0.<init>(r12, r14)
                L18:
                    java.lang.Object r14 = r0.f13851p
                    java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f13853r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L31
                    if (r2 != r3) goto L29
                    goto L31
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L31:
                    java.lang.Object r13 = r0.f13850o
                    int[] r13 = (int[]) r13
                    java.lang.Object r0 = r0.f13849n
                    androidx.room.x0$c$b r0 = (androidx.room.x0.c.b) r0
                    jn0.t.b(r14)
                    goto La9
                L3e:
                    jn0.t.b(r14)
                    kotlin.jvm.internal.n0<int[]> r14 = r12.f13844a
                    T r2 = r14.f86529a
                    if (r2 != 0) goto L60
                    boolean r14 = r12.f13845b
                    if (r14 == 0) goto La8
                    kotlinx.coroutines.flow.FlowCollector<java.util.Set<java.lang.String>> r14 = r12.f13846c
                    java.lang.String[] r2 = r12.f13847d
                    java.util.Set r2 = p013kotlin.collections.n.J1(r2)
                    r0.f13849n = r12
                    r0.f13850o = r13
                    r0.f13853r = r4
                    java.lang.Object r14 = r14.emit(r2, r0)
                    if (r14 != r1) goto La8
                    goto La7
                L60:
                    java.lang.String[] r2 = r12.f13847d
                    int[] r4 = r12.f13848e
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    int r6 = r2.length
                    r7 = 0
                    r8 = r7
                L6c:
                    if (r7 >= r6) goto L8f
                    r9 = r2[r7]
                    int r10 = r8 + 1
                    T r11 = r14.f86529a
                    if (r11 == 0) goto L87
                    int[] r11 = (int[]) r11
                    r8 = r4[r8]
                    r11 = r11[r8]
                    r8 = r13[r8]
                    if (r11 == r8) goto L83
                    r5.add(r9)
                L83:
                    int r7 = r7 + 1
                    r8 = r10
                    goto L6c
                L87:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "Required value was null."
                    r13.<init>(r14)
                    throw r13
                L8f:
                    boolean r14 = r5.isEmpty()
                    if (r14 != 0) goto La8
                    kotlinx.coroutines.flow.FlowCollector<java.util.Set<java.lang.String>> r14 = r12.f13846c
                    java.util.Set r2 = p013kotlin.collections.v.r1(r5)
                    r0.f13849n = r12
                    r0.f13850o = r13
                    r0.f13853r = r3
                    java.lang.Object r14 = r14.emit(r2, r0)
                    if (r14 != r1) goto La8
                La7:
                    return r1
                La8:
                    r0 = r12
                La9:
                    kotlin.jvm.internal.n0<int[]> r14 = r0.f13844a
                    r14.f86529a = r13
                    jn0.h0 r13 = jn0.h0.f84049a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.x0.c.b.emit(int[], kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int[] iArr, boolean z11, String[] strArr, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f13839q = iArr;
            this.f13840r = z11;
            this.f13841s = strArr;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            c cVar = x0.this.new c(this.f13839q, this.f13840r, this.f13841s, continuation);
            cVar.f13837o = obj;
            return cVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Set<? extends String>> flowCollector, Continuation<? super jn0.h0> continuation) {
            return invoke2((FlowCollector<? super Set<String>>) flowCollector, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext((p013kotlin.coroutines.CoroutineContext) r12, r5, r11) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
        
            if (r12.a(r4, r11) == r0) goto L28;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f13836n
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L33
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L23
                if (r1 == r3) goto L1a
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                jn0.t.b(r12)     // Catch: java.lang.Throwable -> L1f
                goto L95
            L1f:
                r0 = move-exception
                r12 = r0
                goto L9b
            L23:
                java.lang.Object r1 = r11.f13837o
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r12)
                goto L71
            L2b:
                java.lang.Object r1 = r11.f13837o
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r12)
                goto L5d
            L33:
                jn0.t.b(r12)
                java.lang.Object r12 = r11.f13837o
                kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
                androidx.room.x0 r1 = androidx.room.x0.this
                androidx.room.r r1 = androidx.room.x0.e(r1)
                int[] r6 = r11.f13839q
                boolean r1 = r1.c(r6)
                if (r1 == 0) goto L73
                androidx.room.x0 r1 = androidx.room.x0.this
                androidx.room.b0 r1 = androidx.room.x0.d(r1)
                r11.f13837o = r12
                r11.f13836n = r5
                r5 = 0
                java.lang.Object r1 = wa.b.d(r1, r5, r11)
                if (r1 != r0) goto L5a
                goto L94
            L5a:
                r10 = r1
                r1 = r12
                r12 = r10
            L5d:
                kotlin.coroutines.CoroutineContext r12 = (p013kotlin.coroutines.CoroutineContext) r12
                androidx.room.x0$c$a r5 = new androidx.room.x0$c$a
                androidx.room.x0 r6 = androidx.room.x0.this
                r5.<init>(r6, r2)
                r11.f13837o = r1
                r11.f13836n = r4
                java.lang.Object r12 = kotlinx.coroutines.BuildersKt.withContext(r12, r5, r11)
                if (r12 != r0) goto L71
                goto L94
            L71:
                r7 = r1
                goto L74
            L73:
                r7 = r12
            L74:
                kotlin.jvm.internal.n0 r5 = new kotlin.jvm.internal.n0     // Catch: java.lang.Throwable -> L1f
                r5.<init>()     // Catch: java.lang.Throwable -> L1f
                androidx.room.x0 r12 = androidx.room.x0.this     // Catch: java.lang.Throwable -> L1f
                androidx.room.s r12 = androidx.room.x0.f(r12)     // Catch: java.lang.Throwable -> L1f
                androidx.room.x0$c$b r4 = new androidx.room.x0$c$b     // Catch: java.lang.Throwable -> L1f
                boolean r6 = r11.f13840r     // Catch: java.lang.Throwable -> L1f
                java.lang.String[] r8 = r11.f13841s     // Catch: java.lang.Throwable -> L1f
                int[] r9 = r11.f13839q     // Catch: java.lang.Throwable -> L1f
                r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1f
                r11.f13837o = r2     // Catch: java.lang.Throwable -> L1f
                r11.f13836n = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r12 = r12.a(r4, r11)     // Catch: java.lang.Throwable -> L1f
                if (r12 != r0) goto L95
            L94:
                return r0
            L95:
                kotlin.KotlinNothingValueException r12 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1f
                r12.<init>()     // Catch: java.lang.Throwable -> L1f
                throw r12     // Catch: java.lang.Throwable -> L1f
            L9b:
                androidx.room.x0 r0 = androidx.room.x0.this
                androidx.room.r r0 = androidx.room.x0.e(r0)
                int[] r1 = r11.f13839q
                r0.d(r1)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.x0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Set<String>> flowCollector, Continuation<? super jn0.h0> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 0}, l = {WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "notifyInvalidation", n = {"this", "$this$ifNotClosed$iv"}, s = {"L$0", "L$1"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f13854n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f13855o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f13856p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f13858r;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13856p = obj;
            this.f13858r |= Integer.MIN_VALUE;
            return x0.this.n(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/room/s0;", "connection", "", "", "<anonymous>", "(Landroidx/room/s0;)Ljava/util/Set;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", f = "InvalidationTracker.kt", i = {0}, l = {413, 420}, m = "invokeSuspend", n = {"connection"}, s = {"L$0"})
    static final class e extends SuspendLambda implements wn0.p<s0, Continuation<? super Set<? extends Integer>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f13859n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f13860o;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/room/r0;", "", "", "<anonymous>", "(Landroidx/room/r0;)Ljava/util/Set;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", f = "InvalidationTracker.kt", i = {}, l = {StatusLine.HTTP_MISDIRECTED_REQUEST}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<r0<Set<? extends Integer>>, Continuation<? super Set<? extends Integer>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f13862n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f13863o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ x0 f13864p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x0 x0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f13864p = x0Var;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(r0<Set<Integer>> r0Var, Continuation<? super Set<Integer>> continuation) {
                return ((a) create(r0Var, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f13864p, continuation);
                aVar.f13863o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f13862n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                    return obj;
                }
                jn0.t.b(obj);
                r0 r0Var = (r0) this.f13863o;
                x0 x0Var = this.f13864p;
                this.f13862n = 1;
                Object objJ = x0Var.j(r0Var, this);
                return objJ == coroutine_suspended ? coroutine_suspended : objJ;
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(s0 s0Var, Continuation<? super Set<Integer>> continuation) {
            return ((e) create(s0Var, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            e eVar = x0.this.new e(continuation);
            eVar.f13860o = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            if (r7 == r0) goto L20;
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
                int r1 = r6.f13859n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r7)     // Catch: android.database.SQLException -> L5a
                goto L57
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f13860o
                androidx.room.s0 r1 = (androidx.room.s0) r1
                jn0.t.b(r7)
                goto L35
            L22:
                jn0.t.b(r7)
                java.lang.Object r7 = r6.f13860o
                r1 = r7
                androidx.room.s0 r1 = (androidx.room.s0) r1
                r6.f13860o = r1
                r6.f13859n = r3
                java.lang.Object r7 = r1.b(r6)
                if (r7 != r0) goto L35
                goto L56
            L35:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L42
                java.util.Set r7 = p013kotlin.collections.d1.d()
                return r7
            L42:
                androidx.room.s0$a r7 = androidx.room.s0.a.IMMEDIATE     // Catch: android.database.SQLException -> L5a
                androidx.room.x0$e$a r3 = new androidx.room.x0$e$a     // Catch: android.database.SQLException -> L5a
                androidx.room.x0 r4 = androidx.room.x0.this     // Catch: android.database.SQLException -> L5a
                r5 = 0
                r3.<init>(r4, r5)     // Catch: android.database.SQLException -> L5a
                r6.f13860o = r5     // Catch: android.database.SQLException -> L5a
                r6.f13859n = r2     // Catch: android.database.SQLException -> L5a
                java.lang.Object r7 = r1.c(r7, r3, r6)     // Catch: android.database.SQLException -> L5a
                if (r7 != r0) goto L57
            L56:
                return r0
            L57:
                java.util.Set r7 = (java.util.Set) r7     // Catch: android.database.SQLException -> L5a
                return r7
            L5a:
                java.util.Set r7 = p013kotlin.collections.d1.d()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.x0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", f = "InvalidationTracker.kt", i = {}, l = {389}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f13865n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f13867p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(wn0.a<jn0.h0> aVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f13867p = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return x0.this.new f(this.f13867p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f13865n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    x0 x0Var = x0.this;
                    this.f13865n = 1;
                    obj = x0Var.n(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                this.f13867p.invoke();
                return jn0.h0.f84049a;
            } catch (Throwable th2) {
                this.f13867p.invoke();
                throw th2;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC4419g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE}, m = "startTrackingTable", n = {"this", "connection", "tableId", "this", "connection", "tableName", "tableId"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f13868n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f13869o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f13870p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f13871q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f13872r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f13873s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f13874t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f13875u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f13877w;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13875u = obj;
            this.f13877w |= Integer.MIN_VALUE;
            return x0.this.v(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 0}, l = {342}, m = "stopTrackingTable", n = {"connection", "tableName"}, s = {"L$0", "L$1"})
    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f13878n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f13879o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f13880p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f13881q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f13882r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f13883s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f13885u;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13883s = obj;
            this.f13885u |= Integer.MIN_VALUE;
            return x0.this.w(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0}, l = {300}, m = "syncTriggers$room_runtime_release", n = {"$this$ifNotClosed$iv"}, s = {"L$0"})
    static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f13886n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f13887o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f13889q;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13887o = obj;
            this.f13889q |= Integer.MIN_VALUE;
            return x0.this.x(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/room/s0;", "connection", "Ljn0/h0;", "<anonymous>", "(Landroidx/room/s0;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", f = "InvalidationTracker.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {"connection"}, s = {"L$0"})
    static final class j extends SuspendLambda implements wn0.p<s0, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f13890n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f13891o;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/room/r0;", "Ljn0/h0;", "<anonymous>", "(Landroidx/room/r0;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1", f = "InvalidationTracker.kt", i = {0, 0, 1, 1}, l = {EnumC4419g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE}, m = "invokeSuspend", n = {"$this$forEachIndexed$iv", "index$iv", "$this$forEachIndexed$iv", "index$iv"}, s = {"L$0", "I$0", "L$0", "I$0"})
        static final class a extends SuspendLambda implements wn0.p<r0<jn0.h0>, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f13893n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f13894o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f13895p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f13896q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f13897r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f13898s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f13899t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ r.a[] f13900u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ x0 f13901v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ s0 f13902w;

            /* JADX INFO: renamed from: androidx.room.x0$j$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public /* synthetic */ class C0232a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f13903a;

                static {
                    int[] iArr = new int[r.a.values().length];
                    try {
                        iArr[r.a.NO_OP.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[r.a.ADD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[r.a.REMOVE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f13903a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r.a[] aVarArr, x0 x0Var, s0 s0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f13900u = aVarArr;
                this.f13901v = x0Var;
                this.f13902w = s0Var;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(r0<jn0.h0> r0Var, Continuation<? super jn0.h0> continuation) {
                return ((a) create(r0Var, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f13900u, this.f13901v, this.f13902w, continuation);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x003e  */
            /* JADX WARN: Code duplicated, block: B:26:0x0086  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0086 -> B:27:0x0087). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r11.f13899t
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r3) goto Le
                    if (r1 != r2) goto L24
                Le:
                    int r1 = r11.f13898s
                    int r4 = r11.f13897r
                    int r5 = r11.f13896q
                    java.lang.Object r6 = r11.f13895p
                    androidx.room.s0 r6 = (androidx.room.s0) r6
                    java.lang.Object r7 = r11.f13894o
                    androidx.room.x0 r7 = (androidx.room.x0) r7
                    java.lang.Object r8 = r11.f13893n
                    androidx.room.r$a[] r8 = (androidx.room.r.a[]) r8
                    jn0.t.b(r12)
                    goto L68
                L24:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L2c:
                    jn0.t.b(r12)
                    androidx.room.r$a[] r12 = r11.f13900u
                    androidx.room.x0 r1 = r11.f13901v
                    androidx.room.s0 r4 = r11.f13902w
                    int r5 = r12.length
                    r6 = 0
                    r8 = r12
                    r7 = r1
                    r12 = r4
                    r1 = r5
                    r4 = r6
                L3c:
                    if (r4 >= r1) goto L89
                    r5 = r8[r4]
                    int r9 = r6 + 1
                    int[] r10 = androidx.room.x0.j.a.C0232a.f13903a
                    int r5 = r5.ordinal()
                    r5 = r10[r5]
                    if (r5 == r3) goto L86
                    if (r5 == r2) goto L71
                    r10 = 3
                    if (r5 != r10) goto L6b
                    r11.f13893n = r8
                    r11.f13894o = r7
                    r11.f13895p = r12
                    r11.f13896q = r9
                    r11.f13897r = r4
                    r11.f13898s = r1
                    r11.f13899t = r2
                    java.lang.Object r5 = androidx.room.x0.i(r7, r12, r6, r11)
                    if (r5 != r0) goto L66
                    goto L85
                L66:
                    r6 = r12
                    r5 = r9
                L68:
                    r12 = r6
                    r6 = r5
                    goto L87
                L6b:
                    kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                    r12.<init>()
                    throw r12
                L71:
                    r11.f13893n = r8
                    r11.f13894o = r7
                    r11.f13895p = r12
                    r11.f13896q = r9
                    r11.f13897r = r4
                    r11.f13898s = r1
                    r11.f13899t = r3
                    java.lang.Object r5 = androidx.room.x0.h(r7, r12, r6, r11)
                    if (r5 != r0) goto L66
                L85:
                    return r0
                L86:
                    r6 = r9
                L87:
                    int r4 = r4 + r3
                    goto L3c
                L89:
                    jn0.h0 r12 = jn0.h0.f84049a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.x0.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(s0 s0Var, Continuation<? super jn0.h0> continuation) {
            return ((j) create(s0Var, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            j jVar = x0.this.new j(continuation);
            jVar.f13891o = obj;
            return jVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        
            if (r1.c(r3, r4, r7) == r0) goto L21;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f13890n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r8)
                goto L61
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f13891o
                androidx.room.s0 r1 = (androidx.room.s0) r1
                jn0.t.b(r8)
                goto L35
            L22:
                jn0.t.b(r8)
                java.lang.Object r8 = r7.f13891o
                r1 = r8
                androidx.room.s0 r1 = (androidx.room.s0) r1
                r7.f13891o = r1
                r7.f13890n = r3
                java.lang.Object r8 = r1.b(r7)
                if (r8 != r0) goto L35
                goto L60
            L35:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L40
                jn0.h0 r8 = jn0.h0.f84049a
                return r8
            L40:
                androidx.room.x0 r8 = androidx.room.x0.this
                androidx.room.r r8 = androidx.room.x0.e(r8)
                androidx.room.r$a[] r8 = r8.b()
                if (r8 == 0) goto L61
                androidx.room.s0$a r3 = androidx.room.s0.a.IMMEDIATE
                androidx.room.x0$j$a r4 = new androidx.room.x0$j$a
                androidx.room.x0 r5 = androidx.room.x0.this
                r6 = 0
                r4.<init>(r8, r5, r1, r6)
                r7.f13891o = r6
                r7.f13890n = r2
                java.lang.Object r8 = r1.c(r3, r4, r7)
                if (r8 != r0) goto L61
            L60:
                return r0
            L61:
                jn0.h0 r8 = jn0.h0.f84049a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.x0.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x0(b0 database, Map<String, String> shadowTablesMap, Map<String, ? extends Set<String>> viewTables, String[] tableNames, boolean z11, wn0.l<? super Set<Integer>, jn0.h0> onInvalidatedTablesIds) {
        String lowerCase;
        p013kotlin.jvm.internal.s.k(database, "database");
        p013kotlin.jvm.internal.s.k(shadowTablesMap, "shadowTablesMap");
        p013kotlin.jvm.internal.s.k(viewTables, "viewTables");
        p013kotlin.jvm.internal.s.k(tableNames, "tableNames");
        p013kotlin.jvm.internal.s.k(onInvalidatedTablesIds, "onInvalidatedTablesIds");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.useTempTable = z11;
        this.onInvalidatedTablesIds = onInvalidatedTablesIds;
        this.pendingRefresh = new AtomicBoolean(false);
        this.onAllowRefresh = new wn0.a() { // from class: androidx.room.w0
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(x0.o());
            }
        };
        this.tableIdLookup = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i11 = 0; i11 < length; i11++) {
            String str = tableNames[i11];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            p013kotlin.jvm.internal.s.j(lowerCase2, "toLowerCase(...)");
            this.tableIdLookup.put(lowerCase2, Integer.valueOf(i11));
            String str2 = this.shadowTablesMap.get(tableNames[i11]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i11] = lowerCase2;
        }
        this.tablesNames = strArr;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = value.toLowerCase(locale2);
            p013kotlin.jvm.internal.s.j(lowerCase3, "toLowerCase(...)");
            if (this.tableIdLookup.containsKey(lowerCase3)) {
                String lowerCase4 = entry.getKey().toLowerCase(locale2);
                p013kotlin.jvm.internal.s.j(lowerCase4, "toLowerCase(...)");
                Map<String, Integer> map = this.tableIdLookup;
                map.put(lowerCase4, (Integer) p013kotlin.collections.v0.j(map, lowerCase3));
            }
        }
        this.observedTableStates = new r(this.tablesNames.length);
        this.observedTableVersions = new s(this.tablesNames.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(u uVar, Continuation<? super Set<Integer>> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f13835q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f13835q = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objD = bVar.f13833o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f13835q;
        if (i12 == 0) {
            jn0.t.b(objD);
            wn0.l lVar = new wn0.l() { // from class: androidx.room.v0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return x0.k((ya.d) obj);
                }
            };
            bVar.f13832n = uVar;
            bVar.f13835q = 1;
            objD = uVar.d("SELECT * FROM room_table_modification_log WHERE invalidated = 1", lVar, bVar);
            if (objD != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) bVar.f13832n;
            jn0.t.b(objD);
            return set;
        }
        uVar = (u) bVar.f13832n;
        jn0.t.b(objD);
        Set set2 = (Set) objD;
        if (!set2.isEmpty()) {
            bVar.f13832n = set2;
            bVar.f13835q = 2;
            if (u0.b(uVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return set2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set k(ya.d statement) {
        p013kotlin.jvm.internal.s.k(statement, "statement");
        Set setB = d1.b();
        while (statement.I1()) {
            setB.add(Integer.valueOf((int) statement.getLong(0)));
        }
        return d1.a(setB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(Continuation<? super Set<Integer>> continuation) throws Throwable {
        d dVar;
        ra.a aVar;
        Throwable th2;
        x0 x0Var;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f13858r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f13858r = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f13856p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f13858r;
        if (i12 == 0) {
            jn0.t.b(obj);
            ra.a closeBarrier = this.database.getCloseBarrier();
            if (!closeBarrier.a()) {
                return d1.d();
            }
            try {
                if (!this.pendingRefresh.compareAndSet(true, false)) {
                    Set setD = d1.d();
                    closeBarrier.d();
                    return setD;
                }
                if (!this.onAllowRefresh.invoke().booleanValue()) {
                    Set setD2 = d1.d();
                    closeBarrier.d();
                    return setD2;
                }
                b0 b0Var = this.database;
                e eVar = new e(null);
                dVar.f13854n = this;
                dVar.f13855o = closeBarrier;
                dVar.f13858r = 1;
                Object objUseConnection$room_runtime_release = b0Var.useConnection$room_runtime_release(false, eVar, dVar);
                if (objUseConnection$room_runtime_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar = closeBarrier;
                obj = objUseConnection$room_runtime_release;
                x0Var = this;
            } catch (Throwable th3) {
                aVar = closeBarrier;
                th2 = th3;
                aVar.d();
                throw th2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (ra.a) dVar.f13855o;
            x0Var = (x0) dVar.f13854n;
            try {
                jn0.t.b(obj);
            } catch (Throwable th4) {
                th2 = th4;
                aVar.d();
                throw th2;
            }
        }
        Set<Integer> set = (Set) obj;
        if (!set.isEmpty()) {
            x0Var.observedTableVersions.b(set);
            x0Var.onInvalidatedTablesIds.invoke(set);
        }
        aVar.d();
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o() {
        return true;
    }

    private final String[] t(String[] names) {
        Set setB = d1.b();
        for (String str : names) {
            Map<String, Set<String>> map = this.viewTables;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
            Set<String> set = map.get(lowerCase);
            if (set != null) {
                setB.addAll(set);
            } else {
                setB.add(str);
            }
        }
        return (String[]) d1.a(setB).toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:30:0x0107  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ff, code lost:
    
        if (androidx.room.u0.b(r11, r3, r4) == r5) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ff -> B:29:0x0102). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(androidx.room.u r18, int r19, p013kotlin.coroutines.Continuation<? super jn0.h0> r20) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.x0.v(androidx.room.u, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:18:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0085 -> B:20:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object w(androidx.room.u r10, int r11, p013kotlin.coroutines.Continuation<? super jn0.h0> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.room.x0.h
            if (r0 == 0) goto L13
            r0 = r12
            androidx.room.x0$h r0 = (androidx.room.x0.h) r0
            int r1 = r0.f13885u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13885u = r1
            goto L18
        L13:
            androidx.room.x0$h r0 = new androidx.room.x0$h
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f13883s
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f13885u
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r10 = r0.f13882r
            int r11 = r0.f13881q
            java.lang.Object r2 = r0.f13880p
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.Object r4 = r0.f13879o
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.f13878n
            androidx.room.u r5 = (androidx.room.u) r5
            jn0.t.b(r12)
            r12 = r4
            goto L87
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            jn0.t.b(r12)
            java.lang.String[] r12 = r9.tablesNames
            r11 = r12[r11]
            java.lang.String[] r12 = androidx.room.x0.f13820m
            int r2 = r12.length
            r4 = 0
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r12
            r12 = r8
        L52:
            if (r4 >= r10) goto L8b
            r5 = r2[r4]
            androidx.room.x0$a r6 = androidx.room.x0.INSTANCE
            java.lang.String r5 = androidx.room.x0.Companion.a(r6, r12, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "DROP TRIGGER IF EXISTS `"
            r6.append(r7)
            r6.append(r5)
            r5 = 96
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.f13878n = r11
            r0.f13879o = r12
            r0.f13880p = r2
            r0.f13881q = r4
            r0.f13882r = r10
            r0.f13885u = r3
            java.lang.Object r5 = androidx.room.u0.b(r11, r5, r0)
            if (r5 != r1) goto L85
            return r1
        L85:
            r5 = r11
            r11 = r4
        L87:
            int r4 = r11 + 1
            r11 = r5
            goto L52
        L8b:
            jn0.h0 r10 = jn0.h0.f84049a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.x0.w(androidx.room.u, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void l(ya.b connection) throws Exception {
        p013kotlin.jvm.internal.s.k(connection, "connection");
        ya.d dVarL1 = connection.L1("PRAGMA query_only");
        try {
            dVarL1.I1();
            boolean z11 = dVarL1.getBoolean(0);
            un0.a.a(dVarL1, null);
            if (z11) {
                return;
            }
            ya.a.a(connection, "PRAGMA temp_store = MEMORY");
            ya.a.a(connection, "PRAGMA recursive_triggers = 1");
            ya.a.a(connection, "DROP TABLE IF EXISTS room_table_modification_log");
            if (this.useTempTable) {
                ya.a.a(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            } else {
                ya.a.a(connection, p013kotlin.text.t.V("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false, 4, null));
            }
            this.observedTableStates.a();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(dVarL1, th2);
                throw th3;
            }
        }
    }

    public final Flow<Set<String>> m(String[] resolvedTableNames, int[] tableIds, boolean emitInitialState) {
        p013kotlin.jvm.internal.s.k(resolvedTableNames, "resolvedTableNames");
        p013kotlin.jvm.internal.s.k(tableIds, "tableIds");
        return FlowKt.flow(new c(tableIds, emitInitialState, resolvedTableNames, null));
    }

    public final boolean p(int[] tableIds) {
        p013kotlin.jvm.internal.s.k(tableIds, "tableIds");
        return this.observedTableStates.c(tableIds);
    }

    public final boolean q(int[] tableIds) {
        p013kotlin.jvm.internal.s.k(tableIds, "tableIds");
        return this.observedTableStates.d(tableIds);
    }

    public final void r(wn0.a<jn0.h0> onRefreshScheduled, wn0.a<jn0.h0> onRefreshCompleted) {
        p013kotlin.jvm.internal.s.k(onRefreshScheduled, "onRefreshScheduled");
        p013kotlin.jvm.internal.s.k(onRefreshCompleted, "onRefreshCompleted");
        if (this.pendingRefresh.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            BuildersKt__Builders_commonKt.launch$default(this.database.getCoroutineScope(), new CoroutineName("Room Invalidation Tracker Refresh"), null, new f(onRefreshCompleted, null), 2, null);
        }
    }

    public final void s() {
        this.observedTableStates.e();
    }

    public final void u(wn0.a<Boolean> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.onAllowRefresh = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(Continuation<? super jn0.h0> continuation) throws Throwable {
        i iVar;
        ra.a aVar;
        Throwable th2;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i11 = iVar.f13889q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f13889q = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object obj = iVar.f13887o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = iVar.f13889q;
        if (i12 == 0) {
            jn0.t.b(obj);
            ra.a closeBarrier = this.database.getCloseBarrier();
            if (closeBarrier.a()) {
                try {
                    b0 b0Var = this.database;
                    j jVar = new j(null);
                    iVar.f13886n = closeBarrier;
                    iVar.f13889q = 1;
                    if (b0Var.useConnection$room_runtime_release(false, jVar, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    aVar = closeBarrier;
                    aVar.d();
                } catch (Throwable th3) {
                    aVar = closeBarrier;
                    th2 = th3;
                    aVar.d();
                    throw th2;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (ra.a) iVar.f13886n;
            try {
                jn0.t.b(obj);
                aVar.d();
            } catch (Throwable th4) {
                th2 = th4;
                aVar.d();
                throw th2;
            }
        }
        return jn0.h0.f84049a;
    }

    public final Pair<String[], int[]> y(String[] names) {
        p013kotlin.jvm.internal.s.k(names, "names");
        String[] strArrT = t(names);
        int length = strArrT.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            String str = strArrT[i11];
            Map<String, Integer> map = this.tableIdLookup;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            iArr[i11] = num.intValue();
        }
        return jn0.x.a(strArrT, iArr);
    }
}
