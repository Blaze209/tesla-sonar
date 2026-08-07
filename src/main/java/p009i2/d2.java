package p009i2;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\" \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lr2/g2;", "Li2/c2;", "a", "Lr2/g2;", "()Lr2/g2;", "LocalShapes", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<Shapes> f74293a = w.f(a.f74294c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li2/c2;", "b", "()Li2/c2;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<Shapes> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f74294c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Shapes invoke() {
            return new Shapes(null, null, null, 7, null);
        }
    }

    public static final g2<Shapes> a() {
        return f74293a;
    }
}
