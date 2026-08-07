package org.spongycastle.jce.interfaces;

import javax.crypto.interfaces.DHKey;
import org.spongycastle.jce.spec.ElGamalParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public interface ElGamalKey extends DHKey {
    ElGamalParameterSpec getParameters();
}
