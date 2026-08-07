package zr;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class i implements ur.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128527a;

    public i(String str) {
        this.f128527a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f128527a;
    }
}
