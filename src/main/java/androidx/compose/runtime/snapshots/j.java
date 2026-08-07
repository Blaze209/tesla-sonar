package androidx.compose.runtime.snapshots;

import androidx.collection.l0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import jn0.h0;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.f4;
import p020r2.t3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0013\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aI\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a1\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\u0006\u0010\u001d\u001a\u00020\n2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010$\u001a-\u0010%\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020\n2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b%\u0010&\u001a\u0017\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010)\u001a'\u0010,\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010-\u001a'\u00100\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101\u001a3\u00103\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001c*\u00020.2\u0006\u00102\u001a\u00028\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b3\u00104\u001a#\u00107\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108\u001a\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0019\u0010<\u001a\u0004\u0018\u00010.2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b<\u0010=\u001a\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b\u001c\u0010>\u001a\u000f\u0010?\u001a\u00020\u0007H\u0002¢\u0006\u0004\b?\u0010$\u001a\u0017\u0010@\u001a\u00020\u00072\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b@\u0010A\u001a-\u0010B\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010'\u001a\u00020\nH\u0001¢\u0006\u0004\bB\u0010C\u001a5\u0010E\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010'\u001a\u00020\n2\u0006\u0010D\u001a\u00028\u0000H\u0000¢\u0006\u0004\bE\u0010F\u001a-\u0010G\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010'\u001a\u00020\nH\u0000¢\u0006\u0004\bG\u0010C\u001a-\u0010H\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\bH\u0010C\u001a%\u0010I\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\bI\u00108\u001a\u001f\u0010J\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\n2\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\bJ\u0010K\u001a5\u0010P\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.\u0018\u00010O2\u0006\u0010*\u001a\u00020L2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020\u0002H\u0002¢\u0006\u0004\bP\u0010Q\u001a\u000f\u0010R\u001a\u000209H\u0002¢\u0006\u0004\bR\u0010;\u001a)\u0010S\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.2\u0006\u00102\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\nH\u0001¢\u0006\u0004\bS\u0010T\u001a!\u0010U\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.2\u0006\u00102\u001a\u00028\u0000H\u0001¢\u0006\u0004\bU\u0010V\u001a#\u0010Y\u001a\u00020\u0002*\u00020\u00022\u0006\u0010W\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\u0000H\u0000¢\u0006\u0004\bY\u0010Z\" \u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\\"\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\n0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`\" \u0010g\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bb\u0010c\u0012\u0004\bf\u0010$\u001a\u0004\bd\u0010e\"\u0016\u0010j\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010i\"\u0016\u0010l\u001a\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010d\"\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010o\"\u001a\u0010t\u001a\b\u0012\u0004\u0012\u0002050q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010s\"4\u0010z\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0w\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070v0u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010y\"(\u0010|\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000e0u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010y\"8\u0010\u0083\u0001\u001a#\u0012\f\u0012\n \u007f*\u0004\u0018\u00010~0~0}j\u0011\u0012\f\u0012\n \u007f*\u0004\u0018\u00010~0~`\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001\"%\u0010\u0088\u0001\u001a\u00020\n8\u0000X\u0081\u0004¢\u0006\u0016\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u0012\u0005\b\u0087\u0001\u0010$\u001a\u0005\b\u0086\u0001\u0010\f\"\u001a\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008d\u0001"}, d2 = {"", "id", "Landroidx/compose/runtime/snapshots/i;", "invalid", "c0", "(ILandroidx/compose/runtime/snapshots/i;)I", "handle", "Ljn0/h0;", "Y", "(I)V", "Landroidx/compose/runtime/snapshots/g;", "H", "()Landroidx/compose/runtime/snapshots/g;", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "D", "(Landroidx/compose/runtime/snapshots/g;Lwn0/l;Z)Landroidx/compose/runtime/snapshots/g;", "parentObserver", "mergeReadObserver", "K", "(Lwn0/l;Lwn0/l;Z)Lwn0/l;", "writeObserver", Gender.MALE, "(Lwn0/l;Lwn0/l;)Lwn0/l;", "T", "previousGlobalSnapshot", "block", "a0", "(Landroidx/compose/runtime/snapshots/g;Lwn0/l;)Ljava/lang/Object;", "A", "(Lwn0/l;)Ljava/lang/Object;", "B", "()V", "b0", "(Lwn0/l;)Landroidx/compose/runtime/snapshots/g;", "snapshot", "g0", "(Landroidx/compose/runtime/snapshots/g;)V", "currentSnapshot", "candidateSnapshot", "e0", "(IILandroidx/compose/runtime/snapshots/i;)Z", "Landroidx/compose/runtime/snapshots/n;", "data", "f0", "(Landroidx/compose/runtime/snapshots/n;ILandroidx/compose/runtime/snapshots/i;)Z", "r", "W", "(Landroidx/compose/runtime/snapshots/n;ILandroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/n;", "Lb3/k;", "state", "X", "(Landroidx/compose/runtime/snapshots/n;Lb3/k;)Landroidx/compose/runtime/snapshots/n;", "", "V", "()Ljava/lang/Void;", "d0", "(Lb3/k;)Landroidx/compose/runtime/snapshots/n;", "(Lb3/k;)Z", "C", Gender.UNKNOWN, "(Lb3/k;)V", "h0", "(Landroidx/compose/runtime/snapshots/n;Lb3/k;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;", "candidate", "S", "(Landroidx/compose/runtime/snapshots/n;Lb3/k;Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;", Gender.OTHER, "P", Gender.NONE, "Q", "(Landroidx/compose/runtime/snapshots/g;Lb3/k;)V", "Landroidx/compose/runtime/snapshots/b;", "applyingSnapshot", "invalidSnapshots", "", "R", "(Landroidx/compose/runtime/snapshots/b;Landroidx/compose/runtime/snapshots/b;Landroidx/compose/runtime/snapshots/i;)Ljava/util/Map;", "Z", "G", "(Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;", Gender.FEMALE, "(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;", "from", "until", "z", "(Landroidx/compose/runtime/snapshots/i;II)Landroidx/compose/runtime/snapshots/i;", "a", "Lwn0/l;", "emptyLambda", "Lr2/t3;", "b", "Lr2/t3;", "threadSnapshot", "c", "Ljava/lang/Object;", "I", "()Ljava/lang/Object;", "getLock$annotations", "lock", DateTokenConverter.CONVERTER_KEY, "Landroidx/compose/runtime/snapshots/i;", "openSnapshots", "e", "nextSnapshotId", "Lb3/e;", "f", "Lb3/e;", "pinningTable", "Lb3/j;", "g", "Lb3/j;", "extraStateObjects", "", "Lkotlin/Function2;", "", "h", "Ljava/util/List;", "applyObservers", IntegerTokenConverter.CONVERTER_KEY, "globalWriteObservers", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/snapshots/a;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "j", "Ljava/util/concurrent/atomic/AtomicReference;", "currentGlobalSnapshot", "k", "Landroidx/compose/runtime/snapshots/g;", "J", "getSnapshotInitializer$annotations", "snapshotInitializer", "Lr2/g;", "l", "Lr2/g;", "pendingApplyObserverCount", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final wn0.l<i, h0> f5185a = b.f5198c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t3<g> f5186b = new t3<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f5187c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static i f5188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b3.e f5190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b3.j<b3.k> f5191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static List<? extends wn0.p<? super Set<? extends Object>, ? super g, h0>> f5192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static List<? extends wn0.l<Object, h0>> f5193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicReference<androidx.compose.runtime.snapshots.a> f5194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final g f5195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static p020r2.g f5196l;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "it", "Ljn0/h0;", "a", "(Landroidx/compose/runtime/snapshots/i;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.l<i, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f5197c = new a();

        a() {
            super(1);
        }

        public final void a(i iVar) {
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(i iVar) {
            a(iVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "it", "Ljn0/h0;", "a", "(Landroidx/compose/runtime/snapshots/i;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<i, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f5198c = new b();

        b() {
            super(1);
        }

        public final void a(i iVar) {
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(i iVar) {
            a(iVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.l<Object, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Object, h0> f5199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<Object, h0> f5200d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(wn0.l<Object, h0> lVar, wn0.l<Object, h0> lVar2) {
            super(1);
            this.f5199c = lVar;
            this.f5200d = lVar2;
        }

        public final void b(Object obj) {
            this.f5199c.invoke(obj);
            this.f5200d.invoke(obj);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
            b(obj);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.l<Object, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Object, h0> f5201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<Object, h0> f5202d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(wn0.l<Object, h0> lVar, wn0.l<Object, h0> lVar2) {
            super(1);
            this.f5201c = lVar;
            this.f5202d = lVar2;
        }

        public final void b(Object obj) {
            this.f5201c.invoke(obj);
            this.f5202d.invoke(obj);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
            b(obj);
            return h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/g;", "T", "Landroidx/compose/runtime/snapshots/i;", "invalid", "a", "(Landroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/g;"}, k = 3, mv = {1, 8, 0})
    static final class e<T> extends u implements wn0.l<i, T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<i, T> f5203c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(wn0.l<? super i, ? extends T> lVar) {
            super(1);
            this.f5203c = lVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/i;)TT; */
        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke(i iVar) {
            g gVar = (g) this.f5203c.invoke(iVar);
            synchronized (j.I()) {
                j.f5188d = j.f5188d.o(gVar.getId());
                h0 h0Var = h0.f84049a;
            }
            return gVar;
        }
    }

    static {
        i.Companion aVar = i.INSTANCE;
        f5188d = aVar.a();
        f5189e = 2;
        f5190f = new b3.e();
        f5191g = new b3.j<>();
        f5192h = v.m();
        f5193i = v.m();
        int i11 = f5189e;
        f5189e = i11 + 1;
        androidx.compose.runtime.snapshots.a aVar2 = new androidx.compose.runtime.snapshots.a(i11, aVar.a());
        f5188d = f5188d.o(aVar2.getId());
        AtomicReference<androidx.compose.runtime.snapshots.a> atomicReference = new AtomicReference<>(aVar2);
        f5194j = atomicReference;
        f5195k = atomicReference.get();
        f5196l = new p020r2.g(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[Catch: all -> 0x009e, LOOP:1: B:30:0x006e->B:42:0x00a8, LOOP_END, TryCatch #2 {all -> 0x009e, blocks: (B:25:0x005f, B:27:0x0064, B:30:0x006e, B:32:0x007e, B:34:0x008a, B:36:0x0093, B:39:0x00a0, B:42:0x00a8, B:43:0x00ab), top: B:54:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab A[EDGE_INSN: B:58:0x00ab->B:43:0x00ab BREAK  A[LOOP:1: B:30:0x006e->B:42:0x00a8], SYNTHETIC] */
    public static final <T> T A(wn0.l<? super i, ? extends T> lVar) {
        androidx.compose.runtime.snapshots.a aVar;
        l0<b3.k> l0VarE;
        T t11;
        g gVar = f5195k;
        s.i(gVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (I()) {
            try {
                aVar = f5194j.get();
                l0VarE = aVar.E();
                if (l0VarE != null) {
                    f5196l.a(1);
                }
                t11 = (T) a0(aVar, lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (l0VarE != null) {
            try {
                List<? extends wn0.p<? super Set<? extends Object>, ? super g, h0>> list = f5192h;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.get(i11).invoke(t2.e.a(l0VarE), aVar);
                }
                f5196l.a(-1);
            } catch (Throwable th3) {
                f5196l.a(-1);
                throw th3;
            }
        }
        synchronized (I()) {
            try {
                C();
                if (l0VarE != null) {
                    Object[] objArr = l0VarE.elements;
                    long[] jArr = l0VarE.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j11 = jArr[i12];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i12 != length) {
                                    break;
                                    break;
                                }
                                i12++;
                            } else {
                                int i13 = 8 - ((~(i12 - length)) >>> 31);
                                for (int i14 = 0; i14 < i13; i14++) {
                                    if ((255 & j11) < 128) {
                                        U((b3.k) objArr[(i12 << 3) + i14]);
                                    }
                                    j11 >>= 8;
                                }
                                if (i13 != 8) {
                                    break;
                                }
                                if (i12 != length) {
                                    break;
                                }
                                i12++;
                            }
                        }
                    }
                    h0 h0Var = h0.f84049a;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B() {
        A(a.f5197c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C() {
        b3.j<b3.k> jVar = f5191g;
        int iE = jVar.getSize();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= iE) {
                break;
            }
            f4<b3.k> f4Var = jVar.f()[i11];
            b3.k kVar = f4Var != null ? f4Var.get() : null;
            if (kVar != null && T(kVar)) {
                if (i12 != i11) {
                    jVar.f()[i12] = f4Var;
                    jVar.getHashes()[i12] = jVar.getHashes()[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < iE; i13++) {
            jVar.f()[i13] = null;
            jVar.getHashes()[i13] = 0;
        }
        if (i12 != iE) {
            jVar.g(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g D(g gVar, wn0.l<Object, h0> lVar, boolean z11) {
        boolean z12 = gVar instanceof androidx.compose.runtime.snapshots.b;
        if (z12 || gVar == null) {
            return new p(z12 ? (androidx.compose.runtime.snapshots.b) gVar : null, lVar, null, false, z11);
        }
        return new q(gVar, lVar, false, z11);
    }

    static /* synthetic */ g E(g gVar, wn0.l lVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return D(gVar, lVar, z11);
    }

    public static final <T extends n> T F(T t11) {
        T t12;
        g.Companion companion = g.INSTANCE;
        g gVarC = companion.c();
        T t13 = (T) W(t11, gVarC.getId(), gVarC.getInvalid());
        if (t13 != null) {
            return t13;
        }
        synchronized (I()) {
            g gVarC2 = companion.c();
            t12 = (T) W(t11, gVarC2.getId(), gVarC2.getInvalid());
        }
        if (t12 != null) {
            return t12;
        }
        V();
        throw new KotlinNothingValueException();
    }

    public static final <T extends n> T G(T t11, g gVar) {
        T t12 = (T) W(t11, gVar.getId(), gVar.getInvalid());
        if (t12 != null) {
            return t12;
        }
        V();
        throw new KotlinNothingValueException();
    }

    public static final g H() {
        g gVarA = f5186b.a();
        return gVarA == null ? f5194j.get() : gVarA;
    }

    public static final Object I() {
        return f5187c;
    }

    public static final g J() {
        return f5195k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wn0.l<Object, h0> K(wn0.l<Object, h0> lVar, wn0.l<Object, h0> lVar2, boolean z11) {
        if (!z11) {
            lVar2 = null;
        }
        if (lVar == null || lVar2 == null || lVar == lVar2) {
            return lVar == null ? lVar2 : lVar;
        }
        return new c(lVar, lVar2);
    }

    static /* synthetic */ wn0.l L(wn0.l lVar, wn0.l lVar2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return K(lVar, lVar2, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wn0.l<Object, h0> M(wn0.l<Object, h0> lVar, wn0.l<Object, h0> lVar2) {
        if (lVar == null || lVar2 == null || lVar == lVar2) {
            return lVar == null ? lVar2 : lVar;
        }
        return new d(lVar, lVar2);
    }

    public static final <T extends n> T N(T t11, b3.k kVar) {
        T t12 = (T) d0(kVar);
        if (t12 != null) {
            t12.h(Integer.MAX_VALUE);
            return t12;
        }
        T t13 = (T) t11.d();
        t13.h(Integer.MAX_VALUE);
        t13.g(kVar.getFirstStateRecord());
        s.i(t13, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$16");
        kVar.k(t13);
        s.i(t13, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t13;
    }

    public static final <T extends n> T O(T t11, b3.k kVar, g gVar) {
        T t12;
        synchronized (I()) {
            t12 = (T) P(t11, kVar, gVar);
        }
        return t12;
    }

    private static final <T extends n> T P(T t11, b3.k kVar, g gVar) {
        T t12 = (T) N(t11, kVar);
        t12.c(t11);
        t12.h(gVar.getId());
        return t12;
    }

    public static final void Q(g gVar, b3.k kVar) {
        gVar.w(gVar.j() + 1);
        wn0.l<Object, h0> lVarK = gVar.k();
        if (lVarK != null) {
            lVarK.invoke(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<n, n> R(androidx.compose.runtime.snapshots.b bVar, androidx.compose.runtime.snapshots.b bVar2, i iVar) {
        long[] jArr;
        int i11;
        Map<n, n> map;
        Map<n, n> map2;
        int i12;
        l0<b3.k> l0VarE = bVar2.E();
        int id2 = bVar.getId();
        Map<n, n> map3 = null;
        if (l0VarE == null) {
            return null;
        }
        i iVarN = bVar2.getInvalid().o(bVar2.getId()).n(bVar2.F());
        Object[] objArr = l0VarE.elements;
        long[] jArr2 = l0VarE.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length = jArr2.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map4 = null;
        int i13 = 0;
        while (true) {
            long j11 = jArr2[i13];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((255 & j11) < 128) {
                        b3.k kVar = (b3.k) objArr[(i13 << 3) + i16];
                        n nVarU = kVar.getFirstStateRecord();
                        map2 = map3;
                        n nVarW = W(nVarU, id2, iVar);
                        if (nVarW == null) {
                            i12 = i14;
                        } else {
                            i12 = i14;
                            n nVarW2 = W(nVarU, id2, iVarN);
                            if (nVarW2 != null && !s.f(nVarW, nVarW2)) {
                                n nVarW3 = W(nVarU, bVar2.getId(), bVar2.getInvalid());
                                if (nVarW3 == null) {
                                    V();
                                    throw new KotlinNothingValueException();
                                }
                                n nVarQ = kVar.q(nVarW2, nVarW, nVarW3);
                                if (nVarQ == null) {
                                    return map2;
                                }
                                if (map4 == null) {
                                    map4 = new HashMap();
                                }
                                map4.put(nVarW, nVarQ);
                                map4 = map4;
                            }
                        }
                    } else {
                        map2 = map3;
                        i12 = i14;
                    }
                    j11 >>= i12;
                    i16++;
                    map3 = map2;
                    i14 = i12;
                    jArr2 = jArr2;
                    id2 = id2;
                }
                jArr = jArr2;
                i11 = id2;
                map = map3;
                if (i15 != i14) {
                    return map4;
                }
            } else {
                jArr = jArr2;
                i11 = id2;
                map = map3;
            }
            if (i13 == length) {
                return map4;
            }
            i13++;
            map3 = map;
            jArr2 = jArr;
            id2 = i11;
        }
    }

    public static final <T extends n> T S(T t11, b3.k kVar, g gVar, T t12) {
        T t13;
        if (gVar.i()) {
            gVar.p(kVar);
        }
        int id2 = gVar.getId();
        if (t12.getSnapshotId() == id2) {
            return t12;
        }
        synchronized (I()) {
            t13 = (T) N(t11, kVar);
        }
        t13.h(id2);
        if (t12.getSnapshotId() != 1) {
            gVar.p(kVar);
        }
        return t13;
    }

    private static final boolean T(b3.k kVar) {
        n nVar;
        int iE = f5190f.e(f5189e);
        n nVar2 = null;
        n nVarU = null;
        int i11 = 0;
        for (n nVarU2 = kVar.getFirstStateRecord(); nVarU2 != null; nVarU2 = nVarU2.getNext()) {
            int iF = nVarU2.getSnapshotId();
            if (iF != 0) {
                if (iF >= iE) {
                    i11++;
                } else if (nVar2 == null) {
                    i11++;
                    nVar2 = nVarU2;
                } else {
                    if (nVarU2.getSnapshotId() < nVar2.getSnapshotId()) {
                        nVar = nVar2;
                        nVar2 = nVarU2;
                    } else {
                        nVar = nVarU2;
                    }
                    if (nVarU == null) {
                        nVarU = kVar.getFirstStateRecord();
                        n nVar3 = nVarU;
                        while (true) {
                            if (nVarU == null) {
                                nVarU = nVar3;
                                break;
                            }
                            if (nVarU.getSnapshotId() >= iE) {
                                break;
                            }
                            if (nVar3.getSnapshotId() < nVarU.getSnapshotId()) {
                                nVar3 = nVarU;
                            }
                            nVarU = nVarU.getNext();
                        }
                    }
                    nVar2.h(0);
                    nVar2.c(nVarU);
                    nVar2 = nVar;
                }
            }
        }
        return i11 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(b3.k kVar) {
        if (T(kVar)) {
            f5191g.a(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void V() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends n> T W(T t11, int i11, i iVar) {
        T t12 = null;
        while (t11 != null) {
            if (f0(t11, i11, iVar) && (t12 == null || t12.getSnapshotId() < t11.getSnapshotId())) {
                t12 = t11;
            }
            t11 = (T) t11.getNext();
        }
        if (t12 != null) {
            return t12;
        }
        return null;
    }

    public static final <T extends n> T X(T t11, b3.k kVar) {
        T t12;
        g.Companion companion = g.INSTANCE;
        g gVarC = companion.c();
        wn0.l<Object, h0> lVarH = gVarC.h();
        if (lVarH != null) {
            lVarH.invoke(kVar);
        }
        T t13 = (T) W(t11, gVarC.getId(), gVarC.getInvalid());
        if (t13 != null) {
            return t13;
        }
        synchronized (I()) {
            g gVarC2 = companion.c();
            n nVarU = kVar.getFirstStateRecord();
            s.i(nVarU, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            t12 = (T) W(nVarU, gVarC2.getId(), gVarC2.getInvalid());
            if (t12 == null) {
                V();
                throw new KotlinNothingValueException();
            }
        }
        return t12;
    }

    public static final void Y(int i11) {
        f5190f.f(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void Z() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T a0(g gVar, wn0.l<? super i, ? extends T> lVar) {
        T tInvoke = lVar.invoke(f5188d.k(gVar.getId()));
        synchronized (I()) {
            int i11 = f5189e;
            f5189e = i11 + 1;
            f5188d = f5188d.k(gVar.getId());
            f5194j.set(new androidx.compose.runtime.snapshots.a(i11, f5188d));
            gVar.d();
            f5188d = f5188d.o(i11);
            h0 h0Var = h0.f84049a;
        }
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends g> T b0(wn0.l<? super i, ? extends T> lVar) {
        return (T) A(new e(lVar));
    }

    public static final int c0(int i11, i iVar) {
        int iA;
        int iM = iVar.m(i11);
        synchronized (I()) {
            iA = f5190f.a(iM);
        }
        return iA;
    }

    private static final n d0(b3.k kVar) {
        int iE = f5190f.e(f5189e) - 1;
        i iVarA = i.INSTANCE.a();
        n nVar = null;
        for (n nVarU = kVar.getFirstStateRecord(); nVarU != null; nVarU = nVarU.getNext()) {
            if (nVarU.getSnapshotId() != 0) {
                if (f0(nVarU, iE, iVarA)) {
                    if (nVar == null) {
                        nVar = nVarU;
                    } else if (nVarU.getSnapshotId() >= nVar.getSnapshotId()) {
                        return nVar;
                    }
                }
            }
            return nVarU;
        }
        return null;
    }

    private static final boolean e0(int i11, int i12, i iVar) {
        return (i12 == 0 || i12 > i11 || iVar.l(i12)) ? false : true;
    }

    private static final boolean f0(n nVar, int i11, i iVar) {
        return e0(i11, nVar.getSnapshotId(), iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(g gVar) {
        int iE;
        if (f5188d.l(gVar.getId())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Snapshot is not open: id=");
        sb2.append(gVar.getId());
        sb2.append(", disposed=");
        sb2.append(gVar.getDisposed());
        sb2.append(", applied=");
        androidx.compose.runtime.snapshots.b bVar = gVar instanceof androidx.compose.runtime.snapshots.b ? (androidx.compose.runtime.snapshots.b) gVar : null;
        sb2.append(bVar != null ? Boolean.valueOf(bVar.D()) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (I()) {
            iE = f5190f.e(-1);
        }
        sb2.append(iE);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final <T extends n> T h0(T t11, b3.k kVar, g gVar) {
        T t12;
        if (gVar.i()) {
            gVar.p(kVar);
        }
        int id2 = gVar.getId();
        T t13 = (T) W(t11, id2, gVar.getInvalid());
        if (t13 == null) {
            V();
            throw new KotlinNothingValueException();
        }
        if (t13.getSnapshotId() == gVar.getId()) {
            return t13;
        }
        synchronized (I()) {
            t12 = (T) W(kVar.getFirstStateRecord(), id2, gVar.getInvalid());
            if (t12 == null) {
                V();
                throw new KotlinNothingValueException();
            }
            if (t12.getSnapshotId() != id2) {
                t12 = (T) P(t12, kVar, gVar);
            }
        }
        s.i(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (t13.getSnapshotId() != 1) {
            gVar.p(kVar);
        }
        return t12;
    }

    public static final i z(i iVar, int i11, int i12) {
        while (i11 < i12) {
            iVar = iVar.o(i11);
            i11++;
        }
        return iVar;
    }
}
