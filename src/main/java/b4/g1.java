package b4;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lb4/g1;", "Lb4/k1;", "Lb4/e1;", "observerNode", "<init>", "(Lb4/e1;)V", "a", "Lb4/e1;", "b", "()Lb4/e1;", "", "u0", "()Z", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g1 implements k1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16105c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final wn0.l<g1, jn0.h0> f16106d = a.f16108c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e1 observerNode;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/g1;", "it", "Ljn0/h0;", "a", "(Lb4/g1;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<g1, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f16108c = new a();

        a() {
            super(1);
        }

        public final void a(g1 g1Var) {
            if (g1Var.u0()) {
                g1Var.getObserverNode().g1();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g1 g1Var) {
            a(g1Var);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: b4.g1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lb4/g1$b;", "", "<init>", "()V", "Lkotlin/Function1;", "Lb4/g1;", "Ljn0/h0;", "OnObserveReadsChanged", "Lwn0/l;", "a", "()Lwn0/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wn0.l<g1, jn0.h0> a() {
            return g1.f16106d;
        }

        private Companion() {
        }
    }

    public g1(e1 e1Var) {
        this.observerNode = e1Var;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e1 getObserverNode() {
        return this.observerNode;
    }

    @Override // b4.k1
    public boolean u0() {
        return this.observerNode.getNode().getIsAttached();
    }
}
