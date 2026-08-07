package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.encoders.EncodingException;
import ezvcard.property.Kind;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import oq.n;
import oq.o;
import oq.p;
import oq.q;
import oq.r;
import oq.s;
import oq.t;
import oq.u;
import oq.v;
import oq.w;
import oq.x;
import pq.h;
import pq.i;
import qq.f;
import qq.g;
import qq.m;

/* JADX INFO: loaded from: classes4.dex */
final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rv.a f39361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f39362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f39363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final URL f39364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zq.a f39365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zq.a f39366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f39367g;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final URL f39368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final n f39369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f39370c;

        a(URL url, n nVar, String str) {
            this.f39368a = url;
            this.f39369b = nVar;
            this.f39370c = str;
        }

        a a(URL url) {
            return new a(url, this.f39369b, this.f39370c);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f39371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final URL f39372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f39373c;

        b(int i11, URL url, long j11) {
            this.f39371a = i11;
            this.f39372b = url;
            this.f39373c = j11;
        }
    }

    d(Context context, zq.a aVar, zq.a aVar2, int i11) {
        this.f39361a = n.b();
        this.f39363c = context;
        this.f39362b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f39364d = n(com.google.android.datatransport.cct.a.f39352c);
        this.f39365e = aVar2;
        this.f39366f = aVar;
        this.f39367g = i11;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.f39372b;
        if (url == null) {
            return null;
        }
        tq.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f39372b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        tq.a.f("CctTransportBackend", "Making request to: %s", aVar.f39368a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f39368a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f39367g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f39370c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f39361a.a(aVar.f39369b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    tq.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    tq.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    tq.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, v.b(new BufferedReader(new InputStreamReader(inputStreamM))).c());
                            if (inputStreamM != null) {
                                inputStreamM.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th2) {
                            if (inputStreamM != null) {
                                try {
                                    inputStreamM.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                }
                throw th8;
            }
        } catch (EncodingException e11) {
            e = e11;
            tq.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e12) {
            e = e12;
            tq.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e13) {
            e = e13;
            tq.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e14) {
            e = e14;
            tq.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.b.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return w.b.COMBINED.getValue();
        }
        if (w.b.forNumber(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? w.c.NONE.getValue() : networkInfo.getType();
    }

    private static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e11) {
            tq.a.d("CctTransportBackend", "Unable to find version code for package", e11);
            return -1;
        }
    }

    private n j(f fVar) {
        t.a aVarL;
        HashMap map = new HashMap();
        for (i iVar : fVar.b()) {
            String strN = iVar.n();
            if (map.containsKey(strN)) {
                ((List) map.get(strN)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                map.put(strN, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            u.a aVarB = u.a().f(x.DEFAULT).g(this.f39366f.a()).h(this.f39365e.a()).b(o.a().c(o.b.ANDROID_FIREBASE).b(oq.a.a().m(Integer.valueOf(iVar2.i("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b(Kind.DEVICE)).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b(PlaceTypes.COUNTRY)).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h hVarE = iVar3.e();
                nq.c cVarB = hVarE.b();
                if (cVarB.equals(nq.c.b("proto"))) {
                    aVarL = t.l(hVarE.a());
                } else if (cVarB.equals(nq.c.b("json"))) {
                    aVarL = t.k(new String(hVarE.a(), Charset.forName("UTF-8")));
                } else {
                    tq.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", cVarB);
                }
                aVarL.d(iVar3.f()).e(iVar3.o()).j(iVar3.j("tz-offset")).g(w.a().c(w.c.forNumber(iVar3.i("net-type"))).b(w.b.forNumber(iVar3.i("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVarL.c(iVar3.d());
                }
                if (iVar3.l() != null) {
                    aVarL.b(p.a().b(s.a().b(r.a().b(iVar3.l()).a()).a()).c(p.b.EVENT_OVERRIDE).a());
                }
                if (iVar3.g() != null || iVar3.h() != null) {
                    q.a aVarA = q.a();
                    if (iVar3.g() != null) {
                        aVarA.b(iVar3.g());
                    }
                    if (iVar3.h() != null) {
                        aVarA.c(iVar3.h());
                    }
                    aVarL.f(aVarA.a());
                }
                arrayList3.add(aVarL.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return n.a(arrayList2);
    }

    private static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    private static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e11) {
            throw new IllegalArgumentException("Invalid url: " + str, e11);
        }
    }

    @Override // qq.m
    public g a(f fVar) {
        n nVarJ = j(fVar);
        URL urlN = this.f39364d;
        String strD = null;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a aVarC = com.google.android.datatransport.cct.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlN = n(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) uq.b.a(5, new a(urlN, nVarJ, strD), new uq.a() { // from class: com.google.android.datatransport.cct.b
                @Override // uq.a
                public final Object apply(Object obj) {
                    return this.f39360a.e((d.a) obj);
                }
            }, new uq.c() { // from class: com.google.android.datatransport.cct.c
                @Override // uq.c
                public final Object a(Object obj, Object obj2) {
                    return d.d((d.a) obj, (d.b) obj2);
                }
            });
            int i11 = bVar.f39371a;
            if (i11 == 200) {
                return g.e(bVar.f39373c);
            }
            if (i11 < 500 && i11 != 404) {
                return i11 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e11) {
            tq.a.d("CctTransportBackend", "Could not make request to the backend", e11);
            return g.f();
        }
    }

    @Override // qq.m
    public i b(i iVar) {
        NetworkInfo activeNetworkInfo = this.f39362b.getActiveNetworkInfo();
        return iVar.p().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c(Kind.DEVICE, Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c(PlaceTypes.COUNTRY, Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.f39363c)).c("application_build", Integer.toString(i(this.f39363c))).d();
    }

    d(Context context, zq.a aVar, zq.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
