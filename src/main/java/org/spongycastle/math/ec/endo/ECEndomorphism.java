package org.spongycastle.math.ec.endo;

import org.spongycastle.math.ec.ECPointMap;

/* JADX INFO: loaded from: classes10.dex */
public interface ECEndomorphism {
    ECPointMap getPointMap();

    boolean hasEfficientPointMap();
}
