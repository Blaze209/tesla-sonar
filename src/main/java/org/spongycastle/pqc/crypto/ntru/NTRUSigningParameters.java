package org.spongycastle.pqc.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA512Digest;

/* JADX INFO: loaded from: classes10.dex */
public class NTRUSigningParameters implements Cloneable {
    public int B;
    public int N;
    double beta;
    public double betaSq;
    int bitsF;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f99822d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f99823d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public int f99824d2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public int f99825d3;
    public Digest hashAlg;
    double normBound;
    public double normBoundSq;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f99826q;
    public int signFailTolerance;

    public NTRUSigningParameters(int i11, int i12, int i13, int i14, double d11, double d12, Digest digest) {
        this.signFailTolerance = 100;
        this.bitsF = 6;
        this.N = i11;
        this.f99826q = i12;
        this.f99822d = i13;
        this.B = i14;
        this.beta = d11;
        this.normBound = d12;
        this.hashAlg = digest;
        init();
    }

    private void init() {
        double d11 = this.beta;
        this.betaSq = d11 * d11;
        double d12 = this.normBound;
        this.normBoundSq = d12 * d12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NTRUSigningParameters)) {
            return false;
        }
        NTRUSigningParameters nTRUSigningParameters = (NTRUSigningParameters) obj;
        if (this.B != nTRUSigningParameters.B || this.N != nTRUSigningParameters.N || Double.doubleToLongBits(this.beta) != Double.doubleToLongBits(nTRUSigningParameters.beta) || Double.doubleToLongBits(this.betaSq) != Double.doubleToLongBits(nTRUSigningParameters.betaSq) || this.bitsF != nTRUSigningParameters.bitsF || this.f99822d != nTRUSigningParameters.f99822d || this.f99823d1 != nTRUSigningParameters.f99823d1 || this.f99824d2 != nTRUSigningParameters.f99824d2 || this.f99825d3 != nTRUSigningParameters.f99825d3) {
            return false;
        }
        Digest digest = this.hashAlg;
        if (digest == null) {
            if (nTRUSigningParameters.hashAlg != null) {
                return false;
            }
        } else if (!digest.getAlgorithmName().equals(nTRUSigningParameters.hashAlg.getAlgorithmName())) {
            return false;
        }
        return Double.doubleToLongBits(this.normBound) == Double.doubleToLongBits(nTRUSigningParameters.normBound) && Double.doubleToLongBits(this.normBoundSq) == Double.doubleToLongBits(nTRUSigningParameters.normBoundSq) && this.f99826q == nTRUSigningParameters.f99826q && this.signFailTolerance == nTRUSigningParameters.signFailTolerance;
    }

    public int hashCode() {
        int i11 = ((this.B + 31) * 31) + this.N;
        long jDoubleToLongBits = Double.doubleToLongBits(this.beta);
        int i12 = (i11 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.betaSq);
        int i13 = ((((((((((((i12 * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + this.bitsF) * 31) + this.f99822d) * 31) + this.f99823d1) * 31) + this.f99824d2) * 31) + this.f99825d3) * 31;
        Digest digest = this.hashAlg;
        int iHashCode = i13 + (digest == null ? 0 : digest.getAlgorithmName().hashCode());
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.normBound);
        int i14 = (iHashCode * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.normBoundSq);
        return (((((i14 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31) + this.f99826q) * 31) + this.signFailTolerance;
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        StringBuilder sb2 = new StringBuilder("SignatureParameters(N=" + this.N + " q=" + this.f99826q);
        sb2.append(" B=" + this.B + " beta=" + decimalFormat.format(this.beta) + " normBound=" + decimalFormat.format(this.normBound) + " hashAlg=" + this.hashAlg + ")");
        return sb2.toString();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.N);
        dataOutputStream.writeInt(this.f99826q);
        dataOutputStream.writeInt(this.f99822d);
        dataOutputStream.writeInt(this.f99823d1);
        dataOutputStream.writeInt(this.f99824d2);
        dataOutputStream.writeInt(this.f99825d3);
        dataOutputStream.writeInt(this.B);
        dataOutputStream.writeDouble(this.beta);
        dataOutputStream.writeDouble(this.normBound);
        dataOutputStream.writeInt(this.signFailTolerance);
        dataOutputStream.writeInt(this.bitsF);
        dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
    }

    public NTRUSigningParameters clone() {
        return new NTRUSigningParameters(this.N, this.f99826q, this.f99822d, this.B, this.beta, this.normBound, this.hashAlg);
    }

    public NTRUSigningParameters(int i11, int i12, int i13, int i14, int i15, int i16, double d11, double d12, double d13, Digest digest) {
        this.signFailTolerance = 100;
        this.bitsF = 6;
        this.N = i11;
        this.f99826q = i12;
        this.f99823d1 = i13;
        this.f99824d2 = i14;
        this.f99825d3 = i15;
        this.B = i16;
        this.beta = d11;
        this.normBound = d12;
        this.hashAlg = digest;
        init();
    }

    public NTRUSigningParameters(InputStream inputStream) throws IOException {
        this.signFailTolerance = 100;
        this.bitsF = 6;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.N = dataInputStream.readInt();
        this.f99826q = dataInputStream.readInt();
        this.f99822d = dataInputStream.readInt();
        this.f99823d1 = dataInputStream.readInt();
        this.f99824d2 = dataInputStream.readInt();
        this.f99825d3 = dataInputStream.readInt();
        this.B = dataInputStream.readInt();
        this.beta = dataInputStream.readDouble();
        this.normBound = dataInputStream.readDouble();
        this.signFailTolerance = dataInputStream.readInt();
        this.bitsF = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if ("SHA-512".equals(utf)) {
            this.hashAlg = new SHA512Digest();
        } else if ("SHA-256".equals(utf)) {
            this.hashAlg = new SHA256Digest();
        }
        init();
    }
}
