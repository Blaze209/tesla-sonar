package q1;

import b4.e1;
import b4.f1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0005R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lq1/w;", "Landroidx/compose/ui/d$c;", "Lb4/h;", "Lb4/e1;", "<init>", "()V", "Lz3/u0;", "x2", "()Lz3/u0;", "", "focused", "Ljn0/h0;", "y2", "(Z)V", "j2", "g1", "Lz3/u0$a;", "n", "Lz3/u0$a;", "pinnedHandle", "o", "Z", "isFocused", "p", "c2", "()Z", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class w extends androidx.compose.ui.d.c implements b4.h, e1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private z3.u0.a pinnedHandle;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean isFocused;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p013kotlin.jvm.internal.n0<z3.u0> f104361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w f104362d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p013kotlin.jvm.internal.n0<z3.u0> n0Var, w wVar) {
            super(0);
            this.f104361c = n0Var;
            this.f104362d = wVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
        public final void b() {
            this.f104361c.f86529a = b4.i.a(this.f104362d, z3.v0.a());
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    private final z3.u0 x2() {
        p013kotlin.jvm.internal.n0 n0Var = new p013kotlin.jvm.internal.n0();
        f1.a(this, new a(n0Var, this));
        return (z3.u0) n0Var.f86529a;
    }

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // b4.e1
    public void g1() {
        z3.u0 u0VarX2 = x2();
        if (this.isFocused) {
            z3.u0.a aVar = this.pinnedHandle;
            if (aVar != null) {
                aVar.release();
            }
            this.pinnedHandle = u0VarX2 != null ? u0VarX2.a() : null;
        }
    }

    @Override // androidx.compose.ui.d.c
    public void j2() {
        z3.u0.a aVar = this.pinnedHandle;
        if (aVar != null) {
            aVar.release();
        }
        this.pinnedHandle = null;
    }

    public final void y2(boolean focused) {
        if (focused) {
            z3.u0 u0VarX2 = x2();
            this.pinnedHandle = u0VarX2 != null ? u0VarX2.a() : null;
        } else {
            z3.u0.a aVar = this.pinnedHandle;
            if (aVar != null) {
                aVar.release();
            }
            this.pinnedHandle = null;
        }
        this.isFocused = focused;
    }
}
