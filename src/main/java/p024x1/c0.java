package p024x1;

import androidx.compose.runtime.snapshots.g;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p020r2.e3;
import p020r2.m1;
import p020r2.p1;
import p020r2.s3;
import wn0.l;
import z3.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R+\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR/\u0010%\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b#\u0010$R/\u0010)\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\"\u001a\u0004\b!\u0010&\"\u0004\b'\u0010(R(\u0010,\u001a\u0004\u0018\u00010\u00012\b\u0010*\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010&\"\u0004\b+\u0010(¨\u0006-"}, d2 = {"Lx1/c0;", "Lz3/u0;", "Lz3/u0$a;", "Lx1/e0$a;", "", Action.KEY_ATTRIBUTE, "Lx1/e0;", "pinnedItemList", "<init>", "(Ljava/lang/Object;Lx1/e0;)V", "a", "()Lz3/u0$a;", "Ljn0/h0;", "release", "()V", "f", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "b", "Lx1/e0;", "", "<set-?>", "c", "Lr2/m1;", "getIndex", "()I", "g", "(I)V", "index", DateTokenConverter.CONVERTER_KEY, "j", "pinsCount", "e", "Lr2/p1;", "h", "(Lz3/u0$a;)V", "parentHandle", "()Lz3/u0;", "k", "(Lz3/u0;)V", "_parentPinnableContainer", "value", IntegerTokenConverter.CONVERTER_KEY, "parentPinnableContainer", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c0 implements u0, u0.a, e0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e0 pinnedItemList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m1 index = e3.a(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m1 pinsCount = e3.a(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p1 parentHandle = s3.d(null, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p1 _parentPinnableContainer = s3.d(null, null, 2, null);

    public c0(Object obj, e0 e0Var) {
        this.key = obj;
        this.pinnedItemList = e0Var;
    }

    private final u0.a b() {
        return (u0.a) this.parentHandle.getValue();
    }

    private final int d() {
        return this.pinsCount.b();
    }

    private final u0 e() {
        return (u0) this._parentPinnableContainer.getValue();
    }

    private final void h(u0.a aVar) {
        this.parentHandle.setValue(aVar);
    }

    private final void j(int i11) {
        this.pinsCount.a(i11);
    }

    private final void k(u0 u0Var) {
        this._parentPinnableContainer.setValue(u0Var);
    }

    @Override // z3.u0
    public u0.a a() {
        if (d() == 0) {
            this.pinnedItemList.j(this);
            u0 u0VarC = c();
            h(u0VarC != null ? u0VarC.a() : null);
        }
        j(d() + 1);
        return this;
    }

    public final u0 c() {
        return e();
    }

    public final void f() {
        int iD = d();
        for (int i11 = 0; i11 < iD; i11++) {
            release();
        }
    }

    public void g(int i11) {
        this.index.a(i11);
    }

    @Override // x1.e0.a
    public int getIndex() {
        return this.index.b();
    }

    @Override // x1.e0.a
    public Object getKey() {
        return this.key;
    }

    public final void i(u0 u0Var) {
        g.Companion companion = g.INSTANCE;
        g gVarD = companion.d();
        l<Object, h0> lVarH = gVarD != null ? gVarD.h() : null;
        g gVarF = companion.f(gVarD);
        try {
            if (u0Var != e()) {
                k(u0Var);
                if (d() > 0) {
                    u0.a aVarB = b();
                    if (aVarB != null) {
                        aVarB.release();
                    }
                    h(u0Var != null ? u0Var.a() : null);
                }
            }
            h0 h0Var = h0.f84049a;
        } finally {
            companion.m(gVarD, gVarF, lVarH);
        }
    }

    @Override // z3.u0.a
    public void release() {
        if (d() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        j(d() - 1);
        if (d() == 0) {
            this.pinnedItemList.k(this);
            u0.a aVarB = b();
            if (aVarB != null) {
                aVarB.release();
            }
            h(null);
        }
    }
}
