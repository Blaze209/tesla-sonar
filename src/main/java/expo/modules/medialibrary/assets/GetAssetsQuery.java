package expo.modules.medialibrary.assets;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lexpo/modules/medialibrary/assets/GetAssetsQuery;", "", "selection", "", "order", "limit", "", "offset", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;DI)V", "getSelection", "()Ljava/lang/String;", "getOrder", "getLimit", "()D", "getOffset", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetAssetsQuery {
    private final double limit;
    private final int offset;
    private final String order;
    private final String selection;

    public GetAssetsQuery(String selection, String order, double d11, int i11) {
        s.k(selection, "selection");
        s.k(order, "order");
        this.selection = selection;
        this.order = order;
        this.limit = d11;
        this.offset = i11;
    }

    public static /* synthetic */ GetAssetsQuery copy$default(GetAssetsQuery getAssetsQuery, String str, String str2, double d11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = getAssetsQuery.selection;
        }
        if ((i12 & 2) != 0) {
            str2 = getAssetsQuery.order;
        }
        if ((i12 & 4) != 0) {
            d11 = getAssetsQuery.limit;
        }
        if ((i12 & 8) != 0) {
            i11 = getAssetsQuery.offset;
        }
        int i13 = i11;
        return getAssetsQuery.copy(str, str2, d11, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSelection() {
        return this.selection;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    public final GetAssetsQuery copy(String selection, String order, double limit, int offset) {
        s.k(selection, "selection");
        s.k(order, "order");
        return new GetAssetsQuery(selection, order, limit, offset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAssetsQuery)) {
            return false;
        }
        GetAssetsQuery getAssetsQuery = (GetAssetsQuery) other;
        return s.f(this.selection, getAssetsQuery.selection) && s.f(this.order, getAssetsQuery.order) && Double.compare(this.limit, getAssetsQuery.limit) == 0 && this.offset == getAssetsQuery.offset;
    }

    public final double getLimit() {
        return this.limit;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final String getOrder() {
        return this.order;
    }

    public final String getSelection() {
        return this.selection;
    }

    public int hashCode() {
        return (((((this.selection.hashCode() * 31) + this.order.hashCode()) * 31) + Double.hashCode(this.limit)) * 31) + Integer.hashCode(this.offset);
    }

    public String toString() {
        return "GetAssetsQuery(selection=" + this.selection + ", order=" + this.order + ", limit=" + this.limit + ", offset=" + this.offset + ")";
    }
}
