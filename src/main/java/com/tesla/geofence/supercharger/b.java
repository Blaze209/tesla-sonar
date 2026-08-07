package com.tesla.geofence.supercharger;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.tesla.logging.g;
import j$.time.Instant;
import java.io.File;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.webrtc.WebrtcBuildVersion;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import sn0.h;
import sn0.r;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 52\u00020\u0001:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010&\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\tR\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00101\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00104\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/tesla/geofence/supercharger/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "Lcom/tesla/geofence/supercharger/c;", "p", "()Ljava/util/List;", "", "csvString", "q", "(Ljava/lang/String;)Ljava/util/List;", "urlString", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/tesla/geofence/supercharger/a;", "center", "", "radiusKm", "j", "(Lcom/tesla/geofence/supercharger/a;D)Ljava/util/List;", "", "trtId", "n", "(I)Lcom/tesla/geofence/supercharger/c;", "a", "Landroid/content/Context;", "Ljava/io/File;", "b", "Ljava/io/File;", "csvFile", "c", "metadataFile", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "lock", "e", "Ljava/util/List;", "k", "allSuperchargers", "", "o", "()Z", "isLoaded", "l", "()I", "count", "m", "()Ljava/lang/String;", "lastUpdated", "f", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final g f56285g = g.INSTANCE.a("LocalSuperchargerDB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile b f56286h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final File csvFile;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final File metadataFile;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private volatile List<NearbySupercharger> allSuperchargers;

    /* JADX INFO: renamed from: com.tesla.geofence.supercharger.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/tesla/geofence/supercharger/b$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/tesla/geofence/supercharger/b;", "a", "(Landroid/content/Context;)Lcom/tesla/geofence/supercharger/b;", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "CSV_FILENAME", "METADATA_FILENAME", "CSV_HEADER", "INSTANCE", "Lcom/tesla/geofence/supercharger/b;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Context context) {
            b bVar;
            s.k(context, "context");
            b bVar2 = b.f56286h;
            if (bVar2 != null) {
                return bVar2;
            }
            synchronized (this) {
                bVar = b.f56286h;
                if (bVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    s.j(applicationContext, "getApplicationContext(...)");
                    bVar = new b(applicationContext, null);
                    b.f56286h = bVar;
                }
            }
            return bVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.tesla.geofence.supercharger.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.geofence.supercharger.LocalSuperchargerDatabase$downloadAndStore$2", f = "LocalSuperchargerDatabase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1128b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56292n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f56293o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ b f56294p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1128b(String str, b bVar, Continuation<? super C1128b> continuation) {
            super(2, continuation);
            this.f56293o = str;
            this.f56294p = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C1128b(this.f56293o, this.f56294p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f56292n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                b.f56285g.j("Downloading supercharger database from: " + this.f56293o);
                String str = new String(r.e(new URL(this.f56293o)), p013kotlin.text.d.UTF_8);
                List listQ = this.f56294p.q(str);
                if (listQ.isEmpty()) {
                    throw new IllegalArgumentException("Downloaded CSV contains no valid superchargers");
                }
                h.q(this.f56294p.csvFile, str, null, 2, null);
                File file = this.f56294p.metadataFile;
                String string = Instant.now().toString();
                s.j(string, "toString(...)");
                h.q(file, string, null, 2, null);
                Object obj2 = this.f56294p.lock;
                b bVar = this.f56294p;
                synchronized (obj2) {
                    bVar.allSuperchargers = listQ;
                    h0 h0Var = h0.f84049a;
                }
                b.f56285g.j("Successfully stored " + listQ.size() + " superchargers to local database (" + str.length() + " bytes)");
                return h0.f84049a;
            } catch (Exception e11) {
                b.f56285g.d("Failed to download and store supercharger database", e11);
                throw e11;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C1128b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(((NearbySupercharger) t11).getDistanceKm(), ((NearbySupercharger) t12).getDistanceKm());
        }
    }

    public /* synthetic */ b(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final List<NearbySupercharger> k() {
        if (this.allSuperchargers == null) {
            synchronized (this.lock) {
                try {
                    if (this.allSuperchargers == null) {
                        this.allSuperchargers = p();
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.allSuperchargers;
    }

    private final List<NearbySupercharger> p() {
        if (!this.csvFile.exists()) {
            f56285g.j("No local supercharger database found");
            return v.m();
        }
        try {
            String strN = h.n(this.csvFile, null, 1, null);
            List<NearbySupercharger> listQ = q(strN);
            f56285g.j("Loaded " + listQ.size() + " superchargers from local database (" + strN.length() + " bytes)");
            return listQ;
        } catch (Exception e11) {
            f56285g.d("Failed to load or parse CSV data from file", e11);
            return v.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:69:0x017c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0189  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bd A[Catch: all -> 0x00e5, IllegalArgumentException -> 0x015e, NumberFormatException -> 0x0161, TRY_LEAVE, TryCatch #1 {all -> 0x00e5, blocks: (B:4:0x004b, B:5:0x004f, B:7:0x0055, B:8:0x005d, B:10:0x0096, B:12:0x00ab, B:14:0x00b3, B:29:0x00dc, B:50:0x0117, B:67:0x0167, B:79:0x01a5, B:80:0x01bd, B:58:0x0134, B:60:0x013f, B:98:0x0211, B:99:0x0234, B:38:0x00f3, B:55:0x0127, B:41:0x00fc, B:44:0x0105, B:47:0x010e, B:52:0x011e, B:56:0x012a, B:101:0x0263), top: B:113:0x004b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x01bd, please report this as an issue */
    public final List<NearbySupercharger> q(String csvString) {
        int i11;
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        String string;
        Boolean bool2;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        aq0.c cVar = new aq0.c(new StringReader(csvString), aq0.b.C0258b.u(aq0.b.f14862t).A(new String[0]).I(true).J(true).t());
        String str5 = "trt_id";
        String str6 = "lat";
        String str7 = "lng";
        String str8 = "tesla_only";
        List listP = v.p("trt_id", "lat", "lng", "tesla_only", "name");
        List<String> listC = cVar.C();
        if (!s.f(listC, listP)) {
            String strY0 = v.y0(listP, ",", null, null, 0, null, null, 62, null);
            s.h(listC);
            throw new IllegalArgumentException("Invalid CSV header. Expected '" + strY0 + "', got '" + v.y0(listC, ",", null, null, 0, null, null, 62, null) + "'");
        }
        try {
            Iterator<aq0.d> it = cVar.iterator();
            while (it.hasNext()) {
                int i13 = i12 + 1;
                aq0.d next = it.next();
                try {
                    String strA = next.a(str5);
                    s.j(strA, "get(...)");
                    int i14 = Integer.parseInt(p013kotlin.text.t.F1(strA).toString());
                    String strA2 = next.a(str6);
                    s.j(strA2, "get(...)");
                    double d11 = Double.parseDouble(p013kotlin.text.t.F1(strA2).toString());
                    String strA3 = next.a(str7);
                    s.j(strA3, "get(...)");
                    str = str5;
                    str2 = str6;
                    try {
                        double d12 = Double.parseDouble(p013kotlin.text.t.F1(strA3).toString());
                        String strA4 = next.a(str8);
                        s.j(strA4, "get(...)");
                        String string2 = p013kotlin.text.t.F1(strA4).toString();
                        i11 = i12;
                        try {
                            String lowerCase = string2.toLowerCase(Locale.ROOT);
                            str3 = str7;
                            try {
                                s.j(lowerCase, "toLowerCase(...)");
                                int iHashCode = lowerCase.hashCode();
                                try {
                                    if (iHashCode != 0) {
                                        str4 = str8;
                                        if (iHashCode == 3521) {
                                            if (!lowerCase.equals("no")) {
                                            }
                                            bool2 = Boolean.FALSE;
                                            it = it;
                                            bool = bool2;
                                        } else if (iHashCode == 119527) {
                                            if (!lowerCase.equals("yes")) {
                                            }
                                            bool2 = Boolean.TRUE;
                                            it = it;
                                            bool = bool2;
                                        } else if (iHashCode == 3569038) {
                                            if (!lowerCase.equals("true")) {
                                            }
                                            bool2 = Boolean.TRUE;
                                            it = it;
                                            bool = bool2;
                                        } else if (iHashCode == 97196323) {
                                            if (!lowerCase.equals("false")) {
                                            }
                                            bool2 = Boolean.FALSE;
                                            it = it;
                                            bool = bool2;
                                        } else if (iHashCode == 48) {
                                            if (!lowerCase.equals(WebrtcBuildVersion.maint_version)) {
                                            }
                                            bool2 = Boolean.FALSE;
                                            it = it;
                                            bool = bool2;
                                        } else if (iHashCode == 49) {
                                            try {
                                                if (!lowerCase.equals("1")) {
                                                }
                                                bool2 = Boolean.TRUE;
                                                it = it;
                                                bool = bool2;
                                            } catch (NumberFormatException e11) {
                                                e = e11;
                                                it = it;
                                                f56285g.n("Skipping row " + (i11 + 2) + " with invalid number format: " + e.getMessage());
                                                i12 = i13;
                                                str5 = str;
                                                str6 = str2;
                                                str7 = str3;
                                                str8 = str4;
                                                it = it;
                                            } catch (IllegalArgumentException e12) {
                                                e = e12;
                                                it = it;
                                                f56285g.n("Skipping row " + (i11 + 2) + " with missing columns: " + e.getMessage());
                                                i12 = i13;
                                                str5 = str;
                                                str6 = str2;
                                                str7 = str3;
                                                str8 = str4;
                                                it = it;
                                            }
                                        }
                                        String strA5 = next.a("name");
                                        s.j(strA5, "get(...)");
                                        string = p013kotlin.text.t.F1(strA5).toString();
                                        if (string.length() == 0) {
                                            string = "Supercharger";
                                        }
                                        String str9 = string;
                                        if (d11 >= -90.0d || d11 > 90.0d || d12 < -180.0d || d12 > 180.0d) {
                                            f56285g.n("Skipping invalid coordinates at row " + (i11 + 2) + ": lat=" + d11 + ", lng=" + d12);
                                        } else {
                                            arrayList.add(new NearbySupercharger(i14, new Coordinates(d11, d12), str9, null, bool, 8, null));
                                        }
                                        i12 = i13;
                                        str5 = str;
                                        str6 = str2;
                                        str7 = str3;
                                        str8 = str4;
                                        it = it;
                                    } else {
                                        str4 = str8;
                                        if (!lowerCase.equals("")) {
                                        }
                                        bool = null;
                                        String strA6 = next.a("name");
                                        s.j(strA6, "get(...)");
                                        string = p013kotlin.text.t.F1(strA6).toString();
                                        if (string.length() == 0) {
                                            string = "Supercharger";
                                        }
                                        String str10 = string;
                                        if (d11 >= -90.0d) {
                                            f56285g.n("Skipping invalid coordinates at row " + (i11 + 2) + ": lat=" + d11 + ", lng=" + d12);
                                        } else {
                                            f56285g.n("Skipping invalid coordinates at row " + (i11 + 2) + ": lat=" + d11 + ", lng=" + d12);
                                        }
                                        i12 = i13;
                                        str5 = str;
                                        str6 = str2;
                                        str7 = str3;
                                        str8 = str4;
                                        it = it;
                                    }
                                    String strA7 = next.a("name");
                                    s.j(strA7, "get(...)");
                                    string = p013kotlin.text.t.F1(strA7).toString();
                                    if (string.length() == 0) {
                                        string = "Supercharger";
                                    }
                                    String str11 = string;
                                    if (d11 >= -90.0d) {
                                        f56285g.n("Skipping invalid coordinates at row " + (i11 + 2) + ": lat=" + d11 + ", lng=" + d12);
                                    } else {
                                        f56285g.n("Skipping invalid coordinates at row " + (i11 + 2) + ": lat=" + d11 + ", lng=" + d12);
                                    }
                                } catch (NumberFormatException e13) {
                                    e = e13;
                                    f56285g.n("Skipping row " + (i11 + 2) + " with invalid number format: " + e.getMessage());
                                } catch (IllegalArgumentException e14) {
                                    e = e14;
                                    f56285g.n("Skipping row " + (i11 + 2) + " with missing columns: " + e.getMessage());
                                }
                                g gVar = f56285g;
                                int i15 = i11 + 2;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Invalid tesla_only value '");
                                sb2.append(string2);
                                sb2.append("' at row ");
                                sb2.append(i15);
                                sb2.append(", treating as null");
                                gVar.n(sb2.toString());
                                bool = null;
                            } catch (NumberFormatException e15) {
                                e = e15;
                                str4 = str8;
                                it = it;
                                f56285g.n("Skipping row " + (i11 + 2) + " with invalid number format: " + e.getMessage());
                                i12 = i13;
                                str5 = str;
                                str6 = str2;
                                str7 = str3;
                                str8 = str4;
                                it = it;
                            } catch (IllegalArgumentException e16) {
                                e = e16;
                                str4 = str8;
                                it = it;
                                f56285g.n("Skipping row " + (i11 + 2) + " with missing columns: " + e.getMessage());
                                i12 = i13;
                                str5 = str;
                                str6 = str2;
                                str7 = str3;
                                str8 = str4;
                                it = it;
                            }
                        } catch (NumberFormatException e17) {
                            e = e17;
                            str3 = str7;
                            str4 = str8;
                            it = it;
                            f56285g.n("Skipping row " + (i11 + 2) + " with invalid number format: " + e.getMessage());
                            i12 = i13;
                            str5 = str;
                            str6 = str2;
                            str7 = str3;
                            str8 = str4;
                            it = it;
                        } catch (IllegalArgumentException e18) {
                            e = e18;
                            str3 = str7;
                            str4 = str8;
                            it = it;
                            f56285g.n("Skipping row " + (i11 + 2) + " with missing columns: " + e.getMessage());
                            i12 = i13;
                            str5 = str;
                            str6 = str2;
                            str7 = str3;
                            str8 = str4;
                            it = it;
                        }
                    } catch (NumberFormatException e19) {
                        e = e19;
                        i11 = i12;
                    } catch (IllegalArgumentException e21) {
                        e = e21;
                        i11 = i12;
                    }
                } catch (NumberFormatException e22) {
                    e = e22;
                    i11 = i12;
                    str = str5;
                    str2 = str6;
                } catch (IllegalArgumentException e23) {
                    e = e23;
                    i11 = i12;
                    str = str5;
                    str2 = str6;
                }
                i12 = i13;
                str5 = str;
                str6 = str2;
                str7 = str3;
                str8 = str4;
                it = it;
            }
            h0 h0Var = h0.f84049a;
            sn0.b.a(cVar, null);
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("No valid supercharger entries found in CSV");
            }
            return arrayList;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(cVar, th2);
                throw th3;
            }
        }
    }

    public final Object i(String str, Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C1128b(str, this, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    public final List<NearbySupercharger> j(Coordinates center, double radiusKm) {
        s.k(center, "center");
        if (!o()) {
            f56285g.n("Database not loaded, returning empty list");
            return v.m();
        }
        List<NearbySupercharger> listK = k();
        if (listK == null) {
            listK = v.m();
        }
        List<NearbySupercharger> list = listK;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((NearbySupercharger) it.next()).h(center));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Double distanceKm = ((NearbySupercharger) obj).getDistanceKm();
            s.h(distanceKm);
            if (distanceKm.doubleValue() <= radiusKm) {
                arrayList2.add(obj);
            }
        }
        return v.a1(arrayList2, new c());
    }

    public final int l() {
        List<NearbySupercharger> listK = k();
        if (listK != null) {
            return listK.size();
        }
        return 0;
    }

    public final String m() {
        if (!this.metadataFile.exists()) {
            return null;
        }
        try {
            return p013kotlin.text.t.F1(h.n(this.metadataFile, null, 1, null)).toString();
        } catch (Exception e11) {
            f56285g.d("Failed to read metadata file", e11);
            return null;
        }
    }

    public final NearbySupercharger n(int trtId) {
        List<NearbySupercharger> listK = k();
        Object obj = null;
        if (listK == null) {
            return null;
        }
        for (Object obj2 : listK) {
            if (((NearbySupercharger) obj2).getTrtId() == trtId) {
                obj = obj2;
                break;
            }
        }
        return (NearbySupercharger) obj;
    }

    public final boolean o() {
        List<NearbySupercharger> listK = k();
        if (listK != null) {
            return !listK.isEmpty();
        }
        return false;
    }

    private b(Context context) {
        this.context = context;
        this.csvFile = new File(context.getFilesDir(), "supercharger_locations.csv");
        this.metadataFile = new File(context.getFilesDir(), "supercharger_locations_metadata.txt");
        this.lock = new Object();
    }
}
