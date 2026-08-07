package yz;

import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes6.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f126024a;

    public a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The Base64 value must not be null");
        }
        this.f126024a = str;
    }

    public byte[] a() {
        return b.c(this.f126024a);
    }

    public BigInteger b() {
        return new BigInteger(1, a());
    }

    public String c() {
        return new String(a(), l.f126026a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.f126024a.hashCode();
    }

    public String toString() {
        return this.f126024a;
    }
}
