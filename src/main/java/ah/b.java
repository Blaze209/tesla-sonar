package ah;

import android.annotation.SuppressLint;
import android.content.Context;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f1041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gh.a f1042b;

    public b(String str, gh.a aVar) {
        this.f1041a = null;
        this.f1042b = null;
        this.f1041a = new File(str);
        this.f1042b = aVar;
    }

    public static String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "id");
            jSONObject.put(AnalyticsAttribute.Error, str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @SuppressLint({"SimpleDateFormat"})
    public static String e() {
        return new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log";
    }

    public final synchronized void b() {
        try {
            File file = this.f1041a;
            if (file == null) {
                return;
            }
            if (file.exists() && this.f1041a.isDirectory() && this.f1041a.list().length != 0) {
                ArrayList arrayList = new ArrayList();
                for (String str : this.f1041a.list()) {
                    arrayList.add(str);
                }
                Collections.sort(arrayList);
                String str2 = (String) arrayList.get(arrayList.size() - 1);
                int size = arrayList.size();
                if (str2.equals(e())) {
                    if (arrayList.size() < 2) {
                        return;
                    }
                    str2 = (String) arrayList.get(arrayList.size() - 2);
                    size--;
                }
                if (!this.f1042b.logCollect(a(sg.b.a(this.f1041a.getAbsolutePath(), str2)))) {
                    size--;
                }
                for (int i11 = 0; i11 < size; i11++) {
                    new File(this.f1041a, (String) arrayList.get(i11)).delete();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void d(Context context) {
        new Thread(new c(this)).start();
    }
}
