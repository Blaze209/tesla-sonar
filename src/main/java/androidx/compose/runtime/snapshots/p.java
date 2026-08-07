package androidx.compose.runtime.snapshots;

import androidx.collection.l0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import jn0.h0;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001b\u001a\u00020\u00012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0017H\u0010¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\"\u0010!R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&RF\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.RF\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u001a\u00106\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R$\u0010?\u001a\u00020:2\u0006\u0010;\u001a\u00020:8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b'\u0010>R$\u0010D\u001a\u00020@2\u0006\u0010;\u001a\u00020@8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\b)\u0010CR4\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010E2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010E8P@VX\u0090\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010L\u001a\u00020:2\u0006\u0010;\u001a\u00020:8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bK\u0010=\"\u0004\b/\u0010>R\u0014\u0010O\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Landroidx/compose/runtime/snapshots/p;", "Landroidx/compose/runtime/snapshots/b;", "parentSnapshot", "Lkotlin/Function1;", "", "Ljn0/h0;", "specifiedReadObserver", "specifiedWriteObserver", "", "mergeParentObservers", "ownsParentSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/b;Lwn0/l;Lwn0/l;ZZ)V", DateTokenConverter.CONVERTER_KEY, "()V", "Landroidx/compose/runtime/snapshots/h;", "C", "()Landroidx/compose/runtime/snapshots/h;", "Lb3/k;", "state", "p", "(Lb3/k;)V", "readObserver", "Landroidx/compose/runtime/snapshots/g;", "x", "(Lwn0/l;)Landroidx/compose/runtime/snapshots/g;", "writeObserver", "Q", "(Lwn0/l;Lwn0/l;)Landroidx/compose/runtime/snapshots/b;", "o", "snapshot", "", "V", "(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;", "W", "s", "Landroidx/compose/runtime/snapshots/b;", "t", "Z", "u", "<set-?>", "v", "Lwn0/l;", "H", "()Lwn0/l;", "X", "(Lwn0/l;)V", "w", "k", "Y", "", "J", Gender.UNKNOWN, "()J", "threadId", "T", "()Landroidx/compose/runtime/snapshots/b;", "currentSnapshot", "", "value", "f", "()I", "(I)V", "id", "Landroidx/compose/runtime/snapshots/i;", "g", "()Landroidx/compose/runtime/snapshots/i;", "(Landroidx/compose/runtime/snapshots/i;)V", "invalid", "Landroidx/collection/l0;", "E", "()Landroidx/collection/l0;", "P", "(Landroidx/collection/l0;)V", "modified", "j", "writeCount", IntegerTokenConverter.CONVERTER_KEY, "()Z", "readOnly", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p extends b {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final b parentSnapshot;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean mergeParentObservers;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean ownsParentSnapshot;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private wn0.l<Object, h0> readObserver;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private wn0.l<Object, h0> writeObserver;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final long threadId;

    public p(b bVar, wn0.l<Object, h0> lVar, wn0.l<Object, h0> lVar2, boolean z11, boolean z12) {
        wn0.l<Object, h0> lVarK;
        wn0.l<Object, h0> lVarH;
        super(0, i.INSTANCE.a(), j.K(lVar, (bVar == null || (lVarH = bVar.h()) == null) ? ((a) j.f5194j.get()).h() : lVarH, z11), j.M(lVar2, (bVar == null || (lVarK = bVar.k()) == null) ? ((a) j.f5194j.get()).k() : lVarK));
        this.parentSnapshot = bVar;
        this.mergeParentObservers = z11;
        this.ownsParentSnapshot = z12;
        this.readObserver = super.h();
        this.writeObserver = super.k();
        this.threadId = p020r2.c.a();
    }

    private final b T() {
        b bVar = this.parentSnapshot;
        return bVar == null ? (b) j.f5194j.get() : bVar;
    }

    @Override // androidx.compose.runtime.snapshots.b
    public h C() {
        return T().C();
    }

    @Override // androidx.compose.runtime.snapshots.b
    public l0<b3.k> E() {
        return T().E();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public wn0.l<Object, h0> h() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.b
    public void P(l0<b3.k> l0Var) {
        b3.i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b
    public b Q(wn0.l<Object, h0> readObserver, wn0.l<Object, h0> writeObserver) {
        wn0.l<Object, h0> lVarL = j.L(readObserver, h(), false, 4, null);
        wn0.l<Object, h0> lVarM = j.M(writeObserver, k());
        return !this.mergeParentObservers ? new p(T().Q(null, lVarM), lVarL, lVarM, false, true) : T().Q(lVarL, lVarM);
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final long getThreadId() {
        return this.threadId;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public Void m(g snapshot) {
        b3.i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public Void n(g snapshot) {
        b3.i.a();
        throw new KotlinNothingValueException();
    }

    public void X(wn0.l<Object, h0> lVar) {
        this.readObserver = lVar;
    }

    public void Y(wn0.l<Object, h0> lVar) {
        this.writeObserver = lVar;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void d() {
        b bVar;
        t(true);
        if (!this.ownsParentSnapshot || (bVar = this.parentSnapshot) == null) {
            return;
        }
        bVar.d();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* JADX INFO: renamed from: f */
    public int getId() {
        return T().getId();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* JADX INFO: renamed from: g */
    public i getInvalid() {
        return T().getInvalid();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public boolean i() {
        return T().i();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* JADX INFO: renamed from: j */
    public int getWriteCount() {
        return T().getWriteCount();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public wn0.l<Object, h0> k() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void o() {
        T().o();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void p(b3.k state) {
        T().p(state);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void u(int i11) {
        b3.i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void v(i iVar) {
        b3.i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void w(int i11) {
        T().w(i11);
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public g x(wn0.l<Object, h0> readObserver) {
        wn0.l<Object, h0> lVarL = j.L(readObserver, h(), false, 4, null);
        return !this.mergeParentObservers ? j.D(T().x(null), lVarL, true) : T().x(lVarL);
    }
}
