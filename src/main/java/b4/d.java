package b4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\" \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\" \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Lb4/c;", "", "e", "(Lb4/c;)Z", "b4/d$a", "a", "Lb4/d$a;", "DetachedModifierLocalReadScope", "Lkotlin/Function1;", "Ljn0/h0;", "b", "Lwn0/l;", "onDrawCacheReadsChanged", "c", "updateModifierLocalConsumer", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f16042a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final wn0.l<b4.c, jn0.h0> f16043b = b.f16045c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final wn0.l<b4.c, jn0.h0> f16044c = c.f16046c;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R$\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"b4/d$a", "La4/k;", "T", "La4/c;", "I", "(La4/c;)Ljava/lang/Object;", "current", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements a4.k {
        a() {
        }

        @Override // a4.k
        public <T> T I(a4.c<T> cVar) {
            return cVar.a().invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/c;", "it", "Ljn0/h0;", "a", "(Lb4/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<b4.c, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f16045c = new b();

        b() {
            super(1);
        }

        public final void a(b4.c cVar) {
            cVar.B2();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(b4.c cVar) {
            a(cVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/c;", "it", "Ljn0/h0;", "a", "(Lb4/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<b4.c, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f16046c = new c();

        c() {
            super(1);
        }

        public final void a(b4.c cVar) {
            cVar.F2();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(b4.c cVar) {
            a(cVar);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(b4.c cVar) {
        androidx.compose.ui.d.c tail = k.m(cVar).getNodes().getTail();
        p013kotlin.jvm.internal.s.i(tail, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((v1) tail).getAttachHasBeenRun();
    }
}
