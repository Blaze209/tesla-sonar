package androidx.compose.runtime.snapshots;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00002\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001a\u0010\u0019R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\"\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001e¨\u0006)"}, d2 = {"Landroidx/compose/runtime/snapshots/d;", "Landroidx/compose/runtime/snapshots/g;", "", "id", "Landroidx/compose/runtime/snapshots/i;", "invalid", "Lkotlin/Function1;", "", "Ljn0/h0;", "readObserver", "parent", "<init>", "(ILandroidx/compose/runtime/snapshots/i;Lwn0/l;Landroidx/compose/runtime/snapshots/g;)V", "E", "(Lwn0/l;)Landroidx/compose/runtime/snapshots/d;", "o", "()V", DateTokenConverter.CONVERTER_KEY, "Lb3/k;", "state", "", "D", "(Lb3/k;)Ljava/lang/Void;", "snapshot", "C", "(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;", "B", "g", "Lwn0/l;", "A", "()Lwn0/l;", "h", "Landroidx/compose/runtime/snapshots/g;", "getParent", "()Landroidx/compose/runtime/snapshots/g;", "", IntegerTokenConverter.CONVERTER_KEY, "()Z", "readOnly", "k", "writeObserver", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Object, h0> readObserver;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g parent;

    public d(int i11, i iVar, wn0.l<Object, h0> lVar, g gVar) {
        super(i11, iVar, null);
        this.readObserver = lVar;
        this.parent = gVar;
        gVar.m(this);
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public wn0.l<Object, h0> h() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Void m(g snapshot) {
        b3.i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Void n(g snapshot) {
        b3.i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Void p(b3.k state) {
        j.Z();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public d x(wn0.l<Object, h0> readObserver) {
        return new d(getId(), getInvalid(), j.L(readObserver, h(), false, 4, null), this.parent);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void d() {
        if (getDisposed()) {
            return;
        }
        if (getId() != this.parent.getId()) {
            b();
        }
        this.parent.n(this);
        super.d();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public boolean i() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public wn0.l<Object, h0> k() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void o() {
    }
}
