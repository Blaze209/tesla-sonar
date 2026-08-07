package org.bouncycastle.crypto;

import java.io.InputStream;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes9.dex */
public interface KeyParser {
    AsymmetricKeyParameter readKey(InputStream inputStream);
}
