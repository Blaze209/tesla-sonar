package com.alipay.android.phone.mrpc.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* JADX INFO: loaded from: classes3.dex */
public class o extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f20017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f20018c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20022g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<Header> f20020e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, String> f20021f = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f20019d = "application/x-www-form-urlencoded";

    public o(String str) {
        this.f20017b = str;
    }

    public String a() {
        return this.f20017b;
    }

    public String b(String str) {
        Map<String, String> map = this.f20021f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public String c() {
        return this.f20019d;
    }

    public ArrayList<Header> d() {
        return this.f20020e;
    }

    public boolean e() {
        return this.f20022g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        byte[] bArr = this.f20018c;
        if (bArr == null) {
            if (oVar.f20018c != null) {
                return false;
            }
        } else if (!bArr.equals(oVar.f20018c)) {
            return false;
        }
        String str = this.f20017b;
        String str2 = oVar.f20017b;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Map<String, String> map = this.f20021f;
        int iHashCode = ((map == null || !map.containsKey("id")) ? 1 : this.f20021f.get("id").hashCode() + 31) * 31;
        String str = this.f20017b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return String.format("Url : %s,HttpHeader: %s", a(), d());
    }

    public void a(String str) {
        this.f20019d = str;
    }

    public byte[] b() {
        return this.f20018c;
    }

    public void a(String str, String str2) {
        if (this.f20021f == null) {
            this.f20021f = new HashMap();
        }
        this.f20021f.put(str, str2);
    }

    public void a(Header header) {
        this.f20020e.add(header);
    }

    public void a(boolean z11) {
        this.f20022g = z11;
    }

    public void a(byte[] bArr) {
        this.f20018c = bArr;
    }
}
