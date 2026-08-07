package yz;

/* JADX INFO: loaded from: classes6.dex */
public class c extends a {
    public c(String str) {
        super(str);
    }

    public static c d(String str) {
        return e(str.getBytes(l.f126026a));
    }

    public static c e(byte[] bArr) {
        return new c(b.g(bArr, true));
    }

    public static c f(String str) {
        if (str == null) {
            return null;
        }
        return new c(str);
    }

    @Override // yz.a
    public boolean equals(Object obj) {
        return (obj instanceof c) && toString().equals(obj.toString());
    }
}
