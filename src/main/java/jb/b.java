package jb;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c[] f83474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f83475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f83476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f83477d;

    public b(String str, c[] cVarArr) {
        this.f83475b = str;
        this.f83476c = null;
        this.f83474a = cVarArr;
        this.f83477d = 0;
    }

    private void a(int i11) {
        if (i11 == this.f83477d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + c(this.f83477d) + " expected, but got " + c(i11));
    }

    private String c(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? "Unknown" : "ArrayBuffer";
        }
        return "String";
    }

    public String b() {
        a(0);
        return this.f83475b;
    }

    public b(byte[] bArr, c[] cVarArr) {
        Objects.requireNonNull(bArr);
        this.f83476c = bArr;
        this.f83475b = null;
        this.f83474a = cVarArr;
        this.f83477d = 1;
    }
}
