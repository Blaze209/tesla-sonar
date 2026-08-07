package androidx.compose.runtime.snapshots;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import java.util.List;
import jn0.h0;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0010\u001a\u00020\u00012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/snapshots/a;", "Landroidx/compose/runtime/snapshots/b;", "", "id", "Landroidx/compose/runtime/snapshots/i;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/i;)V", "Lkotlin/Function1;", "", "Ljn0/h0;", "readObserver", "Landroidx/compose/runtime/snapshots/g;", "x", "(Lwn0/l;)Landroidx/compose/runtime/snapshots/g;", "writeObserver", "Q", "(Lwn0/l;Lwn0/l;)Landroidx/compose/runtime/snapshots/b;", "o", "()V", "snapshot", "", Gender.UNKNOWN, "(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;", "T", "Landroidx/compose/runtime/snapshots/h;", "C", "()Landroidx/compose/runtime/snapshots/h;", DateTokenConverter.CONVERTER_KEY, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends androidx.compose.runtime.snapshots.b {

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class C0116a extends u implements wn0.l<Object, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<wn0.l<Object, h0>> f5142c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0116a(List<? extends wn0.l<Object, h0>> list) {
            super(1);
            this.f5142c = list;
        }

        public final void b(Object obj) {
            List<wn0.l<Object, h0>> list = this.f5142c;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).invoke(obj);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
            b(obj);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "invalid", "Landroidx/compose/runtime/snapshots/b;", "a", "(Landroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/b;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<i, androidx.compose.runtime.snapshots.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Object, h0> f5143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<Object, h0> f5144d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(wn0.l<Object, h0> lVar, wn0.l<Object, h0> lVar2) {
            super(1);
            this.f5143c = lVar;
            this.f5144d = lVar2;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.snapshots.b invoke(i iVar) {
            int i11;
            synchronized (j.I()) {
                i11 = j.f5189e;
                j.f5189e = i11 + 1;
            }
            return new androidx.compose.runtime.snapshots.b(i11, iVar, this.f5143c, this.f5144d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "invalid", "Landroidx/compose/runtime/snapshots/f;", "a", "(Landroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/f;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.l<i, f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<Object, h0> f5145c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(wn0.l<Object, h0> lVar) {
            super(1);
            this.f5145c = lVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke(i iVar) {
            int i11;
            synchronized (j.I()) {
                i11 = j.f5189e;
                j.f5189e = i11 + 1;
            }
            return new f(i11, iVar, this.f5145c);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i11, i iVar) {
        wn0.l c0116a;
        synchronized (j.I()) {
            List list = j.f5193i;
            c0116a = (wn0.l) v.W0(list);
            c0116a = c0116a == null ? new C0116a(list) : c0116a;
        }
        super(i11, iVar, null, c0116a);
    }

    @Override // androidx.compose.runtime.snapshots.b
    public h C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.runtime.snapshots.b
    public androidx.compose.runtime.snapshots.b Q(wn0.l<Object, h0> readObserver, wn0.l<Object, h0> writeObserver) {
        return (androidx.compose.runtime.snapshots.b) j.b0(new b(readObserver, writeObserver));
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Void m(g snapshot) {
        b3.i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public Void n(g snapshot) {
        b3.i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void d() {
        synchronized (j.I()) {
            q();
            h0 h0Var = h0.f84049a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void o() {
        j.B();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public g x(wn0.l<Object, h0> readObserver) {
        return j.b0(new c(readObserver));
    }
}
