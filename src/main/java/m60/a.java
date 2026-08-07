package m60;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.o;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f91318a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p<p020r2.l, Integer, h0> f91319b = z2.c.c(633592435, false, C1947a.f91321c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p<p020r2.l, Integer, h0> f91320c = z2.c.c(1366302894, false, b.f91322c);

    /* JADX INFO: renamed from: m60.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class C1947a extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1947a f91321c = new C1947a();

        C1947a() {
            super(2);
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(633592435, i11, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupFieldsKt.lambda-1.<anonymous> (LinkInlineSignupFields.kt:63)");
            }
            i.b(lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f91322c = new b();

        b() {
            super(2);
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1366302894, i11, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupFieldsKt.lambda-2.<anonymous> (LinkInlineSignupFields.kt:76)");
            }
            i.b(lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public final p<p020r2.l, Integer, h0> a() {
        return f91319b;
    }

    public final p<p020r2.l, Integer, h0> b() {
        return f91320c;
    }
}
