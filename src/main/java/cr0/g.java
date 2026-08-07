package cr0;

import ezvcard.property.Gender;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public class g extends br0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f59157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f59158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f59159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f59160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f59161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f59162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f59163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f59164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private net.sf.scuba.data.a f59165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f59166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private char f59167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private char f59168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private char f59169n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private char f59170o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private char f59171p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f59172q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f59173r;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f59175b;

        static {
            int[] iArr = new int[net.sf.scuba.data.a.values().length];
            f59175b = iArr;
            try {
                iArr[net.sf.scuba.data.a.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59175b[net.sf.scuba.data.a.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[b.values().length];
            f59174a = iArr2;
            try {
                iArr2[b.TD1.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59174a[b.TD2.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59174a[b.MRVB.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59174a[b.MRVA.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f59174a[b.TD3.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private enum b {
        UNKNOWN(0),
        TD1(1),
        TD2(2),
        TD3(3),
        MRVA(4),
        MRVB(5);

        private int code;

        b(int i11) {
            this.code = i11;
        }

        public int getCode() {
            return this.code;
        }
    }

    public g(InputStream inputStream, int i11) {
        try {
            o(inputStream, i11);
        } catch (IOException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    private void A(DataOutputStream dataOutputStream, int i11) throws IOException {
        dataOutputStream.write(j(this.f59160e, this.f59161f, i11).getBytes("UTF-8"));
    }

    private void B(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        y(dataOutputStream);
        v(this.f59159d, dataOutputStream);
        if (this.f59163h.length() > 9) {
            E(this.f59163h.substring(0, 9), dataOutputStream, 9);
            dataOutputStream.write(60);
            E(this.f59163h.substring(9) + Character.toString(this.f59167l) + "<" + this.f59172q, dataOutputStream, 15);
        } else {
            E(this.f59163h, dataOutputStream, 9);
            dataOutputStream.write(this.f59167l);
            E(this.f59172q, dataOutputStream, 15);
        }
        w(dataOutputStream);
        dataOutputStream.write(this.f59168m);
        z(dataOutputStream);
        x(dataOutputStream);
        dataOutputStream.write(this.f59169n);
        v(this.f59162g, dataOutputStream);
        E(this.f59173r, dataOutputStream, 11);
        dataOutputStream.write(this.f59171p);
        A(dataOutputStream, 30);
    }

    private void C(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        y(dataOutputStream);
        v(this.f59159d, dataOutputStream);
        A(dataOutputStream, 31);
        boolean z11 = this.f59157b == b.TD2 && this.f59163h.length() > 9 && e(this.f59172q, "");
        if (z11) {
            E(this.f59163h.substring(0, 9), dataOutputStream, 9);
            dataOutputStream.write(60);
        } else {
            E(this.f59163h, dataOutputStream, 9);
            dataOutputStream.write(this.f59167l);
        }
        v(this.f59162g, dataOutputStream);
        w(dataOutputStream);
        dataOutputStream.write(this.f59168m);
        z(dataOutputStream);
        x(dataOutputStream);
        dataOutputStream.write(this.f59169n);
        if (this.f59157b == b.MRVB) {
            E(this.f59172q, dataOutputStream, 8);
            return;
        }
        if (!z11) {
            E(this.f59172q, dataOutputStream, 7);
            dataOutputStream.write(this.f59171p);
            return;
        }
        E(this.f59163h.substring(9) + this.f59167l + "<", dataOutputStream, 7);
        dataOutputStream.write(this.f59171p);
    }

    private void D(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        y(dataOutputStream);
        v(this.f59159d, dataOutputStream);
        A(dataOutputStream, 39);
        E(this.f59163h, dataOutputStream, 9);
        dataOutputStream.write(this.f59167l);
        v(this.f59162g, dataOutputStream);
        w(dataOutputStream);
        dataOutputStream.write(this.f59168m);
        z(dataOutputStream);
        x(dataOutputStream);
        dataOutputStream.write(this.f59169n);
        if (this.f59157b == b.MRVA) {
            E(this.f59172q, dataOutputStream, 16);
            return;
        }
        E(this.f59172q, dataOutputStream, 14);
        dataOutputStream.write(this.f59170o);
        dataOutputStream.write(this.f59171p);
    }

    private void E(String str, DataOutputStream dataOutputStream, int i11) throws IOException {
        dataOutputStream.write(i(str, i11).getBytes("UTF-8"));
    }

    public static char b(String str) {
        return c(str, false);
    }

    private static char c(String str, boolean z11) {
        try {
            byte[] bytes = str == null ? new byte[0] : str.getBytes("UTF-8");
            int[] iArr = {7, 3, 1};
            int iD = 0;
            for (int i11 = 0; i11 < bytes.length; i11++) {
                iD = (iD + (iArr[i11 % 3] * d(bytes[i11]))) % 10;
            }
            String string = Integer.toString(iD);
            if (string.length() != 1) {
                throw new IllegalStateException("Error in computing check digit.");
            }
            char c11 = (char) string.getBytes("UTF-8")[0];
            if (z11 && c11 == '0') {
                return '<';
            }
            return c11;
        } catch (UnsupportedEncodingException e11) {
            throw new IllegalStateException("Error in computing check digit", e11);
        } catch (NumberFormatException e12) {
            throw new IllegalStateException("Error in computing check digit", e12);
        } catch (Exception e13) {
            throw new IllegalArgumentException("Error in computing check digit", e13);
        }
    }

    private static int d(byte b11) {
        if (b11 == 60) {
            return 0;
        }
        switch (b11) {
            case 48:
                return 0;
            case 49:
                return 1;
            case 50:
                return 2;
            case 51:
                return 3;
            case 52:
                return 4;
            case 53:
                return 5;
            case 54:
                return 6;
            case 55:
                return 7;
            case 56:
                return 8;
            case 57:
                return 9;
            default:
                switch (b11) {
                    case 65:
                        return 10;
                    case 66:
                        return 11;
                    case 67:
                        return 12;
                    case 68:
                        return 13;
                    case 69:
                        return 14;
                    case 70:
                        return 15;
                    case 71:
                        return 16;
                    case 72:
                        return 17;
                    case 73:
                        return 18;
                    case 74:
                        return 19;
                    case 75:
                        return 20;
                    case 76:
                        return 21;
                    case 77:
                        return 22;
                    case 78:
                        return 23;
                    case 79:
                        return 24;
                    case 80:
                        return 25;
                    case 81:
                        return 26;
                    case 82:
                        return 27;
                    case 83:
                        return 28;
                    case 84:
                        return 29;
                    case 85:
                        return 30;
                    case 86:
                        return 31;
                    case 87:
                        return 32;
                    case 88:
                        return 33;
                    case 89:
                        return 34;
                    case 90:
                        return 35;
                    default:
                        switch (b11) {
                            case 97:
                                return 10;
                            case 98:
                                return 11;
                            case 99:
                                return 12;
                            case 100:
                                return 13;
                            case 101:
                                return 14;
                            case 102:
                                return 15;
                            case 103:
                                return 16;
                            case 104:
                                return 17;
                            case 105:
                                return 18;
                            case 106:
                                return 19;
                            case 107:
                                return 20;
                            case 108:
                                return 21;
                            case 109:
                                return 22;
                            case 110:
                                return 23;
                            case 111:
                                return 24;
                            case 112:
                                return 25;
                            case 113:
                                return 26;
                            case 114:
                                return 27;
                            case 115:
                                return 28;
                            case 116:
                                return 29;
                            case 117:
                                return 30;
                            case 118:
                                return 31;
                            case 119:
                                return 32;
                            case 120:
                                return 33;
                            case 121:
                                return 34;
                            case 122:
                                return 35;
                            default:
                                throw new NumberFormatException("Could not decode MRZ character " + ((int) b11) + " ('" + Character.toString((char) b11) + "')");
                        }
                }
        }
    }

    public static boolean e(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int iMax = Math.max(str.length(), str2.length());
        return i(str, iMax).equals(i(str2, iMax));
    }

    private static String f(net.sf.scuba.data.a aVar) {
        int i11 = a.f59175b[aVar.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? "<" : Gender.FEMALE;
        }
        return Gender.MALE;
    }

    private static b g(String str, int i11) {
        if (str == null || str.length() < 1 || str.length() > 2) {
            throw new IllegalArgumentException("Was expecting 1 or 2 digit document code, got " + str);
        }
        if (i11 == 72) {
            return str.startsWith("V") ? b.MRVB : b.TD2;
        }
        if (i11 != 88) {
            return i11 != 90 ? b.UNKNOWN : b.TD1;
        }
        return str.startsWith("V") ? b.MRVA : b.TD3;
    }

    private static String i(String str, int i11) {
        if (str == null) {
            return "";
        }
        if (str.length() > i11) {
            throw new IllegalArgumentException("Argument too wide (" + str.length() + " > " + i11 + ")");
        }
        String strTrim = str.toUpperCase().trim();
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < strTrim.length(); i12++) {
            char cCharAt = strTrim.charAt(i12);
            if ("<0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(cCharAt) == -1) {
                sb2.append('<');
            } else {
                sb2.append(cCharAt);
            }
        }
        while (sb2.length() < i11) {
            sb2.append("<");
        }
        return sb2.toString();
    }

    private static String j(String str, String str2, int i11) {
        String[] strArrSplit = str.split(" |<");
        String[] strArrSplit2 = (str2 == null || str2.trim().isEmpty()) ? new String[0] : str2.split(" |<");
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        boolean z12 = true;
        for (String str3 : strArrSplit) {
            if (z12) {
                z12 = false;
            } else {
                sb2.append('<');
            }
            sb2.append(str3);
        }
        if (str2 != null && !str2.trim().isEmpty()) {
            sb2.append("<<");
            for (String str4 : strArrSplit2) {
                if (z11) {
                    z11 = false;
                } else {
                    sb2.append('<');
                }
                sb2.append(str4);
            }
        }
        return i(sb2.toString(), i11);
    }

    private static String k(DataInputStream dataInputStream) {
        return u(t(dataInputStream, 3));
    }

    private String l(DataInputStream dataInputStream) {
        return t(dataInputStream, 6);
    }

    private net.sf.scuba.data.a m(DataInputStream dataInputStream) throws IOException {
        String strT = t(dataInputStream, 1);
        if (Gender.MALE.equalsIgnoreCase(strT)) {
            return net.sf.scuba.data.a.MALE;
        }
        return Gender.FEMALE.equalsIgnoreCase(strT) ? net.sf.scuba.data.a.FEMALE : net.sf.scuba.data.a.UNKNOWN;
    }

    private void n(String str) {
        int iIndexOf = str.indexOf("<<");
        if (iIndexOf < 0) {
            this.f59160e = u(str).replace("<", " ");
            this.f59161f = "";
        } else {
            this.f59160e = u(str.substring(0, iIndexOf)).replace("<", " ");
            s(str.substring(iIndexOf + 2));
        }
    }

    private void o(InputStream inputStream, int i11) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        String strU = u(t(dataInputStream, 2));
        this.f59158c = strU;
        b bVarG = g(strU, i11);
        this.f59157b = bVarG;
        int i12 = a.f59174a[bVarG.ordinal()];
        if (i12 == 1) {
            p(dataInputStream);
        } else if (i12 == 2 || i12 == 3) {
            q(dataInputStream);
        } else {
            r(dataInputStream);
        }
    }

    private void p(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.f59159d = k(dataInputStream);
        this.f59163h = t(dataInputStream, 9);
        this.f59167l = (char) dataInputStream.readUnsignedByte();
        String strU = u(t(dataInputStream, 15));
        this.f59172q = strU;
        if (this.f59167l == '<' && !strU.isEmpty()) {
            int iIndexOf = this.f59172q.indexOf(60);
            if (iIndexOf < 0) {
                iIndexOf = this.f59172q.length();
            }
            int i11 = iIndexOf - 1;
            this.f59163h += this.f59172q.substring(0, i11);
            this.f59167l = this.f59172q.charAt(i11);
            String str = this.f59172q;
            this.f59172q = str.substring(Integer.min(iIndexOf + 1, str.length()));
        }
        this.f59163h = u(this.f59163h);
        this.f59164i = l(dataInputStream);
        this.f59168m = (char) dataInputStream.readUnsignedByte();
        this.f59165j = m(dataInputStream);
        this.f59166k = l(dataInputStream);
        this.f59169n = (char) dataInputStream.readUnsignedByte();
        this.f59162g = k(dataInputStream);
        this.f59173r = u(t(dataInputStream, 11));
        this.f59171p = (char) dataInputStream.readUnsignedByte();
        n(t(dataInputStream, 30));
    }

    private void q(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.f59159d = k(dataInputStream);
        n(t(dataInputStream, 31));
        this.f59163h = u(t(dataInputStream, 9));
        this.f59167l = (char) dataInputStream.readUnsignedByte();
        this.f59162g = k(dataInputStream);
        this.f59164i = l(dataInputStream);
        this.f59168m = (char) dataInputStream.readUnsignedByte();
        this.f59165j = m(dataInputStream);
        this.f59166k = l(dataInputStream);
        this.f59169n = (char) dataInputStream.readUnsignedByte();
        b bVar = this.f59157b;
        if (bVar == b.MRVB) {
            this.f59172q = u(t(dataInputStream, 8));
        } else if (bVar == b.TD2) {
            String strU = u(t(dataInputStream, 7));
            this.f59172q = strU;
            if (this.f59167l == '<' && !strU.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f59163h);
                String str = this.f59172q;
                sb2.append(str.substring(0, str.length() - 1));
                this.f59163h = sb2.toString();
                String str2 = this.f59172q;
                this.f59167l = str2.charAt(str2.length() - 1);
                this.f59172q = "";
            }
        }
        this.f59163h = u(this.f59163h);
        if (this.f59157b == b.TD2) {
            this.f59171p = (char) dataInputStream.readUnsignedByte();
        }
    }

    private void r(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.f59159d = k(dataInputStream);
        n(t(dataInputStream, 39));
        this.f59163h = u(t(dataInputStream, 9));
        this.f59167l = (char) dataInputStream.readUnsignedByte();
        this.f59162g = k(dataInputStream);
        this.f59164i = l(dataInputStream);
        this.f59168m = (char) dataInputStream.readUnsignedByte();
        this.f59165j = m(dataInputStream);
        this.f59166k = l(dataInputStream);
        this.f59169n = (char) dataInputStream.readUnsignedByte();
        if (this.f59157b == b.MRVA) {
            this.f59172q = u(t(dataInputStream, 16));
            return;
        }
        this.f59172q = u(t(dataInputStream, 14));
        this.f59170o = (char) dataInputStream.readUnsignedByte();
        this.f59171p = (char) dataInputStream.readUnsignedByte();
    }

    private void s(String str) {
        this.f59161f = u(str).replace("<", " ");
    }

    private static String t(DataInputStream dataInputStream, int i11) throws IOException {
        byte[] bArr = new byte[i11];
        dataInputStream.readFully(bArr);
        return new String(bArr).trim();
    }

    private static String u(String str) {
        if (str == null) {
            str = "";
        }
        byte[] bytes = str.trim().getBytes();
        for (int length = bytes.length - 1; length >= 0 && bytes[length] == 60; length--) {
            bytes[length] = 32;
        }
        return new String(bytes).trim();
    }

    private static void v(String str, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(i(str, 3).getBytes("UTF-8"));
    }

    private void w(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.f59164i.getBytes("UTF-8"));
    }

    private void x(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.f59166k.getBytes("UTF-8"));
    }

    private void y(DataOutputStream dataOutputStream) throws IOException {
        E(this.f59158c, dataOutputStream, 2);
    }

    private void z(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(f(this.f59165j).getBytes("UTF-8"));
    }

    @Override // br0.c
    public void a(OutputStream outputStream) throws IOException {
        int i11 = a.f59174a[this.f59157b.ordinal()];
        if (i11 == 1) {
            B(outputStream);
            return;
        }
        if (i11 == 2 || i11 == 3) {
            C(outputStream);
        } else {
            if (i11 != 4 && i11 != 5) {
                throw new IllegalStateException("Unsupported document type");
            }
            D(outputStream);
        }
    }

    public boolean equals(Object obj) {
        String str;
        net.sf.scuba.data.a aVar;
        String str2;
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        g gVar = (g) obj;
        return e(this.f59158c, gVar.f59158c) && e(this.f59159d, gVar.f59159d) && e(this.f59160e, gVar.f59160e) && e(this.f59161f, gVar.f59161f) && e(this.f59162g, gVar.f59162g) && e(this.f59163h, gVar.f59163h) && (e(this.f59172q, gVar.f59172q) || e(h(), gVar.h())) && ((((str = this.f59164i) == null && gVar.f59164i == null) || (str != null && str.equals(gVar.f59164i))) && ((((aVar = this.f59165j) == null && gVar.f59165j == null) || (aVar != null && aVar.equals(gVar.f59165j))) && ((((str2 = this.f59166k) == null && gVar.f59166k == null) || (str2 != null && str2.equals(gVar.f59166k))) && e(this.f59173r, gVar.f59173r))));
    }

    public String h() {
        String str = this.f59172q;
        if (str == null) {
            return null;
        }
        return str.length() > 14 ? u(this.f59172q.substring(0, 14)) : u(this.f59172q);
    }

    public int hashCode() {
        return (toString().hashCode() * 2) + 53;
    }

    public String toString() {
        try {
            String str = new String(getEncoded(), "UTF-8");
            int length = str.length();
            if (length == 72) {
                return str.substring(0, 36) + "\n" + str.substring(36, 72) + "\n";
            }
            if (length == 88) {
                return str.substring(0, 44) + "\n" + str.substring(44, 88) + "\n";
            }
            if (length != 90) {
                return str;
            }
            return str.substring(0, 30) + "\n" + str.substring(30, 60) + "\n" + str.substring(60, 90) + "\n";
        } catch (UnsupportedEncodingException e11) {
            throw new IllegalStateException(e11);
        }
    }
}
