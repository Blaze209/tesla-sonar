package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.util.encoders.Base64;

/* JADX INFO: loaded from: classes9.dex */
class PEMUtil {
    private final Boundaries[] _supportedBoundaries;

    private static class Boundaries {
        private final String _footer;
        private final String _header;

        private Boundaries(String str) {
            this._header = "-----BEGIN " + str + "-----";
            this._footer = "-----END " + str + "-----";
        }

        public boolean isTheExpectedFooter(String str) {
            return str.startsWith(this._footer);
        }

        public boolean isTheExpectedHeader(String str) {
            return str.startsWith(this._header);
        }
    }

    PEMUtil(String str) {
        this._supportedBoundaries = new Boundaries[]{new Boundaries(str), new Boundaries("X509 " + str), new Boundaries("PKCS7")};
    }

    private Boundaries getBoundaries(String str) {
        int i11 = 0;
        while (true) {
            Boundaries[] boundariesArr = this._supportedBoundaries;
            if (i11 == boundariesArr.length) {
                return null;
            }
            Boundaries boundaries = boundariesArr[i11];
            if (boundaries.isTheExpectedHeader(str) || boundaries.isTheExpectedFooter(str)) {
                return boundaries;
            }
            i11++;
        }
    }

    private String readLine(InputStream inputStream) throws IOException {
        int i11;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i11 = inputStream.read();
            if (i11 != 13 && i11 != 10 && i11 >= 0) {
                stringBuffer.append((char) i11);
            } else if (i11 < 0 || stringBuffer.length() != 0) {
                break;
            }
        }
        if (i11 < 0) {
            if (stringBuffer.length() == 0) {
                return null;
            }
            return stringBuffer.toString();
        }
        if (i11 == 13) {
            inputStream.mark(1);
            int i12 = inputStream.read();
            if (i12 == 10) {
                inputStream.mark(1);
            }
            if (i12 > 0) {
                inputStream.reset();
            }
        }
        return stringBuffer.toString();
    }

    ASN1Sequence readPEMObject(InputStream inputStream, boolean z11) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        Boundaries boundaries = null;
        while (boundaries == null) {
            String line = readLine(inputStream);
            if (line == null) {
                break;
            }
            boundaries = getBoundaries(line);
            if (boundaries != null && !boundaries.isTheExpectedHeader(line)) {
                throw new IOException("malformed PEM data: found footer where header was expected");
            }
        }
        if (boundaries == null) {
            if (z11) {
                throw new IOException("malformed PEM data: no header found");
            }
            return null;
        }
        Boundaries boundaries2 = null;
        while (boundaries2 == null) {
            String line2 = readLine(inputStream);
            if (line2 == null) {
                break;
            }
            boundaries2 = getBoundaries(line2);
            if (boundaries2 == null) {
                stringBuffer.append(line2);
            } else if (!boundaries.isTheExpectedFooter(line2)) {
                throw new IOException("malformed PEM data: header/footer mismatch");
            }
        }
        if (boundaries2 == null) {
            throw new IOException("malformed PEM data: no footer found");
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        try {
            return ASN1Sequence.getInstance(Base64.decode(stringBuffer.toString()));
        } catch (Exception unused) {
            throw new IOException("malformed PEM data encountered");
        }
    }
}
