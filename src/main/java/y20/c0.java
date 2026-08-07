package y20;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"!\u0010\b\u001a\u00020\u0002*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lco0/q;", "type", "Ly20/s;", "b", "(Lco0/q;)Ly20/s;", "Ly20/q;", "a", "(Ly20/q;)Ly20/s;", "identifier", "wf1-workflow-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
final /* synthetic */ class c0 {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.a<String> {
        a(Object obj) {
            super(0, obj, c.class, "describeRealIdentifier", "describeRealIdentifier()Ljava/lang/String;", 0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ((c) this.receiver).c();
        }
    }

    public static final s a(q<?, ?, ?> qVar) {
        p013kotlin.jvm.internal.s.k(qVar, "<this>");
        c cVar = qVar instanceof c ? (c) qVar : null;
        return new s(o0.b(qVar.getClass()), cVar == null ? null : cVar.getRealIdentifier(), cVar != null ? new a(cVar) : null);
    }

    public static final s b(co0.q type) {
        p013kotlin.jvm.internal.s.k(type, "type");
        return new s(type, null, null, 6, null);
    }
}
