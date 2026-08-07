package q4;

import p013kotlin.Metadata;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\f"}, d2 = {"Lq4/o;", "Lq4/r;", "<init>", "()V", "Lr2/y3;", "", "c", "()Lr2/y3;", "a", "Lr2/y3;", "loadState", "fontLoaded", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private y3<Boolean> loadState;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"q4/o$a", "Landroidx/emoji2/text/e$f;", "Ljn0/h0;", "b", "()V", "", "throwable", "a", "(Ljava/lang/Throwable;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends androidx.emoji2.text.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f104759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f104760b;

        a(p1<Boolean> p1Var, o oVar) {
            this.f104759a = p1Var;
            this.f104760b = oVar;
        }

        @Override // androidx.emoji2.text.e.f
        public void a(Throwable throwable) {
            this.f104760b.loadState = s.f104765a;
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            this.f104759a.setValue(Boolean.TRUE);
            this.f104760b.loadState = new t(true);
        }
    }

    public o() {
        this.loadState = androidx.emoji2.text.e.i() ? c() : null;
    }

    private final y3<Boolean> c() {
        androidx.emoji2.text.e eVarC = androidx.emoji2.text.e.c();
        if (eVarC.g() == 1) {
            return new t(true);
        }
        p1 p1VarD = s3.d(Boolean.FALSE, null, 2, null);
        eVarC.q(new a(p1VarD, this));
        return p1VarD;
    }

    @Override // q4.r
    public y3<Boolean> a() {
        y3<Boolean> y3Var = this.loadState;
        if (y3Var != null) {
            p013kotlin.jvm.internal.s.h(y3Var);
            return y3Var;
        }
        if (!androidx.emoji2.text.e.i()) {
            return s.f104765a;
        }
        y3<Boolean> y3VarC = c();
        this.loadState = y3VarC;
        p013kotlin.jvm.internal.s.h(y3VarC);
        return y3VarC;
    }
}
