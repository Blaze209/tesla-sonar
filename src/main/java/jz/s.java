package jz;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f84569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f84570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f84571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f84572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final yz.c f84573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q f84574f;

    public enum a {
        JSON,
        STRING,
        BYTE_ARRAY,
        BASE64URL,
        JWS_OBJECT,
        SIGNED_JWT
    }

    public s(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The string must not be null");
        }
        this.f84570b = null;
        this.f84571c = str;
        this.f84572d = null;
        this.f84573e = null;
        this.f84574f = null;
        this.f84569a = a.STRING;
    }

    private static String a(byte[] bArr) {
        if (bArr != null) {
            return new String(bArr, yz.l.f126026a);
        }
        return null;
    }

    private static byte[] b(String str) {
        if (str != null) {
            return str.getBytes(yz.l.f126026a);
        }
        return null;
    }

    public yz.c c() {
        yz.c cVar = this.f84573e;
        return cVar != null ? cVar : yz.c.e(d());
    }

    public byte[] d() {
        byte[] bArr = this.f84572d;
        if (bArr != null) {
            return bArr;
        }
        yz.c cVar = this.f84573e;
        return cVar != null ? cVar.a() : b(toString());
    }

    public String toString() {
        String str = this.f84571c;
        if (str != null) {
            return str;
        }
        q qVar = this.f84574f;
        if (qVar != null) {
            return qVar.a() != null ? this.f84574f.a() : this.f84574f.l();
        }
        Map<String, Object> map = this.f84570b;
        if (map != null) {
            return yz.j.o(map);
        }
        byte[] bArr = this.f84572d;
        if (bArr != null) {
            return a(bArr);
        }
        yz.c cVar = this.f84573e;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public s(byte[] bArr) {
        if (bArr != null) {
            this.f84570b = null;
            this.f84571c = null;
            this.f84572d = bArr;
            this.f84573e = null;
            this.f84574f = null;
            this.f84569a = a.BYTE_ARRAY;
            return;
        }
        throw new IllegalArgumentException("The byte array must not be null");
    }

    public s(yz.c cVar) {
        if (cVar != null) {
            this.f84570b = null;
            this.f84571c = null;
            this.f84572d = null;
            this.f84573e = cVar;
            this.f84574f = null;
            this.f84569a = a.BASE64URL;
            return;
        }
        throw new IllegalArgumentException("The Base64URL-encoded object must not be null");
    }
}
