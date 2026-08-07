package rh;

import android.text.TextUtils;
import di.e;
import di.f;
import di.g;
import di.p;
import di.q;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ai.a f108237b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108236a = "LocalWebPayManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f108238c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f108239d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f108240e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f108241f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f108242g = WebrtcBuildVersion.maint_version;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, String> f108243h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public rh.a f108244i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f108245j = false;

    /* JADX INFO: renamed from: rh.b$b, reason: collision with other inner class name */
    public class RunnableC2299b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rh.a f108248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ th.a.InterfaceC2419a f108249b;

        public RunnableC2299b(rh.a aVar, th.a.InterfaceC2419a interfaceC2419a) {
            this.f108248a = aVar;
            this.f108249b = interfaceC2419a;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = b.this.f108241f;
            File file = new File(str);
            if (file.exists()) {
                e.b(str);
            }
            file.mkdir();
            th.a.a(this.f108248a.b(), b.this.f108241f + "/downloading.zip", this.f108249b);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f108251a = new b();
    }

    public static b m() {
        return c.f108251a;
    }

    public final String a(String str) {
        int iIndexOf;
        return (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(63)) == -1) ? str : str.substring(0, iIndexOf);
    }

    public void c() {
        g.h("LocalWebPayManager", "checkAndUpdateLocalData isDownloading=" + this.f108245j);
        rh.a aVar = this.f108244i;
        if (aVar == null || this.f108245j || (!(TextUtils.equals(aVar.c(), rh.a.C2298a.f108233a) || TextUtils.equals(aVar.c(), rh.a.C2298a.f108234b)) || TextUtils.isEmpty(aVar.b()))) {
            g.h("LocalWebPayManager", "checkAndUpdateLocalData return");
        } else {
            this.f108245j = true;
            new Thread(new RunnableC2299b(aVar, new a(aVar))).start();
        }
    }

    public void d(ai.a aVar) {
        if (this.f108237b != null) {
            g.g("mspl", "LocalWebPayManager.init mBizContext not null");
            hh.a.g(aVar, "biz", "LocalWebPayManager.init", "mBizContext not null");
            l();
        }
        this.f108237b = aVar;
        String absolutePath = aVar.h().getFilesDir().getAbsolutePath();
        this.f108238c = absolutePath + "/localWebPay";
        this.f108239d = absolutePath + "/localWebPay/localWebFiles";
        this.f108240e = absolutePath + "/localWebPay/localWebFiles/sdkConfig.json";
        this.f108241f = absolutePath + "/localWebPay/localWebPayDownloadingFiles";
        this.f108243h = new HashMap();
        boolean zJ = j();
        g.f("mspl", "LocalWebPayManager init checkConfigFile=" + zJ);
        if (zJ) {
            o();
        }
    }

    public void e(rh.a aVar) {
        g.h("LocalWebPayManager", "h5LocalData :" + aVar);
        this.f108244i = aVar;
    }

    public String h(String str) {
        String str2;
        if (k()) {
            String strA = a(str);
            if (TextUtils.isEmpty(this.f108243h.get(strA))) {
                g.i("LocalWebPayManager", "getLocalFilePath get null, url：" + str);
                str2 = "";
            } else {
                str2 = this.f108239d + "/" + this.f108243h.get(strA);
            }
        } else {
            str2 = "";
        }
        g.f("LocalWebPayManager", "getLocalFilePath result:" + str2);
        return str2;
    }

    public final void i(rh.a aVar) {
        if (aVar == null) {
            return;
        }
        g.i("LocalWebPayManager", "unzipAndCheckSHA256 dataSHA256:" + aVar.a());
        try {
            File[] fileArrListFiles = new File(this.f108241f).listFiles();
            File file = null;
            for (int i11 = 0; i11 < fileArrListFiles.length; i11++) {
                if (fileArrListFiles[i11].getName().endsWith(".zip")) {
                    file = fileArrListFiles[i11];
                }
            }
            String strN = p.n(file);
            g.i("LocalWebPayManager", "unzipAndCheckSHA256 fileSha256:" + strN);
            if (TextUtils.equals(strN, aVar.a())) {
                g.i("LocalWebPayManager", "unzipAndCheckSHA256 unzip");
                q.a(file.getAbsolutePath(), this.f108241f);
                File file2 = new File(this.f108239d);
                File file3 = new File(this.f108241f);
                if (file2.exists()) {
                    e.b(this.f108239d);
                }
                g.i("LocalWebPayManager", "unzipAndCheckSHA256 resultReNameTo:" + file3.renameTo(file2));
            }
        } catch (Throwable th2) {
            g.d(th2);
            hh.a.c(this.f108237b, "biz", "LocalWebPayManager.unzipAndCheckSHA256Error", th2);
        }
    }

    public final boolean j() {
        File file = new File(this.f108238c);
        try {
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(this.f108239d);
            if (!file2.exists()) {
                file2.mkdir();
            }
            return new File(this.f108239d).exists() && new File(this.f108240e).exists();
        } catch (Throwable th2) {
            g.d(th2);
            return false;
        }
    }

    public boolean k() {
        if (this.f108244i == null || this.f108245j) {
            return false;
        }
        return TextUtils.equals(this.f108244i.c(), rh.a.C2298a.f108234b) || TextUtils.equals(this.f108244i.c(), rh.a.C2298a.f108235c);
    }

    public void l() {
        g.f("mspl", "LocalWebPayManager clearData");
        this.f108237b = null;
        this.f108242g = WebrtcBuildVersion.maint_version;
        this.f108244i = null;
        this.f108243h = null;
    }

    public String n() {
        g.h("LocalWebPayManager", "getLocalConfigVersion=" + this.f108242g);
        return this.f108242g;
    }

    public final void o() {
        JSONObject jSONObjectD = e.d(this.f108240e);
        g.f("mspl", "readContentFromConfigJson jsonConfigJson=" + jSONObjectD);
        if (jSONObjectD != null) {
            try {
                String string = jSONObjectD.getString("version");
                JSONObject jSONObject = jSONObjectD.getJSONObject("homeHtml");
                JSONObject jSONObject2 = jSONObjectD.getJSONObject("fileList");
                this.f108242g = string;
                JSONObject jSONObjectB = f.b(jSONObject, jSONObject2);
                Iterator<String> itKeys = jSONObjectB.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        this.f108243h.put(next, jSONObjectB.getString(next));
                    } catch (Throwable th2) {
                        g.d(th2);
                    }
                }
            } catch (Throwable th3) {
                g.g("LocalWebPayManager", "readContentFromConfigJson fileContent error");
                g.d(th3);
                hh.a.c(this.f108237b, "biz", "LocalWebPayManager.readContentFromConfigJsonError", th3);
            }
        }
    }

    public class a implements th.a.InterfaceC2419a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rh.a f108246a;

        public a(rh.a aVar) {
            this.f108246a = aVar;
        }

        @Override // th.a.InterfaceC2419a
        public void a(File file) {
            g.h("LocalWebPayManager", "checkAndUpdateLocalData downloadListener onSuccess");
            b.this.i(this.f108246a);
            b.this.f108245j = false;
        }

        @Override // th.a.InterfaceC2419a
        public void a(Throwable th2) {
            g.d(th2);
            b.this.f108245j = false;
        }
    }
}
