package com.fourthline.orca.internal;

import com.fourthline.vision.MotionData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class E6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f25558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f25559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f25560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f25561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f25562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f25563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f25564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f25565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f25566i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f25567j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f25568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f25569l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MotionData f25570m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MotionData f25571n;

    public E6(Map environment, Map gps, Map cellular, Map network, Map general, Map hardware, Map screen, Map battery, Map locale, Map system, List motion, Map motionMetadata, MotionData motionData, MotionData motionData2) {
        p013kotlin.jvm.internal.s.k(environment, "environment");
        p013kotlin.jvm.internal.s.k(gps, "gps");
        p013kotlin.jvm.internal.s.k(cellular, "cellular");
        p013kotlin.jvm.internal.s.k(network, "network");
        p013kotlin.jvm.internal.s.k(general, "general");
        p013kotlin.jvm.internal.s.k(hardware, "hardware");
        p013kotlin.jvm.internal.s.k(screen, "screen");
        p013kotlin.jvm.internal.s.k(battery, "battery");
        p013kotlin.jvm.internal.s.k(locale, "locale");
        p013kotlin.jvm.internal.s.k(system, "system");
        p013kotlin.jvm.internal.s.k(motion, "motion");
        p013kotlin.jvm.internal.s.k(motionMetadata, "motionMetadata");
        this.f25558a = environment;
        this.f25559b = gps;
        this.f25560c = cellular;
        this.f25561d = network;
        this.f25562e = general;
        this.f25563f = hardware;
        this.f25564g = screen;
        this.f25565h = battery;
        this.f25566i = locale;
        this.f25567j = system;
        this.f25568k = motion;
        this.f25569l = motionMetadata;
        this.f25570m = motionData;
        this.f25571n = motionData2;
    }

    public final Map a() {
        return this.f25565h;
    }

    public final Map b() {
        return this.f25560c;
    }

    public final MotionData c() {
        return this.f25571n;
    }

    public final Map d() {
        return this.f25558a;
    }

    public final Map e() {
        return this.f25562e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E6)) {
            return false;
        }
        E6 e11 = (E6) obj;
        return p013kotlin.jvm.internal.s.f(this.f25558a, e11.f25558a) && p013kotlin.jvm.internal.s.f(this.f25559b, e11.f25559b) && p013kotlin.jvm.internal.s.f(this.f25560c, e11.f25560c) && p013kotlin.jvm.internal.s.f(this.f25561d, e11.f25561d) && p013kotlin.jvm.internal.s.f(this.f25562e, e11.f25562e) && p013kotlin.jvm.internal.s.f(this.f25563f, e11.f25563f) && p013kotlin.jvm.internal.s.f(this.f25564g, e11.f25564g) && p013kotlin.jvm.internal.s.f(this.f25565h, e11.f25565h) && p013kotlin.jvm.internal.s.f(this.f25566i, e11.f25566i) && p013kotlin.jvm.internal.s.f(this.f25567j, e11.f25567j) && p013kotlin.jvm.internal.s.f(this.f25568k, e11.f25568k) && p013kotlin.jvm.internal.s.f(this.f25569l, e11.f25569l) && p013kotlin.jvm.internal.s.f(this.f25570m, e11.f25570m) && p013kotlin.jvm.internal.s.f(this.f25571n, e11.f25571n);
    }

    public final Map f() {
        return this.f25559b;
    }

    public final Map g() {
        return this.f25563f;
    }

    public final Map h() {
        return this.f25566i;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.f25558a.hashCode() * 31) + this.f25559b.hashCode()) * 31) + this.f25560c.hashCode()) * 31) + this.f25561d.hashCode()) * 31) + this.f25562e.hashCode()) * 31) + this.f25563f.hashCode()) * 31) + this.f25564g.hashCode()) * 31) + this.f25565h.hashCode()) * 31) + this.f25566i.hashCode()) * 31) + this.f25567j.hashCode()) * 31) + this.f25568k.hashCode()) * 31) + this.f25569l.hashCode()) * 31;
        MotionData motionData = this.f25570m;
        int iHashCode2 = (iHashCode + (motionData == null ? 0 : motionData.hashCode())) * 31;
        MotionData motionData2 = this.f25571n;
        return iHashCode2 + (motionData2 != null ? motionData2.hashCode() : 0);
    }

    public final List i() {
        return this.f25568k;
    }

    public final Map j() {
        return this.f25569l;
    }

    public final Map k() {
        return this.f25561d;
    }

    public final Map l() {
        return this.f25564g;
    }

    public final MotionData m() {
        return this.f25570m;
    }

    public final Map n() {
        return this.f25567j;
    }

    public String toString() {
        return "DeviceDataBundle(environment=" + this.f25558a + ", gps=" + this.f25559b + ", cellular=" + this.f25560c + ", network=" + this.f25561d + ", general=" + this.f25562e + ", hardware=" + this.f25563f + ", screen=" + this.f25564g + ", battery=" + this.f25565h + ", locale=" + this.f25566i + ", system=" + this.f25567j + ", motion=" + this.f25568k + ", motionMetadata=" + this.f25569l + ", selfieMotionData=" + this.f25570m + ", documentMotionData=" + this.f25571n + ")";
    }

    public final void a(MotionData motionData) {
        this.f25571n = motionData;
    }

    public final void b(MotionData motionData) {
        this.f25570m = motionData;
    }

    public /* synthetic */ E6(Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, Map map8, Map map9, Map map10, List list, Map map11, MotionData motionData, MotionData motionData2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new LinkedHashMap() : map, (i11 & 2) != 0 ? new LinkedHashMap() : map2, (i11 & 4) != 0 ? new LinkedHashMap() : map3, (i11 & 8) != 0 ? new LinkedHashMap() : map4, (i11 & 16) != 0 ? new LinkedHashMap() : map5, (i11 & 32) != 0 ? new LinkedHashMap() : map6, (i11 & 64) != 0 ? new LinkedHashMap() : map7, (i11 & 128) != 0 ? new LinkedHashMap() : map8, (i11 & 256) != 0 ? new LinkedHashMap() : map9, (i11 & 512) != 0 ? new LinkedHashMap() : map10, (i11 & 1024) != 0 ? new ArrayList() : list, (i11 & 2048) != 0 ? new LinkedHashMap() : map11, (i11 & 4096) != 0 ? null : motionData, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : motionData2);
    }
}
