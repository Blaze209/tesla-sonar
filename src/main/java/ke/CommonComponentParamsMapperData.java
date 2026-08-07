package ke;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ke.h, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lke/h;", "", "Lke/f;", "commonComponentParams", "Lke/n;", "sessionParams", "<init>", "(Lke/f;Lke/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lke/f;", "()Lke/f;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CommonComponentParamsMapperData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CommonComponentParams commonComponentParams;

    public CommonComponentParamsMapperData(CommonComponentParams commonComponentParams, n nVar) {
        s.k(commonComponentParams, "commonComponentParams");
        this.commonComponentParams = commonComponentParams;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CommonComponentParams getCommonComponentParams() {
        return this.commonComponentParams;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CommonComponentParamsMapperData) && s.f(this.commonComponentParams, ((CommonComponentParamsMapperData) other).commonComponentParams) && s.f(null, null);
    }

    public int hashCode() {
        return this.commonComponentParams.hashCode() * 31;
    }

    public String toString() {
        return "CommonComponentParamsMapperData(commonComponentParams=" + this.commonComponentParams + ", sessionParams=" + ((Object) null) + ")";
    }
}
