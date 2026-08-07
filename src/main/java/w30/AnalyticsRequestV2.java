package w30;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.JsonElement;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import vo0.h1;
import vo0.m0;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: w30.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0003NP>B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u009b\u0001\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\n\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\u00020\u00022\u000e\u0010\u001d\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020!0\u000fH\u0002¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u000f2\u0006\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010&J(\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*HÁ\u0001¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\f¢\u0006\u0004\b3\u00104JB\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010\u001cJ\u0010\u00108\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b1\u0010E\u001a\u0004\bF\u0010GR \u0010\u000e\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bH\u0010?\u0012\u0004\bJ\u0010K\u001a\u0004\bI\u0010\u001cR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010#R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010R\u001a\u0004\bS\u0010TR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bA\u0010WR\u001a\u0010\u0017\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010?\u001a\u0004\bC\u0010\u001cR\u0014\u0010[\u001a\u00020X8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006]"}, d2 = {"Lw30/g;", "Lw30/k0;", "", "eventName", "clientId", "origin", "", "created", "Lkotlinx/serialization/json/JsonElement;", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)V", "", "seen1", "postParameters", "", "headers", "Lw30/k0$a;", "method", "Lw30/k0$b;", "mimeType", "", "retryResponseCodes", ImagesContract.URL, "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/util/Map;Lw30/k0$a;Lw30/k0$b;Ljava/lang/Iterable;Ljava/lang/String;Lvo0/v1;)V", "m", "()Ljava/lang/String;", "map", "level", "o", "(Ljava/util/Map;I)Ljava/lang/String;", "", "j", "()Ljava/util/Map;", "runAttemptCount", "n", "(I)Ljava/util/Map;", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "v", "(Lw30/g;Luo0/d;Lto0/f;)V", "Ljava/io/OutputStream;", "outputStream", "g", "(Ljava/io/OutputStream;)V", "u", "(I)Lw30/g;", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)Lw30/g;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "r", DateTokenConverter.CONVERTER_KEY, "e", "f", "D", "Lkotlinx/serialization/json/JsonElement;", "getParams", "()Lkotlinx/serialization/json/JsonElement;", "h", "getPostParameters$stripe_core_release", "getPostParameters$stripe_core_release$annotations", "()V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "a", "Lw30/k0$a;", "b", "()Lw30/k0$a;", "Lw30/k0$b;", "s", "()Lw30/k0$b;", "l", "Ljava/lang/Iterable;", "()Ljava/lang/Iterable;", "", "t", "()[B", "postBodyBytes", "Companion", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class AnalyticsRequestV2 extends k0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ro0.d<Object>[] f120594n;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String eventName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String origin;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double created;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonElement params;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String postParameters;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> headers;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k0.a method;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k0.b mimeType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Iterable<Integer> retryResponseCodes;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: w30.g$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/core/networking/AnalyticsRequestV2.$serializer", "Lvo0/e0;", "Lw30/g;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lw30/g;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lw30/g;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<AnalyticsRequestV2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f120606a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f120606a = aVar;
            m1 m1Var = new m1("com.stripe.android.core.networking.AnalyticsRequestV2", aVar, 11);
            m1Var.o("eventName", false);
            m1Var.o("clientId", false);
            m1Var.o("origin", false);
            m1Var.o("created", false);
            m1Var.o("params", false);
            m1Var.o("postParameters", true);
            m1Var.o("headers", true);
            m1Var.o("method", true);
            m1Var.o("mimeType", true);
            m1Var.o("retryResponseCodes", true);
            m1Var.o(ImagesContract.URL, true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AnalyticsRequestV2 deserialize(uo0.e decoder) {
            int i11;
            k0.b bVar;
            Iterable iterable;
            k0.a aVar;
            Map map;
            JsonElement jsonElement;
            String str;
            String str2;
            String str3;
            String str4;
            String strT;
            double d11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = AnalyticsRequestV2.f120594n;
            int i12 = 10;
            String strT2 = null;
            if (cVarB.i()) {
                String strT3 = cVarB.t(descriptor2, 0);
                String strT4 = cVarB.t(descriptor2, 1);
                String strT5 = cVarB.t(descriptor2, 2);
                double dS = cVarB.s(descriptor2, 3);
                JsonElement jsonElement2 = (JsonElement) cVarB.n(descriptor2, 4, wo0.q.f122156a, null);
                String strT6 = cVarB.t(descriptor2, 5);
                Map map2 = (Map) cVarB.n(descriptor2, 6, dVarArr[6], null);
                k0.a aVar2 = (k0.a) cVarB.n(descriptor2, 7, dVarArr[7], null);
                k0.b bVar2 = (k0.b) cVarB.n(descriptor2, 8, dVarArr[8], null);
                iterable = (Iterable) cVarB.n(descriptor2, 9, dVarArr[9], null);
                str = strT3;
                strT = cVarB.t(descriptor2, 10);
                str4 = strT6;
                jsonElement = jsonElement2;
                map = map2;
                str3 = strT5;
                i11 = 2047;
                aVar = aVar2;
                bVar = bVar2;
                str2 = strT4;
                d11 = dS;
            } else {
                boolean z11 = true;
                int i13 = 0;
                k0.b bVar3 = null;
                Iterable iterable2 = null;
                k0.a aVar3 = null;
                Map map3 = null;
                JsonElement jsonElement3 = null;
                String strT7 = null;
                String strT8 = null;
                double dS2 = 0.0d;
                String strT9 = null;
                String strT10 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            i12 = 10;
                            break;
                        case 0:
                            i13 |= 1;
                            strT2 = cVarB.t(descriptor2, 0);
                            i12 = 10;
                            break;
                        case 1:
                            strT9 = cVarB.t(descriptor2, 1);
                            i13 |= 2;
                            i12 = 10;
                            break;
                        case 2:
                            strT10 = cVarB.t(descriptor2, 2);
                            i13 |= 4;
                            i12 = 10;
                            break;
                        case 3:
                            dS2 = cVarB.s(descriptor2, 3);
                            i13 |= 8;
                            i12 = 10;
                            break;
                        case 4:
                            jsonElement3 = (JsonElement) cVarB.n(descriptor2, 4, wo0.q.f122156a, jsonElement3);
                            i13 |= 16;
                            i12 = 10;
                            break;
                        case 5:
                            strT7 = cVarB.t(descriptor2, 5);
                            i13 |= 32;
                            break;
                        case 6:
                            map3 = (Map) cVarB.n(descriptor2, 6, dVarArr[6], map3);
                            i13 |= 64;
                            break;
                        case 7:
                            aVar3 = (k0.a) cVarB.n(descriptor2, 7, dVarArr[7], aVar3);
                            i13 |= 128;
                            break;
                        case 8:
                            bVar3 = (k0.b) cVarB.n(descriptor2, 8, dVarArr[8], bVar3);
                            i13 |= 256;
                            break;
                        case 9:
                            iterable2 = (Iterable) cVarB.n(descriptor2, 9, dVarArr[9], iterable2);
                            i13 |= 512;
                            break;
                        case 10:
                            strT8 = cVarB.t(descriptor2, i12);
                            i13 |= 1024;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                i11 = i13;
                bVar = bVar3;
                iterable = iterable2;
                aVar = aVar3;
                map = map3;
                jsonElement = jsonElement3;
                str = strT2;
                str2 = strT9;
                str3 = strT10;
                str4 = strT7;
                strT = strT8;
                d11 = dS2;
            }
            cVarB.c(descriptor2);
            return new AnalyticsRequestV2(i11, str, str2, str3, d11, jsonElement, str4, map, aVar, bVar, iterable, strT, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, AnalyticsRequestV2 value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            AnalyticsRequestV2.v(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?>[] dVarArr = AnalyticsRequestV2.f120594n;
            ro0.d<?> dVar = dVarArr[6];
            ro0.d<?> dVar2 = dVarArr[7];
            ro0.d<?> dVar3 = dVarArr[8];
            ro0.d<?> dVar4 = dVarArr[9];
            z1 z1Var = z1.f119730a;
            return new ro0.d[]{z1Var, z1Var, z1Var, vo0.t.f119690a, wo0.q.f122156a, z1Var, dVar, dVar2, dVar3, dVar4, z1Var};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: w30.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Lw30/g$b;", "", "<init>", "()V", "", "eventName", "clientId", "origin", "", "params", "Lw30/g;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lw30/g;", "Lro0/d;", "serializer", "()Lro0/d;", "ANALYTICS_HOST", "Ljava/lang/String;", "HEADER_ORIGIN", "INDENTATION", "PARAM_CLIENT_ID", "PARAM_CREATED", "PARAM_DELAYED", "PARAM_EVENT_ID", "PARAM_EVENT_NAME", "PARAM_IS_RETRY", "PARAM_USES_WORK_MANAGER", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AnalyticsRequestV2 a(String eventName, String clientId, String origin, Map<String, ?> params) {
            p013kotlin.jvm.internal.s.k(eventName, "eventName");
            p013kotlin.jvm.internal.s.k(clientId, "clientId");
            p013kotlin.jvm.internal.s.k(origin, "origin");
            p013kotlin.jvm.internal.s.k(params, "params");
            Map mapR = v0.r(params, v0.f(jn0.x.a("uses_work_manager", Boolean.FALSE)));
            io0.b.Companion companion = io0.b.INSTANCE;
            return new AnalyticsRequestV2(eventName, clientId, origin, io0.b.H(io0.d.t(System.currentTimeMillis(), io0.e.MILLISECONDS), io0.e.SECONDS), j.c(mapR), null);
        }

        public final ro0.d<AnalyticsRequestV2> serializer() {
            return a.f120606a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: w30.g$c */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lw30/g$c;", "", "", Action.KEY_ATTRIBUTE, "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "str", "a", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String value;

        public c(String key, String value) {
            p013kotlin.jvm.internal.s.k(key, "key");
            p013kotlin.jvm.internal.s.k(value, "value");
            this.key = key;
            this.value = value;
        }

        private final String a(String str) throws UnsupportedEncodingException {
            String strEncode = URLEncoder.encode(str, p013kotlin.text.d.UTF_8.name());
            p013kotlin.jvm.internal.s.j(strEncode, "encode(...)");
            return strEncode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return p013kotlin.jvm.internal.s.f(this.key, cVar.key) && p013kotlin.jvm.internal.s.f(this.value, cVar.value);
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() throws UnsupportedEncodingException {
            return a(this.key) + "=" + a(this.value);
        }
    }

    /* JADX INFO: renamed from: w30.g$d */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw30/g$c;", "it", "", "a", "(Lw30/g$c;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.l<c, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f120609c = new d();

        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(c it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return it.toString();
        }
    }

    static {
        z1 z1Var = z1.f119730a;
        f120594n = new ro0.d[]{null, null, null, null, null, null, new m0(z1Var, z1Var), vo0.a0.b("com.stripe.android.core.networking.StripeRequest.Method", k0.a.values()), vo0.a0.b("com.stripe.android.core.networking.StripeRequest.MimeType", k0.b.values()), new ro0.h(o0.b(Iterable.class), new Annotation[0]), null};
    }

    public /* synthetic */ AnalyticsRequestV2(String str, String str2, String str3, double d11, JsonElement jsonElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d11, jsonElement);
    }

    private final Map<String, Object> j() {
        return v0.m(jn0.x.a("client_id", this.clientId), jn0.x.a("created", Double.valueOf(this.created)), jn0.x.a("event_name", this.eventName), jn0.x.a("event_id", UUID.randomUUID().toString()));
    }

    public static /* synthetic */ AnalyticsRequestV2 l(AnalyticsRequestV2 analyticsRequestV2, String str, String str2, String str3, double d11, JsonElement jsonElement, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = analyticsRequestV2.eventName;
        }
        if ((i11 & 2) != 0) {
            str2 = analyticsRequestV2.clientId;
        }
        if ((i11 & 4) != 0) {
            str3 = analyticsRequestV2.origin;
        }
        if ((i11 & 8) != 0) {
            d11 = analyticsRequestV2.created;
        }
        if ((i11 & 16) != 0) {
            jsonElement = analyticsRequestV2.params;
        }
        JsonElement jsonElement2 = jsonElement;
        String str4 = str3;
        return analyticsRequestV2.k(str, str2, str4, d11, jsonElement2);
    }

    private final String m() {
        Map<String, ?> mapR = v0.r(t.a(this.params), j());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : y.f120698a.a(mapR).entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                arrayList.add(new c(key, p(this, (Map) value, 0, 2, null)));
            } else {
                arrayList.add(new c(key, value.toString()));
            }
        }
        return p013kotlin.collections.v.y0(arrayList, "&", null, null, 0, null, d.f120609c, 30, null);
    }

    private final Map<String, ?> n(int runAttemptCount) {
        io0.b.Companion companion = io0.b.INSTANCE;
        return v0.m(jn0.x.a("uses_work_manager", Boolean.TRUE), jn0.x.a("is_retry", Boolean.valueOf(runAttemptCount > 0)), jn0.x.a("delayed", Boolean.valueOf(io0.b.H(io0.d.t(System.currentTimeMillis(), io0.e.MILLISECONDS), io0.e.SECONDS) - this.created > 5.0d)));
    }

    private final String o(Map<?, ?> map, int level) {
        String strO;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        p013kotlin.jvm.internal.s.j(sb2, "append(...)");
        sb2.append('\n');
        p013kotlin.jvm.internal.s.j(sb2, "append(...)");
        boolean z11 = true;
        for (Map.Entry entry : v0.h(map, new Comparator() { // from class: w30.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AnalyticsRequestV2.q(obj, obj2);
            }
        }).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                strO = o((Map) value, level + 1);
            } else if (value == null) {
                strO = "";
            } else {
                strO = "\"" + value + "\"";
            }
            if (!p013kotlin.text.t.y0(strO)) {
                if (z11) {
                    sb2.append(p013kotlin.text.t.R("  ", level));
                    sb2.append("  \"" + key + "\": " + strO);
                    z11 = false;
                } else {
                    sb2.append(",");
                    p013kotlin.jvm.internal.s.j(sb2, "append(...)");
                    sb2.append('\n');
                    p013kotlin.jvm.internal.s.j(sb2, "append(...)");
                    sb2.append(p013kotlin.text.t.R("  ", level));
                    sb2.append("  \"" + key + "\": " + strO);
                }
            }
        }
        sb2.append('\n');
        p013kotlin.jvm.internal.s.j(sb2, "append(...)");
        sb2.append(p013kotlin.text.t.R("  ", level));
        sb2.append("}");
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return string;
    }

    static /* synthetic */ String p(AnalyticsRequestV2 analyticsRequestV2, Map map, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return analyticsRequestV2.o(map, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(Object obj, Object obj2) {
        return String.valueOf(obj).compareTo(String.valueOf(obj2));
    }

    private final byte[] t() {
        byte[] bytes = this.postParameters.getBytes(p013kotlin.text.d.UTF_8);
        p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
        return bytes;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008b  */
    public static final /* synthetic */ void v(AnalyticsRequestV2 self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f120594n;
        output.e(serialDesc, 0, self.eventName);
        output.e(serialDesc, 1, self.clientId);
        output.e(serialDesc, 2, self.origin);
        output.k(serialDesc, 3, self.created);
        output.D(serialDesc, 4, wo0.q.f122156a, self.params);
        if (output.G(serialDesc, 5) || !p013kotlin.jvm.internal.s.f(self.postParameters, self.m())) {
            output.e(serialDesc, 5, self.postParameters);
        }
        if (output.G(serialDesc, 6)) {
            output.D(serialDesc, 6, dVarArr[6], self.a());
        } else {
            if (!p013kotlin.jvm.internal.s.f(self.a(), v0.m(jn0.x.a("Content-Type", k0.b.Form.getCode() + "; charset=" + p013kotlin.text.d.UTF_8.name()), jn0.x.a("origin", self.origin), jn0.x.a("User-Agent", "Stripe/v1 android/20.52.3")))) {
                output.D(serialDesc, 6, dVarArr[6], self.a());
            }
        }
        if (output.G(serialDesc, 7) || self.getMethod() != k0.a.POST) {
            output.D(serialDesc, 7, dVarArr[7], self.getMethod());
        }
        if (output.G(serialDesc, 8) || self.getMimeType() != k0.b.Form) {
            output.D(serialDesc, 8, dVarArr[8], self.getMimeType());
        }
        if (output.G(serialDesc, 9) || !p013kotlin.jvm.internal.s.f(self.d(), new bo0.j(HttpStatusCode.TOO_MANY_REQUESTS_429, HttpStatusCode.TOO_MANY_REQUESTS_429))) {
            output.D(serialDesc, 9, dVarArr[9], self.d());
        }
        if (!output.G(serialDesc, 10) && p013kotlin.jvm.internal.s.f(self.getUrl(), "https://r.stripe.com/0")) {
            return;
        }
        output.e(serialDesc, 10, self.getUrl());
    }

    @Override // w30.k0
    public Map<String, String> a() {
        return this.headers;
    }

    @Override // w30.k0
    /* JADX INFO: renamed from: b, reason: from getter */
    public k0.a getMethod() {
        return this.method;
    }

    @Override // w30.k0
    public Iterable<Integer> d() {
        return this.retryResponseCodes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsRequestV2)) {
            return false;
        }
        AnalyticsRequestV2 analyticsRequestV2 = (AnalyticsRequestV2) other;
        return p013kotlin.jvm.internal.s.f(this.eventName, analyticsRequestV2.eventName) && p013kotlin.jvm.internal.s.f(this.clientId, analyticsRequestV2.clientId) && p013kotlin.jvm.internal.s.f(this.origin, analyticsRequestV2.origin) && Double.compare(this.created, analyticsRequestV2.created) == 0 && p013kotlin.jvm.internal.s.f(this.params, analyticsRequestV2.params);
    }

    @Override // w30.k0
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    @Override // w30.k0
    public void g(OutputStream outputStream) throws IOException {
        p013kotlin.jvm.internal.s.k(outputStream, "outputStream");
        outputStream.write(t());
        outputStream.flush();
    }

    public int hashCode() {
        return (((((((this.eventName.hashCode() * 31) + this.clientId.hashCode()) * 31) + this.origin.hashCode()) * 31) + Double.hashCode(this.created)) * 31) + this.params.hashCode();
    }

    public final AnalyticsRequestV2 k(String eventName, String clientId, String origin, double created, JsonElement params) {
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
        p013kotlin.jvm.internal.s.k(clientId, "clientId");
        p013kotlin.jvm.internal.s.k(origin, "origin");
        p013kotlin.jvm.internal.s.k(params, "params");
        return new AnalyticsRequestV2(eventName, clientId, origin, created, params);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public k0.b getMimeType() {
        return this.mimeType;
    }

    public String toString() {
        return "AnalyticsRequestV2(eventName=" + this.eventName + ", clientId=" + this.clientId + ", origin=" + this.origin + ", created=" + this.created + ", params=" + this.params + ")";
    }

    public final AnalyticsRequestV2 u(int runAttemptCount) {
        return l(this, null, null, null, 0.0d, j.c(v0.r(t.a(this.params), n(runAttemptCount))), 15, null);
    }

    @jn0.e
    public /* synthetic */ AnalyticsRequestV2(int i11, String str, String str2, String str3, double d11, JsonElement jsonElement, String str4, Map map, k0.a aVar, k0.b bVar, Iterable iterable, String str5, v1 v1Var) {
        if (31 != (i11 & 31)) {
            h1.b(i11, 31, a.f120606a.getDescriptor());
        }
        this.eventName = str;
        this.clientId = str2;
        this.origin = str3;
        this.created = d11;
        this.params = jsonElement;
        if ((i11 & 32) == 0) {
            this.postParameters = m();
        } else {
            this.postParameters = str4;
        }
        if ((i11 & 64) == 0) {
            this.headers = v0.m(jn0.x.a("Content-Type", k0.b.Form.getCode() + "; charset=" + p013kotlin.text.d.UTF_8.name()), jn0.x.a("origin", str3), jn0.x.a("User-Agent", "Stripe/v1 android/20.52.3"));
        } else {
            this.headers = map;
        }
        if ((i11 & 128) == 0) {
            this.method = k0.a.POST;
        } else {
            this.method = aVar;
        }
        if ((i11 & 256) == 0) {
            this.mimeType = k0.b.Form;
        } else {
            this.mimeType = bVar;
        }
        if ((i11 & 512) == 0) {
            this.retryResponseCodes = new bo0.j(HttpStatusCode.TOO_MANY_REQUESTS_429, HttpStatusCode.TOO_MANY_REQUESTS_429);
        } else {
            this.retryResponseCodes = iterable;
        }
        if ((i11 & 1024) == 0) {
            this.url = "https://r.stripe.com/0";
        } else {
            this.url = str5;
        }
    }

    private AnalyticsRequestV2(String str, String str2, String str3, double d11, JsonElement jsonElement) {
        this.eventName = str;
        this.clientId = str2;
        this.origin = str3;
        this.created = d11;
        this.params = jsonElement;
        this.postParameters = m();
        k0.b bVar = k0.b.Form;
        this.headers = v0.m(jn0.x.a("Content-Type", bVar.getCode() + "; charset=" + p013kotlin.text.d.UTF_8.name()), jn0.x.a("origin", str3), jn0.x.a("User-Agent", "Stripe/v1 android/20.52.3"));
        this.method = k0.a.POST;
        this.mimeType = bVar;
        this.retryResponseCodes = new bo0.j(HttpStatusCode.TOO_MANY_REQUESTS_429, HttpStatusCode.TOO_MANY_REQUESTS_429);
        this.url = "https://r.stripe.com/0";
    }
}
