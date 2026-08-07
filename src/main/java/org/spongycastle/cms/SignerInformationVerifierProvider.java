package org.spongycastle.cms;

/* JADX INFO: loaded from: classes10.dex */
public interface SignerInformationVerifierProvider {
    SignerInformationVerifier get(SignerId signerId);
}
