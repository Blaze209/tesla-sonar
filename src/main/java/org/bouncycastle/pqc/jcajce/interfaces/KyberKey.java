package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.KyberParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public interface KyberKey extends Key {
    KyberParameterSpec getParameterSpec();
}
