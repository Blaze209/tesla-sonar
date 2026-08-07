package com.stripe.android.paymentsheet.addresselement;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.StripeIntent;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import z80.LayoutSpec;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/j;", "", "Lo70/h;", "a", "()Lo70/h;", "formController", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface j {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\u00002\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\u00020\u00002\u0018\b\u0001\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006H'¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\bH'¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/j$a;", "", "Lz80/p1;", "formSpec", "f", "(Lz80/p1;)Lcom/stripe/android/paymentsheet/addresselement/j$a;", "", "Li90/g0;", "", "initialValues", "e", "(Ljava/util/Map;)Lcom/stripe/android/paymentsheet/addresselement/j$a;", "shippingAddress", "c", "Lkotlinx/coroutines/CoroutineScope;", "viewModelScope", "b", "(Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/paymentsheet/addresselement/j$a;", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/paymentsheet/addresselement/j$a;", "merchantName", "a", "(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/addresselement/j$a;", "Lcom/stripe/android/paymentsheet/addresselement/j;", "build", "()Lcom/stripe/android/paymentsheet/addresselement/j;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        a a(String merchantName);

        a b(CoroutineScope viewModelScope);

        j build();

        a c(Map<IdentifierSpec, String> shippingAddress);

        a d(StripeIntent stripeIntent);

        a e(Map<IdentifierSpec, String> initialValues);

        a f(LayoutSpec formSpec);
    }

    p017o70.h a();
}
