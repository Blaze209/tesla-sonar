package p007h2;

import androidx.collection.s;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lh2/c0;", "", "selectableId", "", "b", "(Lh2/c0;J)Z", "Lr2/g2;", "a", "Lr2/g2;", "()Lr2/g2;", "LocalSelectionRegistrar", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<c0> f70243a = w.d(null, a.f70244c, 1, null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh2/c0;", "b", "()Lh2/c0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<c0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f70244c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c0 invoke() {
            return null;
        }
    }

    public static final g2<c0> a() {
        return f70243a;
    }

    public static final boolean b(c0 c0Var, long j11) {
        s<Selection> sVarG;
        if (c0Var == null || (sVarG = c0Var.g()) == null) {
            return false;
        }
        return sVarG.a(j11);
    }
}
