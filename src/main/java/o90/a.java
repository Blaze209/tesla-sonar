package o90;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f96968a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q<v1.e, l, Integer, h0> f96969b = z2.c.c(2051430169, false, C2071a.f96971c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static q<v1.e, l, Integer, h0> f96970c = z2.c.c(1719901005, false, b.f96972c);

    /* JADX INFO: renamed from: o90.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/e;", "Ljn0/h0;", "a", "(Lv1/e;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class C2071a extends u implements q<v1.e, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2071a f96971c = new C2071a();

        C2071a() {
            super(3);
        }

        public final void a(v1.e eVar, l lVar, int i11) {
            s.k(eVar, "$this$null");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(2051430169, i11, -1, "com.stripe.android.uicore.image.ComposableSingletons$StripeImageKt.lambda-1.<anonymous> (StripeImage.kt:57)");
            }
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(v1.e eVar, l lVar, Integer num) {
            a(eVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/e;", "Ljn0/h0;", "a", "(Lv1/e;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements q<v1.e, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f96972c = new b();

        b() {
            super(3);
        }

        public final void a(v1.e eVar, l lVar, int i11) {
            s.k(eVar, "$this$null");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1719901005, i11, -1, "com.stripe.android.uicore.image.ComposableSingletons$StripeImageKt.lambda-2.<anonymous> (StripeImage.kt:58)");
            }
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(v1.e eVar, l lVar, Integer num) {
            a(eVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public final q<v1.e, l, Integer, h0> a() {
        return f96969b;
    }

    public final q<v1.e, l, Integer, h0> b() {
        return f96970c;
    }
}
