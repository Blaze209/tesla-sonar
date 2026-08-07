package kotlin;

import jn0.h0;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import wn0.p;
import wn0.q;
import z2.c;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f15586a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q<p<? super l, ? super Integer, h0>, l, Integer, h0> f15587b = c.c(671295101, false, Function0.f15588c);

    /* JADX INFO: renamed from: b2.g$a, reason: from Kotlin metadata */
    @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "innerTextField", "a", "(Lwn0/p;Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class Function0 extends u implements q<p<? super l, ? super Integer, ? extends h0>, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Function0 f15588c = new Function0();

        Function0() {
            super(3);
        }

        public final void a(p<? super l, ? super Integer, h0> pVar, l lVar, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= lVar.K(pVar) ? 4 : 2;
            }
            if ((i11 & 19) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(671295101, i11, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:219)");
            }
            pVar.invoke(lVar, Integer.valueOf(i11 & 14));
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(p<? super l, ? super Integer, ? extends h0> pVar, l lVar, Integer num) {
            a(pVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public final q<p<? super l, ? super Integer, h0>, l, Integer, h0> a() {
        return f15587b;
    }
}
