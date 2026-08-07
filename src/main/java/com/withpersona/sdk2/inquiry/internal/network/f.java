package com.withpersona.sdk2.inquiry.internal.network;

import a30.c0;
import a30.e0;
import a30.f0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.workflow1.ui.backstack.BackStackContainer;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.k;
import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.RgbaHexColorAdapter;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.network.NumberAdapter;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.util.Arrays;
import java.util.Set;
import ki0.n;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import retrofit2.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\"\u0010#J\u0014\u0010%\u001a\u00070\u0002¢\u0006\u0002\b$H\u0007¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010'\u001a\u0004\b(\u0010&R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b)\u0010&R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b*\u0010&¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/f;", "", "", "serverEndpoint", "webRtcServerEndpoint", "fallbackModeServerEndpoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lretrofit2/z;", "retrofit", "Lhh0/s;", "e", "(Lretrofit2/z;)Lhh0/s;", "Lcj0/b;", "l", "(Lretrofit2/z;)Lcj0/b;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", DateTokenConverter.CONVERTER_KEY, "(Lretrofit2/z;)Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", "Lvh0/a;", "j", "(Lretrofit2/z;)Lvh0/a;", "Lkg0/b;", "a", "(Lretrofit2/z;)Lkg0/b;", "webRtcRetrofit", "Ldj0/a;", "n", "(Lretrofit2/z;)Ldj0/a;", "fallbackModeRetrofit", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "b", "(Lretrofit2/z;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "Log0/b;", "c", "(Lretrofit2/z;)Log0/b;", "Lcom/withpersona/sdk2/inquiry/network/core/ServerEndpoint;", "k", "()Ljava/lang/String;", "Ljava/lang/String;", "getServerEndpoint", "getWebRtcServerEndpoint", "getFallbackModeServerEndpoint", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serverEndpoint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String webRtcServerEndpoint;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String fallbackModeServerEndpoint;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u00070\f¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00100\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ\u0019\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\u00100\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/f$a;", "", "<init>", "()V", "", "La30/c0;", "viewBindings", "La30/e0;", "f", "(Ljava/util/Set;)La30/e0;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Set;", "", "Lcom/withpersona/sdk2/inquiry/network/core/HttpHeader;", "e", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "a", "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding;", "b", "Lcom/squareup/moshi/h$e;", "c", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<Object> a() {
            return d1.i(CreateInquiryRequest.Data.INSTANCE, CreateInquirySessionResponse.GpsCollectionRequirement.INSTANCE, CreateInquirySessionResponse.GpsPrecisionRequirement.INSTANCE, ComponentParam.Adapter.f58716a, InquiryFieldMap.INSTANCE, NextStep.GovernmentId.SelectPage.INSTANCE, NextStep.GovernmentId.PassportNfcOption.INSTANCE, NextStep.GovernmentId.CaptureFileType.INSTANCE, NextStep.GovernmentId.VideoCaptureMethod.INSTANCE, NextStep.Selfie.CaptureFileType.INSTANCE, NextStep.Selfie.VideoCaptureMethod.INSTANCE, Button.ButtonType.INSTANCE, InputText.InputType.INSTANCE, InputText.AutofillHint.INSTANCE, RemoteImage.ContentType.INSTANCE, GovernmentIdNfcScan.DataGroupTypes.INSTANCE, UiComponentError.Companion, StyleElements.PositionType.INSTANCE, StyleElements.DPSize.INSTANCE, StyleElements.Size.INSTANCE, StyleElements.FontName.INSTANCE, StyleElements.FontWeight.INSTANCE, StyleElements.Axis.INSTANCE, JsonLogicBoolean.INSTANCE, NumberAdapter.f58692a, RgbaHexColorAdapter.INSTANCE, PendingPageTextPosition.INSTANCE);
        }

        public final Set<JsonAdapterBinding<?>> b() {
            return d1.d();
        }

        public final Set<com.squareup.moshi.h.e> c() {
            return d1.c(InquiryField.INSTANCE.createAdapter());
        }

        public final Set<c0<?>> d() {
            return d1.i(k.INSTANCE, com.withpersona.sdk2.inquiry.internal.i.INSTANCE, BackStackContainer.INSTANCE, ih0.c.INSTANCE, n.INSTANCE);
        }

        public final String e() {
            return "Persona/1.0 (Android) Inquiry/2.24.0";
        }

        public final e0 f(Set<c0<?>> viewBindings) {
            s.k(viewBindings, "viewBindings");
            c0[] c0VarArr = (c0[]) viewBindings.toArray(new c0[0]);
            return f0.b((c0[]) Arrays.copyOf(c0VarArr, c0VarArr.length));
        }

        private Companion() {
        }
    }

    public f(String serverEndpoint, String webRtcServerEndpoint, String fallbackModeServerEndpoint) {
        s.k(serverEndpoint, "serverEndpoint");
        s.k(webRtcServerEndpoint, "webRtcServerEndpoint");
        s.k(fallbackModeServerEndpoint, "fallbackModeServerEndpoint");
        this.serverEndpoint = serverEndpoint;
        this.webRtcServerEndpoint = webRtcServerEndpoint;
        this.fallbackModeServerEndpoint = fallbackModeServerEndpoint;
    }

    public static final Set<Object> f() {
        return INSTANCE.a();
    }

    public static final Set<JsonAdapterBinding<?>> g() {
        return INSTANCE.b();
    }

    public static final Set<com.squareup.moshi.h.e> h() {
        return INSTANCE.c();
    }

    public static final Set<c0<?>> i() {
        return INSTANCE.d();
    }

    public static final e0 m(Set<c0<?>> set) {
        return INSTANCE.f(set);
    }

    public final kg0.b a(z retrofit) {
        s.k(retrofit, "retrofit");
        Object objB = retrofit.b(kg0.b.class);
        s.j(objB, "create(...)");
        return (kg0.b) objB;
    }

    public final FallbackModeService b(z fallbackModeRetrofit) {
        s.k(fallbackModeRetrofit, "fallbackModeRetrofit");
        Object objB = fallbackModeRetrofit.d().c(this.fallbackModeServerEndpoint).e().b(FallbackModeService.class);
        s.j(objB, "create(...)");
        return (FallbackModeService) objB;
    }

    public final og0.b c(z retrofit) {
        s.k(retrofit, "retrofit");
        Object objB = retrofit.b(og0.b.class);
        s.j(objB, "create(...)");
        return (og0.b) objB;
    }

    public final com.withpersona.sdk2.inquiry.governmentid.network.a d(z retrofit) {
        s.k(retrofit, "retrofit");
        Object objB = retrofit.b(com.withpersona.sdk2.inquiry.governmentid.network.a.class);
        s.j(objB, "create(...)");
        return (com.withpersona.sdk2.inquiry.governmentid.network.a) objB;
    }

    public final hh0.s e(z retrofit) {
        s.k(retrofit, "retrofit");
        Object objB = retrofit.b(hh0.s.class);
        s.j(objB, "create(...)");
        return (hh0.s) objB;
    }

    public final vh0.a j(z retrofit) {
        s.k(retrofit, "retrofit");
        Object objB = retrofit.b(vh0.a.class);
        s.j(objB, "create(...)");
        return (vh0.a) objB;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getServerEndpoint() {
        return this.serverEndpoint;
    }

    public final cj0.b l(z retrofit) {
        s.k(retrofit, "retrofit");
        Object objB = retrofit.b(cj0.b.class);
        s.j(objB, "create(...)");
        return (cj0.b) objB;
    }

    public final dj0.a n(z webRtcRetrofit) {
        s.k(webRtcRetrofit, "webRtcRetrofit");
        Object objB = webRtcRetrofit.d().c(this.webRtcServerEndpoint).e().b(dj0.a.class);
        s.j(objB, "create(...)");
        return (dj0.a) objB;
    }
}
