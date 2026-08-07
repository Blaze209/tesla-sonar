package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Encodable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class LMSKeyParameters extends AsymmetricKeyParameter implements Encodable {
    protected LMSKeyParameters(boolean z11) {
        super(z11);
    }

    public abstract byte[] getEncoded();
}
