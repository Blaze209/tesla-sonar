package jo;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import ch.qos.logback.core.joran.action.Action;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f84080e = jo.b.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f84081a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f84082b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Integer, d> f84083c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, f> f84084d;

    /* JADX INFO: renamed from: jo.a$a, reason: collision with other inner class name */
    class C1777a extends g {
        C1777a() {
        }

        @Override // jo.f
        public void b(Object obj, h hVar) {
            synchronized (a.this.f84083c) {
                try {
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        if (jSONObject == null) {
                            throw new Exception("params must be an object { mode: string, filename: string }");
                        }
                        String strOptString = jSONObject.optString("mode");
                        if (strOptString == null) {
                            throw new Exception("missing params.mode");
                        }
                        String strOptString2 = jSONObject.optString("filename");
                        if (strOptString2 == null) {
                            throw new Exception("missing params.filename");
                        }
                        if (!strOptString.equals("r")) {
                            throw new IllegalArgumentException("unsupported mode: " + strOptString);
                        }
                        hVar.b(Integer.valueOf(a.this.c(strOptString2)));
                    } catch (Exception e11) {
                        hVar.a(e11.toString());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class b extends g {
        b() {
        }

        @Override // jo.f
        public void b(Object obj, h hVar) {
            synchronized (a.this.f84083c) {
                try {
                    try {
                        if (!(obj instanceof Number)) {
                            throw new Exception("params must be a file handle");
                        }
                        d dVar = (d) a.this.f84083c.get(obj);
                        if (dVar == null) {
                            throw new Exception("invalid file handle, it might have timed out");
                        }
                        a.this.f84083c.remove(obj);
                        dVar.a();
                        hVar.b("");
                    } catch (Exception e11) {
                        hVar.a(e11.toString());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class c extends g {
        c() {
        }

        @Override // jo.f
        public void b(Object obj, h hVar) {
            synchronized (a.this.f84083c) {
                try {
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        if (jSONObject == null) {
                            throw new Exception("params must be an object { file: handle, size: number }");
                        }
                        int iOptInt = jSONObject.optInt(Action.FILE_ATTRIBUTE);
                        if (iOptInt == 0) {
                            throw new Exception("invalid or missing file handle");
                        }
                        int iOptInt2 = jSONObject.optInt("size");
                        if (iOptInt2 == 0) {
                            throw new Exception("invalid or missing read size");
                        }
                        d dVar = (d) a.this.f84083c.get(Integer.valueOf(iOptInt));
                        if (dVar == null) {
                            throw new Exception("invalid file handle, it might have timed out");
                        }
                        hVar.b(dVar.d(iOptInt2));
                    } catch (Exception e11) {
                        hVar.a(e11.toString());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileInputStream f84088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f84089b = System.currentTimeMillis() + 30000;

        public d(String str) {
            this.f84088a = new FileInputStream(str);
        }

        private void c() {
            this.f84089b = System.currentTimeMillis() + 30000;
        }

        public void a() throws IOException {
            this.f84088a.close();
        }

        public boolean b() {
            return System.currentTimeMillis() >= this.f84089b;
        }

        public String d(int i11) {
            c();
            byte[] bArr = new byte[i11];
            return Base64.encodeToString(bArr, 0, this.f84088a.read(bArr), 0);
        }
    }

    public a() {
        HashMap map = new HashMap();
        this.f84084d = map;
        map.put("fopen", new C1777a());
        map.put("fclose", new b());
        map.put("fread", new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(String str) {
        int i11 = this.f84081a;
        this.f84081a = i11 + 1;
        this.f84083c.put(Integer.valueOf(i11), new d(str));
        if (this.f84083c.size() == 1) {
            this.f84082b.postDelayed(this, 30000L);
        }
        return i11;
    }

    public Map<String, f> d() {
        return this.f84084d;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f84083c) {
            Iterator<d> it = this.f84083c.values().iterator();
            while (it.hasNext()) {
                d next = it.next();
                if (next.b()) {
                    it.remove();
                    try {
                        next.a();
                    } catch (IOException e11) {
                        qk.a.m(f84080e, "closing expired file failed: " + e11.toString());
                    }
                }
            }
            if (!this.f84083c.isEmpty()) {
                this.f84082b.postDelayed(this, 30000L);
            }
        }
    }
}
