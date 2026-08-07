package p017o70;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.m;
import androidx.compose.ui.d;
import com.stripe.android.paymentsheet.y;
import d3.c;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.x;
import p020r2.y2;
import v1.b;
import v1.i;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u0002*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "other", "", "c", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I", "Lo70/a;", "otherAddress", "b", "(Lo70/a;Lo70/a;)I", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "Lv1/i;", "Ljn0/h0;", "content", "a", "(Landroidx/compose/ui/d;Lwn0/q;Lr2/l;II)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f96799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q<i, l, Integer, h0> f96800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f96801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f96802f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(d dVar, q<? super i, ? super l, ? super Integer, h0> qVar, int i11, int i12) {
            super(2);
            this.f96799c = dVar;
            this.f96800d = qVar;
            this.f96801e = i11;
            this.f96802f = i12;
        }

        public final void a(l lVar, int i11) {
            f.a(this.f96799c, this.f96800d, lVar, k2.a(this.f96801e | 1), this.f96802f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(d dVar, q<? super i, ? super l, ? super Integer, h0> content, l lVar, int i11, int i12) {
        d dVar2;
        int i13;
        d dVar3;
        s.k(content, "content");
        l lVarV = lVar.v(249772746);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 14) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.K(content) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && lVarV.b()) {
            lVarV.j();
            dVar3 = dVar2;
        } else {
            dVar3 = i14 != 0 ? d.INSTANCE : dVar2;
            if (o.J()) {
                o.S(249772746, i13, -1, "com.stripe.android.paymentsheet.addresselement.ScrollableColumn (AddressUtils.kt:61)");
            }
            d dVarD = m.d(d.INSTANCE, m.a(0, lVarV, 0, 1), false, null, false, 14, null);
            lVarV.H(733328855);
            c.Companion companion = c.INSTANCE;
            i0 i0VarJ = g.j(companion.o(), false, lVarV, 0);
            lVarV.H(-1323940314);
            int iA = j.a(lVarV, 0);
            x xVarC = lVarV.c();
            b4.g.Companion aVar = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = aVar.a();
            q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(dVarD);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarJ, aVar.c());
            d4.b(lVarA, xVarC, aVar.e());
            p<b4.g, Integer, h0> pVarB = aVar.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            int i15 = ((i13 << 6) & 7168) | (i13 & 14);
            lVarV.H(-483455358);
            i0 i0VarA = v1.g.a(b.f117444a.g(), companion.k(), lVarV, 0);
            lVarV.H(-1323940314);
            int iA2 = j.a(lVarV, 0);
            x xVarC2 = lVarV.c();
            wn0.a<b4.g> aVarA2 = aVar.a();
            q<y2<b4.g>, l, Integer, h0> qVarA2 = a0.a(dVar3);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            l lVarA2 = d4.a(lVarV);
            d4.b(lVarA2, i0VarA, aVar.c());
            d4.b(lVarA2, xVarC2, aVar.e());
            p<b4.g, Integer, h0> pVarB2 = aVar.b();
            if (lVarA2.getInserting() || !s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            qVarA2.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            content.invoke(v1.j.f117505a, lVarV, Integer.valueOf(((i15 >> 6) & 112) | 6));
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(dVar3, content, i11, i12));
        }
    }

    public static final int b(AddressDetails addressDetails, AddressDetails addressDetails2) {
        String city;
        String city2;
        String country;
        String country2;
        String line1;
        String line2;
        String line3;
        String line4;
        String postalCode;
        String postalCode2;
        String state;
        String state2;
        s.k(addressDetails, "<this>");
        y.Address address = addressDetails2 != null ? addressDetails2.getAddress() : null;
        y.Address address2 = addressDetails.getAddress();
        String str = "";
        if (address2 == null || (city = address2.getCity()) == null) {
            city = "";
        }
        if (address == null || (city2 = address.getCity()) == null) {
            city2 = "";
        }
        int iC = c(city, city2);
        y.Address address3 = addressDetails.getAddress();
        if (address3 == null || (country = address3.getCountry()) == null) {
            country = "";
        }
        if (address == null || (country2 = address.getCountry()) == null) {
            country2 = "";
        }
        int iC2 = iC + c(country, country2);
        y.Address address4 = addressDetails.getAddress();
        if (address4 == null || (line1 = address4.getLine1()) == null) {
            line1 = "";
        }
        if (address == null || (line2 = address.getLine1()) == null) {
            line2 = "";
        }
        int iC3 = iC2 + c(line1, line2);
        y.Address address5 = addressDetails.getAddress();
        if (address5 == null || (line3 = address5.getLine2()) == null) {
            line3 = "";
        }
        if (address == null || (line4 = address.getLine2()) == null) {
            line4 = "";
        }
        int iC4 = iC3 + c(line3, line4);
        y.Address address6 = addressDetails.getAddress();
        if (address6 == null || (postalCode = address6.getPostalCode()) == null) {
            postalCode = "";
        }
        if (address == null || (postalCode2 = address.getPostalCode()) == null) {
            postalCode2 = "";
        }
        int iC5 = iC4 + c(postalCode, postalCode2);
        y.Address address7 = addressDetails.getAddress();
        if (address7 == null || (state = address7.getState()) == null) {
            state = "";
        }
        if (address != null && (state2 = address.getState()) != null) {
            str = state2;
        }
        return iC5 + c(state, str);
    }

    public static final int c(CharSequence charSequence, CharSequence other) {
        s.k(charSequence, "<this>");
        s.k(other, "other");
        if (s.f(charSequence, other)) {
            return 0;
        }
        if (charSequence.length() == 0) {
            return other.length();
        }
        if (other.length() == 0) {
            return charSequence.length();
        }
        int length = charSequence.length();
        int i11 = length + 1;
        int length2 = other.length() + 1;
        Integer[] numArr = new Integer[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            numArr[i12] = Integer.valueOf(i12);
        }
        Integer[] numArr2 = new Integer[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            numArr2[i13] = 0;
        }
        int i14 = 1;
        while (i14 < length2) {
            numArr2[0] = Integer.valueOf(i14);
            for (int i15 = 1; i15 < i11; i15++) {
                int i16 = i15 - 1;
                numArr2[i15] = Integer.valueOf(Math.min(Math.min(numArr[i15].intValue() + 1, numArr2[i16].intValue() + 1), numArr[i16].intValue() + (charSequence.charAt(i16) == other.charAt(i14 + (-1)) ? 0 : 1)));
            }
            i14++;
            Integer[] numArr3 = numArr2;
            numArr2 = numArr;
            numArr = numArr3;
        }
        return numArr[length].intValue();
    }
}
