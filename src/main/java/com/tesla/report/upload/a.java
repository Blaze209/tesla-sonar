package com.tesla.report.upload;

import android.content.Context;
import android.net.Uri;
import cc0.f;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.squareup.moshi.h;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.tesla.oapi.OwnerApiEndpoint;
import com.tesla.oapi.OwnerApiEndpoints;
import com.tesla.oapi.OwnerApiStatusCode;
import com.tesla.oapi.OwnerResponse;
import com.tesla.oapi.SendOwnerRequest;
import com.tesla.report.model.PresignedUrlResponse;
import com.tesla.report.model.Response;
import ie0.q;
import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.y;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.m;
import jn0.x;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import yd0.UploadException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/tesla/report/upload/a;", "", "Lcom/tesla/oapi/OwnerApiEndpoints;", "ownerApiEndpoints", "Lcom/tesla/oapi/SendOwnerRequest;", "sendOwnerRequest", "Lpa0/d;", "analyticsService", "<init>", "(Lcom/tesla/oapi/OwnerApiEndpoints;Lcom/tesla/oapi/SendOwnerRequest;Lpa0/d;)V", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "", "Lcc0/f;", "analyticsParameters", "Lio/reactivex/rxjava3/core/u;", "", "j", "(Ljava/io/File;Ljava/util/List;)Lio/reactivex/rxjava3/core/u;", "k", "g", "a", "Lcom/tesla/oapi/OwnerApiEndpoints;", "b", "Lcom/tesla/oapi/SendOwnerRequest;", "c", "Lpa0/d;", DateTokenConverter.CONVERTER_KEY, "report_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g f56540e = g.INSTANCE.a("UploadReport");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Lazy<h<PresignedUrlResponse>> f56541f = m.b(new wn0.a() { // from class: zd0.a
        @Override // wn0.a
        public final Object invoke() {
            return com.tesla.report.upload.a.i();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OwnerApiEndpoints ownerApiEndpoints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SendOwnerRequest sendOwnerRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final pa0.d analyticsService;

    /* JADX INFO: renamed from: com.tesla.report.upload.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/tesla/report/upload/a$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/tesla/report/upload/a;", "c", "(Landroid/content/Context;)Lcom/tesla/report/upload/a;", "Lcom/squareup/moshi/h;", "Lcom/tesla/report/model/PresignedUrlResponse;", "presignedUrlResponseAdapter$delegate", "Lkotlin/Lazy;", "b", "()Lcom/squareup/moshi/h;", "presignedUrlResponseAdapter", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "report_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h<PresignedUrlResponse> b() {
            Object value = a.f56541f.getValue();
            s.j(value, "getValue(...)");
            return (h) value;
        }

        public final a c(Context context) {
            s.k(context, "context");
            Context applicationContext = context.getApplicationContext();
            OwnerApiEndpoints.Companion companion = OwnerApiEndpoints.INSTANCE;
            s.h(applicationContext);
            return new a(companion.getInstance(applicationContext), SendOwnerRequest.INSTANCE.newInstance(applicationContext), pa0.c.c());
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T, R> implements cm0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f56545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f56546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f56547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<f> f56548d;

        b(String str, File file, a aVar, List<f> list) {
            this.f56545a = str;
            this.f56546b = file;
            this.f56547c = aVar;
            this.f56548d = list;
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(OwnerResponse response) {
            boolean z11;
            s.k(response, "response");
            if (response.isSuccessful()) {
                a.f56540e.j("Successfully uploaded: " + this.f56545a);
                this.f56546b.delete();
                a.f56540e.j("Deleted: " + this.f56545a);
                z11 = true;
            } else {
                a.f56540e.j("Failed to upload: " + this.f56545a);
                this.f56547c.analyticsService.b(cc0.d.REPORT_UPLOAD_ATTEMPTED, v.P0(v.p(qa0.a.b(), qa0.a.d(response.getCode())), this.f56548d));
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<T, R> implements cm0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f56549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f56550b;

        c(File file, a aVar) {
            this.f56549a = file;
            this.f56550b = aVar;
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y<? extends OwnerResponse> apply(OwnerResponse presignedUrlResponse) throws UploadException {
            Response response;
            List<Map<String, String>> presignedInfoList;
            Map map;
            s.k(presignedUrlResponse, "presignedUrlResponse");
            if (presignedUrlResponse.isSuccessful()) {
                PresignedUrlResponse presignedUrlResponse2 = (PresignedUrlResponse) a.INSTANCE.b().fromJson(String.valueOf(presignedUrlResponse.getResponse()));
                if (presignedUrlResponse2 == null || (response = presignedUrlResponse2.getResponse()) == null || (presignedInfoList = response.getPresignedInfoList()) == null || (map = (Map) v.o0(presignedInfoList)) == null) {
                    throw new UploadException(null, "Failed to parse s3 presigned payload", 1, null);
                }
                String origin = presignedUrlResponse2.getResponse().getOrigin();
                if (origin == null) {
                    throw new UploadException(null, "No origin found in presigned response", 1, null);
                }
                Set<Map.Entry> setEntrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : setEntrySet) {
                    arrayList.add(MultipartBody.Part.INSTANCE.createFormData((String) entry.getKey(), (String) entry.getValue()));
                }
                arrayList.add(MultipartBody.Part.INSTANCE.createFormData(Action.FILE_ATTRIBUTE, this.f56549a.getName(), RequestBody.INSTANCE.create(this.f56549a, MediaType.INSTANCE.get("application/zip"))));
                return SendOwnerRequest.DefaultImpls.upload$default(this.f56550b.sendOwnerRequest, origin, null, arrayList, null, null, null, false, false, 186, null);
            }
            g gVar = a.f56540e;
            String str = "Failed to generate presigned url " + presignedUrlResponse.getStatusCode();
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry2 : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            throw new UploadException(presignedUrlResponse.getStatusCode(), "Failed to generate presigned url");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d<T, R> implements cm0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f56551a;

        d(File file) {
            this.f56551a = file;
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(OwnerResponse uploadResponse) throws UploadException {
            s.k(uploadResponse, "uploadResponse");
            a.f56540e.j("uploadResponse " + uploadResponse + " " + uploadResponse.isSuccessful());
            if (!uploadResponse.isSuccessful()) {
                throw new UploadException(uploadResponse.getStatusCode(), "Failed to upload to s3");
            }
            this.f56551a.delete();
            return Boolean.TRUE;
        }
    }

    public a(OwnerApiEndpoints ownerApiEndpoints, SendOwnerRequest sendOwnerRequest, pa0.d analyticsService) {
        s.k(ownerApiEndpoints, "ownerApiEndpoints");
        s.k(sendOwnerRequest, "sendOwnerRequest");
        s.k(analyticsService, "analyticsService");
        this.ownerApiEndpoints = ownerApiEndpoints;
        this.sendOwnerRequest = sendOwnerRequest;
        this.analyticsService = analyticsService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ u h(a aVar, File file, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = v.m();
        }
        return aVar.g(file, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h i() {
        return new com.squareup.moshi.u.b().d().c(PresignedUrlResponse.class);
    }

    private final u<Boolean> j(File file, List<f> analyticsParameters) {
        OwnerApiEndpoint endpoint = this.ownerApiEndpoints.getEndpoint("APP_FEEDBACK_LOGS");
        if (endpoint != null) {
            String name = file.getName();
            f56540e.j("Uploading report file: " + name);
            u<Boolean> uVarN = SendOwnerRequest.DefaultImpls.execute$default(this.sendOwnerRequest, endpoint.getMethod(), endpoint.getUri(), (Map) null, sn0.h.n(file, null, 1, null), (Map) null, (Map) null, (Integer) null, false, false, 500, (Object) null).n(new b(name, file, this, analyticsParameters));
            s.j(uVarN, "map(...)");
            return uVarN;
        }
        g gVar = f56540e;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g("Failed to get report endpoint");
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = v0.f(x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
        throw new IllegalStateException("Failed to get report endpoint");
    }

    private final u<Boolean> k(File file, final List<f> analyticsParameters) {
        OwnerApiEndpoint endpoint = this.ownerApiEndpoints.getEndpoint("APP_FEEDBACK_REPORT_PRESIGN");
        g gVar = f56540e;
        gVar.j("upload to s3 " + Uri.fromFile(file));
        if (endpoint == null) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("Failed to get report endpoint");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            throw new IllegalStateException("Failed to get report endpoint");
        }
        String strB = q.b(file);
        if (strB != null) {
            u<Boolean> uVarQ = SendOwnerRequest.DefaultImpls.execute$default(this.sendOwnerRequest, endpoint.getMethod(), endpoint.getUri(), v0.m(x.a("report_id", strB), x.a("files[]", file.getName())), null, false, false, 56, null).j(new c(file, this)).n(new d(file)).q(new cm0.h() { // from class: zd0.b
                @Override // cm0.h
                public final Object apply(Object obj) {
                    return com.tesla.report.upload.a.l(this.f128084a, analyticsParameters, (Throwable) obj);
                }
            });
            s.j(uVarQ, "onErrorReturn(...)");
            return uVarQ;
        }
        String str = "Cannot parse reportId from file name " + file.getName();
        TeslaLog teslaLog2 = TeslaLog.INSTANCE;
        String tag2 = gVar.getTag();
        String strG2 = gVar.g(str);
        zb0.a aVar2 = zb0.a.f128044a;
        Map mapF2 = v0.f(x.a(tag2, strG2));
        FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry2 : mapF2.entrySet()) {
            zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
        }
        firebaseCrashlytics2.recordException(new Exception(strG2));
        TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
        vr0.a.INSTANCE.a(strG2, new Object[0]);
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean l(a aVar, List list, Throwable error) {
        s.k(error, "error");
        if (error instanceof UploadException) {
            pa0.d dVar = aVar.analyticsService;
            cc0.d dVar2 = cc0.d.REPORT_UPLOAD_ATTEMPTED;
            f fVarB = qa0.a.b();
            UploadException uploadException = (UploadException) error;
            OwnerApiStatusCode statusCode = uploadException.getStatusCode();
            f fVarD = statusCode != null ? qa0.a.d(statusCode.getCode()) : null;
            String message = uploadException.getMessage();
            dVar.b(dVar2, v.P0(v.r(fVarB, fVarD, message != null ? qa0.a.a(message) : null), list));
        } else {
            pa0.d dVar3 = aVar.analyticsService;
            cc0.d dVar4 = cc0.d.REPORT_UPLOAD_ATTEMPTED;
            f fVarB2 = qa0.a.b();
            String message2 = error.getMessage();
            dVar3.b(dVar4, v.P0(v.r(fVarB2, message2 != null ? qa0.a.a(message2) : null), list));
        }
        return Boolean.FALSE;
    }

    public final u<Boolean> g(File file, List<f> analyticsParameters) {
        s.k(file, "file");
        s.k(analyticsParameters, "analyticsParameters");
        return q.c(file) ? k(file, analyticsParameters) : j(file, analyticsParameters);
    }
}
