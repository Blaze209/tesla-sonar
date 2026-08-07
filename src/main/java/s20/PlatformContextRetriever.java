package s20;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: s20.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b9\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010&\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R,\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R,\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010&\u001a\u0004\b8\u0010(\"\u0004\b9\u0010*R,\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010&\u001a\u0004\b:\u0010(\"\u0004\b;\u0010*R,\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010&\u001a\u0004\b%\u0010(\"\u0004\b<\u0010*R,\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010&\u001a\u0004\b1\u0010(\"\u0004\b=\u0010*R,\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010&\u001a\u0004\b?\u0010(\"\u0004\b@\u0010*R,\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010&\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*R,\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010&\u001a\u0004\bC\u0010(\"\u0004\bD\u0010*R,\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010&\u001a\u0004\b4\u0010(\"\u0004\bE\u0010*R,\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b7\u0010(\"\u0004\bF\u0010*R,\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010&\u001a\u0004\bG\u0010(\"\u0004\bH\u0010*R,\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010&\u001a\u0004\bI\u0010(\"\u0004\bJ\u0010*R,\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010&\u001a\u0004\bK\u0010(\"\u0004\bL\u0010*R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010&\u001a\u0004\b>\u0010(\"\u0004\bM\u0010*R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010&\u001a\u0004\b+\u0010(\"\u0004\bN\u0010*R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010&\u001a\u0004\b.\u0010(\"\u0004\bO\u0010*¨\u0006P"}, d2 = {"Ls20/e;", "", "Lkotlin/Function0;", "", "osType", "osVersion", "deviceVendor", "deviceModel", "carrier", "networkType", "networkTechnology", "androidIdfa", "", "availableStorage", "totalStorage", "physicalMemory", "systemAvailableMemory", "", "batteryLevel", "batteryState", "", "isPortrait", "resolution", "", "scale", "language", "appSetId", "appSetIdScope", "<init>", "(Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lwn0/a;", "m", "()Lwn0/a;", "setOsType", "(Lwn0/a;)V", "b", "n", "setOsVersion", "c", IntegerTokenConverter.CONVERTER_KEY, "setDeviceVendor", DateTokenConverter.CONVERTER_KEY, "h", "setDeviceModel", "e", "g", "setCarrier", "f", "l", "setNetworkType", "k", "setNetworkTechnology", "setAndroidIdfa", "setAvailableStorage", "j", "s", "setTotalStorage", "o", "setPhysicalMemory", "r", "setSystemAvailableMemory", "setBatteryLevel", "setBatteryState", "t", "setPortrait", "p", "setResolution", "q", "setScale", "setLanguage", "setAppSetId", "setAppSetIdScope", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PlatformContextRetriever {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<String> osType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<String> osVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<String> deviceVendor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<String> deviceModel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<String> carrier;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<String> networkType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<String> networkTechnology;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<String> androidIdfa;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<Long> availableStorage;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<Long> totalStorage;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<Long> physicalMemory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<Long> systemAvailableMemory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<Integer> batteryLevel;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<String> batteryState;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<Boolean> isPortrait;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<String> resolution;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<Float> scale;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<String> language;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<String> appSetId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<String> appSetIdScope;

    public PlatformContextRetriever(wn0.a<String> aVar, wn0.a<String> aVar2, wn0.a<String> aVar3, wn0.a<String> aVar4, wn0.a<String> aVar5, wn0.a<String> aVar6, wn0.a<String> aVar7, wn0.a<String> aVar8, wn0.a<Long> aVar9, wn0.a<Long> aVar10, wn0.a<Long> aVar11, wn0.a<Long> aVar12, wn0.a<Integer> aVar13, wn0.a<String> aVar14, wn0.a<Boolean> aVar15, wn0.a<String> aVar16, wn0.a<Float> aVar17, wn0.a<String> aVar18, wn0.a<String> aVar19, wn0.a<String> aVar20) {
        this.osType = aVar;
        this.osVersion = aVar2;
        this.deviceVendor = aVar3;
        this.deviceModel = aVar4;
        this.carrier = aVar5;
        this.networkType = aVar6;
        this.networkTechnology = aVar7;
        this.androidIdfa = aVar8;
        this.availableStorage = aVar9;
        this.totalStorage = aVar10;
        this.physicalMemory = aVar11;
        this.systemAvailableMemory = aVar12;
        this.batteryLevel = aVar13;
        this.batteryState = aVar14;
        this.isPortrait = aVar15;
        this.resolution = aVar16;
        this.scale = aVar17;
        this.language = aVar18;
        this.appSetId = aVar19;
        this.appSetIdScope = aVar20;
    }

    public final wn0.a<String> a() {
        return this.androidIdfa;
    }

    public final wn0.a<String> b() {
        return this.appSetId;
    }

    public final wn0.a<String> c() {
        return this.appSetIdScope;
    }

    public final wn0.a<Long> d() {
        return this.availableStorage;
    }

    public final wn0.a<Integer> e() {
        return this.batteryLevel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformContextRetriever)) {
            return false;
        }
        PlatformContextRetriever platformContextRetriever = (PlatformContextRetriever) other;
        return s.f(this.osType, platformContextRetriever.osType) && s.f(this.osVersion, platformContextRetriever.osVersion) && s.f(this.deviceVendor, platformContextRetriever.deviceVendor) && s.f(this.deviceModel, platformContextRetriever.deviceModel) && s.f(this.carrier, platformContextRetriever.carrier) && s.f(this.networkType, platformContextRetriever.networkType) && s.f(this.networkTechnology, platformContextRetriever.networkTechnology) && s.f(this.androidIdfa, platformContextRetriever.androidIdfa) && s.f(this.availableStorage, platformContextRetriever.availableStorage) && s.f(this.totalStorage, platformContextRetriever.totalStorage) && s.f(this.physicalMemory, platformContextRetriever.physicalMemory) && s.f(this.systemAvailableMemory, platformContextRetriever.systemAvailableMemory) && s.f(this.batteryLevel, platformContextRetriever.batteryLevel) && s.f(this.batteryState, platformContextRetriever.batteryState) && s.f(this.isPortrait, platformContextRetriever.isPortrait) && s.f(this.resolution, platformContextRetriever.resolution) && s.f(this.scale, platformContextRetriever.scale) && s.f(this.language, platformContextRetriever.language) && s.f(this.appSetId, platformContextRetriever.appSetId) && s.f(this.appSetIdScope, platformContextRetriever.appSetIdScope);
    }

    public final wn0.a<String> f() {
        return this.batteryState;
    }

    public final wn0.a<String> g() {
        return this.carrier;
    }

    public final wn0.a<String> h() {
        return this.deviceModel;
    }

    public int hashCode() {
        wn0.a<String> aVar = this.osType;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        wn0.a<String> aVar2 = this.osVersion;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        wn0.a<String> aVar3 = this.deviceVendor;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        wn0.a<String> aVar4 = this.deviceModel;
        int iHashCode4 = (iHashCode3 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        wn0.a<String> aVar5 = this.carrier;
        int iHashCode5 = (iHashCode4 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        wn0.a<String> aVar6 = this.networkType;
        int iHashCode6 = (iHashCode5 + (aVar6 == null ? 0 : aVar6.hashCode())) * 31;
        wn0.a<String> aVar7 = this.networkTechnology;
        int iHashCode7 = (iHashCode6 + (aVar7 == null ? 0 : aVar7.hashCode())) * 31;
        wn0.a<String> aVar8 = this.androidIdfa;
        int iHashCode8 = (iHashCode7 + (aVar8 == null ? 0 : aVar8.hashCode())) * 31;
        wn0.a<Long> aVar9 = this.availableStorage;
        int iHashCode9 = (iHashCode8 + (aVar9 == null ? 0 : aVar9.hashCode())) * 31;
        wn0.a<Long> aVar10 = this.totalStorage;
        int iHashCode10 = (iHashCode9 + (aVar10 == null ? 0 : aVar10.hashCode())) * 31;
        wn0.a<Long> aVar11 = this.physicalMemory;
        int iHashCode11 = (iHashCode10 + (aVar11 == null ? 0 : aVar11.hashCode())) * 31;
        wn0.a<Long> aVar12 = this.systemAvailableMemory;
        int iHashCode12 = (iHashCode11 + (aVar12 == null ? 0 : aVar12.hashCode())) * 31;
        wn0.a<Integer> aVar13 = this.batteryLevel;
        int iHashCode13 = (iHashCode12 + (aVar13 == null ? 0 : aVar13.hashCode())) * 31;
        wn0.a<String> aVar14 = this.batteryState;
        int iHashCode14 = (iHashCode13 + (aVar14 == null ? 0 : aVar14.hashCode())) * 31;
        wn0.a<Boolean> aVar15 = this.isPortrait;
        int iHashCode15 = (iHashCode14 + (aVar15 == null ? 0 : aVar15.hashCode())) * 31;
        wn0.a<String> aVar16 = this.resolution;
        int iHashCode16 = (iHashCode15 + (aVar16 == null ? 0 : aVar16.hashCode())) * 31;
        wn0.a<Float> aVar17 = this.scale;
        int iHashCode17 = (iHashCode16 + (aVar17 == null ? 0 : aVar17.hashCode())) * 31;
        wn0.a<String> aVar18 = this.language;
        int iHashCode18 = (iHashCode17 + (aVar18 == null ? 0 : aVar18.hashCode())) * 31;
        wn0.a<String> aVar19 = this.appSetId;
        int iHashCode19 = (iHashCode18 + (aVar19 == null ? 0 : aVar19.hashCode())) * 31;
        wn0.a<String> aVar20 = this.appSetIdScope;
        return iHashCode19 + (aVar20 != null ? aVar20.hashCode() : 0);
    }

    public final wn0.a<String> i() {
        return this.deviceVendor;
    }

    public final wn0.a<String> j() {
        return this.language;
    }

    public final wn0.a<String> k() {
        return this.networkTechnology;
    }

    public final wn0.a<String> l() {
        return this.networkType;
    }

    public final wn0.a<String> m() {
        return this.osType;
    }

    public final wn0.a<String> n() {
        return this.osVersion;
    }

    public final wn0.a<Long> o() {
        return this.physicalMemory;
    }

    public final wn0.a<String> p() {
        return this.resolution;
    }

    public final wn0.a<Float> q() {
        return this.scale;
    }

    public final wn0.a<Long> r() {
        return this.systemAvailableMemory;
    }

    public final wn0.a<Long> s() {
        return this.totalStorage;
    }

    public final wn0.a<Boolean> t() {
        return this.isPortrait;
    }

    public String toString() {
        return "PlatformContextRetriever(osType=" + this.osType + ", osVersion=" + this.osVersion + ", deviceVendor=" + this.deviceVendor + ", deviceModel=" + this.deviceModel + ", carrier=" + this.carrier + ", networkType=" + this.networkType + ", networkTechnology=" + this.networkTechnology + ", androidIdfa=" + this.androidIdfa + ", availableStorage=" + this.availableStorage + ", totalStorage=" + this.totalStorage + ", physicalMemory=" + this.physicalMemory + ", systemAvailableMemory=" + this.systemAvailableMemory + ", batteryLevel=" + this.batteryLevel + ", batteryState=" + this.batteryState + ", isPortrait=" + this.isPortrait + ", resolution=" + this.resolution + ", scale=" + this.scale + ", language=" + this.language + ", appSetId=" + this.appSetId + ", appSetIdScope=" + this.appSetIdScope + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ PlatformContextRetriever(wn0.a aVar, wn0.a aVar2, wn0.a aVar3, wn0.a aVar4, wn0.a aVar5, wn0.a aVar6, wn0.a aVar7, wn0.a aVar8, wn0.a aVar9, wn0.a aVar10, wn0.a aVar11, wn0.a aVar12, wn0.a aVar13, wn0.a aVar14, wn0.a aVar15, wn0.a aVar16, wn0.a aVar17, wn0.a aVar18, wn0.a aVar19, wn0.a aVar20, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : aVar, (i11 & 2) != 0 ? null : aVar2, (i11 & 4) != 0 ? null : aVar3, (i11 & 8) != 0 ? null : aVar4, (i11 & 16) != 0 ? null : aVar5, (i11 & 32) != 0 ? null : aVar6, (i11 & 64) != 0 ? null : aVar7, (i11 & 128) != 0 ? null : aVar8, (i11 & 256) != 0 ? null : aVar9, (i11 & 512) != 0 ? null : aVar10, (i11 & 1024) != 0 ? null : aVar11, (i11 & 2048) != 0 ? null : aVar12, (i11 & 4096) != 0 ? null : aVar13, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : aVar14, (i11 & 16384) != 0 ? null : aVar15, (i11 & 32768) != 0 ? null : aVar16, (i11 & 65536) != 0 ? null : aVar17, (i11 & 131072) != 0 ? null : aVar18, (i11 & 262144) != 0 ? null : aVar19, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? null : aVar20);
    }
}
