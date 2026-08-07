package com.squareup.wire;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
public final /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f49541a;

    static {
        int[] iArr = new int[b.values().length];
        f49541a = iArr;
        iArr[b.VARINT.ordinal()] = 1;
        iArr[b.FIXED32.ordinal()] = 2;
        iArr[b.FIXED64.ordinal()] = 3;
        iArr[b.LENGTH_DELIMITED.ordinal()] = 4;
    }
}
