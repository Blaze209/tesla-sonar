package com.withpersona.sdk2.inquiry.network.core;

import android.util.Base64;
import bo0.n;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.x;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.h;
import org.json.JSONArray;
import org.json.JSONObject;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.g;
import p013kotlin.text.q;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f58316a = new a();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.core.a$a, reason: collision with other inner class name */
    public static final class C1191a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f58317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f58318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f58319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f58320d;

        public C1191a(String str, String str2, String str3, String str4) {
            this.f58317a = str;
            this.f58318b = str2;
            this.f58319c = str3;
            this.f58320d = str4;
        }

        public final String a() {
            return this.f58319c;
        }

        public final String b() {
            return this.f58317a;
        }

        public final String c() {
            return this.f58320d;
        }

        public final String d() {
            return this.f58318b;
        }
    }

    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Pair pair = (Pair) t11;
            Pair pair2 = (Pair) t12;
            return mn0.a.d(v.y0(v.p(pair.e(), pair.f()), null, null, null, 0, null, null, 63, null), v.y0(v.p(pair2.e(), pair2.f()), null, null, null, 0, null, null, 63, null));
        }
    }

    public static /* synthetic */ Request a(a aVar, Request request, kh0.b bVar, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = System.currentTimeMillis();
        }
        return aVar.a(request, bVar, j11);
    }

    public final String b(RequestBody requestBody) {
        h hVar = new h();
        requestBody.writeTo(hVar);
        return t.F1(hVar.t1()).toString();
    }

    public final JSONArray c(RequestBody requestBody) {
        List<Pair<String, Object>> listC = f58316a.c(a(requestBody));
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.a();
            String string = pair.b().toString();
            arrayList.add(new q("^[+-]?\\d+(\\.\\d+)?$").i(string) ? x.a(str, t.T1(string, 10)) : x.a(str, new q("\\s").j(string, "")));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) ((Pair) obj).b()).length() > 0) {
                arrayList2.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(arrayList2, 10)), 16));
        for (Object obj2 : arrayList2) {
            linkedHashMap.put((String) ((Pair) obj2).e(), obj2);
        }
        List<Pair> listA1 = v.a1(linkedHashMap.values(), new b());
        JSONArray jSONArray = new JSONArray();
        for (Pair pair2 : listA1) {
            String str2 = (String) pair2.a();
            String str3 = (String) pair2.b();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str2);
            jSONArray2.put(str3);
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    public final Request a(Request request, kh0.b bVar, long j11) {
        C1191a c1191aA = a(j11, request, bVar);
        return c1191aA != null ? request.newBuilder().addHeader("NHMJLNRS", c1191aA.d()).addHeader("STPBWSBB", c1191aA.b()).addHeader("DNLGNZLZ", c1191aA.a()).addHeader("TLJLGGDG", c1191aA.c()).build() : request;
    }

    public final boolean b(List<String> list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (t.b0((String) it.next(), "filename=", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public final C1191a a(long j11, Request request, kh0.b bVar) {
        String str = request.headers().get("Authorization");
        RequestBody requestBodyBody = request.body();
        if (str == null || requestBodyBody == null) {
            return null;
        }
        try {
            String str2 = request.headers().get("User-Agent");
            if (str2 != null && !t.y0(str2)) {
                Map mapO = v0.o(x.a("User-Agent", str2), x.a("VTDGJLGG", request.headers().get("VTDGJLGG")), x.a("Persona-Device-Vendor-Id", request.headers().get("Persona-Device-Vendor-Id")), x.a("Persona-Version", request.headers().get("Persona-Version")));
                mapO.put("TLJLGGDG", v.y0(d1.o(mapO.keySet(), "TLJLGGDG"), ", ", null, null, 0, null, null, 62, null));
                Set setKeySet = mapO.keySet();
                Collection collectionValues = mapO.values();
                String str3 = (String) v.C0(t.f1(str, new String[]{" "}, false, 0, 6, null));
                if (str3 == null) {
                    bVar.f(NetworkUtilsKt.SUBSYSTEM, kh0.a.Error, "Auth token is null.");
                    return null;
                }
                String strOptString = new JSONObject(new String(Base64.decode((String) t.f1(str3, new String[]{"."}, false, 0, 6, null).get(1), 0), p013kotlin.text.d.UTF_8)).optString("sub");
                if (strOptString != null && !t.y0(strOptString)) {
                    String strValueOf = String.valueOf(j11 / ((long) 1000));
                    return new C1191a(a(v.y0(v.p(strOptString, strValueOf, t.V(c(requestBodyBody).toString(), "\\/", "/", false, 4, null)), ":", null, null, 0, null, null, 62, null)), strValueOf, a(v.y0(v.p(v.y0(collectionValues, "", null, null, 0, null, null, 62, null), strValueOf, t.V(c(requestBodyBody).toString(), "\\/", "/", false, 4, null)), ":", null, null, 0, null, null, 62, null)), v.y0(setKeySet, ", ", null, null, 0, null, null, 62, null));
                }
                bVar.f(NetworkUtilsKt.SUBSYSTEM, kh0.a.Error, "Session token is null.");
                return null;
            }
            bVar.f(NetworkUtilsKt.SUBSYSTEM, kh0.a.Error, "User agent is null.");
            return null;
        } catch (Exception e11) {
            bVar.f(NetworkUtilsKt.SUBSYSTEM, kh0.a.Error, "An unexpected error occurred: " + e11.getMessage() + ".");
            return null;
        }
    }

    public final List<Pair<String, Object>> c(List<? extends Pair<String, ? extends Object>> list) {
        while (true) {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z11 = false;
            for (Pair<String, ? extends Object> pair : list) {
                String strA = pair.a();
                Object objB = pair.b();
                List listF1 = t.f1(strA, new String[]{HttpUrl.PATH_SEGMENT_ENCODE_SET_URI}, false, 2, 2, null);
                if (listF1.size() == 1) {
                    arrayList.add(x.a(strA, objB));
                } else {
                    String str = (String) listF1.get(0);
                    String str2 = (String) listF1.get(1);
                    if (linkedHashMap.get(str) == null) {
                        linkedHashMap.put(str, 0);
                    }
                    if (!linkedHashSet.add(strA) && !t.h0(str2, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, false, 2, null)) {
                        Object obj = linkedHashMap.get(str);
                        if (obj != null) {
                            linkedHashMap.put(str, Integer.valueOf(((Number) obj).intValue() + 1));
                            linkedHashSet.clear();
                            linkedHashSet.add(strA);
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    arrayList.add(x.a(str + "[" + linkedHashMap.get(str) + "]" + str2, objB));
                    z11 = true;
                }
            }
            if (!z11) {
                return arrayList;
            }
            list = arrayList;
        }
    }

    public final String a(String str) {
        return g.u(MessageDigest.getInstance("SHA-256").digest(str.getBytes(p013kotlin.text.d.UTF_8)), null, 1, null);
    }

    public final List<Pair<String, Object>> a(RequestBody requestBody) {
        List<String> listM;
        List listE;
        String str;
        List listF1;
        Object obj;
        Object jSONArray;
        MediaType contentType = requestBody.getF22850a();
        if (contentType == null) {
            return v.e(x.a("", b(requestBody)));
        }
        if (s.f(contentType.subtype(), "json")) {
            String strB = b(requestBody);
            if (!s.f(strB, "{}") && !s.f(strB, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                if (t.b0(strB, "{", false, 2, null)) {
                    obj = strB;
                    obj = strB;
                    jSONArray = new JSONObject(strB);
                } else if (t.b0(strB, "[", false, 2, null)) {
                    obj = strB;
                    obj = strB;
                    obj = strB;
                    jSONArray = new JSONArray(strB);
                }
                obj = jSONArray;
            }
            obj = strB;
            obj = strB;
            obj = strB;
            obj = strB;
            obj = strB;
            obj = strB;
            if (obj instanceof String) {
                return v.e(x.a("", obj));
            }
            return a(obj);
        }
        if (s.f(contentType.type(), "multipart")) {
            List<MultipartBody.Part> listParts = ((MultipartBody) requestBody).parts();
            ArrayList arrayList = new ArrayList();
            for (MultipartBody.Part part : listParts) {
                Headers headers = part.headers();
                if (headers != null && (str = headers.get("Content-Disposition")) != null && (listF1 = t.f1(str, new String[]{";"}, false, 0, 6, null)) != null) {
                    listM = new ArrayList<>(v.y(listF1, 10));
                    Iterator it = listF1.iterator();
                    while (it.hasNext()) {
                        listM.add(t.F1((String) it.next()).toString());
                    }
                } else {
                    listM = v.m();
                }
                a aVar = f58316a;
                String strA = aVar.a(listM);
                if (strA != null) {
                    if (aVar.b(listM)) {
                        listE = v.e(x.a(strA, Long.valueOf(part.body().contentLength())));
                    } else {
                        List<Pair<String, Object>> listA = aVar.a(part.body());
                        if (listA.isEmpty()) {
                            listE = v.m();
                        } else if (listA.size() == 1) {
                            listE = v.e(x.a(strA, listA.get(0).f()));
                        } else {
                            throw new IllegalArgumentException("Request body parts must contain a single value. Instead got: " + listA + ". Part name: " + strA);
                        }
                    }
                    v.E(arrayList, listE);
                } else {
                    throw new IllegalArgumentException("Request body parts must have names.");
                }
            }
            return v.m1(arrayList);
        }
        if (s.f(contentType.type(), "image")) {
            return v.e(x.a("", Long.valueOf(requestBody.contentLength())));
        }
        throw new RuntimeException("Unsupported type: " + contentType);
    }

    public final List<Pair<String, Object>> a(Object obj) {
        ArrayList arrayList = new ArrayList();
        a(this, obj, (String) null, arrayList, 2, (Object) null);
        return arrayList;
    }

    public static /* synthetic */ void a(a aVar, Object obj, String str, List list, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        aVar.a(obj, str, (List<Pair<String, Object>>) list);
    }

    public final void a(Object obj, String str, List<Pair<String, Object>> list) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                a aVar = f58316a;
                Object objOpt = jSONObject.opt(next);
                if (str != null) {
                    next = str + "[" + next + "]";
                }
                aVar.a(objOpt, next, list);
            }
            return;
        }
        if (!(obj instanceof JSONArray)) {
            if (str == null) {
                str = "";
            }
            list.add(x.a(str, obj));
            return;
        }
        JSONArray jSONArray = (JSONArray) obj;
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            a(jSONArray.opt(i11), str == null ? "[" + i11 + "]" : str + "[" + i11 + "]", list);
        }
    }

    public final String a(List<String> list) {
        Object next;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!t.b0((String) next, "name=", false, 2, null));
        String str = (String) next;
        if (str != null) {
            return str.substring(6, str.length() - 1);
        }
        return null;
    }
}
