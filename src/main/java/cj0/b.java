package cj0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.steps.ui.network.AddressAutocompleteResponse;
import com.withpersona.sdk2.inquiry.ui.network.AddressAutocompleteRequest;
import com.withpersona.sdk2.inquiry.ui.network.AddressDetailsResponse;
import com.withpersona.sdk2.inquiry.ui.network.OneTimeLinkCodeForPersonasRequest;
import com.withpersona.sdk2.inquiry.ui.network.OneTimeLinkCodeResponse;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import retrofit2.y;
import sr0.f;
import sr0.i;
import sr0.o;
import sr0.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcj0/b;", "", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;", "request", "Lretrofit2/y;", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/AddressAutocompleteResponse;", "c", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addressId", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressDetailsResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inquiryId", "Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest;", "Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeResponse;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface b {
    @f("/api/internal/verify/v1/address/{addressId}")
    Object a(@i("Authorization") String str, @s("addressId") String str2, Continuation<? super y<AddressDetailsResponse>> continuation);

    @o("/api/internal/verify/v1/inquiries/{inquiryId}/generate-reusable-persona-create-popup-one-time-link-code")
    Object b(@s("inquiryId") String str, @i("Authorization") String str2, Continuation<? super y<OneTimeLinkCodeResponse>> continuation);

    @o("/api/internal/verify/v1/address/autocomplete")
    Object c(@i("Authorization") String str, @sr0.a AddressAutocompleteRequest addressAutocompleteRequest, Continuation<? super y<AddressAutocompleteResponse>> continuation);

    @o("/api/internal/verify/v1/inquiries/{inquiryId}/generate-reusable-persona-verify-popup-one-time-link-code")
    Object d(@s("inquiryId") String str, @i("Authorization") String str2, @sr0.a OneTimeLinkCodeForPersonasRequest oneTimeLinkCodeForPersonasRequest, Continuation<? super y<OneTimeLinkCodeResponse>> continuation);
}
