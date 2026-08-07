package fv;

import androidx.annotation.NonNull;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f66628b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jv.g f66629a;

    class a extends JSONObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f66630a;

        a(String str) throws JSONException {
            this.f66630a = str;
            put("userId", str);
        }
    }

    public g(jv.g gVar) {
        this.f66629a = gVar;
    }

    private static Map<String, String> e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, p(jSONObject, next));
        }
        return map;
    }

    private static List<j> f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            String string = jSONArray.getString(i11);
            try {
                arrayList.add(j.a(string));
            } catch (Exception e11) {
                bv.g.f().l("Failed de-serializing rollouts state. " + string, e11);
            }
        }
        return arrayList;
    }

    private String g(String str) {
        return p(new JSONObject(str), "userId");
    }

    private static String h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String l(List<j> list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i11 = 0; i11 < list.size(); i11++) {
            try {
                jSONArray.put(new JSONObject(j.f66656a.encode(list.get(i11))));
            } catch (JSONException e11) {
                bv.g.f().l("Exception parsing rollout assignment!", e11);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    private static void m(File file) {
        if (file.exists() && file.delete()) {
            bv.g.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static void n(File file, String str) {
        if (file.exists() && file.delete()) {
            bv.g.f().g(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }

    private static String o(String str) {
        return new a(str).toString();
    }

    private static String p(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    @NonNull
    public File a(String str) {
        return this.f66629a.q(str, "internal-keys");
    }

    @NonNull
    public File b(String str) {
        return this.f66629a.q(str, "keys");
    }

    @NonNull
    public File c(String str) {
        return this.f66629a.q(str, "rollouts-state");
    }

    @NonNull
    public File d(String str) {
        return this.f66629a.q(str, "user-data");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    Map<String, String> i(String str, boolean z11) throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        Exception e11;
        File fileA = z11 ? a(str) : b(str);
        if (!fileA.exists() || fileA.length() == 0) {
            n(fileA, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileA);
                try {
                    Map<String, String> mapE = e(com.google.firebase.crashlytics.internal.common.i.B(fileInputStream));
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, "Failed to close user metadata file.");
                    return mapE;
                } catch (Exception e12) {
                    e11 = e12;
                    bv.g.f().l("Error deserializing user metadata.", e11);
                    m(fileA);
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th3) {
                th2 = th3;
                com.google.firebase.crashlytics.internal.common.i.f(, "Failed to close user metadata file.");
                throw th2;
            }
        } catch (Exception e13) {
            fileInputStream = null;
            e11 = e13;
        } catch (Throwable th4) {
            ?? r11 = 0;
            th2 = th4;
            com.google.firebase.crashlytics.internal.common.i.f(r11, "Failed to close user metadata file.");
            throw th2;
        }
    }

    public List<j> j(String str) throws Throwable {
        File fileC = c(str);
        if (!fileC.exists() || fileC.length() == 0) {
            n(fileC, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileC);
                try {
                    List<j> listF = f(com.google.firebase.crashlytics.internal.common.i.B(fileInputStream2));
                    bv.g.f().b("Loaded rollouts state:\n" + listF + "\nfor session " + str);
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, "Failed to close rollouts state file.");
                    return listF;
                } catch (Exception e11) {
                    e = e11;
                    fileInputStream = fileInputStream2;
                    bv.g.f().l("Error deserializing rollouts state.", e);
                    m(fileC);
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.EMPTY_LIST;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public String k(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileD = d(str);
        FileInputStream fileInputStream2 = null;
        if (!fileD.exists() || fileD.length() == 0) {
            bv.g.f().b("No userId set for session " + str);
            m(fileD);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileD);
            try {
                try {
                    String strG = g(com.google.firebase.crashlytics.internal.common.i.B(fileInputStream));
                    bv.g.f().b("Loaded userId " + strG + " for session " + str);
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, "Failed to close user metadata file.");
                    return strG;
                } catch (Exception e11) {
                    e = e11;
                    bv.g.f().l("Error deserializing user metadata.", e);
                    m(fileD);
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void q(String str, Map<String, String> map) throws Throwable {
        r(str, map, false);
    }

    public void r(String str, Map<String, String> map, boolean z11) throws Throwable {
        File fileA = z11 ? a(str) : b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strH = h(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileA), f66628b));
                try {
                    bufferedWriter2.write(strH);
                    bufferedWriter2.flush();
                    com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e11) {
                    e = e11;
                    bufferedWriter = bufferedWriter2;
                    bv.g.f().l("Error serializing key/value metadata.", e);
                    m(fileA);
                    com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    public void s(String str, List<j> list) throws Throwable {
        Throwable th2;
        BufferedWriter bufferedWriter;
        Exception e11;
        File fileC = c(str);
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            n(fileC, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                String strL = l(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileC), f66628b));
                try {
                    bufferedWriter.write(strL);
                    bufferedWriter.flush();
                    com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e12) {
                    e11 = e12;
                    bv.g.f().l("Error serializing rollouts state.", e11);
                    m(fileC);
                    com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th3) {
                th2 = th3;
                com.google.firebase.crashlytics.internal.common.i.f(IsEmpty, "Failed to close rollouts state file.");
                throw th2;
            }
        } catch (Exception e13) {
            bufferedWriter = null;
            e11 = e13;
        } catch (Throwable th4) {
            IsEmpty = 0;
            th2 = th4;
            com.google.firebase.crashlytics.internal.common.i.f(IsEmpty, "Failed to close rollouts state file.");
            throw th2;
        }
    }

    public void t(String str, String str2) throws Throwable {
        File fileD = d(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strO = o(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileD), f66628b));
                try {
                    bufferedWriter2.write(strO);
                    bufferedWriter2.flush();
                    com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e11) {
                    e = e11;
                    bufferedWriter = bufferedWriter2;
                    bv.g.f().l("Error serializing user metadata.", e);
                    com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
