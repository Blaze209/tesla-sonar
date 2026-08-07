package androidx.compose.ui;

import b4.g1;
import b4.j;
import b4.k;
import b4.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import p013kotlin.Metadata;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000 \f2\u00020\u0001:\u0003\f\u0007\u0011J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0004¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/d;", "", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/d$b;", "operation", "b", "(Ljava/lang/Object;Lwn0/p;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "a", "(Lwn0/l;)Z", "other", "g", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f5271b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/d$b;", "Landroidx/compose/ui/d;", "R", "initial", "Lkotlin/Function2;", "operation", "b", "(Ljava/lang/Object;Lwn0/p;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "a", "(Lwn0/l;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b extends d {
        @Override // androidx.compose.ui.d
        default boolean a(l<? super b, Boolean> predicate) {
            return predicate.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.d
        default <R> R b(R initial, p<? super R, ? super b, ? extends R> operation) {
            return operation.invoke(initial, this);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0019\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u001d\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00008\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R$\u00102\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u0017R$\u00106\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001a\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u0010\u0017R$\u0010>\u001a\u0004\u0018\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010J\u001a\u00020C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010N\u001a\u00020C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010E\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR\u0016\u0010P\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010ER\u0016\u0010R\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010ER$\u0010U\u001a\u00020C2\u0006\u0010\u0018\u001a\u00020C8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bS\u0010E\u001a\u0004\bT\u0010GR\u0011\u0010X\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u001a\u0010[\u001a\u00020C8VX\u0096\u0004¢\u0006\f\u0012\u0004\bZ\u0010\u0003\u001a\u0004\bY\u0010G¨\u0006\\"}, d2 = {"Landroidx/compose/ui/d$c;", "Lb4/j;", "<init>", "()V", "Lb4/z0;", "coordinator", "Ljn0/h0;", "w2", "(Lb4/z0;)V", "f2", "l2", "m2", "g2", "k2", "h2", "i2", "j2", "Lkotlin/Function0;", "effect", "v2", "(Lwn0/a;)V", "owner", "o2", "(Landroidx/compose/ui/d$c;)V", "<set-?>", "a", "Landroidx/compose/ui/d$c;", "e1", "()Landroidx/compose/ui/d$c;", "getNode$annotations", "node", "Lkotlinx/coroutines/CoroutineScope;", "b", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "c", "I", "Z1", "()I", "r2", "(I)V", "kindSet", DateTokenConverter.CONVERTER_KEY, "U1", "n2", "aggregateChildKindSet", "e", "b2", "t2", "parent", "f", "V1", "p2", "child", "Lb4/g1;", "g", "Lb4/g1;", "a2", "()Lb4/g1;", "s2", "(Lb4/g1;)V", "ownerScope", "h", "Lb4/z0;", "W1", "()Lb4/z0;", "", IntegerTokenConverter.CONVERTER_KEY, "Z", "Y1", "()Z", "q2", "(Z)V", "insertedNodeAwaitingAttachForInvalidation", "j", "d2", "u2", "updatedNodeAwaitingAttachForInvalidation", "k", "onAttachRunExpected", "l", "onDetachRunExpected", "m", "e2", "isAttached", "X1", "()Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "c2", "getShouldAutoInvalidate$annotations", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class c implements j {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private CoroutineScope scope;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int kindSet;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private c parent;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private c child;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private g1 ownerScope;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private z0 coordinator;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean insertedNodeAwaitingAttachForInvalidation;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean updatedNodeAwaitingAttachForInvalidation;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private boolean onAttachRunExpected;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private boolean onDetachRunExpected;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private boolean isAttached;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private c node = this;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int aggregateChildKindSet = -1;

        /* JADX INFO: renamed from: U1, reason: from getter */
        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        /* JADX INFO: renamed from: V1, reason: from getter */
        public final c getChild() {
            return this.child;
        }

        /* JADX INFO: renamed from: W1, reason: from getter */
        public final z0 getCoordinator() {
            return this.coordinator;
        }

        public final CoroutineScope X1() {
            CoroutineScope coroutineScope = this.scope;
            if (coroutineScope != null) {
                return coroutineScope;
            }
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(k.n(this).getCoroutineContext().plus(JobKt.Job((Job) k.n(this).getCoroutineContext().get(Job.INSTANCE))));
            this.scope = CoroutineScope;
            return CoroutineScope;
        }

        /* JADX INFO: renamed from: Y1, reason: from getter */
        public final boolean getInsertedNodeAwaitingAttachForInvalidation() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        /* JADX INFO: renamed from: Z1, reason: from getter */
        public final int getKindSet() {
            return this.kindSet;
        }

        /* JADX INFO: renamed from: a2, reason: from getter */
        public final g1 getOwnerScope() {
            return this.ownerScope;
        }

        /* JADX INFO: renamed from: b2, reason: from getter */
        public final c getParent() {
            return this.parent;
        }

        public boolean c2() {
            return true;
        }

        /* JADX INFO: renamed from: d2, reason: from getter */
        public final boolean getUpdatedNodeAwaitingAttachForInvalidation() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        @Override // b4.j
        /* JADX INFO: renamed from: e1, reason: from getter */
        public final c getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: e2, reason: from getter */
        public final boolean getIsAttached() {
            return this.isAttached;
        }

        public void f2() {
            if (this.isAttached) {
                y3.a.b("node attached multiple times");
            }
            if (!(this.coordinator != null)) {
                y3.a.b("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void g2() {
            if (!this.isAttached) {
                y3.a.b("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                y3.a.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                y3.a.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            CoroutineScope coroutineScope = this.scope;
            if (coroutineScope != null) {
                CoroutineScopeKt.cancel(coroutineScope, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        public void h2() {
        }

        public void i2() {
        }

        public void j2() {
        }

        public void k2() {
            if (!this.isAttached) {
                y3.a.b("reset() called on an unattached node");
            }
            j2();
        }

        public void l2() {
            if (!this.isAttached) {
                y3.a.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                y3.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            h2();
            this.onDetachRunExpected = true;
        }

        public void m2() {
            if (!this.isAttached) {
                y3.a.b("node detached multiple times");
            }
            if (!(this.coordinator != null)) {
                y3.a.b("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                y3.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            i2();
        }

        public final void n2(int i11) {
            this.aggregateChildKindSet = i11;
        }

        public void o2(c owner) {
            this.node = owner;
        }

        public final void p2(c cVar) {
            this.child = cVar;
        }

        public final void q2(boolean z11) {
            this.insertedNodeAwaitingAttachForInvalidation = z11;
        }

        public final void r2(int i11) {
            this.kindSet = i11;
        }

        public final void s2(g1 g1Var) {
            this.ownerScope = g1Var;
        }

        public final void t2(c cVar) {
            this.parent = cVar;
        }

        public final void u2(boolean z11) {
            this.updatedNodeAwaitingAttachForInvalidation = z11;
        }

        public final void v2(wn0.a<h0> effect) {
            k.n(this).v(effect);
        }

        public void w2(z0 coordinator) {
            this.coordinator = coordinator;
        }
    }

    boolean a(l<? super b, Boolean> predicate);

    <R> R b(R initial, p<? super R, ? super b, ? extends R> operation);

    default d g(d other) {
        return other == INSTANCE ? this : new a(this, other);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0096\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/d$a;", "Landroidx/compose/ui/d;", "<init>", "()V", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/d$b;", "operation", "b", "(Ljava/lang/Object;Lwn0/p;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "a", "(Lwn0/l;)Z", "other", "g", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f5271b = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.ui.d
        public boolean a(l<? super b, Boolean> predicate) {
            return true;
        }

        @Override // androidx.compose.ui.d
        public d g(d other) {
            return other;
        }

        public String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.ui.d
        public <R> R b(R initial, p<? super R, ? super b, ? extends R> operation) {
            return initial;
        }
    }
}
