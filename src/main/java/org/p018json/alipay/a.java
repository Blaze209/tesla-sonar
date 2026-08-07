package org.p018json.alipay;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f99329a;

    public a() {
        this.f99329a = new ArrayList();
    }

    public int a() {
        return this.f99329a.size();
    }

    public Object b(int i11) {
        if (i11 < 0 || i11 >= a()) {
            return null;
        }
        return this.f99329a.get(i11);
    }

    public String toString() {
        try {
            return '[' + a(",") + ']';
        } catch (Exception unused) {
            return null;
        }
    }

    public a(Object obj) throws JSONException {
        this();
        if (!obj.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i11 = 0; i11 < length; i11++) {
            a(Array.get(obj, i11));
        }
    }

    public Object a(int i11) throws JSONException {
        Object objB = b(i11);
        if (objB != null) {
            return objB;
        }
        throw new JSONException("JSONArray[" + i11 + "] not found.");
    }

    public a(String str) {
        this(new c(str));
    }

    public String a(String str) {
        int iA = a();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < iA; i11++) {
            if (i11 > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(b.b(this.f99329a.get(i11)));
        }
        return stringBuffer.toString();
    }

    public a(Collection collection) {
        this.f99329a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public a a(Object obj) {
        this.f99329a.add(obj);
        return this;
    }

    public a(c cVar) throws JSONException {
        char c11;
        ArrayList arrayList;
        Object objD;
        this();
        char c12 = cVar.c();
        if (c12 == '[') {
            c11 = ']';
        } else {
            if (c12 != '(') {
                throw cVar.a("A JSONArray text must start with '['");
            }
            c11 = ')';
        }
        if (cVar.c() == ']') {
            return;
        }
        do {
            cVar.a();
            char c13 = cVar.c();
            cVar.a();
            if (c13 == ',') {
                arrayList = this.f99329a;
                objD = null;
            } else {
                arrayList = this.f99329a;
                objD = cVar.d();
            }
            arrayList.add(objD);
            char c14 = cVar.c();
            if (c14 != ')') {
                if (c14 != ',' && c14 != ';') {
                    if (c14 != ']') {
                        throw cVar.a("Expected a ',' or ']'");
                    }
                }
            }
            if (c11 == c14) {
                return;
            }
            throw cVar.a("Expected a '" + new Character(c11) + "'");
        } while (cVar.c() != ']');
    }
}
