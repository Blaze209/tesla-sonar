package org.spongycastle.pqc.crypto.ntru;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.SparseTernaryPolynomial;

/* JADX INFO: loaded from: classes10.dex */
public class NTRUSigningPrivateKeyParameters extends AsymmetricKeyParameter {
    private List<Basis> bases;
    private NTRUSigningPublicKeyParameters publicKey;

    public NTRUSigningPrivateKeyParameters(byte[] bArr, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters) {
        this(new ByteArrayInputStream(bArr), nTRUSigningKeyGenerationParameters);
    }

    private void add(Basis basis) {
        this.bases.add(basis);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NTRUSigningPrivateKeyParameters nTRUSigningPrivateKeyParameters = (NTRUSigningPrivateKeyParameters) obj;
        List<Basis> list = this.bases;
        if ((list == null) != (nTRUSigningPrivateKeyParameters.bases == null)) {
            return false;
        }
        if (list == null) {
            return true;
        }
        if (list.size() != nTRUSigningPrivateKeyParameters.bases.size()) {
            return false;
        }
        for (int i11 = 0; i11 < this.bases.size(); i11++) {
            Basis basis = this.bases.get(i11);
            Basis basis2 = nTRUSigningPrivateKeyParameters.bases.get(i11);
            if (!basis.f99827f.equals(basis2.f99827f) || !basis.fPrime.equals(basis2.fPrime)) {
                return false;
            }
            if ((i11 != 0 && !basis.f99828h.equals(basis2.f99828h)) || !basis.params.equals(basis2.params)) {
                return false;
            }
        }
        return true;
    }

    public Basis getBasis(int i11) {
        return this.bases.get(i11);
    }

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        while (i11 < this.bases.size()) {
            this.bases.get(i11).encode(byteArrayOutputStream, i11 != 0);
            i11++;
        }
        byteArrayOutputStream.write(this.publicKey.getEncoded());
        return byteArrayOutputStream.toByteArray();
    }

    public NTRUSigningPublicKeyParameters getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        List<Basis> list = this.bases;
        if (list == null) {
            return 31;
        }
        int iHashCode = 31 + list.hashCode();
        Iterator<Basis> it = this.bases.iterator();
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(getEncoded());
    }

    public NTRUSigningPrivateKeyParameters(InputStream inputStream, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters) {
        super(true);
        this.bases = new ArrayList();
        int i11 = 0;
        while (i11 <= nTRUSigningKeyGenerationParameters.B) {
            add(new Basis(inputStream, nTRUSigningKeyGenerationParameters, i11 != 0));
            i11++;
        }
        this.publicKey = new NTRUSigningPublicKeyParameters(inputStream, nTRUSigningKeyGenerationParameters.getSigningParameters());
    }

    public static class Basis {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Polynomial f99827f;
        public Polynomial fPrime;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public IntegerPolynomial f99828h;
        NTRUSigningKeyGenerationParameters params;

        protected Basis(Polynomial polynomial, Polynomial polynomial2, IntegerPolynomial integerPolynomial, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters) {
            this.f99827f = polynomial;
            this.fPrime = polynomial2;
            this.f99828h = integerPolynomial;
            this.params = nTRUSigningKeyGenerationParameters;
        }

        private byte[] getEncoded(Polynomial polynomial) {
            return polynomial instanceof ProductFormPolynomial ? ((ProductFormPolynomial) polynomial).toBinary() : polynomial.toIntegerPolynomial().toBinary3Tight();
        }

        void encode(OutputStream outputStream, boolean z11) throws IOException {
            int i11 = this.params.f99821q;
            outputStream.write(getEncoded(this.f99827f));
            if (this.params.basisType == 0) {
                IntegerPolynomial integerPolynomial = this.fPrime.toIntegerPolynomial();
                int i12 = 0;
                while (true) {
                    int[] iArr = integerPolynomial.coeffs;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    iArr[i12] = iArr[i12] + (i11 / 2);
                    i12++;
                }
                outputStream.write(integerPolynomial.toBinary(i11));
            } else {
                outputStream.write(getEncoded(this.fPrime));
            }
            if (z11) {
                outputStream.write(this.f99828h.toBinary(i11));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Basis)) {
                return false;
            }
            Basis basis = (Basis) obj;
            Polynomial polynomial = this.f99827f;
            if (polynomial == null) {
                if (basis.f99827f != null) {
                    return false;
                }
            } else if (!polynomial.equals(basis.f99827f)) {
                return false;
            }
            Polynomial polynomial2 = this.fPrime;
            if (polynomial2 == null) {
                if (basis.fPrime != null) {
                    return false;
                }
            } else if (!polynomial2.equals(basis.fPrime)) {
                return false;
            }
            IntegerPolynomial integerPolynomial = this.f99828h;
            if (integerPolynomial == null) {
                if (basis.f99828h != null) {
                    return false;
                }
            } else if (!integerPolynomial.equals(basis.f99828h)) {
                return false;
            }
            NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = this.params;
            if (nTRUSigningKeyGenerationParameters == null) {
                if (basis.params != null) {
                    return false;
                }
            } else if (!nTRUSigningKeyGenerationParameters.equals(basis.params)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Polynomial polynomial = this.f99827f;
            int iHashCode = ((polynomial == null ? 0 : polynomial.hashCode()) + 31) * 31;
            Polynomial polynomial2 = this.fPrime;
            int iHashCode2 = (iHashCode + (polynomial2 == null ? 0 : polynomial2.hashCode())) * 31;
            IntegerPolynomial integerPolynomial = this.f99828h;
            int iHashCode3 = (iHashCode2 + (integerPolynomial == null ? 0 : integerPolynomial.hashCode())) * 31;
            NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = this.params;
            return iHashCode3 + (nTRUSigningKeyGenerationParameters != null ? nTRUSigningKeyGenerationParameters.hashCode() : 0);
        }

        Basis(InputStream inputStream, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters, boolean z11) {
            int i11;
            InputStream inputStream2;
            InputStream inputStream3;
            int i12;
            int i13 = nTRUSigningKeyGenerationParameters.N;
            int i14 = nTRUSigningKeyGenerationParameters.f99821q;
            int i15 = nTRUSigningKeyGenerationParameters.f99818d1;
            int i16 = nTRUSigningKeyGenerationParameters.f99819d2;
            int i17 = nTRUSigningKeyGenerationParameters.f99820d3;
            boolean z12 = nTRUSigningKeyGenerationParameters.sparse;
            this.params = nTRUSigningKeyGenerationParameters;
            if (nTRUSigningKeyGenerationParameters.polyType == 1) {
                ProductFormPolynomial productFormPolynomialFromBinary = ProductFormPolynomial.fromBinary(inputStream, i13, i15, i16, i17 + 1, i17);
                i11 = i13;
                inputStream2 = inputStream;
                this.f99827f = productFormPolynomialFromBinary;
            } else {
                i11 = i13;
                inputStream2 = inputStream;
                IntegerPolynomial integerPolynomialFromBinary3Tight = IntegerPolynomial.fromBinary3Tight(inputStream2, i11);
                this.f99827f = z12 ? new SparseTernaryPolynomial(integerPolynomialFromBinary3Tight) : new DenseTernaryPolynomial(integerPolynomialFromBinary3Tight);
            }
            if (nTRUSigningKeyGenerationParameters.basisType == 0) {
                IntegerPolynomial integerPolynomialFromBinary = IntegerPolynomial.fromBinary(inputStream2, i11, i14);
                int i18 = 0;
                while (true) {
                    int[] iArr = integerPolynomialFromBinary.coeffs;
                    if (i18 >= iArr.length) {
                        break;
                    }
                    iArr[i18] = iArr[i18] - (i14 / 2);
                    i18++;
                }
                this.fPrime = integerPolynomialFromBinary;
                inputStream3 = inputStream2;
                i12 = i11;
            } else if (nTRUSigningKeyGenerationParameters.polyType == 1) {
                inputStream3 = inputStream2;
                i12 = i11;
                this.fPrime = ProductFormPolynomial.fromBinary(inputStream3, i12, i15, i16, i17 + 1, i17);
            } else {
                inputStream3 = inputStream2;
                i12 = i11;
                this.fPrime = IntegerPolynomial.fromBinary3Tight(inputStream3, i12);
            }
            if (z11) {
                this.f99828h = IntegerPolynomial.fromBinary(inputStream3, i12, i14);
            }
        }
    }

    public NTRUSigningPrivateKeyParameters(List<Basis> list, NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters) {
        super(true);
        this.bases = new ArrayList(list);
        this.publicKey = nTRUSigningPublicKeyParameters;
    }
}
