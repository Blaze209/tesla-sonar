package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class ServerSRPParams {
    protected BigInteger B;
    protected BigInteger N;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected BigInteger f99613g;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected byte[] f99614s;

    public ServerSRPParams(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, BigInteger bigInteger3) {
        this.N = bigInteger;
        this.f99613g = bigInteger2;
        this.f99614s = Arrays.clone(bArr);
        this.B = bigInteger3;
    }

    public static ServerSRPParams parse(InputStream inputStream) {
        return new ServerSRPParams(TlsSRPUtils.readSRPParameter(inputStream), TlsSRPUtils.readSRPParameter(inputStream), TlsUtils.readOpaque8(inputStream), TlsSRPUtils.readSRPParameter(inputStream));
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsSRPUtils.writeSRPParameter(this.N, outputStream);
        TlsSRPUtils.writeSRPParameter(this.f99613g, outputStream);
        TlsUtils.writeOpaque8(this.f99614s, outputStream);
        TlsSRPUtils.writeSRPParameter(this.B, outputStream);
    }

    public BigInteger getB() {
        return this.B;
    }

    public BigInteger getG() {
        return this.f99613g;
    }

    public BigInteger getN() {
        return this.N;
    }

    public byte[] getS() {
        return this.f99614s;
    }
}
