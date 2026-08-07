package br0;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f17945f = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f17948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17950e;

    a() {
        this(-1, 0, 0, null);
    }

    private byte[] b() throws IOException {
        byte[] bArr = new byte[d()];
        new DataInputStream(c()).readFully(bArr);
        return bArr;
    }

    private static String k(int i11) {
        if (i11 == -1) {
            return "Unknown";
        }
        if (i11 == 0) {
            return "Portrait";
        }
        if (i11 == 1) {
            return "Signature or usual mark";
        }
        if (i11 == 2) {
            return "Finger";
        }
        if (i11 == 3) {
            return "Iris";
        }
        throw new NumberFormatException("Unknown type: " + Integer.toHexString(i11));
    }

    public int a() {
        return this.f17950e;
    }

    public InputStream c() {
        if (this.f17948c != null) {
            return new ByteArrayInputStream(this.f17948c);
        }
        throw new IllegalStateException("Both the byte buffer and the stream are null");
    }

    public int d() {
        byte[] bArr = this.f17948c;
        if (bArr != null) {
            return bArr.length;
        }
        throw new IllegalStateException("Cannot get length of null");
    }

    public String e() {
        return this.f17947b;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003c A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:8:0x0008, B:11:0x0017, B:13:0x0027, B:15:0x002b, B:23:0x003c, B:21:0x0034), top: B:29:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0042 A[RETURN] */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        try {
            if (!obj.getClass().equals(getClass())) {
                return false;
            }
            a aVar = (a) obj;
            if (Arrays.equals(b(), aVar.b())) {
                String str = this.f17947b;
                if (str == null && aVar.f17947b == null) {
                    if (this.f17946a == aVar.f17946a) {
                        return true;
                    }
                } else if (str != null && str.equals(aVar.f17947b)) {
                    if (this.f17946a == aVar.f17946a) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e11) {
            f17945f.log(Level.WARNING, "Exception" + e11);
            return false;
        }
    }

    public int f() {
        return this.f17949d;
    }

    protected void g(InputStream inputStream, long j11) throws IOException {
        this.f17948c = new byte[(int) j11];
        new DataInputStream(inputStream).readFully(this.f17948c);
    }

    protected final void h(int i11) {
        this.f17950e = i11;
    }

    public int hashCode() {
        int i11 = (-591263623) + (this.f17946a * 5);
        String str = this.f17947b;
        return i11 + ((str == null ? 1337 : str.hashCode()) * 5) + 7 + (d() * 7) + 11;
    }

    protected final void i(String str) {
        this.f17947b = str;
    }

    protected final void j(int i11) {
        this.f17949d = i11;
    }

    protected void l(OutputStream outputStream) throws IOException {
        outputStream.write(b());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(" [");
        sb2.append("type: ");
        sb2.append(k(this.f17946a) + ", ");
        sb2.append("size: ");
        sb2.append(d());
        sb2.append("]");
        return sb2.toString();
    }

    protected a(int i11) {
        this(i11, 0, 0, null);
    }

    private a(int i11, int i12, int i13, String str) {
        this.f17946a = i11;
        this.f17947b = str;
        this.f17949d = i12;
        this.f17950e = i13;
    }

    public a(int i11, int i12, int i13, InputStream inputStream, long j11, String str) throws IOException {
        this(i11, i12, i13, str);
        g(inputStream, j11);
    }
}
