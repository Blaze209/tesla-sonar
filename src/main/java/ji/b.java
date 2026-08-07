package ji;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.actions.SearchIntents;
import ii.a0;
import ii.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.h0;
import okio.k;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lji/b;", "Lji/h;", "", "serverUrl", "<init>", "(Ljava/lang/String;)V", "Lii/v$a;", "D", "Lii/f;", "apolloRequest", "Lji/g;", "a", "(Lii/f;)Lji/g;", "Ljava/lang/String;", "b", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serverUrl;

    /* JADX INFO: renamed from: ji.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\u00020\u0006\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010Ja\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u0017\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJU\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u0017\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJK\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0017\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J%\u0010$\u001a\u00020\u0006*\u00020\u00062\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0017¢\u0006\u0004\b$\u0010%JA\u0010'\u001a\u00020&\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b'\u0010(JK\u0010)\u001a\u00020&\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b)\u0010*J3\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+¢\u0006\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u00100R\u0014\u00103\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u00100R\u0014\u00104\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u00100¨\u00065"}, d2 = {"Lji/b$a;", "", "<init>", "()V", "Lii/v$a;", "D", "", "serverUrl", "Lii/v;", "operation", "Lii/k;", "customScalarAdapters", "", "sendApqExtensions", "sendDocument", "f", "(Ljava/lang/String;Lii/v;Lii/k;ZZ)Ljava/lang/String;", "Lmi/g;", "writer", SearchIntents.EXTRA_QUERY, "Lkotlin/Function1;", "Ljn0/h0;", "extensionsWriter", "", "Lii/a0;", "k", "(Lmi/g;Lii/v;Lii/k;Ljava/lang/String;Lwn0/l;)Ljava/util/Map;", "l", "(Lmi/g;Lii/v;Lii/k;ZLjava/lang/String;)Ljava/util/Map;", "id", "e", "(Ljava/lang/String;Z)Lwn0/l;", "autoPersistQueries", IntegerTokenConverter.CONVERTER_KEY, "(Lii/v;Lii/k;ZZ)Ljava/util/Map;", "parameters", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "Lji/c;", "h", "(Lii/v;Lii/k;ZLjava/lang/String;)Lji/c;", "g", "(Lii/v;Lii/k;Ljava/lang/String;Lwn0/l;)Lji/c;", "Lii/f;", "apolloRequest", "j", "(Lii/f;)Ljava/util/Map;", "HEADER_ACCEPT_NAME", "Ljava/lang/String;", "HEADER_ACCEPT_VALUE_DEFER", "HEADER_ACCEPT_VALUE_MULTIPART", "HEADER_APOLLO_OPERATION_ID", "HEADER_APOLLO_OPERATION_NAME", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: ji.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmi/g;", "Ljn0/h0;", "a", "(Lmi/g;)V"}, k = 3, mv = {1, 5, 1})
        static final class C1768a extends u implements l<mi.g, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f83780c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f83781d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1768a(boolean z11, String str) {
                super(1);
                this.f83780c = z11;
                this.f83781d = str;
            }

            public final void a(mi.g gVar) {
                s.k(gVar, "$this$null");
                if (this.f83780c) {
                    gVar.N("extensions");
                    String str = this.f83781d;
                    gVar.h();
                    gVar.N("persistedQuery");
                    gVar.h();
                    gVar.N("version").S1(1);
                    gVar.N("sha256Hash").w(str);
                    gVar.j();
                    gVar.j();
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(mi.g gVar) {
                a(gVar);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: ji.b$a$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"ji/b$a$b", "Lji/c;", "Lokio/i;", "bufferedSink", "Ljn0/h0;", "a", "(Lokio/i;)V", "", "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", CMSAttributeTableGenerator.CONTENT_TYPE, "", "b", "J", "getContentLength", "()J", "contentLength", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class C1769b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String contentType = "application/json";

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final long contentLength;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k f83784c;

            C1769b(k kVar) {
                this.f83784c = kVar;
                this.contentLength = kVar.D();
            }

            @Override // ji.c
            public void a(okio.i bufferedSink) {
                s.k(bufferedSink, "bufferedSink");
                bufferedSink.A1(this.f83784c);
            }

            @Override // ji.c
            public long getContentLength() {
                return this.contentLength;
            }

            @Override // ji.c
            public String getContentType() {
                return this.contentType;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final l<mi.g, h0> e(String id2, boolean sendApqExtensions) {
            return new C1768a(sendApqExtensions, id2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <D extends v.a> String f(String serverUrl, v<D> operation, ii.k customScalarAdapters, boolean sendApqExtensions, boolean sendDocument) {
            return d(serverUrl, i(operation, customScalarAdapters, sendApqExtensions, sendDocument));
        }

        private final <D extends v.a> Map<String, String> i(v<D> operation, ii.k customScalarAdapters, boolean autoPersistQueries, boolean sendDocument) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("operationName", operation.name());
            okio.h hVar = new okio.h();
            ni.a aVar = new ni.a(new mi.c(hVar, null));
            aVar.h();
            operation.a(aVar, customScalarAdapters);
            aVar.j();
            if (!aVar.o().isEmpty()) {
                throw new IllegalStateException("FileUpload and Http GET are not supported at the same time");
            }
            linkedHashMap.put("variables", hVar.t1());
            if (sendDocument) {
                linkedHashMap.put(SearchIntents.EXTRA_QUERY, operation.b());
            }
            if (autoPersistQueries) {
                okio.h hVar2 = new okio.h();
                mi.c cVar = new mi.c(hVar2, null);
                cVar.h();
                cVar.N("persistedQuery");
                cVar.h();
                cVar.N("version").S1(1);
                cVar.N("sha256Hash").w(operation.id());
                cVar.j();
                cVar.j();
                linkedHashMap.put("extensions", hVar2.t1());
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <D extends v.a> Map<String, a0> k(mi.g writer, v<D> operation, ii.k customScalarAdapters, String query, l<? super mi.g, h0> extensionsWriter) {
            writer.h();
            writer.N("operationName");
            writer.w(operation.name());
            writer.N("variables");
            ni.a aVar = new ni.a(writer);
            aVar.h();
            operation.a(aVar, customScalarAdapters);
            aVar.j();
            Map<String, a0> mapO = aVar.o();
            if (query != null) {
                writer.N(SearchIntents.EXTRA_QUERY);
                writer.w(query);
            }
            extensionsWriter.invoke(writer);
            writer.j();
            return mapO;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <D extends v.a> Map<String, a0> l(mi.g writer, v<D> operation, ii.k customScalarAdapters, boolean sendApqExtensions, String query) {
            return k(writer, operation, customScalarAdapters, query, e(operation.id(), sendApqExtensions));
        }

        public final String d(String str, Map<String, String> parameters) {
            s.k(str, "<this>");
            s.k(parameters, "parameters");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            boolean zH0 = t.h0(str, CallerData.NA, false, 2, null);
            Iterator<T> it = parameters.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (zH0) {
                    sb2.append('&');
                } else {
                    sb2.append('?');
                    zH0 = true;
                }
                sb2.append(ki.a.b((String) entry.getKey()));
                sb2.append('=');
                sb2.append(ki.a.b((String) entry.getValue()));
            }
            String string = sb2.toString();
            s.j(string, "toString(...)");
            return string;
        }

        public final <D extends v.a> c g(v<D> operation, ii.k customScalarAdapters, String query, l<? super mi.g, h0> extensionsWriter) {
            s.k(operation, "operation");
            s.k(customScalarAdapters, "customScalarAdapters");
            s.k(extensionsWriter, "extensionsWriter");
            okio.h hVar = new okio.h();
            Map mapK = b.INSTANCE.k(new mi.c(hVar, null), operation, customScalarAdapters, query, extensionsWriter);
            k kVarM1 = hVar.m1();
            return mapK.isEmpty() ? new C1769b(kVarM1) : new j(mapK, kVarM1);
        }

        @jn0.e
        public final <D extends v.a> c h(v<D> operation, ii.k customScalarAdapters, boolean autoPersistQueries, String query) {
            s.k(operation, "operation");
            s.k(customScalarAdapters, "customScalarAdapters");
            return g(operation, customScalarAdapters, query, e(operation.id(), autoPersistQueries));
        }

        public final <D extends v.a> Map<String, Object> j(ii.f<D> apolloRequest) {
            s.k(apolloRequest, "apolloRequest");
            v<D> vVarF = apolloRequest.f();
            Boolean sendApqExtensions = apolloRequest.getSendApqExtensions();
            boolean zBooleanValue = sendApqExtensions != null ? sendApqExtensions.booleanValue() : false;
            Boolean sendDocument = apolloRequest.getSendDocument();
            boolean zBooleanValue2 = sendDocument != null ? sendDocument.booleanValue() : true;
            ii.k kVar = (ii.k) apolloRequest.getExecutionContext().a(ii.k.INSTANCE);
            if (kVar == null) {
                throw new IllegalStateException("Cannot find a ResponseAdapterCache");
            }
            String strB = zBooleanValue2 ? vVarF.b() : null;
            mi.i iVar = new mi.i();
            b.INSTANCE.l(iVar, vVarF, kVar, zBooleanValue, strB);
            Object objO = iVar.o();
            s.i(objO, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            return (Map) objO;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: ji.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class C1770b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83785a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.Get.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.Post.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f83785a = iArr;
        }
    }

    public b(String serverUrl) {
        s.k(serverUrl, "serverUrl");
        this.serverUrl = serverUrl;
    }

    @Override // ji.h
    public <D extends v.a> g a(ii.f<D> apolloRequest) {
        s.k(apolloRequest, "apolloRequest");
        v<D> vVarF = apolloRequest.f();
        ii.k kVar = (ii.k) apolloRequest.getExecutionContext().a(ii.k.INSTANCE);
        if (kVar == null) {
            kVar = ii.k.f78142g;
        }
        ii.k kVar2 = kVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HttpHeader("X-APOLLO-OPERATION-ID", vVarF.id()));
        arrayList.add(new HttpHeader("X-APOLLO-OPERATION-NAME", vVarF.name()));
        apolloRequest.f();
        arrayList.add(new HttpHeader("Accept", "multipart/mixed; deferSpec=20220824, application/json"));
        if (apolloRequest.d() != null) {
            arrayList.addAll(apolloRequest.d());
        }
        Boolean sendApqExtensions = apolloRequest.getSendApqExtensions();
        boolean zBooleanValue = sendApqExtensions != null ? sendApqExtensions.booleanValue() : false;
        Boolean sendDocument = apolloRequest.getSendDocument();
        boolean zBooleanValue2 = sendDocument != null ? sendDocument.booleanValue() : true;
        f httpMethod = apolloRequest.getHttpMethod();
        if (httpMethod == null) {
            httpMethod = f.Post;
        }
        int i11 = C1770b.f83785a[httpMethod.ordinal()];
        if (i11 == 1) {
            return new g.a(f.Get, INSTANCE.f(this.serverUrl, vVarF, kVar2, zBooleanValue, zBooleanValue2)).b(arrayList).d();
        }
        if (i11 == 2) {
            return new g.a(f.Post, this.serverUrl).b(arrayList).c(INSTANCE.h(vVarF, kVar2, zBooleanValue, zBooleanValue2 ? vVarF.b() : null)).d();
        }
        throw new NoWhenBranchMatchedException();
    }
}
