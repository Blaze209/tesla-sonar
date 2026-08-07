package com.fourthline.orca.internal;

import com.plaid.internal.EnumC4419g;
import java.util.List;
import java.util.NoSuchElementException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Hs implements Aw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26145b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f26146c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f26147d = p013kotlin.collections.v.p(0, 45, 90, 135, 180, Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE), Integer.valueOf(EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE), Integer.valueOf(EnumC4419g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f26148a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Hs(List steps) {
        p013kotlin.jvm.internal.s.k(steps, "steps");
        this.f26148a = steps;
    }

    @Override // com.fourthline.orca.internal.Aw
    public List a(int i11) {
        List listC = p013kotlin.collections.v.c();
        for (int i12 = 0; i12 < i11; i12++) {
            for (Object obj : p013kotlin.collections.v.f(f26147d)) {
                int iIntValue = ((Number) obj).intValue();
                if (listC.isEmpty() || (!listC.contains(Integer.valueOf(iIntValue)) && Math.abs(((Number) p013kotlin.collections.v.A0(listC)).intValue() - iIntValue) >= 90)) {
                    listC.add(obj);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return p013kotlin.collections.v.a(listC);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Hs) && p013kotlin.jvm.internal.s.f(this.f26148a, ((Hs) obj).f26148a);
    }

    public int hashCode() {
        return this.f26148a.hashCode();
    }

    public String toString() {
        return "PredefinedRandomConfig(steps=" + this.f26148a + ")";
    }

    public /* synthetic */ Hs(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? f26147d : list);
    }
}
