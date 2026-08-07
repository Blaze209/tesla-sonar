package yq0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class l implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f125752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f125753b;

    public l(String str, byte b11) {
        this(o.o(str), b11);
    }

    public static l a(String str) {
        return new l(str, (byte) 2);
    }

    private static String c(byte b11) {
        if (b11 == 0) {
            return "NO";
        }
        if (b11 == 1) {
            return "MRZ";
        }
        if (b11 == 2) {
            return "CAN";
        }
        if (b11 != 3) {
            return b11 != 4 ? Integer.toString(b11) : "PUK";
        }
        return "PIN";
    }

    public byte b() {
        return this.f125753b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return Arrays.equals(this.f125752a, lVar.f125752a) && this.f125753b == lVar.f125753b;
    }

    @Override // yq0.g
    public byte[] getKey() {
        return this.f125752a;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f125752a) + 31) * 31) + this.f125753b;
    }

    public String toString() {
        return "PACEKeySpec [key: " + bp0.a.b(this.f125752a) + ", keyReference: " + c(this.f125753b) + "]";
    }

    public l(byte[] bArr, byte b11) {
        this.f125753b = b11;
        this.f125752a = bArr;
    }
}
