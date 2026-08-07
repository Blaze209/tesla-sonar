package cr0;

import br0.k;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes10.dex */
public class b extends k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Logger f59138o = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f59139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f59140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f59141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f59142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f59143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f59144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f59145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f59146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f59147m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<Integer> f59148n;

    public b(InputStream inputStream) {
        super(108, inputStream);
    }

    private void j(byte[] bArr) {
        try {
            this.f59146l = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e11) {
            f59138o.log(Level.WARNING, "Exception", (Throwable) e11);
        }
    }

    private void k(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Wrong date format");
        }
        if (bArr.length == 8) {
            try {
                this.f59140f = new String(bArr, "UTF-8").trim();
                return;
            } catch (UnsupportedEncodingException e11) {
                f59138o.log(Level.WARNING, "Exception", (Throwable) e11);
            }
        }
        f59138o.warning("DG12 date of issue is not in expected ccyymmdd ASCII format");
        if (bArr.length != 4) {
            throw new IllegalArgumentException("Wrong date format");
        }
        this.f59140f = bp0.a.b(bArr).trim();
    }

    private void l(byte[] bArr) {
        try {
            this.f59142h = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e11) {
            f59138o.log(Level.WARNING, "Exception", (Throwable) e11);
            this.f59142h = new String(bArr).trim();
        }
    }

    private void m(byte[] bArr) {
        this.f59144j = bArr;
    }

    private void n(byte[] bArr) {
        this.f59145k = bArr;
    }

    private void o(byte[] bArr) {
        try {
            this.f59139e = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e11) {
            f59138o.log(Level.WARNING, "Exception", (Throwable) e11);
            this.f59139e = new String(bArr).trim();
        }
    }

    private synchronized void p(byte[] bArr) {
        if (this.f59141g == null) {
            this.f59141g = new ArrayList();
        }
        try {
            this.f59141g.add(new String(bArr, "UTF-8").trim());
        } catch (UnsupportedEncodingException e11) {
            f59138o.log(Level.WARNING, "Exception", (Throwable) e11);
            this.f59141g.add(new String(bArr).trim());
        }
    }

    private void q(byte[] bArr) {
        try {
            this.f59147m = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e11) {
            f59138o.log(Level.WARNING, "Exception", (Throwable) e11);
            this.f59147m = new String(bArr).trim();
        }
    }

    private void r(byte[] bArr) {
        try {
            this.f59143i = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e11) {
            f59138o.log(Level.WARNING, "Exception", (Throwable) e11);
            this.f59143i = new String(bArr).trim();
        }
    }

    private void s(int i11, ap0.b bVar) throws IOException {
        int iN = bVar.n();
        if (iN != 160) {
            if (iN != i11) {
                throw new IllegalArgumentException("Expected " + Integer.toHexString(i11) + ", but found " + Integer.toHexString(iN));
            }
            bVar.c();
            byte[] bArrO = bVar.o();
            if (iN == 24358) {
                k(bArrO);
                return;
            }
            if (iN == 24405) {
                j(bArrO);
                return;
            }
            if (iN == 24406) {
                q(bArrO);
                return;
            }
            switch (iN) {
                case 24345:
                    o(bArrO);
                    return;
                case 24346:
                    p(bArrO);
                    return;
                case 24347:
                    l(bArrO);
                    return;
                case 24348:
                    r(bArrO);
                    return;
                case 24349:
                    m(bArrO);
                    return;
                case 24350:
                    n(bArrO);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown field tag in DG12: " + Integer.toHexString(iN));
            }
        }
        bVar.c();
        int iN2 = bVar.n();
        if (iN2 != 2) {
            throw new IllegalArgumentException("Expected " + Integer.toHexString(2) + ", found " + Integer.toHexString(iN2));
        }
        int iC = bVar.c();
        if (iC != 1) {
            throw new IllegalArgumentException("Expected length 1 count length, found " + iC);
        }
        byte[] bArrO2 = bVar.o();
        if (bArrO2 == null || bArrO2.length != 1) {
            throw new IllegalArgumentException("Number of content specific fields should be encoded in single byte, found " + Arrays.toString(bArrO2));
        }
        int i12 = bArrO2[0] & 255;
        for (int i13 = 0; i13 < i12; i13++) {
            int iN3 = bVar.n();
            if (iN3 != 24346) {
                throw new IllegalArgumentException("Expected " + Integer.toHexString(24346) + ", found " + Integer.toHexString(iN3));
            }
            bVar.c();
            p(bVar.o());
        }
    }

    @Override // br0.e
    public int d() {
        return 108;
    }

    @Override // br0.e
    protected void e(InputStream inputStream) throws IOException {
        ap0.b bVar = inputStream instanceof ap0.b ? (ap0.b) inputStream : new ap0.b(inputStream);
        if (bVar.n() != 92) {
            throw new IllegalArgumentException("Expected tag list in DG12");
        }
        int iC = bVar.c();
        int i11 = iC / 2;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bVar.o());
        try {
            ArrayList arrayList = new ArrayList(i11 + 1);
            int iE = 0;
            while (iE < iC) {
                int iN = new ap0.b(byteArrayInputStream).n();
                iE += ap0.e.e(iN);
                arrayList.add(Integer.valueOf(iN));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                s(((Integer) it.next()).intValue(), bVar);
            }
        } finally {
            byteArrayInputStream.close();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass().equals(getClass())) {
            return toString().equals(((b) obj).toString());
        }
        return false;
    }

    @Override // br0.e
    protected void g(OutputStream outputStream) throws IOException {
        ap0.d dVar = outputStream instanceof ap0.d ? (ap0.d) outputStream : new ap0.d(outputStream);
        dVar.n(92);
        List<Integer> listI = i();
        DataOutputStream dataOutputStream = new DataOutputStream(dVar);
        Iterator<Integer> it = listI.iterator();
        while (it.hasNext()) {
            dataOutputStream.writeShort(it.next().intValue());
        }
        dataOutputStream.flush();
        dVar.p();
        Iterator<Integer> it2 = listI.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if (iIntValue == 24358) {
                dVar.n(iIntValue);
                dVar.o(this.f59140f.getBytes("UTF-8"));
            } else if (iIntValue == 24405) {
                dVar.n(iIntValue);
                dVar.o(this.f59146l.getBytes("UTF-8"));
            } else if (iIntValue != 24406) {
                switch (iIntValue) {
                    case 24345:
                        dVar.n(iIntValue);
                        dVar.o(this.f59139e.trim().getBytes("UTF-8"));
                        break;
                    case 24346:
                        if (this.f59141g == null) {
                            this.f59141g = new ArrayList();
                        }
                        dVar.n(160);
                        dVar.n(2);
                        dVar.write(this.f59141g.size());
                        dVar.p();
                        for (String str : this.f59141g) {
                            dVar.n(24346);
                            dVar.o(str.trim().getBytes("UTF-8"));
                        }
                        dVar.p();
                        break;
                    case 24347:
                        dVar.n(iIntValue);
                        dVar.o(this.f59142h.trim().getBytes("UTF-8"));
                        break;
                    case 24348:
                        dVar.n(iIntValue);
                        dVar.o(this.f59143i.trim().getBytes("UTF-8"));
                        break;
                    case 24349:
                        dVar.n(iIntValue);
                        dVar.o(this.f59144j);
                        break;
                    case 24350:
                        dVar.n(iIntValue);
                        dVar.o(this.f59145k);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown field tag in DG12: " + Integer.toHexString(iIntValue));
                }
            } else {
                dVar.n(iIntValue);
                dVar.o(this.f59147m.trim().getBytes("UTF-8"));
            }
        }
    }

    public String h() {
        return this.f59140f;
    }

    public int hashCode() {
        return (toString().hashCode() * 13) + 112;
    }

    public List<Integer> i() {
        List<Integer> list = this.f59148n;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(10);
        this.f59148n = arrayList;
        if (this.f59139e != null) {
            arrayList.add(24345);
        }
        if (this.f59140f != null) {
            this.f59148n.add(Integer.valueOf(EACTags.CARD_EFFECTIVE_DATE));
        }
        List<String> list2 = this.f59141g;
        if (list2 != null && !list2.isEmpty()) {
            this.f59148n.add(24346);
        }
        if (this.f59142h != null) {
            this.f59148n.add(24347);
        }
        if (this.f59143i != null) {
            this.f59148n.add(24348);
        }
        if (this.f59144j != null) {
            this.f59148n.add(24349);
        }
        if (this.f59145k != null) {
            this.f59148n.add(24350);
        }
        if (this.f59146l != null) {
            this.f59148n.add(24405);
        }
        if (this.f59147m != null) {
            this.f59148n.add(24406);
        }
        return this.f59148n;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DG12File [");
        String str3 = this.f59139e;
        if (str3 == null) {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", ");
        String str4 = this.f59140f;
        if (str4 == null) {
            str4 = "";
        }
        sb2.append(str4);
        sb2.append(", ");
        List<String> list = this.f59141g;
        sb2.append((list == null || list.isEmpty()) ? "" : this.f59141g);
        sb2.append(", ");
        String str5 = this.f59142h;
        if (str5 == null) {
            str5 = "";
        }
        sb2.append(str5);
        sb2.append(", ");
        String str6 = this.f59143i;
        if (str6 == null) {
            str6 = "";
        }
        sb2.append(str6);
        sb2.append(", ");
        if (this.f59144j == null) {
            str = "";
        } else {
            str = "image (" + this.f59144j.length + ")";
        }
        sb2.append(str);
        sb2.append(", ");
        if (this.f59145k == null) {
            str2 = "";
        } else {
            str2 = "image (" + this.f59145k.length + ")";
        }
        sb2.append(str2);
        sb2.append(", ");
        String str7 = this.f59146l;
        if (str7 == null) {
            str7 = "";
        }
        sb2.append(str7);
        sb2.append(", ");
        String str8 = this.f59147m;
        sb2.append(str8 != null ? str8 : "");
        sb2.append("]");
        return sb2.toString();
    }
}
