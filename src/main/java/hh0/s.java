package hh0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequest;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResponse;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.internal.network.ExchangeOneTimeLinkCodeRequest;
import com.withpersona.sdk2.inquiry.internal.network.ExchangeOneTimeLinkCodeResponse;
import com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest;
import com.withpersona.sdk2.inquiry.internal.network.UpdateInquirySessionRequest;
import com.withpersona.sdk2.inquiry.internal.network.VerifyDeviceIntegrityRequest;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest;
import okhttp3.ResponseBody;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import retrofit2.y;
import sr0.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\r\u0010\u000eJF\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001fH§@¢\u0006\u0004\b \u0010!J \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0004H§@¢\u0006\u0004\b\"\u0010#J*\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020$H§@¢\u0006\u0004\b%\u0010&J \u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00062\b\b\u0001\u0010\u0003\u001a\u00020'H§@¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lhh0/s;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "request", "", "fallbackMode", "Lretrofit2/y;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "f", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;", "deviceId", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", DateTokenConverter.CONVERTER_KEY, "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionToken", "inquiryId", "", "include", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "Lokhttp3/ResponseBody;", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;", "c", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;", "h", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse;", "j", "(Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface s {
    @sr0.n("/api/internal/verify/v1/current-inquiry-session")
    Object a(@sr0.i("Authorization") String str, @sr0.a UpdateInquirySessionRequest updateInquirySessionRequest, Continuation<? super y<ResponseBody>> continuation);

    @sr0.o("/api/internal/verify/v1/inquiries/{inquiryId}/transition-back")
    Object b(@sr0.i("Authorization") String str, @sr0.s("inquiryId") String str2, @sr0.a TransitionBackRequest transitionBackRequest, Continuation<? super y<CheckInquiryResponse>> continuation);

    @sr0.o("/api/internal/verify/v1/current-inquiry-session/verify-device-integrity")
    Object c(@sr0.i("Authorization") String str, @sr0.a VerifyDeviceIntegrityRequest verifyDeviceIntegrityRequest, Continuation<? super y<ResponseBody>> continuation);

    @sr0.o("/api/internal/verify/v1/inquiry-sessions")
    Object d(@sr0.a CreateInquirySessionRequest createInquirySessionRequest, @sr0.i("Persona-Device-Id") String str, Continuation<? super y<CreateInquirySessionResponse>> continuation);

    @sr0.o("/api/internal/verify/v1/current-inquiry-session/cancel")
    Object e(@sr0.i("Authorization") String str, Continuation<? super y<ResponseBody>> continuation);

    @sr0.o("/api/internal/verify/v1/inquiries")
    Object f(@sr0.a CreateInquiryRequest createInquiryRequest, @sr0.i("Persona-Fallback-Mode") String str, Continuation<? super y<CheckInquiryResponse>> continuation);

    @sr0.f("/api/internal/verify/v1/inquiries/{inquiryId}")
    Object g(@sr0.i("Authorization") String str, @sr0.i("Persona-Device-Id") String str2, @sr0.s("inquiryId") String str3, @t("include") String[] strArr, Continuation<? super y<CheckInquiryResponse>> continuation);

    @sr0.o("/api/internal/verify/v1/current-inquiry-session/error")
    Object h(@sr0.i("Authorization") String str, @sr0.a ErrorRequest errorRequest, Continuation<? super y<ResponseBody>> continuation);

    @sr0.o("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    Object i(@sr0.i("Authorization") String str, @sr0.s("inquiryId") String str2, @sr0.a TransitionInquiryRequest transitionInquiryRequest, Continuation<? super y<CheckInquiryResponse>> continuation);

    @sr0.o("/api/internal/verify/v1/inquiry-sessions/exchange-one-time-link-code")
    Object j(@sr0.a ExchangeOneTimeLinkCodeRequest exchangeOneTimeLinkCodeRequest, Continuation<? super y<ExchangeOneTimeLinkCodeResponse>> continuation);
}
