package p008h80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.h;
import n70.u;
import n70.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import p027z70.b;
import x30.c;
import x30.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0003*\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\b\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/v0;", "", "forVerticalMode", "", "f", "(Lcom/stripe/android/model/v0;Z)I", "Lcom/stripe/android/model/h;", "b", "(Lcom/stripe/android/model/h;)I", "c", "Lx30/c;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/v0;)Lx30/c;", "e", "(Lcom/stripe/android/model/v0;)Ljava/lang/Integer;", "", "last4", "a", "(Ljava/lang/String;)Lx30/c;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b0 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f71003b;

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
            f71002a = iArr;
            int[] iArr2 = new int[h.values().length];
            try {
                iArr2[h.Visa.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[h.AmericanExpress.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[h.Discover.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[h.JCB.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[h.DinersClub.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[h.MasterCard.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[h.UnionPay.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[h.CartesBancaires.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[h.Unknown.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            f71003b = iArr2;
        }
    }

    public static final c a(String str) {
        if (str != null) {
            return d.g(x.W, new Object[]{str}, null, 4, null);
        }
        return null;
    }

    public static final int b(h hVar) {
        s.k(hVar, "<this>");
        switch (a.f71003b[hVar.ordinal()]) {
            case 1:
                return u.f93485q;
            case 2:
                return u.f93477i;
            case 3:
                return u.f93480l;
            case 4:
                return u.f93481m;
            case 5:
                return u.f93479k;
            case 6:
                return u.f93482n;
            case 7:
                return u.f93483o;
            case 8:
                return u.f93478j;
            case 9:
                return u.f93484p;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int c(h hVar) {
        s.k(hVar, "<this>");
        switch (a.f71003b[hVar.ordinal()]) {
            case 1:
                return v90.a.f118497t;
            case 2:
                return v90.a.f118479b;
            case 3:
                return v90.a.f118487j;
            case 4:
                return v90.a.f118490m;
            case 5:
                return v90.a.f118485h;
            case 6:
                return v90.a.f118492o;
            case 7:
                return v90.a.f118494q;
            case 8:
                return v90.a.f118481d;
            case 9:
                return u.f93484p;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final c d(PaymentMethod paymentMethod) {
        s.k(paymentMethod, "<this>");
        PaymentMethod.p pVar = paymentMethod.type;
        int i11 = pVar == null ? -1 : a.f71002a[pVar.ordinal()];
        if (i11 == 1) {
            PaymentMethod.Card card = paymentMethod.card;
            return a(card != null ? card.last4 : null);
        }
        if (i11 == 2) {
            int i12 = x.W;
            PaymentMethod.SepaDebit sepaDebit = paymentMethod.sepaDebit;
            return d.g(i12, new Object[]{sepaDebit != null ? sepaDebit.last4 : null}, null, 4, null);
        }
        if (i11 != 3) {
            return null;
        }
        int i13 = x.W;
        PaymentMethod.USBankAccount uSBankAccount = paymentMethod.usBankAccount;
        return d.g(i13, new Object[]{uSBankAccount != null ? uSBankAccount.last4 : null}, null, 4, null);
    }

    public static final Integer e(PaymentMethod paymentMethod) {
        s.k(paymentMethod, "<this>");
        PaymentMethod.p pVar = paymentMethod.type;
        if ((pVar == null ? -1 : a.f71002a[pVar.ordinal()]) == 3) {
            return Integer.valueOf(u.f93476h);
        }
        return null;
    }

    public static final int f(PaymentMethod paymentMethod, boolean z11) {
        int iB;
        PaymentMethod.USBankAccount uSBankAccount;
        String str;
        s.k(paymentMethod, "<this>");
        PaymentMethod.p pVar = paymentMethod.type;
        int i11 = pVar == null ? -1 : a.f71002a[pVar.ordinal()];
        Integer numValueOf = null;
        if (i11 == 1) {
            h.Companion companion = h.INSTANCE;
            PaymentMethod.Card card = paymentMethod.card;
            h hVarB = companion.b(card != null ? card.displayBrand : null);
            if (hVarB == h.Unknown) {
                hVarB = null;
            }
            if (hVarB == null) {
                PaymentMethod.Card card2 = paymentMethod.card;
                hVarB = card2 != null ? card2.brand : null;
            }
            if (z11) {
                if (hVarB != null) {
                    iB = c(hVarB);
                    numValueOf = Integer.valueOf(iB);
                }
            } else if (hVarB != null) {
                iB = b(hVarB);
                numValueOf = Integer.valueOf(iB);
            }
        } else if (i11 == 2) {
            numValueOf = Integer.valueOf(u.f93492x);
        } else if (i11 == 3 && (uSBankAccount = paymentMethod.usBankAccount) != null && (str = uSBankAccount.bankName) != null) {
            numValueOf = Integer.valueOf(b.INSTANCE.a(str));
        }
        return numValueOf != null ? numValueOf.intValue() : u.f93484p;
    }

    public static /* synthetic */ int g(PaymentMethod paymentMethod, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return f(paymentMethod, z11);
    }
}
