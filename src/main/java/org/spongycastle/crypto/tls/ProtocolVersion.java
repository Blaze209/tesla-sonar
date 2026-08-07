package org.spongycastle.crypto.tls;

import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes10.dex */
public final class ProtocolVersion {
    private String name;
    private int version;
    public static final ProtocolVersion SSLv3 = new ProtocolVersion(768, "SSL 3.0");
    public static final ProtocolVersion TLSv10 = new ProtocolVersion(769, "TLS 1.0");
    public static final ProtocolVersion TLSv11 = new ProtocolVersion(770, "TLS 1.1");
    public static final ProtocolVersion TLSv12 = new ProtocolVersion(771, "TLS 1.2");
    public static final ProtocolVersion DTLSv10 = new ProtocolVersion(65279, "DTLS 1.0");
    public static final ProtocolVersion DTLSv12 = new ProtocolVersion(65277, "DTLS 1.2");

    private ProtocolVersion(int i11, String str) {
        this.version = i11 & 65535;
        this.name = str;
    }

    public static ProtocolVersion get(int i11, int i12) throws TlsFatalAlert {
        if (i11 != 3) {
            if (i11 != 254) {
                throw new TlsFatalAlert((short) 47);
            }
            switch (i12) {
                case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE:
                    return DTLSv12;
                case SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE:
                    throw new TlsFatalAlert((short) 47);
                case 255:
                    return DTLSv10;
                default:
                    return getUnknownVersion(i11, i12, "DTLS");
            }
        }
        if (i12 == 0) {
            return SSLv3;
        }
        if (i12 == 1) {
            return TLSv10;
        }
        if (i12 != 2) {
            return i12 != 3 ? getUnknownVersion(i11, i12, "TLS") : TLSv12;
        }
        return TLSv11;
    }

    private static ProtocolVersion getUnknownVersion(int i11, int i12, String str) throws TlsFatalAlert {
        TlsUtils.checkUint8(i11);
        TlsUtils.checkUint8(i12);
        int i13 = (i11 << 8) | i12;
        return new ProtocolVersion(i13, str + " 0x" + Strings.toUpperCase(Integer.toHexString(65536 | i13).substring(1)));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ProtocolVersion) && equals((ProtocolVersion) obj);
        }
        return true;
    }

    public ProtocolVersion getEquivalentTLSVersion() {
        if (isDTLS()) {
            return this == DTLSv10 ? TLSv11 : TLSv12;
        }
        return this;
    }

    public int getFullVersion() {
        return this.version;
    }

    public int getMajorVersion() {
        return this.version >> 8;
    }

    public int getMinorVersion() {
        return this.version & 255;
    }

    public int hashCode() {
        return this.version;
    }

    public boolean isDTLS() {
        return getMajorVersion() == 254;
    }

    public boolean isEqualOrEarlierVersionOf(ProtocolVersion protocolVersion) {
        if (getMajorVersion() != protocolVersion.getMajorVersion()) {
            return false;
        }
        int minorVersion = protocolVersion.getMinorVersion() - getMinorVersion();
        if (isDTLS()) {
            return minorVersion <= 0;
        }
        return minorVersion >= 0;
    }

    public boolean isLaterVersionOf(ProtocolVersion protocolVersion) {
        if (getMajorVersion() != protocolVersion.getMajorVersion()) {
            return false;
        }
        int minorVersion = protocolVersion.getMinorVersion() - getMinorVersion();
        if (isDTLS()) {
            return minorVersion > 0;
        }
        return minorVersion < 0;
    }

    public boolean isSSL() {
        return this == SSLv3;
    }

    public boolean isTLS() {
        return getMajorVersion() == 3;
    }

    public String toString() {
        return this.name;
    }

    public boolean equals(ProtocolVersion protocolVersion) {
        return protocolVersion != null && this.version == protocolVersion.version;
    }
}
