package p027z70;

import e4.e;
import f30.y;
import jn0.h0;
import p009i2.e1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import wn0.p;
import z2.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f127120a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p<l, Integer, h0> f127121b = c.c(1407342519, false, C2754a.f127122c);

    /* JADX INFO: renamed from: z70.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class C2754a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2754a f127122c = new C2754a();

        C2754a() {
            super(2);
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1407342519, i11, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.ComposableSingletons$USBankAccountFormKt.lambda-1.<anonymous> (USBankAccountForm.kt:455)");
            }
            e1.a(e.c(y.O, lVar, 0), null, null, 0L, lVar, 56, 12);
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
        return f127121b;
    }
}
