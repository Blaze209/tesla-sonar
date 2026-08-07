package androidx.compose.runtime.snapshots;

import androidx.collection.k0;
import androidx.collection.l0;
import androidx.collection.n0;
import androidx.collection.v0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import jn0.h0;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.jvm.internal.u0;
import p020r2.a2;
import p020r2.i0;
import p020r2.m3;
import p020r2.n3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001'B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0019\u001a\u00020\u0018\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u001e\u001a\u00020\u0004\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0006\u0010\u001b\u001a\u00028\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00042\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b#\u0010\u0007J\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\fJ\r\u0010%\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\fJ\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\fR&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R(\u0010-\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010)j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R,\u00105\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0004018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010(R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0018088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010/R\u0018\u0010C\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010E¨\u0006G"}, d2 = {"Landroidx/compose/runtime/snapshots/l;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "Ljn0/h0;", "onChangedExecutor", "<init>", "(Lwn0/l;)V", "", "m", "()Z", "r", "()V", "", "set", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/Set;)V", "p", "()Ljava/util/Set;", "", "q", "()Ljava/lang/Void;", "T", "onChanged", "Landroidx/compose/runtime/snapshots/l$a;", "n", "(Lwn0/l;)Landroidx/compose/runtime/snapshots/l$a;", "scope", "onValueChangedForScope", "block", "o", "(Ljava/lang/Object;Lwn0/l;Lwn0/a;)V", "k", "(Ljava/lang/Object;)V", "predicate", "l", "s", "t", "j", "a", "Lwn0/l;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingChanges", "c", "Z", "sendingNotifications", "Lkotlin/Function2;", "Landroidx/compose/runtime/snapshots/g;", DateTokenConverter.CONVERTER_KEY, "Lwn0/p;", "applyObserver", "e", "readObserver", "Lt2/b;", "f", "Lt2/b;", "observedScopeMaps", "Lb3/b;", "g", "Lb3/b;", "applyUnsubscribe", "h", "isPaused", "Landroidx/compose/runtime/snapshots/l$a;", "currentMap", "", "J", "currentMapThreadId", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f5211k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<wn0.a<h0>, h0> onChangedExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean sendingNotifications;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private b3.b applyUnsubscribe;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isPaused;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private a currentMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<Set<? extends Object>, g, h0> applyObserver = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Object, h0> readObserver = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t2.b<a> observedScopeMaps = new t2.b<>(new a[16], 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long currentMapThreadId = -1;

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0011J7\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u0011J!\u0010\u001d\u001a\u00020\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001b0\u0002¢\u0006\u0004\b\u001d\u0010\u0006J\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u00020\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\u00032\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0003¢\u0006\u0004\b*\u0010!R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00101R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00105R&\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00010:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010;R\u001e\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010>R\u0017\u0010D\u001a\u00020@8\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00103R$\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030&048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00105R<\u0010J\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030&\u0012\u0006\u0012\u0004\u0018\u00010\u00010Gj\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030&\u0012\u0006\u0012\u0004\u0018\u00010\u0001`H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010I¨\u0006K"}, d2 = {"Landroidx/compose/runtime/snapshots/l$a;", "", "Lkotlin/Function1;", "Ljn0/h0;", "onChanged", "<init>", "(Lwn0/l;)V", "value", "", "currentToken", "currentScope", "Landroidx/collection/h0;", "recordedValues", "l", "(Ljava/lang/Object;ILjava/lang/Object;Landroidx/collection/h0;)V", "scope", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)V", "m", "(Ljava/lang/Object;Ljava/lang/Object;)V", "k", "readObserver", "Lkotlin/Function0;", "block", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Lwn0/l;Lwn0/a;)V", "e", "", "predicate", "n", "g", "()Z", "c", "()V", "", "changes", "j", "(Ljava/util/Set;)Z", "Lr2/h0;", "derivedState", "o", "(Lr2/h0;)V", "h", "a", "Lwn0/l;", "f", "()Lwn0/l;", "b", "Ljava/lang/Object;", "Landroidx/collection/h0;", "currentScopeReads", "I", "Lt2/f;", "Lt2/f;", "valueToScopes", "Landroidx/collection/k0;", "Landroidx/collection/k0;", "scopeToValues", "Landroidx/collection/l0;", "Landroidx/collection/l0;", "invalidated", "Lt2/b;", "Lt2/b;", "statesToReread", "Lr2/i0;", "Lr2/i0;", "getDerivedStateObserver", "()Lr2/i0;", "derivedStateObserver", "deriveStateScopeCount", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "recordedDerivedStateValues", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final wn0.l<Object, h0> onChanged;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Object currentScope;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private androidx.collection.h0<Object> currentScopeReads;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private int deriveStateScopeCount;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int currentToken = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final t2.f<Object, Object> valueToScopes = new t2.f<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final k0<Object, androidx.collection.h0<Object>> scopeToValues = new k0<>(0, 1, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final l0<Object> invalidated = new l0<>(0, 1, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final t2.b<p020r2.h0<?>> statesToReread = new t2.b<>(new p020r2.h0[16], 0);

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final i0 derivedStateObserver = new C0117a();

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final t2.f<Object, p020r2.h0<?>> dependencyToDerivedStates = new t2.f<>();

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final HashMap<p020r2.h0<?>, Object> recordedDerivedStateValues = new HashMap<>();

        /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/runtime/snapshots/l$a$a", "Lr2/i0;", "Lr2/h0;", "derivedState", "Ljn0/h0;", "a", "(Lr2/h0;)V", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C0117a implements i0 {
            C0117a() {
            }

            @Override // p020r2.i0
            public void a(p020r2.h0<?> derivedState) {
                a.this.deriveStateScopeCount++;
            }

            @Override // p020r2.i0
            public void b(p020r2.h0<?> derivedState) {
                a.this.deriveStateScopeCount--;
            }
        }

        public a(wn0.l<Object, h0> lVar) {
            this.onChanged = lVar;
        }

        private final void d(Object scope) {
            int i11 = this.currentToken;
            androidx.collection.h0<Object> h0Var = this.currentScopeReads;
            if (h0Var == null) {
                return;
            }
            long[] jArr = h0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j11) < 128) {
                            int i15 = (i12 << 3) + i14;
                            Object obj = h0Var.keys[i15];
                            boolean z11 = h0Var.values[i15] != i11;
                            if (z11) {
                                m(scope, obj);
                            }
                            if (z11) {
                                h0Var.q(i15);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        return;
                    }
                }
                if (i12 == length) {
                    return;
                } else {
                    i12++;
                }
            }
        }

        private final void l(Object value, int currentToken, Object currentScope, androidx.collection.h0<Object> recordedValues) {
            int i11;
            int i12;
            int i13;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int iP = recordedValues.p(value, currentToken, -1);
            int i14 = 2;
            if (!(value instanceof p020r2.h0) || iP == currentToken) {
                i11 = 2;
                i12 = -1;
            } else {
                r2.h0.a aVarA = ((p020r2.h0) value).A();
                this.recordedDerivedStateValues.put(value, aVarA.a());
                n0<b3.k> n0VarB = aVarA.b();
                t2.f<Object, p020r2.h0<?>> fVar = this.dependencyToDerivedStates;
                fVar.g(value);
                Object[] objArr = n0VarB.keys;
                long[] jArr = n0VarB.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j11 = jArr[i15];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j11 & 255) < 128) {
                                    i13 = i14;
                                    b3.k kVar = (b3.k) objArr[(i15 << 3) + i17];
                                    if (kVar instanceof b3.l) {
                                        ((b3.l) kVar).E(e.a(i13));
                                    }
                                    fVar.a(kVar, value);
                                } else {
                                    i13 = i14;
                                }
                                j11 >>= 8;
                                i17++;
                                i14 = i13;
                            }
                            i11 = i14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            i11 = i14;
                        }
                        if (i15 == length) {
                            break;
                        }
                        i15++;
                        i14 = i11;
                    }
                } else {
                    i11 = 2;
                }
                i12 = -1;
            }
            if (iP == i12) {
                if (value instanceof b3.l) {
                    ((b3.l) value).E(e.a(i11));
                }
                this.valueToScopes.a(value, currentScope);
            }
        }

        private final void m(Object scope, Object value) {
            this.valueToScopes.f(value, scope);
            if (!(value instanceof p020r2.h0) || this.valueToScopes.c(value)) {
                return;
            }
            this.dependencyToDerivedStates.g(value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void c() {
            this.valueToScopes.b();
            this.scopeToValues.i();
            this.dependencyToDerivedStates.b();
            this.recordedDerivedStateValues.clear();
        }

        public final void e(Object scope) {
            androidx.collection.h0<Object> h0VarP = this.scopeToValues.p(scope);
            if (h0VarP == null) {
                return;
            }
            Object[] objArr = h0VarP.keys;
            int[] iArr = h0VarP.values;
            long[] jArr = h0VarP.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
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
                            int i14 = (i11 << 3) + i13;
                            Object obj = objArr[i14];
                            int i15 = iArr[i14];
                            m(scope, obj);
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

        public final wn0.l<Object, h0> f() {
            return this.onChanged;
        }

        public final boolean g() {
            return this.scopeToValues.g();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0044 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:15:0x0046 A[LOOP:0: B:5:0x0011->B:15:0x0046, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:19:0x0049 A[EDGE_INSN: B:19:0x0049->B:16:0x0049 BREAK  A[LOOP:0: B:5:0x0011->B:15:0x0046], SYNTHETIC] */
        public final void h() {
            l0<Object> l0Var = this.invalidated;
            wn0.l<Object, h0> lVar = this.onChanged;
            Object[] objArr = l0Var.elements;
            long[] jArr = l0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i11 != length) {
                            break;
                            break;
                        }
                        i11++;
                    } else {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                lVar.invoke(objArr[(i11 << 3) + i13]);
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 != length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
            l0Var.m();
        }

        public final void i(Object scope, wn0.l<Object, h0> readObserver, wn0.a<h0> block) {
            Object obj = this.currentScope;
            androidx.collection.h0<Object> h0Var = this.currentScopeReads;
            int i11 = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = this.scopeToValues.c(scope);
            if (this.currentToken == -1) {
                this.currentToken = j.H().getId();
            }
            i0 i0Var = this.derivedStateObserver;
            t2.b<i0> bVarC = n3.c();
            try {
                bVarC.b(i0Var);
                g.INSTANCE.h(readObserver, null, block);
                bVarC.v(bVarC.getSize() - 1);
                Object obj2 = this.currentScope;
                s.h(obj2);
                d(obj2);
                this.currentScope = obj;
                this.currentScopeReads = h0Var;
                this.currentToken = i11;
            } catch (Throwable th2) {
                bVarC.v(bVarC.getSize() - 1);
                throw th2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0243  */
        /* JADX WARN: Code duplicated, block: B:118:0x029d A[DONT_INVERT, PHI: r11
          0x029d: PHI (r11v42 boolean) = (r11v41 boolean), (r11v43 boolean) binds: [B:109:0x0274, B:117:0x029b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:119:0x029f A[LOOP:6: B:108:0x026a->B:119:0x029f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:177:0x040a A[DONT_INVERT, PHI: r13
          0x040a: PHI (r13v5 boolean) = (r13v4 boolean), (r13v7 boolean) binds: [B:168:0x03dd, B:176:0x0408] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:178:0x040c A[LOOP:14: B:167:0x03cf->B:178:0x040c, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:214:0x04c9 A[DONT_INVERT, PHI: r11
          0x04c9: PHI (r11v14 boolean) = (r11v13 boolean), (r11v15 boolean) binds: [B:205:0x04a0, B:213:0x04c7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:215:0x04cb A[LOOP:18: B:204:0x0496->B:215:0x04cb, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:218:0x04da  */
        /* JADX WARN: Code duplicated, block: B:262:0x015f A[EDGE_INSN: B:262:0x015f->B:59:0x015f BREAK  A[LOOP:4: B:46:0x011a->B:58:0x0156], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:267:0x02a7 A[EDGE_INSN: B:267:0x02a7->B:121:0x02a7 BREAK  A[LOOP:6: B:108:0x026a->B:119:0x029f], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:271:0x024f A[EDGE_INSN: B:271:0x024f->B:101:0x024f BREAK  A[LOOP:8: B:86:0x01ff->B:97:0x0234], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:286:0x0413 A[EDGE_INSN: B:286:0x0413->B:179:0x0413 BREAK  A[LOOP:14: B:167:0x03cf->B:178:0x040c], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:294:0x04de A[EDGE_INSN: B:294:0x04de->B:219:0x04de BREAK  A[LOOP:18: B:204:0x0496->B:215:0x04cb], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x0154 A[DONT_INVERT, PHI: r39
          0x0154: PHI (r39v2 boolean) = (r39v1 boolean), (r39v4 boolean) binds: [B:47:0x0128, B:56:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:58:0x0156 A[LOOP:4: B:46:0x011a->B:58:0x0156, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:96:0x0232 A[DONT_INVERT, PHI: r11
          0x0232: PHI (r11v51 boolean) = (r11v50 boolean), (r11v52 boolean) binds: [B:87:0x0209, B:95:0x0230] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:97:0x0234 A[LOOP:8: B:86:0x01ff->B:97:0x0234, LOOP_END] */
        public final boolean j(Set<? extends Object> changes) {
            boolean z11;
            Iterator it;
            t2.f<Object, p020r2.h0<?>> fVar;
            Object objC;
            long[] jArr;
            Iterator it2;
            t2.f<Object, p020r2.h0<?>> fVar2;
            long[] jArr2;
            long[] jArr3;
            t2.f<Object, Object> fVar3;
            Object[] objArr;
            String str;
            int i11;
            t2.f<Object, Object> fVar4;
            Object[] objArr2;
            String str2;
            int i12;
            int i13;
            long j11;
            int i14;
            int i15;
            Object objC2;
            Object[] objArr3;
            int i16;
            long j12;
            t2.f<Object, p020r2.h0<?>> fVar5 = this.dependencyToDerivedStates;
            HashMap<p020r2.h0<?>, Object> map = this.recordedDerivedStateValues;
            t2.f<Object, Object> fVar6 = this.valueToScopes;
            l0<Object> l0Var = this.invalidated;
            String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            int i17 = 8;
            int i18 = 0;
            if (changes instanceof t2.d) {
                v0 v0VarB = ((t2.d) changes).b();
                Object[] objArr4 = v0VarB.elements;
                long[] jArr4 = v0VarB.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                int length = jArr4.length - 2;
                if (length >= 0) {
                    int i19 = 0;
                    z11 = false;
                    while (true) {
                        long j13 = jArr4[i19];
                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i21 = 8 - ((~(i19 - length)) >>> 31);
                            int i22 = 0;
                            while (i22 < i21) {
                                if ((j13 & 255) < 128) {
                                    int i23 = i17;
                                    Object obj = objArr4[(i19 << 3) + i22];
                                    if (obj instanceof b3.l) {
                                        fVar4 = fVar6;
                                        if (!((b3.l) obj).D(e.a(2))) {
                                            objArr2 = objArr4;
                                            str2 = str3;
                                            i12 = length;
                                            i13 = i19;
                                            j11 = j13;
                                            i14 = i21;
                                        }
                                        i15 = 8;
                                    } else {
                                        fVar4 = fVar6;
                                    }
                                    if (!fVar5.c(obj) || (objC2 = fVar5.d().c(obj)) == null) {
                                        objArr2 = objArr4;
                                        str2 = str3;
                                        i12 = length;
                                        i13 = i19;
                                        j11 = j13;
                                        i14 = i21;
                                    } else if (objC2 instanceof l0) {
                                        l0 l0Var2 = (l0) objC2;
                                        Object[] objArr5 = l0Var2.elements;
                                        long[] jArr5 = l0Var2.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                        int length2 = jArr5.length - 2;
                                        if (length2 >= 0) {
                                            j11 = j13;
                                            int i24 = 0;
                                            boolean z12 = z11;
                                            while (true) {
                                                long j14 = jArr5[i24];
                                                i12 = length;
                                                i13 = i19;
                                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i25 = 8 - ((~(i24 - length2)) >>> 31);
                                                    int i26 = 0;
                                                    while (i26 < i25) {
                                                        if ((j14 & 255) < 128) {
                                                            objArr3 = objArr4;
                                                            p020r2.h0<?> h0Var = (p020r2.h0) objArr5[(i24 << 3) + i26];
                                                            s.i(h0Var, str3);
                                                            i16 = i26;
                                                            Object obj2 = map.get(h0Var);
                                                            m3<?> m3VarE = h0Var.e();
                                                            if (m3VarE == null) {
                                                                m3VarE = n3.q();
                                                            }
                                                            j12 = j14;
                                                            if (m3VarE.a(h0Var.A().a(), obj2)) {
                                                                str3 = str3;
                                                                this.statesToReread.b(h0Var);
                                                            } else {
                                                                Object objC3 = fVar4.d().c(h0Var);
                                                                if (objC3 != null) {
                                                                    if (objC3 instanceof l0) {
                                                                        l0 l0Var3 = (l0) objC3;
                                                                        Object[] objArr6 = l0Var3.elements;
                                                                        long[] jArr6 = l0Var3.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                                                        int length3 = jArr6.length - 2;
                                                                        if (length3 >= 0) {
                                                                            boolean z13 = z12;
                                                                            int i27 = 0;
                                                                            while (true) {
                                                                                long j15 = jArr6[i27];
                                                                                long[] jArr7 = jArr6;
                                                                                str3 = str3;
                                                                                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                    if (i27 != length3) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i27++;
                                                                                    str3 = str3;
                                                                                    jArr6 = jArr7;
                                                                                    i23 = 8;
                                                                                } else {
                                                                                    int i28 = 8 - ((~(i27 - length3)) >>> 31);
                                                                                    for (int i29 = 0; i29 < i28; i29++) {
                                                                                        if ((j15 & 255) < 128) {
                                                                                            l0Var.h(objArr6[(i27 << 3) + i29]);
                                                                                            z13 = true;
                                                                                        }
                                                                                        j15 >>= i23;
                                                                                    }
                                                                                    if (i28 != i23) {
                                                                                        break;
                                                                                    }
                                                                                    if (i27 != length3) {
                                                                                        break;
                                                                                    }
                                                                                    i27++;
                                                                                    str3 = str3;
                                                                                    jArr6 = jArr7;
                                                                                    i23 = 8;
                                                                                }
                                                                            }
                                                                            z12 = z13;
                                                                        }
                                                                    } else {
                                                                        str3 = str3;
                                                                        l0Var.h(objC3);
                                                                        z12 = true;
                                                                    }
                                                                }
                                                            }
                                                            j14 = j12 >> 8;
                                                            i26 = i16 + 1;
                                                            i23 = 8;
                                                            objArr4 = objArr3;
                                                            i21 = i21;
                                                            str3 = str3;
                                                        } else {
                                                            objArr3 = objArr4;
                                                            i16 = i26;
                                                            j12 = j14;
                                                        }
                                                        j14 = j12 >> 8;
                                                        i26 = i16 + 1;
                                                        i23 = 8;
                                                        objArr4 = objArr3;
                                                        i21 = i21;
                                                        str3 = str3;
                                                    }
                                                    objArr2 = objArr4;
                                                    str2 = str3;
                                                    i14 = i21;
                                                    if (i25 != i23) {
                                                        break;
                                                    }
                                                } else {
                                                    objArr2 = objArr4;
                                                    str2 = str3;
                                                    i14 = i21;
                                                }
                                                if (i24 == length2) {
                                                    break;
                                                }
                                                i24++;
                                                length = i12;
                                                i19 = i13;
                                                objArr4 = objArr2;
                                                i21 = i14;
                                                str3 = str2;
                                                i23 = 8;
                                            }
                                            z11 = z12;
                                        } else {
                                            objArr2 = objArr4;
                                            str2 = str3;
                                            i12 = length;
                                            i13 = i19;
                                            j11 = j13;
                                            i14 = i21;
                                        }
                                    } else {
                                        objArr2 = objArr4;
                                        str2 = str3;
                                        i12 = length;
                                        i13 = i19;
                                        j11 = j13;
                                        i14 = i21;
                                        p020r2.h0<?> h0Var2 = (p020r2.h0) objC2;
                                        Object obj3 = map.get(h0Var2);
                                        m3<?> m3VarE2 = h0Var2.e();
                                        if (m3VarE2 == null) {
                                            m3VarE2 = n3.q();
                                        }
                                        if (m3VarE2.a(h0Var2.A().a(), obj3)) {
                                            this.statesToReread.b(h0Var2);
                                        } else {
                                            Object objC4 = fVar4.d().c(h0Var2);
                                            if (objC4 != null) {
                                                if (objC4 instanceof l0) {
                                                    l0 l0Var4 = (l0) objC4;
                                                    Object[] objArr7 = l0Var4.elements;
                                                    long[] jArr8 = l0Var4.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                                    int length4 = jArr8.length - 2;
                                                    if (length4 >= 0) {
                                                        int i31 = 0;
                                                        while (true) {
                                                            long j16 = jArr8[i31];
                                                            if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                if (i31 != length4) {
                                                                    break;
                                                                    break;
                                                                }
                                                                i31++;
                                                            } else {
                                                                int i32 = 8 - ((~(i31 - length4)) >>> 31);
                                                                for (int i33 = 0; i33 < i32; i33++) {
                                                                    if ((j16 & 255) < 128) {
                                                                        l0Var.h(objArr7[(i31 << 3) + i33]);
                                                                        z11 = true;
                                                                    }
                                                                    j16 >>= 8;
                                                                }
                                                                if (i32 != 8) {
                                                                    break;
                                                                }
                                                                if (i31 != length4) {
                                                                    break;
                                                                }
                                                                i31++;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    l0Var.h(objC4);
                                                    z11 = true;
                                                }
                                            }
                                        }
                                    }
                                    Object objC5 = fVar4.d().c(obj);
                                    if (objC5 != null) {
                                        if (objC5 instanceof l0) {
                                            l0 l0Var5 = (l0) objC5;
                                            Object[] objArr8 = l0Var5.elements;
                                            long[] jArr9 = l0Var5.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                            int length5 = jArr9.length - 2;
                                            if (length5 >= 0) {
                                                int i34 = 0;
                                                while (true) {
                                                    long j17 = jArr9[i34];
                                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i34 != length5) {
                                                            break;
                                                            break;
                                                        }
                                                        i34++;
                                                    } else {
                                                        int i35 = 8 - ((~(i34 - length5)) >>> 31);
                                                        for (int i36 = 0; i36 < i35; i36++) {
                                                            if ((j17 & 255) < 128) {
                                                                l0Var.h(objArr8[(i34 << 3) + i36]);
                                                                z11 = true;
                                                            }
                                                            j17 >>= 8;
                                                        }
                                                        if (i35 != 8) {
                                                            break;
                                                        }
                                                        if (i34 != length5) {
                                                            break;
                                                        }
                                                        i34++;
                                                    }
                                                }
                                            }
                                        } else {
                                            l0Var.h(objC5);
                                            z11 = true;
                                        }
                                    }
                                    i15 = 8;
                                } else {
                                    fVar4 = fVar6;
                                    objArr2 = objArr4;
                                    str2 = str3;
                                    i12 = length;
                                    i13 = i19;
                                    j11 = j13;
                                    i14 = i21;
                                    i15 = i17;
                                }
                                j13 = j11 >> i15;
                                i22++;
                                i17 = i15;
                                jArr4 = jArr4;
                                fVar6 = fVar4;
                                length = i12;
                                i19 = i13;
                                objArr4 = objArr2;
                                i21 = i14;
                                str3 = str2;
                            }
                            jArr3 = jArr4;
                            fVar3 = fVar6;
                            objArr = objArr4;
                            str = str3;
                            int i37 = length;
                            int i38 = i19;
                            if (i21 != i17) {
                                break;
                            }
                            length = i37;
                            i11 = i38;
                        } else {
                            jArr3 = jArr4;
                            fVar3 = fVar6;
                            objArr = objArr4;
                            str = str3;
                            i11 = i19;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i19 = i11 + 1;
                        jArr4 = jArr3;
                        fVar6 = fVar3;
                        objArr4 = objArr;
                        str3 = str;
                        i17 = 8;
                    }
                } else {
                    z11 = false;
                }
            } else {
                Iterator it3 = changes.iterator();
                z11 = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof b3.l) || ((b3.l) next).D(e.a(2))) {
                        if (!fVar5.c(next) || (objC = fVar5.d().c(next)) == null) {
                            it = it3;
                            fVar = fVar5;
                        } else if (objC instanceof l0) {
                            l0 l0Var6 = (l0) objC;
                            Object[] objArr9 = l0Var6.elements;
                            long[] jArr10 = l0Var6.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                            int length6 = jArr10.length - 2;
                            if (length6 >= 0) {
                                int i39 = 0;
                                while (true) {
                                    long j18 = jArr10[i39];
                                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i41 = 8 - ((~(i39 - length6)) >>> 31);
                                        int i42 = 0;
                                        while (i42 < i41) {
                                            if ((j18 & 255) < 128) {
                                                p020r2.h0<?> h0Var3 = (p020r2.h0) objArr9[(i39 << 3) + i42];
                                                it2 = it3;
                                                s.i(h0Var3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                Object obj4 = map.get(h0Var3);
                                                m3<?> m3VarE3 = h0Var3.e();
                                                if (m3VarE3 == null) {
                                                    m3VarE3 = n3.q();
                                                }
                                                fVar2 = fVar5;
                                                jArr2 = jArr10;
                                                if (m3VarE3.a(h0Var3.A().a(), obj4)) {
                                                    this.statesToReread.b(h0Var3);
                                                } else {
                                                    Object objC6 = fVar6.d().c(h0Var3);
                                                    if (objC6 != null) {
                                                        if (objC6 instanceof l0) {
                                                            l0 l0Var7 = (l0) objC6;
                                                            Object[] objArr10 = l0Var7.elements;
                                                            long[] jArr11 = l0Var7.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                                            int length7 = jArr11.length - 2;
                                                            if (length7 >= 0) {
                                                                int i43 = 0;
                                                                boolean z14 = z11;
                                                                while (true) {
                                                                    long j19 = jArr11[i43];
                                                                    long[] jArr12 = jArr11;
                                                                    Object[] objArr11 = objArr10;
                                                                    if ((((~j19) << 7) & j19 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                        if (i43 != length7) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i43++;
                                                                        objArr10 = objArr11;
                                                                        jArr11 = jArr12;
                                                                    } else {
                                                                        int i44 = 8 - ((~(i43 - length7)) >>> 31);
                                                                        for (int i45 = 0; i45 < i44; i45++) {
                                                                            if ((j19 & 255) < 128) {
                                                                                l0Var.h(objArr11[(i43 << 3) + i45]);
                                                                                z14 = true;
                                                                            }
                                                                            j19 >>= 8;
                                                                        }
                                                                        if (i44 != 8) {
                                                                            break;
                                                                        }
                                                                        if (i43 != length7) {
                                                                            break;
                                                                        }
                                                                        i43++;
                                                                        objArr10 = objArr11;
                                                                        jArr11 = jArr12;
                                                                    }
                                                                }
                                                                z11 = z14;
                                                            }
                                                        } else {
                                                            l0Var.h(objC6);
                                                            z11 = true;
                                                        }
                                                    }
                                                }
                                                j18 >>= 8;
                                                i42++;
                                                it3 = it2;
                                                fVar5 = fVar2;
                                                jArr10 = jArr2;
                                            } else {
                                                it2 = it3;
                                                fVar2 = fVar5;
                                                jArr2 = jArr10;
                                            }
                                            j18 >>= 8;
                                            i42++;
                                            it3 = it2;
                                            fVar5 = fVar2;
                                            jArr10 = jArr2;
                                        }
                                        it = it3;
                                        fVar = fVar5;
                                        jArr = jArr10;
                                        if (i41 != 8) {
                                            break;
                                        }
                                    } else {
                                        it = it3;
                                        fVar = fVar5;
                                        jArr = jArr10;
                                    }
                                    if (i39 == length6) {
                                        break;
                                    }
                                    i39++;
                                    it3 = it;
                                    fVar5 = fVar;
                                    jArr10 = jArr;
                                }
                            } else {
                                it = it3;
                                fVar = fVar5;
                            }
                        } else {
                            it = it3;
                            fVar = fVar5;
                            p020r2.h0<?> h0Var4 = (p020r2.h0) objC;
                            Object obj5 = map.get(h0Var4);
                            m3<?> m3VarE4 = h0Var4.e();
                            if (m3VarE4 == null) {
                                m3VarE4 = n3.q();
                            }
                            if (m3VarE4.a(h0Var4.A().a(), obj5)) {
                                this.statesToReread.b(h0Var4);
                            } else {
                                Object objC7 = fVar6.d().c(h0Var4);
                                if (objC7 != null) {
                                    if (objC7 instanceof l0) {
                                        l0 l0Var8 = (l0) objC7;
                                        Object[] objArr12 = l0Var8.elements;
                                        long[] jArr13 = l0Var8.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                        int length8 = jArr13.length - 2;
                                        if (length8 >= 0) {
                                            int i46 = 0;
                                            while (true) {
                                                long j21 = jArr13[i46];
                                                if ((((~j21) << 7) & j21 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                    if (i46 != length8) {
                                                        break;
                                                        break;
                                                    }
                                                    i46++;
                                                } else {
                                                    int i47 = 8 - ((~(i46 - length8)) >>> 31);
                                                    for (int i48 = 0; i48 < i47; i48++) {
                                                        if ((j21 & 255) < 128) {
                                                            l0Var.h(objArr12[(i46 << 3) + i48]);
                                                            z11 = true;
                                                        }
                                                        j21 >>= 8;
                                                    }
                                                    if (i47 != 8) {
                                                        break;
                                                    }
                                                    if (i46 != length8) {
                                                        break;
                                                    }
                                                    i46++;
                                                }
                                            }
                                        }
                                    } else {
                                        l0Var.h(objC7);
                                        z11 = true;
                                    }
                                }
                            }
                        }
                        Object objC8 = fVar6.d().c(next);
                        if (objC8 != null) {
                            if (objC8 instanceof l0) {
                                l0 l0Var9 = (l0) objC8;
                                Object[] objArr13 = l0Var9.elements;
                                long[] jArr14 = l0Var9.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                int length9 = jArr14.length - 2;
                                if (length9 >= 0) {
                                    int i49 = 0;
                                    while (true) {
                                        long j22 = jArr14[i49];
                                        if ((((~j22) << 7) & j22 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i51 = 8 - ((~(i49 - length9)) >>> 31);
                                            for (int i52 = 0; i52 < i51; i52++) {
                                                if ((j22 & 255) < 128) {
                                                    l0Var.h(objArr13[(i49 << 3) + i52]);
                                                    z11 = true;
                                                }
                                                j22 >>= 8;
                                            }
                                            if (i51 != 8) {
                                                break;
                                            }
                                        }
                                        if (i49 == length9) {
                                            break;
                                        }
                                        i49++;
                                    }
                                }
                            } else {
                                l0Var.h(objC8);
                                z11 = true;
                            }
                        }
                        it3 = it;
                        fVar5 = fVar;
                    } else {
                        it = it3;
                        fVar = fVar5;
                    }
                    it3 = it;
                    fVar5 = fVar;
                }
            }
            if (this.statesToReread.q()) {
                t2.b<p020r2.h0<?>> bVar = this.statesToReread;
                int size = bVar.getSize();
                if (size > 0) {
                    p020r2.h0<?>[] h0VarArrM = bVar.m();
                    while (true) {
                        o(h0VarArrM[i18]);
                        int i53 = i18 + 1;
                        if (i53 >= size) {
                            break;
                        }
                        i18 = i53;
                    }
                }
                this.statesToReread.h();
            }
            return z11;
        }

        public final void k(Object value) {
            Object obj = this.currentScope;
            s.h(obj);
            int i11 = this.currentToken;
            androidx.collection.h0<Object> h0Var = this.currentScopeReads;
            if (h0Var == null) {
                h0Var = new androidx.collection.h0<>(0, 1, null);
                this.currentScopeReads = h0Var;
                this.scopeToValues.s(obj, h0Var);
                h0 h0Var2 = h0.f84049a;
            }
            l(value, i11, obj, h0Var);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0066->B:28:0x009f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:49:0x00ac A[EDGE_INSN: B:49:0x00ac->B:30:0x00ac BREAK  A[LOOP:2: B:16:0x0066->B:28:0x009f], SYNTHETIC] */
        public final void n(wn0.l<Object, Boolean> predicate) {
            long[] jArr;
            long[] jArr2;
            long j11;
            char c11;
            long j12;
            int i11;
            k0<Object, androidx.collection.h0<Object>> k0Var = this.scopeToValues;
            long[] jArr3 = k0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                long j13 = jArr3[i12];
                char c12 = 7;
                long j14 = -9187201950435737472L;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j13 & 255) < 128) {
                            int i16 = (i12 << 3) + i15;
                            c11 = c12;
                            Object obj = k0Var.keys[i16];
                            j12 = j14;
                            androidx.collection.h0 h0Var = (androidx.collection.h0) k0Var.values[i16];
                            Boolean boolInvoke = predicate.invoke(obj);
                            if (boolInvoke.booleanValue()) {
                                Object[] objArr = h0Var.keys;
                                int[] iArr = h0Var.values;
                                long[] jArr4 = h0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                int i17 = i13;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j11 = j13;
                                    int i18 = 0;
                                    while (true) {
                                        long j15 = jArr4[i18];
                                        long[] jArr5 = jArr4;
                                        if ((((~j15) << c11) & j15 & j12) != j12) {
                                            int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                            for (int i21 = 0; i21 < i19; i21++) {
                                                if ((j15 & 255) < 128) {
                                                    int i22 = (i18 << 3) + i21;
                                                    Object obj2 = objArr[i22];
                                                    int i23 = iArr[i22];
                                                    m(obj, obj2);
                                                }
                                                j15 >>= i17;
                                            }
                                            if (i19 != i17) {
                                                break;
                                            }
                                            if (i18 != length2) {
                                                break;
                                            }
                                            i18++;
                                            jArr4 = jArr5;
                                            i17 = 8;
                                        } else if (i18 != length2) {
                                            break;
                                            break;
                                        } else {
                                            i18++;
                                            jArr4 = jArr5;
                                            i17 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j11 = j13;
                                }
                            } else {
                                jArr2 = jArr3;
                                j11 = j13;
                            }
                            if (boolInvoke.booleanValue()) {
                                k0Var.q(i16);
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr3;
                            j11 = j13;
                            c11 = c12;
                            j12 = j14;
                            i11 = i13;
                        }
                        i15++;
                        i13 = i11;
                        j13 = j11 >> i11;
                        c12 = c11;
                        j14 = j12;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i14 != i13) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i12 == length) {
                    return;
                }
                i12++;
                jArr3 = jArr;
            }
        }

        public final void o(p020r2.h0<?> derivedState) {
            long[] jArr;
            androidx.collection.h0<Object> h0Var;
            k0<Object, androidx.collection.h0<Object>> k0Var = this.scopeToValues;
            int id2 = j.H().getId();
            Object objC = this.valueToScopes.d().c(derivedState);
            if (objC == null) {
                return;
            }
            if (!(objC instanceof l0)) {
                androidx.collection.h0<Object> h0VarC = k0Var.c(objC);
                if (h0VarC == null) {
                    h0VarC = new androidx.collection.h0<>(0, 1, null);
                    k0Var.s(objC, h0VarC);
                    h0 h0Var2 = h0.f84049a;
                }
                l(derivedState, id2, objC, h0VarC);
                return;
            }
            l0 l0Var = (l0) objC;
            Object[] objArr = l0Var.elements;
            long[] jArr2 = l0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr2.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j11 = jArr2[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j11 & 255) < 128) {
                            Object obj = objArr[(i11 << 3) + i14];
                            androidx.collection.h0<Object> h0VarC2 = k0Var.c(obj);
                            if (h0VarC2 == null) {
                                h0Var = new androidx.collection.h0<>(0, 1, null);
                                k0Var.s(obj, h0Var);
                                h0 h0Var3 = h0.f84049a;
                            } else {
                                h0Var = h0VarC2;
                            }
                            l(derivedState, id2, obj, h0Var);
                        }
                        j11 >>= i12;
                        i14++;
                        i12 = i12;
                        jArr2 = jArr2;
                    }
                    jArr = jArr2;
                    if (i13 != i12) {
                        return;
                    }
                } else {
                    jArr = jArr2;
                }
                if (i11 == length) {
                    return;
                }
                i11++;
                jArr2 = jArr;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "applied", "Landroidx/compose/runtime/snapshots/g;", "<anonymous parameter 1>", "Ljn0/h0;", "a", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/g;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.p<Set<? extends Object>, g, h0> {
        b() {
            super(2);
        }

        public final void a(Set<? extends Object> set, g gVar) {
            l.this.i(set);
            if (l.this.m()) {
                l.this.r();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(Set<? extends Object> set, g gVar) {
            a(set, gVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.l<Object, h0> {
        c() {
            super(1);
        }

        public final void b(Object obj) {
            if (l.this.isPaused) {
                return;
            }
            t2.b bVar = l.this.observedScopeMaps;
            l lVar = l.this;
            synchronized (bVar) {
                a aVar = lVar.currentMap;
                s.h(aVar);
                aVar.k(obj);
                h0 h0Var = h0.f84049a;
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
            b(obj);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.a<h0> {
        d() {
            super(0);
        }

        public final void b() {
            do {
                t2.b bVar = l.this.observedScopeMaps;
                l lVar = l.this;
                synchronized (bVar) {
                    try {
                        if (!lVar.sendingNotifications) {
                            lVar.sendingNotifications = true;
                            try {
                                t2.b bVar2 = lVar.observedScopeMaps;
                                int size = bVar2.getSize();
                                if (size > 0) {
                                    Object[] objArrM = bVar2.m();
                                    int i11 = 0;
                                    do {
                                        ((a) objArrM[i11]).h();
                                        i11++;
                                    } while (i11 < size);
                                }
                                lVar.sendingNotifications = false;
                            } catch (Throwable th2) {
                                lVar.sendingNotifications = false;
                                throw th2;
                            }
                        }
                        h0 h0Var = h0.f84049a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } while (l.this.m());
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(wn0.l<? super wn0.a<h0>, h0> lVar) {
        this.onChangedExecutor = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Set<? extends Object> set) {
        Object obj;
        List listP0;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                listP0 = set;
            } else if (obj instanceof Set) {
                listP0 = v.p(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    q();
                    throw new KotlinNothingValueException();
                }
                listP0 = v.P0((Collection) obj, v.e(set));
            }
        } while (!androidx.camera.view.i.a(this.pendingChanges, obj, listP0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        boolean z11;
        synchronized (this.observedScopeMaps) {
            z11 = this.sendingNotifications;
        }
        if (z11) {
            return false;
        }
        boolean z12 = false;
        while (true) {
            Set<? extends Object> setP = p();
            if (setP == null) {
                return z12;
            }
            synchronized (this.observedScopeMaps) {
                try {
                    t2.b<a> bVar = this.observedScopeMaps;
                    int size = bVar.getSize();
                    if (size > 0) {
                        a[] aVarArrM = bVar.m();
                        int i11 = 0;
                        do {
                            z12 = aVarArrM[i11].j(setP) || z12;
                            i11++;
                        } while (i11 < size);
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private final <T> a n(wn0.l<? super T, h0> onChanged) {
        a aVar;
        t2.b<a> bVar = this.observedScopeMaps;
        int size = bVar.getSize();
        if (size <= 0) {
            aVar = null;
            break;
        }
        a[] aVarArrM = bVar.m();
        int i11 = 0;
        while (true) {
            aVar = aVarArrM[i11];
            if (aVar.f() == onChanged) {
                break;
            }
            i11++;
            if (i11 >= size) {
                aVar = null;
                break;
            }
        }
        a aVar2 = aVar;
        if (aVar2 != null) {
            return aVar2;
        }
        s.i(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        a aVar3 = new a((wn0.l) u0.g(onChanged, 1));
        this.observedScopeMaps.b(aVar3);
        return aVar3;
    }

    private final Set<Object> p() {
        Object obj;
        Object objSubList;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    q();
                    throw new KotlinNothingValueException();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!androidx.camera.view.i.a(this.pendingChanges, obj, objSubList));
        return set;
    }

    private final Void q() {
        p020r2.o.t("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        this.onChangedExecutor.invoke(new d());
    }

    public final void j() {
        synchronized (this.observedScopeMaps) {
            try {
                t2.b<a> bVar = this.observedScopeMaps;
                int size = bVar.getSize();
                if (size > 0) {
                    a[] aVarArrM = bVar.m();
                    int i11 = 0;
                    do {
                        aVarArrM[i11].c();
                        i11++;
                    } while (i11 < size);
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(Object scope) {
        synchronized (this.observedScopeMaps) {
            try {
                t2.b<a> bVar = this.observedScopeMaps;
                int size = bVar.getSize();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    a aVar = bVar.m()[i12];
                    aVar.e(scope);
                    if (!aVar.g()) {
                        i11++;
                    } else if (i11 > 0) {
                        bVar.m()[i12 - i11] = bVar.m()[i12];
                    }
                }
                int i13 = size - i11;
                p013kotlin.collections.n.z(bVar.m(), null, i13, size);
                bVar.z(i13);
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(wn0.l<Object, Boolean> predicate) {
        synchronized (this.observedScopeMaps) {
            try {
                t2.b<a> bVar = this.observedScopeMaps;
                int size = bVar.getSize();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    a aVar = bVar.m()[i12];
                    aVar.n(predicate);
                    if (!aVar.g()) {
                        i11++;
                    } else if (i11 > 0) {
                        bVar.m()[i12 - i11] = bVar.m()[i12];
                    }
                }
                int i13 = size - i11;
                p013kotlin.collections.n.z(bVar.m(), null, i13, size);
                bVar.z(i13);
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <T> void o(T scope, wn0.l<? super T, h0> onValueChangedForScope, wn0.a<h0> block) {
        a aVarN;
        synchronized (this.observedScopeMaps) {
            aVarN = n(onValueChangedForScope);
        }
        boolean z11 = this.isPaused;
        a aVar = this.currentMap;
        long j11 = this.currentMapThreadId;
        if (j11 != -1) {
            if (!(j11 == p020r2.c.a())) {
                a2.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j11 + "), currentThread={id=" + p020r2.c.a() + ", name=" + p020r2.c.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.isPaused = false;
            this.currentMap = aVarN;
            this.currentMapThreadId = p020r2.c.a();
            aVarN.i(scope, this.readObserver, block);
        } finally {
            this.currentMap = aVar;
            this.isPaused = z11;
            this.currentMapThreadId = j11;
        }
    }

    public final void s() {
        this.applyUnsubscribe = g.INSTANCE.i(this.applyObserver);
    }

    public final void t() {
        b3.b bVar = this.applyUnsubscribe;
        if (bVar != null) {
            bVar.dispose();
        }
    }
}
