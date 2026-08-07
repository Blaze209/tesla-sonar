package h30;

import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lh30/k;", "Lh30/p;", "<init>", "()V", "Lh30/f$b;", "cardNumber", "Lcom/stripe/android/model/a;", "b", "(Lh30/f$b;)Lcom/stripe/android/model/a;", "", "a", "(Lh30/f$b;)Ljava/util/List;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<AccountRange> f70627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<AccountRange> f70628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<AccountRange> f70629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List<AccountRange> f70630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<AccountRange> f70631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<AccountRange> f70632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List<AccountRange> f70633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List<AccountRange> f70634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List<AccountRange> f70635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final List<AccountRange> f70636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final List<AccountRange> f70637l;

    static {
        Set setC = d1.c(new BinRange("4000000000000000", "4999999999999999"));
        ArrayList arrayList = new ArrayList(v.y(setC, 10));
        Iterator it = setC.iterator();
        while (it.hasNext()) {
            arrayList.add(new AccountRange((BinRange) it.next(), 16, AccountRange.EnumC0883a.Visa, null, 8, null));
        }
        f70627b = arrayList;
        Set setI = d1.i(new BinRange("2221000000000000", "2720999999999999"), new BinRange("5100000000000000", "5599999999999999"));
        ArrayList arrayList2 = new ArrayList(v.y(setI, 10));
        Iterator it2 = setI.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new AccountRange((BinRange) it2.next(), 16, AccountRange.EnumC0883a.Mastercard, null, 8, null));
        }
        f70628c = arrayList2;
        Set setI2 = d1.i(new BinRange("340000000000000", "349999999999999"), new BinRange("370000000000000", "379999999999999"));
        ArrayList arrayList3 = new ArrayList(v.y(setI2, 10));
        Iterator it3 = setI2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new AccountRange((BinRange) it3.next(), 15, AccountRange.EnumC0883a.AmericanExpress, null, 8, null));
        }
        f70629d = arrayList3;
        Set setI3 = d1.i(new BinRange("6000000000000000", "6099999999999999"), new BinRange("6400000000000000", "6499999999999999"), new BinRange("6500000000000000", "6599999999999999"));
        ArrayList arrayList4 = new ArrayList(v.y(setI3, 10));
        Iterator it4 = setI3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(new AccountRange((BinRange) it4.next(), 16, AccountRange.EnumC0883a.Discover, null, 8, null));
        }
        f70630e = arrayList4;
        Set setC2 = d1.c(new BinRange("3528000000000000", "3589999999999999"));
        ArrayList arrayList5 = new ArrayList(v.y(setC2, 10));
        Iterator it5 = setC2.iterator();
        while (it5.hasNext()) {
            arrayList5.add(new AccountRange((BinRange) it5.next(), 16, AccountRange.EnumC0883a.JCB, null, 8, null));
        }
        f70631f = arrayList5;
        Set setI4 = d1.i(new BinRange("6200000000000000", "6216828049999999"), new BinRange("6216828060000000", "6299999999999999"), new BinRange("8100000000000000", "8199999999999999"));
        ArrayList arrayList6 = new ArrayList(v.y(setI4, 10));
        Iterator it6 = setI4.iterator();
        while (it6.hasNext()) {
            arrayList6.add(new AccountRange((BinRange) it6.next(), 16, AccountRange.EnumC0883a.UnionPay, null, 8, null));
        }
        f70632g = arrayList6;
        Set setC3 = d1.c(new BinRange("6216828050000000000", "6216828059999999999"));
        ArrayList arrayList7 = new ArrayList(v.y(setC3, 10));
        Iterator it7 = setC3.iterator();
        while (it7.hasNext()) {
            arrayList7.add(new AccountRange((BinRange) it7.next(), 19, AccountRange.EnumC0883a.UnionPay, null, 8, null));
        }
        f70633h = arrayList7;
        Set setI5 = d1.i(new BinRange("3000000000000000", "3059999999999999"), new BinRange("3095000000000000", "3095999999999999"), new BinRange("3800000000000000", "3999999999999999"));
        ArrayList arrayList8 = new ArrayList(v.y(setI5, 10));
        Iterator it8 = setI5.iterator();
        while (it8.hasNext()) {
            arrayList8.add(new AccountRange((BinRange) it8.next(), 16, AccountRange.EnumC0883a.DinersClub, null, 8, null));
        }
        f70634i = arrayList8;
        Set setC4 = d1.c(new BinRange("36000000000000", "36999999999999"));
        ArrayList arrayList9 = new ArrayList(v.y(setC4, 10));
        Iterator it9 = setC4.iterator();
        while (it9.hasNext()) {
            arrayList9.add(new AccountRange((BinRange) it9.next(), 14, AccountRange.EnumC0883a.DinersClub, null, 8, null));
        }
        f70635j = arrayList9;
        Set setI6 = d1.i(new BinRange("4000002500001001", "4000002500001001"), new BinRange("5555552500001001", "5555552500001001"));
        ArrayList arrayList10 = new ArrayList(v.y(setI6, 10));
        Iterator it10 = setI6.iterator();
        while (it10.hasNext()) {
            arrayList10.add(new AccountRange((BinRange) it10.next(), 16, AccountRange.EnumC0883a.CartesBancaires, null, 8, null));
        }
        f70636k = arrayList10;
        f70637l = v.P0(v.P0(v.P0(v.P0(v.P0(v.P0(v.P0(v.P0(v.P0(f70627b, f70628c), f70629d), f70630e), f70631f), f70632g), f70633h), f70634i), f70635j), arrayList10);
    }

    @Override // h30.p
    public List<AccountRange> a(f.Unvalidated cardNumber) {
        s.k(cardNumber, "cardNumber");
        List<AccountRange> list = f70637l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AccountRange) obj).getBinRange().a(cardNumber)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // h30.p
    public AccountRange b(f.Unvalidated cardNumber) {
        s.k(cardNumber, "cardNumber");
        return (AccountRange) v.q0(a(cardNumber));
    }
}
