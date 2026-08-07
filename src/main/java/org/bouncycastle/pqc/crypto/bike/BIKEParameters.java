package org.bouncycastle.pqc.crypto.bike;

import com.plaid.internal.EnumC4419g;
import org.bouncycastle.pqc.crypto.KEMParameters;

/* JADX INFO: loaded from: classes10.dex */
public class BIKEParameters implements KEMParameters {
    public static final BIKEParameters bike128 = new BIKEParameters("bike128", 12323, 142, 134, 256, 5, 3, 128);
    public static final BIKEParameters bike192 = new BIKEParameters("bike192", 24659, EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE, 256, 5, 3, 192);
    public static final BIKEParameters bike256 = new BIKEParameters("bike256", 40973, EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, EnumC4419g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, 256, 5, 3, 256);
    private BIKEEngine bikeEngine;
    private final int defaultKeySize;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f99030l;
    private String name;
    private int nbIter;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f99031r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f99032t;
    private int tau;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f99033w;

    private BIKEParameters(String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.name = str;
        this.f99031r = i11;
        this.f99033w = i12;
        this.f99032t = i13;
        this.f99030l = i14;
        this.nbIter = i15;
        this.tau = i16;
        this.defaultKeySize = i17;
        this.bikeEngine = new BIKEEngine(i11, i12, i13, i14, i15, i16);
    }

    BIKEEngine getEngine() {
        return this.bikeEngine;
    }

    public int getL() {
        return this.f99030l;
    }

    public int getLByte() {
        return this.f99030l / 8;
    }

    public String getName() {
        return this.name;
    }

    public int getNbIter() {
        return this.nbIter;
    }

    public int getR() {
        return this.f99031r;
    }

    public int getRByte() {
        return (this.f99031r + 7) / 8;
    }

    public int getSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getT() {
        return this.f99032t;
    }

    public int getTau() {
        return this.tau;
    }

    public int getW() {
        return this.f99033w;
    }
}
