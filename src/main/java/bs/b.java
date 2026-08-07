package bs;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class b implements ur.a.b {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
