package vh0;

import ai0.f;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import th0.a1;

/* JADX INFO: renamed from: vh0.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u001f¨\u0006$"}, d2 = {"Lvh0/b;", "Lai0/f;", "", "stepName", "Lth0/a1;", "centerCapture", "leftCapture", "rightCapture", "<init>", "(Ljava/lang/String;Lth0/a1;Lth0/a1;Lth0/a1;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lth0/a1;", "()Lth0/a1;", "c", "getLeftCapture", DateTokenConverter.CONVERTER_KEY, "getRightCapture", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SelfieStepData implements f {
    public static final Parcelable.Creator<SelfieStepData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String stepName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a1 centerCapture;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final a1 leftCapture;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final a1 rightCapture;

    /* JADX INFO: renamed from: vh0.b$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelfieStepData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SelfieStepData createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new SelfieStepData(parcel.readString(), (a1) parcel.readParcelable(SelfieStepData.class.getClassLoader()), (a1) parcel.readParcelable(SelfieStepData.class.getClassLoader()), (a1) parcel.readParcelable(SelfieStepData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SelfieStepData[] newArray(int i11) {
            return new SelfieStepData[i11];
        }
    }

    public SelfieStepData(String stepName, a1 a1Var, a1 a1Var2, a1 a1Var3) {
        s.k(stepName, "stepName");
        this.stepName = stepName;
        this.centerCapture = a1Var;
        this.leftCapture = a1Var2;
        this.rightCapture = a1Var3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a1 getCenterCapture() {
        return this.centerCapture;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getStepName() {
        return this.stepName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieStepData)) {
            return false;
        }
        SelfieStepData selfieStepData = (SelfieStepData) other;
        return s.f(this.stepName, selfieStepData.stepName) && s.f(this.centerCapture, selfieStepData.centerCapture) && s.f(this.leftCapture, selfieStepData.leftCapture) && s.f(this.rightCapture, selfieStepData.rightCapture);
    }

    public int hashCode() {
        int iHashCode = this.stepName.hashCode() * 31;
        a1 a1Var = this.centerCapture;
        int iHashCode2 = (iHashCode + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        a1 a1Var2 = this.leftCapture;
        int iHashCode3 = (iHashCode2 + (a1Var2 == null ? 0 : a1Var2.hashCode())) * 31;
        a1 a1Var3 = this.rightCapture;
        return iHashCode3 + (a1Var3 != null ? a1Var3.hashCode() : 0);
    }

    public String toString() {
        return "SelfieStepData(stepName=" + this.stepName + ", centerCapture=" + this.centerCapture + ", leftCapture=" + this.leftCapture + ", rightCapture=" + this.rightCapture + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.stepName);
        dest.writeParcelable(this.centerCapture, flags);
        dest.writeParcelable(this.leftCapture, flags);
        dest.writeParcelable(this.rightCapture, flags);
    }
}
