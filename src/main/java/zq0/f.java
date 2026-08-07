package zq0;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlException;
import java.util.HashMap;
import java.util.logging.Logger;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f128494b = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b<?> f128495a;

    public f(b<?> bVar) {
        this.f128495a = bVar;
    }

    private byte[] b(InputStream inputStream) throws IOException {
        ap0.b bVar = inputStream instanceof ap0.b ? (ap0.b) inputStream : new ap0.b(inputStream);
        int iN = bVar.n();
        int iC = bVar.c();
        if (iN == 129) {
            return bVar.o();
        }
        if (iN == 133) {
            throw new AccessControlException("Access denied. Biometric Information Template is statically protected.");
        }
        long jSkip = 0;
        if (iN == 142) {
            while (true) {
                long j11 = iC;
                if (jSkip >= j11) {
                    return null;
                }
                jSkip += bVar.skip(j11);
            }
        } else {
            if (iN != 158) {
                f128494b.info("Unsupported data object tag " + Integer.toHexString(iN));
                return null;
            }
            while (true) {
                long j12 = iC;
                if (jSkip >= j12) {
                    return null;
                }
                jSkip += bVar.skip(j12);
            }
        }
    }

    private i c(InputStream inputStream, int i11, int i12, int i13) throws IOException {
        ap0.b bVar = inputStream instanceof ap0.b ? (ap0.b) inputStream : new ap0.b(inputStream);
        if (i11 != 161) {
            f128494b.warning("Expected tag " + Integer.toHexString(161) + ", found " + Integer.toHexString(i11));
        }
        HashMap map = new HashMap();
        int length = 0;
        while (length < i12) {
            int iN = bVar.n();
            int iE = length + ap0.e.e(iN) + ap0.e.b(bVar.c());
            byte[] bArrO = bVar.o();
            length = iE + bArrO.length;
            map.put(Integer.valueOf(iN), bArrO);
        }
        return new i(map);
    }

    private d d(int i11, int i12, InputStream inputStream, int i13) throws IOException {
        ap0.b bVar = inputStream instanceof ap0.b ? (ap0.b) inputStream : new ap0.b(inputStream);
        if (i11 != 32608) {
            throw new IllegalArgumentException("Expected tag BIOMETRIC_INFORMATION_TEMPLATE_TAG (" + Integer.toHexString(EACTags.BIOMETRIC_INFORMATION_TEMPLATE) + "), found " + Integer.toHexString(i11) + ", index is " + i13);
        }
        int iN = bVar.n();
        int iC = bVar.c();
        if (iN == 125) {
            i(inputStream, iN, iC, i13);
            return null;
        }
        if ((iN & 160) == 160) {
            return new h(h(inputStream, c(inputStream, iN, iC, i13), i13));
        }
        throw new IllegalArgumentException("Unsupported template tag: " + Integer.toHexString(iN));
    }

    private d e(InputStream inputStream, int i11) {
        ap0.b bVar = inputStream instanceof ap0.b ? (ap0.b) inputStream : new ap0.b(inputStream);
        return d(bVar.n(), bVar.c(), inputStream, i11);
    }

    private e f(int i11, int i12, InputStream inputStream) throws IOException {
        ap0.b bVar = inputStream instanceof ap0.b ? (ap0.b) inputStream : new ap0.b(inputStream);
        e eVar = new e();
        if (i11 != 32609) {
            throw new IllegalArgumentException("Expected tag " + Integer.toHexString(EACTags.BIOMETRIC_INFORMATION_GROUP_TEMPLATE) + ", found " + Integer.toHexString(i11));
        }
        int iN = bVar.n();
        if (iN != 2) {
            throw new IllegalArgumentException("Expected tag BIOMETRIC_INFO_COUNT_TAG (" + Integer.toHexString(2) + ") in CBEFF structure, found " + Integer.toHexString(iN));
        }
        int iC = bVar.c();
        if (iC != 1) {
            throw new IllegalArgumentException("BIOMETRIC_INFO_COUNT should have length 1, found length " + iC);
        }
        byte[] bArrO = bVar.o();
        int i13 = bArrO[0] & 255;
        for (int i14 = 0; i14 < i13; i14++) {
            eVar.a(e(inputStream, i14));
        }
        return eVar;
    }

    private e g(InputStream inputStream) throws IOException {
        ap0.b bVar = inputStream instanceof ap0.b ? (ap0.b) inputStream : new ap0.b(inputStream);
        int iN = bVar.n();
        if (iN == 32609) {
            return f(iN, bVar.c(), inputStream);
        }
        throw new IllegalArgumentException("Expected tag " + Integer.toHexString(EACTags.BIOMETRIC_INFORMATION_GROUP_TEMPLATE) + ", found " + Integer.toHexString(iN));
    }

    private a h(InputStream inputStream, i iVar, int i11) throws IOException {
        ap0.b bVar = inputStream instanceof ap0.b ? (ap0.b) inputStream : new ap0.b(inputStream);
        int iN = bVar.n();
        if (iN == 24366 || iN == 32558) {
            return this.f128495a.a(inputStream, iVar, i11, bVar.c());
        }
        throw new IllegalArgumentException("Expected tag BIOMETRIC_DATA_BLOCK_TAG (" + Integer.toHexString(EACTags.CARDHOLDER_BIOMETRIC_DATA) + ") or BIOMETRIC_DATA_BLOCK_TAG_ALT (" + Integer.toHexString(EACTags.BIOMETRIC_DATA_TEMPLATE) + "), found " + Integer.toHexString(iN));
    }

    private void i(InputStream inputStream, int i11, int i12, int i13) throws IOException {
        ap0.b bVar = new ap0.b(new ByteArrayInputStream(b(inputStream)));
        try {
            h(new ByteArrayInputStream(b(inputStream)), c(bVar, bVar.n(), bVar.c(), i13), i13);
        } finally {
            bVar.close();
        }
    }

    public e a(InputStream inputStream) {
        return g(inputStream);
    }
}
