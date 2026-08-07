package org.bouncycastle.math.ec;

/* JADX INFO: loaded from: classes10.dex */
public interface ECLookupTable {
    int getSize();

    ECPoint lookup(int i11);

    ECPoint lookupVar(int i11);
}
