package com.facebook.react.devsupport;

import com.facebook.react.common.DebugServerException;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OkHttpClient f22386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Call f22387b;

    class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pn.b f22388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f22389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f22390c;

        a(pn.b bVar, File file, c cVar) {
            this.f22388a = bVar;
            this.f22389b = file;
            this.f22390c = cVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            if (b.this.f22387b == null || b.this.f22387b.getCanceled()) {
                b.this.f22387b = null;
                return;
            }
            b.this.f22387b = null;
            String url = call.request().url().getUrl();
            this.f22388a.onFailure(DebugServerException.b(url, "Could not connect to development server.", "URL: " + url, iOException));
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:? A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v17, types: [okhttp3.Response] */
        /* JADX WARN: Type inference failed for: r9v18, types: [okhttp3.Response] */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2, types: [okhttp3.Response] */
        /* JADX WARN: Type inference failed for: r9v20 */
        /* JADX WARN: Type inference failed for: r9v21 */
        /* JADX WARN: Type inference failed for: r9v22 */
        /* JADX WARN: Type inference failed for: r9v5, types: [okhttp3.Call] */
        /* JADX WARN: Type inference failed for: r9v6 */
        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws Throwable {
            ?? r11;
            Throwable th2;
            ?? r12;
            try {
                r11 = b.this.f22387b;
                try {
                    if (r11 == 0 || b.this.f22387b.getCanceled()) {
                        b.this.f22387b = null;
                        if (response != null) {
                            response.close();
                            return;
                        }
                        return;
                    }
                    b.this.f22387b = null;
                    String url = response.request().url().getUrl();
                    Matcher matcher = Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\"").matcher(response.header("content-type"));
                    if (matcher.find()) {
                        try {
                            b.this.i(url, response, matcher.group(1), this.f22389b, this.f22390c, this.f22388a);
                            r12 = response;
                        } catch (Throwable th3) {
                            th = th3;
                            r11 = response;
                            th2 = th;
                            if (r11 != 0) {
                                throw th2;
                            }
                            try {
                                r11.close();
                                throw th2;
                            } catch (Throwable th4) {
                                th2.addSuppressed(th4);
                                throw th2;
                            }
                        }
                    } else {
                        r11 = response;
                        ResponseBody responseBodyBody = r11.body();
                        try {
                            b.this.h(url, r11.code(), r11.headers(), r11.body().getSource(), this.f22389b, this.f22390c, this.f22388a);
                            r12 = r11;
                            if (responseBodyBody != null) {
                                responseBodyBody.close();
                                r12 = r11;
                            }
                        } catch (Throwable th5) {
                            if (responseBodyBody == null) {
                                throw th5;
                            }
                            try {
                                responseBodyBody.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    }
                    r12.close();
                } catch (Throwable th7) {
                    th = th7;
                    th2 = th;
                    if (r11 != 0) {
                        throw th2;
                    }
                    r11.close();
                    throw th2;
                }
            } catch (Throwable th8) {
                th = th8;
                r11 = response;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.b$b, reason: collision with other inner class name */
    class C0446b implements s0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Response f22392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f22394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f22395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ pn.b f22396e;

        C0446b(Response response, String str, File file, c cVar, pn.b bVar) {
            this.f22392a = response;
            this.f22393b = str;
            this.f22394c = file;
            this.f22395d = cVar;
            this.f22396e = bVar;
        }

        @Override // com.facebook.react.devsupport.s0.a
        public void a(Map<String, String> map, okio.h hVar, boolean z11) throws IOException {
            if (z11) {
                int iCode = this.f22392a.code();
                if (map.containsKey("X-Http-Status")) {
                    iCode = Integer.parseInt(map.get("X-Http-Status"));
                }
                b.this.h(this.f22393b, iCode, Headers.of(map), hVar, this.f22394c, this.f22395d, this.f22396e);
                return;
            }
            if (map.containsKey("Content-Type") && map.get("Content-Type").equals("application/json")) {
                try {
                    JSONObject jSONObject = new JSONObject(hVar.t1());
                    this.f22396e.a(jSONObject.has(PermissionsResponse.STATUS_KEY) ? jSONObject.getString(PermissionsResponse.STATUS_KEY) : "Bundling", jSONObject.has("done") ? Integer.valueOf(jSONObject.getInt("done")) : null, jSONObject.has("total") ? Integer.valueOf(jSONObject.getInt("total")) : null);
                } catch (JSONException e11) {
                    qk.a.m("ReactNative", "Error parsing progress JSON. " + e11.toString());
                }
            }
        }

        @Override // com.facebook.react.devsupport.s0.a
        public void b(Map<String, String> map, long j11, long j12) {
            if ("application/javascript".equals(map.get("Content-Type"))) {
                this.f22396e.a("Downloading", Integer.valueOf((int) (j11 / 1024)), Integer.valueOf((int) (j12 / 1024)));
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f22398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22399b;

        public String c() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ImagesContract.URL, this.f22398a);
                jSONObject.put("filesChangedCount", this.f22399b);
                return jSONObject.toString();
            } catch (JSONException e11) {
                qk.a.n("BundleDownloader", "Can't serialize bundle info: ", e11);
                return null;
            }
        }
    }

    public b(OkHttpClient okHttpClient) {
        this.f22386a = okHttpClient;
    }

    private static void g(String str, Headers headers, c cVar) {
        cVar.f22398a = str;
        String str2 = headers.get("X-Metro-Files-Changed-Count");
        if (str2 != null) {
            try {
                cVar.f22399b = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                cVar.f22399b = -2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str, int i11, Headers headers, okio.j jVar, File file, c cVar, pn.b bVar) throws IOException {
        if (i11 != 200) {
            String strT1 = jVar.t1();
            DebugServerException debugServerExceptionD = DebugServerException.d(str, strT1);
            if (debugServerExceptionD != null) {
                bVar.onFailure(debugServerExceptionD);
                return;
            }
            bVar.onFailure(new DebugServerException("The development server returned response error code: " + i11 + "\n\nURL: " + str + "\n\nBody:\n" + strT1));
            return;
        }
        if (cVar != null) {
            g(str, headers, cVar);
        }
        File file2 = new File(file.getPath() + ".tmp");
        if (!j(jVar, file2) || file2.renameTo(file)) {
            bVar.onSuccess();
            return;
        }
        throw new IOException("Couldn't rename " + file2 + " to " + file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str, Response response, String str2, File file, c cVar, pn.b bVar) {
        if (new s0(response.body().getSource(), str2).d(new C0446b(response, str, file, cVar, bVar))) {
            return;
        }
        bVar.onFailure(new DebugServerException("Error while reading multipart response.\n\nResponse code: " + response.code() + "\n\nURL: " + str.toString() + "\n\n"));
    }

    private static boolean j(okio.j jVar, File file) throws Throwable {
        okio.p0 p0VarG;
        try {
            p0VarG = okio.c0.g(file);
            try {
                jVar.D1(p0VarG);
                if (p0VarG == null) {
                    return true;
                }
                p0VarG.close();
                return true;
            } catch (Throwable th2) {
                th = th2;
                if (p0VarG != null) {
                    p0VarG.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            p0VarG = null;
        }
    }

    public void e(pn.b bVar, File file, String str, c cVar) {
        f(bVar, file, str, cVar, new Request.Builder());
    }

    public void f(pn.b bVar, File file, String str, c cVar, Request.Builder builder) {
        Call call = (Call) gn.a.c(this.f22386a.newCall(builder.url(str).addHeader("Accept", "multipart/mixed").build()));
        this.f22387b = call;
        FirebasePerfOkHttpClient.enqueue(call, new a(bVar, file, cVar));
    }
}
