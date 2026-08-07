package org.spongycastle.cert.path.validations;

import java.math.BigInteger;
import org.spongycastle.asn1.x509.BasicConstraints;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cert.path.CertPathValidation;
import org.spongycastle.cert.path.CertPathValidationContext;
import org.spongycastle.cert.path.CertPathValidationException;
import org.spongycastle.util.Memoable;

/* JADX INFO: loaded from: classes10.dex */
public class BasicConstraintsValidation implements CertPathValidation {

    /* JADX INFO: renamed from: bc, reason: collision with root package name */
    private BasicConstraints f99413bc;
    private boolean isMandatory;
    private BigInteger maxPathLength;
    private int pathLengthRemaining;

    public BasicConstraintsValidation() {
        this(true);
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        BasicConstraintsValidation basicConstraintsValidation = new BasicConstraintsValidation(this.isMandatory);
        basicConstraintsValidation.f99413bc = this.f99413bc;
        basicConstraintsValidation.pathLengthRemaining = this.pathLengthRemaining;
        return basicConstraintsValidation;
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        BasicConstraintsValidation basicConstraintsValidation = (BasicConstraintsValidation) memoable;
        this.isMandatory = basicConstraintsValidation.isMandatory;
        this.f99413bc = basicConstraintsValidation.f99413bc;
        this.pathLengthRemaining = basicConstraintsValidation.pathLengthRemaining;
    }

    @Override // org.spongycastle.cert.path.CertPathValidation
    public void validate(CertPathValidationContext certPathValidationContext, X509CertificateHolder x509CertificateHolder) throws CertPathValidationException {
        BigInteger pathLenConstraint;
        int iIntValue;
        if (this.maxPathLength != null && this.pathLengthRemaining < 0) {
            throw new CertPathValidationException("BasicConstraints path length exceeded");
        }
        certPathValidationContext.addHandledExtension(Extension.basicConstraints);
        BasicConstraints basicConstraintsFromExtensions = BasicConstraints.fromExtensions(x509CertificateHolder.getExtensions());
        if (basicConstraintsFromExtensions != null) {
            if (this.f99413bc == null) {
                this.f99413bc = basicConstraintsFromExtensions;
                if (basicConstraintsFromExtensions.isCA()) {
                    BigInteger pathLenConstraint2 = basicConstraintsFromExtensions.getPathLenConstraint();
                    this.maxPathLength = pathLenConstraint2;
                    if (pathLenConstraint2 != null) {
                        this.pathLengthRemaining = pathLenConstraint2.intValue();
                    }
                }
            } else if (basicConstraintsFromExtensions.isCA() && (pathLenConstraint = basicConstraintsFromExtensions.getPathLenConstraint()) != null && (iIntValue = pathLenConstraint.intValue()) < this.pathLengthRemaining) {
                this.pathLengthRemaining = iIntValue;
                this.f99413bc = basicConstraintsFromExtensions;
            }
        } else if (this.f99413bc != null) {
            this.pathLengthRemaining--;
        }
        if (this.isMandatory && this.f99413bc == null) {
            throw new CertPathValidationException("BasicConstraints not present in path");
        }
    }

    public BasicConstraintsValidation(boolean z11) {
        this.isMandatory = z11;
    }
}
