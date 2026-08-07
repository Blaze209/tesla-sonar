package p020r2;

import androidx.camera.view.i;
import androidx.collection.b0;
import androidx.collection.k0;
import androidx.collection.l0;
import androidx.collection.n0;
import androidx.collection.v0;
import androidx.collection.w0;
import androidx.compose.runtime.snapshots.e;
import b3.k;
import b3.l;
import c3.c;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import jn0.h0;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import t2.d;
import t2.f;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001@B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b(\u0010)J)\u0010-\u001a\u00020,2\u0006\u0010&\u001a\u00020%2\u0006\u0010+\u001a\u00020*2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00040/H\u0002¢\u0006\u0004\b0\u00101J\u0011\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b5\u0010\u0011J\u001d\u00106\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b6\u0010\u0011J\u001d\u00107\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b7\u0010\u0011J\u000f\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u0010\u0013J\u001d\u00109\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aH\u0016¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\u00020\u00162\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aH\u0016¢\u0006\u0004\b;\u0010<J\u001d\u0010>\u001a\u00020\u000e2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b@\u0010 J\u0017\u0010A\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\bA\u0010 J\u000f\u0010B\u001a\u00020\u0016H\u0016¢\u0006\u0004\bB\u0010CJ+\u0010H\u001a\u00020\u000e2\u001a\u0010G\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020F\u0012\u0006\u0012\u0004\u0018\u00010F0E0DH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u000eH\u0016¢\u0006\u0004\bN\u0010\u0013J\u000f\u0010O\u001a\u00020\u000eH\u0016¢\u0006\u0004\bO\u0010\u0013J\u000f\u0010P\u001a\u00020\u000eH\u0016¢\u0006\u0004\bP\u0010\u0013J\u000f\u0010Q\u001a\u00020\u000eH\u0016¢\u0006\u0004\bQ\u0010\u0013J\u000f\u0010R\u001a\u00020\u000eH\u0016¢\u0006\u0004\bR\u0010\u0013J5\u0010W\u001a\u00028\u0000\"\u0004\b\u0000\u0010S2\b\u0010T\u001a\u0004\u0018\u00010\u00012\u0006\u0010V\u001a\u00020U2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\bW\u0010XJ!\u0010Y\u001a\u00020,2\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b]\u0010^J\u001b\u0010`\u001a\u00020\u000e2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030_H\u0000¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u000eH\u0016¢\u0006\u0004\bb\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010cR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010dR(\u0010h\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040ej\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010gR\u0014\u0010j\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010iR \u0010o\u001a\b\u0012\u0004\u0012\u00020l0k8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bW\u0010m\u0012\u0004\bn\u0010\u0013R \u0010u\u001a\u00020p8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b;\u0010q\u0012\u0004\bt\u0010\u0013\u001a\u0004\br\u0010sR \u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020%0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010vR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020%0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010yR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020%0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010yR$\u0010|\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030_0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010vR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010}R\u0014\u0010~\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010}R \u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020%0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010vR#\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00040/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010vR.\u0010\u0086\u0001\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u001d\n\u0005\b9\u0010\u0081\u0001\u0012\u0005\b\u0085\u0001\u0010\u0013\u001a\u0005\b\u0082\u0001\u0010C\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bN\u0010\u0087\u0001R\u0018\u0010\u008a\u0001\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010`R\u001f\u0010\u008f\u0001\u001a\u00030\u008b\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bA\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0095\u0001\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bQ\u0010\u0094\u0001R\u001a\u0010\u0096\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b7\u0010\u0081\u0001\u001a\u0005\b\u0096\u0001\u0010CR\u0019\u0010\u0098\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0081\u0001R-\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0018\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0005\b\u009c\u0001\u0010\u0011R\u0016\u0010\u009f\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010CR\u0016\u0010 \u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010CR\u0016\u0010¡\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010CR\u0016\u0010¢\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010C¨\u0006£\u0001"}, d2 = {"Lr2/s;", "Lr2/e0;", "Lr2/t2;", "Lr2/l2;", "", "Lr2/q;", "parent", "Lr2/f;", "applier", "Lkotlin/coroutines/CoroutineContext;", "recomposeContext", "<init>", "(Lr2/q;Lr2/f;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function0;", "Ljn0/h0;", "content", "A", "(Lwn0/p;)V", "B", "()V", "C", "value", "", "forgetConditionalScopes", "w", "(Ljava/lang/Object;Z)V", "", "values", "x", "(Ljava/util/Set;Z)V", "z", "G", "(Ljava/lang/Object;)V", "Ls2/a;", "changes", "y", "(Ls2/a;)V", "Lr2/j2;", "scope", "instance", "L", "(Lr2/j2;Ljava/lang/Object;)Z", "Lr2/d;", "anchor", "Lr2/x0;", Gender.FEMALE, "(Lr2/j2;Lr2/d;Ljava/lang/Object;)Lr2/x0;", "Lt2/f;", "K", "()Lt2/f;", "Lc3/c;", "H", "()Lc3/c;", DateTokenConverter.CONVERTER_KEY, "c", "u", "dispose", "o", "(Ljava/util/Set;)V", "f", "(Ljava/util/Set;)Z", "block", IntegerTokenConverter.CONVERTER_KEY, "(Lwn0/a;)V", "a", "r", "n", "()Z", "", "Lkotlin/Pair;", "Lr2/k1;", "references", "m", "(Ljava/util/List;)V", "Lr2/j1;", "state", "j", "(Lr2/j1;)V", "p", "k", "h", "t", "b", "R", "to", "", "groupIndex", "e", "(Lr2/e0;ILwn0/a;)Ljava/lang/Object;", "g", "(Lr2/j2;Ljava/lang/Object;)Lr2/x0;", "l", "(Lr2/j2;)V", "J", "(Ljava/lang/Object;Lr2/j2;)V", "Lr2/h0;", "I", "(Lr2/h0;)V", "deactivate", "Lr2/q;", "Lr2/f;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingModifications", "Ljava/lang/Object;", "lock", "", "Lr2/r2;", "Ljava/util/Set;", "getAbandonSet$annotations", "abandonSet", "Lr2/a3;", "Lr2/a3;", "getSlotTable$runtime_release", "()Lr2/a3;", "getSlotTable$runtime_release$annotations", "slotTable", "Lt2/f;", "observations", "Landroidx/collection/l0;", "Landroidx/collection/l0;", "invalidatedScopes", "conditionallyInvalidatedScopes", "derivedStates", "Ls2/a;", "lateChanges", "observationsProcessed", "invalidations", "Z", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "getPendingInvalidScopes$runtime_release$annotations", "pendingInvalidScopes", "Lr2/s;", "invalidationDelegate", "q", "invalidationDelegateGroup", "Lr2/z;", "Lr2/z;", "E", "()Lr2/z;", "observerHolder", "Lr2/m;", "s", "Lr2/m;", "composer", "Lkotlin/coroutines/CoroutineContext;", "_recomposeContext", "isRoot", "v", "disposed", "Lwn0/p;", "getComposable", "()Lwn0/p;", "setComposable", "composable", "D", "areChildrenComposing", "isComposing", "isDisposed", "hasInvalidations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s implements e0, t2, l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q parent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f<?> applier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<Object> pendingModifications;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<r2> abandonSet;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a3 slotTable;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final f<Object, j2> observations;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final l0<j2> invalidatedScopes;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final l0<j2> conditionallyInvalidatedScopes;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final f<Object, h0<?>> derivedStates;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final s2.a changes;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final s2.a lateChanges;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final f<Object, j2> observationsProcessed;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private f<j2, Object> invalidations;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean pendingInvalidScopes;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private s invalidationDelegate;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int invalidationDelegateGroup;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final z observerHolder;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final m composer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext _recomposeContext;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean isRoot;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private p<? super l, ? super Integer, h0> composable;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001b\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\r¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010\u001fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00160#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010-¨\u00060"}, d2 = {"Lr2/s$a;", "Lr2/q2;", "", "Lr2/r2;", "abandoning", "<init>", "(Ljava/util/Set;)V", "", "instance", "", "endRelativeOrder", "priority", "endRelativeAfter", "Ljn0/h0;", "j", "(Ljava/lang/Object;III)V", IntegerTokenConverter.CONVERTER_KEY, "(I)V", DateTokenConverter.CONVERTER_KEY, "(Lr2/r2;)V", "a", "(Lr2/r2;III)V", "Lkotlin/Function0;", "effect", "e", "(Lwn0/a;)V", "Lr2/k;", "b", "(Lr2/k;III)V", "c", "g", "()V", "h", "f", "Ljava/util/Set;", "", "Ljava/util/List;", "remembering", "leaving", "sideEffects", "Landroidx/collection/l0;", "Landroidx/collection/l0;", "releasing", "pending", "Landroidx/collection/b0;", "Landroidx/collection/b0;", "priorities", "afters", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a implements q2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Set<r2> abandoning;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private l0<k> releasing;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<r2> remembering = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<Object> leaving = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<wn0.a<h0>> sideEffects = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List<Object> pending = new ArrayList();

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final b0 priorities = new b0(0, 1, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final b0 afters = new b0(0, 1, null);

        public a(Set<r2> set) {
            this.abandoning = set;
        }

        private final void i(int endRelativeOrder) {
            if (this.pending.isEmpty()) {
                return;
            }
            int i11 = 0;
            int i12 = 0;
            List listS = null;
            b0 b0Var = null;
            b0 b0Var2 = null;
            while (i12 < this.afters.get_size()) {
                if (endRelativeOrder <= this.afters.a(i12)) {
                    Object objRemove = this.pending.remove(i12);
                    int iL = this.afters.l(i12);
                    int iL2 = this.priorities.l(i12);
                    if (listS == null) {
                        listS = v.s(objRemove);
                        b0Var2 = new b0(0, 1, null);
                        b0Var2.g(iL);
                        b0Var = new b0(0, 1, null);
                        b0Var.g(iL2);
                    } else {
                        p013kotlin.jvm.internal.s.i(b0Var, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        p013kotlin.jvm.internal.s.i(b0Var2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        listS.add(objRemove);
                        b0Var2.g(iL);
                        b0Var.g(iL2);
                    }
                } else {
                    i12++;
                }
            }
            if (listS != null) {
                p013kotlin.jvm.internal.s.i(b0Var, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                p013kotlin.jvm.internal.s.i(b0Var2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                int size = listS.size() - 1;
                while (i11 < size) {
                    int i13 = i11 + 1;
                    int size2 = listS.size();
                    for (int i14 = i13; i14 < size2; i14++) {
                        int iA = b0Var2.a(i11);
                        int iA2 = b0Var2.a(i14);
                        if (iA < iA2 || (iA2 == iA && b0Var.a(i11) < b0Var.a(i14))) {
                            t.g(listS, i11, i14);
                            t.f(b0Var, i11, i14);
                            t.f(b0Var2, i11, i14);
                        }
                    }
                    i11 = i13;
                }
                this.leaving.addAll(listS);
            }
        }

        private final void j(Object instance, int endRelativeOrder, int priority, int endRelativeAfter) {
            i(endRelativeOrder);
            if (endRelativeAfter < 0 || endRelativeAfter >= endRelativeOrder) {
                this.leaving.add(instance);
                return;
            }
            this.pending.add(instance);
            this.priorities.g(priority);
            this.afters.g(endRelativeAfter);
        }

        @Override // p020r2.q2
        public void a(r2 instance, int endRelativeOrder, int priority, int endRelativeAfter) {
            j(instance, endRelativeOrder, priority, endRelativeAfter);
        }

        @Override // p020r2.q2
        public void b(k instance, int endRelativeOrder, int priority, int endRelativeAfter) {
            j(instance, endRelativeOrder, priority, endRelativeAfter);
        }

        @Override // p020r2.q2
        public void c(k instance, int endRelativeOrder, int priority, int endRelativeAfter) {
            l0<k> l0VarA = this.releasing;
            if (l0VarA == null) {
                l0VarA = w0.a();
                this.releasing = l0VarA;
            }
            l0VarA.w(instance);
            j(instance, endRelativeOrder, priority, endRelativeAfter);
        }

        @Override // p020r2.q2
        public void d(r2 instance) {
            this.remembering.add(instance);
        }

        @Override // p020r2.q2
        public void e(wn0.a<h0> effect) {
            this.sideEffects.add(effect);
        }

        public final void f() {
            if (this.abandoning.isEmpty()) {
                return;
            }
            Object objA = c4.f106500a.a("Compose:abandons");
            try {
                Iterator<r2> it = this.abandoning.iterator();
                while (it.hasNext()) {
                    r2 next = it.next();
                    it.remove();
                    next.onAbandoned();
                }
                h0 h0Var = h0.f84049a;
            } finally {
                c4.f106500a.b(objA);
            }
        }

        public final void g() {
            i(Integer.MIN_VALUE);
            if (!this.leaving.isEmpty()) {
                Object objA = c4.f106500a.a("Compose:onForgotten");
                try {
                    l0<k> l0Var = this.releasing;
                    for (int size = this.leaving.size() - 1; -1 < size; size--) {
                        Object obj = this.leaving.get(size);
                        if (obj instanceof r2) {
                            this.abandoning.remove(obj);
                            ((r2) obj).onForgotten();
                        }
                        if (obj instanceof k) {
                            if (l0Var == null || !l0Var.a((k) obj)) {
                                ((k) obj).b();
                            } else {
                                ((k) obj).a();
                            }
                        }
                    }
                    h0 h0Var = h0.f84049a;
                    c4.f106500a.b(objA);
                } catch (Throwable th2) {
                    c4.f106500a.b(objA);
                    throw th2;
                }
            }
            if (this.remembering.isEmpty()) {
                return;
            }
            Object objA2 = c4.f106500a.a("Compose:onRemembered");
            try {
                List<r2> list = this.remembering;
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    r2 r2Var = list.get(i11);
                    this.abandoning.remove(r2Var);
                    r2Var.onRemembered();
                }
                h0 h0Var2 = h0.f84049a;
            } finally {
                c4.f106500a.b(objA2);
            }
        }

        public final void h() {
            if (this.sideEffects.isEmpty()) {
                return;
            }
            Object objA = c4.f106500a.a("Compose:sideeffects");
            try {
                List<wn0.a<h0>> list = this.sideEffects;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.get(i11).invoke();
                }
                this.sideEffects.clear();
                h0 h0Var = h0.f84049a;
            } finally {
                c4.f106500a.b(objA);
            }
        }
    }

    public s(q qVar, f<?> fVar, CoroutineContext coroutineContext) {
        this.parent = qVar;
        this.applier = fVar;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        Set<r2> setL = new l0(0, 1, null).l();
        this.abandonSet = setL;
        a3 a3Var = new a3();
        if (qVar.d()) {
            a3Var.i();
        }
        if (qVar.getCollectingSourceInformation()) {
            a3Var.j();
        }
        this.slotTable = a3Var;
        this.observations = new f<>();
        this.invalidatedScopes = new l0<>(0, 1, null);
        this.conditionallyInvalidatedScopes = new l0<>(0, 1, null);
        this.derivedStates = new f<>();
        s2.a aVar = new s2.a();
        this.changes = aVar;
        s2.a aVar2 = new s2.a();
        this.lateChanges = aVar2;
        this.observationsProcessed = new f<>();
        this.invalidations = new f<>();
        this.observerHolder = new z(null, false, 3, null);
        m mVar = new m(fVar, qVar, a3Var, setL, aVar, aVar2, this);
        qVar.p(mVar);
        this.composer = mVar;
        this._recomposeContext = coroutineContext;
        this.isRoot = qVar instanceof m2;
        this.composable = i.f106575a.a();
    }

    private final void A(p<? super l, ? super Integer, h0> content) {
        if (this.disposed) {
            a2.b("The composition is disposed");
        }
        this.composable = content;
        this.parent.a(this, content);
    }

    private final void B() {
        Object andSet = this.pendingModifications.getAndSet(t.f106829a);
        if (andSet != null) {
            if (p013kotlin.jvm.internal.s.f(andSet, t.f106829a)) {
                o.t("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                x((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                o.t("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                x(set, true);
            }
        }
    }

    private final void C() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (p013kotlin.jvm.internal.s.f(andSet, t.f106829a)) {
            return;
        }
        if (andSet instanceof Set) {
            x((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                x(set, false);
            }
            return;
        }
        if (andSet == null) {
            o.t("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        o.t("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    private final boolean D() {
        return this.composer.C0();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[Catch: all -> 0x001e, LOOP:0: B:32:0x0064->B:46:0x00a5, LOOP_END, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:19:0x002d, B:21:0x0032, B:22:0x003b, B:24:0x003f, B:25:0x0048, B:27:0x0054, B:29:0x0058, B:32:0x0064, B:34:0x0074, B:36:0x0080, B:38:0x008a, B:42:0x0099, B:46:0x00a5, B:47:0x00a8, B:50:0x00ad), top: B:63:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad A[Catch: all -> 0x001e, EDGE_INSN: B:50:0x00ad->B:51:0x00b2 BREAK  A[LOOP:0: B:32:0x0064->B:46:0x00a5], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:19:0x002d, B:21:0x0032, B:22:0x003b, B:24:0x003f, B:25:0x0048, B:27:0x0054, B:29:0x0058, B:32:0x0064, B:34:0x0074, B:36:0x0080, B:38:0x008a, B:42:0x0099, B:46:0x00a5, B:47:0x00a8, B:50:0x00ad), top: B:63:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad A[SYNTHETIC] */
    private final x0 F(j2 scope, d anchor, Object instance) {
        synchronized (this.lock) {
            try {
                s sVar = this.invalidationDelegate;
                s sVar2 = null;
                if (sVar != null) {
                    if (!this.slotTable.u(this.invalidationDelegateGroup, anchor)) {
                        sVar = null;
                    }
                    sVar2 = sVar;
                }
                if (sVar2 == null) {
                    if (L(scope, instance)) {
                        return x0.IMMINENT;
                    }
                    H();
                    if (instance != null && (instance instanceof h0)) {
                        Object objC = this.invalidations.d().c(scope);
                        if (objC != null) {
                            if (!(objC instanceof l0)) {
                                if (objC != v2.f106849a) {
                                    this.invalidations.a(scope, instance);
                                    break;
                                }
                            } else {
                                l0 l0Var = (l0) objC;
                                Object[] objArr = l0Var.elements;
                                long[] jArr = l0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    this.invalidations.a(scope, instance);
                                    break;
                                }
                                int i11 = 0;
                                loop0: while (true) {
                                    long j11 = jArr[i11];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i11 == length) {
                                            this.invalidations.a(scope, instance);
                                            break;
                                        }
                                        i11++;
                                    } else {
                                        int i12 = 8;
                                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            if ((j11 & 255) < 128 && objArr[(i11 << 3) + i14] == v2.f106849a) {
                                                break loop0;
                                            }
                                            j11 >>= i12;
                                            i14++;
                                            i12 = i12;
                                        }
                                        if (i13 == i12) {
                                            if (i11 == length) {
                                                i11++;
                                            }
                                        }
                                        this.invalidations.a(scope, instance);
                                        break;
                                    }
                                }
                            }
                        } else {
                            this.invalidations.a(scope, instance);
                            break;
                        }
                    } else {
                        this.invalidations.h(scope, v2.f106849a);
                    }
                }
                if (sVar2 != null) {
                    return sVar2.F(scope, anchor, instance);
                }
                this.parent.l(this);
                return q() ? x0.DEFERRED : x0.SCHEDULED;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void G(Object value) {
        Object objC = this.observations.d().c(value);
        if (objC == null) {
            return;
        }
        if (!(objC instanceof l0)) {
            j2 j2Var = (j2) objC;
            if (j2Var.s(value) == x0.IMMINENT) {
                this.observationsProcessed.a(value, j2Var);
                return;
            }
            return;
        }
        l0 l0Var = (l0) objC;
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
                        j2 j2Var2 = (j2) objArr[(i11 << 3) + i13];
                        if (j2Var2.s(value) == x0.IMMINENT) {
                            this.observationsProcessed.a(value, j2Var2);
                        }
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

    private final c H() {
        z zVar = this.observerHolder;
        if (zVar.getRoot()) {
            zVar.a();
            return null;
        }
        z zVarJ = this.parent.getObserverHolder();
        if (zVarJ != null) {
            zVarJ.a();
        }
        zVar.a();
        if (!p013kotlin.jvm.internal.s.f(null, null)) {
            zVar.c(null);
        }
        return null;
    }

    private final f<j2, Object> K() {
        f<j2, Object> fVar = this.invalidations;
        this.invalidations = new f<>();
        return fVar;
    }

    private final boolean L(j2 scope, Object instance) {
        return q() && this.composer.q1(scope, instance);
    }

    private final void w(Object value, boolean forgetConditionalScopes) {
        Object objC = this.observations.d().c(value);
        if (objC == null) {
            return;
        }
        if (!(objC instanceof l0)) {
            j2 j2Var = (j2) objC;
            if (this.observationsProcessed.f(value, j2Var) || j2Var.s(value) == x0.IGNORED) {
                return;
            }
            if (!j2Var.t() || forgetConditionalScopes) {
                this.invalidatedScopes.h(j2Var);
                return;
            } else {
                this.conditionallyInvalidatedScopes.h(j2Var);
                return;
            }
        }
        l0 l0Var = (l0) objC;
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
                        j2 j2Var2 = (j2) objArr[(i11 << 3) + i13];
                        if (!this.observationsProcessed.f(value, j2Var2) && j2Var2.s(value) != x0.IGNORED) {
                            if (!j2Var2.t() || forgetConditionalScopes) {
                                this.invalidatedScopes.h(j2Var2);
                            } else {
                                this.conditionallyInvalidatedScopes.h(j2Var2);
                            }
                        }
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

    /* JADX WARN: Code duplicated, block: B:107:0x023e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0240 A[LOOP:6: B:91:0x01ec->B:108:0x0240, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:167:0x0353 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x0355 A[LOOP:10: B:150:0x0308->B:168:0x0355, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:191:0x00c7 A[EDGE_INSN: B:191:0x00c7->B:37:0x00c7 BREAK  A[LOOP:2: B:24:0x007b->B:35:0x00b7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x024d A[EDGE_INSN: B:199:0x024d->B:110:0x024d BREAK  A[LOOP:6: B:91:0x01ec->B:108:0x0240], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x035c A[EDGE_INSN: B:205:0x035c->B:170:0x035c BREAK  A[LOOP:10: B:150:0x0308->B:168:0x0355], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0117 A[EDGE_INSN: B:219:0x0117->B:214:0x0117 BREAK  A[LOOP:13: B:60:0x014c->B:71:0x0180], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7 A[LOOP:2: B:24:0x007b->B:35:0x00b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0180 A[LOOP:13: B:60:0x014c->B:71:0x0180, LOOP_END] */
    private final void x(Set<? extends Object> values, boolean forgetConditionalScopes) {
        char c11;
        long j11;
        long j12;
        long j13;
        long[] jArr;
        String str;
        long j14;
        boolean zA;
        long j15;
        long[] jArr2;
        int i11;
        long[] jArr3;
        int i12;
        int i13;
        long j16;
        boolean zD;
        int i14;
        long j17;
        long j18;
        char c12;
        long j19;
        int i15;
        int i16;
        Object obj = null;
        char c13 = 7;
        long j21 = -9187201950435737472L;
        int i17 = 8;
        if (values instanceof d) {
            v0 v0VarB = ((d) values).b();
            Object[] objArr = v0VarB.elements;
            long[] jArr4 = v0VarB.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i18 = 0;
                j12 = 128;
                while (true) {
                    long j22 = jArr4[i18];
                    j13 = 255;
                    if ((((~j22) << c13) & j22 & j21) != j21) {
                        int i19 = 8 - ((~(i18 - length)) >>> 31);
                        int i21 = 0;
                        while (i21 < i19) {
                            if ((j22 & 255) < 128) {
                                c12 = c13;
                                Object obj2 = objArr[(i18 << 3) + i21];
                                j19 = j21;
                                if (obj2 instanceof j2) {
                                    ((j2) obj2).s(obj);
                                } else {
                                    w(obj2, forgetConditionalScopes);
                                    Object objC = this.derivedStates.d().c(obj2);
                                    if (objC != null) {
                                        if (objC instanceof l0) {
                                            l0 l0Var = (l0) objC;
                                            Object[] objArr2 = l0Var.elements;
                                            long[] jArr5 = l0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                            int length2 = jArr5.length - 2;
                                            if (length2 >= 0) {
                                                j18 = j22;
                                                int i22 = 0;
                                                while (true) {
                                                    long j23 = jArr5[i22];
                                                    int i23 = i17;
                                                    i15 = length;
                                                    if ((((~j23) << c12) & j23 & j19) != j19) {
                                                        int i24 = 8 - ((~(i22 - length2)) >>> 31);
                                                        int i25 = 0;
                                                        while (i25 < i24) {
                                                            if ((j23 & 255) < 128) {
                                                                w((h0) objArr2[(i22 << 3) + i25], forgetConditionalScopes);
                                                            }
                                                            j23 >>= i23;
                                                            i25++;
                                                            i23 = i23;
                                                        }
                                                        if (i24 != i23) {
                                                            break;
                                                        }
                                                        if (i22 != length2) {
                                                            break;
                                                        }
                                                        i22++;
                                                        length = i15;
                                                        i17 = 8;
                                                    } else if (i22 != length2) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i22++;
                                                        length = i15;
                                                        i17 = 8;
                                                    }
                                                }
                                            }
                                        } else {
                                            j18 = j22;
                                            i15 = length;
                                            w((h0) objC, forgetConditionalScopes);
                                        }
                                    }
                                    i16 = 8;
                                }
                                j18 = j22;
                                i15 = length;
                                i16 = 8;
                            } else {
                                j18 = j22;
                                c12 = c13;
                                j19 = j21;
                                i15 = length;
                                i16 = i17;
                            }
                            i21++;
                            length = i15;
                            i17 = i16;
                            c13 = c12;
                            j21 = j19;
                            j22 = j18 >> i16;
                            obj = null;
                        }
                        c11 = c13;
                        j11 = j21;
                        int i26 = length;
                        if (i19 != i17) {
                            break;
                        } else {
                            length = i26;
                        }
                    } else {
                        c11 = c13;
                        j11 = j21;
                    }
                    if (i18 == length) {
                        break;
                    }
                    i18++;
                    c13 = c11;
                    j21 = j11;
                    obj = null;
                    i17 = 8;
                }
            } else {
                c11 = 7;
                j11 = -9187201950435737472L;
                j12 = 128;
                j13 = 255;
            }
        } else {
            c11 = 7;
            j11 = -9187201950435737472L;
            j12 = 128;
            j13 = 255;
            for (Object obj3 : values) {
                if (obj3 instanceof j2) {
                    ((j2) obj3).s(null);
                } else {
                    w(obj3, forgetConditionalScopes);
                    Object objC2 = this.derivedStates.d().c(obj3);
                    if (objC2 != null) {
                        if (objC2 instanceof l0) {
                            l0 l0Var2 = (l0) objC2;
                            Object[] objArr3 = l0Var2.elements;
                            long[] jArr6 = l0Var2.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i27 = 0;
                                while (true) {
                                    long j24 = jArr6[i27];
                                    if ((((~j24) << 7) & j24 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i27 != length3) {
                                            break;
                                            break;
                                        }
                                        i27++;
                                    } else {
                                        int i28 = 8 - ((~(i27 - length3)) >>> 31);
                                        for (int i29 = 0; i29 < i28; i29++) {
                                            if ((j24 & 255) < 128) {
                                                w((h0) objArr3[(i27 << 3) + i29], forgetConditionalScopes);
                                            }
                                            j24 >>= 8;
                                        }
                                        if (i28 != 8) {
                                            break;
                                        } else if (i27 != length3) {
                                            break;
                                        } else {
                                            i27++;
                                        }
                                    }
                                }
                            }
                        } else {
                            w((h0) objC2, forgetConditionalScopes);
                        }
                    }
                }
            }
        }
        l0<j2> l0Var3 = this.conditionallyInvalidatedScopes;
        l0<j2> l0Var4 = this.invalidatedScopes;
        String str2 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        if (!forgetConditionalScopes || !l0Var3.e()) {
            if (l0Var4.e()) {
                k0<Object, Object> k0VarD = this.observations.d();
                long[] jArr7 = k0VarD.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                int length4 = jArr7.length - 2;
                if (length4 >= 0) {
                    int i31 = 0;
                    while (true) {
                        long j25 = jArr7[i31];
                        if ((((~j25) << c11) & j25 & j11) != j11) {
                            int i32 = 8 - ((~(i31 - length4)) >>> 31);
                            int i33 = 0;
                            while (i33 < i32) {
                                if ((j25 & j13) < j12) {
                                    int i34 = (i31 << 3) + i33;
                                    Object obj4 = k0VarD.keys[i34];
                                    Object obj5 = k0VarD.values[i34];
                                    if (obj5 instanceof l0) {
                                        p013kotlin.jvm.internal.s.i(obj5, str2);
                                        l0 l0Var5 = (l0) obj5;
                                        Object[] objArr4 = l0Var5.elements;
                                        long[] jArr8 = l0Var5.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                        int length5 = jArr8.length - 2;
                                        if (length5 >= 0) {
                                            int i35 = 0;
                                            while (true) {
                                                long j26 = jArr8[i35];
                                                j14 = j25;
                                                if ((((~j26) << c11) & j26 & j11) != j11) {
                                                    int i36 = 8 - ((~(i35 - length5)) >>> 31);
                                                    int i37 = 0;
                                                    while (i37 < i36) {
                                                        if ((j26 & j13) < j12) {
                                                            j15 = j26;
                                                            int i38 = (i35 << 3) + i37;
                                                            if (l0Var4.a((j2) objArr4[i38])) {
                                                                l0Var5.y(i38);
                                                            }
                                                        } else {
                                                            j15 = j26;
                                                        }
                                                        i37++;
                                                        j26 = j15 >> 8;
                                                    }
                                                    if (i36 != 8) {
                                                        break;
                                                    }
                                                    if (i35 != length5) {
                                                        break;
                                                    }
                                                    i35++;
                                                    j25 = j14;
                                                } else if (i35 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i35++;
                                                    j25 = j14;
                                                }
                                            }
                                        } else {
                                            j14 = j25;
                                        }
                                        zA = l0Var5.d();
                                    } else {
                                        j14 = j25;
                                        p013kotlin.jvm.internal.s.i(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                        zA = l0Var4.a((j2) obj5);
                                    }
                                    if (zA) {
                                        k0VarD.q(i34);
                                    }
                                } else {
                                    jArr7 = jArr7;
                                    str2 = str2;
                                    j14 = j25;
                                }
                                j25 = j14 >> 8;
                                i33++;
                                jArr7 = jArr7;
                                str2 = str2;
                            }
                            jArr = jArr7;
                            str = str2;
                            if (i32 != 8) {
                                break;
                            }
                        } else {
                            jArr = jArr7;
                            str = str2;
                        }
                        if (i31 == length4) {
                            break;
                        }
                        i31++;
                        jArr7 = jArr;
                        str2 = str;
                    }
                }
                z();
                l0Var4.m();
                return;
            }
            return;
        }
        k0<Object, Object> k0VarD2 = this.observations.d();
        long[] jArr9 = k0VarD2.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length6 = jArr9.length - 2;
        if (length6 >= 0) {
            int i39 = 0;
            while (true) {
                long j27 = jArr9[i39];
                if ((((~j27) << c11) & j27 & j11) != j11) {
                    int i41 = 8 - ((~(i39 - length6)) >>> 31);
                    int i42 = 0;
                    while (i42 < i41) {
                        if ((j27 & j13) < j12) {
                            int i43 = (i39 << 3) + i42;
                            Object obj6 = k0VarD2.keys[i43];
                            Object obj7 = k0VarD2.values[i43];
                            if (obj7 instanceof l0) {
                                p013kotlin.jvm.internal.s.i(obj7, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                l0 l0Var6 = (l0) obj7;
                                Object[] objArr5 = l0Var6.elements;
                                long[] jArr10 = l0Var6.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                jArr3 = jArr9;
                                int length7 = jArr10.length - 2;
                                if (length7 >= 0) {
                                    j16 = j27;
                                    int i44 = 0;
                                    while (true) {
                                        long j28 = jArr10[i44];
                                        i12 = length6;
                                        i13 = i39;
                                        if ((((~j28) << c11) & j28 & j11) != j11) {
                                            int i45 = 8 - ((~(i44 - length7)) >>> 31);
                                            for (int i46 = 0; i46 < i45; i46 = i14 + 1) {
                                                if ((j28 & j13) < j12) {
                                                    i14 = i46;
                                                    int i47 = (i44 << 3) + i14;
                                                    j17 = j28;
                                                    j2 j2Var = (j2) objArr5[i47];
                                                    if (l0Var3.a(j2Var) || l0Var4.a(j2Var)) {
                                                        l0Var6.y(i47);
                                                    }
                                                } else {
                                                    i14 = i46;
                                                    j17 = j28;
                                                }
                                                j28 = j17 >> 8;
                                            }
                                            if (i45 != 8) {
                                                break;
                                            }
                                            if (i44 != length7) {
                                                break;
                                            }
                                            i44++;
                                            length6 = i12;
                                            i39 = i13;
                                        } else if (i44 != length7) {
                                            break;
                                            break;
                                        } else {
                                            i44++;
                                            length6 = i12;
                                            i39 = i13;
                                        }
                                    }
                                } else {
                                    i12 = length6;
                                    i13 = i39;
                                    j16 = j27;
                                }
                                zD = l0Var6.d();
                            } else {
                                jArr3 = jArr9;
                                i12 = length6;
                                i13 = i39;
                                j16 = j27;
                                p013kotlin.jvm.internal.s.i(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                j2 j2Var2 = (j2) obj7;
                                zD = l0Var3.a(j2Var2) || l0Var4.a(j2Var2);
                            }
                            if (zD) {
                                k0VarD2.q(i43);
                            }
                        } else {
                            jArr3 = jArr9;
                            i12 = length6;
                            i13 = i39;
                            j16 = j27;
                        }
                        j27 = j16 >> 8;
                        i42++;
                        length6 = i12;
                        jArr9 = jArr3;
                        i39 = i13;
                    }
                    jArr2 = jArr9;
                    int i48 = length6;
                    int i49 = i39;
                    if (i41 != 8) {
                        break;
                    }
                    length6 = i48;
                    i11 = i49;
                } else {
                    jArr2 = jArr9;
                    i11 = i39;
                }
                if (i11 == length6) {
                    break;
                }
                i39 = i11 + 1;
                jArr9 = jArr2;
            }
        }
        l0Var3.m();
        z();
    }

    private final void y(s2.a changes) throws Throwable {
        a aVar;
        long[] jArr;
        int i11;
        a aVar2;
        long[] jArr2;
        long j11;
        char c11;
        long j12;
        int i12;
        boolean zD;
        a aVar3;
        a aVar4 = new a(this.abandonSet);
        try {
            if (changes.c()) {
                if (this.lateChanges.c()) {
                    aVar4.f();
                    return;
                }
                return;
            }
            try {
                c4 c4Var = c4.f106500a;
                Object objA = c4Var.a("Compose:applyChanges");
                try {
                    this.applier.d();
                    SlotWriter slotWriterW = this.slotTable.w();
                    int i13 = 0;
                    try {
                        changes.b(this.applier, slotWriterW, aVar4);
                        h0 h0Var = h0.f84049a;
                        slotWriterW.L(true);
                        this.applier.c();
                        c4Var.b(objA);
                        aVar4.g();
                        aVar4.h();
                        if (this.pendingInvalidScopes) {
                            Object objA2 = c4Var.a("Compose:unobserve");
                            try {
                                this.pendingInvalidScopes = false;
                                k0<Object, Object> k0VarD = this.observations.d();
                                long[] jArr3 = k0VarD.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i14 = 0;
                                    while (true) {
                                        long j13 = jArr3[i14];
                                        char c12 = 7;
                                        long j14 = -9187201950435737472L;
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i15 = 8;
                                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                                            int i17 = i13;
                                            while (i17 < i16) {
                                                if ((j13 & 255) < 128) {
                                                    c11 = c12;
                                                    int i18 = (i14 << 3) + i17;
                                                    j12 = j14;
                                                    Object obj = k0VarD.keys[i18];
                                                    Object obj2 = k0VarD.values[i18];
                                                    if (obj2 instanceof l0) {
                                                        p013kotlin.jvm.internal.s.i(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                                        l0 l0Var = (l0) obj2;
                                                        Object[] objArr = l0Var.elements;
                                                        long[] jArr4 = l0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                                        int i19 = i15;
                                                        int length2 = jArr4.length - 2;
                                                        i11 = i17;
                                                        if (length2 >= 0) {
                                                            jArr2 = jArr3;
                                                            int i21 = 0;
                                                            while (true) {
                                                                long j15 = jArr4[i21];
                                                                j11 = j13;
                                                                if ((((~j15) << c11) & j15 & j12) != j12) {
                                                                    int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                                    int i23 = 0;
                                                                    while (i23 < i22) {
                                                                        if ((j15 & 255) < 128) {
                                                                            aVar3 = aVar4;
                                                                            int i24 = (i21 << 3) + i23;
                                                                            try {
                                                                                if (!((j2) objArr[i24]).r()) {
                                                                                    l0Var.y(i24);
                                                                                }
                                                                            } catch (Throwable th2) {
                                                                                th = th2;
                                                                                c4.f106500a.b(objA2);
                                                                                throw th;
                                                                            }
                                                                        } else {
                                                                            aVar3 = aVar4;
                                                                        }
                                                                        j15 >>= i19;
                                                                        i23++;
                                                                        aVar4 = aVar3;
                                                                    }
                                                                    aVar2 = aVar4;
                                                                    if (i22 != i19) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    aVar2 = aVar4;
                                                                }
                                                                if (i21 == length2) {
                                                                    break;
                                                                }
                                                                i21++;
                                                                j13 = j11;
                                                                aVar4 = aVar2;
                                                                i19 = 8;
                                                            }
                                                        } else {
                                                            aVar2 = aVar4;
                                                            jArr2 = jArr3;
                                                            j11 = j13;
                                                        }
                                                        zD = l0Var.d();
                                                    } else {
                                                        i11 = i17;
                                                        aVar2 = aVar4;
                                                        jArr2 = jArr3;
                                                        j11 = j13;
                                                        p013kotlin.jvm.internal.s.i(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                                        zD = !((j2) obj2).r();
                                                    }
                                                    if (zD) {
                                                        k0VarD.q(i18);
                                                    }
                                                    i12 = 8;
                                                } else {
                                                    i11 = i17;
                                                    aVar2 = aVar4;
                                                    jArr2 = jArr3;
                                                    j11 = j13;
                                                    c11 = c12;
                                                    j12 = j14;
                                                    i12 = i15;
                                                }
                                                j13 = j11 >> i12;
                                                i17 = i11 + 1;
                                                i15 = i12;
                                                c12 = c11;
                                                j14 = j12;
                                                jArr3 = jArr2;
                                                aVar4 = aVar2;
                                            }
                                            aVar = aVar4;
                                            jArr = jArr3;
                                            if (i16 != i15) {
                                                break;
                                            }
                                        } else {
                                            aVar = aVar4;
                                            jArr = jArr3;
                                        }
                                        if (i14 == length) {
                                            break;
                                        }
                                        i14++;
                                        jArr3 = jArr;
                                        aVar4 = aVar;
                                        i13 = 0;
                                    }
                                } else {
                                    aVar = aVar4;
                                }
                                z();
                                h0 h0Var2 = h0.f84049a;
                                c4.f106500a.b(objA2);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            aVar = aVar4;
                        }
                        if (this.lateChanges.c()) {
                            aVar.f();
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        try {
                            slotWriterW.L(false);
                            throw th4;
                        } catch (Throwable th5) {
                            th = th5;
                            c4.f106500a.b(objA);
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
        if (this.lateChanges.c()) {
            aVar4.f();
        }
        throw th;
    }

    private final void z() {
        char c11;
        long j11;
        long j12;
        long j13;
        long[] jArr;
        long[] jArr2;
        long j14;
        int i11;
        char c12;
        long j15;
        long j16;
        int i12;
        boolean zD;
        long[] jArr3;
        int i13;
        int i14;
        k0<Object, Object> k0VarD = this.derivedStates.d();
        long[] jArr4 = k0VarD.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length = jArr4.length - 2;
        char c13 = 7;
        long j17 = -9187201950435737472L;
        int i15 = 8;
        if (length >= 0) {
            int i16 = 0;
            long j18 = 128;
            while (true) {
                long j19 = jArr4[i16];
                j12 = 255;
                if ((((~j19) << c13) & j19 & j17) != j17) {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j19 & 255) < j18) {
                            c12 = c13;
                            int i19 = (i16 << 3) + i18;
                            j15 = j17;
                            Object obj = k0VarD.keys[i19];
                            Object obj2 = k0VarD.values[i19];
                            if (obj2 instanceof l0) {
                                p013kotlin.jvm.internal.s.i(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                l0 l0Var = (l0) obj2;
                                Object[] objArr = l0Var.elements;
                                long[] jArr5 = l0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j16 = j18;
                                    int i21 = 0;
                                    int i22 = i15;
                                    while (true) {
                                        int i23 = length2;
                                        long j21 = jArr5[i21];
                                        j14 = j19;
                                        if ((((~j21) << c12) & j21 & j15) != j15) {
                                            int i24 = 8 - ((~(i21 - i23)) >>> 31);
                                            int i25 = 0;
                                            while (i25 < i24) {
                                                if ((j21 & 255) < j16) {
                                                    jArr3 = jArr4;
                                                    int i26 = (i21 << 3) + i25;
                                                    i13 = i25;
                                                    i14 = i18;
                                                    if (!this.observations.c((h0) objArr[i26])) {
                                                        l0Var.y(i26);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i13 = i25;
                                                    i14 = i18;
                                                }
                                                j21 >>= i22;
                                                i25 = i13 + 1;
                                                i18 = i14;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i11 = i18;
                                            if (i24 != i22) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i11 = i18;
                                        }
                                        length2 = i23;
                                        if (i21 == length2) {
                                            break;
                                        }
                                        i21++;
                                        j19 = j14;
                                        i18 = i11;
                                        jArr4 = jArr2;
                                        i22 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j14 = j19;
                                    i11 = i18;
                                    j16 = j18;
                                }
                                zD = l0Var.d();
                            } else {
                                jArr2 = jArr4;
                                j14 = j19;
                                i11 = i18;
                                j16 = j18;
                                p013kotlin.jvm.internal.s.i(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                zD = !this.observations.c((h0) obj2);
                            }
                            if (zD) {
                                k0VarD.q(i19);
                            }
                            i12 = 8;
                        } else {
                            jArr2 = jArr4;
                            j14 = j19;
                            i11 = i18;
                            c12 = c13;
                            j15 = j17;
                            j16 = j18;
                            i12 = i15;
                        }
                        j19 = j14 >> i12;
                        i18 = i11 + 1;
                        i15 = i12;
                        c13 = c12;
                        j17 = j15;
                        j18 = j16;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c11 = c13;
                    j11 = j17;
                    j13 = j18;
                    if (i17 != i15) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c11 = c13;
                    j11 = j17;
                    j13 = j18;
                }
                if (i16 == length) {
                    break;
                }
                i16++;
                c13 = c11;
                j17 = j11;
                j18 = j13;
                jArr4 = jArr;
                i15 = 8;
            }
        } else {
            c11 = 7;
            j11 = -9187201950435737472L;
            j12 = 255;
            j13 = 128;
        }
        if (!this.conditionallyInvalidatedScopes.e()) {
            return;
        }
        l0<j2> l0Var2 = this.conditionallyInvalidatedScopes;
        Object[] objArr2 = l0Var2.elements;
        long[] jArr6 = l0Var2.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i27 = 0;
        while (true) {
            long j22 = jArr6[i27];
            if ((((~j22) << c11) & j22 & j11) != j11) {
                int i28 = 8 - ((~(i27 - length3)) >>> 31);
                for (int i29 = 0; i29 < i28; i29++) {
                    if ((j22 & j12) < j13) {
                        int i31 = (i27 << 3) + i29;
                        if (!((j2) objArr2[i31]).t()) {
                            l0Var2.y(i31);
                        }
                    }
                    j22 >>= 8;
                }
                if (i28 != 8) {
                    return;
                }
            }
            if (i27 == length3) {
                return;
            } else {
                i27++;
            }
        }
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final z getObserverHolder() {
        return this.observerHolder;
    }

    public final void I(h0<?> state) {
        if (this.observations.c(state)) {
            return;
        }
        this.derivedStates.g(state);
    }

    public final void J(Object instance, j2 scope) {
        this.observations.f(instance, scope);
    }

    @Override // p020r2.e0, p020r2.l2
    public void a(Object value) {
        j2 j2VarE0;
        int i11;
        int i12;
        if (D() || (j2VarE0 = this.composer.E0()) == null) {
            return;
        }
        int i13 = 1;
        j2VarE0.H(true);
        if (j2VarE0.w(value)) {
            return;
        }
        if (value instanceof l) {
            ((l) value).E(e.a(1));
        }
        this.observations.a(value, j2VarE0);
        if (value instanceof h0) {
            h0<?> h0Var = (h0) value;
            h0.a<?> aVarA = h0Var.A();
            this.derivedStates.g(value);
            n0<k> n0VarB = aVarA.b();
            Object[] objArr = n0VarB.keys;
            long[] jArr = n0VarB.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j11 = jArr[i14];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8;
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j11 & 255) < 128) {
                                i12 = i13;
                                k kVar = (k) objArr[(i14 << 3) + i17];
                                if (kVar instanceof l) {
                                    ((l) kVar).E(e.a(i12));
                                }
                                this.derivedStates.a(kVar, value);
                            } else {
                                i12 = i13;
                                i15 = i15;
                            }
                            j11 >>= i15;
                            i17++;
                            i13 = i12;
                            i15 = i15;
                        }
                        i11 = i13;
                        if (i16 != i15) {
                            break;
                        }
                    } else {
                        i11 = i13;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    i13 = i11;
                }
            }
            j2VarE0.v(h0Var, aVarA.a());
        }
    }

    @Override // p020r2.e0
    public void b() {
        synchronized (this.lock) {
            try {
                for (Object obj : this.slotTable.getSlots()) {
                    j2 j2Var = obj instanceof j2 ? (j2) obj : null;
                    if (j2Var != null) {
                        j2Var.invalidate();
                    }
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p020r2.t2
    public void c(p<? super l, ? super Integer, h0> content) {
        this.composer.o1();
        A(content);
        this.composer.v0();
    }

    @Override // p020r2.p
    public void d(p<? super l, ? super Integer, h0> content) {
        A(content);
    }

    @Override // p020r2.t2
    public void deactivate() {
        synchronized (this.lock) {
            try {
                boolean z11 = this.slotTable.getGroupsSize() > 0;
                if (z11 || !this.abandonSet.isEmpty()) {
                    c4 c4Var = c4.f106500a;
                    Object objA = c4Var.a("Compose:deactivate");
                    try {
                        a aVar = new a(this.abandonSet);
                        if (z11) {
                            this.applier.d();
                            SlotWriter slotWriterW = this.slotTable.w();
                            try {
                                o.u(slotWriterW, aVar);
                                h0 h0Var = h0.f84049a;
                                slotWriterW.L(true);
                                this.applier.c();
                                aVar.g();
                            } catch (Throwable th2) {
                                slotWriterW.L(false);
                                throw th2;
                            }
                        }
                        aVar.f();
                        h0 h0Var2 = h0.f84049a;
                        c4Var.b(objA);
                    } catch (Throwable th3) {
                        c4.f106500a.b(objA);
                        throw th3;
                    }
                }
                this.observations.b();
                this.derivedStates.b();
                this.invalidations.b();
                this.changes.a();
                this.lateChanges.a();
                this.composer.p0();
                h0 h0Var3 = h0.f84049a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // p020r2.p
    public void dispose() {
        synchronized (this.lock) {
            try {
                if (this.composer.getIsComposing()) {
                    a2.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.disposed) {
                    this.disposed = true;
                    this.composable = i.f106575a.b();
                    s2.a aVarF0 = this.composer.getDeferredChanges();
                    if (aVarF0 != null) {
                        y(aVarF0);
                    }
                    boolean z11 = this.slotTable.getGroupsSize() > 0;
                    if (z11 || !this.abandonSet.isEmpty()) {
                        a aVar = new a(this.abandonSet);
                        if (z11) {
                            this.applier.d();
                            SlotWriter slotWriterW = this.slotTable.w();
                            try {
                                o.M(slotWriterW, aVar);
                                h0 h0Var = h0.f84049a;
                                slotWriterW.L(true);
                                this.applier.clear();
                                this.applier.c();
                                aVar.g();
                            } catch (Throwable th2) {
                                slotWriterW.L(false);
                                throw th2;
                            }
                        }
                        aVar.f();
                    }
                    this.composer.q0();
                }
                h0 h0Var2 = h0.f84049a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.parent.t(this);
    }

    @Override // p020r2.e0
    public <R> R e(e0 to2, int groupIndex, wn0.a<? extends R> block) {
        if (to2 == null || p013kotlin.jvm.internal.s.f(to2, this) || groupIndex < 0) {
            return block.invoke();
        }
        this.invalidationDelegate = (s) to2;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return block.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[LOOP:0: B:7:0x0016->B:21:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[SYNTHETIC] */
    @Override // p020r2.e0
    public boolean f(Set<? extends Object> values) {
        if (values instanceof d) {
            v0 v0VarB = ((d) values).b();
            Object[] objArr = v0VarB.elements;
            long[] jArr = v0VarB.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                loop0: while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                Object obj = objArr[(i11 << 3) + i13];
                                if (this.observations.c(obj) || this.derivedStates.c(obj)) {
                                    break loop0;
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i12 == 8) {
                            if (i11 != length) {
                                i11++;
                            }
                        }
                    } else if (i11 != length) {
                        i11++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : values) {
                if (this.observations.c(obj2) || this.derivedStates.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p020r2.l2
    public x0 g(j2 scope, Object instance) {
        s sVar;
        if (scope.k()) {
            scope.C(true);
        }
        d dVarI = scope.getAnchor();
        if (dVarI == null || !dVarI.b()) {
            return x0.IGNORED;
        }
        if (this.slotTable.x(dVarI)) {
            return !scope.j() ? x0.IGNORED : F(scope, dVarI, instance);
        }
        synchronized (this.lock) {
            sVar = this.invalidationDelegate;
        }
        return (sVar == null || !sVar.L(scope, instance)) ? x0.IGNORED : x0.IMMINENT;
    }

    @Override // p020r2.e0
    public void h() {
        synchronized (this.lock) {
            try {
                this.composer.h0();
                if (!this.abandonSet.isEmpty()) {
                    new a(this.abandonSet).f();
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new a(this.abandonSet).f();
                        }
                        throw th2;
                    } catch (Exception e11) {
                        t();
                        throw e11;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // p020r2.e0
    public void i(wn0.a<h0> block) {
        this.composer.S0(block);
    }

    @Override // p020r2.p
    /* JADX INFO: renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    @Override // p020r2.e0
    public void j(j1 state) {
        a aVar = new a(this.abandonSet);
        SlotWriter slotWriterW = state.getSlotTable().w();
        try {
            o.M(slotWriterW, aVar);
            h0 h0Var = h0.f84049a;
            slotWriterW.L(true);
            aVar.g();
        } catch (Throwable th2) {
            slotWriterW.L(false);
            throw th2;
        }
    }

    @Override // p020r2.e0
    public void k() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.d()) {
                    y(this.lateChanges);
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new a(this.abandonSet).f();
                        }
                        throw th2;
                    } catch (Exception e11) {
                        t();
                        throw e11;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // p020r2.l2
    public void l(j2 scope) {
        this.pendingInvalidScopes = true;
    }

    @Override // p020r2.e0
    public void m(List<Pair<k1, k1>> references) throws Exception {
        int size = references.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z11 = true;
                break;
            } else if (!p013kotlin.jvm.internal.s.f(references.get(i11).e().getComposition(), this)) {
                break;
            } else {
                i11++;
            }
        }
        o.Q(z11);
        try {
            this.composer.K0(references);
            h0 h0Var = h0.f84049a;
        } catch (Throwable th2) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    new a(this.abandonSet).f();
                }
                throw th2;
            } catch (Exception e11) {
                t();
                throw e11;
            }
        }
    }

    @Override // p020r2.e0
    public boolean n() {
        boolean zU0;
        synchronized (this.lock) {
            try {
                B();
                try {
                    f<j2, Object> fVarK = K();
                    try {
                        H();
                        zU0 = this.composer.U0(fVarK);
                        if (!zU0) {
                            C();
                        }
                    } catch (Exception e11) {
                        this.invalidations = fVarK;
                        throw e11;
                    }
                } catch (Throwable th2) {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new a(this.abandonSet).f();
                        }
                        throw th2;
                    } catch (Exception e12) {
                        t();
                        throw e12;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zU0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p020r2.e0
    public void o(Set<? extends Object> values) {
        Object obj;
        Object objM;
        do {
            obj = this.pendingModifications.get();
            if (obj == null ? true : p013kotlin.jvm.internal.s.f(obj, t.f106829a)) {
                objM = values;
            } else if (obj instanceof Set) {
                objM = new Set[]{obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objM = n.M((Set[]) obj, values);
            }
        } while (!i.a(this.pendingModifications, obj, objM));
        if (obj == null) {
            synchronized (this.lock) {
                C();
                h0 h0Var = h0.f84049a;
            }
        }
    }

    @Override // p020r2.e0
    public void p() {
        synchronized (this.lock) {
            try {
                y(this.changes);
                C();
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new a(this.abandonSet).f();
                        }
                        throw th2;
                    } catch (Exception e11) {
                        t();
                        throw e11;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // p020r2.e0
    public boolean q() {
        return this.composer.getIsComposing();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005d A[Catch: all -> 0x0053, LOOP:0: B:11:0x0023->B:23:0x005d, LOOP_END, TryCatch #0 {all -> 0x0053, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0016, B:11:0x0023, B:13:0x0033, B:15:0x003f, B:17:0x0048, B:20:0x0055, B:23:0x005d, B:24:0x0060, B:25:0x0065), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0065 A[EDGE_INSN: B:33:0x0065->B:25:0x0065 BREAK  A[LOOP:0: B:11:0x0023->B:23:0x005d], SYNTHETIC] */
    @Override // p020r2.e0
    public void r(Object value) {
        synchronized (this.lock) {
            try {
                G(value);
                Object objC = this.derivedStates.d().c(value);
                if (objC != null) {
                    if (objC instanceof l0) {
                        l0 l0Var = (l0) objC;
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
                                            G((h0) objArr[(i11 << 3) + i13]);
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
                    } else {
                        G((h0) objC);
                    }
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p020r2.p
    public boolean s() {
        boolean z11;
        synchronized (this.lock) {
            z11 = this.invalidations.e() > 0;
        }
        return z11;
    }

    @Override // p020r2.e0
    public void t() {
        this.pendingModifications.set(null);
        this.changes.a();
        this.lateChanges.a();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        new a(this.abandonSet).f();
    }

    @Override // p020r2.e0
    public void u(p<? super l, ? super Integer, h0> content) throws Exception {
        try {
            synchronized (this.lock) {
                B();
                f<j2, Object> fVarK = K();
                try {
                    H();
                    this.composer.k0(fVarK, content);
                } catch (Exception e11) {
                    this.invalidations = fVarK;
                    throw e11;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    new a(this.abandonSet).f();
                }
                throw th2;
            } catch (Exception e12) {
                t();
                throw e12;
            }
        }
    }

    public /* synthetic */ s(q qVar, f fVar, CoroutineContext coroutineContext, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, fVar, (i11 & 4) != 0 ? null : coroutineContext);
    }
}
