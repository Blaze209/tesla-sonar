package org.jmrtd.lds.iso19794;

import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public class a extends br0.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Logger f99306v = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f99307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private net.sf.scuba.data.a f99308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EnumC2115a f99309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f99310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f99311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f99312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f99313m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f99314n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b[] f99315o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f99316p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f99317q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f99318r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f99319s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f99320t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f99321u;

    /* JADX INFO: renamed from: org.jmrtd.lds.iso19794.a$a, reason: collision with other inner class name */
    public enum EnumC2115a {
        UNSPECIFIED(0),
        BLACK(1),
        BLUE(2),
        BROWN(3),
        GRAY(4),
        GREEN(5),
        MULTI_COLORED(6),
        PINK(7),
        UNKNOWN(255);

        private int code;

        EnumC2115a(int i11) {
            this.code = i11;
        }

        static EnumC2115a toEyeColor(int i11) {
            for (EnumC2115a enumC2115a : values()) {
                if (enumC2115a.toInt() == i11) {
                    return enumC2115a;
                }
            }
            return UNKNOWN;
        }

        public int toInt() {
            return this.code;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(net.sf.scuba.data.a aVar, EnumC2115a enumC2115a, int i11, int i12, int i13, int[] iArr, int[] iArr2, int i14, int i15, int i16, int i17, int i18, b[] bVarArr, int i19, int i21, InputStream inputStream, int i22, int i23) {
        long j11 = i22;
        super(0, i19, i21, inputStream, j11, u(i23));
        if (inputStream == null) {
            throw new IllegalArgumentException("Null image");
        }
        this.f99308h = aVar == null ? net.sf.scuba.data.a.UNSPECIFIED : aVar;
        this.f99309i = enumC2115a == null ? EnumC2115a.UNSPECIFIED : enumC2115a;
        this.f99311k = i11;
        this.f99310j = i12;
        this.f99312l = i13;
        this.f99318r = i15;
        this.f99319s = i16;
        this.f99320t = i17;
        int length = bVarArr == null ? 0 : bVarArr.length;
        b[] bVarArr2 = new b[length];
        this.f99315o = bVarArr2;
        if (length > 0) {
            System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
        }
        int[] iArr3 = new int[3];
        this.f99313m = iArr3;
        System.arraycopy(iArr, 0, iArr3, 0, 3);
        int[] iArr4 = new int[3];
        this.f99314n = iArr4;
        System.arraycopy(iArr2, 0, iArr4, 0, 3);
        this.f99317q = i23;
        this.f99307g = ((long) (length * 8)) + 32 + j11;
        this.f99316p = i14;
        this.f99318r = i15;
        this.f99319s = i16;
        this.f99320t = i17;
        this.f99321u = i18;
    }

    private String m() {
        switch (this.f99312l) {
            case 0:
                return "unspecified";
            case 1:
                return "neutral (non-smiling) with both eyes open and mouth closed";
            case 2:
                return "a smile where the inside of the mouth and/or teeth is not exposed (closed jaw)";
            case 3:
                return "a smile where the inside of the mouth and/or teeth is exposed";
            case 4:
                return "raised eyebrows";
            case 5:
                return "eyes looking away from the camera";
            case 6:
                return "squinting";
            case 7:
                return "frowning";
            default:
                return "unknown";
        }
    }

    private String n() {
        int i11 = this.f99316p;
        if (i11 == 0) {
            return "basic";
        }
        if (i11 != 1) {
            return i11 != 2 ? "unknown" : "token frontal";
        }
        return "full frontal";
    }

    private String o() {
        if ((this.f99311k & 1) == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f99311k & 2) != 0) {
            arrayList.add("glasses");
        }
        if ((this.f99311k & 4) != 0) {
            arrayList.add("moustache");
        }
        if ((this.f99311k & 8) != 0) {
            arrayList.add("beard");
        }
        if ((this.f99311k & 16) != 0) {
            arrayList.add("teeth visible");
        }
        if ((this.f99311k & 32) != 0) {
            arrayList.add("blink");
        }
        if ((this.f99311k & 64) != 0) {
            arrayList.add("mouth open");
        }
        if ((this.f99311k & 128) != 0) {
            arrayList.add("left eye patch");
        }
        if ((this.f99311k & 256) != 0) {
            arrayList.add("right eye patch");
        }
        if ((this.f99311k & 512) != 0) {
            arrayList.add("dark glasses");
        }
        if ((this.f99311k & 1024) != 0) {
            arrayList.add("distorting medical condition (which could impact feature point detection)");
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    private String q() {
        switch (this.f99310j) {
            case 0:
                return "unspecified";
            case 1:
                return "bald";
            case 2:
                return "black";
            case 3:
                return "blonde";
            case 4:
                return "brown";
            case 5:
                return "gray";
            case 6:
                return "white";
            case 7:
                return "red";
            case 8:
                return "green";
            case 9:
                return "blue";
            default:
                return "unknown";
        }
    }

    private String r() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("y: ");
        sb2.append(this.f99313m[0]);
        if (this.f99314n[0] != 0) {
            sb2.append(" (");
            sb2.append(this.f99314n[0]);
            sb2.append(")");
        }
        sb2.append(", ");
        sb2.append("p:");
        sb2.append(this.f99313m[1]);
        if (this.f99314n[1] != 0) {
            sb2.append(" (");
            sb2.append(this.f99314n[1]);
            sb2.append(")");
        }
        sb2.append(", ");
        sb2.append("r: ");
        sb2.append(this.f99313m[2]);
        if (this.f99314n[2] != 0) {
            sb2.append(" (");
            sb2.append(this.f99314n[2]);
            sb2.append(")");
        }
        sb2.append(")");
        return sb2.toString();
    }

    private String t() {
        switch (this.f99319s) {
            case 0:
                return "unspecified";
            case 1:
                return "static photograph from an unknown source";
            case 2:
                return "static photograph from a digital still-image camera";
            case 3:
                return "static photograph from a scanner";
            case 4:
                return "single video frame from an unknown source";
            case 5:
                return "single video frame from an analogue camera";
            case 6:
                return "single video frame from a digital camera";
            default:
                return "unknown";
        }
    }

    private static String u(int i11) {
        if (i11 == 0) {
            return ClipboardModule.MIMETYPE_JPEG;
        }
        if (i11 == 1) {
            return "image/jp2";
        }
        f99306v.warning("Unknown image type: " + i11);
        return null;
    }

    private void v(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeShort(this.f99315o.length);
        net.sf.scuba.data.a aVar = this.f99308h;
        if (aVar == null) {
            aVar = net.sf.scuba.data.a.UNSPECIFIED;
        }
        dataOutputStream.writeByte(aVar.toInt());
        EnumC2115a enumC2115a = this.f99309i;
        if (enumC2115a == null) {
            enumC2115a = EnumC2115a.UNSPECIFIED;
        }
        dataOutputStream.writeByte(enumC2115a.toInt());
        dataOutputStream.writeByte(this.f99310j);
        dataOutputStream.writeByte((byte) ((((long) this.f99311k) & 16711680) >> 16));
        dataOutputStream.writeByte((byte) ((((long) this.f99311k) & 65280) >> 8));
        dataOutputStream.writeByte((byte) (((long) this.f99311k) & 255));
        dataOutputStream.writeShort(this.f99312l);
        for (int i11 = 0; i11 < 3; i11++) {
            dataOutputStream.writeByte(this.f99313m[i11]);
        }
        for (int i12 = 0; i12 < 3; i12++) {
            dataOutputStream.writeByte(this.f99314n[i12]);
        }
        for (b bVar : this.f99315o) {
            dataOutputStream.writeByte(bVar.c());
            dataOutputStream.writeByte((bVar.a() << 4) | bVar.b());
            dataOutputStream.writeShort(bVar.d());
            dataOutputStream.writeShort(bVar.e());
            dataOutputStream.writeShort(0);
        }
        dataOutputStream.writeByte(this.f99316p);
        dataOutputStream.writeByte(this.f99317q);
        dataOutputStream.writeShort(f());
        dataOutputStream.writeShort(a());
        dataOutputStream.writeByte(this.f99318r);
        dataOutputStream.writeByte(this.f99319s);
        dataOutputStream.writeShort(this.f99320t);
        dataOutputStream.writeShort(this.f99321u);
        l(dataOutputStream);
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    @Override // br0.a
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f99318r == aVar.f99318r && this.f99320t == aVar.f99320t && this.f99312l == aVar.f99312l && this.f99309i == aVar.f99309i && this.f99316p == aVar.f99316p && this.f99311k == aVar.f99311k && Arrays.equals(this.f99315o, aVar.f99315o) && this.f99308h == aVar.f99308h && this.f99310j == aVar.f99310j && this.f99317q == aVar.f99317q && Arrays.equals(this.f99313m, aVar.f99313m) && Arrays.equals(this.f99314n, aVar.f99314n) && this.f99321u == aVar.f99321u && this.f99307g == aVar.f99307g && this.f99319s == aVar.f99319s;
    }

    @Override // br0.a
    public int hashCode() {
        int iHashCode = ((((((super.hashCode() * 31) + this.f99318r) * 31) + this.f99320t) * 31) + this.f99312l) * 31;
        EnumC2115a enumC2115a = this.f99309i;
        int iHashCode2 = (((((((iHashCode + (enumC2115a == null ? 0 : enumC2115a.hashCode())) * 31) + this.f99316p) * 31) + this.f99311k) * 31) + Arrays.hashCode(this.f99315o)) * 31;
        net.sf.scuba.data.a aVar = this.f99308h;
        int iHashCode3 = (((((((((((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f99310j) * 31) + this.f99317q) * 31) + Arrays.hashCode(this.f99313m)) * 31) + Arrays.hashCode(this.f99314n)) * 31) + this.f99321u) * 31;
        long j11 = this.f99307g;
        return ((iHashCode3 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f99319s;
    }

    public long p() {
        return this.f99307g;
    }

    protected void s(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.f99307g = ((long) dataInputStream.readInt()) & 4294967295L;
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f99308h = net.sf.scuba.data.a.getInstance(dataInputStream.readUnsignedByte());
        this.f99309i = EnumC2115a.toEyeColor(dataInputStream.readUnsignedByte());
        this.f99310j = dataInputStream.readUnsignedByte();
        int unsignedByte = dataInputStream.readUnsignedByte();
        this.f99311k = unsignedByte;
        this.f99311k = (unsignedByte << 16) | dataInputStream.readUnsignedShort();
        this.f99312l = dataInputStream.readShort();
        this.f99313m = new int[3];
        this.f99313m[0] = dataInputStream.readUnsignedByte();
        this.f99313m[1] = dataInputStream.readUnsignedByte();
        this.f99313m[2] = dataInputStream.readUnsignedByte();
        this.f99314n = new int[]{dataInputStream.readUnsignedByte(), 0, 0};
        this.f99314n[1] = dataInputStream.readUnsignedByte();
        this.f99314n[2] = dataInputStream.readUnsignedByte();
        this.f99315o = new b[unsignedShort];
        for (int i11 = 0; i11 < unsignedShort; i11++) {
            int unsignedByte2 = dataInputStream.readUnsignedByte();
            byte b11 = dataInputStream.readByte();
            int unsignedShort2 = dataInputStream.readUnsignedShort();
            int unsignedShort3 = dataInputStream.readUnsignedShort();
            for (long jSkip = 0; jSkip < 2; jSkip += dataInputStream.skip(2L)) {
            }
            this.f99315o[i11] = new b(unsignedByte2, b11, unsignedShort2, unsignedShort3);
        }
        this.f99316p = dataInputStream.readUnsignedByte();
        this.f99317q = dataInputStream.readUnsignedByte();
        j(dataInputStream.readUnsignedShort());
        h(dataInputStream.readUnsignedShort());
        this.f99318r = dataInputStream.readUnsignedByte();
        this.f99319s = dataInputStream.readUnsignedByte();
        this.f99320t = dataInputStream.readUnsignedShort();
        this.f99321u = dataInputStream.readUnsignedShort();
        if (f() <= 0) {
            j(800);
        }
        if (a() <= 0) {
            h(600);
        }
        i(u(this.f99317q));
        g(inputStream, ((this.f99307g - 20) - ((long) (unsignedShort * 8))) - 12);
    }

    @Override // br0.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FaceImageInfo [");
        sb2.append("Image size: ");
        sb2.append(f());
        sb2.append(" x ");
        sb2.append(a());
        sb2.append(", ");
        sb2.append("Gender: ");
        net.sf.scuba.data.a aVar = this.f99308h;
        if (aVar == null) {
            aVar = net.sf.scuba.data.a.UNSPECIFIED;
        }
        sb2.append(aVar);
        sb2.append(", ");
        sb2.append("Eye color: ");
        EnumC2115a enumC2115a = this.f99309i;
        if (enumC2115a == null) {
            enumC2115a = EnumC2115a.UNSPECIFIED;
        }
        sb2.append(enumC2115a);
        sb2.append(", ");
        sb2.append("Hair color: ");
        sb2.append(q());
        sb2.append(", ");
        sb2.append("Feature mask: ");
        sb2.append(o());
        sb2.append(", ");
        sb2.append("Expression: ");
        sb2.append(m());
        sb2.append(", ");
        sb2.append("Pose angle: ");
        sb2.append(r());
        sb2.append(", ");
        sb2.append("Face image type: ");
        sb2.append(n());
        sb2.append(", ");
        sb2.append("Source type: ");
        sb2.append(t());
        sb2.append(", ");
        sb2.append("FeaturePoints [");
        b[] bVarArr = this.f99315o;
        if (bVarArr != null && bVarArr.length > 0) {
            boolean z11 = true;
            for (b bVar : bVarArr) {
                if (z11) {
                    z11 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(bVar.toString());
            }
        }
        sb2.append("]");
        sb2.append("]");
        return sb2.toString();
    }

    public void w(OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        v(byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        long length = ((long) byteArray.length) + 4;
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt((int) length);
        dataOutputStream.write(byteArray);
        dataOutputStream.flush();
    }

    public static class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f99322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f99323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f99324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f99325d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f99326e;

        public b(int i11, int i12, int i13, int i14, int i15) {
            this.f99322a = i11;
            this.f99323b = i12;
            this.f99324c = i13;
            this.f99325d = i14;
            this.f99326e = i15;
        }

        public int a() {
            return this.f99323b;
        }

        public int b() {
            return this.f99324c;
        }

        public int c() {
            return this.f99322a;
        }

        public int d() {
            return this.f99325d;
        }

        public int e() {
            return this.f99326e;
        }

        public String toString() {
            return "( point: " + a() + "." + b() + ", type: " + Integer.toHexString(this.f99322a) + ", (" + this.f99325d + ", " + this.f99326e + "))";
        }

        b(int i11, byte b11, int i12, int i13) {
            this(i11, (b11 & 240) >> 4, b11 & 15, i12, i13);
        }
    }

    public a(InputStream inputStream) throws IOException {
        super(0);
        s(inputStream);
    }
}
