package ua0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ua0.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lua0/d;", "", "", "trtID", "Lua0/a;", "location", "", "name", "", "teslaOnly", "<init>", "(ILua0/a;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", DateTokenConverter.CONVERTER_KEY, "b", "Lua0/a;", "()Lua0/a;", "c", "Ljava/lang/String;", "Z", "()Z", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbySupercharger {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int trtID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates location;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean teslaOnly;

    public NearbySupercharger(int i11, Coordinates location, String name, boolean z11) {
        s.k(location, "location");
        s.k(name, "name");
        this.trtID = i11;
        this.location = location;
        this.name = name;
        this.teslaOnly = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Coordinates getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getTeslaOnly() {
        return this.teslaOnly;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTrtID() {
        return this.trtID;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NearbySupercharger)) {
            return false;
        }
        NearbySupercharger nearbySupercharger = (NearbySupercharger) other;
        return this.trtID == nearbySupercharger.trtID && s.f(this.location, nearbySupercharger.location) && s.f(this.name, nearbySupercharger.name) && this.teslaOnly == nearbySupercharger.teslaOnly;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.trtID) * 31) + this.location.hashCode()) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.teslaOnly);
    }

    public String toString() {
        return "NearbySupercharger(trtID=" + this.trtID + ", location=" + this.location + ", name=" + this.name + ", teslaOnly=" + this.teslaOnly + ")";
    }
}
