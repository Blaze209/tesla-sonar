package y20;

import java.util.ArrayList;
import java.util.Map;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import z20.WorkflowNodeId;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0014B-\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00028@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"Ly20/m;", "", "Ly20/i;", "workflowSnapshot", "Lkotlin/Function0;", "", "Lz20/k;", "childTreeSnapshots", "<init>", "(Ly20/i;Lwn0/a;)V", "Lokio/k;", "c", "()Lokio/k;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lkotlin/Lazy;", "b", "()Ly20/i;", "()Ljava/util/Map;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy workflowSnapshot;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy childTreeSnapshots;

    /* JADX INFO: renamed from: y20.m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ly20/m$a;", "", "<init>", "()V", "Lokio/k;", "bytes", "Ly20/m;", "a", "(Lokio/k;)Ly20/m;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: y20.m$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lz20/k;", "Ly20/m;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        static final class C2695a extends p013kotlin.jvm.internal.u implements wn0.a<Map<WorkflowNodeId, ? extends m>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ okio.j f124702c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2695a(okio.j jVar) {
                super(0);
                this.f124702c = jVar;
            }

            @Override // wn0.a
            public final Map<WorkflowNodeId, ? extends m> invoke() {
                int i11 = this.f124702c.readInt();
                okio.j jVar = this.f124702c;
                Map mapD = v0.d(i11);
                int i12 = 0;
                while (i12 < i11) {
                    i12++;
                    mapD.put(WorkflowNodeId.INSTANCE.a(j.a(jVar)), m.INSTANCE.a(j.a(jVar)));
                }
                return v0.b(mapD);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a(okio.k bytes) {
            p013kotlin.jvm.internal.s.k(bytes, "bytes");
            okio.h hVarA1 = new okio.h().A1(bytes);
            return new m(Snapshot.INSTANCE.a(j.a(hVarA1)), new C2695a(hVarA1));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly20/i;", "b", "()Ly20/i;"}, k = 3, mv = {1, 6, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<Snapshot> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Snapshot f124703c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Snapshot snapshot) {
            super(0);
            this.f124703c = snapshot;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Snapshot invoke() {
            Snapshot snapshot = this.f124703c;
            if (snapshot == null || snapshot.b().D() == 0) {
                return null;
            }
            return snapshot;
        }
    }

    public m(Snapshot snapshot, wn0.a<? extends Map<WorkflowNodeId, m>> childTreeSnapshots) {
        p013kotlin.jvm.internal.s.k(childTreeSnapshots, "childTreeSnapshots");
        jn0.p pVar = jn0.p.NONE;
        this.workflowSnapshot = jn0.m.a(pVar, new b(snapshot));
        this.childTreeSnapshots = jn0.m.a(pVar, childTreeSnapshots);
    }

    public final Map<WorkflowNodeId, m> a() {
        return (Map) this.childTreeSnapshots.getValue();
    }

    public final Snapshot b() {
        return (Snapshot) this.workflowSnapshot.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    public final okio.k c() {
        Pair pair;
        okio.h hVar = new okio.h();
        Snapshot snapshotB = b();
        okio.k kVarB = snapshotB == null ? null : snapshotB.b();
        if (kVarB == null) {
            kVarB = okio.k.f97943e;
        }
        j.c(hVar, kVarB);
        Map<WorkflowNodeId, m> mapA = a();
        ArrayList<Pair> arrayList = new ArrayList();
        for (Map.Entry<WorkflowNodeId, m> entry : mapA.entrySet()) {
            WorkflowNodeId key = entry.getKey();
            m value = entry.getValue();
            okio.k kVarD = key.d();
            if (kVarD == null) {
                pair = null;
            } else {
                okio.k kVarC = value.c();
                if (kVarC.D() == 0) {
                    kVarC = null;
                }
                if (kVarC == null) {
                    pair = null;
                } else {
                    pair = new Pair(kVarD, kVarC);
                }
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        hVar.writeInt(arrayList.size());
        for (Pair pair2 : arrayList) {
            okio.k kVar = (okio.k) pair2.a();
            okio.k kVar2 = (okio.k) pair2.b();
            j.c(hVar, kVar);
            j.c(hVar, kVar2);
        }
        return hVar.m1();
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return p013kotlin.jvm.internal.s.f(mVar.b(), b()) && p013kotlin.jvm.internal.s.f(mVar.a(), a());
    }

    public int hashCode() {
        Snapshot snapshotB = b();
        return ((snapshotB == null ? 0 : snapshotB.hashCode()) * 31) + a().hashCode();
    }
}
