package com.withpersona.sdk2.inquiry.governmentid.network;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import pg0.Frame;
import pg0.IdConfig;
import pg0.IdConfigForCountry;
import pg0.d0;
import pg0.z;
import retrofit2.y;
import wn0.l;
import wn0.p;
import y20.o;
import zf0.y0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004!#\u001c6BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0016*\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u00122\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "Ly20/o;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", "service", "Lpg0/d0;", "governmentId", "Lgi0/a;", "imageHelper", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "supplementaryData", "", "defaultManualCaptureDelayMs", "", "extractTextFromImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/a;Lpg0/d0;Lgi0/a;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;JZ)V", "", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;", "Lpg0/f4;", "n", "(Ljava/util/List;)Ljava/util/List;", "otherWorker", "a", "(Ly20/o;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", "g", "Lpg0/d0;", "h", "Lgi0/a;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "j", "J", "k", "Z", "Lzf0/y0;", "l", "Lzf0/y0;", "idFrontAnalyzer", "SupplementaryData", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutoClassifyWorker implements o<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String inquiryId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String fromStep;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String fromComponent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.governmentid.network.a service;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final d0 governmentId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final gi0.a imageHelper;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final SupplementaryData supplementaryData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long defaultManualCaptureDelayMs;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean extractTextFromImage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final y0 idFrontAnalyzer;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "", "<init>", "()V", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SupplementaryData {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "", "a", "b", "c", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "", "countryCode", "Lpg0/d4;", "idConfig", "<init>", "(Ljava/lang/String;Lpg0/d4;)V", "a", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", "b", "Lpg0/d4;", "()Lpg0/d4;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1174a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String countryCode;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final IdConfig idConfig;

            public C1174a(String countryCode, IdConfig idConfig) {
                s.k(countryCode, "countryCode");
                s.k(idConfig, "idConfig");
                this.countryCode = countryCode;
                this.idConfig = idConfig;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final IdConfig getIdConfig() {
                return this.idConfig;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "", "Lpg0/f4;", "idClassesPerCountry", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final List<IdConfigForCountry> idClassesPerCountry;

            public b(List<IdConfigForCountry> idClassesPerCountry) {
                s.k(idClassesPerCountry, "idClassesPerCountry");
                this.idClassesPerCountry = idClassesPerCountry;
            }

            public final List<IdConfigForCountry> a() {
                return this.idClassesPerCountry;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "", "Lpg0/f4;", "idClassesPerCountry", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final List<IdConfigForCountry> idClassesPerCountry;

            public c(List<IdConfigForCountry> idClassesPerCountry) {
                s.k(idClassesPerCountry, "idClassesPerCountry");
                this.idClassesPerCountry = idClassesPerCountry;
            }

            public final List<IdConfigForCountry> a() {
                return this.idClassesPerCountry;
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JM\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", "service", "Lgi0/a;", "imageHelper", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/a;Lgi0/a;)V", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "Lpg0/d0;", "governmentId", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "supplementaryData", "", "defaultManualCaptureDelayMs", "", "extractTextFromImage", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpg0/d0;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;JZ)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/a;", "b", "Lgi0/a;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.withpersona.sdk2.inquiry.governmentid.network.a service;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final gi0.a imageHelper;

        public b(com.withpersona.sdk2.inquiry.governmentid.network.a service, gi0.a imageHelper) {
            s.k(service, "service");
            s.k(imageHelper, "imageHelper");
            this.service = service;
            this.imageHelper = imageHelper;
        }

        public final AutoClassifyWorker a(String sessionToken, String inquiryId, String fromStep, String fromComponent, d0 governmentId, SupplementaryData supplementaryData, long defaultManualCaptureDelayMs, boolean extractTextFromImage) {
            s.k(sessionToken, "sessionToken");
            s.k(inquiryId, "inquiryId");
            s.k(fromStep, "fromStep");
            s.k(fromComponent, "fromComponent");
            s.k(governmentId, "governmentId");
            s.k(supplementaryData, "supplementaryData");
            return new AutoClassifyWorker(sessionToken, inquiryId, fromStep, fromComponent, this.service, governmentId, this.imageHelper, supplementaryData, defaultManualCaptureDelayMs, extractTextFromImage);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "", "b", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final InternalErrorInfo cause;

            public a(InternalErrorInfo cause) {
                s.k(cause, "cause");
                this.cause = cause;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "autoClassificationResult", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;)V", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "()Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final a autoClassificationResult;

            public b(a autoClassificationResult) {
                s.k(autoClassificationResult, "autoClassificationResult");
                this.autoClassificationResult = autoClassificationResult;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final a getAutoClassificationResult() {
                return this.autoClassificationResult;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1", f = "AutoClassifyWorker.kt", i = {0, 0, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8}, l = {89, 125, 139, 145, 156, 165, 174, 180, 184}, m = "invokeSuspend", n = {"$this$flow", "body", "$this$flow", "$this$flow", "$this$onSuccess$iv", "$this$flow", "$this$onSuccess$iv", "$this$flow", "$this$onSuccess$iv", "$this$flow", "$this$onSuccess$iv", "$this$flow", "$this$onSuccess$iv", "$this$flow", "$this$onSuccess$iv", "$this$onFailure$iv"}, s = {"L$0", "L$1", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class d extends SuspendLambda implements p<FlowCollector<? super c>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f57495n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f57496o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f57497p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f57498q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f57499r;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lretrofit2/y;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;", "<anonymous>", "()Lretrofit2/y;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1$2", f = "AutoClassifyWorker.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements l<Continuation<? super y<AutoClassifyResponse>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f57501n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ AutoClassifyWorker f57502o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ List<MultipartBody.Part> f57503p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AutoClassifyWorker autoClassifyWorker, List<MultipartBody.Part> list, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f57502o = autoClassifyWorker;
                this.f57503p = list;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Continuation<?> continuation) {
                return new a(this.f57502o, this.f57503p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f57501n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                com.withpersona.sdk2.inquiry.governmentid.network.a aVar = this.f57502o.service;
                String str = this.f57502o.sessionToken;
                String str2 = this.f57502o.inquiryId;
                List<MultipartBody.Part> list = this.f57503p;
                SupplementaryData supplementaryData = this.f57502o.supplementaryData;
                this.f57501n = 1;
                Object objA = aVar.a(str, str2, list, supplementaryData, this);
                return objA == coroutine_suspended ? coroutine_suspended : objA;
            }

            @Override // wn0.l
            public final Object invoke(Continuation<? super y<AutoClassifyResponse>> continuation) {
                return ((a) create(continuation)).invokeSuspend(h0.f84049a);
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        private static final void a(List<MultipartBody.Part> list, AutoClassifyWorker autoClassifyWorker, Frame frame) {
            String strB;
            MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
            list.add(companion.createFormData("data[attributes][image]", new File(frame.getAbsoluteFilePath()).getName(), RequestBody.INSTANCE.create(new File(frame.getAbsoluteFilePath()), MediaType.INSTANCE.parse(frame.getMimeType()))));
            if (!autoClassifyWorker.extractTextFromImage || (strB = autoClassifyWorker.idFrontAnalyzer.b(frame.getAbsoluteFilePath())) == null) {
                return;
            }
            list.add(companion.createFormData("data[attributes][client_extracted_text]", strB));
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = AutoClassifyWorker.this.new d(continuation);
            dVar.f57499r = obj;
            return dVar;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:21:0x011f  */
        /* JADX WARN: Code duplicated, block: B:24:0x0129  */
        /* JADX WARN: Code duplicated, block: B:26:0x0136  */
        /* JADX WARN: Code duplicated, block: B:28:0x013a  */
        /* JADX WARN: Code duplicated, block: B:30:0x014e  */
        /* JADX WARN: Code duplicated, block: B:33:0x0167  */
        /* JADX WARN: Code duplicated, block: B:36:0x0184  */
        /* JADX WARN: Code duplicated, block: B:38:0x0188  */
        /* JADX WARN: Code duplicated, block: B:41:0x01ab  */
        /* JADX WARN: Code duplicated, block: B:43:0x01af  */
        /* JADX WARN: Code duplicated, block: B:46:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:48:0x01d9  */
        /* JADX WARN: Code duplicated, block: B:51:0x01f1  */
        /* JADX WARN: Code duplicated, block: B:53:0x01f7  */
        /* JADX WARN: Code duplicated, block: B:58:0x0214  */
        /* JADX WARN: Code duplicated, block: B:64:0x00b4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:65:0x022e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:0x009a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:68:0x009a A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x022c, code lost:
        
            if (r3.emit(r4, r10) == r0) goto L60;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 586
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super c> flowCollector, Continuation<? super h0> continuation) {
            return ((d) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public AutoClassifyWorker(String sessionToken, String inquiryId, String fromStep, String fromComponent, com.withpersona.sdk2.inquiry.governmentid.network.a service, d0 governmentId, gi0.a imageHelper, SupplementaryData supplementaryData, long j11, boolean z11) {
        s.k(sessionToken, "sessionToken");
        s.k(inquiryId, "inquiryId");
        s.k(fromStep, "fromStep");
        s.k(fromComponent, "fromComponent");
        s.k(service, "service");
        s.k(governmentId, "governmentId");
        s.k(imageHelper, "imageHelper");
        s.k(supplementaryData, "supplementaryData");
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.fromStep = fromStep;
        this.fromComponent = fromComponent;
        this.service = service;
        this.governmentId = governmentId;
        this.imageHelper = imageHelper;
        this.supplementaryData = supplementaryData;
        this.defaultManualCaptureDelayMs = j11;
        this.extractTextFromImage = z11;
        this.idFrontAnalyzer = new y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<IdConfigForCountry> n(List<AutoClassifyResponse.IdClassesForCountry> list) {
        List<AutoClassifyResponse.IdClassesForCountry> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (AutoClassifyResponse.IdClassesForCountry idClassesForCountry : list2) {
            String countryName = idClassesForCountry.getCountryName();
            String countryCode = idClassesForCountry.getCountryCode();
            List<Id> listB = idClassesForCountry.b();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                IdConfig idConfigO = z.o((Id) it.next(), idClassesForCountry.getCountryCode(), this.defaultManualCaptureDelayMs);
                if (idConfigO != null) {
                    arrayList2.add(idConfigO);
                }
            }
            arrayList.add(new IdConfigForCountry(countryName, countryCode, arrayList2));
        }
        return arrayList;
    }

    @Override // y20.o
    public boolean a(o<?> otherWorker) {
        s.k(otherWorker, "otherWorker");
        return (otherWorker instanceof AutoClassifyWorker) && s.f(this.sessionToken, ((AutoClassifyWorker) otherWorker).sessionToken);
    }

    @Override // y20.o
    public Flow<c> run() {
        return FlowKt.flowOn(FlowKt.flow(new d(null)), Dispatchers.getDefault());
    }
}
