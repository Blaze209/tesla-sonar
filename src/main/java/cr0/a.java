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
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.HttpUrl;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes10.dex */
public class a extends k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Logger f59123s = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f59124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f59125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f59126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f59127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f59128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<String> f59129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f59130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f59131l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f59132m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f59133n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte[] f59134o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<String> f59135p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f59136q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<Integer> f59137r;

    public a(InputStream inputStream) {
        super(107, inputStream);
    }

    private void A(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            f59123s.log(Level.WARNING, "Exception", (Throwable) e11);
        }
        this.f59126g = str.trim();
    }

    private void B(byte[] bArr) {
        try {
            this.f59133n = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e11) {
            f59123s.log(Level.WARNING, "Exception", (Throwable) e11);
            this.f59133n = new String(bArr).trim();
        }
    }

    private void C(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            f59123s.log(Level.WARNING, "Exception", (Throwable) e11);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "<");
        this.f59128i = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            this.f59128i.add(stringTokenizer.nextToken().trim());
        }
    }

    private void D(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            f59123s.log(Level.WARNING, "Exception", (Throwable) e11);
        }
        this.f59131l = str.trim();
    }

    private void E(byte[] bArr) {
        this.f59134o = bArr;
    }

    private void F(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            f59123s.log(Level.WARNING, "Exception", (Throwable) e11);
        }
        this.f59130k = str.replace("<", " ").trim();
    }

    private void G(byte[] bArr) {
        try {
            this.f59132m = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e11) {
            f59123s.log(Level.WARNING, "Exception", (Throwable) e11);
            this.f59132m = new String(bArr).trim();
        }
    }

    private void H(int i11, ap0.b bVar) throws IOException {
        int iN = bVar.n();
        if (iN == 160) {
            bVar.c();
            int iN2 = bVar.n();
            if (iN2 != 2) {
                throw new IllegalArgumentException("Expected " + Integer.toHexString(2) + ", found " + Integer.toHexString(iN2));
            }
            int iC = bVar.c();
            if (iC != 1) {
                throw new IllegalArgumentException("Expected length 1 count length, found " + iC);
            }
            byte[] bArrO = bVar.o();
            if (bArrO == null || bArrO.length != 1) {
                throw new IllegalArgumentException("Number of content specific fields should be encoded in single byte, found " + Arrays.toString(bArrO));
            }
            int i12 = bArrO[0] & 255;
            for (int i13 = 0; i13 < i12; i13++) {
                int iN3 = bVar.n();
                if (iN3 != 24335) {
                    throw new IllegalArgumentException("Expected " + Integer.toHexString(24335) + ", found " + Integer.toHexString(iN3));
                }
                bVar.c();
                x(bVar.o());
            }
            return;
        }
        if (iN != i11) {
            throw new IllegalArgumentException("Expected " + Integer.toHexString(i11) + ", but found " + Integer.toHexString(iN));
        }
        bVar.c();
        byte[] bArrO2 = bVar.o();
        if (iN == 24363) {
            v(bArrO2);
            return;
        }
        if (iN == 24386) {
            z(bArrO2);
            return;
        }
        switch (iN) {
            case 24334:
                w(bArrO2);
                return;
            case 24335:
                x(bArrO2);
                return;
            case 24336:
                A(bArrO2);
                return;
            case 24337:
                C(bArrO2);
                return;
            case 24338:
                F(bArrO2);
                return;
            case 24339:
                D(bArrO2);
                return;
            case 24340:
                G(bArrO2);
                return;
            case 24341:
                B(bArrO2);
                return;
            case 24342:
                E(bArrO2);
                return;
            case 24343:
                y(bArrO2);
                return;
            case 24344:
                u(bArrO2);
                return;
            default:
                throw new IllegalArgumentException("Unknown field tag in DG11: " + Integer.toHexString(iN));
        }
    }

    private void u(byte[] bArr) {
        try {
            this.f59136q = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e11) {
            f59123s.log(Level.WARNING, "Exception", (Throwable) e11);
            this.f59136q = new String(bArr).trim();
        }
    }

    private void v(byte[] bArr) {
        String str;
        if (bArr.length == 4) {
            str = bp0.a.b(bArr);
        } else {
            String str2 = new String(bArr);
            try {
                str = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e11) {
                f59123s.log(Level.WARNING, "Exception", (Throwable) e11);
                str = str2;
            }
        }
        this.f59127h = str;
    }

    private void w(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            f59123s.log(Level.WARNING, "Exception", (Throwable) e11);
        }
        this.f59124e = str.trim();
    }

    private synchronized void x(byte[] bArr) {
        if (this.f59125f == null) {
            this.f59125f = new ArrayList();
        }
        try {
            this.f59125f.add(new String(bArr, "UTF-8").trim());
        } catch (UnsupportedEncodingException e11) {
            f59123s.log(Level.WARNING, "Exception", (Throwable) e11);
            this.f59125f.add(new String(bArr).trim());
        }
    }

    private void y(byte[] bArr) {
        String strTrim = new String(bArr).trim();
        try {
            strTrim = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            f59123s.log(Level.WARNING, "Exception", (Throwable) e11);
        }
        this.f59135p = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(strTrim, "<");
        while (stringTokenizer.hasMoreTokens()) {
            this.f59135p.add(stringTokenizer.nextToken().trim());
        }
    }

    private void z(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            f59123s.log(Level.WARNING, "Exception", (Throwable) e11);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "<");
        this.f59129j = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            this.f59129j.add(stringTokenizer.nextToken().trim());
        }
    }

    @Override // br0.e
    public int d() {
        return 107;
    }

    @Override // br0.e
    protected void e(InputStream inputStream) throws IOException {
        ap0.b bVar = inputStream instanceof ap0.b ? (ap0.b) inputStream : new ap0.b(inputStream);
        if (bVar.n() != 92) {
            throw new IllegalArgumentException("Expected tag list in DG11");
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
                H(((Integer) it.next()).intValue(), bVar);
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
            return toString().equals(((a) obj).toString());
        }
        return false;
    }

    @Override // br0.e
    protected void g(OutputStream outputStream) throws IOException {
        ap0.d dVar = outputStream instanceof ap0.d ? (ap0.d) outputStream : new ap0.d(outputStream);
        dVar.n(92);
        DataOutputStream dataOutputStream = new DataOutputStream(dVar);
        List<Integer> listR = r();
        Iterator<Integer> it = listR.iterator();
        while (it.hasNext()) {
            dataOutputStream.writeShort(it.next().intValue());
        }
        dataOutputStream.flush();
        dVar.p();
        Iterator<Integer> it2 = listR.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if (iIntValue != 24363) {
                boolean z11 = true;
                if (iIntValue != 24386) {
                    switch (iIntValue) {
                        case 24334:
                            dVar.n(iIntValue);
                            dVar.o(this.f59124e.trim().getBytes("UTF-8"));
                            break;
                        case 24335:
                            if (this.f59125f == null) {
                                this.f59125f = new ArrayList();
                            }
                            dVar.n(160);
                            dVar.n(2);
                            dVar.write(this.f59125f.size());
                            dVar.p();
                            for (String str : this.f59125f) {
                                dVar.n(24335);
                                dVar.o(str.trim().getBytes("UTF-8"));
                            }
                            dVar.p();
                            break;
                        case 24336:
                            dVar.n(iIntValue);
                            dVar.o(this.f59126g.trim().getBytes("UTF-8"));
                            break;
                        case 24337:
                            dVar.n(iIntValue);
                            for (String str2 : this.f59128i) {
                                if (str2 != null) {
                                    if (z11) {
                                        z11 = false;
                                    } else {
                                        dVar.write(60);
                                    }
                                    dVar.write(str2.trim().getBytes("UTF-8"));
                                }
                            }
                            dVar.p();
                            break;
                        case 24338:
                            dVar.n(iIntValue);
                            dVar.o(this.f59130k.trim().replace(' ', '<').getBytes("UTF-8"));
                            break;
                        case 24339:
                            dVar.n(iIntValue);
                            dVar.o(this.f59131l.trim().replace(' ', '<').getBytes("UTF-8"));
                            break;
                        case 24340:
                            dVar.n(iIntValue);
                            dVar.o(this.f59132m.trim().replace(' ', '<').getBytes("UTF-8"));
                            break;
                        case 24341:
                            dVar.n(iIntValue);
                            dVar.o(this.f59133n.trim().replace(' ', '<').getBytes("UTF-8"));
                            break;
                        case 24342:
                            dVar.n(iIntValue);
                            dVar.o(this.f59134o);
                            break;
                        case 24343:
                            dVar.n(iIntValue);
                            for (String str3 : this.f59135p) {
                                if (str3 != null) {
                                    if (z11) {
                                        z11 = false;
                                    } else {
                                        dVar.write(60);
                                    }
                                    dVar.write(str3.trim().replace(' ', '<').getBytes("UTF-8"));
                                }
                            }
                            dVar.p();
                            break;
                        case 24344:
                            dVar.n(iIntValue);
                            dVar.o(this.f59136q.trim().replace(' ', '<').getBytes("UTF-8"));
                            break;
                        default:
                            throw new IllegalStateException("Unknown tag in DG11: " + Integer.toHexString(iIntValue));
                    }
                } else {
                    dVar.n(iIntValue);
                    for (String str4 : this.f59129j) {
                        if (str4 != null) {
                            if (z11) {
                                z11 = false;
                            } else {
                                dVar.write(60);
                            }
                            dVar.write(str4.trim().getBytes("UTF-8"));
                        }
                    }
                    dVar.p();
                }
            } else {
                dVar.n(iIntValue);
                dVar.o(this.f59127h.getBytes("UTF-8"));
            }
        }
    }

    public String h() {
        return this.f59136q;
    }

    public int hashCode() {
        return (toString().hashCode() * 13) + 111;
    }

    public String i() {
        return this.f59127h;
    }

    public String j() {
        return this.f59124e;
    }

    public List<String> k() {
        return this.f59125f == null ? new ArrayList() : new ArrayList(this.f59125f);
    }

    public List<String> l() {
        return this.f59135p;
    }

    public List<String> m() {
        return this.f59129j;
    }

    public String n() {
        return this.f59126g;
    }

    public String o() {
        return this.f59133n;
    }

    public List<String> p() {
        return this.f59128i;
    }

    public String q() {
        return this.f59131l;
    }

    public List<Integer> r() {
        List<Integer> list = this.f59137r;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(12);
        this.f59137r = arrayList;
        if (this.f59124e != null) {
            arrayList.add(24334);
        }
        List<String> list2 = this.f59125f;
        if (list2 != null && !list2.isEmpty()) {
            this.f59137r.add(24335);
        }
        if (this.f59126g != null) {
            this.f59137r.add(24336);
        }
        if (this.f59127h != null) {
            this.f59137r.add(Integer.valueOf(EACTags.DATE_OF_BIRTH));
        }
        List<String> list3 = this.f59128i;
        if (list3 != null && !list3.isEmpty()) {
            this.f59137r.add(24337);
        }
        List<String> list4 = this.f59129j;
        if (list4 != null && !list4.isEmpty()) {
            this.f59137r.add(Integer.valueOf(EACTags.ADDRESS));
        }
        if (this.f59130k != null) {
            this.f59137r.add(24338);
        }
        if (this.f59131l != null) {
            this.f59137r.add(24339);
        }
        if (this.f59132m != null) {
            this.f59137r.add(24340);
        }
        if (this.f59133n != null) {
            this.f59137r.add(24341);
        }
        if (this.f59134o != null) {
            this.f59137r.add(24342);
        }
        List<String> list5 = this.f59135p;
        if (list5 != null && !list5.isEmpty()) {
            this.f59137r.add(24343);
        }
        if (this.f59136q != null) {
            this.f59137r.add(24344);
        }
        return this.f59137r;
    }

    public String s() {
        return this.f59130k;
    }

    public String t() {
        return this.f59132m;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DG11File [");
        String str2 = this.f59124e;
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append(", ");
        List<String> list = this.f59125f;
        String string = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        sb2.append((list == null || list.isEmpty()) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : this.f59125f);
        sb2.append(", ");
        String str3 = this.f59126g;
        if (str3 == null) {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", ");
        String str4 = this.f59127h;
        if (str4 == null) {
            str4 = "";
        }
        sb2.append(str4);
        sb2.append(", ");
        List<String> list2 = this.f59128i;
        sb2.append((list2 == null || list2.isEmpty()) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : this.f59128i.toString());
        sb2.append(", ");
        List<String> list3 = this.f59129j;
        sb2.append((list3 == null || list3.isEmpty()) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : this.f59129j.toString());
        sb2.append(", ");
        String str5 = this.f59130k;
        if (str5 == null) {
            str5 = "";
        }
        sb2.append(str5);
        sb2.append(", ");
        String str6 = this.f59131l;
        if (str6 == null) {
            str6 = "";
        }
        sb2.append(str6);
        sb2.append(", ");
        String str7 = this.f59132m;
        if (str7 == null) {
            str7 = "";
        }
        sb2.append(str7);
        sb2.append(", ");
        String str8 = this.f59133n;
        if (str8 == null) {
            str8 = "";
        }
        sb2.append(str8);
        sb2.append(", ");
        if (this.f59134o == null) {
            str = "";
        } else {
            str = "image (" + this.f59134o.length + ")";
        }
        sb2.append(str);
        sb2.append(", ");
        List<String> list4 = this.f59135p;
        if (list4 != null && !list4.isEmpty()) {
            string = this.f59135p.toString();
        }
        sb2.append(string);
        sb2.append(", ");
        String str9 = this.f59136q;
        sb2.append(str9 != null ? str9 : "");
        sb2.append("]");
        return sb2.toString();
    }
}
