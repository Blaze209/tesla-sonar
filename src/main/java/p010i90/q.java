package p010i90;

import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import f90.g;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import w4.h;
import wn0.p;
import z2.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f76824a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p<l, Integer, h0> f76825b = c.c(549433638, false, a.f76826c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f76826c = new a();

        a() {
            super(2);
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(549433638, i11, -1, "com.stripe.android.uicore.elements.ComposableSingletons$TextFieldUIKt.lambda-1.<anonymous> (TextFieldUI.kt:435)");
            }
            Function1.w(new w1.Trailing(g.f64610a, null, true, null, 10, null), false, x.q(d.INSTANCE, h.g(8)), lVar, 432, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public final p<l, Integer, h0> a() {
        return f76825b;
    }
}
