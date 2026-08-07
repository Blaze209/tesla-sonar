package yh;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f125480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f125481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f125482c;

    public b(String str, a aVar) {
        this.f125481b = str;
        this.f125480a = aVar;
    }

    public static List<b> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            String[] strArrD = d(jSONObject.optString("name", ""));
            for (int i11 = 0; i11 < strArrD.length; i11++) {
                a aVarA = a.a(strArrD[i11]);
                if (aVarA != a.None) {
                    b bVar = new b(strArrD[i11], aVarA);
                    bVar.f125482c = e(strArrD[i11]);
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public static void c(b bVar) {
        String[] strArrF = bVar.f();
        if (strArrF.length == 3 && TextUtils.equals("tid", strArrF[0])) {
            ci.a aVarB = ci.a.b(ai.b.d().c());
            if (TextUtils.isEmpty(strArrF[1]) || TextUtils.isEmpty(strArrF[2])) {
                return;
            }
            aVarB.c(strArrF[1], strArrF[2]);
        }
    }

    public static String[] d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(";");
    }

    public static String[] e(String str) {
        ArrayList arrayList = new ArrayList();
        int iIndexOf = str.indexOf(40);
        int iLastIndexOf = str.lastIndexOf(41);
        if (iIndexOf == -1 || iLastIndexOf == -1 || iLastIndexOf <= iIndexOf) {
            return null;
        }
        for (String str2 : str.substring(iIndexOf + 1, iLastIndexOf).split("' *, *'", -1)) {
            arrayList.add(str2.trim().replaceAll("'", "").replaceAll("\"", ""));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public a b() {
        return this.f125480a;
    }

    public String[] f() {
        return this.f125482c;
    }
}
