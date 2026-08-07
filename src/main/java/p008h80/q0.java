package p008h80;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.h;
import e4.i;
import f30.d0;
import jn0.h0;
import n70.DisplayableSavedPaymentMethod;
import n70.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import wn0.p;
import x30.c;
import x30.d;
import z80.h2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Ln70/g;", "paymentMethod", "Lkotlin/Function0;", "Ljn0/h0;", "onConfirmListener", "onDismissListener", "a", "(Ln70/g;Lwn0/a;Lwn0/a;Lr2/l;I)V", "Lx30/c;", "c", "(Ln70/g;)Lx30/c;", "b", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class q0 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DisplayableSavedPaymentMethod f71304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f71305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f71306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f71307f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(DisplayableSavedPaymentMethod displayableSavedPaymentMethod, wn0.a<h0> aVar, wn0.a<h0> aVar2, int i11) {
            super(2);
            this.f71304c = displayableSavedPaymentMethod;
            this.f71305d = aVar;
            this.f71306e = aVar2;
            this.f71307f = i11;
        }

        public final void a(l lVar, int i11) {
            q0.a(this.f71304c, this.f71305d, this.f71306e, lVar, k2.a(this.f71307f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71308a;

        static {
            int[] iArr = new int[PaymentMethod.p.values().length];
            try {
                iArr[PaymentMethod.p.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.p.SepaDebit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.p.USBankAccount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f71308a = iArr;
        }
    }

    public static final void a(DisplayableSavedPaymentMethod paymentMethod, wn0.a<h0> onConfirmListener, wn0.a<h0> onDismissListener, l lVar, int i11) {
        s.k(paymentMethod, "paymentMethod");
        s.k(onConfirmListener, "onConfirmListener");
        s.k(onDismissListener, "onDismissListener");
        l lVarV = lVar.v(-404084240);
        if (o.J()) {
            o.S(-404084240, i11, -1, "com.stripe.android.paymentsheet.ui.RemovePaymentMethodDialogUI (RemovePaymentMethodDialogUI.kt:17)");
        }
        int i12 = i11 << 12;
        h2.a(p90.a.a(c(paymentMethod), lVarV, 8), p90.a.a(b(paymentMethod), lVarV, 8), i.c(d0.H0, lVarV, 0), i.c(d0.W, lVarV, 0), true, onConfirmListener, onDismissListener, lVarV, (458752 & i12) | 24576 | (i12 & 3670016), 0);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(paymentMethod, onConfirmListener, onDismissListener, i11));
        }
    }

    private static final c b(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
        PaymentMethod.p pVar = displayableSavedPaymentMethod.getPaymentMethod().type;
        int i11 = pVar == null ? -1 : b.f71308a[pVar.ordinal()];
        if (i11 == 1) {
            int i12 = d0.f63939c0;
            PaymentMethod.Card card = displayableSavedPaymentMethod.getPaymentMethod().card;
            h hVar = card != null ? card.brand : null;
            PaymentMethod.Card card2 = displayableSavedPaymentMethod.getPaymentMethod().card;
            return d.g(i12, new Object[]{hVar, card2 != null ? card2.last4 : null}, null, 4, null);
        }
        if (i11 == 2) {
            int i13 = x.f93508d;
            PaymentMethod.SepaDebit sepaDebit = displayableSavedPaymentMethod.getPaymentMethod().sepaDebit;
            return d.g(i13, new Object[]{sepaDebit != null ? sepaDebit.last4 : null}, null, 4, null);
        }
        if (i11 != 3) {
            return d.f("", new Object[0]);
        }
        int i14 = x.f93508d;
        PaymentMethod.USBankAccount uSBankAccount = displayableSavedPaymentMethod.getPaymentMethod().usBankAccount;
        return d.g(i14, new Object[]{uSBankAccount != null ? uSBankAccount.last4 : null}, null, 4, null);
    }

    private static final c c(DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
        PaymentMethod.p pVar = displayableSavedPaymentMethod.getPaymentMethod().type;
        int i11 = pVar == null ? -1 : b.f71308a[pVar.ordinal()];
        if (i11 != 1) {
            return (i11 == 2 || i11 == 3) ? d.g(x.Y, new Object[0], null, 4, null) : d.f("", new Object[0]);
        }
        return d.g(x.f93505b0, new Object[0], null, 4, null);
    }
}
